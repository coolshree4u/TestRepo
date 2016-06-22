package com.src;

import java.io.*;

public class ArrayDemo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(br.readLine());
		
		
		String[] HightArr=new String[size];
		
		for(int i=0;i<size;i++)
		{
			HightArr[i]=br.readLine();
		}
		int flag;
		for(int i=0;i<size;i++)
		{
			if(HightArr[i].length()==4 && (HightArr[i].charAt(3)-48)>1)
				flag=-1;
			else if(((HightArr[i].charAt(0)-48)<4)||((HightArr[i].charAt(0)-48)>7))
				flag=-1;
			else
				flag=1;
		}
		float Arr[]=new float[size];
		for(int i=0;i<size;i++)
		{
			if(HightArr[i].length()==4 && HightArr[i].charAt(3)=='0')
				Arr[i]=((int)HightArr[i].charAt(0)-48)*12+((int)HightArr[i].charAt(2)-48)+9;
			else if(HightArr[i].length()==4 && HightArr[i].charAt(3)=='1')
				Arr[i]=((int)HightArr[i].charAt(0)-48)*12+((int)HightArr[i].charAt(2)-48)+10;
			else if(HightArr[i].length()==4)
				Arr[i]=((int)HightArr[i].charAt(0)-48)*12+((int)HightArr[i].charAt(2)-48)+((int)HightArr[i].charAt(3)-48);
			else
				Arr[i]=((int)HightArr[i].charAt(0)-48)*12+((int)HightArr[i].charAt(2)-48);
		}
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if((Arr[i]>Arr[j]))
					count++;
			}
		}
		
		
		System.out.println(count);
	}

}
