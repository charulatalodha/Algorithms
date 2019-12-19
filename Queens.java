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
    {  
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
            
        }
        
    }
    
    
    public boolean canPlaceQueen(int r, int c) 
    {   //check for each row, if the Queen can be placed there
        for (int i = 0; i < r; i++) 
        {
            // check for same column and diagonal conditions
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
