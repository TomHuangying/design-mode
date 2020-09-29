package com.company;

public class Main {
    public final int R = 0;
    public final int B = 1;

    private Node root=null; //红黑树的跟节点

    class Node{
        int data;  //具体的数字
        int color = R;
        Node left;
        Node right;
        Node parent;
        public Node(int data){
            this.data = data;
        }
    }

    public void insert(Node root ,int data){//root一定不为空
//        判断大小
        if(root.data<data){//插入到右边
            if(root.right == null){
                root.right = new Node(data);
            }else{
                insert(root.right,data);//不是空就递归进行插入
            }
        }else{
            if(root.left == null){
                root.left = new Node(data);
            }else{
                insert(root.left,data);
            }
        }
    }

   public void leftRotate(Node node){
        if(node.parent == null){ //表示的是跟节点
            Node E = root;
            Node S = E.right;
//            移S的左子树
            E.right = S.left;
            S.left.parent = E;
//            修改E的指针
            E.parent = S;
//            修改S指针
            S.parent = null;
        }
   }
}
