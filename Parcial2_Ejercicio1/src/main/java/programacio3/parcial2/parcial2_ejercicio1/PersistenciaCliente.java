package programacio3.parcial2.parcial2_ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class PersistenciaCliente {

    public static void almacenarDatos(String nombre, String formato, Object...args) throws IOException {

        FileWriter archivoSalida;
        Formatter archivo;

        archivoSalida = new FileWriter(nombre, true);
        archivo = new Formatter(archivoSalida);
        archivo.format(formato, args);
        archivo.flush();
        archivo.close();

    }
}
