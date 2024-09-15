import javax.swing.*;

public class Libros {

    private static String informe = "";

    private String nombreLibro;
    private String cliente;
    private boolean disponible;

    public Libros(String nombreLibro) {
        this.nombreLibro = nombreLibro;
        this.disponible = true;
        this.cliente = "";
    }

    public void prestarLibro(String cliente) {
        disponible = false;
        this.cliente = cliente;
    }

    public void devolverLibro() {
        disponible = true;
        this.cliente = "";
    }

    public String reporterInfoDeLibro(){
        return "Libro: " +
                "nombreLibro='" + nombreLibro + '\'' +
                ", cliente='" + cliente + '\'' +
                ", disponible=" + disponible;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }
    public String getCliente() {
        return cliente;
    }
    public boolean isDisponible() {
        return disponible;
    }




}
