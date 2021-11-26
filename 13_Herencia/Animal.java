public class Animal{
    private String nombre, raza, tipo_alimento;
    private int edad;
    private boolean sexo;
    public Animal(){

    }
    public Animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getTipo_alimento(){
        return tipo_alimento;
    }
    public void setTipo_aliemento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public boolean getSexo(){
        return sexo;
    }
    public void setNombre(boolean nombre){
        this.sexo = sexo;
    }
}