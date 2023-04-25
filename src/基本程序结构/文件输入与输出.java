package 基本程序结构;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 文件输入与输出 {
	
	public static void scanner() throws FileNotFoundException {
		/***
		 * 使用Scanner读取文本文件，以空格作为next的读取截止
		 */
		 try {
	            Scanner scanner = new Scanner(new File("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt"));
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	}
	
	public static void fileinputstream() throws IOException {
		/***
		 * 使用FileInputStream读取文件
		 */
		FileInputStream fis = new FileInputStream("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt");
		int ch;
		while ((ch = fis.read()) != -1) {
		    System.out.print((char) ch);
		}
		fis.close();
	}
	
	public static void fileoutputstream() throws IOException {
		/***
		 * 使用FileOutputStream写入文件,覆盖式写入
		 */
		FileOutputStream fos = new FileOutputStream("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt");
		String text = "使用FileOutputStream写入文件,覆盖式写入";
		fos.write(text.getBytes());//字符串转换为字节数组
		fos.close();
	}
	
	
	public static void filereader() throws IOException {
		/***
		 * 使用FileReader读取文本文件
		 */
		FileReader fr = new FileReader("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt");
		int ch;
		while ((ch = fr.read()) != -1) {
		    System.out.print((char) ch);
		}
		fr.close();
	}
	
	public static void filewriter() {
		/***
		 * filewriter进行覆盖式写入
		 */
		String fileName = "filetest.txt";
        String content = "filewriter进行覆盖式写入";
		 try {
	            FileWriter fileWriter = new FileWriter(fileName,true);
	            fileWriter.write(content);
	            fileWriter.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	        System.out.println("An error occurred while writing to the file: " + e.getMessage());
	        }
		
	}
	
	public static void bufferedreader() throws IOException {
		/***
		 * 使用BufferedReader读取字符输入流的内容
		 ***/
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt"));
		String line;
		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		}
		br.close();
	}
	
	/**
	 * 使用BufferedWriter写字符流到字符输出流
	 */
	public static void bufferedwriter() {
		String content = "使用BufferedWriter写入字符流";
		try {
		    BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\java_basic\\src\\基本程序结构\\filetest.txt"));
		    writer.write(content);
		    writer.close();
		} catch (IOException e) {
		    e.printStackTrace();//printStackTrace() 是 Java Throwable 类的一个方法，用于将异常堆栈信息输出到标准错误流。
		}
	}
	
	public static void main(String[] args) throws IOException {
		scanner();
//		filereader();
//		bufferedreader();
//		fileoutputstream();
		filewriter();

	}
}
