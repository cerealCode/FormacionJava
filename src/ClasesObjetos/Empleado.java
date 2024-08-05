package ClasesObjetos;

public class Empleado extends Persona {
    private int antiguedad; 
    private double salario;
    private String puesto; 



    public Empleado(){
        // Constructor vacío
    }

    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public void actualizarSalario(int incremento){
        salario += incremento;
    }
    
    @Override 
    public String toString() {
        return super.toString() + " Empleado [antiguedad=" + antiguedad + ", salario=" + salario + ", puesto=" + puesto + "]"; 
    }
}
