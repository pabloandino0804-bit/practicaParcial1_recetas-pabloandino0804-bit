package ar.edu.unahur.obj2.practicaparcial1.Humanos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    private List<Receta> recetasDisponibles = new ArrayList<>();
    private String nombre = "Pablo";

    public Nutricionista() {}

    public static Nutricionista getInstance() {
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public List<Receta> getRecetasDisponibles() {
        return recetasDisponibles;
    }

    public void agregarReceta(Receta unaReceta) {
        this.recetasDisponibles.add(unaReceta);
    }

    public void visitarAUnCliente(Cliente cliente) {
        Receta recetaAEntregar = recetasDisponibles.stream()
        .filter(r -> cliente.leGustaReceta(r))
        .findFirst()
        .orElse(
            new RecetaBase("batido magico", nombre, 2000, 0)
        );
        cliente.recibirReceta(recetaAEntregar);
    }
}
