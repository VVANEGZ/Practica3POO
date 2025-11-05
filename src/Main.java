import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //matriz
        Cuenta[] cuentas = new Cuenta[10];
        for (int i = 0; i < 10; i++) {
            cuentas[i] = new Cuenta(i, 100.0);
        }

        while (true) {
            Cuenta cuentaActual = null;
            int id;
            while (cuentaActual == null) {
                System.out.println("Ingrese una identificacion: ");
                id = teclado.nextInt();

                if (id >= 0 && id < 10) {
                    cuentaActual = cuentas[id];
                } else {
                    System.out.println("ID incorrecto. Ingrese uno valido.");
                }
            }
            //menu
            int opcion;
            do {
                System.out.println("\n=====MENU====");
                System.out.println("1. Ver el saldo actual");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir del menu principal");
                System.out.println("Ingrese una opcion: ");
                switch (opcion = teclado.nextInt()) {
                    case 1:
                        System.out.println("Su saldo actual: " + cuentaActual.getBalance());
                        break;
                    case 2:
                        System.out.println("Ingrese cuanto va a retirar: ");
                        cuentaActual.withdraw(teclado.nextDouble());
                        break;
                    case 3:
                        System.out.println("Ingrese cuanto va a depositar: ");
                        cuentaActual.deposit(teclado.nextDouble());
                        break;
                    case 4:
                        System.out.println("Saliendo del menu...");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                }

            } while (opcion != 4);

        }
    }
}
