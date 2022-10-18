package Entidad;

public class Persona {

    private String nombre;
    private int edad;
    private String apellido;
    private String pais;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String apellido, String pais, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.pais = pais;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", pais=" + pais + ", altura=" + altura + '}';
    }

}
