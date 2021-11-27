import Variables;
import javax.swing.JOptionPane;
import java.util.Scanner;
import Biblioteca.Variables;
public class Biblioteca{
    
    L1 Libro1 = new L1("El principito", "Antoine de Saint Exupery", "de la historia de un pequeño principe que parte de su asteroide a una travesia por el universo, en la cual descubre la desconocida forma en que los adultos ven la vida y comprende el valor del amor y la amistad.", 35.5, true);
    L2 Libro2 = new L2("Moby Dick", "Herman Melville", "Narra la travesia del barco ballenero Pequod, comandado por el capitan Ahab, junto a Ismael y el arponero Queequeg en la obsesiva y autodestructiva persecucion de un gran cachalote blanco.", 40.79, true);
    L3 Libro3 = new L3("El codigo Da Vinci", "Dan Brown", "Un asesinato en el Museo del Louvre y pistas en las pinturas de Leonardo da Vinci conducen al descubrimiento de un misterio religioso que podria estremecer las bases del cristianismo.", 54.00, true);
    L4 Libro4 = new L4("Dracula", "Novela de Bram Stoker", "el conde Dracula, se volvió el arquetipo de vampiro occidental por antonomasia, llegando a ser considerado el vampiro mas famoso.", 34.5, true);
    L5 Libro5 = new L5("Diario de Ana Frank", "Libro de Ana Frank", "es un diario escrito por la joven Ana Frank entre el 12 de junio de 1942 y el 4 de agosto de 1944. Oculta con su familia y otros judios en una buhardilla de unos almacenes de Amsterdam durante la ocupacion nazi de Holanda.", 30.40, true);
    Biblioteca costo = new Biblioteca();
    Scanner entrada = new Scanner(System.in);

    
    public void MenuP(){
    String text, usuario;
    int opciones =0, usuario1;

    try{
        usuario1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de usuario: "));
        if( usuario1 == 12345){
            text = JOptionPane.showInputDialog("Seleccione el programa a ejecutar de la siguiente lista: "
                + "\n 1.- Consultar costos." 
                + "\n 2.- Prestamo de libros"
                + "\n 3.- Devolución de libros");
                opciones = Integer.parseInt(text);
        }else{
            JOptionPane.showMessageDialog(null, "No es el usuario correcto");
        }


    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se puede ingresar los numeros del 1 al 3");

        JOptionPane.showMessageDialog(null, " "+e.getMessage());
        System.out.println("El erro es: " + e.getMessage());

    }
    switch (opciones) {
        case 1:
            costo.Costo();
            break;

        case 2:
            //metodo
            break;
        
        case 3:
            //metodo
            break;
    
        default:
            JOptionPane.showMessageDialog(null, "Vuelva pronto");
            break;
        }   
    }
    public void Costo(){
        JOptionPane.showMessageDialog(null, "los libros en stock son: ");
        Libro1.MostrarLibro1();
        Libro2.MostrarLibro2();
        Libro3.MostrarLibro3();
        Libro4.MostrarLibro4();
        Libro5.MostrarLibro5();

    }

}