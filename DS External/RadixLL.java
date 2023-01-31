// List=list(map(int,input().split()))
// def radix(List,maxSize):
//     for i in range( maxSize):
//         BucketList=count(List,i)
//         List=[]
//         for i in BucketList:
//             for j in i :
//                 List.append(j)
//     return List
// def count(List,i):
//     BucketList=[[],[],[],[],[],[],[],[],[],[]]
//     for num in List:
//         BucketList[(num//(10**i))%10].append(num)

//     return BucketList


// print(radix(List,len(str(max(List)))))



// public class LinkedList {

//     class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data= data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public int size;


//     public void addFirst(int data){
//         Node newNode = new Node(data);
//             size++;

//             if(head==null){
//                 head= tail= newNode;
//                 return;
//             }
            
//             newNode.next=head;
//             head = newNode;
//     }



//     public void addLast(int data){
//         Node newNode = new Node(data);
//             size++;

//             if(head==null){
//                 head= tail= newNode;
//                 return;
//             }

//             tail.next= newNode;
//             tail = newNode;
//     }


//     // adding element at the Given Index

//     public void index(int index , int data){
//         if (index==0){
//             addFirst(data);
//             return;
//         }

//        Node newNode = new Node (data);
//        size++;
//        Node temp= head;
//        int i = 0;
//        while(i<index-1){
//         temp = temp.next;
//         i++;
//        }

//        newNode.next= temp.next;
//        temp.next =newNode;

//     }



//     // addAfter

//     public void addAfter(int data , int key){
//         Node newNode = new Node (data);

//         size++;
        
//        if(head==null){
//         System.out.println("List is Empty");
//         return;
//        }


//        Node temp= head;
//        while(temp!=null && temp.data != key ){
//         temp = temp.next;
    
//        }

//        if (temp==null){
//         System.out.println("Element Not Found In the List");
//         return;
//        }

//        newNode.next= temp.next;
//        temp.next =newNode;

//     }



//     public void print(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+ "->");
//             temp = temp.next;
//         }
//         System.out.println("null");

//     }


//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.print();
//         ll.addFirst(5);
//         ll.print();
//         ll.addLast(65);
//         ll.print();
//         ll.addFirst(15);
//         ll.print();
//         ll.addLast(25);
//         ll.print();

//         ll.index(3,200);
//         ll.print();

//         ll.addAfter(15,5);
//         ll.print();
 
         

//         ll.addAfter(15,65);
//         ll.print();
 
         
        
        
         
//         System.out.println("The Size of the LinkedList is " + (ll.size));
        
//     }



//     public void addBefore(int i, int j) {
//     }
    
    
    
// }
