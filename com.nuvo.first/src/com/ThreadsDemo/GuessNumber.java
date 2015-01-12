package com.ThreadsDemo;

public class GuessNumber extends Thread
{
   private int number;
   public GuessNumber(int number)
   {
      this.number = number;
   }
   
   public void run()
   {
      int counter = 0;
      int guess = 0;
      do
      {
          guess = (int) (Math.random() * 100 + 1);
          System.out.println(this.getName()
                       + " guesses " + guess);
          counter++;
      }while(guess != number);
      System.out.println("** Correct! " + this.getName()
                       + " in " + counter + " guesses.**");
   }

//@Override
//public synchronized void start() {
//	// TODO Auto-generated method stub
////	super.start();
//	System.out.println("Inside strat method of thread: " + this.getName());
//}
   
   
   
}
