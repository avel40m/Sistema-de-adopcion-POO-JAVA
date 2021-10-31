
package Adopcion;

import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String documento;
    ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", documento=" + documento + ", mascotas=" + mascotas + '}';
    }
    
    
}
