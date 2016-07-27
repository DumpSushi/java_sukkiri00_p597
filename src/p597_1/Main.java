package p597_1;

import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		// 練習15-2.
//		try
//		{
//			String s = null;
//			System.out.println(s.length());
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		// 15-3
//		try
//		{
//			String s = "三";
//			int number = Integer.parseInt(s);
//			System.out.println(number);
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		// 15-4
		throw new IOException("IOException");
	}

}
