package assingment;

public class pattern {
	public static void main(String[] args) {
		int n = 7;
		for(int i=0;i<n;i++) 
		{
//			letter H
			for(int j=0;j<n;j++) 
			{
				if(j==0 || j==(n-1) || i==(n-1)/2 )
					System.out.print("*");
				else 
						System.out.print(" ");	
			}
			System.out.print("  ");
//       letter A
			for(int j=0;j<n;j++) 
			{
				if((j==0 && i>0)
						||(i==(n-1)/2 && j<=(3*n)/4)
						||(i==0 && j<(3*n)/4) && j>0||(j==(3*n)/4 && i>0))
				System.out.print("*");
				else 
				System.out.print(" ");
			}
			System.out.print(" ");
//			letter R
			for( int j=0;j<n;j++) {
				if((j==0 ||i==0) && j<(3*n)/4||i==(n-1)/2 && j<(3*n)/4 
						||j==(3*n)/4 && i<(n-1)/2 && i>0 ||i-j==0&&j>=n/2&&i>=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
//			letter i
			for(int j=0;j<n;j++) {
				if (i==0 || i==n-1 || j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
//			letter s
			for(int j=0;j<n;j++) {
				if((i==0 && j<(3*n)/4 && j>0) || (j==0 && i>0 && i<(n-1)/2)
						|| i==(n-1)/2 && j<(3*n)/4 && j>0 ||i==n-1 && j <(3*n)/4 ||
						j==(3*n)/4 && i>(n-1)/2 && i<n-1)
				System.out.print("*");
				else 
				System.out.print(" ");
			}
			System.out.print("  ");
//			letter H
			for(int j=0;j<n;j++) 
			{
				if(j==0 || j==(n-1) || i==(n-1)/2 )
					System.out.print("*");
				else 
						System.out.print(" ");	
			}
			System.out.print(" ");


			System.out.println();	
			
			}
		System.out.println();
//		letter i
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j>n/2 && j<(3*n)/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//N letter
			for(int j =0;j<=n;j++)
			{
				if(j==0||i==j || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			//E letter
			for(int j =0;j<=n;j++)
			{
				if(j==0 ||i==0 && j<=(3*n)/4||i==n/2&& j<=(3*n)/4||i==n&&j<=(3*n)/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("");
			//U letter
			for(int j =0;j<=n;j++)
			{
				if(i==n&&j!=0 &&j<3*n/4||j==0&&i!=n||j==3*n/4&&i!=n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("");
//			letter R
			for( int j=0;j<=n;j++) {
				if((j==0 ||i==0) && j<(3*n)/4||i==(n-1)/2 && j<(3*n)/4 
						||j==(3*n)/4 && i<(n-1)/2 && i>0 ||i-j==0&&j>=n/2&&i>=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
//			letter O
			for(int j=0;j<n;j++) {
             if(j==0&&i>0&&i<n||i==0&&j<(3*n)/4&&j>0||j==(3*n)/4&&i<n && i>0||(i==n&&j<3*n/4&&j>0))
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.print(" ");
//			letter N
			for(int j =0;j<=n;j++)
			{
				if(j==0||i==j || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			System.out.println();
		}


		
		}
		
		
	}


