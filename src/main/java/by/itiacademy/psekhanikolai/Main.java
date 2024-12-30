package by.itiacademy.psekhanikolai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> towns = new ArrayList<>();
        towns.add("Linz");
        towns.add("Graz");
        towns.add("Wien");
        towns.add("Salzburg");
        towns.add("Bergen");
        System.out.println(towns);
        towns.set(1, "Milan");
        System.out.println(towns);
        int maxLength = towns.get(0).length();
        String townMax = towns.get(0);
        for (String town : towns) {
            if (maxLength < town.length()) {
                maxLength= town.length();
               townMax = town;

            }
        }
        System.out.println(townMax);
    }
}
