// Online Java Compiler
// Use this editor to write, compile and run your Java code online
     //Input
     /*
                a
            b       c
        d     e   f   
        
    */
    
    
    //Output
    /*
            a
        c       b
           f   e    d
    
    */


class Tree{
    public String data;
    public Tree left;
    public Tree right;
    
    public Tree(String data){
        this.data=data;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
        Tree root=new Tree("a");
        root.left=new Tree("b");
        root.right=new Tree("c");
        root.left.left=new Tree("d");
        root.left.right=new Tree("e");
        root.right.left=new Tree("f");
        
        invert(root);
        preorder(root);
        
    }
    
   
    
    public static void invert(Tree root){
        
        if(root==null)
            return;
        
        Tree temp=root.left;
      
        root.left=root.right;
        root.right=temp;
        
        
        invert(root.left);
        invert(root.right);
    }
    
    public static void preorder(Tree root){
        if(root==null)
            return;
        
        System.out.println(root.data); 
        
        preorder(root.left);
        preorder(root.right);
        
    }
}