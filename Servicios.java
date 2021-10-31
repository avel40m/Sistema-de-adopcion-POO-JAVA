package Adopcion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Servicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    private HashSet<Persona> personas = new HashSet<>();
    
    public void crearMascota(){
        Mascota mascota = new Mascota();
        System.out.println("Ingrese el nombre");
        mascota.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        mascota.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        mascota.setPeso(leer.nextDouble());
        System.out.println("Se creo la mascota");
        mascotas.add(mascota);
    }
    
    public void crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su documento");
        persona.setDocumento(leer.next());
        
        boolean band = true;
        
        do {            
            if (mascotas.size() == 0) {
                System.out.println("No existen mascotas para adoptar");
                band = false;
            } else {
               mostrarMascotas();
               adoptar(persona);
               System.out.println("Desea adoptar otra mascota?");
               String resp = leer.next();
                if (resp.equals("no")) {
                    band=false;
                }
            }
        } while (band);
        System.out.println("usuario creado!!!");
        System.out.println("*************");
        System.out.println(persona.toString());
        personas.add(persona);
    }
    
    public void mostrarMascotas(){
        for (Mascota m : mascotas) {
            System.out.println(m);
        }
    }
    
    public void listadoClientes(){
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
    }
    
    public void adoptar(Persona persona){
        System.out.println("Ingrese el nombre de la mascota");
        String nombre = leer.next();
        
        Iterator<Mascota> it = mascotas.iterator();
        
        while (it.hasNext()) {
            Mascota m = it.next();
            
            if (m.getNombre().equals(nombre)) {
                persona.getMascotas().add(m);
                mascotas.remove(m);
                break;
            }
            
        }
    }
}
