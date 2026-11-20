import java.util.Scanner;
public class PruebaOptimizacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int desayuno = 0, almuerzo = 0, cena = 0, tipoAlimento = 0, cereales = 0, 
                carnes = 0, frutas = 0, otros = 0, diasCompletos = 0, completoDia = 0,
                comida;
        double comidasReali, comidasOmit, promedioComidas, porcentajeComida;
        char condicionComida;
        String nombreComida = "inicializacion";
        for (int i = 1; i <= 7; i++) {
            completoDia = 0;
            for (comida = 1; comida <= 3; comida++) {
                do {
                    switch (comida) {
                        case 1:
                            nombreComida = "desayuno";
                            break;
                        case 2:
                            nombreComida = "almuerzo";
                            break;
                        case 3:
                            nombreComida = "cena";
                            break;
                    }
                    System.out.printf("Comiste %s en el dia %d? (S/N): ", nombreComida, i);
                    condicionComida = tcl.next().charAt(0);
                    condicionComida = Character.toUpperCase(condicionComida);
                    if (condicionComida == 'S'){
                        completoDia++;
                        switch (comida) {
                            case 1:
                                desayuno++;
                                break;
                            case 2:
                                almuerzo++;
                                break;
                            case 3:
                                cena++;
                                break;
                        }
                        do {
                            System.out.println("---- Comidas ----");
                            System.out.println("1: Frutas y Verduras");
                            System.out.println("2: Cereales y Tuberculos");
                            System.out.println("3: Carnes, Huevos y Legumbres");
                            System.out.println("4: Otros");
                            System.out.print("Seleccione la opcion del alimento consumido: ");
                            tipoAlimento = tcl.nextInt();
                            switch (tipoAlimento) {
                                case 1:
                                    frutas++;
                                    System.out.printf("--- Tu %s del dia %d fue registrado correctamente. ---%n", nombreComida, i);
                                    break;
                                case 2:
                                    cereales++;
                                    System.out.printf("--- Tu %s del dia %d fue registrado correctamente. ---%n", nombreComida, i);
                                    break;
                                case 3:
                                    carnes++;
                                    System.out.printf("--- Tu %s del dia %d fue registrado correctamente. ---%n", nombreComida, i);
                                    break;
                                case 4:
                                    otros++;
                                    System.out.printf("--- Tu %s del dia %d fue registrado correctamente. ---%n", nombreComida, i);
                                    break;
                                default:
                                    System.out.println("Valor invalido, seleccione un valor del menu disponible.");
                            }
                        } while (tipoAlimento < 1 || tipoAlimento > 4);
                    }
                    else
                        if (condicionComida != 'N')
                            System.out.println("Opcion  invalida, intente nuevamente.");
                } while (condicionComida != 'S' && condicionComida != 'N');
            }
            if (completoDia == 3)
                diasCompletos += 1;
        }
        comidasReali = desayuno + almuerzo + cena;
        comidasOmit = 21 - comidasReali;
        promedioComidas = comidasReali / 7;
        porcentajeComida = comidasReali * 100 / 21;
        System.out.printf("--- A continuacion se muestran los datos de las comidas de la semana: ---%n"
                + "1. Las comidas realizadas en la semana fueron: %.0f%n"
                + "2. Desayunos: %d%n3. Almuerzos: %d%n4. Cenas: %d%n5. Comidas omitidas %.0f%n"
                + "6. Frutas y Verduras consumidas: %d%n7. Cereales y Tuberculos consumidos: %d%n"
                + "8. Carnes, huevos y legumbres consumidos: %d%n9. Otros alimentos consumidos: %d%n"
                + "10. Promedio de comidas diarias %.2f%n11. Porcentaje de comidas realizadas: %.2f%n"
                + "12. Dias en los que se completaron las 3 comidas: %d%n", comidasReali, desayuno, 
                almuerzo, cena, comidasOmit, frutas, cereales, carnes, otros, promedioComidas,
                porcentajeComida, diasCompletos);
    }
}