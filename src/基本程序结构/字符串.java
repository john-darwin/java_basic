package 基本程序结构;

public class 字符串 {
	public static void StringBuild() {
		StringBuilder sb = new StringBuilder();
		sb.append("StringBuilder build").append(" a ").append("long string");
		System.out.println(sb); // 输出："Hello World"
	}

	public static void StringBuffer(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("this is").append(" such a  buffer");
		System.out.println(buffer);
	}
	
	public static void main(String[] args) {
		StringBuffer();

		StringBuild();//使用StringBuilder构建字符串
	}

}
