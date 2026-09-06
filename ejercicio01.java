class Empleado {
    private String nom;
    private double sal;
    private String dep;

    public Empleado(String nom, double sal, String dep) {
        this.nom = nom;
        this.sal = sal;
        this.dep = dep;
    }

    public String getNom() {
        return nom;
    }

    public double getSal() {
        return sal;
    }

    public String getDep() {
        return dep;
    }
}

class Pago {
    public double calcular(Empleado emp) {
        return emp.getSal();
    }
}

public class ejercicio01 {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 1500.0, "TI");
        Pago pago = new Pago();
        System.out.println(pago.calcular(emp));
    }
}
