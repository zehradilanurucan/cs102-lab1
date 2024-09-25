public class homework {
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
    public static void main(String[] args) {
        int []arr= {1,0,8,7,5};
        System.out.println(sumOfTheNumbersWithEvenIndex(arr));
        System.out.println(sumOfTheNumbersWithOddIndex(arr));
    }
}
