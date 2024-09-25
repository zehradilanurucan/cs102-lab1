import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class maincode {
     public static int[] findDifferences(int[] array){
        int sum = 0;
        int average = 0;
        int count = array.length;
        //ortalamayı hesaplar
        for(int i = 0; i < count; i ++){
            sum += array[i];
        }
        average = sum / count;
        System.out.println("Avarage is: "+average);
        //ortalamayla olan farkların olduğu yeni bir array oluşturur
        int[] differences = new int[count];
        for (int i = 0; i < count; i ++){
            differences[i] =array[i] - average  ;
        }

        return differences;
    }
    public static int findMinimum(int[] array){
    int min = array[0];
    for(int i  = 0; i< array.length; i++){
        if(array[i]< min){
            min = array[i];
        }
    }
    return min;
}
public static int findMaximum(int[] array){
    int max = array[0];
    for(int i  = 0; i< array.length; i++){
        if(array[i]> max){
            max = array[i];
        }
    }
    return max;
}
    public static double sumOfTheNumbersWithOddIndex(int[]arr){
        double sum=0;
            for (int i=0;i<arr.length;i++){
                if(i%2!=0){
                    sum+=arr[i];
                }
            }
            return sum;
    }

    public static double sumOfTheNumbersWithEvenIndex(int[]arr){
        double sum=0;
            for (int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum+=arr[i];
                }
            }
            return sum;
    }

     public static int[] createArray(int a)
    {
        int[] array = new int[a];
        Random rand = new Random();
        for(int i=0; i < a ; i++)
        {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.print("Enter an array size: ");
        int size = scan.nextInt();

        int[] array = maincode.createArray(size);
        System.out.println("Array is : " + Arrays.toString(array));

        do{
            System.out.println("Menu Options:\n1)Find the minimum\n 2)Find the maximum\n3)Find the average and display the differences from the average\n4)Find the sum of odd-indexed elements and even-indexed elements\n5)Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if(choice == 1){
                System.out.println(findMinimum(array));
            }
            if(choice == 2){
                System.out.println(findMaximum(array));
            }
            if(choice == 3){
                System.out.println(""+findDifferences(array));
            }
            if(choice == 4){
                System.out.println("Sum of the even indexes is: "+sumOfTheNumbersWithEvenIndex(array));
                System.out.println("Sum of the odd indexes is: "+sumOfTheNumbersWithOddIndex(array));
            }
            if(choice > 5 || choice <= 0){
                System.out.println("Please enter a valid choice");
            }
        }while(choice != 5);
    }
}
