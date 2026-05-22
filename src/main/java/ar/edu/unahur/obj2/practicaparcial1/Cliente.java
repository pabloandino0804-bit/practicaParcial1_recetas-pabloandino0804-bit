package ar.edu.unahur.obj2.practicaparcial1;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.ICriterio;

public class Cliente {
    private String dni;
    private ICriterio criterio;

    public Cliente (String dni, ICriterio criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    public String getDNI() {
        return dni;   
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public void setCriterio(ICriterio nuevoCriterio) {
        this.criterio = nuevoCriterio;
    } 
}