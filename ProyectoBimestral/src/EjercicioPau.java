import java.util.Scanner;

public class EjercicioPau {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        //DECLARACION DE VARIABLES
        int dia, respuesta, momento, tipo;
        double promedio, porcentaje, totalComidasReali = 0;
        String nombreMomento = null, nombreDia = null ;
        int totalComidasOmi = 0, frutas= 0, cereales = 0, carne= 0, otros = 0, 
                totalD = 0, totalA = 0, totalC = 0, diasCompletos =0;
        //INICIO DEL PROCESO
        //Inicio ciclo cada dia
        for (int i = 1; i <= 7; i++) {
            dia = i;
            switch (dia) {
                case 1:
                    nombreDia = "LUNES";
                    break;
                case 2:
                    nombreDia = "MARTES";
                    break;
                case 3:
                    nombreDia = "MIERCOLES";
                    break;
                case 4:
                    nombreDia = "JUEVES";
                    break;
                case 5:
                    nombreDia = "VIERNES";
                    break;
                case 6:
                    nombreDia = "SABADO";
                    break;
                case 7:
                    nombreDia = "DOMINGO";
                    break;
            }
            System.out.println("---- DIA " + nombreDia + " ----");
            int realizadasDia = 0;
            int omitidasDia = 0;
            //Inicio ciclo tres momentos del dia
            for (int j = 1; j <= 3; j++) {
                momento = j;
                switch (momento) {
                    case 1:
                        nombreMomento = "desayuno";
                        break;
                    case 2:
                        nombreMomento = "almuerzo";
                        break;
                    case 3:
                        nombreMomento = "cena";
                        break;       
                }
                System.out.print("- Completaste tu " + nombreMomento + "? "
                        + "(1: si, 2: no)"
                        + ": ");
                respuesta = tcl.nextInt();
                System.out.println(" ");
                while (respuesta != 1 && respuesta!=2){
                    System.out.print("Asegurese de ingresar una de las "
                            + "opciones (1: si, 2: no): ");
                    respuesta = tcl.nextInt();
                    System.out.println(" ");
                }
                if (respuesta == 1){
                    totalComidasReali += 1;
                    realizadasDia += 1;
                    System.out.println("Que tipo de comida consumiste?");
                    System.out.println("  1 Frutas y verduras ");
                    System.out.println("  2 Cereales y tuberculos");
                    System.out.println("  3 Carne, huevos y legumbres");
                    System.out.println("  4 Otros");
                    System.out.print("Ingresa tu respuesta: ");
                    tipo = tcl.nextInt();
                    while (tipo<1 || tipo>4){
                        System.out.print("Asegurese de ingresar una de las "
                                + "opciones (1, 2, 3 o 4): ");
                        tipo = tcl.nextInt();
                    }
                    switch (tipo) {
                        case 1:
                            frutas += 1;
                            break;
                        case 2:
                            cereales += 1;
                            break;
                        case 3:
                            carne += 1;
                            break;
                        case 4:
                            otros += 1;
                            break;
                    }
                    System.out.println("Perfecto, se ha registrado tu "+
                            nombreMomento);
                    System.out.println(" ");
                }
                else{
                    totalComidasOmi += 1;
                    omitidasDia += 1;
                }
                if (momento==1 && respuesta==1)
                    totalD += 1;
                if (momento==2 && respuesta==1)
                    totalA += 1;
                if (momento==3 && respuesta==1)
                    totalC += 1;
            }//Fin ciclo tres dias
            System.out.println("-RESUMEN DIARIO-");
            System.out.println(" Comidas realizadas al dia: " + realizadasDia );
            System.out.println(" Comidas omitidas al dia: " + omitidasDia);
            System.out.println(" ");
        if (realizadasDia == 3)
            diasCompletos += 1;
        }//Fin ciclo cada dia 
        promedio = totalComidasReali/7;
        porcentaje = (totalComidasReali*100)/21;//FIN PROCESO
        //SALIDAS
        System.out.println("---- RESUMEN SEMANAL ----");
        System.out.println("Comidas realizadas en la semana: "+
                totalComidasReali);
        System.out.println("Cantidad de desayunos: "+totalD);
        System.out.println("Cantidad de almuerzos: "+totalA);
        System.out.println("Cantidad de cenas: "+totalC);
        System.out.println("Comidas omitidas: "+totalComidasOmi);
        System.out.println("Frutas y verduras consumidas: "+frutas);
        System.out.println("Cereales y tuberculos: "+cereales);
        System.out.println("Carnes, huevos y legumbres: "+carne);
        System.out.println("Otros consumidos: "+otros);
        System.out.println("Promedio de comidas diarias: "+promedio);
        System.out.println("Porcentaje de comidas en la semana: "+porcentaje);
        System.out.println("Dias que completaste las tres comidas: "
                +diasCompletos);
    }    
}