import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        ////////// SETA AS VARIAVEIS //////////
        double salariohora;
        double horasmes;
        String nome;
        Scanner teclado = new Scanner(System.in);

        ////////// SOLICITA AS INFORMAÇÕES //////////
        System.out.println("Qual o nome do seu funcionário?");
        nome = teclado.next();
        System.out.println("Quanto ele ganha por hora?");
        salariohora = teclado.nextDouble();
        System.out.println("Qual a quantidade de horas que ele trabalhou nesse mês?");
        horasmes = teclado.nextDouble();

        ////////// DESCONTOS //////////
        double salarioBRUTO = salariohora * horasmes;
        double descontoIR = (salarioBRUTO * 0.11);
        double descontoINSS = (salarioBRUTO * 0.08);
        double descontoSIND = (salarioBRUTO * 0.05);
        double salarioLIQUIDO = salarioBRUTO - descontoINSS - descontoIR - descontoSIND;
        
        //////// MES ATUAL ////////
        Calendar calendar = Calendar.getInstance();
        int mes = calendar.get(Calendar.MONTH) + 1;

        ////////// SAIDA //////////
        System.out.println("------------------");
        System.out.println("FOLHA DE PAGAMENTO");
        System.out.println("FUNCIONÁRIO: " +nome);
        if (mes == 1) {
            System.out.println("MÊS: JANEIRO");
            } else if (mes == 2) {
                System.out.println("MÊS: FEVEREIRO");
            } else if (mes == 3) {
                System.out.println("MÊS: MARÇO");
            } else if (mes == 4) {
                System.out.println("MÊS: ABRIL");
            } else if (mes == 5) {
                System.out.println("MÊS: MAIO");
            } else if (mes == 6) {
                System.out.println("MÊS: JUNHO");
            } else if (mes == 7) {
                System.out.println("MÊS: JULHO");
            } else if (mes == 8) {
                System.out.println("MÊS: AGOSTO");
            } else if (mes == 9) {
                System.out.println("MÊS: SETEMBRO");
            } else if (mes == 10) {
                System.out.println("MÊS: OUTUBRO");
            } else if (mes == 11) {
                System.out.println("MÊS: NOVEMBRO");
            } else if (mes == 12) {
                System.out.println("MÊS: DEZEMBRO");
            }
            System.out.println("------------------");
        
        System.out.println("O salário bruto deste funcionário foi de: R$" +salarioBRUTO);
        System.out.println("Foi pago ao Imposto de Renda uma quantia de: R$" +descontoIR);
        System.out.println("Foi pago ao INSS uma quantia de: R$" +descontoINSS);
        System.out.println("Foi pago ao Sindicato uma quantia de: R$" +descontoSIND);
        System.out.println("O salário líquido desse funcionário foi de: R$" +salarioLIQUIDO);
        teclado.close();
    }
}