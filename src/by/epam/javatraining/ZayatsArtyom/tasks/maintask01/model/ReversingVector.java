package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class ReversingVector {

    public static final int REVERSE_NUMBER = -1;

    public static int[] reverseElements(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] *=REVERSE_NUMBER;
        }
        return v;
    }
}
