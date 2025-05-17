package sw.prueba_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Municipio")
public class Municipio {

    @Id
    @Column(nullable = false)
    private Long idMunicipio;

    @Column(nullable = false, length = 100)
    private String nombreMunicipio;

    public Municipio() {}

    // Getters y setters
    public Long getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
}
