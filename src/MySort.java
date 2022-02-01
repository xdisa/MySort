import java.util.Scanner;

public class MySort {




    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("введи длину: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int arr[] = new int[size]; // Создаём массив int размером в size
        System.out.println("введи элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("получившийся массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]); // Выводим на экран, полученный массив
        }
        System.out.println();


        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[j + 1]) {// если поставить > то будет сортировка по убыванию
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }


            }
        }
        System.out.print("получившийся массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
}
