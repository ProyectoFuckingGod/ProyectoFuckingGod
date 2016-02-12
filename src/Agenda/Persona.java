package Agenda;


public class Persona {

  String nombre, telefono;

  public Persona(String nombre, String telefono) {
    setNombre(nombre);
    setTelefono(telefono);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

}
