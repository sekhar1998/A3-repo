package org.cap.model;

public class Sales {
	
	int[] arr = {23,45,67,-90,2};
	
	public void print() {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
			System.out.println("Summation:" + sum);
			
	}
	public void display()
	{
		System.out.println("Display sales details here!");
	}

}
