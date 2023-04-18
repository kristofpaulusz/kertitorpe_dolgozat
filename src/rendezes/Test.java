/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendezes;

/**
 *
 * @author PauluszKristófCsanád
 */
public class Test {

    public static void rendezettE(int[] kertiTorpe) {
        boolean kapott = rendezett(kertiTorpe);
        boolean vart = true;
    
        assert kapott == vart: "Nem rendezett";
    }

    private static boolean rendezett(int[] tomb) {
        for (int i = 0; i < tomb.length -1; i++) {
            if (tomb[i+1] < tomb[i]) {
                return false;
            }
        }
        return true;
    }
    
}
