import java.util.Random;

public class Vector {
    public static final int REVERSE_NUMBER = -1;
    public static int[] generateVector(int n){
        Random rand = new Random();
        int myVector[] = new int[n];
        for(int i = 0; i<myVector.length; i++){
            myVector[i] = rand.nextInt(10);
        }
        return myVector;
    }
    public static void searchExtremeValues(int[] v){
        int minValue = v[0];
        int maxValue = minValue;
        for(int i = 0; i < v.length; i++){
            if(v[i] > maxValue) maxValue=v[i];
            if(v[i] < minValue) minValue=v[i];
        }
        Printer.printMaxMinValues("Минимальное и максимальное значения вектора: ", minValue, maxValue);

    }
    public static void ArithmeticAndGeometricMean(int[] v){
        double ArithmeticValue = 0;
        double GeometricValue = 1;
        for(int i = 0; i < v.length; i++){
            ArithmeticValue +=v[i];
            GeometricValue *= v[i];
        }
        ArithmeticValue /=v.length;
        GeometricValue = Math.pow(GeometricValue, 1/v.length);
        Printer.printArithmeticGeometricValues("Среднеарифметическое и среднегеометрическое значения вектора: ",
                ArithmeticValue, GeometricValue);
    }
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
    public static int searchElementLinear(int[] v, int n){
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                return i;
            }
        }
        return 0;
    }
    public static int[] reverseElements(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] *=REVERSE_NUMBER;
        }
        return v;
    }
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
