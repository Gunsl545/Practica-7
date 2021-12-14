/**
 *@author Adrián Lima García
 * @version 1.0
 */

//Subclase de Operador
public class Oficial extends Operador{
  public Oficial(String nombre){
    super(nombre);
  }
  @Override
  public String toString(){
  return "Oficial operador de la empresa, nombre: " + getNombre();
  }
}