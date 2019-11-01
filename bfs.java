import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        Queue<Integer> q=new LinkedList<Integer>();
	        System.out.println("Enter the number of vertices");
	        int n=sc.nextInt();
	        int adjMat[][]=new int[n][n];
	        System.out.println("Enter the adjacency matrix");
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	              adjMat[i][j]=sc.nextInt();
	        //Starting BFS from 0th vertex
	        boolean visited[]=new boolean[n];
	        Arrays.fill(visited,false);
	        q.add(0);
	        visited[0]=true;
	        while(!q.isEmpty())
	        {
	           int remove=q.remove();
	            System.out.println("Visited "+remove); 
	           //visited[remove]=true;
	           for(int i=0;i<n;i++)
	               if(adjMat[remove][i]==1 && !visited[i])
	               {
	                   q.add(i);
	                   visited[i]=true;
	                }
	                            
	          }
	        
	    }
	    
	    
	    //matrix
	    /*0 1 0 1
0 0 1 0
0 1 0 1
0 0 0 1
*/
	    
	    
	}


