import java.util.Scanner;

public class Node{
	int data;
	Node ladd;
	Node radd;

	Node(int data){
		this.data = data;
		ladd = null;
		radd = null;
	}
}

public class Tree{
	Node root = null;

	Node create(Node p, int n){
		if(p == null){
			p = new Node(n);
		}
		else{
			if(n < p.data){
				p.ladd = create(p.ladd, n);
			}
			else if(n > p.data){
				p.radd = create(p.radd, n);
			}
			else{
				System.out.println("Duplicate elements are not allowed: ");
			}
		}
		return p;
	}

	void inorder(Node p){
		if(p != null){
			inorder(p.ladd);
			System.out.print(p.data + "\t");
			inorder(p.radd);
		}
	}

	void preorder(Node p){
		if(p != null){
			System.out.print(p.data + "\t");
			preorder(p.ladd);
			preorder(p.radd);
		}
	}

	void postorder(Node p){
		if(p != null){
			postorder(p.ladd);
			postorder(p.radd);
			System.out.print(p.data + "\t");
		}
	}
}

public class BinaryTree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		Tree t1 = new Tree();
		int ch;

		do{
			System.out.println("\n----------Tree----------");
			System.out.println("1. Create");
			System.out.println("2. Inorder");
			System.out.println("3. Preorder");
			System.out.println("4. Postorder");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch(ch){
			case 1: System.out.println("Enter a value, press 0 to exit: ");
				int n = sc.nextInt();
				while(n != 0){
					t1.root = t1.create(t1.root, n);
					System.out.println("Enter next value: ");
					n = sc.nextInt();
				}
				break;
			case 2: t1.inorder(t1.root); break;
			case 3: t1.preorder(t1.root); break;
			case 4: t1.postorder(t1.root); break;
			case 5: break;
			default: System.out.println("Invalid choice: ");
			}
		}
		while(ch != 5);
		sc.close();
	}
}