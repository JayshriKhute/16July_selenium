package StarPatterns;

public class pattern2 
{
   public static void main(String args[])
   
   {
	   int i,j,n=10;
	  
	   for(i=1;i<=n;i++)
	   {
		   for(j=n;j>n-i;j--)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
	  
	   
   }
}
