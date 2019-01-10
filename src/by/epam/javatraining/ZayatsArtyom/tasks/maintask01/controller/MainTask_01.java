package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.controller;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.*;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.view.Printer;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class MainTask_01 {
    static Logger log = Logger.getLogger(MainTask_01.class);
    public static void main(String[] args) {
        log.info("Программа успешно запустилась");
        Printer.print("Введите размерность вектора N:");
        int n = UserInput.inputDataInt();
        int myVector[] = Vector.generateVector(n);
        Printer.print("Массив:" + Arrays.toString(myVector));
        log.info("Сгенерированный массив " + Arrays.toString(myVector));

        Printer.printMaxMinValues("Минимальный элемент массива: ", ExtremeValues.searchExtremeMin(myVector));
        Printer.printMaxMinValues("Максимальный элемент массива: ", ExtremeValues.searchExtremeMax(myVector));
        log.info("Минимальный элемент массива: " + ExtremeValues.searchExtremeMin(myVector));
        log.info("Максимальный элемент массива: " + ExtremeValues.searchExtremeMax(myVector));

        Printer.printArithmeticGeometricValues("Среднеарифметическое значение всех элементов: ",
                MeanValues.arithmeticMean(myVector));
        Printer.printArithmeticGeometricValues("Среднегеометрическое значение всех элементов: ",
                MeanValues.geometricMean(myVector));
        log.info("Среднеарифметическое значение всех элементов: " +
                MeanValues.arithmeticMean(myVector));
        log.info("Среднегеометрическое значение всех элементов: " +
                MeanValues.geometricMean(myVector));

        if(SortChecking.isSortedVectorASC(myVector) | SortChecking.isSortedVectorDESC(myVector)){
            Printer.print("Массив отсортирован");
            log.info("Массив отсортирован");
        }else {
            Printer.print("Массив не отсортирован");
            log.info("Массив не отсортирован");
        }
        int localMin = LocalValues.findLocalMin(myVector);
        int localMax = LocalValues.findLocalMax(myVector);
        if(localMin != -1){
            Printer.printLocalMinAndMAx("Найден индекс первого локального минимума: ", localMin);
            log.info("Найден индекс первого локального минимума: " + localMin);
        }
        else if(localMax != -1) {
            Printer.printLocalMinAndMAx("Найден индекс первого локального максимума: ", localMax);
            log.info("Найден индекс первого локального максимума: " + localMax);
        }else{
            Printer.print("Локальный минимум(максимум) не был найден");
            log.info("Локальный минимум(максимум) не был найден");
        }
        Printer.print("Введите число для поиска его в массиве: ");
        int searchElement = UserInput.inputDataInt();
        log.info("Было введено число " + searchElement + " для поиска в массиве");
        int indexSerchedElementLinear = SearchElements.searchElementLinear(myVector, searchElement);
        int indexSerchedElementBinary = SearchElements.searchBinary(myVector, 0, myVector.length-1, searchElement);
        if(indexSerchedElementLinear != 0){
            Printer.printLocalMinAndMAx("(Линейный поиск) Найденный элемент находится на позиции: ",
                    indexSerchedElementLinear);
            log.info("(Линейный поиск) Найденный элемент находится на позиции: " +
                    indexSerchedElementLinear);
        }else{
            Printer.print("Не было найдено элементов");
            log.info("Не было найдено элементов");
        }
        if(indexSerchedElementBinary != 0){
            Printer.printLocalMinAndMAx("(Бинарный поиск) Найденный элемент находится на позиции: ",
                    indexSerchedElementBinary);
            log.info("(Бинарный поиск) Найденный элемент находится на позиции: " +
                    indexSerchedElementBinary);
        }else{
            Printer.print("Не было найдено элементов");
            log.info("Не было найдено элементов");
        }
        Printer.print("Массив с реверсированными элементами: " + Arrays.toString(ReversingVector.reverseElements(myVector)));
        log.info("Массив с реверсированными элементами: " + Arrays.toString(ReversingVector.reverseElements(myVector)));
        Printer.print("Сортировка пузырьком: " + Arrays.toString(SortVector.bubbleSort(myVector)));
        log.info("Сортировка пузырьком: " + Arrays.toString(SortVector.bubbleSort(myVector)));
        Printer.print("Сортировка вставками: " + Arrays.toString(SortVector.insertionSort(myVector)));
        log.info("Сортировка вставками: " + Arrays.toString(SortVector.insertionSort(myVector)));
        SortVector.quickSort(myVector, 0, myVector.length-1);
        Printer.print("Сортировка быстрая: " + Arrays.toString(myVector));
        log.info("Сортировка быстрая: " + Arrays.toString(myVector));
        log.info("Программа успешно завершена!");
    }
}
