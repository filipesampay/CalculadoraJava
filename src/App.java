import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner Teclado = new Scanner(System.in);
        double Num, Num2;
        String Selecao;

        System.out.println("Digite a operação desejada [+] [-] [/] [*]");
        Selecao = Teclado.nextLine();
        
        System.out.println("Digite dois numeros");
        Num = Teclado.nextDouble(); Num2 = Teclado.nextDouble();
        
        Teclado.close();

        Calculadora Calc = new Calculadora();
        
        double Resultado=0;

        DecimalFormat dFormat = new DecimalFormat("#.##");

        switch (Selecao){
            default:
                System.out.println("Opção invalida. ");
                break;
            case "+":
                Resultado = Calc.Soma(Num, Num2);
                System.out.println("Resultado da soma é " + dFormat.format(Resultado));
                break;
            case "-":
                Resultado = Calc.Subtracao(Num, Num2);
                System.out.println("Resultado da subtração é " + dFormat.format(Resultado));
                break;
            case "/":
                try {
                    Resultado = Calc.Divisao(Num, Num2);
                } catch (ArithmeticException e) {
                    System.out.println("ERRO! " + e.getMessage());
                    break;
                }
                System.out.println("Resultado da divisão é " + dFormat.format(Resultado));
                break;
            case "*":
                Resultado = Calc.Multiplicacao(Num, Num2);
                System.out.println("Resultado da subtração é " + dFormat.format(Resultado));
                break;

            
        }
        System.out.println("Bom dia ai nessa porra q eu to curioso");
    } 
}
