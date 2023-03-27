public interface MyArray {
    void add(int value);//+ добавить элемент
    void remove(int index);//+  убрать по индексу
    int search(int predicate);//+   найти по значению                    + - выполнено
    int findMax();//+  найти макс
    int findMin();//+   найти мин

    //void insertFirst(int value);//вставить первым    (есть в неотсорт массиве)
    void print();//+
    void trimToSize();//+

}
