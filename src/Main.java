import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome= "Thiago de Sousa";
        String tipoConta="Corrente";
        double saldo= 1500;
        int choice;
    do{    System.out.println(
                "**************************************************************"+
                "\r\nDados Iniciais do Cliente:\r\n"+
                "\r\nNome: "+nome+
                "\r\nTipo Conta: "+ tipoConta+
                "\r\nSaldo: "+saldo+
                "\r\n**************************************************************"
        );
        System.out.println("""
                
                
                OPERAÇÕES
                
                1- Consultar saldos
                2-Receber valor
                3-Transferir valor
                4-Sair
                
                Digite a opção desejada: 
                """);
        Scanner scan= new Scanner(System.in);
        choice=scan.nextInt();

            switch (choice){
            case (1):
                System.out.println("Seu Saldo: "+ saldo);
                break;
            case (2):
                System.out.println("Digite quanto receber: ");

                double receber= scan.nextDouble();
                System.out.println("valor recebido: "+receber);
                saldo+= receber;
                break;
            case (3):
                System.out.println("Digite o valor a ser transferido: ");
                double transferir= scan.nextDouble();
                if (transferir>saldo){
                    System.out.println("Saldo insuficiente!");
                }
                System.out.println("Transferência feita com sucesso!" +
                        "\r\nValor Transferido: "+ transferir);
                saldo=saldo-transferir;
                break;
            case(4):
                System.out.println("Agradecemos sua escolha, conte conosco sempre!");
    }
}while(choice<4);
}
}
