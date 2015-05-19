package main;

import myArray.DynamicStringList;

import java.util.ArrayList;

/**
 * Created by Макс on 19.05.2015.
 */
public class TestMain {

    public static void main(String[] args) {

        DynamicStringList<String> dynamicStringList = new DynamicStringList<String>();
        dynamicStringList.add("1");
        dynamicStringList.add("2");
        dynamicStringList.add("3");
        dynamicStringList.add("4");
        dynamicStringList.add("5");
        dynamicStringList.add("6");

        System.out.println("dynamicStringList.get() >>> " + dynamicStringList.get());
        System.out.println("dynamicStringList.get(2) >>> " + dynamicStringList.get(2));

        System.out.println("dynamicStringList.remove() >>> " + dynamicStringList.remove());
        System.out.println("dynamicStringList.remove(2) >>> " + dynamicStringList.remove(2));

        System.out.println(dynamicStringList.toString());

        System.out.println("dynamicStringList.size() >>> " + dynamicStringList.size());
        System.out.println("dynamicStringList.delete() >>> " + dynamicStringList.delete());
        System.out.println("dynamicStringList.size() >>> " + dynamicStringList.size());

    }
}
