package lab03;
import java.util.*;
public class BasicIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Ente year: ");
		int year = stdin.nextInt();
		
		System.out.print("Ente month: ");
		int month = stdin.nextInt();
		
		System.out.print("Ente date: ");
		int date = stdin.nextInt();
		
		System.out.print("Enter your name: ");
		String name = stdin.next();
		
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		
		System.out.println(years*365);
		
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		System.out.printf("%d년 %d월 %d일 현재 %s(%d)의 키는 %d cm입니다",year,month,date,name,years,height);
	}

}
