package ar.edu.unahur.obj2.practicaparcial1.Recetas;

import java.util.ArrayList;
import java.util.List;

public class RecetaBase implements Receta{
    private String nombre;
    private String autor;
    private Integer valorNutricional;
    private Integer añosDeTradicion;

    private List<IngredienteAdicionalDecorator> ingredientes = new ArrayList<>();

    public RecetaBase(String nombre, String autor, Integer valorNutricional, Integer añosDeTradicion) {
        this.nombre = nombre; 
        this.autor = autor; 
        this.valorNutricional = valorNutricional;
        this.añosDeTradicion = añosDeTradicion; 
    }

    @Override
    public String getNombre() {
		return nombre;
	}

    @Override
    public String getNombreAutor() {
        return autor;
    }

    @Override
    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }

    @Override
    public Integer getValorNutricional() {
        return valorNutricional;
    }

    @Override
    public void setValorNutricional(Integer valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    @Override
    public Integer getAniosTradicion() {
        return añosDeTradicion;
    }

    @Override
    public Boolean esTradicional() {
        return añosDeTradicion >= 20;
    }

    public List<IngredienteAdicionalDecorator> getIngredientes() {
        return ingredientes;
    }

    public void recibirIngrediente(IngredienteAdicionalDecorator ingrediente) {
        this.ingredientes.add(ingrediente);
    }
}
