package pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {

	private List<Node> head;
	
	public Graph(String filename) {
		head = new ArrayList<>();
		try {
			loadGraph(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public void loadGraph(String filename) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filename));
        while (s.hasNext()) {
        	String line = s.nextLine();
        	String[] info = line.split(" ");
            Node tmp = Node.getInstance(Integer.valueOf(info[0]));
            for(int i = 1;i<info.length;i++) {
            	Node.getInstance(Integer.valueOf(info[i])).addPrereq(tmp);
            }
            head.add(tmp);  
        }
        s.close();

    }
	/*
	 * Go through graph and find a course with inDegree 0, and return the first node that meets 
	 * this requirement
	 */
	public Node getAvailableCourse() {
		// TODO Auto-generated method stub
		
	}
}
