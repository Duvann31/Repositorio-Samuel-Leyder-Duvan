public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double kg;
        double metros;
        double resultadoIMC;

        System.out.println("Por favor ingrese su peso en kilogramos:");
        kg = teclado.nextDouble();

        System.out.println("Por favor ingrese su estatura en metros:");
        metros = teclado.nextDouble();

        resultadoIMC = kg / (metros * metros);

        System.out.println("Su Índice de Masa Corporal es: " + resultadoIMC);

        if (resultadoIMC <= 18.5){
            System.out.println("Clasificación: Bajo peso");
        }

        if (resultadoIMC >= 18.5 && resultadoIMC <= 24.9){
            System.out.println("Clasificación: Peso adecuado");
        }

        if (resultadoIMC >= 25 && resultadoIMC <= 26.9){
            System.out.println("Clasificación: Sobrepeso nivel I");
        }

        if (resultadoIMC >= 27 && resultadoIMC <= 29.9){
            System.out.println("Clasificación: Sobrepeso nivel II");
        }

        if (resultadoIMC >= 30 && resultadoIMC <= 34.9){
            System.out.println("Clasificación: Obesidad grado I");
        }

        if (resultadoIMC >= 35 && resultadoIMC <= 39.9){
            System.out.println("Clasificación: Obesidad grado II");
        }

        if (resultadoIMC >= 40 && resultadoIMC <= 49.9){
            System.out.println("Clasificación: Obesidad mórbida");
        }

        if (resultadoIMC >= 50){
            System.out.println("Clasificación: Obesidad extrema");
        }
        }
    }
