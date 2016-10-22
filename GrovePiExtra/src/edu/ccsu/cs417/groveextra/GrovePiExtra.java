/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.groveextra;

import com.dexterind.grovepi.sensors.Buzzer;
import com.dexterind.grovepi.sensors.Led;
import com.dexterind.grovepi.sensors.Thing;
import com.dexterind.grovepi.sensors.base.AnalogSensor;
import com.pi4j.io.gpio.BananaPiGpioProvider;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.impl.GpioControllerImpl;
import com.pi4j.io.gpio.impl.GpioPinImpl;
import com.pi4j.io.gpio.impl.PinImpl;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;
import java.util.EnumSet;

/**
 *
 * @author Paulo
 */
public class GrovePiExtra {

    private final int boardNumber;

    public GrovePiExtra(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public void runDemo() throws IOException, InterruptedException, I2CFactory.UnsupportedBusNumberException {
        
        Buzzer buzz = new Buzzer(boardNumber);
        Led led = new Led(3);
        Led led2 = new Led(5);
        AnalogSensor sensor = new AnalogSensor(3, 4);
        
        PinMode.allOutput();
        System.out.println("PinMode.allOutput();");
        
        EnumSet<PinMode> pins = PinMode.allOutput();
        System.out.println("EnumSet<PinMode> pins = PinMode.allOutput();");
        
        PinImpl pinImpl = new PinImpl("Paulo_Provider", 0, "Paulo_name", pins);
        System.out.println("PinImpl pinImpl = new PinImpl(\"Paulo_Provider\", 0, \"Paulo_name\", pins);");
        
        
        GpioControllerImpl gpioController = new GpioControllerImpl();
        System.out.println("GpioControllerImpl gpioController = new GpioControllerImpl();");
        
        BananaPiGpioProvider provider = new BananaPiGpioProvider();
        System.out.println("BananaPiGpioProvider provider = new BananaPiGpioProvider();");
        
        
        GpioPinImpl gpiopwm = new GpioPinImpl(gpioController, provider, pinImpl);
        System.out.println("GpioPinImpl gpiopwm = new GpioPinImpl(gpioController, provider, pinImpl);");
        
        
        Thing thing = new Thing(gpiopwm);
        System.out.println("Thing thing = new Thing(gpiopwm);");
        
        
        thing.buzz(500, 200);

//        buzz.setVolume(10);
//        Thread.sleep(1000);
//        buzz.setVolume(100);
//        buzz.turnOff();
        


//        buzz.setFrequency(1);
//        buzz.turnOn();
//        Thread.sleep(1000);
//        
//        buzz.setFrequency(50);

//        led.turnOn();
//        Thread.sleep(1000);

//Gpio.analogWrite(3, 50);
//Thread.sleep(1000);

            //System.out.println("wiringPiSetUp():  "+wiringPiSetup());
            //System.out.println("wiringPiSetUp():  "+wiringPiSetupGpio());
            //System.out.println("wiringPiSetUp():  "+wiringPiSetupPhys());
            //////System.out.println("wiringPiSetUp():  "+Gpio.wiringPiSetupSys());
            //Thread.sleep(100);
            //buzz.turnOn();
            //Thread.sleep(1000);
            //buzz.turnOff();
            
            //System.out.println("softPwmCreate():  "+softPwmCreate(3, 40, 100));
            //Thread.sleep(100);
            
            
//            for(int i = 0; i<200; i+=2){            
//                System.out.println(i);
//                for(int j = 0; j<5; j++){
//                    sensor.write(255);
//                    Thread.sleep(i);
//                    sensor.write(0);
//                }
//            }
            
//            sensor.write(10);
//            System.out.println("10");
//            Thread.sleep(1000);
//
//            sensor.write(20);
//            System.out.println("20");
//            Thread.sleep(1000);
//
//            sensor.write(50);
//            System.out.println("50");
//            Thread.sleep(1000);
//
//            sensor.write(70);
//            System.out.println("70");
//            Thread.sleep(1000);
//
//
//            sensor.write(100);
//            System.out.println("100");
//            Thread.sleep(1000);
//
//            sensor.write(150);
//            System.out.println("150");
//            Thread.sleep(1000);
//
//            sensor.write(255);
//            System.out.println("255");
//            Thread.sleep(1000);
//
//            sensor.write(400);
//            System.out.println("400");
//            Thread.sleep(1000);
//            System.out.println("400");
//            sensor.write(0);
            
            
            
//            //buzz.turnOn();
//            //Thread.sleep(1000);
//            softPwmWrite(3, 50);
//            System.out.println("softPwmWrite()");
//            Thread.sleep(100);
//            //buzz.turnOff();
//            //Thread.sleep(1000);
            
//            buzz.turnOn();
//            Thread.sleep(500);
//            Gpio.pwmSetRange (500);
//            System.out.println(millis ());
//            Gpio.pwmSetClock(40);
//            Thread.sleep(1500);
//             System.out.println("pwmwmWrite(3, 50)");
//            Gpio.pwmWrite(3, 50);
//            Thread.sleep(2000);
//            System.out.println("pwmwmWrite(3, 255)");
//            Gpio.pwmWrite(3, 255);
//            Thread.sleep(2000);
//            
//            Thread.sleep(1000);
//            
//            System.out.println("Analog write");
//            Gpio.analogWrite(3, 1);
//            Thread.sleep(1000);
//            //Gpio.gpioClockSet(3, 255);
//            //Gpio.analogWrite(3, 50);
//            //Thread.sleep(1000);
//            Gpio.pwmSetClock(100);
//            Gpio.analogWrite(3, 1024);
//            Thread.sleep(1000);
//buzz.turnOff();
//        for(int i = 0; i<255; i+=2){
//            analogWrite(14,5,4,4);
//            Thread.sleep(100);
//
//        }
//        led.turnOn();
//        Thread.sleep(1000);
//          
//          analogWrite(3,1);
//          Thread.sleep(1000);
//          
//          digitalWrite(5,1);
//          Thread.sleep(1000);
//          
//          analogWrite(5,1);
//          Thread.sleep(1000);
//          
//          digitalWrite(6,1);
//          Thread.sleep(1000);
//          
//          analogWrite(6,1);
//          Thread.sleep(1000);

          //buzz.turnOn();
        //Thread.sleep(1000);
    //led.turnOff();
          
//        buzz.setFrequency(100);
//        buzz.turnOn();
//        Thread.sleep(1000);
        
//        for (float brightness = 0; brightness <= 100; brightness += 2) {
//            led.setBrightness(brightness);
//            Thread.sleep(100);
//        }
        
//        for (int i = 0; i <= 20; i++) {
//            digitalWrite(i,1);
//            Thread.sleep(100);
//
//            analogWrite(i,1);
//            Thread.sleep(100);
//        }
        buzz.turnOff();
        led.turnOff();
        led2.turnOff();
    }

    public static void main(String[] args) {
        try {BananaPiGpioProvider provider = new BananaPiGpioProvider();
            // Default is D3
            //Grovepi grovePi = new Grovepi();
            int boardNumber = 3;
            if (args.length == 1) {
                boardNumber = Integer.parseInt(args[0]);
            }
            GrovePiExtra ledDemo = new GrovePiExtra(boardNumber);
            ledDemo.runDemo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
