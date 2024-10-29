
public class Scanningmarkspercentage {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		System.out.println(marks);
		Double percentage=marks/500*100;
		if(percentage>80) {
		   System.out.println("A+");
		}
		else if(percentage>70& marks<=80) {
			System.out.println("A");
		}
		else if(percentage>60& marks<=70) {
			System.out.println("B+");
			}
		else if(percentage<=60&marks>=50) {
			System.out.println("B");
				}
		else if(percentage<50&marks>=40) {
			System.out.println("c");
		}
		else {
			System.out.println("D");
		}
		
}
}
}
