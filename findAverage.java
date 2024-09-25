public class findAverage {

    public static int[] findDifferences(int[] array){
        int sum = 0;
        int average = 0;
        int count = array.length;
        //ortalamayı hesaplar
        for(int i = 0; i < count; i ++){
            sum += array[i];
        }
        average = sum / count;
        //ortalamayla olan farkların olduğu yeni bir array oluşturur
        int[] differences = new int[count];
        for (int i = 0; i < count; i ++){
            differences[i] = average - array[i];
        }

        return differences;
    }
}