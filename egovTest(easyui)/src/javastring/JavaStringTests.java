package javastring;

public class JavaStringTests {

	public static void main(String[] args) {
		String a = "Han";
		String b = "Han";
		String c = new String("Han");
		System.out.println(a.hashCode() == b.hashCode());// 주소 값 비교하는 메서드
		System.out.println(a == c);// 내용을 비교하는 메서드
	}
}