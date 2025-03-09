import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Fulano de Tal";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        double saldo = saldoInicial;
        int i = 0;

        System.out.println("*************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldoInicial);
        System.out.println("*************************************");

        String operacoes = """
                Operações
                
                1- Consultar Saldo
                2- Receber valor
                3- Transferir Valor
                4- Sair
                
                Digite a opção desejada:
                """;
        while (i != 4) {
            System.out.println(operacoes);
            int opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é: " + saldo);
            }
            else if (opcao == 2) {
                System.out.println("Valor a ser recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("saldo atualizado: " + saldo);
            }
            else if (opcao == 3) {
                System.out.println("Valor a ser transferido: ");
                double valorTransferido = leitura.nextDouble();
                if (saldo >= valorTransferido){
                    saldo -= valorTransferido;
                    System.out.println("saldo atualizado: " + saldo);
                } else {
                    System.out.println("Transação impossivel");
                }
            }
            else if (opcao == 4) {
                System.out.println("operações encerradas");
                break;
            }
            else {
                System.out.println("Opção inexistente");
            }
        }
    }
}