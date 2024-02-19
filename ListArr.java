import java.util.*;

public class ListArr {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Peter");
        al.add("John");
        al.add("Billy");

        ArrayList<String> al2 = new ArrayList<String>();

       // al2.add("Peter");
        al2.add("Jack");
       al2.add("John");
		
		
		   // Add all elements from al2 to al
       // al.addAll(al2);

        // Remove all elements in al that are present in al2
        //al.removeAll(al2);

        // Retain only "John" and "Jack" in al
	   al.retainAll(al2);
		

        System.out.println("setelah di lakukan iterasi maka hanya sisa...");
		System.out.println("=============================================");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
