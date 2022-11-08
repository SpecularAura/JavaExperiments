import java.util.*;  
class TestVector 
{  
    public static void main(String args[]) 
    {
        Vector<Integer> vec = new Vector<Integer>();
        System.out.println("\tCapacity of vec: " + vec.capacity());
        System.out.println("\tSize of vec: " + vec.size());
        vec.trimToSize();
        System.out.println("After trimToSize(): ");
        System.out.println("\tCapacity of vec: " + vec.capacity());
        System.out.println("\tSize of vec: " + vec.size());
        for(int i = 1; i <= 10; i++)
        {
            vec.add(i);
        }
        System.out.println("After Adding Elements: ");
        System.out.println("\tCapacity of vec: " + vec.capacity());
        System.out.println("\tSize of vec: " + vec.size());
        System.out.println(vec);
        vec.ensureCapacity(30);
        System.out.println("After ensureCapacity(30): ");
        System.out.println("\tCapacity of vec: " + vec.capacity());
        System.out.println("\tSize of vec: " + vec.size());
        vec.setSize(15);
        System.out.println("After setSize(15): ");
        System.out.println("\tCapacity of vec: " + vec.capacity());
        System.out.println("\tSize of vec: " + vec.size());
        for(int i = 0; i <= 9; i++)
        {
            vec.set(i, 10 + (i % 2));
        }
        System.out.println("Setting all elemnts in the Vector to a different value: ");
        for(int i = 0; i <= 14; i++)
        {
            System.out.print(vec.elementAt(i) + " ");
        }
        System.out.printf("\n");
        System.out.println("First Element of the Vector: " + vec.firstElement());
        System.out.println("Index of first occurence of 11: "+ vec.indexOf(11));
        System.out.println("Index of first occurence of 11 after index 4: "+vec.indexOf(11, 4));
        System.out.println("Last Element of the Vector: " + vec.lastElement());
        System.out.println("Index of last occurence of 11: "+ vec.lastIndexOf(11));
        System.out.println("Index of last occurence of 11 before index 8: "+ vec.lastIndexOf(11, 8));
        System.out.println("Initially: " + vec);
        vec.removeElement(null);
        System.out.println("Vector after removing a null element\n" + vec);
        Vector<Integer> vec1 = new Vector<Integer>();
        vec1.add(null);
        vec.removeAll(vec1);
        System.out.println("Vector after removing all null elements\n" + vec);
        vec.insertElementAt(11, 5);
        System.out.println("Vector after inserting 11 at index 5 elements\n" + vec);
        vec.clear();
        System.out.println("Vector after vec.clear()\n" + vec);
        System.out.println("The Vector is Empty: " + vec.isEmpty());
        System.out.println("The Vector contains 11: " + vec.contains(11));
    }
}