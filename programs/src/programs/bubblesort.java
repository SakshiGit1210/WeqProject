package programs;

public class bubblesort {
	public static void main(String[] args) {
		
int arr[] = {36,19,29,12,5};
        
        System.out.println("Before Sorting: ");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println("After Sorting in descending order :");
        
        for(int item : arr)
        {
            System.out.print(item+" ");
        }
        
	}
}
