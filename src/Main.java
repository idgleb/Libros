import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //examen1

        Libros newLibro = null;

        int seleccion = 0;
        do {
            String[] opciones = {"Salir", "Registrar Libro", "Prestar", "Devolver", "Reporte"};
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Ursol",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (seleccion) {
                case 0:
                    //"Salir"
                    break;

                case 1:
                    //"Registrar Libro"
                    String numbreLibro;
                    do {
                        numbreLibro = JOptionPane.showInputDialog(null, "Nombre de Libro? ");
                        if (numbreLibro == null) numbreLibro = "";
                    } while (numbreLibro=="");
                    newLibro = new Libros(numbreLibro);
                    break;

                case 2:
                    //"Prestar"
                    if (newLibro != null) {

                        if (newLibro.isDisponible()) {
                            String newCliente;
                            do {
                                newCliente = JOptionPane.showInputDialog(null, "Cliente? ");
                                if (newCliente == null) newCliente = "";
                            } while (newCliente=="");
                            newLibro.prestarLibro(newCliente);
                            JOptionPane.showMessageDialog(null, "Libro " + newLibro.getNombreLibro() + " presto con exito");
                        }else JOptionPane.showMessageDialog(null, "Libro " + newLibro.getNombreLibro() + " no disponible");

                    } else
                        JOptionPane.showMessageDialog(null, "No hay libros, de primero pulsa <Registrar Libro>");
                    break;

                case 3:
                    //"Devolver"
                    if (newLibro != null) {
                        if (!newLibro.isDisponible()) {
                            newLibro.devolverLibro();
                            JOptionPane.showMessageDialog(null, "Libro " + newLibro.getNombreLibro() + " devuelta con exito");
                        }else JOptionPane.showMessageDialog(null, "Libro " + newLibro.getNombreLibro() + " ya esta en libreria, no podes volverlo");
                    } else
                        JOptionPane.showMessageDialog(null, "No hay libros, de primero pulsa <Registrar Libro>");
                    break;

                case 4:
                    //"Reporte"
                    if (newLibro != null) {
                        JOptionPane.showMessageDialog(null, newLibro.reporterInfoDeLibro());
                    } else
                        JOptionPane.showMessageDialog(null, "No hay libros, de primero pulsa <Registrar Libro>");
                    break;


                default:
                    break;
            }
        } while (seleccion != 0);


    }
}