import java.util.Scanner;

public class CadastroChatbot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int verificador = 1;
            while (verificador == 1) {

                System.out.println("Olá! Bem-vindo ao cadastro da plataforma de eventos.");
                System.out.println("Vamos começar o preenchimento do seu cadastro.");

                System.out.print("Digite seu nome completo: ");
                String nome = scanner.nextLine();

                System.out.print("Digite seu e-mail: ");
                String email = scanner.nextLine();

                System.out.print("Digite sua cidade: ");
                String cidade = scanner.nextLine();

                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();
                if (idade >= 18) {
                    System.out.print("\nÓtimo! Seu cadastro foi preenchido com sucesso.");
                    System.out.print("\nAqui estão os dados que você forneceu:");
                    System.out.print("\nNome: " + nome);
                    System.out.print("\nE-mail: " + email);
                    System.out.print("\nCidade: " + cidade);
                    System.out.print("\nIdade: " + idade);
                    System.out.println("\nSeu dados estão corretos?, se sim digite 1 ou 2:");

                }
                else {
                System.out.println("Infelizmente não podemos finalizar o seu cadastro");
                System.out.println("\nMotivo: Você não tem idade suficiente.");
            }

            int ver2 = scanner.nextInt();
            scanner.nextLine();

                if (ver2 == 1) {
                    verificador = 2;

                    System.out.println("\nObrigado por se cadastrar! Tenha um ótimo dia.");

                } 
            }
        }
    }
}