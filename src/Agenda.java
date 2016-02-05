
public class Agenda {

  Persona[] contactos;
  int siguiente = 0;

  public Agenda(int tamaño) {
    contactos = new Persona[tamaño];
  }

  public boolean añadir(Persona persona) {

    if (siguiente >= contactos.length) {
      return false;

    } else {
      contactos[siguiente++] = persona;
      return true;
    }

  }

  public String getTelefono(String nombre) {

    for (Persona i : contactos) {

      if (i.getNombre().equals(nombre)) {
        return i.getTelefono();
      }
    }
    return null;
  }

  public int buscar(String nombre) {

    int cont = 0;
    for (Persona i : contactos) {
      if (i.getNombre().equals(nombre)) {
        return cont;
      }
      cont++;
    }
    return -1;
  }

  public String getPersona(int posicion) {
    if (posicion < 0 | posicion > contactos.length) {
      return null;
    } else
      if (contactos[posicion] == null)
        return null;
    return contactos[posicion].getNombre();
  }

  public Persona getPersona(String nombre) {

    Persona newPersona;
    if (buscar(nombre) == -1) {
      System.out.println("No se puede copiar un contacto que no existe");
      newPersona = new Persona("", "");
    } else {
      newPersona = new Persona(contactos[buscar(nombre)].getNombre(), contactos[buscar(nombre)].getTelefono());
    }
    return newPersona;
  }

  public void modificarTelefono(String nombre, String telefono) {
    if (buscar(nombre) == -1) {
      System.out.println("Nombre no encontrado en el array");
    } else {
      contactos[buscar(nombre)].setTelefono(telefono);
    }
  }

}
