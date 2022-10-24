package pkg;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
	static final String filename = "cscourses.txt";
	/*
	 * Code for topological sort algorithm to schedule courses in optimal time
	 */
	private static int topSort(Graph g) {
		int semesters = 0;
		Queue<Node> A = new LinkedList<>();
		while(g.notEmpty()) {
			semesters++;
			Node n = g.getAvailableCourse();
			while(n!=null) {
				A.add(n);
				n = g.getAvailableCourse();
			}
			System.out.println("Semester " + semesters+ ": "+ A);
			while(!A.isEmpty()) {
				A.poll().takeClass();
			}
		}
		
		return semesters;
	}
	public static void main(String[] args) {
		Graph g = new Graph(filename);
		/*Graph g = new Graph();*/
		System.out.println(topSort(g));
	}
}
