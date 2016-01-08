package ch15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest
{
	public static void main(String[] args)
	{
		try(
			//创建输出流FileOutputStream
			FileOutputStream fos = new FileOutputStream("test.txt");
			//使用PrintStream包装该节点输出流
			PrintStream ps = new PrintStream(fos))
		{
			// 使用PrintStream执行输出
			ps.println("普通字符串");
			// 直接使用PrintStream输出对象
			ps.println(new PrintStreamTest());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}