package TestArrayandLinkedList;
import java.util.*;

public class TestArrayandLinkedList {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,30);
        arrayList.add(3 , 30);

        //output
        System.out.println("A list of integer in the array list:");
        System.out.println(arrayList);


        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Display the linked list backwards:");
        listIterator = linkedList.listIterator(linkedList.size());

        //loop
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
