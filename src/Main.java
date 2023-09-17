import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>();
        int size = listA.size();
        Scanner scanner = new Scanner(System.in );
        while(listA.size()<5) {
            System.out.println("type 5 name for list A");
            String number = scanner.nextLine();
            listA.add(number);
        }
        System.out.println("лист А"+ listA);
        ArrayList<String> listB = new ArrayList<String>();
        int size2 = listB.size();
        Scanner scanner2 = new Scanner(System.in );
        while(listB.size()<5) {
            System.out.println("type 5 name for list B");
            String number = scanner.nextLine();
            listB.add(number);
        }
        System.out.println("лист А"+ listA);
        System.out.println("лист B"+ listB);
        ArrayList<String> listC = new ArrayList<String>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("лист С" + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("отсортированный лит С "+listC);
    }
}