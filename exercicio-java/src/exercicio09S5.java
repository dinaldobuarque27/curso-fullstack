import java.util.Scanner;

public class exercicio09S5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os segundos para transformar em horas: ");
        int segundosInformdos = sc.nextInt();

        sc.close();

        int hora = segundosInformdos / 3600;
        
        int minutos = (segundosInformdos - (hora * 3600)) /60;

        int segundos = (segundosInformdos - (hora * 3600) - (minutos *60));

        System.out.printf("%02d/%02d/%02d", hora, minutos, segundos);

    }
}
