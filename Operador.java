public class Operador extends Empleado{
  public Operador(String nombre){
    super(nombre);
  }
  @Override
  public String toString(){
  return "Soy operador de la empresa, mi nombre es " + getNombre();
  }
}