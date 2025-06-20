
package com.mycompany.sistemamatriculaciongrupo6;

import java.util.HashMap;
import java.util.Map;


public class Vehiculo {
    private String placa,marca,modelo,tipo;
    private int year;
    private Dueno dueno;
    
    
    public Vehiculo(String placa, String marca, String modelo, String tipo, int year, Dueno dueno) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.year = year;
        this.dueno = dueno;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

  
   
        
            
        
    }
    
    

