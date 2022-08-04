package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Vvedite massive chisel: "); //Ввод массива чисел
        Scanner scanner = new Scanner(System.in);
        String massive = scanner.nextLine();

        String [] array = massive.split(" ", 0); //Преобразование в численный массив
        int numArr[] = new int[array.length];
        for (int i=0; i<array.length; i++){
        numArr[i] = Integer.parseInt(array[i]);
        }

        int a, b;
        for (int i = numArr.length - 1; i >= 1; i--) {  //Внешний цикл сортировки
            for (int j = 0; j < i; j++) {       //Внутренний цикл сортировки
                if (numArr[j] > numArr[j + 1]) {
                    a = numArr[j];
                    b = numArr[j+1];
                    numArr[j] = b;
                    numArr[j+1] = a;
                }
            }
        }
        for (int i = 0; i < numArr.length-1; i++){  //Вывод отсортированного массива
            System.out.print(numArr[i]+" ");
        }
    }
}
