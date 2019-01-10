package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class SortChecking {
    public static boolean isSortedVectorDESC(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length - 1; j++) {
                return v[i] > v[j];
            }
        }
        return false;
    }
    public static boolean isSortedVectorASC(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length - 1; j++) {
                return v[i] < v[j];
            }
        }
        return false;
    }
}
