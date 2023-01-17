import java.util.*;
// Main class
public class Main
{
   // Recursive Binary Search
   public static int binarySearch(int arr[], int left, int right, int item)
   {
       // Check for overflow first
       if (right >= left && left <= arr.length - 1) 
       {
           // Mid is the value located in the middle
           // between the left and right indices
           int mid = left + (right - left) / 2;
           // Check if the item is at middle position
           if (arr[mid] == item)
               return mid;
           // If the item is smaller than mid
           if (arr[mid] > item)
               return binarySearch(arr, left, mid - 1, item);
           // Else if the item is larger than mid
           return binarySearch(arr, mid + 1, right, item);
        }
       // If the element is not found
       return -1;
   }

   public static void main(String[] args)
   {
       // Array to search from
       int arr[] = {10,20,25,30,40,50};
       // Item to check for in the array
       int item = 25;
       // res stores the index returned from the recursive method
       int res = binarySearch(arr,0,arr.length-1,item);
       // Print the result
       if(res == -1)
           System.out.println("The element is not found");
       else
           System.out.println("The element is at index "+res);
    }
}