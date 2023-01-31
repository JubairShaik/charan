// public class demo{
    

//     public static void printArr(int arr[]) {
//         for(int i=0 ; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//         }
//         System.out.println();
        
//     }

//     public static void SelectionSort(int arr[]) {
//         for(int i =0; i<arr.length-1 ;i++){
//             int minPos = i; 

//             for(int j =i+1 ; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
        
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
        
//         }     
//     }

//     public static void main(String[] args) {
 
//         int arr[]= {1,3,4,5,6,2};
             
//         SelectionSort(arr);
//         printArr(arr);        
                 
//     }
    

// }




// class sll{
//     node head;
//     class node{
//         int data;
//         node next;
//         node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     void add_first(int data){
//         node newnode=new node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         newnode.next=head;
//         head=newnode;
//     }
//     void add_last(int data){
//         node newnode=new node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     void add_after(int data,int key){
//         node newnode=new node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         node temp=head;
//         while(temp.data!=key && temp!=null){
//             temp=temp.next;
//         }
//         if(temp==null){
//             System.out.println("key not found");
//             return;
//         }
//         newnode.next=temp.next;
//         temp.next=newnode;
//     }
//     void delete_first(){
//         if(head==null){
//             System.out.println("empty");
//             return;
//         }
//         head=head.next;
//     }
//     void delete_last(){
//         if(head==null){
//             System.out.println("empty");
//             return;
//         }
//         node first=head;
//         node second=head.next;
//         while(second.next!=null){
//             first=first.next;
//             second=second.next;
//         }
//         first.next=null;
//     }
//     void delete(int key){
//         if(head==null){
//             System.out.println("empty");
//             return;
//         }
//         node first=head;
//         node second=head.next;
//         while(second!=null && second.data!=key){
//             first=first.next;
//             second=second.next;
//         }
//         if(head.next==null && head.data==key){
//             head=null;
//             return;
//         }
//         else if(first.next!=null && head.data==key){
//             head=head.next;
//             return;
//         }
//         first.next=second.next;
//     }
//     void reverse(){
//         node next=null;
//         node prev=null;
//         node temp=head;
//         while(temp!=null){
//             next=temp.next;
//             temp.next=prev;
//             prev=temp;
//             temp=next;
//         }
//         head=prev;
//     }
//     void display(){
//         node temp=head;
//         while(temp!=null){
//             System.out.println(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
// }