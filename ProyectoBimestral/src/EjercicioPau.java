import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int respuesta, momento, tipo;
        double promedio, porcentaje;
        String nombre = null;
        boolean comida;
        int comidaRealizada = 0,comidasOmitidas = 0, frutas= 0, cereales = 0, 
                carne= 0, otros = 0, totalD = 0, totalA = 0, totalC = 0, 
                diasCompletos =0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("---Dia " +i+" ---");
            int realizadasDia = 0;
            for (int j = 1; j <= 3; j++) {
                momento = j;
                switch (momento) {
                    case 1:
                        nombre = "desayuno";
                        break;
                    case 2:
                        nombre = "almuerzo";
                        break;
                    case 3:
                        nombre = "cena";
                        break;       
                }
                System.out.println("Comió "+ nombre+" (Si: 1, No: 2)");
                respuesta = tcl.nextInt();
                while (respuesta != 1 && respuesta!=2){
                    System.out.println("Asegurese de ingresar una de las "
                            + "opciones");
                    respuesta = tcl.nextInt();
                }
                comida = (respuesta==1);
                if (comida == true){
                    comidaRealizada += 1;
                    realizadasDia += 1;
                    System.out.println("Ingrese el numero del tipo de comida:");
                    System.out.println("1 Frutas y verduras ");
                    System.out.println("2 Cereales y tuberculos");
                    System.out.println("3 Carne, huevos y legumbres");
                    System.out.println("4 Otros");
                    tipo = tcl.nextInt();
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
                        default:
                            System.out.println("Ingrese una de las opciones");
                    }
                }
                else
                    comidasOmitidas += 1;
                if (momento==1 && comida==true)
                    totalD += 1;
                if (momento==2 && comida==true)
                    totalA += 1;
                if (momento==3 && comida==true)
                    totalC += 1;
            }
        if (realizadasDia == 3)
            diasCompletos += 1;
        }
        promedio = comidaRealizada/7;
        porcentaje = (comidaRealizada*21)/100;
        System.out.println("Comidas realizads en la semana: "+comidaRealizada);
        System.out.println("Cantidad de desayunos: "+totalD);
        System.out.println("Cantidad de almuerzos: "+totalA);
        System.out.println("Cantidad de cenas: "+totalC);
        System.out.println("Comidas omitidas: "+comidasOmitidas);
        System.out.println("Frutas y verduras consumidas: "+frutas);
        System.out.println("Cereales y tuberculos: "+cereales);
        System.out.println("Carnes, huevos y legumbres: "+carne);
        System.out.println("Otros consumidos: "+otros);
        System.out.println("Promedio de comidas diarias: "+promedio);
        System.out.println("Porcentaje de comidas en la semana: "+porcentaje);
        System.out.println("Dias que completarin las tres comidas: "
                +diasCompletos);
    }    
}