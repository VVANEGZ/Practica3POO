import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cuenta> cuentas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta(1122, 20000, 4.5);

        cuenta1.withdraw(2500);
        cuenta1.deposit(3000);
        cuenta1.getMonthlyInterest();
        cuenta1.getDateCreated();

        System.out.println("==============================");
        cuentas.add(new Cuenta(0, 100, 4.5));
        Cuenta cuenta0 = new Cuenta(1, 20000, 4.5);
        cuentas.add(new Cuenta(2, 100, 4.5));
        cuentas.add(new Cuenta(3, 100, 4.5));
        cuentas.add(new Cuenta(4, 100, 4.5));
        cuentas.add(new Cuenta(5, 100, 4.5));
        cuentas.add(new Cuenta(6, 100, 4.5));
        cuentas.add(new Cuenta(7, 100, 4.5));
        cuentas.add(new Cuenta(8, 100, 4.5));
        cuentas.add(new Cuenta(9, 100, 4.5));

        System.out.println("Ingrese una identificacion, por favor: ");
        if (teclado.nextInt() > 9) {
            System.out.println("Identificacion incorrecta, intente nuevamente");
        } else{
            //menu
            int opcion;
            do {
                System.out.println("=====MENU====");
                System.out.println("1. Ver el saldo actual");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir del menu principal");
                switch (opcion = teclado.nextInt()) {
                    case 1:
                        System.out.println("Su saldo actual: ");
                        System.out.println(cuenta0.getBalance());
                        break;
                    case 2:
                        System.out.println("Ingrese cuanto va a retirar: ");
                        System.out.println(cuenta0.withdraw(teclado.nextInt()));
                        break;
                    case 3:
                        System.out.println("Ingrese cuanto va a depositar: ");
                        System.out.println(cuenta0.deposit(teclado.nextInt()));
                        break;
                    case 4:
                        System.out.println("Saliendo del menu..."); break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                }

            } while (opcion < 4);
        }

    }
}