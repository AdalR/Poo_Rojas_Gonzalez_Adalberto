import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char Mascota, repetir;

        do{
            System.out.println("Elige que animal deseas ver: ");
            System.out.println("'a' para mostrar Perro");
            System.out.println("'b' para mostrar Gato");
            System.out.println("'c' para mostrar Hamster");
            System.out.println("'d' para mostrar Pez");
            Mascota = entrada.next().charAt(0); 
            switch(Mascota){
                case 'a':
                    Perro dog = new Perro("Pulgas", "de la calle ", "Croquetas dogchow", 1, true, "hace guau guau");
                    dog.mostrarPerro();
                    break;
                case 'b':
                    Gato cat = new Gato("Michi", "de colores", "whiscas", 2, true, 7);
                    cat.mostrarGato(); 
                    break;
                case 'c':
                    Hamster Ham = new Hamster("Stuart", "blanco con cafe", "verdura", 1, true, "con muchos juegos");
                    Ham.mostrarHamster();
                    break;
                case 'd':
                    Pez fish = new Pez("nemo", "payaso", "comida de pez", 2, true, "hace glu glu glu");
                    fish.mostrarPez();
                    break; 
            default:
                System.out.println("GRACIAS");
            }
            System.out.println("¿Desea repetir el programa? 's' para continuar");
            repetir = entrada.next().charAt(0);
        }while(repetir == 's');
    }
}