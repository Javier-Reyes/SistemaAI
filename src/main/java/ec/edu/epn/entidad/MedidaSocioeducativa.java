/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "t_med_socioeducativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedidaSocioeducativa.findAll", query = "SELECT m FROM MedidaSocioeducativa m")
    , @NamedQuery(name = "MedidaSocioeducativa.findByIdMedSocioeducaPk", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.idMedSocioeducaPk = :idMedSocioeducaPk")
    , @NamedQuery(name = "MedidaSocioeducativa.findByMedSocioeducativa", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.medSocioeducativa = :medSocioeducativa")
    , @NamedQuery(name = "MedidaSocioeducativa.findByTiempoMeses", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.tiempoMeses = :tiempoMeses")
    , @NamedQuery(name = "MedidaSocioeducativa.findByTiempoDia", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.tiempoDia = :tiempoDia")
    , @NamedQuery(name = "MedidaSocioeducativa.findByTiempoHoras", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.tiempoHoras = :tiempoHoras")
    , @NamedQuery(name = "MedidaSocioeducativa.findByCumplioMedida", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.cumplioMedida = :cumplioMedida")
    , @NamedQuery(name = "MedidaSocioeducativa.findByFechaFinMedida", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.fechaFinMedida = :fechaFinMedida")
    , @NamedQuery(name = "MedidaSocioeducativa.findByInstEjecutoraMed", query = "SELECT m FROM MedidaSocioeducativa m WHERE m.instEjecutoraMed = :instEjecutoraMed")})
public class MedidaSocioeducativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_med_socioeduca_pk")
    private Integer idMedSocioeducaPk;
    @Size(max = 50)
    @Column(name = "med_socioeducativa")
    private String medSocioeducativa;
    @Column(name = "tiempo_meses")
    private Integer tiempoMeses;
    @Column(name = "tiempo_dia")
    private Integer tiempoDia;
    @Column(name = "tiempo_horas")
    private Integer tiempoHoras;
    @Column(name = "cumplio_medida")
    private Boolean cumplioMedida;
    @Column(name = "fecha_fin_medida")
    @Temporal(TemporalType.DATE)
    private Date fechaFinMedida;
    @Size(max = 50)
    @Column(name = "inst_ejecutora_med")
    private String instEjecutoraMed;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public MedidaSocioeducativa() {
    }

    public MedidaSocioeducativa(Integer idMedSocioeducaPk) {
        this.idMedSocioeducaPk = idMedSocioeducaPk;
    }

    public Integer getIdMedSocioeducaPk() {
        return idMedSocioeducaPk;
    }

    public void setIdMedSocioeducaPk(Integer idMedSocioeducaPk) {
        this.idMedSocioeducaPk = idMedSocioeducaPk;
    }

    public String getMedSocioeducativa() {
        return medSocioeducativa;
    }

    public void setMedSocioeducativa(String medSocioeducativa) {
        this.medSocioeducativa = medSocioeducativa;
    }

    public Integer getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(Integer tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public Integer getTiempoDia() {
        return tiempoDia;
    }

    public void setTiempoDia(Integer tiempoDia) {
        this.tiempoDia = tiempoDia;
    }

    public Integer getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(Integer tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public Boolean getCumplioMedida() {
        return cumplioMedida;
    }

    public void setCumplioMedida(Boolean cumplioMedida) {
        this.cumplioMedida = cumplioMedida;
    }

    public Date getFechaFinMedida() {
        return fechaFinMedida;
    }

    public void setFechaFinMedida(Date fechaFinMedida) {
        this.fechaFinMedida = fechaFinMedida;
    }

    public String getInstEjecutoraMed() {
        return instEjecutoraMed;
    }

    public void setInstEjecutoraMed(String instEjecutoraMed) {
        this.instEjecutoraMed = instEjecutoraMed;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.MedidaSocioeducativa[ idMedSocioeducaPk=" + idMedSocioeducaPk + " ]";
    }
    
}
