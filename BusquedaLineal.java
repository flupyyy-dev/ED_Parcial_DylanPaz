public class BusquedaLineal {

    public static int busquedaIterativa(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) return i;
        }
        return -1;
    }

    public static int busquedaRecursiva(int[] arr, int objetivo, int i) {
        if (i >= arr.length) return -1;
        if (arr[i] == objetivo) return i;
        return busquedaRecursiva(arr, objetivo, i + 1);
    }
}