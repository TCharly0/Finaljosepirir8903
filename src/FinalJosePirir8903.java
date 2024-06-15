import java.util.Scanner;
public class FinalJosePirir8903 {
 public static void main (String[] args) {

  Scanner Scanner = new Scanner(System.in);

  System.out.println("Selecciona el ejercicio que desees ejecutar: ");
  System.out.println("1. Variable resultado. ");
  System.out.println("2. Tabla de multiplicar . ");
  System.out.println("3. Dos numeros y un operador  . ");
  System.out.println("4. Numero primo o no   . ");
  System.out.println("5. Salir   . ");

  int opcion = Scanner.nextInt();
  switch (opcion) {
   case 1:
    System.out.println("Ejercicio 1 ejecutando: ");
    ejecutarVariableresuldo(Scanner);
    break;

    case 2:
     System.out.println("Ejercicio 2 ejecutando: ");
     ejecutarTabladeMultiplicar(Scanner);
     break;

     case 3:
      System.out.println("Ejercicio 3 ejecutando: ");
      ejecutarDosnumerosyunOperador(Scanner);
      break;

      case 4:
       System.out.println("Ejercicio 4 ejecutando: ");
       ejecutarNumeroPrimoono(Scanner);
       break;
   default:
    System.out.println("Opcion no valida.");
  }
  Scanner.close();

 }
 public static void ejecutarTabladeMultiplicar(Scanner scanner) {
  int numero;
  do {

 System.out.println("Tabla de multiplicar del " + numero + ":");

}
 }
