public class Main 
{
    // defined search() method with arr[], first index, last index and value as parameter to search that specific value inside the array
    public static int search(int arr[], int firstIndex, int lastIndex, int value) 
    {
        // if the last index is less than the first index then return -1
        if (lastIndex < firstIndex)
           return -1;
        // if the first index is equal to value then return first index
        if (arr[firstIndex] == value)
           return firstIndex;
        // else call search() method recursively to search until that specific value is found inside the array
        return search(arr, firstIndex+1, lastIndex, value);
    }



    // defined main() method where the program starts executing
    public static void main(String[] args)
    {
        //declare and initialize an integer variable array arr[]
        int[] arr = {77, 82, 100, 17, 95};
        //declare and initialize an integer variable ‘value’ to search that specific number inside the array
        int value = 100; 
        //calling the user defined method search()
        //and store the result value inside an integer variable say ‘index’  
        int index = search(arr, 0, arr.length-1, value);
        // check if the value is present in the array then print the result
        if (index != -1)
           System.out.println("The element " + value + " is present at index " + index);
        else
            System.out.println("The element " + value + " is not present in the array");
    }
    
}



// Without Explaionation

public class Main 
{

    public static int search(int arr[], int firstIndex, int lastIndex, int value){
         if (lastIndex < firstIndex)
           return -1;
         if (arr[firstIndex] == value)
           return firstIndex;
         return search(arr, firstIndex+1, lastIndex, value);
    }

     public static void main(String[] args){
         int[] arr = {77, 82, 100, 17, 95};
         int value = 100; 
          int index = search(arr, 0, arr.length-1, value);
         if (index != -1)
           System.out.println("The element " + value + " is present at index " + index);
        else
            System.out.println("The element " + value + " is not present in the array");
     }
    
}



// output:
// The element 100 is present at index 2