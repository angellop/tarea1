/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.city;

/**
 *
 * @author Alumno
 */
class Ciudad {

    String nombre;
    int habitante;
    int extension;

    Ciudad(String nombre, int habitante, int extension) {
        this.nombre = nombre;
        this.habitante = habitante;
        this.extension = extension;

    }

    int obtener_desindad() {

        int densidad = habitante / extension;
        return densidad;

    }

}

public class MYCITY {

    public static void main(String[] args) {
        // TODO code application logic here

        Ciudad sps = new Ciudad("San pedro sula", 1000000, 5000);
        System.out.println("nombre: "+sps.nombre);
           System.out.println("habitante:"+sps.habitante);
        System.out.println("extension: "+sps.extension);
        
        System.out.println("desindad: "+sps.obtener_desindad());
     
    }

}
