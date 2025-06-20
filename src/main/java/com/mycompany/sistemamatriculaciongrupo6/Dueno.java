package com.mycompany.sistemamatriculaciongrupo6;

import java.util.ArrayList;
import java.util.List;

public class Dueno extends Persona {
    private List<Vehiculo> vehiculos;

    public Dueno() {
        this.vehiculos = new ArrayList<>();
    }

    public Dueno(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
        this.vehiculos = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
