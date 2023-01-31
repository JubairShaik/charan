// public class  demo {


//     public static void printArr(int arr[]){
//         for (int i=0;i<arr.length ; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println( );
//    }

//    public static void bubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){
//             for (int j=0; j<arr.length-1-turn ;j++){
//                 if (arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j]= arr[j+1];
//                     arr[j+1]= temp;
//                 }
//             }
//         }
//    }

   

//     public static void main(String[] args) {
//         int arr[]= {2,4,5,6,7,78,8};
//         bubbleSort(arr);
//         printArr(arr);
//     }
    
// }



// -----------------------------------------------------------------------


// public class demo {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr= new int[n];
//             size = n;
//             rear =-1;
//         }

//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         public static void add (int data){
//             if (rear==size-1){
//                 System.out.println("Queue is Empty");
//                 return;
//             }
//             rear= rear+1;
//             arr[rear]=data;
//         }


//         public static int remove(){
//            if(isEmpty()){
//              System.out.println("Queue is Empty");
//              return -1;
//            }

//            int front = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]++;

            
//            }
//            rear--;

//            return front;
         

//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return-1;
//             }
//             return arr[0];
//         }
       
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(6);
//         q.add(4);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
    
// }
