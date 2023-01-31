// public class demo {

//     static class stack {
//        static int arr[]; 
//        static int size ;
//        static int top = -1;
//      stack(int n){
//           arr= new int[n];
//           size = n;
//           top = -1;
//     } 

  
//     public boolean isempty() {
//         return top == -1;
//     }

//     void push(int data) {
//         top = top+1;
//         arr[top]=data;
//     }


//     int pop() {
//         if (isempty()) {
//             System.out.println("the list is empty");
//             return -1;
//         }
//         return arr[top--];
//     }

    

//     int peek() {
//         if (isempty()) {
//             System.out.println("the list is empty");
//             return -1;
//         }
//         return arr[top];
//     }
// }
//     public static void main(String[] args) {
//         stack st = new stack(5);
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         while (!st.isempty()) {
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }
// }






// LinaerSearch


// public class demo{



//     public static int binSearch(int arr[], int firstIndex, int LastIndex , int key){
//         if(LastIndex<firstIndex){
//             return -1;
//         }

        
//         if(arr[firstIndex]==key)
//             return firstIndex ;
//             return binSearch(arr ,firstIndex+1,LastIndex ,key);

//     }
//     public static void main(String[] args) {
        
//         int arr[]={1,2,2,344,4,77};
//         int key = 77;
//         int result = binSearch(arr ,0, arr.length-1 ,key);

//         if(result==-1){
//             System.out.println("eleemnt Not Found");
//         }else{
//             System.out.println("the Element Present at Index"+result);
//         }
//     }

// }

