package pkg;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
	static final String filename = "";
	/*
	 * Code for topological sort algorithm to schedule courses in optimal time
	 */
	private static int topSort(Graph g) {
		int semesters = 0;
		Queue<Node> A = new LinkedList<>();
		Queue<Node> B = new LinkedList<>();
		while(g.notEmpty()) {
			semesters++;
			Node n = g.getAvailableCourse();
			while(n!=null) {
				A.add(n);
			}
		}
		
		return semesters;
	}
	public static void main(String[] args) {
		Graph g = new Graph(filename);
		
	}
}
