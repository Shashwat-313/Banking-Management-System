import java.util.Scanner;

class TestATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scan.next();

        if (!password.equals("1111")) {
            System.out.println("Invalid password");
            return;
        }

        System.out.print("Enter account number: ");
        int account = scan.nextInt();

        ATM atm = new ATM(account);

        int choice;
        do {
            System.out.println("\n--- BANK ATM ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    atm.deposit(scan.nextInt());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    atm.withdraw(scan.nextInt());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
