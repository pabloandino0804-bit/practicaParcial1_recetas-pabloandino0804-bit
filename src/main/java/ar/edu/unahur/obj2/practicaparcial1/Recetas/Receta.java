package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public interface Receta {
    public String getNombre();

    public String getNombreAutor();

    public void setAutor(String unAutor);

    public Integer getValorNutricional();

    public void setValorNutricional(Integer valirNutricional);

    public Integer getAniosTradicion();

    public Boolean esTradicional();
}
