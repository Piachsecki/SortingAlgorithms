import exceptions.IllegalTypeException;
import sortingAlgorithms.HeapSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.ShellSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main<T> {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = "./src/array.txt";
        Main main = new Main();
        main.run();
    }

    private void run() {
        showUserInterface();
    }

    private void showUserInterface() {
        boolean flag = true;
        while (flag) {

            switch (printingMenu()) {
                case 1: {
                    T type = askForTheTypeOfTheArray();
                    System.out.println("How much data you want to be generated?: ");
                    int howMuchDataYouWantToGenerate = scanner.nextInt();
                    T[] ourArray = makeArray(type, howMuchDataYouWantToGenerate);
                    int howYouWantToGenerateData = howYouWantToGenerateData();
                    switch (howYouWantToGenerateData) {
                        case 1: {
                            generateRandomInt((Integer[]) ourArray);
                        }
                        break;
                        case 2: {
                            generateSortedAscending((Integer[])ourArray);
                        }
                        break;
                        case 3: {
                            generateSortedDescending((Integer[])ourArray);
                        }
                        break;
                        case 4: {
                            generateSortedIn33((Integer[])ourArray);
                        }
                        break;
                        case 5: {
                            generateSortedIn66((Integer[])ourArray);
                        }
                        break;
                        default: {
                        }
                    }

                    performSorting(ourArray);


                }
                break;
                case 2: {
                    System.out.println("Provide the filepath of the array");
                    scanner.nextLine();
                    String filePath = scanner.nextLine();
                    T type = askForTheTypeOfTheArray();
                    performSorting(filePath, type);

                }
                break;
                case 0: {
                    flag = false;
                }
                default: {
                    System.out.println("Sth went wrong, try again!");
                }

            }
        }

    }

    private void generateSortedIn33(Integer[] ourArray) {
        int length33 = ourArray.length/3;
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextInt();
        }
        Arrays.sort(ourArray, 0, length33);

    }

    private void generateSortedIn66(Integer[] ourArray) {
        int length66 =(int)(ourArray.length*0.66);
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextInt();
        }
        Arrays.sort(ourArray, 0, length66);

    }

    private void generateSortedAscending(Integer[] ourArray) {
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextInt();
        }
        Arrays.sort(ourArray);

    }
    private void generateSortedDescending(Integer[] ourArray) {
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextInt();
        }
        Arrays.sort(ourArray, Collections.reverseOrder());

    }

    private void generateRandomInt(Integer[] ourArray) {
        Random random = new Random();
            for (int i = 0; i < ourArray.length; i++) {
                ourArray[i] = random.nextInt();
            }
        }

    private void generateRandomDouble(Double[] ourArray) {
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextDouble();
        }
    }

    private void generateRandomFloat(Float[] ourArray) {
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = random.nextFloat();
        }
    }

    private void generateRandomCharacter(Character[] ourArray) {
        Random random = new Random();
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] =(char) random.nextInt(97, 122);
        }
    }

        private void performSorting (T[]arrayToSort){
            switch (availableAlgorithms()) {
                case 1: {
                    InsertionSort insertionSort = new InsertionSort();
                    insertionSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 2: {
                    QuickSort quickSort = new QuickSort();
                    quickSort.sort((Comparable[]) arrayToSort, 0, arrayToSort.length - 1);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 3: {
                    ShellSort shellSort = new ShellSort();
                    shellSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 4: {
                    HeapSort heapSort = new HeapSort();
                    heapSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                default:
                    System.out.println("Sth went wrong! Try again.");
            }
        }

        private void performSorting (String filePath, T type){
            switch (availableAlgorithms()) {
                case 1: {
                    InsertionSort insertionSort = new InsertionSort();
                    T[] arrayToSort = makeArray(filePath, type);
                    insertionSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 2: {
                    QuickSort quickSort = new QuickSort();
                    T[] arrayToSort = makeArray(filePath, type);
                    quickSort.sort((Comparable[]) arrayToSort, 0, arrayToSort.length - 1);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 3: {
                    ShellSort shellSort = new ShellSort();
                    T[] arrayToSort = makeArray(filePath, type);
                    shellSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                case 4: {
                    HeapSort heapSort = new HeapSort();
                    T[] arrayToSort = makeArray(filePath, type);
                    heapSort.sort((Comparable[]) arrayToSort);
                    System.out.println(Arrays.toString(arrayToSort));
                }
                break;
                default:
                    System.out.println("Sth went wrong! Try again.");
            }
        }

        private int howYouWantToGenerateData () {
            System.out.println("Choose the way of generating data in the array: ");
            System.out.println("1) Random");
            System.out.println("2) Sorted Ascending");
            System.out.println("3) Sorted Descending");
            System.out.println("4) Sorted in 33%");
            System.out.println("5) Sorted in 66%");
            return scanner.nextInt();

        }

        private T[] makeArray (T type,int size){

            if (type instanceof Integer) {
                Integer[] finalArray = new Integer[size];

                return (T[]) finalArray;

            } else if (type instanceof Character) {
                Character[] finalArray = new Character[size];
                return (T[]) finalArray;


            } else if (type instanceof Double) {
                Double[] finalArray = new Double[size];

                return (T[]) finalArray;


            } else if (type instanceof Float) {
                Float[] finalArray = new Float[size];

                return (T[]) finalArray;
            }

            throw new RuntimeException();

        }

        private T[] makeArray (String filePath, T type){
            try {

                Path path = Paths.get(filePath);
                List<String> stringList = Files
                        .readAllLines(path)
                        .stream()
                        .map(line -> line.trim().replaceAll(" +", " "))
                        .toList();
                int counter = 0;
                for (String s : stringList) {
                    String[] arrayOfLine = s.split(" ");
                    for (String s1 : arrayOfLine) {
                        counter++;
                    }
                }
                if (type instanceof Integer) {
                    Integer[] finalArray = new Integer[counter];
                    int i = 0;
                    for (String s : stringList) {
                        String[] arrayOfLine = s.split(" ");
                        for (String s1 : arrayOfLine) {
                            finalArray[i] = Integer.parseInt(s1);
                            i++;
                        }
                    }
                    return (T[]) finalArray;


                } else if (type instanceof Character) {
                    Character[] finalArray = new Character[counter];
                    int i = 0;
                    for (String s : stringList) {
                        String[] arrayOfLine = s.split(" ");
                        for (String s1 : arrayOfLine) {
                            finalArray[i] = s1.charAt(0);
                            i++;
                        }
                    }

                    return (T[]) finalArray;


                } else if (type instanceof Double) {
                    Double[] finalArray = new Double[counter];
                    int i = 0;
                    for (String s : stringList) {
                        String[] arrayOfLine = s.split(" ");
                        for (String s1 : arrayOfLine) {
                            finalArray[i] = Double.parseDouble(s1);
                            i++;
                        }
                    }
                    return (T[]) finalArray;


                } else if (type instanceof Float) {
                    Float[] finalArray = new Float[counter];
                    int i = 0;
                    for (String s : stringList) {
                        String[] arrayOfLine = s.split(" ");
                        for (String s1 : arrayOfLine) {
                            finalArray[i] = Float.parseFloat(s1);
                            i++;
                        }
                    }
                    return (T[]) finalArray;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            throw new IllegalTypeException(type);
        }

        private int availableAlgorithms () {
            System.out.println("Choose the sorting algorithm: ");
            System.out.println("1) Insertion sort");
            System.out.println("2) Quick Sort");
            System.out.println("3) Radix Sort");
            System.out.println("4) Heap Sort");
            return scanner.nextInt();
        }

        private <T > T askForTheTypeOfTheArray() {
            System.out.println("Choose the type of the array: ");
            System.out.println("1) Integer");
            System.out.println("2) Double");
            System.out.println("3) Float");
            System.out.println("4) Character");
            int choice = scanner.nextInt();
//        Class<T> returnType = new C;
            switch (choice) {
                case 1 -> {
                    return (T) Integer.valueOf(1);
                }
                case 2 -> {
                    return (T) Double.valueOf(1.0);
                }
                case 3 -> {
                    return (T) Float.valueOf(1.0f);
                }
                case 4 -> {
                    return (T) Character.valueOf('a');
                }
            }
            throw new RuntimeException("essa");
        }

        private int printingMenu () {
            System.out.println("Welcome in our sorting algorithm app!");
            System.out.println("Please choose the right option you would like to perform: ");
            System.out.println("1) Create the array.");
            System.out.println("2) Sort the already existing array.");
            System.out.println("0) Exit.");
            return scanner.nextInt();
        }


}