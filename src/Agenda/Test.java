package Agenda;


import Agenda.Persona;
import Agenda.Agenda;


public class Test {

  public static void main(String[] args) {

    Persona persona1 = new Persona("TKB2BLA", "123456789");
    Persona persona2 = new Persona("Ozelito Tik Tak", "987654321");
    Persona persona3 = new Persona("Yeredaia", "147258369");
    Agenda agenda = new Agenda(4);
    agenda.añadir(persona1);
    agenda.añadir(persona2);
    agenda.añadir(persona3);
    String pers1="TKB2BLA";
    String pers2="Ozelito Tik Tak";
    String pers3="Yeredaia";
    System.out.printf("El teléfono de %s es: %s\n",pers1,agenda.getTelefono(pers1));
    System.out.printf("%s está en la posición %d del array\n",pers2, agenda.buscar(pers2));
    System.out.printf("En la posicion 1 del array se encuentra: %s\n", agenda.getPersona(1));
    System.out.println(agenda.getPersona(2));
    agenda.modificarTelefono(pers3, "659673974");
    System.out.printf("El nuevo teléfono de %s es %s\n",pers3, agenda.getTelefono(pers3));

  }
}
