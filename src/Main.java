import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MyArrayImpl h = new MyArrayImpl(10);

        //h.MyArrayImpl(10);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(8);
        h.add(2);
        h.add(6);
        h.add(5);
        h.add(5);
        h.add(5);
        h.add(5);
        h.insertFirst(4);
        //h.remove(0);
        h.print();

        h.Quicksort();
        //h.selectionsort();
        //h.bubbleSort();
        h.print();

        MyOrderedArrayImpl b = new MyOrderedArrayImpl(5);
        b.add(6);
        b.add(6);
        b.add(7);
        b.add(7);
        b.add(5);
        b.add(6);
        b.add(5);
        b.add(5);
        b.add(5);
        b.print();




    }
}