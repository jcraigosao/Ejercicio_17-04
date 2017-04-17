
package Ejercicio_inversiones;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private String email;
    private ArrayList <Asset> asset;

    public Cliente(String nombre, String apellido, int telefono, int edad, String email, ArrayList<Asset> asset) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.asset = new ArrayList<>();
    }

   public void addAsset(Asset asset){
       this.asset.add(asset);
   }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asset> getAsset() {
        return asset;
    }

    public void setAsset(ArrayList<Asset> asset) {
        this.asset = asset;
    }
    
    
}
