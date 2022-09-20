package com.tlglearning.animals;

public class Wolf {
  private static final int MY_CONSTANT = initializeValue(); //declaration w/ initialization
  private int data = initializeData();

  //initialization blocks
  static {
    System.out.println("Wolf static initialization block");
  }
  static {
    System.out.println("Wolf instance initialization block");
  }

  //constructor
  public Wolf() {
  //super();  if not explicitly written, the no param constructor is added to byte code (syntactic sugar)
    System.out.println("Wolf constructor");
  }

  private static int initializeValue(){
    System.out.println("Wolf.initializeValue");
    return -1;
  }

  private int initializeData() {
    System.out.println("Wolf.initializeData");
    return 1;
  }

  public void vocalize(){
    System.out.println("Howl like a wolf!");
  }

  public void hunt(){
    System.out.println("Hunt in pack for live prey");
  }

  public static void whoAmI(){
    System.out.println("I am a wolf");
  }

}
