public class Main {
    public static void main(String[] args) {
        //Ejercicio 2
        TArbolBB<Integer> arbolBinario1 = new TArbolBB();
        String[] contenidoArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/IdeaProjects/UT4_PD2/out/production/UT4_PD2/clavesPrueba.txt");
        for(String linea : contenidoArchivo) {
            TElementoAB<Integer> nodo = new TElementoAB<>(linea, Integer.parseInt(linea));
            arbolBinario1.insertar(nodo);
        }
        System.out.println("Recorrido preOrden:");
        System.out.println(arbolBinario1.preOrden());

        System.out.println("Recorrido inOrden:");
        System.out.println(arbolBinario1.inOrden());

        System.out.println("Recorrido postOrden:");
        System.out.println(arbolBinario1.postOrden());
    }
}