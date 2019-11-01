import java.util.Scanner;


public class Greedy {

	public static void main(String[] args) {
		int n=7,ch=0;       
	//	int w[]={2,3,5,7,1,4,1};   //new int[n];
	//int p[]= { 10,5,15,7,6,18,3};   //new int[n];
		
		int w[]=new int[n];      //{2,3,5,4,3,6,8};//
		int p[]=new int[n];     // { 9,15,12,4,6,16,3};//

		Scanner sc=new Scanner(System.in);
		System.out.print("how many objects");
		
		n=sc.nextInt();
		
		System.out.print("enter profit value & weight");
	        for(int i=0;i<n;i++)
	     		{  p[i]=sc.nextInt();
	     	       w[i]=sc.nextInt(); }
	     	
	        knapsackalgo object=new knapsackalgo();
	       
	      while(ch!=4)
	      {   System.out.println(" Enter your choice");
	 		System.out.print("1:max profit 2: min-weight 3:Profit/Weight ratio 4:exit");
	 		     ch=sc.nextInt();
	         switch(ch)
	         {
	         case 1: object.algo(1,p,w,n); break;
	         case 2: object.algo(2,p,w,n); break;
	         case 3: object.algo(3,p,w,n); break;
	         case 4:System.out.print("end program");
	       }
	      }
	}

}
