
package rendezes;

public class Rendezesek {

    static int[] kertiTorpe(int[] tomb) {
        int n = tomb.length;
        for (int i = 0; i < n - 1; i++) {
            
            int j = i;
            if (tomb[j] > tomb[j+1]) {
                int csere = tomb[j];
                tomb[j] = tomb[j+1];
                tomb[j+1] = csere;
                
                while (j > 1) {
                    if (tomb[j-1] > tomb[j]) { 
                        csere = tomb[j-1];
                        tomb[j-1] = tomb[j];
                        tomb[j] = csere;
                    }
                    j = j-1;
                }
            }
        }
        return tomb;
     }
    
}
