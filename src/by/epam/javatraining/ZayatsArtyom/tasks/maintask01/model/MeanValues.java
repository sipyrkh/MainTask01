package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class MeanValues {
    public static double arithmeticMean(int[] v){
        double ArithmeticValue = 0;
        for(int i = 0; i < v.length; i++){
            ArithmeticValue +=v[i];
        }
        return ArithmeticValue/v.length;
    }
    public static double geometricMean(int[] v){
        double GeometricValue = 1;
        for(int i = 0; i < v.length; i++){
            GeometricValue *= v[i];
        }
        return Math.pow(GeometricValue, 1.0/v.length);
    }
}
