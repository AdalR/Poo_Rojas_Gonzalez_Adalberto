import javax.swing.JOptionPane;
import java.util.Scanner;
public class Biblioteca{
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

    }

}