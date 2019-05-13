package xyz.mac.clase3;

public class Usuario {

    private final String id;
    private final String nombre;
    private final String ciudad;
    private final String pais;

    public Usuario(String id, String nombre, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
