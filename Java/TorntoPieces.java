// Kattis id: torn2pieces

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TorntoPieces {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int n = inp.nextInt();
		inp.nextLine();
		
		
		
		HashMap<String, ArrayList<String>> tree = new HashMap<String, ArrayList<String>>();
		
		for(int i = 0; i < n ; i++){
			String[] arr= inp.nextLine().split(" ");
			ArrayList<String> input = new ArrayList<String>();
			
			int x = 1;
			while(x < arr.length){
				input.add(arr[x]);
				if(!tree.containsKey(arr[x])){
					tree.put(arr[x], new ArrayList<String>());
				}
				if(!tree.get(arr[x]).contains(arr[0]))
					tree.get(arr[x]).add(arr[0]);
				x++;
			}
			
			tree.put(arr[0], input);
		}
		
		String root = inp.next();
		String dest = inp.next();
		
		Queue<String> q = new LinkedList<String>();
		
		// keeps track of visited nodes
		HashMap<String, String> visited = new HashMap<String, String>();
		
		// 
		Stack<String> s = new Stack<String>();
		
		// add visited node to queue
		q.add(root);
		// mark as visited
		visited.put(root, "-1");
		
		// while current level has not been completed
		while(!q.isEmpty()){
			// B F S
			String key = q.poll();
			
			
			if(dest.equals(key)){
				s.push(key);
				while(!visited.get(key).equals("-1")){
					key = visited.get(key);
					s.push(key);
					
				}
				
				
				while(!s.isEmpty()){
					System.out.print(s.pop() + " ");
				}
				
				System.out.println();
				
				return;
				
			}
			ArrayList<String> neighbours = tree.get(key);
			if(neighbours == null){
				continue;
			}
			for(int y = 0; y < neighbours.size(); y++){
				
				if(!visited.containsKey(neighbours.get(y))){
					q.add(neighbours.get(y));
					visited.put(neighbours.get(y), key);
				}
				
				
			}
			
			
		}
		
		System.out.println("no route found");
	}

}
