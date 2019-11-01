
import java.util.Arrays;
public class Prims {
    public static void main(String[] args) {
        prims obj=new prims();
        obj.input();
        obj.prims();
        obj.write();
    }
    
    public static class prims
    {
        int cost[][],t[][],mincost=999,i,j,n,k,l,near[],x;
        
        private void prims()
        {
            for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                    if(cost[i][j]<mincost)
                    {
                        mincost=cost[i][j];
                        k=i;l=j;
                    }
            t[0][0]=k;
            t[0][1]=l;
            t[0][2]=cost[k][l];
            
            for(i=0;i<n;i++)
            {
                if(cost[i][l]<cost[i][k])
                  near[i]=l;
                else
                  near[i]=k;
            }
            near[k]=0;
            near[l]=0;
            
            for(i=1;i<n-1;i++)
            {
                int min=999;
                for(j=0;j<n;j++)
                {
                    if(cost[j][near[j]]<min && near[j]!=0)
                    {
                        min=cost[j][near[j]];
                        x=j;
                    }
                }
                t[i][0]=x;
                t[i][1]=near[x];
                t[i][2]=cost[x][near[x]];
                mincost+=cost[x][near[x]];
                near[x]=0;
                
                for(k=0;k<n;k++)
                {
                    if(cost[k][near[k]]>cost[k][x] && near[k]!=0)
                        near[k]=j;
                }
            }
        }
        
        private void write()
        {
            System.out.println("Min cost is :"+mincost);
            System.out.println("T[][] matrix is");
            for(i=0;i<n-1;i++)
            {
                System.out.println(t[i][0]+"   "+t[i][1]+"   "+t[i][2]);
            }
        }
        
        public void input()
        {
         java.util.Scanner sc=new java.util.Scanner(System.in);
         System.out.print("Enter no. of vertices : ");
         n=sc.nextInt();
         t=new int[n-1][3];
         near=new int[n];
        cost=new int[n][n];
        System.out.println("Enter cost matrix :");
        for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
               cost[i][j]=sc.nextInt();
        Arrays.fill(near, 99);
        }
    }
}
