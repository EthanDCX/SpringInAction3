package com.vonzhou.springinaction.spirngidol;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Strum strum strum");
  }
}