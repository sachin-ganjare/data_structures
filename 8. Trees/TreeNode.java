class TreeNode {
// Binary Search Tree
    TreeNode right;
    TreeNode left;
    int data;
    
    // Create a Node
    TreeNode () {
      data = 0;
      TreeNode right = null;
      TreeNode left = null;
    }
    
    TreeNode (int data) {
      this.data = data;
      TreeNode right = null;
      TreeNode left = null;
    }
  
  // Insertion Operation
  void insert (int value, TreeNode root) {
    TreeNode ptr = root;
    TreeNode prevPtr = null ;
    // Case 0: Check if the value already present
    boolean flag = false;
    
    while (ptr != null && flag == false) {
      // Case a: if value is greater than root:
      if (value > ptr.data) {
          prevPtr = ptr;
          ptr = ptr.right;
      }
      else if (value < ptr.data) {
          prevPtr = ptr;
          ptr = ptr.left;
      }
      else if (value == ptr.data) {
          flag = true;
      };
    };
    
    if (flag == true) {
      System.out.println("Unsuccessful: ITEM ALREADY EXIST!");
      return;
    } 
    
    // Case 1: Item does not already exist
    System.out.println("\n Processing: INSERTION OPERATION... for value" + value);
    // ptr already marks the NULL. insert at pointer's position.
  if (value < prevPtr.data) {
    prevPtr.left = new TreeNode(value);
  } else if (value > prevPtr.data) {
    prevPtr.right = new TreeNode(value);
    } else {
    System.out.println("Failed: UNKNOWN REASON...");
    };
  }
  
  // Traversal Operation
  void Inorder(TreeNode root) {
  if(root != null) {
    Inorder(root.left);
    System.out.print(" " +root.data);
    Inorder(root.right);
  }
  } 
  
  void Preorder(TreeNode root) {
  if(root != null) {
    System.out.print(" "+root.data);
    Preorder(root.left);
    Preorder(root.right);
  }
  }
  
  void Postorder(TreeNode root) {
  if(root != null) {
    Postorder(root.left);
    Postorder(root.right);
    System.out.print(" "+root.data);
  }
  }
  
  void delete (int value, TreeNode root){
   // to find cases: one child, two child, zero child. first things - ptr to the parent.
   TreeNode ptr = root;
   TreeNode prevPtr = root;
   
   // Zeroth Case: Find the Node.
    while (ptr != null && flag == false) {
      // Case a: if value is greater than root:
      if (value > ptr.data) {
          prevPtr = ptr;
          ptr = ptr.right;
      }
      else if (value < ptr.data) {
          prevPtr = ptr;
          ptr = ptr.left;
      }
      else if (value == ptr.data) {
          flag = true;
      };
    };
    
    if (flag == true) {
      System.out.println("Processing: ITEM FOUND IN THE BST!");
    };
    
    // Three main cases: a. Zero Child, b. One Child, c. Two Child
    
    // Zero Child
    if (ptr.left == null && ptr.right == null) { 
      // delete the ptr
      if(prevPtr.left == ptr) {
          prevPtr.left = null;
      }
      else {
          prevPtr.right = null;
      }
    }
    
    // One Child
    else if (ptr.left == null || ptr.right == null) { 
      if(ptr.left == null){
        if(prevPtr.right == ptr) {
           prevPtr.right = ptr.right ;
          }
         else {
           prevPtr.left = ptr.right;
         } 
      }
      else {
        if(ptr.right == null){
          if(prevPtr.right == ptr) {
            prevPtr.right = ptr.left ;
          } else {
            prevPtr.left = ptr.left;
          }        
        }
      } 
    }
    
    // Node with Two Child
     else if (ptr.right != null && ptr.left != null) { 
        // find the inorder successor
        TreeNode succParent = ptr;
        TreeNode succNode = ptr.right;
        while (succNode.left != null) {
          succParent = succNode;
          succNode = succNode.left;
        }

        // Overwrite node to delete with SuccNode's data
        ptr.data = succNode.data;

        if (succParent != ptr) {
            succParent.left = succNode.right;
        } else {
            succParent.right = succNode.right;
        }
      }
    }
    
    public static void main(String args[]){
        // New TreeNode
        TreeNode root = new TreeNode(4);
        System.out.println("root value is: " + root.data);
        
        // Insertion
        root.insert(5, root);
        root.insert(2, root);
        root.insert(5, root);
        root.insert(1, root);
        root.insert(10, root);
        root.insert(15, root);
        root.insert(7, root);
        
        // Traversal
        root.Inorder(root);
        System.out.println();
        root.Preorder(root);
        System.out.println();
        root.Postorder(root);
        System.out.println();
        
        // Deletion
        root.delete(4, root);
        
    }
}
