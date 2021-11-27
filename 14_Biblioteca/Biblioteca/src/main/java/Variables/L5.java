package Variables;

import javax.swing.JOptionPane;

public class L5 extends Variables{
    public L5(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
    super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
    }
    public void MostrarLibro5(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }
}    

