import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;

public class part1 {
    public static void main(String args []) {
        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(70);
        list2.add(80);
        System.out.println(list2.size());
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        list3.add(150);
        list3.add(200);
        list3.add(3);
        list3.addAll(list2);
        list3.get(2);
        list3.set(0, 110);
        System.out.println(list3);
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println(list3.contains(150));

        // Sorting
        list.add(12);
        list.add(6);
        System.out.println("Printing Entire List : " + list);
        Collections.sort(list);
        System.out.println("Printing Entire List in Ascending Order : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Printing Entire List in Descending Order : " + list);

        //ensureCapacity
        ArrayList<Integer> Marks = new ArrayList<>();
        Marks.ensureCapacity(100);
        System.out.println(Marks.isEmpty());
        
        // LinkedList
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(100);
        list4.add(150);
        list4.add(200);
        list4.add(3);
        list4.addAll(list2);
        list4.get(2);
        list4.set(0, 110);
        System.out.println("Printing Entire Element LinkedList : " + list4);
    }
}
 