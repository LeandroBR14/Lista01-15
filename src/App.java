import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        ////////// SETA AS VARIAVEIS //////////
        Scanner teclado = new Scanner(System.in);

        ////////// SOLICITA AS INFORMAÇÕES //////////
        System.out.println("Qual o nome do seu funcionário?");
        String nome = teclado.next();
        System.out.println("Quanto ele ganha por hora?");
        double salariohora = teclado.nextDouble();
        System.out.println("Qual a quantidade de horas que ele trabalhou nesse mês?");
        double horasmes = teclado.nextDouble();

        ////////// DESCONTOS //////////
        double salarioBRUTO = salariohora * horasmes;
        double descontoIR = (salarioBRUTO * 0.11);
        double descontoINSS = (salarioBRUTO * 0.08);
        double descontoSIND = (salarioBRUTO * 0.05);
        double salarioLIQUIDO = salarioBRUTO - descontoINSS - descontoIR - descontoSIND;
        
        //////// MES ATUAL ////////
        Calendar calendar = Calendar.getInstance();
        int mes = calendar.get(Calendar.MONTH);
        String[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};

        ////////// SAIDA //////////
        System.out.println("------------------");
        System.out.println("FOLHA DE PAGAMENTO");
        System.out.println("FUNCIONÁRIO: " +nome);
        System.out.println("MÊS: " +meses[mes]);
        System.out.println("------------------");
        
        System.out.println("O salário bruto deste funcionário foi de: R$" +salarioBRUTO);
        System.out.println("Foi pago ao Imposto de Renda uma quantia de: R$" +descontoIR);
        System.out.println("Foi pago ao INSS uma quantia de: R$" +descontoINSS);
        System.out.println("Foi pago ao Sindicato uma quantia de: R$" +descontoSIND);
        System.out.println("O salário líquido desse funcionário foi de: R$" +salarioLIQUIDO);
        teclado.close();
    }
}