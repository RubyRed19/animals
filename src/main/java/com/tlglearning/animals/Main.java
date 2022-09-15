package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //List of Wolf, list is the reference type, it's an interface
    List<Wolf> wolves = new ArrayList<>();
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);
    for(Wolf w : wolves){
      System.out.println();
      System.out.println(w.getClass().getName());
      w.hunt();
      w.vocalize();
      if (w instanceof Dog) {
        Dog d = (Dog) w;
        d.rollOver();
        // OR ((Dog) w).rollOver();
      }
    }
  }

}
