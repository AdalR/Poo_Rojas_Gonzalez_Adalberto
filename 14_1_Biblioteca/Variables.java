import java.util.Scanner;
import javax.swing.JOptionPane;
public class Variables{

    private String Nombre, Autor, Sinopsis;
    private double Costoo;
    private boolean Disponibilidad;

    public Variables(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Sinopsis = Sinopsis;
        this.Costoo = Costoo;
        this.Disponibilidad = Disponibilidad;

    }
    public String getNombre(){
        return Nombre;
    }
    public String getAutor(){
        return Autor;
    }
    public String getSinopsis(){
        return Sinopsis;
    }
    public double getCostoo(){
        return Costoo;
    }
    public boolean getDisponibilidad(){
        return Disponibilidad;
    }
    public class L1 extends Variables{
        public L1(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
        }
    }
    public void MostrarLibro1(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }
    public class L2 extends Variables{
        public L2(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
        }
    }
    public void MostrarLibro2(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }        
    public class L3 extends Variables{
        public L3(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
        }
    }
    public void MostrarLibro3(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }
    public class L4 extends Variables{
        public L4(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
        }
    }
    public void MostrarLibro4(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }
    public class L5 extends Variables{
        public L5(String Nombre, String Autor, String Sinopsis, double Costoo, boolean Disponibilidad){
        super(Nombre, Autor, Sinopsis, Costoo, Disponibilidad);
        }
    }
    public void MostrarLibro5(){
    JOptionPane.showMessageDialog(null, "Titulo: " + getNombre() + "Autor: " + getAutor() + "Trata sobre: " + getSinopsis() + "Costo: " + getCostoo() + "Disponibilidad: " + getDisponibilidad());
    }    
}

