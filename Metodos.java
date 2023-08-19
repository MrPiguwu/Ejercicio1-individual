import java.util.Scanner;

public class Metodos {
    static int loc1 = 20;
    static int loc5 = 20;
    static int loc10 = 20;

    public static void verGanancia() {
        int falt1 = (20 - loc1) * 400;
        int falt5 = (20 - loc5) * 695;
        int falt10 = (20 - loc10) * 2350;

        System.out.println("Dinero generado en localidad 1: " + falt1);
        System.out.println("Dinero generado en localidad 5: " + falt5);
        System.out.println("Dinero generado en localidad 10: " + falt10);
    }

    public static void verLocalidades(){
        System.out.println("Ingresa el numero de localidad que deseas ver");
        System.out.println("1. Localidad 1");
        System.out.println("2. Localidad 5");
        System.out.println("3. Localidad 10");
        Scanner scc = new Scanner(System.in);
        int opcion = scc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La cantidad disponible de boletos es: " + loc1);
                break;

            case 2:
                System.out.println("La cantidad disponible de boletos es: " + loc5);
                break;

            case 3:
                System.out.println("La cantidad disponible de boletos es: " + loc5);
                break;

            default:
                System.out.println("Número inválido de localidad");
                break;
        }
    }
    public static void verVentas(){
        int falt1 = 20 - loc1;
        int falt5 = 20 - loc5;
        int falt10 = 20 - loc10;

        System.out.println("Boletos vendidos en localidad 1:" + falt1);
        System.out.println("Boletos vendidos en localidad 5:" + falt5);
        System.out.println("Boletos vendidos en localidad 10:" + falt10);
    }

    public static boolean sumTotal() {
        Random rd = new Random();

        int rand_1 = rd.nextInt(33000) + 1;

        int a = rd.nextInt(15000) + 1;
        int b = rd.nextInt(15000) + 1;

        int sumT = a+b+rand_1;

        if(sumT % 2 == 0){
            System.out.println("Tienes el presupuesto adecuado para comprar un boleto");
            return true;
        }else {
            System.out.println("Lo sentimos no eres apto a comprar un boleto. Vuelve a intentarlo.");
            return false;
        }

    }

    public static void verPresupuesto(int val) {
        if(val >= 2300){
            Random rand = new Random();
            int rand1 = rand.nextInt(3) + 1;
            if(rand1 == 1){
                System.out.println("Felicidades! te tocó en la localidad 1");
                aval(1, val);
            } else if (rand1 == 2){
                System.out.println("Felicidades! te tocó en la localidad 5");
                aval(5, val);
            } else {
                System.out.println("Felicidades! te tocó en la localidad 10");
                aval(10, val);
            }

        } else if(val >= 695){
            Random rand = new Random();
            int rand1 = rand.nextInt(2) + 1;
            if(rand1 == 1){
                System.out.println("Felicidades! te tocó en la localidad 1");
                aval(1, val);
            } else if (rand1 == 2){
                System.out.println("Felicidades! te tocó en la localidad 5");
                aval(5, val);
            }

        } else {
            System.out.println("Felicidades! te tocó en la localidad 1");
            aval(1, val);
        }
    }

    private static void aval(int prs, int val) {
        switch(prs){
            case 1:
                Scanner s = new Scanner(System.in);
                System.out.println("Elige la cantidad de boletos que deseas comprar:");
                int cant1 = s.nextInt();
                int tota1 = cant1 * 400;
                if(tota1 <= val){
                    if(loc1 == 0){
                        System.out.println("Lastimosamente la localidad esta totalmente agotada");
                    } else {
                        if(cant1 <= loc5){
                            loc1 = loc1 - cant1;
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        } else {
                            loc10 = 0;
                            System.out.println("La cantidad de boletos que deseas no esta disponible, te acreditamos la cantidad maxima posible\n");
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        }
                    }
                } else {
                    System.out.println("La cantidad de boletos de que deseas comprar sobrepasa tu presupuesto. Vuelve a intentarlo");
                }
                break;
            case 5:
                Scanner ss = new Scanner(System.in);
                System.out.println("Elige la cantidad de boletos que deseas comprar:");
                int cant5 = ss.nextInt();
                int tota5 = cant5 * 695;
                if(tota5 <= val){
                    if(loc5 == 0){
                        System.out.println("Lastimosamente la localidad esta totalmente agotada");
                    } else {
                        if(cant5 <= loc5){
                            loc5 = loc5 - cant5;
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        } else {
                            loc10 = 0;
                            System.out.println("La cantidad de boletos que deseas no esta disponible, te acreditamos la cantidad maxima posible\n");
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        }
                    }
                } else {
                    System.out.println("La cantidad de boletos de que deseas comprar sobrepasa tu presupuesto. Vuelve a intentarlo");
                }
                break;

            case 10:
                Scanner cs = new Scanner(System.in);
                System.out.println("Elige la cantidad de boletos que deseas comprar:");
                int cant10 = cs.nextInt();
                int tota10 = cant10 * 2350;
                if(tota10 <= val){
                    if(loc10 == 0){
                        System.out.println("Lastimosamente la localidad esta totalmente agotada");
                    } else {
                        if(cant10 <= loc10){
                            loc10 = loc10 - cant10;
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        } else {
                            loc10 = 0;
                            System.out.println("La cantidad de boletos que deseas no esta disponible, te acreditamos la cantidad maxima posible\n");
                            System.out.println("Felicidades eres uno de los afortunado en conseguir boletos");
                        }
                    }
                } else {
                    System.out.println("La cantida de boletos de que deseas comprar sobrepasa tu presupuesto. Vuelve a intentarlo");
                }
                break;
        }
    }

}
