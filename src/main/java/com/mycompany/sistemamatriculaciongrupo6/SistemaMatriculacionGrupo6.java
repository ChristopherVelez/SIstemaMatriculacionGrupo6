/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamatriculaciongrupo6;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mini Wernaso
 */
public class SistemaMatriculacionGrupo6 {

         static private Map<String, Vehiculo> vehiculos = new HashMap<>();
             private static Scanner sc = new Scanner(System.in);
             static Dueno duenos = new Dueno();

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
        sc.nextLine();

        System.out.print("Cédula del dueño: ");
        String cedula = sc.nextLine();
        Dueno dueno = duenos.getDueno(cedula);

        if (dueno == null) {
            System.out.println("Dueño no encontrado.");
            return;
        }

        Vehiculo vehiculo = new Vehiculo( placa,  marca,  modelo,  tipo,  anio,  dueno);
        vehiculos.put(placa, vehiculo);
        dueno.addVehiculo(vehiculo);

        System.out.println("Vehículo registrado exitosamente.");
    }
    public static void main(String[] args) {
        int option=0;
        Scanner scanner = new Scanner(System.in);
        
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
                //case 1 -> registrarDueno();
                case 2 -> registrarVehiculo();
                //case 3 -> registrarMatricula();
                //case 4 -> pagarMatricula();
                //case 5 -> consultarDueno();
                //case 6 -> consultarMatricula();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (option != 7);
    
       
    }
}
