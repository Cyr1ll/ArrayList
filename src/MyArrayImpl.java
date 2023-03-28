import java.util.Random;
public class MyArrayImpl extends  MyBaseArrayImpl {

    public MyArrayImpl(int volume) {
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

        if (capacity-size<2){
            capacity = size+1;
            int[] arr = new int[capacity];
            for (int i =0;i < size;++i){
                arr[i] = val[i];
            }
            val = arr;}


        val[size] =value;
        size++;
    }

    @Override
    public int search(int predicate) {
        for(int i = 0;i < size; i++){
            if( val[i]==predicate){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findMax() {
        int max = val[0];
        for(int i=0;i<size;i++){
            if (val[i]>max){
                max=val[i];
            }
        }
        return max;
    }

    @Override
    public int findMin() {
        int min = val[0];
        for(int i=0;i<size;i++){
            if (val[i]<min){
                min=val[i];
            }
        }
        return min;
    }

    public void insertFirst(int value) {
        if (capacity-size<2){
            capacity = size+1;
            int[] arr = new int[capacity];
            for (int i =0;i < size;++i){
                arr[i] = val[i];
            }
            val = arr;}

        for (int i = size; i >= 1; i--) { //возможно ошибка по индексам?
            val[i]=val[i-1];
        }
        val[0]=value;
        size++;
    }
    public void BubbleSort(){
        for (int i = 0; i < val.length -1; i++) {
            for(int j = 0; j < val.length - i - 1; j++) {
                if(val[j + 1] < val[j] && (val[j + 1]> 0 && val[j]> 0) ) {
                    int swap = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = swap;
                }
            }
        }

    }
    public void SelectionSort() {
        //System.out.println("Отсортировано с помощью \"Прямого выбора\" ");
        for (int i = 0; i < val.length; i++) {
            int pos = i;
            int min = val[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < val.length; j++) {
                if (val[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = val[j];
                }
            }
            val[pos] = val[i];
            //меняем местами наименьший с sortArr[i]
            val[i] = min;
        }
    }


    private static void quickSort(int[] arr, int from,int to){
        if (from < to) {
            int divideIndex = partition(arr,from,to);

            quickSort(arr,from,divideIndex-1);

            quickSort(arr,divideIndex,to);
        }
    }
    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while(leftIndex <= rightIndex){
            while(arr[leftIndex] < pivot){
                leftIndex++;
            }
            while(arr[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex<=rightIndex){
                swap(arr,rightIndex,leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] array, int index1,int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2]= tmp;
    }
    public void QuickSort() {
        quickSort(val,0,val.length -1);
    }










}

