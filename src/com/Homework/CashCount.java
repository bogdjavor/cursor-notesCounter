package com.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CashCount {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> notes = new ArrayList<>();
    int [] noteNumber = new int [9];


    public CashCount() {
        notes.add(1);
        notes.add(2);
        notes.add(5);
        notes.add(10);
        notes.add(20);
        notes.add(50);
        notes.add(100);
        notes.add(200);
        notes.add(500);
    }

    public void CashToNotes() {
        System.out.print("Enter the sum of money: ");
        int sum = scan.nextInt();
        long start = System.currentTimeMillis();
        for (int i = notes.size()-1; i >= 0; i--) {
            int notesAmount = sum / notes.get(i);
            if (notesAmount >= 1) {
                sum -= notes.get(i) * notesAmount;
                noteNumber[i] = notesAmount;
            }
        }


        for (int i = notes.size()-1; i >= 0; i--) {
            notes.get(i);
            int w = noteNumber[i];
            if(w > 0) {
                System.out.println("\t" + notes.get(i) + " x "+ noteNumber[i]);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time spend - " + (end - start) + " (ms)");
    }
}
