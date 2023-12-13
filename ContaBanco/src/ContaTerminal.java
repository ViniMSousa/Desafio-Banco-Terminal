import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe Scanner, os valores digitados no terminal

        // Exibir a mensagem conta criada

        int num;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- SEJA BEM-VINDO AO SISTEMA DE CRIAÇÃO DE CONTAS DA DIO ---");
        System.out.println("Por favor, digite o número da agência !");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o número que deseja para sua conta!");
        num = entrada.nextInt();
        System.out.println("Por favor, digite o valor de saque inicial para criação da sua conta!");
        saldo = entrada.nextFloat();

        System.out.println(nomeCliente + ", obrigado por criar uma conta em nosso banco, o número de sua agência é "
                + agencia
                + ", seu número de conta é " + num + " e seu saldo é " + saldo
                + " R$, e já está disponível para saque!");

    }
}
