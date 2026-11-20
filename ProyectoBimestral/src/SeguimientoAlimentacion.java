import java.util.Scanner;
public class SeguimientoAlimentacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int desayuno = 0;
        int almuerzo = 0;
        int cena = 0;
        int tipoAlimento = 0;
        int comidasReali = 0;
        int comidasOmit = 0;
        int cereales = 0;
        int carnes = 0;
        int frutas = 0;
        int otros = 0;
        int diasCompletos = 0;
        int completoDia = 0;
        double promedioComidas;
        double porcentajeComida;
        boolean condicionComida;
        for (int i = 1; i < 8; i++) {
            completoDia = 0;
            System.out.print("Comiste el desayuno en el día " + i + " (true/false): ");
            condicionComida = tcl.nextBoolean();
            if (condicionComida == true){
                desayuno += 1;
                completoDia += 1;
                do {
                    System.out.println("Seleccione la opción del alimento consumido:");
                    System.out.println("1: Frutas y Verduras");
                    System.out.println("2: Cereales y Tubérculos");
                    System.out.println("3: Carnes, Huevos y Legumbres");
                    System.out.println("4: Otros");
                    tipoAlimento = tcl.nextInt();
                    switch (tipoAlimento) {
                        case 1:
                            frutas += 1;
                            break;
                        case 2:
                            cereales += 1;
                            break;
                        case 3:
                            carnes += 1;
                            break;
                        case 4:
                            otros += 1;
                            break;
                        default:
                            System.out.println("Valor inválido, intente de nuevo.");
                    }
                } while (tipoAlimento < 1 || tipoAlimento > 4);
            }
            System.out.print("Comiste el almuerzo en el día " + i + " (true/false): ");
            condicionComida = tcl.nextBoolean();
            if (condicionComida == true){
                almuerzo += 1;
                completoDia += 1;
                do {
                    System.out.println("Seleccione la opción del alimento consumido:");
                    System.out.println("1: Frutas y Verduras");
                    System.out.println("2: Cereales y Tubérculos");
                    System.out.println("3: Carnes, Huevos y Legumbres");
                    System.out.println("4: Otros");
                    tipoAlimento = tcl.nextInt();
                    switch (tipoAlimento) {
                        case 1:
                            frutas += 1;
                            break;
                        case 2:
                            cereales += 1;
                            break;
                        case 3:
                            carnes += 1;
                            break;
                        case 4:
                            otros += 1;
                            break;
                        default:
                            System.out.println("Valor inválido, intente de nuevo.");
                    }
                } while (tipoAlimento < 1 || tipoAlimento > 4);
            }
            System.out.print("Comiste cena en el día " + i + " (true/false): ");
            condicionComida = tcl.nextBoolean();
            if (condicionComida == true){
                cena += 1;
                completoDia += 1;
                do {
                    System.out.println("Seleccione la opción del alimento consumido:");
                    System.out.println("1: Frutas y Verduras");
                    System.out.println("2: Cereales y Tubérculos");
                    System.out.println("3: Carnes, Huevos y Legumbres");
                    System.out.println("4: Otros");
                    tipoAlimento = tcl.nextInt();
                    switch (tipoAlimento) {
                        case 1:
                            frutas += 1;
                            break;
                        case 2:
                            cereales += 1;
                            break;
                        case 3:
                            carnes += 1;
                            break;
                        case 4:
                            otros += 1;
                            break;
                        default:
                            System.out.println("Valor inválido, intente de nuevo.");
                    }
                } while (tipoAlimento < 1 || tipoAlimento > 4);
            }            
            if (completoDia == 3)
                diasCompletos += 1;
        }
        comidasReali = desayuno + almuerzo + cena;
        comidasOmit = 21 - comidasReali;
        promedioComidas = comidasReali / 21;
        porcentajeComida = comidasReali * 100 / 21;
        System.out.println("Las comidas realizadas en la semana fueron: " + comidasReali);
        System.out.println("Desayunos: " + desayuno);
        System.out.println("Almuerzos: " + almuerzo);
        System.out.println("Cenas: " + cena);
        System.out.println("Comidas omitidas: " + comidasOmit);
        System.out.println("Frutas y Verduras consumidas: " + frutas);
        System.out.println("Cereales y Tubérculos consumidos: " + cereales);
        System.out.println("Carnes, Huevos y Legumbres: " + carnes);
        System.out.println("Otros alimentos: " + otros);
        System.out.println("Promedio comidas diarias: " + promedioComidas);
        System.out.println("Porcentaje de comidas realizadas en la semana: " + porcentajeComida + "%");
        System.out.println("Dias en los que se completaron las 3 comidas: " + diasCompletos);
    }
}