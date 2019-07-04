package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CashCount {
    private Scanner scan = new Scanner(System.in);
    private List<Integer> notes = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500);
    private int[] noteNumber = new int[9];


    public void CashToNotes() {
        int sum = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the value: ");
                sum = scan.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Numbers only!");
                scan.nextLine();
            }
        }

            int valueToCountTime = sum;
            long start = System.nanoTime();
            if (sum > 0) {
                for (int i = notes.size() - 1; i >= 0; i--) {
                    int notesAmount = sum / notes.get(i);
                    if (notesAmount >= 1) {
                        sum -= notes.get(i) * notesAmount;
                        noteNumber[i] = notesAmount;
                    }
                    notes.get(i);
                    int w = noteNumber[i];
                    if (w > 0) {
                        System.out.println("\t" + notes.get(i) + " x " + noteNumber[i]);
                    }
                }
                long end = System.nanoTime();
                double total = (double) (end - start) / 1000000;

                if ((valueToCountTime >= 24565) && (valueToCountTime <= 35789)) {
                    System.out.println("Time spent - " + total + " (ms)");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("Invalid number, please enter again");
                CashToNotes();
            }
        }
    }
