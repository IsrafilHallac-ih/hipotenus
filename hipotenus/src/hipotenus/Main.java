package hipotenus;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int   edge1,edge2 ,edge3;
		int u;
		int area;
		System.out.println("1.Enter The Edge  :");
		edge1=scan.nextInt();
		System.out.println("2.Enter The Edge :");
		edge2=scan.nextInt();
		System.out.println("3.Enter The Edge :");
		edge3=scan.nextInt();
		
		u=(edge1+edge2+edge3)/2;
		area=(int)Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
		System.out.println("Area Of Triangle = "+area);
		
         }

}
