import java.io.File;
import java.util.*;

public class IndexadorRecursivo {
    private Map<String, String> indice;

    public IndexadorRecursivo() {
        indice = new HashMap<>();
    }

    public void indexar(String rutaDirectorio) {
        indexarRecursivo(new File(rutaDirectorio));
    }

    private void indexarRecursivo(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexarRecursivo(archivo);
                } else {
                    indice.put(archivo.getName(), archivo.getAbsolutePath());
                }
            }
        }
    }

    public List<Map.Entry<String, String>> obtenerListaOrdenada() {
        List<Map.Entry<String, String>> listaOrdenada = new ArrayList<>(indice.entrySet());
        listaOrdenada.sort(Map.Entry.comparingByKey());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del directorio que deseas indexar:");
        String ruta = scanner.nextLine();

        IndexadorRecursivo indexador = new IndexadorRecursivo();
        indexador.indexar(ruta);

        List<Map.Entry<String, String>> listaOrdenada = indexador.obtenerListaOrdenada();

        // Mostrar los nombres de archivo ordenados junto con sus rutas completas
        for (Map.Entry<String, String> entry : listaOrdenada) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}




