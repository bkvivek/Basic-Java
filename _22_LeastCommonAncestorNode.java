package programs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}

public class _22_LeastCommonAncestorNode {


	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	int findLCA(int n1, int n2) {
		path1.clear();
		path2.clear();
		return findLCAInternal(root, n1, n2);
	}

	private int findLCAInternal(Node root, int n1, int n2) {

		if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
			System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
			System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
			return -1;
		}

		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}

		return path1.get(i-1);
	}

	private boolean findPath(Node root, int n, List<Integer> path)
	{
		if (root == null) {
			return false;
		}

		path.add(root.data);

		if (root.data == n) {
			return true;
		}

		if (root.left != null && findPath(root.left, n, path)) {
			return true;
		}

		if (root.right != null && findPath(root.right, n, path)) {
			return true;
		}

		path.remove(path.size()-1);

		return false;
	}

	public static void main(String[] args)
	{
		_22_LeastCommonAncestorNode tree = new _22_LeastCommonAncestorNode();
		tree.root = new Node(30);
		tree.root.left = new Node(8);
		tree.root.right = new Node(52);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(20);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(29);        
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		String[] split = s.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);       
		System.out.println(tree.findLCA(a,b));
	}
}
/*Programming Challenge Description:
				Write a program to determine the lowest common ancestor of two nodes in the following binary search tree, 
				which you may hard code in your program:
				              30
				              |
				            --+--
				            |   |
				            8   52
				            |
				          --+--
				          |   |
				          3   20
				              |
				            --+--
				            |   |
				           10   29

				Input:
				Your program should read one line of text from standard input. The line will contain two integers, 
				separated by a space, which represent two nodes within the pictured binary search tree.

				Output:
				Print to standard output the least common ancestor of the two nodes.

				Test 1
				Test Input Download Test Input8 52
				Expected Output Download Test Output30
				Test 2
				Test Input Download Test Input3 29
				Expected Output Download Test Output8*/




