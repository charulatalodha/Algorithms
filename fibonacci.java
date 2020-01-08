public class fibonacci {

    public static void main(String[] args) {
        int n=5;
        int a=0, b=1;
        helper(a,b,n);
    }
    
    public static void helper(int a,int b, int n)
    {
        if(n==0)
            return;
        System.out.print(a+", ");
        helper(b,b+a,n-1);
        
    }
    
}


