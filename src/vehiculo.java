public class vehiculo {
/* Atributos: marca, velocidad, encendido
Metodos: enceder(), apagar(), acelerar(), frenar(), mostrarEstado*/

static String marca = "Toyota";
static int velocidad = 15;
static boolean encendido = false;

static void encender() {
    if (encendido == true && velocidad > 0) {
        System.out.println("encendido");
    } else {
       System.out.println("apagado");
    }

}
static void apagar() {
    if (encendido == false && velocidad == 0) {
        System.out.println("el vehiculo ya esta apagado");
    }else if(velocidad>0){
        System.out.println("el vehiculo esta en movimiento");
    }else if (velocidad<0){
        System.out.println("valor invalido");


    }else{
        System.out.println("vehiculo apagado correctamente");
    }
}
static void acelerar() {
    if (!encendido && velocidad > 0) { 
        
        velocidad += 10;
        
    } else {
        velocidad = 0;
        
    }
    System.out.println(velocidad + " km/h");
}    
public static void main(String[] args) {
    encender();
    apagar();
    acelerar();
}
}