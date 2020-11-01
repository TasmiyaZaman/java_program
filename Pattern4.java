//            *
//            *
//        * * * * *
//            *
//            * (it should print only like plus symbol elements program )
              
package com.xworkz.java_programs.programmingaptiude;

public class Pattern4 {
public static void main(String args[]) {
		
	for(int i=0;i<=9; i++) {
		for(int j=0; j<=9; j++) {
			if(i==4||j==4)
			{
				System.out.print(" * ");
		}
		else
		{
			System.out.print("   ");
		}
		}
	System.out.println();
}
}
}
