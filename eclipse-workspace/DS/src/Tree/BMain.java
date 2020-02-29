package Tree;

public class BMain {
	
	public static void main(String[] args) {
		BTree bt = new BTree();
		
		bt.insert(15);
		bt.insert(9);
		bt.insert(30);
		bt.insert(4);
		bt.insert(10);
		bt.insert(35);
		//bt.insert(40);
	//	System.out.println("Test"+bt.root.left.data);
		bt.inorder(bt.root);
		System.out.println(" ");
		bt.postorder(bt.root);
		System.out.println(" ");
		bt.preorder(bt.root);
		
		
		bt.bfprint();
	}

}
