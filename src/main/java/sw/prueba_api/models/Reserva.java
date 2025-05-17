package sw.prueba_api.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @Column(nullable = false)
    private Long idReserva;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReserva;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrada;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;

    @Column(nullable = false)
    private Long numeroDocumento; // Reemplaza la relación con Usuario

    @Column(nullable = false)
    private Long idFinca; // Reemplaza la relación con Finca

    public Reserva() {}

    // Getters y setters
    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }
}
