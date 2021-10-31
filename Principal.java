package Adopcion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Servicios servicios = new Servicios();
        Scanner leer = new Scanner(System.in);
        boolean band = true;
        
        do {            
            System.out.println("--Menu Principal--");
            System.out.println("1. Crear mascota\n2. Mostrar listado de mascotas\n3. Generar Adopción"
                    + "\n4. Listado de cliente\n5. Salir");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                        servicios.crearMascota();
                    break;
                case 2:
                    servicios.mostrarMascotas();
                    break;
                case 3:
                    servicios.crearPersona();
                    break;
                case 4:
                    servicios.listadoClientes();
                    break;
                case 5:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
            }
        } while (band);
    }
    
}
