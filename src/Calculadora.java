public class Calculadora {
    public static void main(String[] args) {
        float primerNumero = 18;
        float segundoNumero = 7;
        

        System.out.println("----CALCULADORA----");
        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicación: " + (primerNumero * segundoNumero));
        System.out.printf("División:  %.2f%n", (primerNumero / segundoNumero));
    }
}