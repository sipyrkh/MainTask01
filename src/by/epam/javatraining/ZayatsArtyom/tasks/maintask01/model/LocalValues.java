package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class LocalValues {
    public static int findLocalMin(int[] v){
        for(int i = 1; i < v.length+ 1; i++){
            if(v[i] < v[i + 1] && v[i] < v[i - 1]){
                return i;
            }
        }
        return -1;
    }
    public static int findLocalMax(int[] v){
        for(int i = 1; i < v.length + 1; i++){
            if(v[i] > v[i + 1] && v[i] > v[i - 1]){
                return i;
            }
        }
        return -1;
    }
}
