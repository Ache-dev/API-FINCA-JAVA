package sw.prueba_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoDocumento")
public class TipoDocumento {

    @Id
    @Column(nullable = false)
    private Long idTipoDocumento;

    @Column(nullable = false, length = 50)
    private String nombreDocumento;

    public TipoDocumento() {}

    // Getters y setters
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }
}
