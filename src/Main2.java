import sortingAlgorithms.HeapSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.ShellSort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        HeapSort<Float> heapSort = new HeapSort<>();
        QuickSort<Float> quickSort = new QuickSort<>();
        InsertionSort<Float> insertionSort = new InsertionSort<>();
        ShellSort<Float> shellSort = new ShellSort<>();
        Float[] array15k = new Float[15000];
        Float[] array20k = new Float[20000];
        Float[] array30k = new Float[30000];
        Float[] array40k = new Float[40000];
        Float[] array50k = new Float[50000];
        Float[] array65k = new Float[65000];
        Float[] array80k = new Float[80000];

        int length15k = array15k.length / 3;
        int length20k = array20k.length / 3;
        int length30k = array30k.length / 3;
        int length40k = array40k.length / 3;
        int length50k = array50k.length / 3;
        int length65k = array65k.length / 3;
        int length80k = array80k.length / 3;


//       private void generateSortedIn33(Integer[] ourArray) {
//           Random random = new Random();
//           for (int i = 0; i < ourArray.length; i++) {
//               ourArray[i] = random.nextInt();
//           }
        //           int length33 = ourArray.length/3;

//           Arrays.sort(ourArray, 0, length33);
//
//       }
//
//       private void generateSortedIn66(Integer[] ourArray) {
//           int length66 =(int)(ourArray.length*0.66);
//           Random random = new Random();
//           for (int i = 0; i < ourArray.length; i++) {
//               ourArray[i] = random.nextInt();
//           }
//           Arrays.sort(ourArray, 0, length66);
//
//       }
//
//       private void generateSortedAscending(Integer[] ourArray) {
//           Random random = new Random();
//           for (int i = 0; i < ourArray.length; i++) {
//               ourArray[i] = random.nextInt();
//           }
//           Arrays.sort(ourArray);
//
//       }
//       private void generateSortedDescending(Integer[] ourArray) {
//           Random random = new Random();
//           for (int i = 0; i < ourArray.length; i++) {
//               ourArray[i] = random.nextInt();
//           }
//           Arrays.sort(ourArray, Collections.reverseOrder());
//
//       }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for15.txt", true))) { // Open file in append mode

            for (int i = 0; i < 100; i++) {
                Random random = new Random();
                for (int j = 0; j < 15000; j++) {
                    array15k[j] = random.nextFloat();
                }

                Arrays.sort(array15k, 0, length15k);
                long start = System.currentTimeMillis();
                heapSort.sort(array15k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for80.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 80000; j++) {
                    array80k[j] = random.nextFloat();
                }
                Arrays.sort(array80k, 0, length80k);
                long start = System.currentTimeMillis();
                heapSort.sort(array80k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for65.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 65000; j++) {
                    array65k[j] = random.nextFloat();
                }

                Arrays.sort(array65k, 0, length65k);

                long start = System.currentTimeMillis();
                heapSort.sort(array65k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for50.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 50000; j++) {
                    array50k[j] = random.nextFloat();
                }
                Arrays.sort(array50k, 0, length50k);

                long start = System.currentTimeMillis();
                heapSort.sort(array50k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for20.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 20000; j++) {
                    array20k[j] = random.nextFloat();
                }
                Arrays.sort(array20k, 0, length20k);

                long start = System.currentTimeMillis();
                heapSort.sort(array20k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for30.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 30000; j++) {
                    array30k[j] = random.nextFloat();
                }
                Arrays.sort(array30k, 0, length30k);

                long start = System.currentTimeMillis();
                heapSort.sort(array30k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("heapSortAscending33for40.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 40000; j++) {
                    array40k[j] = random.nextFloat();
                }
                Arrays.sort(array40k, 0, length40k);

                long start = System.currentTimeMillis();
                heapSort.sort(array40k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for15.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 15000; j++) {
                    array15k[j] = random.nextFloat();
                }
                Arrays.sort(array15k, 0, length15k);

                long start = System.currentTimeMillis();
                shellSort.sort(array15k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for80.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 80000; j++) {
                    array80k[j] = random.nextFloat();
                }
                Arrays.sort(array80k, 0, length80k);

                long start = System.currentTimeMillis();
                shellSort.sort(array80k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for65.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 65000; j++) {
                    array65k[j] = random.nextFloat();
                }
                Arrays.sort(array65k, 0, length65k);

                long start = System.currentTimeMillis();
                shellSort.sort(array65k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for50.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 50000; j++) {
                    array50k[j] = random.nextFloat();
                }
                Arrays.sort(array50k, 0, length50k);

                long start = System.currentTimeMillis();
                shellSort.sort(array50k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for20.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 20000; j++) {
                    array20k[j] = random.nextFloat();
                }
                Arrays.sort(array20k, 0, length20k);

                long start = System.currentTimeMillis();
                shellSort.sort(array20k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for30.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 30000; j++) {
                    array30k[j] = random.nextFloat();
                }
                Arrays.sort(array30k, 0, length30k);

                long start = System.currentTimeMillis();
                shellSort.sort(array30k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shellSortAscending33for40.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 40000; j++) {
                    array40k[j] = random.nextFloat();
                }
                Arrays.sort(array40k, 0, length40k);
                long start = System.currentTimeMillis();
                shellSort.sort(array40k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }















        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for15.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 15000; j++) {
                    array15k[j] = random.nextFloat();
                }
                                Arrays.sort(array15k, 0, length15k);
                long start = System.currentTimeMillis();
                quickSort.sort(array15k, 0, array15k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for80.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 80000; j++) {
                    array80k[j] = random.nextFloat();
                }
                                Arrays.sort(array80k, 0, length80k);

                long start = System.currentTimeMillis();
                quickSort.sort(array80k, 0, array80k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for65.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 65000; j++) {
                    array65k[j] = random.nextFloat();
                }
                                Arrays.sort(array65k, 0, length65k);

                long start = System.currentTimeMillis();
                quickSort.sort(array65k, 0, array65k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for50.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 50000; j++) {
                    array50k[j] = random.nextFloat();
                }
                                Arrays.sort(array50k, 0, length50k);

                long start = System.currentTimeMillis();
                quickSort.sort(array50k, 0, array50k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for20.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 20000; j++) {
                    array20k[j] = random.nextFloat();
                }
                                Arrays.sort(array20k, 0, length20k);

                long start = System.currentTimeMillis();
                quickSort.sort(array20k, 0, array20k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for30.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 30000; j++) {
                    array30k[j] = random.nextFloat();
                }
                                Arrays.sort(array30k, 0, length30k);

                long start = System.currentTimeMillis();
                quickSort.sort(array30k, 0, array30k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("quickSortAscending33for40.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 40000; j++) {
                    array40k[j] = random.nextFloat();
                }
                                Arrays.sort(array40k, 0, length40k);

                long start = System.currentTimeMillis();
                quickSort.sort(array40k, 0, array40k.length - 1);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




















        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for15.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 15000; j++) {
                    array15k[j] = random.nextFloat();
                }
                Arrays.sort(array15k, 0, length15k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array15k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for80.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 80000; j++) {
                    array80k[j] = random.nextFloat();
                }
                Arrays.sort(array80k, 0, length80k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array80k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for65.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 65000; j++) {
                    array65k[j] = random.nextFloat();
                }
                Arrays.sort(array65k, 0, length65k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array65k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for50.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 50000; j++) {
                    array50k[j] = random.nextFloat();
                }
                Arrays.sort(array50k, 0, length50k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array50k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for20.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 20000; j++) {
                    array20k[j] = random.nextFloat();
                }
                Arrays.sort(array20k, 0, length20k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array20k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for30.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 30000; j++) {
                    array30k[j] = random.nextFloat();
                }
                Arrays.sort(array30k, 0, length30k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array30k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("insertionSortAscending33for40.txt", true))) { // Open file in append mode
            for (int i = 0; i < 100; i++) {

                Random random = new Random();
                for (int j = 0; j < 40000; j++) {
                    array40k[j] = random.nextFloat();
                }
                Arrays.sort(array40k, 0, length40k);

                long start = System.currentTimeMillis();
                insertionSort.sort(array40k);
                long end = System.currentTimeMillis();
                bufferedWriter.write("" + (end - start));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
