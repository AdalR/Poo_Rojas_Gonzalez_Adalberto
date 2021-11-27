package Variables;
public class Variables{

    private String Nombre;
    private String Autor;
    private String Sinopsis;
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
}

