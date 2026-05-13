public class persona {
   static String nombre_persona = "andrew";
   static String apellido_persona = "zambrano"; 
   static int edad_persona = 16;
   static char genero_persona = 'M';
   static Float promedio_semestre = 3.8f;
   static  boolean vive_manizales = true;

   //crear metodos adicionales
   static void imprimirNombre() {
    System.out.println("informacion del estudiante \nNombre completo: " + nombre_persona + " " + apellido_persona);
   }
   //metodo que imprime el promedio del semestre
   static void imprimirPromedio() {
    System.out.println("Promedio del semestre: " + promedio_semestre);
   }
   //metodo que identifica el genero de la persona
   static void imprimirGenero() {
    if (genero_persona == 'M') {
        System.out.println("El genero de la persona es masculino");
    } else if (genero_persona == 'F') {
        System.out.println("El genero de la persona es femenino");
    } else {
        System.out.println("El genero de la persona es otro");
    }
   
   }
   //metodo que verfica si la persona vive en manizales
    static void imprimirViveManizales   () {
    if (vive_manizales) {
        System.out.println("La persona vive en manizales");
    } else {
        System.out.println("La persona no vive en manizales");
    }
    }
   //metodo imoprime la edad de la perssona
   static void imprimirEdad() {
    System.out.println("Edad: " + edad_persona);}
   
   public static void main(String[] args) {
    //llamar el metodo de la clase
    imprimirNombre();
    imprimirPromedio();
    imprimirViveManizales();
    imprimirEdad();
    imprimirGenero();
    
    
   }
}

