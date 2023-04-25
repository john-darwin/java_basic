package 基本程序结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 输入输出 {
	
	public static void ReadInputbyScanner() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        System.out.println("Your name is " + name + " and you are " + age + " years old.");

	        scanner.close();
	}
	
	public static void ReadInputbyBufferedReader() throws IOException{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        System.out.print("Enter your name: ");
	        String name = reader.readLine();

	        System.out.print("Enter your age: ");
	        int age = Integer.parseInt(reader.readLine());//由于readLine()方法返回的是一个字符串，
	        //因此需要将读取到的字符串转换为整数，这里使用了Integer.parseInt()方法进行转换。

	        System.out.println("Your name is " + name + " and you are " + age + " years old.");

	        reader.close();
	}
	
	public static void main(String[] args) throws IOException {
		ReadInputbyScanner();
		ReadInputbyBufferedReader();
	}

}
