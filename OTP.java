import java.io.*;
import java.util.*;
public class otp
{
	public static void main(String arg[])throws Exception
	{
	System.out.println("enter 1 for 3 digit otp\nenter 2 for 5 digit otp\nenter 3 for 6 digit otp");
	char c=(char)System.in.read();
	Random r=new Random();
	switch(c)
	{
	case '1':System.out.println(r.nextInt(999));
	break;
	case '2':System.out.println(r.nextInt(99999));
	break;
	case '3':System.out.println(r.nextInt(999999));
	}
	}
}
