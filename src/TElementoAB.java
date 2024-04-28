public class TElementoAB<T> implements  IElementoAB<T>{
    Comparable etiqueta;
    TElementoAB<T> hijoIzq;
    TElementoAB<T> hijoDer;
    T datos;

    public TElementoAB(Comparable etiqueta, T datos) {
        this.etiqueta = etiqueta;
        this.datos = datos;
    }
    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
         TElementoAB<T> resultado = null;
        if(unaEtiqueta.compareTo(this.getEtiqueta()) == 0) { //Las etiquetas son iguales
            resultado = this;
        } else {
                if(unaEtiqueta.compareTo(this.getEtiqueta()) < 0) { //La etiqueta que recibimos por parametro es menor a la actual
                if(this.getHijoIzq() != null) {
                    resultado = this.getHijoIzq().buscar(unaEtiqueta);
                }
            } else { //La etiqueta que enviamos por parametro es mayor a la actual.
                if(this.getHijoDer() != null) {
                    resultado = this.getHijoDer().buscar(unaEtiqueta);
                }
            }
            System.out.println("La clave está en el arbol");
        }
        if(resultado == null) {
            System.out.println("La clave no está en el arbol");
        }
        return resultado;
     }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if(elemento.getEtiqueta().compareTo(this.getEtiqueta()) == 0) {
            return false;
        }
        if(elemento.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
            if(this.getHijoIzq() == null) {
                setHijoIzq(elemento);
                return true;
            } else {
                this.getHijoIzq().insertar(elemento);
            }
        } else {
            if(elemento.getEtiqueta().compareTo(this.getEtiqueta()) > 0) {
                if(this.getHijoDer() == null) {
                    setHijoDer(elemento);
                    return true;
                } else {
                    this.getHijoDer().insertar(elemento);
                }
            }
        }
        return false;
    }

    @Override
    public String preOrden() {
        String tempStr = this.etiqueta.toString() + " ";
        if(this.hijoIzq != null) {
            tempStr += this.hijoIzq.preOrden();
        }
        if(this.hijoDer != null) {
            tempStr += this.hijoDer.preOrden();
        }
        return tempStr;
    }

    @Override
    public String inOrden() {
        String tempStr = "";
        if (this.hijoIzq != null) {
            tempStr += this.hijoIzq.inOrden();
        }
        tempStr += this.etiqueta.toString() + " ";
        if (this.hijoDer != null) {
            tempStr += this.hijoDer.inOrden();
        }
        return tempStr;
    }

    @Override
    public String postOrden() {
        String tempStr = "";
        if(this.hijoIzq != null) {
            tempStr += this.hijoIzq.postOrden();
        }
        if(this.hijoDer != null) {
            tempStr += hijoDer.postOrden();
        }
        tempStr += etiqueta.toString() + " ";
        return tempStr;
    }

    @Override
    public T getDatos() {
        return null;
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        return null;
    }
}
