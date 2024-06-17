import java.util.Scanner;

import model.Conta;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o numero de usuário");
		c.setNumero(terminal.nextInt());
		System.out.println("Digite o numero da agencia");
		c.setAgencia(terminal.next());
        System.out.println("Digite o nome do cliente");
		c.setNomeCliente(terminal.next());
        System.out.println("Digite o saldo");
		c.setSaldo(terminal.nextDouble());
        System.out.println("Olá " + c.getNomeCliente()+
        ", obrigado por criar uma conta em nosso banco,"
        +"sua agência é "+c.getAgencia()+" , conta "+ c.getNumero()+
        " e seu saldo " + c.getSaldo() + " já está disponível para saque");
		
		}
}
