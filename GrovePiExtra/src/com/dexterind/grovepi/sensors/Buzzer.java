/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dexterind.grovepi.sensors;


import java.io.IOException;

import com.dexterind.grovepi.Grovepi;
import com.dexterind.grovepi.sensors.base.*;
import com.pi4j.io.i2c.I2CFactory;

import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;


/**
 *
 * @author Paulo
 */
public class Buzzer extends AnalogSensor{
    private int pin;
    private SensorStatus status = SensorStatus.OFF;
    public final static int MAX_VOLUME = 255;
    
    public Buzzer(int pin) throws IOException, InterruptedException, I2CFactory.UnsupportedBusNumberException{
        super(pin, MAX_VOLUME + 1);
        this.pin = pin;
        //Gpio.wiringPiSetup();
        SoftPwm.softPwmCreate(pin, 0, 100);
    }
    
    public void setFrequency(int frequency){
        SoftPwm.softPwmWrite(pin, frequency);
    }
    
    public void turnOn() throws IOException{
        this.write(MAX_VOLUME);
    }
    
    public void turnOff() throws IOException{
        this.write(0);
    }
    
    public void setVolume(float percent) throws IOException{
        if (percent <= 0){
          turnOff();
        }else if(percent >= 100){
          turnOn();
        }else{
          this.write((int)(MAX_VOLUME * percent/100));
        }
    }
    
    @Override
    public boolean write(int value) throws IOException {
        if (value <= 0){
          status = SensorStatus.OFF;
          super.write(0);
        }else{
          status = SensorStatus.ON;
          super.write(Math.min(value, MAX_VOLUME));
        }
        return true;
    }
    
    public SensorStatus toggle() throws IOException{
        setStatus(SensorStatus.toggle(status));
        return status;
    }
    
  public SensorStatus getStatus(){
    return status;
  }
  
  public void setStatus(SensorStatus status) throws IOException{
    if (status == SensorStatus.OFF){
      turnOff();
    }else{
      turnOn();
    }
  }
}
