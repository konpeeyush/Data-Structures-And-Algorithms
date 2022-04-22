package Tree.Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left ;
    public BinaryTreeNode<T> right ;

    public BinaryTreeNode(T data) {
        this.data=data ;
    }

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData ;
        System.out.println("Enter root data:");
        rootData=sc.nextInt() ;
        if(rootData==-1) return null ;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData) ;
        root.left=takeInput(sc) ;
        root.right=takeInput(sc) ;
        return root ;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root==null)
            return;
        String s=root.data+"" ;
        if(root.left!=null) s+="L:"+root.left.data+"," ;
        if(root.right!=null) s+="R:"+root.right.data ;
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        int rootData ;
        Scanner sc=new Scanner(System.in) ;
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>() ;
        System.out.println("Enter root data");
        rootData=sc.nextInt() ;
        if(rootData==-1) return null;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData) ;
        pendingNodes.add(root) ;
        while(!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> frontNode=pendingNodes.remove() ;
            System.out.println("Enter left child of "+frontNode.data);
            int leftChild=sc.nextInt() ;
            if(leftChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(leftChild) ;
                pendingNodes.add(child) ;
                frontNode.left=child ;
            }

            System.out.println("Enter right child of "+frontNode.data);
            int rightChild=sc.nextInt() ;
            if(rightChild!=-1){
                BinaryTreeNode<Integer> child=new BinaryTreeNode<>(rightChild) ;
                pendingNodes.add(child) ;
                frontNode.right=child ;
            }


        }
        return root ;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        pendingNodes.add(root) ;
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNodes.remove() ;
            System.out.print(front.data+"");
            if(front.left.data!=-1)
            {
                System.out.print("L:"+front.left.data+",");
                if(front.left!=null) pendingNodes.add(front.left) ;

            }
            if(front.right.data!=-1)
            {
                System.out.print("R:"+front.right.data);
                if(front.right!=null) pendingNodes.add(front.right) ;
            }
            System.out.println();
        }
    }

    public static int count(BinaryTreeNode<Integer> root){
        if(root==null) return 0 ;

        int ans=1;
        ans+=count(root.left) ;
        ans+=count(root.right) ;
        return ans ;
    }

    public static  boolean isPresent(BinaryTreeNode<Integer> root,int x){
        if(root==null) return false ;
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>() ;
        queue.add(root) ;
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front=queue.remove() ;
            if(front.left.data==x){
                return true ;
            }
            else if(front.right.data==x){
                return true ;
            }

        }
        return false ;
    }

//    5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//2
    public static int height(BinaryTreeNode<Integer> root){
        int height=0 ;
        if(root==null) return 0 ;
        int leftHeight=height(root.left) ;
        int rightHeight=height(root.right) ;
        return 1+Math.max(leftHeight,rightHeight) ;

    }

    public static void mirror(BinaryTreeNode<Integer> root){
        if(root==null) return;
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> temp=root.left ;
        root.left=root.right ;
        root.right=temp ;
    }

    public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null) return 0 ;
        int option1=height(root.left)+height(root.right) ;
        int option2=diameter(root.left) ;
        int option3=diameter(root.right) ;
        return Math.max(option1,Math.max(option2,option3)) ;
    }

    public Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Integer,Integer> output=new Pair<>() ;
            output.first=0 ;
            output.second=0 ;
            return output ;
        }
        Pair<Integer,Integer> lo=heightDiameter(root.left) ;
        Pair<Integer,Integer> ro=heightDiameter(root.right) ;

        int height=1+Math.max(lo.first,ro.first) ;
        int option1=lo.first+ro.first ;
        int option2=lo.second ;
        int option3=ro.second ;

        int diameter=Math.max(option1,Math.max(option2,option3)) ;

        Pair<Integer,Integer> output=new Pair<>() ;
        output.first=height ;
        output.second=diameter ;
        return output ;
    }

    public static void inorder(BinaryTreeNode<Integer> root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preorder(BinaryTreeNode<Integer> root){
        if(root==null) return;

        System.out.print(root.data+"");

        preorder(root.left);

        preorder(root.right);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here

        return helper(postOrder,inOrder,0,inOrder.length-1,0,postOrder.length-1) ;
    }

    public static BinaryTreeNode<Integer> helper(int[] postOrder,int[] inOrder, int inStart,int inEnd,int postStart, int postEnd){
        if(inStart>inEnd) return null ;

        int rootData=postOrder[postEnd];

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData) ;

        int index=-1;

        for(int i=0;i<inOrder.length;i++){
            if(inOrder[i]==rootData)
            {
                index=i ;
                break ;
            }
        }

        if(index==-1) return null ;

        int leftInStart=inStart ;
        int leftInEnd=index-1 ;

        int rightInStart=index+1 ;
        int rightInEnd=inEnd ;

        int leftPostStart=postStart ;
        int leftPostEnd=leftPostStart+leftInStart-leftInEnd ;

        int rightPostStart=leftPostEnd+1 ;
        int rightPostEnd=postEnd-1 ;

        root.left=helper(postOrder,inOrder,leftInStart,leftInEnd,leftPostStart,leftPostEnd) ;
        root.right=helper(postOrder,inOrder,rightInStart,rightInEnd,rightPostStart,rightPostEnd) ;

        return root ;
    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null) return false ;

        int leftMax=maximum(root.left) ;
        int rightMin=minimum(root.right);
        if(root.data<leftMax) return false ;
        if(root.data>rightMin) return false ;

        boolean isLeft=isBST(root.left) ;
        boolean isRight=isBST(root.right) ;

        if(isLeft && isRight){
            return true;
        }
        return false ;
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null) return Integer.MIN_VALUE ;

        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right))) ;
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null) return Integer.MAX_VALUE ;

        return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right))) ;
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(10) ;
//        BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(20) ;
//        BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(30) ;
//        root.left=node1 ;
//        root.right=node2 ;
//        Scanner sc=new Scanner(System.in) ;
////        BinaryTreeNode<Integer> root=takeInput(sc) ;
//        BinaryTreeNode<Integer> root=takeInputLevelWise() ;
//        print(root);
//        printLevelWise(root);
//        System.out.println("Count: "+count(root)) ;
//        System.out.println("isPresent: "+isPresent(root,10));
//        mirror(root);
//        diameter(root) ;

        int[] postOrder={4, 5, 2, 6, 7, 3, 1 } ;
        int[] inOrder={4, 2, 5, 1, 6, 3, 7 } ;

        buildTree(postOrder,inOrder) ;

    }
}
