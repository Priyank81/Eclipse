package Tree;
import java.util.*;


public class BTree {
	Node root = null;
	Node temp= root;

	void insert(int data) {
		root = insertRec(root, data);
	}
	Node insertRec(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left =  insertRec(root.left, data);
		}else if(data>root.data) {
			root.right = insertRec(root.right,data);
		}
		return root;
	}
	
	
	void inorder(Node root) {
		if(root== null) {
			return;
		}
		inorder(root.left);
		System.out.println("Node data = "+root.data);
		inorder(root.right);
	}
	
	void preorder(Node root) {
		if(root== null) {
			return;
		}
		System.out.println("Node data = "+root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	void postorder(Node root) {
		if(root== null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println("Node data = "+root.data);
	}
	
	void bfprint() {
		Queue<Node> q = new LinkedList<Node>();
		temp=root;
		q.add(temp);
		
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
			System.out.println(n.data); 			
		}
		
	}
	
}
