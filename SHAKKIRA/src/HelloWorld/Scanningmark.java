package HelloWorld;
import java.util.Scanner;
public class Scanningmark {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		System.out.println(marks);
		if(marks>80) {
		   System.out.println("A+");
		}
		else if(marks>70& marks<=80) {
			System.out.println("A");
		}
		else if(marks>60& marks<=70) {
			System.out.println("B+");
			}
		else if(marks<=60&marks>=50) {
			System.out.println("B");
				}
		else if(marks<50&marks>=40) {
			System.out.println("c");
		}
		else {
			System.out.println("D");
		}
		
}
}