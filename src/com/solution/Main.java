package com.solution;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numberOfPrisoners = JOptionPane.showInputDialog("Please input the number of prisoners");
        String numberOfGoodies = JOptionPane.showInputDialog("Please input the number of Goodies you have to share");
        String startSeatNumber = JOptionPane.showInputDialog("Please input the seat number you want to start sharing from");
        Integer endSeatNumber = findEndSeatNumber(numberOfPrisoners,numberOfGoodies,startSeatNumber);
        if (endSeatNumber!=0){
            JOptionPane.showMessageDialog(null, "Prisoner to warn is in seat number "+ endSeatNumber);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
    }
    public static int findEndSeatNumber (String numberOfPrisoners, String numberOfGoodies, String startSeatNumber){
        Integer endSeatNumber;
        int noOfPrisoners;
        int noOfGoodies;
        int startSeatNo;
        try {
            noOfPrisoners = Integer.parseInt(numberOfPrisoners);
            noOfGoodies = Integer.parseInt(numberOfGoodies);
            startSeatNo = Integer.parseInt(startSeatNumber);
            endSeatNumber = Math.abs(noOfGoodies +(startSeatNo-1) -noOfPrisoners);
            endSeatNumber = (noOfGoodies+startSeatNo-1) %noOfPrisoners;

            if(endSeatNumber==0){
                endSeatNumber = noOfPrisoners;
            }

        }
        catch (Exception e){
            endSeatNumber = 0;
        }
        return endSeatNumber;
    }
}