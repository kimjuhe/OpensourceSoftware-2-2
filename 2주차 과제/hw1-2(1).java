<<<<<<< HEAD
package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double r1, r2, d;
		
		System.out.println("첫번째 원의 중심과 반지름 입력");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("두째 원의 중심과 반지름 입력");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("두 원은 서로 겹친다.");
	      }
	      else {
	         System.out.print("두 원은 서로 겹치지 않는다.");
	      }
		 scanner.close();
	}
}
=======
package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double r1, r2, d;
		
		System.out.println("泥ル쾲吏� �썝�쓽 以묒떖怨� 諛섏��由� �엯�젰");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("�몢吏� �썝�쓽 以묒떖怨� 諛섏��由� �엯�젰");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("�몢 �썝��� �꽌濡� 寃뱀튇�떎.");
	      }
	      else {
	         System.out.print("�몢 �썝��� �꽌濡� 寃뱀튂吏� �븡�뒗�떎.");
	      }
		 scanner.close();
	}
}

>>>>>>> 5a17130dbb6dcda222220ad1735d8bb17edf0f6c
