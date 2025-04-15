
package pertemuan6;

/**
 *
 * @author LAB F
 * TGL: 15 April 2025
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb = new VolumeBalok();
        Scanner inp = new Scanner (System.in);
        
        System.out.println("Hitung Volume Balok");
        System.out.print("Nilai Panjang: ");
        vb.panjang = inp.nextInt();
        System.out.print("Nilai Lebar: ");
        vb.lebar = inp.nextInt();
        System.out.print("Nilai Tinggi: ");
        vb.tinggi = inp.nextInt ();
        System.out.print("Nilai Volumenya: ");
        System.out.print("V = P *L * T");
        System.out.printf(" = %d * %d * %d\n",vb.panjang,vb.lebar,vb.tinggi);
        System.out.printf(" = %d",vb.Volume ());
                
        
        
        
       // TODO code application logic here
        
    }
    
}
