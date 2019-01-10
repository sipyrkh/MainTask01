package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

public class SearchElements {
    public static int searchElementLinear(int[] v, int n){
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                return i;
            }
        }
        return 0;
    }
    public static int searchBinary(int[] v, int first, int last,int number){
        int position = -1;
        position = (first + last) / 2;

        while ((v[position] != number) && (first <= last)) {
            if (v[position] > number) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            return position;
        } else {
            return -1;
        }
    }
}
