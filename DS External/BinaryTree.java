
// public class BinaryTree {

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null ;
//             this.right = null;
//         }
//     }
    
//     static class BinaryTree{

//         static int index = -1;

//         public Node buildTree(int nodes[]){
//                 index++;
//                 if(nodes[index]==-1){
//                     return null;
//                 }

//                 Node newNode = new Node(nodes[index]);
//                 newNode.left =buildTree(nodes);
//                 newNode.right= buildTree(nodes);
//                 return newNode;

//         }


//         // Preoder?


//         public void preorder(Node root){
//             if(root == null){
//                 return;
//             }
               
//                 System.out.print(root.data +" ");
//                 preorder(root.left);
//                 preorder(root.right);
//         }

//         // Inorder?

//         public void Inorder(Node root){
//             if(root == null){
//                 return;
//             }
               
//                 Inorder(root.left);
//                 System.out.print(root.data +" ");
//                 Inorder(root.right);
//         }

//     //    PostOrder ?

//         public void postorder(Node root){
//             if(root == null){
//                 return;
//             }
               
//                 postorder(root.left);
//                 postorder(root.right);
//                 System.out.print(root.data +" ");
//         }

//     }
//     public static void main(String[] args) {
//         int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println("The Root Node of the Given Data is = " +root.data); 
        
//         tree.preorder(root) ;
//         System.out.println(" ");


//         tree.Inorder(root);
//         System.out.println(" ");

//         tree.postorder(root);
//         System.out.println(" ");
//     }
// }

// // OUTPUT

// // The Root Node of the Given Data is = 1
// // 1 2 4 5 3 6  
// // 4 2 5 1 3 6  
// // 4 5 2 6 3 1  




// // Program to Implement binarySearch using Recurrsion?

// public class  binRecurrsion
// {
//    // Recursive Binary Search
//    public static int binarySearch(int arr[], int left, int right, int item)
//    {
//        // Check for overflow first
//        if (right >= left && left <= arr.length - 1) 
//        {
//            // Mid is the value located in the middle
//            // between the left and right indices
//            int mid = left + (right - left) / 2;
//            // Check if the item is at middle position
//            if (arr[mid] == item)
//                return mid;
//            // If the item is smaller than mid
//            if (arr[mid] > item)
//                return binarySearch(arr, left, mid - 1, item);
//            // Else if the item is larger than mid
//            return binarySearch(arr, mid + 1, right, item);
//         }
//        // If the element is not found
//        return -1;
//    }

//    public static void main(String[] args)
//    {
//        // Array to search from
//        int arr[] = {10,20,25,30,40,50};
//        // Item to check for in the array
//        int item = 25;
//        // res stores the index returned from the recursive method
//        int res = binarySearch(arr,0,arr.length-1,item);
//        // Print the result
//        if(res == -1)
//            System.out.println("The element is not found");
//        else
//            System.out.println("The element is at index "+res);
//     }
// }


// // output?
// // The element is at index 2



// public class  binRecurrsion
// {

//    public static int binarySearch(int arr[], int left, int right, int item)
//    {
//         if (right >= left && left <= arr.length - 1) 
//        {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == item)
//                return mid;
//             if (arr[mid] > item)
//                return binarySearch(arr, left, mid - 1, item);
//             return binarySearch(arr, mid + 1, right, item);
//         }
//         return -1;
//    }




//    public static void main(String[] args)

//    {
//         int arr[] = {10,20,25,30,40,50};
//         int item = 25;
//         int res = binarySearch(arr,0,arr.length-1,item);
//         if(res == -1)
//            System.out.println("The element is not found");
//        else
//            System.out.println("The element is at index "+res);
//     }
    
// }



// // output?
// // The element is at index 2
