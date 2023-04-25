package 基本程序结构;

public class 数组 {
	
	public static void circle() {
		/***
		 * 循环遍历数组的方法
		 */
		int[] scores = {78, 89, 67, 90, 86};
		for (int i = 0; i < scores.length; i++) {
		    System.out.println("for循环遍历"+scores[i]);
		}

		int i = 0;
		while (i < scores.length) {
		    System.out.println("while循环遍历"+scores[i]);
		    i++;
		}

		for (int score : scores) {
		    System.out.println("foreach遍历"+score);
		}


	}

	public static void main(String[] args) {
		circle();

	}

}
