package pkg;

import java.io.File;
import java.util.List;

public class Graph {

	private List<Node> head;
	
	public Graph(String filename) {
		loadGraph(filename);
	}
	/*
	 * Determines if graph contains nodes or not
	 */
	public boolean notEmpty() {
		return !head.isEmpty();
	}
	/*
	 * Reads text file containing graph, and loads it into an arraylist of Nodes
	 */
	public void loadGraph(String filename) {
		
		
	}
	/*
	 * Go through graph and find a course with inDegree 0, and return the first node that meets 
	 * this requirement
	 */
	public Node getAvailableCourse() {
		// TODO Auto-generated method stub
		return null;
	}
}
