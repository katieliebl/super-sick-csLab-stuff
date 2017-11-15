package lab12BST;

import java.util.Scanner;

public class ReadAndPrint {
	
	Scanner scan = new Scanner(System.in);
	Scanner which = new Scanner(System.in);
	public String currStudent = "";
	static BinarySearchTree<StudentGPA> BST = new BinarySearchTree<StudentGPA>();
	static TreeIterator<StudentGPA> T = new TreeIterator<StudentGPA>(BST, 0);
	
	public void makeTree() {
		while(scan.hasNext()) {
			currStudent = which.nextLine();
			if((currStudent.charAt(12)=='O')||(currStudent.charAt(12)=='B')) {
				GraduateStudentGPA g = new GraduateStudentGPA(scan.nextInt(), scan.next(), scan.nextDouble());
				TreeNode<StudentGPA> currS = new TreeNode<StudentGPA>(g);
				BST.insert(g);
			}
			else {
				StudentGPA s = new StudentGPA(scan.nextInt(), scan.next(), scan.nextDouble());
				TreeNode<StudentGPA> currS = new TreeNode<StudentGPA>(s);
				BST.insert(s);
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("root: " + BST.root);
		
		while(T.hasNext()) {
			T.printInorder();
		}
		
	}

}
