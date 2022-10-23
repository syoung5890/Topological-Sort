package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
	private int classNum;
	private int inDegree;
	private List<Node> prereqTo;
	private static Map<Integer,Node> instances = new HashMap<>();
	
	/*
	 * Use getInstance node to get instance of Node n , not this constructor
	 */
	private Node(int classNum) {
		this.classNum = classNum;
		prereqTo= new ArrayList<>();
	}
	
	private void incInDegree() {
		inDegree++;
	}
	
	public void addPrereq(Node n) {
		prereqTo.add(n);
		n.incInDegree();
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public static Node getInstance(int num) {
		if(instances.getOrDefault(num, null) == null) instances.put(num, new Node(num));
		return instances.get(num);
	}
}
