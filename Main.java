/**
 *@author Adrián Lima García
 * @version 1.0
 */

//Clase para mandar a llamar a las super, y sub clases
class Main {
  public static void main(String[] args) {
    Empleado Zoe = new Empleado("Zoé");
    System.out.println(Zoe.toString());
    Operador Arno = new Operador("Arno");
    System.out.println(Arno.toString());
    Directivo Canelo = new Directivo("Canelo");
    System.out.println(Canelo.toString());
    Oficial Peluchin = new Oficial("Peluchin");
    System.out.println(Peluchin.toString());
    Tecnico John = new Tecnico("John");
    System.out.println(John.toString());
  }
}