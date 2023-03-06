package Seminar_2_HW;

import java.io.FileWriter;
import java.nio.file.Path;

// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
public class Task_2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file_task_2.txt")){
            for (int i = 1; i < 101; i++) {
                fw.write(String.valueOf(i));
                fw.write(" TEST");
                fw.append("\n");
                fw.flush();
            }
        } catch (Exception e) {
            System.out.println("Такой файл уже существует");
        }    
    }
}
