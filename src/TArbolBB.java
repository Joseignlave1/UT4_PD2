public class TArbolBB<T> implements IArbolBB<T> {
    TElementoAB<T> raiz;
    public TArbolBB() {
        this.raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if(this.raiz == null) {
            this.raiz = unElemento;
        } else {
            this.raiz.insertar(unElemento);
        }
        return true;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if(esVacio(unaEtiqueta)) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if(raiz == null) {
            return "arbol vacío";
        } else {
            return raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        if(raiz == null) {
            return "arbol vacío";
        } else {
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if(raiz == null) {
            return "arbol vacío";
        } else {
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {

    }
    public boolean esVacio(Comparable unaEtiqueta) {
        return unaEtiqueta == null;
    }
}
