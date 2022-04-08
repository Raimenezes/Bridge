public class Atendente extends Cargo {

    public Atendente(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
