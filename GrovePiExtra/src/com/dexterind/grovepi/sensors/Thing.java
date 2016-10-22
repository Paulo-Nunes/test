/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dexterind.grovepi.sensors;

/**
 *
 * @author Paulo
 */
import com.pi4j.component.buzzer.Buzzer;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.wiringpi.Gpio;

public class Thing
  implements Buzzer
{
  public static int STOP_FREQUENCY = 0;
  protected final GpioPinPwmOutput pwm;
  
  public Thing(GpioPinPwmOutput pwm)
  {
    this.pwm = pwm;
    Gpio.pwmSetMode(0);
  }
  
  public void buzz(int frequency)
  {
    if (frequency == 0)
    {
      this.pwm.setPwm(frequency);
    }
    else
    {
      int range = 600000 / frequency;
      Gpio.pwmSetRange(range);
      this.pwm.setPwm(frequency / 2);
    }
  }
  
  public void buzz(int frequency, int duration)
  {
    buzz(frequency);
    Gpio.delay(duration);
    stop();
  }
  
  public void stop()
  {
    buzz(STOP_FREQUENCY);
  }
}
