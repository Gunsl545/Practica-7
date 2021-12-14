/**
 *@author Adrián Lima García
 * @version 1.0
 */

//Subclase de Operador
public class Tecnico extends Operador{
  public Tecnico(String nombre){
    super(nombre);
  }
  @Override
  public String toString(){
  return "Técnico operador de la empresa, nombre: " + getNombre();
  }
}