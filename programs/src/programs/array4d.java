package programs;
import java.util.*;
public class array4d {
	public static void main(String[] args) {
		 int arr[][][][] = new int[3][3][2][2];
	       
	       Scanner sc = new Scanner(System.in);
	       
	       for(int i = 0 ; i < arr.length; i++)
	       {
	           for(int j = 0; j < arr.length; j++)
	           {
	               for(int k = 0 ; k < arr.length-1; k++)
	               {
	                   for(int m = 0; m < arr.length-1; m++)
	                   {
	                       arr[i][j][k][m] = sc.nextInt();
	                   }
	               }
	           }
	       }
	       
	       
	      for(int arr3d[][][] : arr)
	      {
	          for(int arr2d[][] : arr3d)
	          {
	              for(int arr1d[] : arr2d)
	              {
	                  for(int item : arr1d)
	                  {
	                      System.out.print(item + " ");
	                  }
	                  System.out.println("");
	              }
	               System.out.println("");
	          }
	           System.out.println("");
	      }
	       
	}
}
