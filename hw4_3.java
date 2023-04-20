import java.util.Iterator;
import java.util.LinkedList;

public class hw4_3 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
		linkedList.add(100);
		linkedList.add(41);
		linkedList.add(40);
		linkedList.add(7);
		iterateUsingIterator(linkedList);
	}
	public static void iterateUsingIterator(LinkedList<Integer> linkedList){

		System.out.print("Iterating the LinkedList using Iterator : ");
		Iterator<Integer> it = linkedList.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

	}
}

