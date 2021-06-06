/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class DrivingAge {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    DrivingAge legal = new DrivingAge();
    int age = legal.getAge();
    System.out.println(legal.checkAge(age));
  }

  public int getAge() {
    System.out.print("How old are you? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Amount! Try Again.");
      return getAge();
    }
    return Integer.parseInt(n);
  }

  public String checkAge(int age) {
    return age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
  }
}
