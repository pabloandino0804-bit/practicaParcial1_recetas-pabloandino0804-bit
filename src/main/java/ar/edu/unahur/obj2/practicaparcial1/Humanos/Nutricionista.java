package ar.edu.unahur.obj2.practicaparcial1.Humanos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    
    private String nombre;
    private List<Receta> recetasDisponibles = new ArrayList<>();

    public Nutricionista() {}

    public static Nutricionista getInstance() {
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Receta> getRecetasDisponibles() {
        return recetasDisponibles;
    }

    public void agregarReceta(Receta unaReceta) {
        this.recetasDisponibles.add(unaReceta);
    }

    public void visitarAUnCliente(Cliente cliente) {
        Receta receta = this.recetasDisponibles.stream().findFirst().get();
        
        if (cliente.leGustaReceta(receta)) {
            cliente.recibirReceta(receta);
        }
        else {
            cliente.recibirReceta(new RecetaBase("batido magico", this.getNombre(), 2000, 0));
        }
    }
}
