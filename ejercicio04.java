interface Imprimible {
    void imprimir();
}

interface Escaneable {
    void escanear();
}

class Impresora implements Imprimible {
    public void imprimir() {
        System.out.println("Imprimiendo");
    }
}

class ImpresoraMultifuncional implements Imprimible, Escaneable {
    public void imprimir() {
        System.out.println("Imprimiendo");
    }

    public void escanear() {
        System.out.println("Escaneando");
    }
}

public class ejercicio04 {
    public static void main(String[] args) {
        Impresora imp1 = new Impresora();
        ImpresoraMultifuncional imp2 = new ImpresoraMultifuncional();
        
        imp1.imprimir();
        imp2.imprimir();
        imp2.escanear();
    }
}
