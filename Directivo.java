/**
 *@author Adrián Lima García
 * @version 1.0
 */

//Subclase de Empleado
public class Directivo extends Empleado{
  public Directivo(String nombre){
    super(nombre);
  }
  @Override
  public String toString(){
  return "Directivo de la empresa, nombre: " + getNombre();
  }
}