package sw.prueba_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Imagen")
public class Imagen {

    @Id
    @Column(nullable = false)
    private Long idImagen;

    @Column(nullable = false)
    private String urlImagen;

    @Column(nullable = false)
    private Long idFinca; // Se reemplaza la relación con un campo primitivo

    public Imagen() {}

    // Getters y setters
    public Long getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Long idImagen) {
        this.idImagen = idImagen;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }
}
