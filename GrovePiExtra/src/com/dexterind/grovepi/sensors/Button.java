/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dexterind.grovepi.sensors;

import java.io.IOException;

import com.dexterind.grovepi.sensors.base.*;
import com.pi4j.io.i2c.I2CFactory;
import java.awt.event.ActionListener;

/**
 *
 * @author Paulo Nunes
 */
public class Button extends DigitalSensor{
    private SensorStatus status = SensorStatus.OFF;
    //private ActionEvent e;
    
    public Button(int pin) throws IOException, InterruptedException, I2CFactory.UnsupportedBusNumberException{
        super(pin);
    }
    
    public int digitalRead(int pin){
        return 0;
    }
    
    
    //@override
    //public void actionPerformed(){}
    
    
    
    
}
