
package rendezes;


public class Main {
    private static int[] rendezendo = {13, -54, 32, 12, 75, 1, -2, 78, 10, 0};
    
    public static void main(String[] args) {
        kiir(rendezendo);
        kiir(Rendezesek.kertiTorpe(rendezendo));
        Test.rendezettE(Rendezesek.kertiTorpe(rendezendo));
    }

    private static void kiir(int[] tomb) {
    
        for (int i = 0; i < tomb.length -1; i++) {
            System.out.print(tomb[i]+", ");
        }
        System.out.println("");
    }

   
}
