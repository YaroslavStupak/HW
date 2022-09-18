package Lasson10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;


public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:\\Users\\user\\Desktop\\HW\\src\\Lasson10\\text1.txt");
        Path path2 = Paths.get("C:\\Users\\user\\Desktop\\HW\\src\\Lasson10\\text2.txt");
        Files.createFile(path1);
        List<String> slines = Files.readAllLines(Paths.get("C:\\Users\\user\\Desktop\\HW\\src\\Lasson10\\song.txt"));
        Files.write(path1, slines);
        List<String> lines = Files.readAllLines(path1);
        System.out.println(lines);
        Files.write(path2, lines);
        List<String> lines2 = Files.readAllLines(path2);
        System.out.println(lines2);
        Files.delete(path1);
    }
}
