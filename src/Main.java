
public class Main {
    public static void main(String[] args) {
        /*
            //Ejercicio 2
            TArbolBB<Integer> arbolBinario1 = new TArbolBB();
            String[] contenidoArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/IdeaProjects/UT4_PD2/out/production/UT4_PD2/clavesPrueba.txt");
            for(String linea : contenidoArchivo) {
                TElementoAB<Integer> nodo = new TElementoAB<>(Integer.parseInt(linea), Integer.parseInt(linea));
                arbolBinario1.insertar(nodo);
            }
            System.out.println("Recorrido preOrden:");
            System.out.println(arbolBinario1.preOrden());

            System.out.println("Recorrido inOrden:");
            System.out.println(arbolBinario1.inOrden());

            System.out.println("Recorrido postOrden:");
            System.out.println(arbolBinario1.postOrden());
            String[] recorridoPreOrden = new String[]{arbolBinario1.preOrden()};
            String[] recorridoPostOrden = new String[]{arbolBinario1.postOrden()};
            String[] recorridoInOrden = new String[]{arbolBinario1.inOrden()};


            ManejadorArchivosGenerico.escribirArchivo("src/recorridos.txt", recorridoPreOrden);
            ManejadorArchivosGenerico.escribirArchivo("src/recorridos.txt", recorridoPostOrden);
            ManejadorArchivosGenerico.escribirArchivo("src/recorridos.txt", recorridoInOrden);
         */
        /*
            TArbolBB<Integer> arbolBinario2 = new TArbolBB<>();
            String[] contenidoArchivo = ManejadorArchivosGenerico.leerArchivo("src/claves1.txt");
            for(String linea : contenidoArchivo) {
                TElementoAB<Integer> nodo = new TElementoAB<>(Integer.parseInt(linea), Integer.parseInt(linea));
                arbolBinario2.insertar(nodo);
            }
            TElementoAB<Integer> elementoBuscado0 = arbolBinario2.buscar(10635);
            if(elementoBuscado0 != null) {
                System.out.println("La clave existe en el árbol");
            } else {
                System.out.println("La clave no existe en el árbol.");
            }
            TElementoAB<Integer> elementoBuscado1 = arbolBinario2.buscar(4567);
            if(elementoBuscado1 != null) {
                System.out.println("La clave existe en el árbol");
            } else {
                System.out.println("La clave no existe en el árbol.");
            }
            TElementoAB<Integer> elementoBuscado2 = arbolBinario2.buscar(12);
            if(elementoBuscado2 != null) {
                System.out.println("La clave existe en el árbol");
            } else {
                System.out.println("La clave no existe en el árbol.");
            }
            TElementoAB<Integer> elementoBuscado3 = arbolBinario2.buscar(8978);
            if(elementoBuscado3 != null) {
                System.out.println("La clave existe en el árbol");
            } else {
                System.out.println("La clave no existe en el árbol.");
            }
            System.out.println(arbolBinario2.preOrden());

            //La decima clave del listado en PreOrden es 797
         */
    }
}