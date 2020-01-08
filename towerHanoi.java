import java.util.List;
import java.util.Arrays;
import java.util.Stack;
public class towerHanoi {

    public static void main(String[] args) {
         Stack<Integer> s = new Stack<Integer>();
         s.addAll(Arrays.asList(3,2,1));
         Stack<Integer> d = new Stack<Integer>();
         Stack<Integer> a = new Stack<Integer>();
    
        helper(s.size(),s,d,a);
        System.out.println("Destination has");
        for(int i : d){System.out.println(i);}
    
    }
    
    public static void helper(int n, Stack<Integer> s,Stack<Integer> d,Stack<Integer> a)
    {
        if(n==1)
        { d.push(s.pop());
        }
        else{
            helper(n-1,s,a,d);     //shift the n-1 disks to Aux
            d.push(s.pop());       //shift the disk 'n' to Dest
            helper(n-1,a,d,s);     //shift the n-1 disks to Dest 
        }
       
        
    }
    
}


