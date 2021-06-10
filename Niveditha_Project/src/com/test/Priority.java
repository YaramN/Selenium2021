package com.test;

import java.util.PriorityQueue;

public class Priority
{
	
	public static void main(String[]args)
	{
		PriorityQueue<String> queue= new PriorityQueue<String>();
		queue.add("baby");
		queue.add("baby2");
		queue.add("baby3");
		System.out.println("head:"+queue.peek());
		System.out.println("head :"+ queue.element());
		//queue.poll();
		queue.remove();
		System.out.println(queue);
	}

}
