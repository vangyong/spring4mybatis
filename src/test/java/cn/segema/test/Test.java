package cn.segema.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	   public static void main(String[] args) throws InterruptedException
	    {
	        ExecutorService exe = Executors.newFixedThreadPool(5);
	        for (int i = 1; i <= 50; i++)
	        {
	            exe.execute(new SubThread(i));
	        }
	        System.out.println("shutdown");
	        exe.shutdown();
	        while (true)
	        {
	            if (exe.isTerminated())
	            {
	                System.out.println("结束了！");
	                break;
	            }
	            Thread.sleep(200);
	        }
	    }

}
