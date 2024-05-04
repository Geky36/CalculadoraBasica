import java.util.Scanner;

public class Calculadora {

    private int numeroA;
    private int numeroB;
    private String operador;

    public int ingresarNumero(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje+" = ");
        int num = entrada.nextInt();
        return num;
    }

    public String ingresarOperador (String mensaje){
        Scanner cadena = new Scanner(System.in);
        System.out.print(mensaje+" --> ");
        String operacion = cadena.next();
        return operacion;
    }

    public int calcular (String operador, int num1, int num2){
        Operaciones operacion = new Operaciones();
        int respuesta=0;
        switch (operador){
            case "+": respuesta = operacion.suma2Numeros(num1,num2);
                break;
            case "-": respuesta = operacion.resta2Numeros(num1,num2);
                break;
            case "*": respuesta = operacion.multiplica2Numeros(num1,num2);
                break;
            case "/" : respuesta = operacion.divide2Numeros(num1,num2);
            default:
                System.out.print("Revise bien los datos ingresados porfavor :)");
        }
        return respuesta;
    }

    public void realizarOperacion() {
        this.numeroA = ingresarNumero("Primer Numero");
        this.numeroB = ingresarNumero("Segundo Numero");
        this.operador = ingresarOperador("Operador");
        int result = calcular(operador, this.numeroA, this.numeroB);
        System.out.print(this.numeroA +" " +operador +" "+ this.numeroB + " = " + result);
    }

    //constructor
    public Calculadora(){
        this.numeroA = 0;
        this.numeroB = 0;
    }

}

