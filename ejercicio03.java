abstract class Vehiculo {
    public abstract void acelerar();
}

abstract class VehiculoMotor extends Vehiculo {
    public abstract void acelerar();
}

abstract class VehiculoManual extends Vehiculo {
    public abstract void acelerar();
}

class Coche extends VehiculoMotor {
    public void acelerar() {
        System.out.println("Motor");
    }
}

class Bicicleta extends VehiculoManual {
    public void acelerar() {
        System.out.println("Pedal");
    }
}

public class ejercicio03 {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Bicicleta();
        
        v1.acelerar();
        v2.acelerar();
    }
}
