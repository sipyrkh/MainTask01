import java.util.Arrays;

public class MainTask_01 {
    public static void main(String[] args) {
        Printer.print("Введите размерность вектора N:");
        int n = UserInput.inputDataInt();
        int myVector[] = Vector.generateVector(n);
        Printer.print("Массив:" + Arrays.toString(myVector));
        Vector.searchExtremeValues(myVector);
        Vector.ArithmeticAndGeometricMean(myVector);
        if(Vector.isSortedVectorASC(myVector) | Vector.isSortedVectorDESC(myVector)){
            Printer.print("Массив отсортирован");
        }else {
            Printer.print("Массив не отсортирован");
        }
        int localMin = Vector.findLocalMin(myVector);
        int localMax = Vector.findLocalMax(myVector);
        if(localMin != -1){
            Printer.printLocalMinAndMAx("Найден индекс первого локального минимума: ", localMin);
        }
        else if(localMax != -1) {
            Printer.printLocalMinAndMAx("Найден индекс первого локального максимума: ", localMax);
        }else{
            Printer.print("Локальный минимум(максимум) не был найден");
        }
        Printer.print("Введите число для поиска его в массиве: ");
        int searchElement = UserInput.inputDataInt();
        int indexSerchedElement = Vector.searchElementLinear(myVector, searchElement);
        if(indexSerchedElement != 0){
            Printer.printLocalMinAndMAx("Найденный элемент находится на позиции: ", indexSerchedElement);
        }else{
            Printer.print("Не было найдено элементов");
        }
        Printer.print("Массив с реверсированными элементами: " + Arrays.toString(Vector.reverseElements(myVector)));
        Printer.print("Сортировка пузырьком: " + Arrays.toString(Vector.bubbleSort(myVector)));
        Printer.print("Сортировка вставками: " + Arrays.toString(Vector.insertionSort(myVector)));
        Vector.quickSort(myVector, 0, myVector.length-1);
        Printer.print("Сортировка быстрая: " + Arrays.toString(myVector));
    }
}
