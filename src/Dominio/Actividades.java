package Dominio;

public class Actividades {
    private String nombre;
    private double nota;
    private String genero;
    
    //atritutos de la clases protegidos

    public Actividades(String nombre, double nota, String genero) {
        this.nombre = nombre;
        this.nota = nota;
        this.genero = genero;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override //esto me permite imprimir
    public String toString(){
        return "El nombre es; "+this.nombre+" El Genero es; "+this.genero+" Su nota es; "+this.nota;
}
}
