//Subclase de Empleado
public class Operador extends Empleado{
  public Operador(String nombre){
    super(nombre);
  }
  @Override
  public String toString(){
  return "Operador de la empresa, nombre: " + getNombre();
  }
}