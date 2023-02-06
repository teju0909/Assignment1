package Assignment1;

public class IneuronPattern {

	public static void main(String[] args) {
		
		int n=20;
		
		
		System.out.println("");
		for(int i=1;i<=n;i++) {
	 		for(int j=1;j<=n;j++)
	 		{
	 			if(  j==n/2 ) {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}
	 		
	 		for(int j=1;j<=n;j++)
	 		{
	 			if( j==1  ||  j==n || i==j )  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	

	 		//E
	 		for(int j=0;j<n;j++)
	 		{
	 			if( j==n/4  || i==1 && j>n/4 || i==n && j>n/4 || i==n/2 && j>n/4)  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	

	 		//U
	 		for(int j=1;j<=n;j++)
	 		{
	 			if( j==3 && i!=n ||  j==n-3 && i!=n  ||  i-j>n ||i==n && j<3*n/4 && j>n/4  )  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	

	 		
	 		//R
	 		for(int j=1;j<=n;j++)
	 		{
	 			if( j==1  || i-j==n/2 || i==n/2 && j<n/2 || i==1 && j<n/2  || j==n/2 && i < n/2)  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	
	 		
	 		//O
	 		for(int j=1;j<=n;j++)
	 		{
	 			if( (i==1 && j>n/7 && j<3*n/4) || (j==1 && i!=n && i!=1  && i<3*n) || (i==n && j>n/7 && j<3*n/4	) || (j==n-4 && i!=n && i!=1 && i<3*n) )  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	

	 		for(int j=1;j<=n;j++)
	 		{
	 			if( j==1  ||  j==n || i==j )  {
	 				System.out.print("*");
	 			}
	 			else {
	 				System.out.print(" ");
	 			}
	 		}	
	 		System.out.println("");	
	 	}
		
		
		
	}

}
