interface Forma {
    void dibujar();
}

class Circulo implements Forma {
    public void dibujar() {
        System.out.println("Circulo");
    }
}

class Rectangulo implements Forma {
    public void dibujar() {
        System.out.println("Rectangulo");
    }
}

class Triangulo implements Forma {
    public void dibujar() {
        System.out.println("Triangulo");
    }
}

public class ejercicio02 {
    public static void main(String[] args) {
        Forma f1 = new Circulo();
        Forma f2 = new Rectangulo();
        Forma f3 = new Triangulo();
        
        f1.dibujar();
        f2.dibujar();
        f3.dibujar();
    }
}
