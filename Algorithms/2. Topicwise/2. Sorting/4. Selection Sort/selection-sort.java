/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		Ideone ideone = new Ideone();
		ideone.selectionSort(a);
		for(int i = 0 ;i < a.length; i++)
		System.out.print(a[i] + " ");
	}
	
	public void selectionSort(int a[]){
		int min, temp;
		for(int i = 0; i< a.length - 1; i++){
			min = i;	
			for(int j = i+1; j<a.length; j++){
				if(a[j] < a[min]){
					min = j;
				}	
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}