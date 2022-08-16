import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner giris = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :" );
        tutar = giris.nextDouble();

        kdvOran = tutar<1000?0.18:0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("Tutar: "+tutar);
        System.out.println("Kdv Oranı : "+kdvOran);
        System.out.println("Kdv Tutarı : "+kdvTutar);
        System.out.println("Kdv'li Tutarı"+kdvliTutar);
    }
}
