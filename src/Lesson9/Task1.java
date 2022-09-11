package Lesson9;

import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\HW\\src\\Lesson9\\song.txt");
        Scanner sc = new Scanner(fr);
        HashMap<String, Integer> words = new HashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] linewords = line.split(" ");
            for (int i = 0; i<linewords.length; i++) {
                if (words.containsKey(linewords[i])) {
                    words.put(linewords[i].replaceAll("[(),]", ""), words.get(linewords[i])+1);
                } else {
                    words.put(linewords[i].replaceAll("[(),]", "").toLowerCase(),1);
                }
            }
        }
        System.out.println(words);

        Collection<Integer> values = words.values();
        Collections.max(values);
        Collection<String> keyCollecytion = words.keySet();
        Object[] key = keyCollecytion.toArray();
        for (int i = 0; i<key.length; i++) {
            if (words.get(key[i]) == Collections.max(values)) {
                System.out.println(key[i]);
            }
        }

        fr.close();
    }
}
