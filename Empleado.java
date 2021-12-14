/**
 *@author Adrián Lima García
 * @version 1.0
 */

//Super clase principal
public class Empleado{
  private String nombre;


public Empleado(String nombre){
  this.nombre = nombre;
}

public String getNombre(){
  return nombre;
}

public void setNombre(String nombre){
  this.nombre = nombre;
}

public String toString(){
  return "Empleado de la empresa, nombre: " + nombre;
}
}

