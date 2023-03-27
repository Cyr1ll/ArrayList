import java.util.Random;

public class MyOrderedArrayImpl extends  MyBaseArrayImpl{

    public MyOrderedArrayImpl(int volume) {
        //size = volume;
        //capacity = volume;
        Random num = new Random();
        for (int i = 0; i < volume; i++) {
            this.add(num.nextInt(14)+1);
            //size++;
            //val[i] = num.nextInt(14);
        }
    }

    @Override
    public void add(int value) {
        //size++;
        if (capacity-size<2){
            capacity = size+1;
            int[] arr = new int[capacity];
            for (int i =0;i < size;++i){
                arr[i] = val[i];
            }
            val = arr;}

        int j;
        for (j = 0; j < size; j++)
            if( val[j] > value)
                break;
        for (int k = size; k >j ; k--)
            val[k] = val[k-1];
        val[j] = value;
        size++;
        //this.trimToSize();
    }

    @Override
    public int search(int predicate) {
        int low = 0;
        int high = size-1;
        int index =-1;

        while(true){
            index = (low + high) / 2;
            if(val[index]==predicate)
                return index;
            else if (low > high)
                return size;
            else{
                if ( val[index] < predicate)
                    low = index  + 1;
                else
                    high = index - 1;
            }
        }
    }

    @Override
    public int findMax() {
        return val[size-1];
    }

    @Override
    public int findMin() {
        return val[0];
    }

}
