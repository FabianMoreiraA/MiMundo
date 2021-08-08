package sample;

public class Doctor extends Persona{

    String especialidad;

    public Doctor(String nombre, String apellido, int identificacion, String especialidad) {
        super(nombre = "nicole", apellido = "valladares", identificacion = 875445268);
        this.especialidad = especialidad;
    }
    public  void mostrar() {
        System.out.println(Doctor.class);
    }
}
