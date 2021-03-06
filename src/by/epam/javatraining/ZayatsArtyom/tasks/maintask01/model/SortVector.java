package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class SortVector {
    public static void swap(int[] v, int i){
        int temp = v[i-1];
        v[i-1] = v[i];
        v[i] = temp;
    }
    public static int[] bubbleSort(int[] v){
        for(int i = 1; i < v.length; i++){
            for(int j = v.length - 1; j >= i; j--){
                if(v[j-1] > v[j]) swap(v,j);
            }
        }
        return v;
    }
    public static int[] insertionSort(int[] v){
        int temp, j;
        for(int i = 0; i < v.length - 1; i++){
            if (v[i] > v[i + 1]) {
                temp = v[i + 1];
                v[i + 1] = v[i];
                j = i;
                while (j > 0 && temp < v[j - 1]) {
                    v[j] = v[j - 1];
                    j--;
                }
                v[j] = temp;
            }
        }
        return v;
    }
    public static void quickSort(int[] v, int l, int h) {
        if (v.length == 0)
            return;
        if (l >= h)
            return;
        int middle = l + (h - l) / 2;
        int opora = v[middle];
        int i = l, j = h;
        while (i <= j) {
            while (v[i] < opora) {
                i++;
            }
            while (v[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j)
            quickSort(v, l, j);
        if (h > i)
            quickSort(v, i, h);
    }
}
