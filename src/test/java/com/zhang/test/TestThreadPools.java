package com.zhang.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.common.utils.Global;

public class TestThreadPools {

	
	//可缓存线程池:如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
	//线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程
	public static void testCachedThreadPoll()
	{
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		int a= 1;
		for (int i = 0; i < 10; i++) {
			final int index = 1;
			
			try {
				Thread.sleep(index*2000);
			} catch (InterruptedException e) {
				//Auto-generated catch block
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable() {
				
				public void run() {
					
					System.out.println(index);
				}
			});
			System.out.println(++a+ "      ##########      " +Thread.currentThread().getName());
		}
		
		
	}
	
	//定长线程池:可控制线程最大并发数，超出的线程会在队列中等待
	//
	public static void testFixedThreadPool()
	{
		
		ExecutorService cachedThreadPool = Executors.newFixedThreadPool(4);
		
		
	}
	
	
	
	public static void main(String[] args) {
//		testCachedThreadPoll();
		System.out.println(Global.getConfig("jdbc.driver"));
	}
	
}
