package src.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintingUtil<T> {

    public void printArray() {
        try {
            Path path = Paths.get("./src/array.txt");
            String[] s1 = Files.readString(path).trim().replaceAll(" +", " ").split(" ");
            List<String> stringList = Files.readAllLines(path).stream().map(line -> line.trim().replaceAll(" +", " ")).toList();

            long sizeOfTheArray = Files
                    .readAllLines(path)
                    .stream()
                    .map(line -> line.trim().replaceAll(" +", " ").split(" "))
                    .count();
            System.out.println(sizeOfTheArray);
            int counter = 0;
            for (String s : stringList) {
                String[] singleChars = s.split(" ");
                for (String singleChar : singleChars) {
                    counter++;
                }
                System.out.println();
            }
            System.out.println(counter);


//            T[] finalArray = new T[counter];

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
