import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0; i < size; i++){
			a[i] = sc.nextInt();
		}
		Ideone ideone = new Ideone();		
		int maxSum = ideone.maxSubarray(a,0,size -1);
		System.out.println("Answer: " + maxSum);
	}
	
	
	public int maxSubarray(int a[], int low, int high){
		int maxSum = Integer.MIN_VALUE;
		int sum;
		for(int i = low; i <= high;i++){
			sum = 0;
			for(int j = i; j <= high; j++)
				sum = sum + a[j];
			if(sum > maxSum)
				maxSum = sum;
		}
		return maxSum;
	}

}