package sw.prueba_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Finca")
public class Finca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idFinca;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private int precioNoche;

    @Column(nullable = false)
    private int numeroPersonas;

    @Column(nullable = false)
    private boolean piscina;

    @Column(nullable = false)
    private int cantidadHabitaciones;

    @Column(nullable = false)
    private int cantidadCamas;

    @Column(nullable = false)
    private int hectarias;

    @Column(nullable = false)
    private String restricciones;

    @Column(nullable = false)
    private int idMunicipio;

    // Constructor vacío
    public Finca() {}

    // Getters y Setters
    public long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(long idFinca) {
        this.idFinca = idFinca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getHectarias() {
        return hectarias;
    }

    public void setHectarias(int hectarias) {
        this.hectarias = hectarias;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Override
    public String toString() {
        return "Finca{" +
                "idFinca=" + idFinca +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", restricciones='" + restricciones + '\'' +
                ", precioNoche=" + precioNoche +
                ", numeroPersonas=" + numeroPersonas +
                ", piscina=" + piscina +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                ", cantidadCamas=" + cantidadCamas +
                ", hectarias=" + hectarias +
                ", idMunicipio=" + idMunicipio +
                '}';
    }
}
