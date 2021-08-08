package sample;

import java.io.File;
import java.io.*; //Librerias Excepciones
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salir = 1;

        ManejoArchivos objeto1 = new ManejoArchivos();
            System.out.println("Presione: 1= asignar de datos, 2=Mostrar Datos, 3= Buscar, 4=Ver un usuario, 5=Salir");
            while (salir !=5)
            {
            try {
                System.out.println("CREAR MUNDO");
                System.out.println("Elija una opcion");
                salir = teclado.nextInt();
                if (salir == 1) {
                    System.out.println("Ingresa un ID");
                    String id = teclado.next();
                    System.out.println("Ingrese un saldo");
                    double saldo = teclado.nextDouble();
                    objeto1.asignarDatos(id, saldo);
                }
                if (salir == 2) {
                    objeto1.mostrarArchivos();
                }
                if (salir == 3) {
                    System.out.println("Ingrese el ID del cliente para buscar y quebrarlo");
                    String id = teclado.next();
                    objeto1.buscarRegistro(id);
                }
                if (salir == 4) {
                    System.out.println("Ingrese el ID del usuario para buscarlo y quebrarlo");
                    String id= teclado.next();
                    objeto1.saldoRegistro(id);
                }
                if (salir == 5) {
                    System.out.println("GRACIAS HUMANO");
                }
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
            }
        }
    }
}



