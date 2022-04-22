package Tree.Generic_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
    public T data ;
    public ArrayList<TreeNode<T>> children ;

    public TreeNode(T data){
        this.data=data ;
        children=new ArrayList<>() ;
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter root data");
        int rootData=sc.nextInt() ;
        Queue<TreeNode<Integer>>  pendingNodes=new LinkedList<>() ;
        TreeNode<Integer> root=new TreeNode<>(rootData) ;
        pendingNodes.add(root) ;
        while(!pendingNodes.isEmpty()){
            try {
                TreeNode<Integer> frontNode = pendingNodes.remove();
                System.out.println("Enter number of children of " + frontNode.data);
                int numChildren = sc.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.add(childNode);
                }
            } catch(Exception e){
                    return null ;
                }
        }
        return root ;
    }
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n ;
//        Scanner sc=new Scanner(System.in);
        System.out.println("Enter next node data");
        n=sc.nextInt() ;
        TreeNode<Integer> root=new TreeNode<>(n) ;
        System.out.println("Enter number of children for "+n);
        int childCount=sc.nextInt() ;
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child=takeInput(sc) ;
            root.children.add(child) ;
        }
        return root ;
    }

    public static void print(TreeNode<Integer> root){
        String s= root.data+":" ;
        for (int i = 0; i < root.children.size(); i++) {
            s=s+root.children.get(i).data+"," ;
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static  void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> parent=new LinkedList<>() ;
        parent.add(root) ;
        Queue<TreeNode<Integer>> child=new LinkedList<>() ;
        while(parent.size()>0){
            root=parent.remove() ;
            System.out.print(root.data+" ");
            for (TreeNode<Integer> childVal:
                    root.children) {
                child.add(childVal) ;
            }
            if(parent.size()==0){
                parent=child ;
                child=new LinkedList<>() ;
                System.out.println();
            }
        }
    }

    public static int counter(TreeNode<Integer> root){
        if(root==null)
            return 0 ;
        int count=1 ;
        for (int i=0;i<root.children.size();i++){
            count+=counter(root.children.get(i)) ;
        }
        return count ;
    }

    public static int sum(TreeNode<Integer> root, int data){
        if(root==null) return 0 ;
        int sum=root.data ;
        for (int i = 0; i < root.children.size(); i++) {
            sum+=sum(root.children.get(i),root.children.get(i).data) ;
        }
        return sum ;
    }

    public static  int largestNode(TreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE ;
        }
        int ans=root.data ;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest=largestNode(root.children.get(i)) ;
            if(childLargest>ans) {
                ans = childLargest;
            }
        }
        return ans ;
    }

    public static int greater(TreeNode<Integer> root, int x){
        if(root==null) return 0 ;
        int count=0 ;
        if(root.data>x) count++ ;
        for (int i = 0; i < root.children.size(); i++) {
            count+=greater(root.children.get(i),x) ;
        }
        return count ;
    }

    public static int height(TreeNode<Integer> root){
        int height=0 ;
        Queue<TreeNode<Integer>> parentNode=new LinkedList<>() ;
        parentNode.add(root) ;
        Queue<TreeNode<Integer>> childNode=new LinkedList<>() ;
        while(parentNode.size()>0){
            root=parentNode.remove() ;
            for (TreeNode<Integer> child:
                 root.children) {
                childNode.add(child) ;

            }
            if(parentNode.size()==0)
            {
                parentNode=childNode ;
                childNode=new LinkedList<>() ;
                height++ ;
            }
        }
        return height ;
    }

    public static void  depth(TreeNode<Integer> root, int k){
        if(k<0)
            return;
        if(k==0)
        {
            System.out.println(root.data);
            return;
        }

        for (int i = 0; i < root.children.size(); i++) {
            depth(root.children.get(i),k-1);
        }

    }

    public static int countLeaf(TreeNode<Integer> root){
        if(root==null) return 0;
        if(root.children.size()==0) return 1 ;
        int count=0 ;
        for (int i = 0; i < root.children.size(); i++) {
            count+=countLeaf(root.children.get(i));
        }
        return count ;
    }

    public static void preOrder(TreeNode<Integer> root){
        if(root==null) return;
        System.out.print(root.data+" ");
        for (int i = 0; i < root.children.size(); i++) {
            preOrder(root.children.get(i));
        }

    }

    public static void postOrder(TreeNode<Integer> root){
        if(root==null) return;

        for (int i = 0; i < root.children.size(); i++) {
            postOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // Write your code here
        if(root==null) return false ;

        boolean ans;

        if(root.data==x)
            return true ;

        for(int i=0;i<root.children.size();i++){
            if(checkIfContainsX(root.children.get(i),x)){
                return true ;
            }
        }
        return false ;
    }


        public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here
        if(root==null) return null ;
        int rootSum=max(root) ;
        TreeNode<Integer> max=root ;
        TreeNode<Integer> child ;
        int childSum ;
        for(int i=0;i<root.children.size();i++){
            child=maxSumNode(root.children.get(i)) ;
            childSum=max(root.children.get(i)) ;
            if(childSum>rootSum)
                max=child ;
        }
        return max ;
    }

        public static int max(TreeNode<Integer> root){
        int maxSum=root.data ;
        for(int i=0;i<root.children.size();i++){
            maxSum+=root.children.get(i).data ;
        }
        return maxSum ;
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here

        if(root==null) return null ;
        int rootData=Integer.MIN_VALUE ;
        TreeNode<Integer> ansNode=null ;
        if(root.data>n){
            rootData=root.data ;
            ansNode=root ;
        }

        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> childNode=findNextLargerNode(root.children.get(i),n) ;
            if(childNode!=null  )
            {
                int childData=childNode.data;
                if(childData>n && (childData<rootData || rootData==Integer.MIN_VALUE)){
                    ansNode=childNode;
                    rootData=childData;
                }
            }
        }
        return ansNode ;
    }



    public static void main(String[] args) {
//        Tree_using_LL<Integer> root=new Tree_using_LL<>(4) ;
//        Tree_using_LL<Integer> node1=new Tree_using_LL<>(2) ;
//        Tree_using_LL<Integer> node2=new Tree_using_LL<>(3) ;
//        Tree_using_LL<Integer> node3=new Tree_using_LL<>(5) ;
//        Tree_using_LL<Integer> node4=new Tree_using_LL<>(6) ;
//        root.children.add(node1) ;
//        root.children.add(node2) ;
//        root.children.add(node3) ;
//        root.children.add(node4) ;
//        System.out.println(root);
//        Scanner sc=new Scanner(System.in);
//        Tree_Node<Integer> root=takeInput(sc) ;
        TreeNode<Integer> root=takeInputLevelWise() ;
//        print(root);
        printLevelWise(root);
//        System.out.println("Number of nodes: "+counter(root));
//        System.out.println("Sum: "+sum(root,root.data));
//        System.out.println("Largest Node: "+largestNode(root)) ;
//        System.out.println("Greater " +greater(root,2));
//        System.out.println("Height of the tree is: "+height(root));
//        System.out.println("Depth of tree with k: ") ;
//        depth(root,2);
//        System.out.println("Number of Leaf Nodes in Tree "+countLeaf(root));
//        System.out.println("Pre-Order Traversal: ");
//        preOrder(root);
//        System.out.println();
//        System.out.println("Post-Order Traversal: ");
//        postOrder(root);
//        System.out.println("Max sum node: "+maxSumNode(root));
        System.out.println("Next Larger Node: "+findNextLargerNode(root,10));

    }
}
