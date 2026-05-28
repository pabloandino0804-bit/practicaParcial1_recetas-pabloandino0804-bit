package ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public interface CriterioPref {
    Boolean leGusta(Receta receta);

    Receta personalizar(Receta receta);
}
