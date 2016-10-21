/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.groveextra;

import com.dexterind.grovepi.sensors.Buzzer;
import com.dexterind.grovepi.sensors.Led;
import com.pi4j.io.i2c.I2CFactory;
import static com.pi4j.wiringpi.Gpio.analogWrite;
import static com.pi4j.wiringpi.Gpio.digitalWrite;
import java.io.IOException;

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
        Led led = new Led(5);
        Led led2 = new Led(6);

//        buzz.setVolume(10);
//        Thread.sleep(1000);
//        buzz.setVolume(100);
//        buzz.turnOff();
        
//        buzz.setFrequency(1);
//        buzz.turnOn();
//        Thread.sleep(1000);
//        
//        buzz.setFrequency(50);
        buzz.turnOn();
          digitalWrite(3,1);
          Thread.sleep(1000);
          
          analogWrite(3,1);
          Thread.sleep(1000);
          
          digitalWrite(5,1);
          Thread.sleep(1000);
          
          analogWrite(5,1);
          Thread.sleep(1000);
          
          digitalWrite(6,1);
          Thread.sleep(1000);
          
          analogWrite(6,1);
          Thread.sleep(1000);
          

          
    
          
//        buzz.setFrequency(100);
//        buzz.turnOn();
//        Thread.sleep(1000);
        
//        for (float brightness = 0; brightness <= 100; brightness += 2) {
//            led.setBrightness(brightness);
//            Thread.sleep(100);
//        }
        
//        for (float brightness = 0; brightness <= 100; brightness += 1) {
//            buzz.setVolume(brightness);
//            Thread.sleep(100);
//        }
        buzz.turnOff();
        led.turnOff();
        led2.turnOff();
    }

    public static void main(String[] args) {
        try {
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
