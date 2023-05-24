import java.util.Arrays;
import java.util.List;
public class Buqueda {
    public static int[] generarArreglos(int tam) {
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

    public int linearSearch(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }

    public String tiempoLinearVSBinary(){
        int[] tamanios = {100, 1000, 10000, 100000};
        long linearTiempoIncio, linearTiempoFin, linearTiempoResultado;
        long binaryTiempoInicio, binaryTiempoFin, binaryTiempoResultado;
        String tiempo = "";

        for (int tam : tamanios) {
            int[] data = generarArreglos(tam);

            linearTiempoIncio = System.nanoTime();
            linearSearch(data, -1);
            linearTiempoFin = System.nanoTime();
            linearTiempoResultado = linearTiempoFin - linearTiempoIncio;

            //Arrays.sort(data);

            binaryTiempoInicio = System.nanoTime();
            binarySearch(data, -1);
            binaryTiempoFin = System.nanoTime();
            binaryTiempoResultado = binaryTiempoFin - binaryTiempoInicio;

            tiempo += "\nAreglo de tamaño: " + tam +
                    "\nBúsqueda de objetivo por Linear Search completada en: "+linearTiempoResultado+" ns " +
                    "\nBúsqueda de objetivo por Binary Search completada en: "+binaryTiempoResultado+" ns\n";

        }
        return tiempo;
    }
}
