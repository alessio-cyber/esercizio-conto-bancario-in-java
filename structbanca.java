import java.util.Scanner;

public class structbanca{
    public static void main(String[] args) {
        

        final int aleCode = 23;
        final String aleUser = "alessio";
        final String alePass = "alessioss";
        int aleConto = 3000;

        
        final int samirCode = 10;
        final String samirUser = "samir";
        final String samirPass = "samirss";
        int samirConto = 5000;


        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter code:");
            int code = input.nextInt();
            input.nextLine();

            System.out.println("Enter user:");
            String user = input.nextLine();

            System.out.println("Enter password:");
            String passw = input.nextLine();

            
            int currentConto = 0;
            boolean isAuthenticated = false;

        
            if (code == aleCode && aleUser.equals(user) && alePass.equals(passw)) {
                currentConto = aleConto;
                isAuthenticated = true;
                System.out.println("Welcome, Alessio!");
            } else if (code == samirCode && samirUser.equals(user) && samirPass.equals(passw)) {
                currentConto = samirConto;
                isAuthenticated = true;
                System.out.println("Welcome, Samir!");
            } else {
                System.out.println("Errore credenziali!");
            }

            if (isAuthenticated) {
                int scelta;
                do {
                    System.out.println("\nOPERAZIONI CREDITO");
                    System.out.println("1. Visualizza credito");
                    System.out.println("2. Preleva credito");
                    System.out.println("3. Deposita credito");
                    System.out.println("4. Esci dal programma");
                    System.out.print("-->");
                    scelta = input.nextInt();

                    switch (scelta) {
                        case 1 : {
                            System.out.println("Conto in banca: " + currentConto);
                        }break;

                        case 2 : {
                            System.out.print("Inserisci somma da prelevare: ");
                            int preleva = input.nextInt();
                            if (preleva > currentConto) {
                                System.out.println("Somma insufficiente");
                            } else {
                                currentConto -= preleva;
                                System.out.println("Saldo rimanente: " + currentConto);
                            }
                        }break;
                            

                        case 3 : {
                            System.out.print("Inserisci somma da depositare: ");
                            int deposita = input.nextInt();
                            currentConto += deposita;
                            System.out.println("Saldo totale aggiornato: " + currentConto);
                        }break;

                        case 4 : {
                            System.out.println("uscita dal servizio...");
                        }break;

                        default : {
                            System.out.println("Scelta non valida");
                        }break;
                    }
                } while (scelta != 4);
            }
        }
    }
}
