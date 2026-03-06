package PAKETY_STATIC.testwork2;

public class Cat {

    public static int counter = 0;

    public Cat(){
        counter++;
    }

    private String name;
    private int age;


    public void printSum(){
        System.out.println(1+2);
    }


    public static void printSumStatic(){
        System.out.println(1+2);
    }

}
