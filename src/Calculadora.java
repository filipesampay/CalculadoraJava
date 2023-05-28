public class Calculadora {
    double Soma;
    double Subtracao;
    double Divisao;
    double Multiplicacao;

    public double Soma(double Num, double Num2){
        Soma = Num+Num2;
        return Soma;
    }

    public double Subtracao(double Num, double Num2){
        Subtracao = Num - Num2;
        return Subtracao;
    }

    public double Divisao(double Num, double Num2){
        if(Num2 == 0)
            throw new ArithmeticException("Divisao por zero nao permitida");
        else{
            Divisao = Num/Num2;
            return Divisao;
        }
    }

    public double Multiplicacao(double Num, double Num2){
        Multiplicacao = Num * Num2;
        return Multiplicacao;
    }
}
