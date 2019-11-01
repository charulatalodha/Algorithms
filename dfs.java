import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class dfs {
	
	
	 public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
	        Stack<Integer> stack=new Stack<Integer>();
	        System.out.println("Enter the number of vertices");
	        int n=sc.nextInt();
	        int adjMat[][]=new int[n][n];
	        System.out.println("Enter the adjacency matrix");
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	              adjMat[i][j]=sc.nextInt();
	        //Starting DFS from 0th vertex
	        boolean visited[]=new boolean[n];
	        Arrays.fill(visited,false);
	        stack.push(0);
	        visited[0]=true;
	        while(!stack.isEmpty()){
	           int remove=stack.pop();
	            System.out.println("Visited "+remove); 
	            for(int i=0;i<n;i++){
	               if(adjMat[remove][i]==1 && !visited[i]){
	                   stack.push(i);
	                   visited[i]=true;
	               }
	           }
	        }
	    }
	}
	
	/*
	 
	 0 1 0 1
0 0 1 0
0 1 0 1
0 0 0 1
	 
	 */
	
	
