import java.util.Random;

public abstract class MyBaseArrayImpl implements  MyArray{
    protected int size ;
    protected int capacity = 8;
    protected  final double loadFactor = 0.75;
    protected  int[] val = new int[capacity];

    public void remove(int index){
        if (index < size && index >=0) {
            for ( int i = index; i < size -1; ++i) {
                val[i] = val[i+1];
            }
            --size;
            this.trimToSize();
        }
    }

    public void print(){

        for(int i=0;i<size;i++){
                System.out.print(val[i] + " ");
        }
        System.out.print( "\n");
    }
    public void trimToSize() {
        System.out.println("Было "+capacity);
        capacity = size;
        int[] arr = new int[capacity];
        for (int i =0;i < size;++i){
            arr[i] = val[i];
        }
        val = arr;

        System.out.println("Стало "+size);
    }



}
