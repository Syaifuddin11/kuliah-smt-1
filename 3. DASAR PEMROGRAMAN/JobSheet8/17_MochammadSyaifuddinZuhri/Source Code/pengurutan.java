package Array;

public class pengurutan {
    public static void main(String[] args) {
        int[] array = {5,2,7,9,6};
        int pnjgArray = array.length;
        int temp = 0;
        
        for (int i=0; i<pnjgArray; i++){
            for (int j=1; j<pnjgArray-1; j++){
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        System.out.println("Hasil Pengurutan : ");
        for (int i=0; i<pnjgArray; i++){
            System.out.println(array[i]+" ");
        }
        
    }
}
