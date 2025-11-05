public class PruebaCuenta {
    public static void main(String [] args){
        Cuenta cuenta1= new Cuenta(1122, 2000);

        cuenta1.setAnnualInterestRate(4.5);
        cuenta1.withdraw(2500);
        cuenta1.deposit(3000);

        System.out.println("Su balance es: "+cuenta1.getBalance());
        System.out.println("Interes mensual: "+ cuenta1.getMonthlyInterest());
        System.out.println("Fecha de creacion: "+ cuenta1.getDateCreated());
    }
}
