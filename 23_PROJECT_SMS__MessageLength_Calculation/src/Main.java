import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String msg = "Artık demir almak günü gelmişse zamandan / Meçhule giden bir gemi kalkar bu limandan.\n" +
                "\n" +
                "Hiç yolcusu yokmuş gibi sessizce alır yol; / Sallanmaz o kalkışta ne mendil, ne de bir kol.\n" +
                "\n" +
                "Rıhtımda kalanlar bu seyahatten elemli, / Günlerce siyah ufka bakar gözleri nemli,\n" +
                "\n" +
                "Biçare gönüller! Ne giden son gemidir bu! / Hicranlı hayatın ne de son matemidir bu.\n" +
                "\n" +
                "Dünyada sevilmiş ve seven nafile bekler; / Bilmez ki giden sevgililer dönmeyecekler.\n" +
                "\n" +
                "Birçok gidenin her biri memnun ki yerinden, / Birçok seneler geçti; dönen yok seferinden." ;


        int lenght = (int ) msg.length();

        int process = (int)(Math.ceil( lenght / 160));

        System.out.println("your message can be divided into "+ lenght + " characters and "+process+" SMS");


    }
}