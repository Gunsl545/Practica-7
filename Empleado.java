public class Empleado{
  private String nombre;


public Empleado(String nombre){
  this.nombre = nombre;
}

public String getNombre(){
  return nombre;
}

public String toString(){
  return "Soy empleado de la empresa, mi nombre es " + nombre;
}
}

