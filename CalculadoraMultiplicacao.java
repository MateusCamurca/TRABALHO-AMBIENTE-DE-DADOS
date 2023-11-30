public class Calculadoramultiplicacao {
 public int multiplicar (int a, int b){
 return a * b;
 }


public double multiplicar (double a, double b){
    return a * b;
}
public static void main(String[] args) {
        CalculadoraMultiplicacao calculadora = new CalculadoraMultiplicacao();
        int resultadoMultiplicacaoInt = calculadora.multiplicar(5, 3);
        double resultadoMultiplicacaoDouble = calculadora.multiplicar(2.5, 4.2);
        System.out.println("Resultado da multiplicação (int): " + resultadoMultiplicacaoInt);
        System.out.println("Resultado da multiplicação (double): " + resultadoMultiplicacaoDouble);
    }

}