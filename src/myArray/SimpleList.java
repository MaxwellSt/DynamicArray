package myArray;

/**
 * Created by ���� on 19.05.2015.
 */
public interface SimpleList<S> {

    //������������ ��� �������� �����

    void add(String s); //�������� ������ � ������

    String get(); //�������� ��������� ������� �� �������

    String get(int id); //�������� ������� �� ��� �������

    String remove(); //������� ��������� �������

    String remove(int id);  //������� ������� �� �������

    boolean delete(); //������� ��� �������� �������.

}
