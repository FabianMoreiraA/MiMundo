package sample;

import java.io.*;
import java.util.Scanner;

public class ManejoArchivos {

    private Scanner entrada;
    private String id;
    private double cantidad;

    File archivo = new File("archivo.txt");

    public ManejoArchivos() {
    }

    public void existeArchivo(){

        try{
            if (archivo.exists()){
                System.out.println("Ya Existe!!!");
            }
            else
            {
                archivo.createNewFile();
                System.out.println("Ya se creo");
            }

        }catch (IOException e){
            System.err.println("No se pudo crear el archivo");
        }
    }
    public void asignarDatos(String id2, double saldo2) {
        id = id2;
        cantidad = saldo2;
        try {
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true)));
            Fescribe.write(id + "  " + cantidad + "  ");
            Fescribe.write("\n");
            System.out.println("Ha sido ingresado");
            Fescribe.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void mostrarArchivos(){
        try{
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            while ((cadena = br.readLine())!=null){
                System.out.println(" "+cadena);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void buscarRegistro(String id2){
        String usuario = id2;
        try{
            BufferedReader leer = new BufferedReader(new FileReader("archivo.txt"));
            String linea =" ";
            while ((linea = leer.readLine())!=null){
                if (linea.indexOf(usuario)!=-1){
                    System.out.println("Se encontro el registro: "+linea);
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void saldoRegistro(String id2) {
        String usuario = id2;
        try {
            entrada = new Scanner(new File("archivo.txt"));
            BufferedReader leer = new BufferedReader(new FileReader("archivo.txt"));
            String linea=" ";
            while ((linea=leer.readLine())!=null)
            {
                if (linea.indexOf(usuario)!=-1)
                {
                System.out.println("Se encontro el registro "+usuario);
                String id=entrada.next();
                double saldo = entrada.nextDouble();
                if (saldo<0)
                {
                    System.out.println("su saldo es "+saldo+" PAGUE VULGAR");
                }
                else
                {
                    System.out.println("Se salvo tiene a favor "+saldo);
                 }
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

