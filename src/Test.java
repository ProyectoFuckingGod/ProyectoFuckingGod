
public class Test {

  public static void main(String[] args) {

    Persona persona1 = new Persona("Juan", "956259749");
    Persona persona2 = new Persona("Victor", "622131990");
    Persona persona3 = new Persona("Noemi", "645987597");
    Agenda agenda = new Agenda(4);
    agenda.añadir(persona1);
    agenda.añadir(persona2);
    agenda.añadir(persona3);
    System.out.printf("El teléfono de Victor es: %s\n", agenda.getTelefono("Victor"));
    System.out.printf("Noemi está en la posición %d del array\n", agenda.buscar("Noemi"));
    System.out.printf("En la posicion 1 del array se encuentra: %s\n", agenda.getPersona(1));
    System.out.println(agenda.getPersona(2));
    agenda.modificarTelefono("Victor", "659673974");
    System.out.printf("El nuevo teléfono de Victor es %s\n", agenda.getTelefono("Victor"));
    System.out.println("Estoy realizando un PULL TO REQUEST");
  }
}
