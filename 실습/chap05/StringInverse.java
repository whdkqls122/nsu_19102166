package chapter_05;

import java.util.Scanner;

public class StringInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문자열을 입력 받는다...
				Scanner scan = new Scanner(System.in);
				String str;
				String strResult;
				String strTemp;
				int  nLen;
				System.out.print("문자열을 입력하시오: ");
				str = scan.next();
				
				nLen = str.length();
				strResult="";
				for (int i=nLen-1; i >= 0; i--)
				{
					strTemp="";
					strTemp = String.format("%c", str.charAt(i));
					strResult = strResult.concat(strTemp);
				}
				System.out.println(strResult);
							
	}

}
