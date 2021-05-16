import javax.sound.midi.Soundbank;
import java.util.Random;

public class Task1 {

    //Написать метод (void) который переворачивает массив. В main должен быть вызван
    //метод который переворачивает массив, потом вывести с помощью sout. Важно - не
    //вывести в консоль с последнего элемента, а проапдейтить существующий массив с
    //помощью void

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arr = {10,2,4,5,7};
        /*ShowArray(arr);
        System.out.println("\nReversed:");
        ReverseArray(arr);
        ShowArray(arr);
        System.out.println("\n");*/
        /*FillArrayRandomNumbers(array);
        ShowArray(array);*/
        FillArrayRandomNumbers2(array);
        ShowArray(array);
        System.out.println("\nReversed:");
        ReverseArray(array);
        ShowArray(array);
        //FillArrayRandomNumbers(array);
        //ShowArray(array);

    }

    static void ReverseArray(int []array){
        for (int i = 0, j=array.length-1; i<array.length;i++,j--){
            int tmp = array[i];
            array[i] = array[j];
            array[j] =tmp;
            if (i==j|i == array.length/2 | j == array.length/2){
                break;
            }
        }
    }

    static void ShowArray(int []array){
        System.out.println("The shown array:");
        for(int item:array){

            System.out.print(item + " ");
        }
    }
    static void FillArrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int item : array) {
            item = (int) (Math.random() * (500 - 100 + 1) + 100);
        }
    }
        static void FillArrayRandomNumbers2(int[] array){
            Random random = new Random();
            for (int i=0; i < array.length; i++) {
                array[i] = (int)(Math.random()*(500-100+1)+100);
            }
    }
}
