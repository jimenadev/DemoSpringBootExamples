package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private String nombre;
	private List<Jugador> plantilla;
	
	public Equipo() {
		plantilla = new ArrayList();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Jugador> getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(List<Jugador> plantilla) {
		this.plantilla = plantilla;
	}
	
	public void addJugador(Jugador jugador) {
		this.plantilla.add(jugador);
	}

	
}
