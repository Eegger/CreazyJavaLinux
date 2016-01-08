package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 由于BufferReader具有一个readLine方法，可以非常方便的一次读入一行内容，所以经常把读取到的
 * 文本内容的输入流包装成BufferReader，用来方便的读取输入流的内容。
 */
public class KeyinTest
{
	public static void main(String[] args) 
	{
		try(
			// 将Sytem.in对象转换成Reader对象
			InputStreamReader reader = new InputStreamReader(System.in);
			//将普通Reader包装成BufferedReader
			BufferedReader br = new BufferedReader(reader))
		{
			String buffer = null;
			//采用循环方式来一行一行的读取
			while ((buffer = br.readLine()) != null)
			{
				//如果读取的字符串为"exit"，程序退出
				if (buffer.equals("exit"))
				{
					System.exit(1);
				}
				//打印读取的内容
				System.out.println("输入内容为:" + buffer);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
