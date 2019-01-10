package by.epam.javatraining.ZayatsArtyom.tasks.maintask01.model;

import java.util.Random;

public class Vector {
    public static int[] generateVector(int n){
        Random rand = new Random();
        int myVector[] = new int[n];
        for(int i = 0; i<myVector.length; i++){
            myVector[i] = rand.nextInt(10);
        }
        return myVector;
    }
}
