import java.util.Scanner;

public class lcs {

	public static void main(String[] args) {
	       Scanner sc =new Scanner(System.in);
	      System.out.print("enter s1 string");
	       
	       String s1=sc.next();
	       char a[]=s1.toCharArray();
	       char t[]=new char[5];
	      //  String s2=sc.next(); //take this array if  string2 is given
	      // char b[]=s2.toCharArray();
	       char grid[][]={{'p','a','b','c','x'},
	    		          {'a','b','c','d','e'},
	    		          {'x','c','z','p','q'},
	    		          {'v','d','g','o','p'},
	    		          {'q','z','r','t','b'}};
	      
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<5;j++)
	                  System.out.print("\t"+grid[i][j]);
	             
	              System.out.println();
	          }
	       
	       
	   for(int i=0;i<5;i++)
	  {
	          for(int j=0;j<5;j++)
	              t[j]=grid[i][j];
	          
	         
	      String fin=lcs(t,a);
	      if(fin.trim().equals(s1))
	          System.out.println("string found in row:"+(i+1));
	  }
	   
	    for(int i=0;i<5;i++)
	    {
	          for(int j=0;j<5;j++)
	              t[j]=grid[j][i];
	          
	          String fin=lcs(t,a);
	             if(fin.trim().equals(s1))
	                System.out.println("string found in column:"+(i+1));
	    }
	     
	    }

	
	
	
 static String lcs(char[] a,char[] b)
 {
      int lcs[][]=new int[a.length+1][b.length+1];
      int result=0,index=0;
      for(int i=0;i<a.length;i++){
          for(int j=0;j<b.length;j++){
              if(i==0 ||j==0)
                  lcs[i][j]=0;
              else if(a[i]==b[j]){
                  lcs[i][j]=lcs[i-1][j-1]+1;
              if(result<lcs[i][j]){
                  result=lcs[i][j];
                  index=i;
              }
              else
                  lcs[i][j]=0;
              }
          }
      }
      int count=0;
   
      String fi=" ";
      for(int i=index-result;i<=index;i++){
          fi+=a[i]+"";
          count++;
      }
  
      return fi;
  }
 

}
