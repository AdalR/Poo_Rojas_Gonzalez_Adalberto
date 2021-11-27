package Variables;

import javax.swing.JOptionPane;

public class L3 extends Variables{
    public L3(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
    super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
    }
    public void MostrarLibro3(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }
}