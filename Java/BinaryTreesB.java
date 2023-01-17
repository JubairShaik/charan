
public class BinaryTreesB {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null;
        }
    }
    
    static class BinaryTree{

        static int index = -1;

        public Node buildTree(int nodes[]){
                index++;
                if(nodes[index]==-1){
                    return null;
                }

                Node newNode = new Node(nodes[index]);
                newNode.left =buildTree(nodes);
                newNode.right= buildTree(nodes);
                return newNode;

        }


        // Preoder?


        public void preorder(Node root){
            if(root == null){
                return;
            }
               
                System.out.print(root.data +" ");
                preorder(root.left);
                preorder(root.right);
        }

        // Inorder?

        public void Inorder(Node root){
            if(root == null){
                return;
            }
               
                Inorder(root.left);
                System.out.print(root.data +" ");
                Inorder(root.right);
        }

    //    PostOrder ?

        public void postorder(Node root){
            if(root == null){
                return;
            }
               
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data +" ");
        }

    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The Root Node of the Given Data is = " +root.data); 
        
        tree.preorder(root) ;
        System.out.println(" ");


        tree.Inorder(root);
        System.out.println(" ");

        tree.postorder(root);
        System.out.println(" ");
    }
}

// OUTPUT

// The Root Node of the Given Data is = 1
// 1 2 4 5 3 6  
// 4 2 5 1 3 6  
// 4 5 2 6 3 1  
