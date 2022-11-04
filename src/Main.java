import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

            Scanner klavye=new Scanner(System.in);

            System.out.println("oyun başlıyor ...");
            System.out.println("1. oyuncu taş için 1  ,kağıt için 2, makas için 3 seçin");
            System.out.println("1. oyuncu seçiminiz:");
            int oyuncu1=klavye.nextInt();
            System.out.println("2. oyuncu taş için 1  ,kağıt için 2, makas için 3 seçin");
            System.out.println("2. oyuncu seçiminiz:");
            int oyuncu2=klavye.nextInt();

            if (oyuncu1 == oyuncu2) {
                System.out.println("berabere");
            } else if (oyuncu1 == 1 && oyuncu2 == 2) {
                System.out.println("1. oyuncu seçiminiz: taş, 2. oyuncu seçiminiz: kağıt ");
                System.out.println(" kağıt taşı sarar, 2. oyuncu kazandı! ");
            } else if (oyuncu1 == 1 && oyuncu2 == 3) {
                System.out.println("1. oyuncu seçiminiz: taş, 2. oyuncu seçiminiz: makas ");
                System.out.println("taş makası kırar, 1. oyuncu kazandı! ");
            } else if (oyuncu1 == 2 && oyuncu2 == 1) {
                System.out.println("1. oyuncu seçiminiz: kağıt, 2. oyuncu seçiminiz: taş ");
                System.out.println(" kağıt taşı sarar, 1. oyuncu kazandı! ");
            } else if (oyuncu1 == 2 && oyuncu2 == 3) {
                System.out.println("1. oyuncu seçiminiz: kağıt, 2. oyuncu seçiminiz: makas ");
                System.out.println(" makas kağıdı keser, 2. oyuncu kazandı! ");
            } else if (oyuncu1 == 3 && oyuncu2 == 1) {
                System.out.println("1. oyuncu seçiminiz:makas , 2. oyuncu seçiminiz: taş ");
                System.out.println("taş makası kırar, 2. oyuncu kazandı! ");
            } else if (oyuncu1 == 3 && oyuncu2 == 2) {
                System.out.println("1. oyuncu seçiminiz: makas, 2. oyuncu seçiminiz: kağıt ");
                System.out.println(" makas kağıdı keser, 1. oyuncu kazandı! ");
            } else {
                System.out.println(" seçenekleri doğru girin");
            }

    }
}

