package projetCours;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Main {
	public static void main(String args[]){

		LinkedList<Cat> group = new LinkedList<Cat>();
		Stack<Cat> group1 = new Stack<Cat>();
		
		Cat c1 = new Cat("Toudoux");
		Cat c2 = new Cat("Popy");
		Cat c3 = new Cat("Maki");
		
		group.add(c1);
		group.add(c2);
		group.add(c3);
		
		group1.push(c1);
		group1.push(c2);
		group1.push(c3);

		
		ListIterator<Cat> lit = group.listIterator();
		for(Cat c: group) {
			c.meow();
		}
		System.out.println(group.isEmpty());
		
		while(lit.hasNext()) {
			lit.next().meow();
		}
		group1.peek().meow();
				
		}
}
