import jdk.jshell.spi.ExecutionControl;

import java.util.Objects;
import java.util.Scanner;
public class kullaniciGirisi {
    public static void main (String[] args) {
        String username,password,newpassword ;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        username = input.nextLine();
        System.out.print("Lütfen şifreyi giriniz : ");
        password = input.nextLine();

        if (username.equals("Canercanbo") && password.equals("123456")) {
            System.out.print("Başarıyla giriş yaptınız!İyi eğlenceler.");
        }
        else {
            System.out.print("Kullanıcı adınız yada şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır\nSeçiminiz ?");
            int secim ;
            secim = input.nextInt();
            switch (secim)
            {
                case 1 : System.out.print("Yeni şifrenizi giriniz : ");
                    newpassword = input.next();
                    if ((!Objects.equals(newpassword, password)))  {
                        System.out.println("Yeni şifreniz eski şifreniz ile aynı!!! Şifreniz Değiştirilemedi!!!");

                    } else  {
                        System.out.print("Şifreniz başarıyla değiştirildi.İyi eğlenceler!");
                    }
                    break;
                case 2 : System.out.print("Şifrenizi değiştirmek istemediniz");
                    System.exit(0);


            }
    }
 }
}