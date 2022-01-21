package ru.netology.sqr;

public class SQRService {

    public int squareCalc(int startNumber, int finishNumber) {
        int count;
        count = 0;
        for (int i = 10; i <= 99;i++){
            int squareNumber = i * i;
            if (squareNumber >= startNumber && squareNumber <= finishNumber) count++;
        }
        return count;
    }

}
