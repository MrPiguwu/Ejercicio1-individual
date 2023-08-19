import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hola en este programa te ayudaremos a verificar y comprar tus boletos para Tomorrowland\n");
        System.out.println("---------------------------------------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nueva solicitud de boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");

            try {
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Necesitamos algunos datos para poder hacer todo el proceso de manera correcta\n");
                        System.out.println("Tu nombre: ");
                        String userName = sc.nextLine();
                        System.out.println("DPI:");
                        double dpiUser = sc.nextDouble();
                        System.out.println("Presupuesto maximo: presupuesto minimo (400$)");
                        int prUser = sc.nextInt();

                        Metodos cm = new Metodos();

                        if (cm.sumTotal() == true){
                            cm.verPresupuesto(prUser);
                        } else {
                            System.exit(0);
                        }

                        break;
                    case 2:
                        System.out.println("Presupuesto maximo: presupuesto minimo (400$)");
                        int prUser2 = sc.nextInt();

                        Metodos cms = new Metodos();
                        if (cms.sumTotal() == true){
                            cms.verPresupuesto(prUser2);
                        } else {
                            break;
                        }
                    case 3:
                        Metodos cmss = new Metodos();
                        cmss.verVentas();
                        break;
                    case 4:
                        Metodos cmc = new Metodos();
                        cmc.verLocalidades();
                        break;

                    case 5:
                        Metodos cmj = new Metodos();
                        cmj.verGanancia();
                        break;
                    case 6:
                        sc.close();
                        return;
                    default:
                        System.out.println("Opción inválida");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido");
                sc.nextLine();
            }
        }

    }
}
