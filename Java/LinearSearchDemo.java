import java.util.Scanner;
public class LinearSearchDemo 
{
   int linearRecursion(int[] arrNumber, int start, int last, int k)
   {
      if(last < start)
         return -1;
      if(arrNumber[start] == k)
         return start;
      return linearRecursion(arrNumber, start + 1, last, k);
   }
   public static void main(String[] args)
   {
      LinearSearchDemo obj = new LinearSearchDemo();
      int a, l, key, array[];
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter array length: ");
      l = sc.nextInt();
      array = new int[l];
      System.out.println("Please enter " + l + " elements");
      for(a = 0; a < l; a++)
      {
         array[a] = sc.nextInt();
      }
      System.out.println("Enter the search key value: ");
      key = sc.nextInt();
      int index = obj.linearRecursion(array, 0, l - 1, key);
      if(index != -1)
      {
         System.out.println(key + " is found at location " + (index + 1));
      }
      else
      {
         System.out.println(key + " doesn't exist in array.");
      }
      sc.close();
   }
}