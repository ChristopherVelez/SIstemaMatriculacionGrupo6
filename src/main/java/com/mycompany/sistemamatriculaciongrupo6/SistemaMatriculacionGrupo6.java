package com.mycompany.sistemamatriculaciongrupo6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class SistemaMatriculacionGrupo6 {

    private static Map<String, Vehiculo> vehiculos = new HashMap<>();
    private static Map<String, Dueno> duenoslista = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar dueño");
            System.out.println("2. Registrar vehículo");
            System.out.println("3. Registrar matrícula");
            System.out.println("4. Pagar matrícula");
            System.out.println("5. Consultar dueño");
            System.out.println("6. Consultar matrícula");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> registrarDueno();
                case 2 -> registrarVehiculo();
                // case 3 -> registrarMatricula();
                // case 4 -> pagarMatricula();
                case 5 -> consultarDueno();
                // case 6 -> consultarMatricula();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (option != 7);
    }

    private static void registrarDueno() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        Dueno dueno = new Dueno(nombre, cedula, direccion, telefono);
        duenoslista.put(cedula, dueno);
        System.out.println("Dueño registrado correctamente.");
    }

    private static Dueno getDuenoPorCedula(String cedula) {
        return duenoslista.get(cedula);
    }

    private static void consultarDueno() {
        System.out.print("Cédula del dueño: ");
        String cedula = sc.nextLine();
        Dueno dueno = getDuenoPorCedula(cedula);

        if (dueno != null) {
            dueno.mostrarInformacion();

            List<Vehiculo> vehiculosDueno = dueno.getVehiculos();
            if (vehiculosDueno.isEmpty()) {
                System.out.println("No tiene vehículos registrados.");
            } else {
                System.out.println("\nVehículos registrados:");
                for (Vehiculo v : vehiculosDueno) {
                    v.mostrarDatos();
                    System.out.println("------------------");
                }
            }

        } else {
            System.out.println("Dueño no encontrado.");
        }
    }

    private static void registrarVehiculo() {
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        if (vehiculos.containsKey(placa)) {
            System.out.println("Ya existe un vehículo con esa placa.");
            return;
        }

        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Año: ");
        int anio = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Cédula del dueño: ");
        String cedula = sc.nextLine();
        Dueno dueno = getDuenoPorCedula(cedula);

        if (dueno == null) {
            System.out.println("Dueño no encontrado.");
            return;
        }

        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, tipo, anio, dueno);
        vehiculos.put(placa, vehiculo);
        dueno.addVehiculo(vehiculo);

        System.out.println("Vehículo registrado exitosamente.");
    }
}
