package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class ExtremeValues {
    public static int searchExtremeMin(int[] v){
        int minValue = v[0];
        for(int i = 0; i < v.length; i++){
            if(v[i] < minValue) minValue=v[i];
        }
        return minValue;
    }
    public static int searchExtremeMax(int[] v){
        int maxValue = v[0];
        for(int i = 0; i < v.length; i++){
            if(v[i] > maxValue) maxValue = v[i];
        }
        return maxValue;
    }
}
