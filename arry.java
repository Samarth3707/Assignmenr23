package arry;
import java.util.Scanner;

public class arry {
	public static void main(String[] args)
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of arry");
		x=sc.nextInt();
		System.out.print("Enter elements of an arry");
		int A[]=new int[x];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("First element is"+A[0]);
		System.out.println();
		//2nd problem
		System.out.println("Last element is");
	
		
			System.out.print(A[A.length-1]);
			//3rd problem
			System.out.print("Enter binary no");  
			x=sc.nextInt();
			int d=0;
			int n1=1;
			while(true)
			{
				if(x==0)
				{
					break;
				}
				else
				{
					int temp=x%10;
					d+=temp*Math.pow(2, n1);
					x=x/10;
					n1++;
					
				}
			}
		System.out.print("decimal no"+d);
		System.out.println();
		//4th problem

			
		
			
		
	
	
			

			
	
	}

}
