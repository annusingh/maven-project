package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param  someone String
   * @return string
     */
  public final String greet(final String someone) {
    System.out.println("Test");
    return String.format("Hello, %s!", someone);
  }
}
