public abstract class Cargo {

    protected Titulo titulo;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
