
package com.mycompany.sistemamatriculaciongrupo6;


public class Persona {
     protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;
    
    
    public Persona(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Persona(){}

    

    public String getCedula() {
        return cedula;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}

