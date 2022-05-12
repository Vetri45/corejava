package com.chainsys.Threads;

import javax.swing.SwingWorker;

public class CurrentThreadDemo {
		public static void main(String args[])
		{
			 try
			 {
			   Thread t1=Thread.currentThread();
			   System.out.println("MainThread ID: " +t1.getId() );
			   Worker w=new SwingWorker();
			   w.callme();
			   System.out.println("In Main After callme");		   
			 }catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
	   	
	}
}
