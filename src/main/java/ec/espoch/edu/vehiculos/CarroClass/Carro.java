/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.vehiculos.CarroClass;
import ec.espoch.edu.vehiculos.Color;
import ec.espoch.edu.vehiculos.TipoAutomovil;
import ec.espoch.edu.vehiculos.TipoCombustible;
import ec.espoch.edu.vehiculos.Vehiculo.Vehiculo;


public class Carro extends Vehiculo {

    public Carro(String marca, int modelo, String motor, TipoCombustible tipoCombustible,
                 TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsiento,
                 double velocidadMaxima, Color color, double velocidadActual, int anioFabricacion) {

        super(marca, modelo, motor, tipoCombustible, tipoAutomovil,
              numeroPuertas, cantidadAsiento, velocidadMaxima,
              color, velocidadActual, anioFabricacion);
    }

    public static void main(String[] args) {
        Carro auto = new Carro("Toyota", 2023, "Fortuner", TipoCombustible.GASOLINA, TipoAutomovil.SUV, 4, 5, 20, Color.AZUL, 40, 2024);

        auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado(300); // distancia en km
        auto.acelerar(20);
        auto.desacelerar(50);
        auto.frenar();
    }
}
