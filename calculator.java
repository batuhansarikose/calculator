import java.util.Scanner;

    public class calculator {
        public static void main(String[] args) {
            double number1,number2;
            int select;

            Scanner inp =new Scanner(System.in);
            System.out.print("İlk Sayıyı Giriniz:");
            number1 = inp.nextDouble();
            System.out.print("İkinci Sayıyı Giriniz:");
            number2 = inp.nextDouble();
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            select= inp.nextInt();
            System.out.println("Seçiminiz:"+select);

            switch (select){
                case 1:
                    System.out.println("Toplam:"+(number1+number2));
                    break;
                case 2:
                    System.out.println("Çıkarma:"+(number1-number2));
                    break;
                case 3:
                    System.out.println("Çarpma:"+(number1*number2));
                    break;
                case 4:
                    if (number2!=0){
                    System.out.println("Bölme:"+(number1/number2));}
                    else System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız!");


            }

        }

}
