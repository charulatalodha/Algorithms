import java.util.Scanner;


public class knapsackalgo {

	
	 void algo(int ch,int p[],int w[],int n)
	{   int i;
		double x[]= new double[n];
		double r[]=new double[n];
		int capacity;double profit=0,weight=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capacity");
		   capacity=sc.nextInt();
		   
		   for(i=0;i<n;i++)
			   { x[i]=0; r[i]=p[i]/w[i];}
		   
		    weight=0;
		   while(weight<capacity)
			  {  sort obj=new sort(); //get the best obj & let index=i
			   
			 if(ch==1) i=obj.getmaxindex(p,x);
			 else if(ch==2) i=obj.getminindex(w,x);
			 else if(ch==3)i=obj.getratio(r,x);
			 
				   if(weight+w[i]<=capacity)
				   { 
					   x[i]=1;
					   weight=weight+w[i];
				   }
				   else
				   {
					x[i]=(capacity-weight)/w[i];
					weight=capacity;
				   }
				  // System.out.println("weight="+weight+" i="+i);
			  } //while ends
		   for(i=0;i<n;i++)
		    profit+=p[i]*x[i];
		   System.out.println("profit="+profit);
		   System.out.println("==================");
		      
	}
	
	
	
}
