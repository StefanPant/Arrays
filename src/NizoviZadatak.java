import java.util.Arrays;

public class NizoviZadatak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};

        int positive = 0;
        int negative = 0;
        

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            }
    }
   
    
    int[] PosArray = new int [positive];
    int[] NegArray = new int [negative];
    
    int j = 0, k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                NegArray[j] = array[i];
                j++;
            } else if (array[i] > 0) {
                PosArray[k] = array[i];
                k++;
            }
        }
        
        System.out.println("Negative Array is:" + Arrays.toString(NegArray));
        System.out.println("Positive Array is:" + Arrays.toString(PosArray));
        
        System.out.println("Double numbers are:");
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {

                System.out.println(array[i]);

            }
        }
    
    }
    
    

}
        
    

