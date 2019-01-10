package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.controller;

import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model.*;
import by.epam.javatraining.ZayatsArtyom.tasks.maintask01.view.Printer;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class MainTask_01 {
    static Logger log = Logger.getLogger(MainTask_01.class);
    public static void main(String[] args) {
        log.info("Program has been started");
        Printer.print("Input size of vector:");
        int n = UserInput.inputDataInt();
        int myVector[] = GenerateUserVector.generateVector(n);
        Printer.print("Your vector: " + Arrays.toString(myVector));
        log.info("Generated vector: " + Arrays.toString(myVector));

        Printer.print("Min value: " + ExtremeValues.searchExtremeMin(myVector));
        Printer.print("Max value: " + ExtremeValues.searchExtremeMax(myVector));
        log.info("Min value: " + ExtremeValues.searchExtremeMin(myVector));
        log.info("Max value: " + ExtremeValues.searchExtremeMax(myVector));

        Printer.print("Arithmetic mean: " + MeanValues.arithmeticMean(myVector));
        Printer.print("Geometric mean: " + MeanValues.geometricMean(myVector));
        log.info("Arithmetic mean: " + MeanValues.arithmeticMean(myVector));
        log.info("Geometric mean: " + MeanValues.geometricMean(myVector));

        if(SortChecking.isSortedVectorASC(myVector) | SortChecking.isSortedVectorDESC(myVector)){
            Printer.print("Vector is sorted");
            log.info("Vector is sorted");
        }else {
            Printer.print("Vector not sorted");
            log.info("Vector not sorted");
        }
        int localMin = LocalValues.findLocalMin(myVector);
        int localMax = LocalValues.findLocalMax(myVector);
        if(localMin != -1){
            Printer.print("Index of first local minimum: " + localMin);
            log.info("Index of first local minimum: " + localMin);
        }
        else if(localMax != -1) {
            Printer.print("Index of first local maximum: " + localMax);
            log.info("Index of first local maximum: " + localMax);
        }else{
            Printer.print("Local minimum (maximum) not founded");
            log.info("Local minimum (maximum) not founded");
        }
        Printer.print("Input value to searching: ");
        int searchElement = UserInput.inputDataInt();
        log.info("Entered number " + searchElement + " to searching in vector");
        int indexSearchedElementLinear = SearchElements.searchElementLinear(myVector, searchElement);
        int indexSearchedElementBinary = SearchElements.searchBinary(myVector, 0, myVector.length-1, searchElement);
        if(indexSearchedElementLinear != 0){
            Printer.print("(Linear searching) Index of founded element: " + indexSearchedElementLinear);
            log.info("(Linear searching) Index of founded element: " + indexSearchedElementLinear);
        }else{
            Printer.print("Element not found");
            log.info("Element not found");
        }
        if(indexSearchedElementBinary != 0){
            Printer.print("(Binary searching) Index of founded element: " + indexSearchedElementBinary);
            log.info("(Binary searching) Index of founded element: " + indexSearchedElementBinary);
        }else{
            Printer.print("Element not found");
            log.info("Element not found");
        }
        Printer.print("Vector with reversing elements: " + Arrays.toString(ReversingVector.reverseElements(myVector)));
        log.info("Vector with reversing elements: " + Arrays.toString(ReversingVector.reverseElements(myVector)));
        Printer.print("Bubble sort: " + Arrays.toString(SortVector.bubbleSort(myVector)));
        log.info("Bubble sort: " + Arrays.toString(SortVector.bubbleSort(myVector)));
        Printer.print("Insertion sort: " + Arrays.toString(SortVector.insertionSort(myVector)));
        log.info("Insertion sort: " + Arrays.toString(SortVector.insertionSort(myVector)));
        SortVector.quickSort(myVector, 0, myVector.length-1);
        Printer.print("Quick sort: " + Arrays.toString(myVector));
        log.info("Quick sort: " + Arrays.toString(myVector));
        log.info("Program has been finished!");
    }
}
