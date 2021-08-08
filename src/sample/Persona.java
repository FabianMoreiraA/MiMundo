package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Persona {
    String nombre;
    String apellido;
    int identificacion;

    public Persona(String nombre, String apellido, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }
}
    /*File archivo;
        String id;
    double cantidad;
    File archivo;

    try{
            archivo = new File("archivo.txt");
            if (archivo.createNewFile()){
            System.out.println("esta creado");
            }

            }catch (IOException e){
            System.err.println("No se pudo crear el archivo");
            }*/
   /* public void asignardatos( String id2, double saldo2){
        id = id2;
        cantidad = saldo2;
        try{
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true)));
            Fescribe.write(id+"  "+cantidad+"  ");
            Fescribe.write("\n");
            System.out.println("Ha sido ingresado");
            Fescribe.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }*/
