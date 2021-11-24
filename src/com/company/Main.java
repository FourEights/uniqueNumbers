package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// good use of the methods code looks nice and tidy and variables are decently clear and
// is structured quite nicely :)
public class Main {

    public static void main(String[] args) {

        dialogue();
        getPlayers();
        comController();

    }

    public static void dialogue() {

        System.out.println("Welcome to the game!");
        System.out.println("In this game, you will be up against a computer, as well as any other");
        System.out.println("fellow players.\n");
        System.out.println("You will be encompassed within a battle of luck, taking numbers from a");
        System.out.println("list, before they're all gone.\n");
        System.out.println("If a number you have selected is not available, you will not have your name");
        System.out.println("assigned to it.\n");
        System.out.println("Good luck!\n\n");

    }

    public static void getPlayers() {

        ArrayList<String> pNames = new ArrayList<String>();
        Scanner pNumScanner = new Scanner(System.in);
        Scanner pNameScanner = new Scanner(System.in);

        System.out.println("How many players will be in this game?");
        int pNum = pNumScanner.nextInt();
        System.out.println("And what are your names?");

        for (int i = 0; i < pNum; i++) {
            String pName = pNameScanner.next();
            pNames.add(pName);
        }

    }

    public static void comController() {

        Random comNumRandom = new Random();
        int comNum = comNumRandom.nextInt();
        System.out.println(comNum);

    }

}
