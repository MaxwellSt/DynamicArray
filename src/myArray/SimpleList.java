package myArray;

/**
 * Created by Макс on 19.05.2015.
 */
public interface SimpleList<S> {

    //предназначен для хранения строк

    void add(String s); //добавить строку в массив

    String get(); //получить последний элемент из массива

    String get(int id); //получить элемент по его индексу

    String remove(); //удалить последний элемент

    String remove(int id);  //удалить элемент по индексу

    boolean delete(); //удалить все элементы массива.

}
