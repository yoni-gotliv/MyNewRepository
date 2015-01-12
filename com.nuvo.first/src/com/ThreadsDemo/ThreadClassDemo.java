package com.ThreadsDemo;

public class ThreadClassDemo
{
   public static void main(String [] args)
   {
	   
	   String str1 = "Test";
	   String str2 = str1;
	   System.out.println("str1 = " + str1);
	   System.out.println("str2 = " + str2);
	   str1 = str1 + "abc";
	   System.out.println("str1 = " + str1);
	   System.out.println("str2 = " + str2);
	   
//      Runnable hello = new DisplayMessage("Hello");
//      Thread thread1 = new Thread(hello);
//      thread1.setDaemon(true);
//      thread1.setName("hello");
//      System.out.println("Starting hello thread...");
//      thread1.start();
//      
////      Runnable bye = new DisplayMessage("Goodbye");
////      Thread thread2 = new Thread(bye);
////      thread2.setPriority(Thread.MIN_PRIORITY);
////      thread2.setDaemon(true);
////      System.out.println("Starting goodbye thread...");
////      thread2.start();
//      
//      Runnable number = new DisplayNumber(100);
//      number.run();
//      Thread numberThread = new Thread(number);
//      System.out.println("Starting number thread...");
//      numberThread.start();
//
//      System.out.println("Starting thread3...");
//      Thread thread3 = new GuessNumber(27);
//      thread3.start();
//      try
//      {
//         thread3.join();
//      }catch(InterruptedException e)
//      {
//         System.out.println("Thread interrupted.");
//      }
//      System.out.println("Starting thread4...");
//      Thread thread4 = new GuessNumber(75);
//      
//	  thread4.start();
//      System.out.println("main() is ending...");
   }
}
