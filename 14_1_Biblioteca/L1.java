import javax.swing.JOptionPane;
public class L1 extends Variables{
    public L1(String Nombre, String Autor, String Sinopsis, int Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
    }
    public void MostrarL1(){
        System.out.println("Titulo: " + getNombre());
    }
}