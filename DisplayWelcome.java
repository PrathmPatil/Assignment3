package com.linecomparison;

public class DisplayWelcome {

	public static void main(String[] args) {

		String line1="Welcome";
		String line2="welcome";
		String line3="Welcome";
		
		String [] array=new String[] {line1, line2, line3};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].equals(array[j]))
				{
					System.out.println(array[i]+" and "+array[j]+" are same");
				}
				
			}
		}
		
	}

}
