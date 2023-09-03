package introS;

public class Pattern {
	public static void main(String[]args) {
//		Pattern1(5);
		Pattern3(5);
	}
	
//	/////pattern1////
	/*->
* 
* * 
* * * 
* * * * 
* * * * * 
	  
	  
	 
	 */
//	static void Pattern1(int n) 
//	{
//		for (int row=1;row<=n;row++)
//		{
//			for (int col=1;col<=row;col++)
//			{
//				System.out.print("*"+" ");
//			}	
//			System.out.println();
//		}
	
	//------->Pattern2////*****
	/*->
*****
 ****
  ***
   **
    *
	  */
//		static void Pattern1(int n) 
//		{
//			for (int row=1;row<=n;row++)
//			{
//				for(int k=1;k<row;k++) {  
//					System.out.print(" ");
//				}
//				
//				for (int col=row;col<=n;col++)
//				{
//					System.out.print("*");
//				}	
//				System.out.println();
//			}
	
		
			//------->Pattern////*****
			/*->
***********
**********
*********
********
*******
******
*******
********
*********
**********
***********
			  */
//	static void Pattern3(int n) 
//	{
//		for (int row=0;row<=2*n;row++)
//		{
//			int totalInCol=row<n?2*n-row:row;
//			for (int col=0;col<=totalInCol;col++)
//			{
//				System.out.print("*");
//			}	
//			System.out.println();
//		}
		
		/*->
***********
**********
*********
********
*******
******
*******
********
*********
**********
***********
		  */
static void Pattern3(int n) 
{
	for (int row=0;row<2*n;row++)
	{
		int totalColInRow=row<n?2*n-row:row;
		for (int col=0;col<totalColInRow;col++)
		{
			System.out.print("*");
		}	
		System.out.println();
	}
			
	}
	
	}

