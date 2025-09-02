import java.util.Scanner;
public class IMC {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("Informe sua Altura: ");
        float altura = sc.nextFloat();
        double media = peso/(altura*altura);

        if (media < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        else if (media <= 18.5 && media >= 24.99 ) {
            System.out.println("Normal");
        }
        else if (media >=25 && media <=29){
            System.out.println("Você está acima do peso");
        }
        else if (media >=30){
            System.out.println("Você está com obesidade");
        }


        sc.close();


    }
}
