import java.util.Scanner;

public class Queens {

    int[] x;
    static int count=0;
    
    public Queens(int N) 
    {
        x = new int[N];
    }
    
    
    public static void main(String args[]) {
        System.out.println("Enter no.of queens:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queens Q = new Queens(n);
        Q.placeNqueens(0, n);
        System.out.println("no.of unique solutions:"+count);
    }
    
    
    
    public void placeNqueens(int r, int n) 
    {  System.out.println("Placing Queen"+r+ " at row="+r);
        for (int c = 0; c < n; c++)
        {
            if (canPlaceQueen(r, c)) 
            {
                x[r] = c;
                if (r == n - 1) 
                    printQueens(x);
                 else 
                    placeNqueens(r + 1, n);
                
            }
            else
            {
            	
            	  System.out.println(" Queen"+r+" cannot be placed in row="+r+" column="+c);
            }
        }
        
    }
    
    
    public boolean canPlaceQueen(int r, int c) 
    {
        for (int i = 0; i < r; i++) 
        {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i])) 
            {
                return false;
            }
        }
        return true;
    }

    public void printQueens(int[] x) {
        int N = x.length;
        count++;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

   

   

   
}