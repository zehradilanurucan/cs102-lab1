import java.util.Scanner;
public class maincode {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice != 5){
            System.out.println("Menu Options:\n1)Find the minimum\n 2)Find the maximum\n3)Find the average and display the differences from the average\n4)Find the sum of odd-indexed elements and even-indexed elements\n5)Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if(choice == 1){
                findmin(array);
            }
            if(choice == 2){
                findmax(array);
            }
            if(choice == 3){
                findaverage(array);
            }
            if(choice == 4){
                findsum(array);
            }
            if(choice > 5 || choice <= 0){
                System.out.println("Please enter a valid choice");
            }
        }
    }
}
