/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.groveextra;

import com.dexterind.grovepi.Grovepi;
import com.dexterind.grovepi.sensors.Buzzer;
import com.pi4j.io.i2c.I2CFactory;
import static com.pi4j.wiringpi.Gpio.PWM_OUTPUT;
import static com.pi4j.wiringpi.Gpio.analogWrite;
import static com.pi4j.wiringpi.Gpio.pinMode;
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
        buzz.turnOn();
        Thread.sleep(1000);
        buzz.turnOff();
        
        buzz.setFrequency(50);
        
//        analogWrite(3, 50);
//        Thread.sleep(1000);
        
//        buzz.setFrequency(1);
//        buzz.turnOn();
//        Thread.sleep(1000);
//        
//        buzz.setFrequency(50);
//        buzz.turnOn();
//        Thread.sleep(1000);
//        
//        buzz.setFrequency(100);
//        buzz.turnOn();
//        Thread.sleep(1000);
        
        //for (float brightness = 0; brightness <= 100; brightness += 10) {
        //    buzz.setVolume(brightness);
        //    Thread.sleep(200);
        //}
        buzz.turnOff();
        
    }

    public static void main(String[] args) {
        try {
            // Default is D3
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
