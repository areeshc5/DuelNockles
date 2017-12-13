package sortomania.contestants;

import java.awt.Color;
import java.util.Arrays;

import sortomania.Contestant;

public class VickieAreej extends Contestant{

	private double median;
	
	public VickieAreej() {
	}

	public static void main(String[] args) {
		VickieAreej run = new VickieAreej();
		
		int[] arr = {4, 7,10, 2,18,12, 34, 42, 23, 40, 56, 31, 8, 56,234,56,35,234,67};
		int[][] arr2 = {{2,1,3,98},{23,54,23,9}};
		//multiArraySort2(arr2);
		//heapSort(arr);
		//bubbleSort(arr);
		System.out.print(Arrays.toString(run.multiArraySort2(arr2)));//1d arr
		System.out.print(Arrays.deepToString(arr2)); //2d arr
		System.out.println("The median is: " + run.sortAndGetMedian(arr));
		//System.out.println("And the sorted array is: \n" + arr);
    }  

	@Override
	public Color getColor() {
		 return new Color(218,112,214);
	}

	@Override
	public String getSpriteName() {
		return FEI_LONG;
	}

	public void heapSort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }
 
    public void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
	public double sortAndGetMedian(int[] random) {
		//heap sort
		heapSort(random);
		//get median
		if(random.length%2 ==0) {
			median = (random[random.length/2]+random[(random.length/2)-1])/2;
		}else {
			median = random[(int) ((random.length/2)+.5)];
		}
		return median;
	}

	@Override
	public int sortAndGetResultingIndexOf(String[] strings, String toFind) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] bubbleSort(int[] mostlySorted) {
		int n = mostlySorted.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(mostlySorted[j-1] > mostlySorted[j]){  
                                 //swap elements  
                                 temp = mostlySorted[j-1];  
                                 mostlySorted[j-1] = mostlySorted[j];  
                                 mostlySorted[j] = temp;  
                         }  
                          
                 }  
         }
         return mostlySorted;
	}
	
	public double mostlySortAndGetMedian(int[] mostlySorted) {
		//bubble sort
		bubbleSort(mostlySorted);
		//get median
		if(mostlySorted.length%2 ==0) {
			median = (mostlySorted[mostlySorted.length/2]+mostlySorted[(mostlySorted.length/2)-1])/2;
		}else {
			median = mostlySorted[(int) ((mostlySorted.length/2)+.5)];
		}
		return median;
	}

	@Override
	public double sortMultiDim(int[][] grid) {
		//multiArraySort(grid);
		int[] list = multiArraySort2(grid);
		//getMedian
		if(grid.length%2 ==0) {
			median = (list[list.length/2]+list[(list.length/2)-1])/2;
		}else {
			median = list[(int) ((list.length/2)+.5)];
		}
		return median;
	}

	private int[] multiArraySort2(int[][] grid) {
		 // Create a new list to store the items
	    int[] list = new int[grid.length*grid[0].length];
	    // keep track of where we are.
	    int listPos = 0;
	    // iterate over the entire 2d array adding each integer
	    for(int i = 0 ; i < grid.length; i++) {
	        for(int j = 0; j < grid.length; j++) {
	            list[listPos++] = grid[i][j];
	        }
	    }
	    heapSort(list);
	    return list;
	}

	@Override
	public int sortAndSearch(Comparable[] arr, Comparable toFind) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "A & V";
		
	}

}
