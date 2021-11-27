package main;
import javax.swing.JOptionPane;
import Variables.L1;
import Variables.L2;
import Variables.L3;
import Variables.L4;
import Variables.L5;
public class Principal{
    public int usuario1=0;
    public int opciones=0;
    public L1 Libro1 = new L1("El principito", "Antoine de Saint Exupery", "de la historia de un pequeño principe que parte de su asteroide " + "\na una travesia por el universo, en la cual descubre la desconocida forma en que los adultos ven la vida y comprende el valor del amor y la amistad.", 35.5, true);
    public L2 Libro2 = new L2("Moby Dick", "Herman Melville", "Narra la travesia del barco ballenero Pequod, comandado por el capitan Ahab, junto" + "\n a Ismael y el arponero Queequeg en la obsesiva y autodestructiva persecucion de un gran cachalote blanco.", 40.79, true);
    public L3 Libro3 = new L3("El codigo Da Vinci", "Dan Brown", "Un asesinato en el Museo del Louvre y pistas en las pinturas de Leonardo da Vinci " + "\nconducen al descubrimiento de un misterio religioso que podria estremecer las bases del cristianismo.", 54.00, true);
    public L4 Libro4 = new L4("Dracula", "Novela de Bram Stoker", "el conde Dracula, se volvió el arquetipo de vampiro occidental por antonomasia, llegando" + "\n a ser considerado el vampiro mas famoso.", 34.5, true);
    public L5 Libro5 = new L5("Diario de Ana Frank", "Libro de Ana Frank", "es un diario escrito por la joven Ana Frank entre el 12 de junio de 1942 y el" + "\n4 de agosto de 1944. Oculta con su familia y otros judios en una buhardilla de unos almacenes de Amsterdam durante la ocupacion nazi de Holanda.", 30.40, true);

    public void MenuP() {

    try{
        usuario1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de usuario: "));
        if( usuario1 == 12345){
            opciones = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa a ejecutar de la siguiente lista: " + "\n 1 Consultar costos." + "\n 2 Prestamo de libros" +"\n 3 Devolucion de libros"));
        }else{
            JOptionPane.showMessageDialog(null, "No es el usuario correcto");
            MenuP();
        }
        


    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se puede ingresar los numeros del 1 al 3");

        JOptionPane.showMessageDialog(null, " "+e.getMessage());
        System.out.println("El error es: " + e.getMessage());

    }
    switch (opciones) {
        case 1:
            Costo();
            break;

        case 2:
            renta();
            break;
        
        case 3:
            Devolver();
            break;
    
        default:
            JOptionPane.showMessageDialog(null, "Vuelva pronto");
            break;
        }   
    }
    public void Costo(){
        int seleccion;
        
        JOptionPane.showMessageDialog(null, "los libros en stock son: ");
        Libro1.MostrarLibro1();
        Libro2.MostrarLibro2();
        Libro3.MostrarLibro3();
        Libro4.MostrarLibro4();
        Libro5.MostrarLibro5();
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar algun libro? selecciona 1 para si"));
        if(seleccion == 1){
            Principal Renta = new Principal();
            Renta.renta();
        }else{
            
        }

    }    
    public void renta(){
        int escogerlibro, seleccionar = 1;
        double principito = 35.5;
        double mobydick = 40.79;
        double davinci = 54.00;
        double dracula = 34.5;
        double anafrank = 30.40;
        double total = 0;
        do{
        escogerlibro = Integer.parseInt(JOptionPane.showInputDialog("Seleccione del 1 al 5 para rentar uno de los libros"));
        switch(escogerlibro){
            case 1:
                total = total + principito;
                JOptionPane.showInternalMessageDialog(null, "usted lleva" + total);
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar otro libro? selecciona 1 para si o 0 para no"));
                break;
            case 2:
                total = total + mobydick;
                JOptionPane.showInternalMessageDialog(null, "usted lleva" + total);
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar otro libro? selecciona 1 para si o 0 para no"));
                break;
            case 3:
                total = total + davinci;
                JOptionPane.showInternalMessageDialog(null, "usted lleva" + total);
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar otro libro? selecciona 1 para si o 0 para no"));
                break;
            case 4:
                total = total + dracula;
                JOptionPane.showInternalMessageDialog(null, "usted lleva" + total);
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar otro libro? selecciona 1 para si o 0 para no"));
                break;
            case 5:
                total = total + anafrank;
                JOptionPane.showInternalMessageDialog(null, "usted lleva" + total);
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Deseas rentar otro libro? selecciona 1 para si o 0 para no"));
                break;            
            default:
                JOptionPane.showInternalMessageDialog(null, "Gracias por rentar con nosotros, disfrute sus libros" + "\n"+ total);
        }
        
        
        
        }while(seleccionar > 0);
    }
    public void Devolver(){
        int devolver;
        int mas = 0;
        int n = 0;
        do{
        devolver = Integer.parseInt(JOptionPane.showInputDialog("Que libro va a devolver? presione las siguientes opciones" + "\n 1. El principito" + "\n 2. Moby Dick" + "\n 3. Codigo da vinci " + "\n 4. Dracula" + "\n 5. El diario de Ana Frank" + "\n seleccione 0 si no va a devolver")); 
        mas = Integer.parseInt(JOptionPane.showInputDialog("Requieres devolver mas libros? seleccione 0 para si o 1 para no" ));
        
        }while(mas > 0);
        JOptionPane.showMessageDialog(null, "FACTURA" + "\n Gracias por rentar libros con nosotros" + "\n en total usted rento: ");
    }
    public static void main(String[] args){
        Principal mainp = new Principal();
        do{
            mainp.MenuP();
            mainp.opciones = Integer.parseInt(JOptionPane.showInputDialog("En caso de que desee regresar al menu principal digite 1"));            
        }while(mainp.opciones == 1);
    }
}
