import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe Scanner

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem da conta criada com sucesso!

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nomeCliente + " " + sobrenomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
