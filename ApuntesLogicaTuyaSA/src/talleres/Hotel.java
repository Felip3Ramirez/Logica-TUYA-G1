package talleres;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays para almacenar información de habitaciones
        String[] roomTypes = {"Individual", "Doble", "Suite"};
        double[] roomPrices = {50.0, 80.0, 120.0};

        // Arrays para almacenar información de clientes
        String[] clientNames = new String[10];
        int[] clientRoomTypes = new int[10];
        int[] clientStayDays = new int[10];
        double[] clientExtras = new double[10];

        int clientCount = 0;
        boolean continueRegistration = true;

        while (continueRegistration && clientCount < 10) {
            System.out.println("\n--- Registro de Cliente ---");

            System.out.print("Nombre del cliente: ");
            clientNames[clientCount] = scanner.nextLine();

            System.out.println("Tipos de habitación disponibles:");
            for (int i = 0; i < roomTypes.length; i++) {
                System.out.println((i + 1) + ". " + roomTypes[i] + " - $" + roomPrices[i] + " por noche");
            }

            System.out.print("Seleccione el tipo de habitación (1-3): ");
            clientRoomTypes[clientCount] = scanner.nextInt() - 1;

            System.out.print("Número de noches: ");
            clientStayDays[clientCount] = scanner.nextInt();

            System.out.print("Gastos extras (servicio a la habitación, minibar, etc.): $");
            clientExtras[clientCount] = scanner.nextDouble();

            scanner.nextLine(); // Limpiar el buffer

            System.out.print("¿Desea registrar otro cliente? (s/n): ");
            String response = scanner.nextLine();
            continueRegistration = response.equalsIgnoreCase("s");

            clientCount++;
        }

        System.out.println("\n--- Facturas de Clientes ---");

        for (int i = 0; i < clientCount; i++) {
            double subtotal = roomPrices[clientRoomTypes[i]] * clientStayDays[i];
            double total = subtotal + clientExtras[i];
            double tax = total * 0.12; // 12% de impuesto
            double finalTotal = total + tax;

            System.out.println("\nFactura para " + clientNames[i]);
            System.out.println("Tipo de habitación: " + roomTypes[clientRoomTypes[i]]);
            System.out.println("Número de noches: " + clientStayDays[i]);
            System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
            System.out.println("Gastos extras: $" + String.format("%.2f", clientExtras[i]));
            System.out.println("Impuestos: $" + String.format("%.2f", tax));
            System.out.println("Total a pagar: $" + String.format("%.2f", finalTotal));

            System.out.println("\nDesglose de pagos:");
            System.out.print("Seleccione el método de pago (1. Efectivo, 2. Tarjeta de crédito, 3. Transferencia): ");
            int paymentMethod = scanner.nextInt();

            switch (paymentMethod) {
                case 1:
                    System.out.println("Pago en efectivo recibido.");
                    break;
                case 2:
                    System.out.println("Pago con tarjeta de crédito procesado.");
                    break;
                case 3:
                    System.out.println("Transferencia bancaria recibida.");
                    break;
                default:
                    System.out.println("Método de pago no reconocido.");
            }
        }
    }
}
