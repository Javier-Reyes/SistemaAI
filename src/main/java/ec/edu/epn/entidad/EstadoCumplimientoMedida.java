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
@Table(name = "t_estado_cump_medida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCumplimientoMedida.findAll", query = "SELECT e FROM EstadoCumplimientoMedida e")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByIdEstadCumpMedPk", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.idEstadCumpMedPk = :idEstadCumpMedPk")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findBySituacionActual", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.situacionActual = :situacionActual")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByFechaReportCulmin", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.fechaReportCulmin = :fechaReportCulmin")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByFechaReportDerivac", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.fechaReportDerivac = :fechaReportDerivac")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByUzdiReceptDeriva", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.uzdiReceptDeriva = :uzdiReceptDeriva")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByFechaReportIncump", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.fechaReportIncump = :fechaReportIncump")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByEstadoIncump", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.estadoIncump = :estadoIncump")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByReanudacionMed", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.reanudacionMed = :reanudacionMed")
    , @NamedQuery(name = "EstadoCumplimientoMedida.findByFechaReanudacion", query = "SELECT e FROM EstadoCumplimientoMedida e WHERE e.fechaReanudacion = :fechaReanudacion")})
public class EstadoCumplimientoMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estad_cump_med_pk")
    private Integer idEstadCumpMedPk;
    @Size(max = 20)
    @Column(name = "situacion_actual")
    private String situacionActual;
    @Column(name = "fecha_report_culmin")
    @Temporal(TemporalType.DATE)
    private Date fechaReportCulmin;
    @Column(name = "fecha_report_derivac")
    @Temporal(TemporalType.DATE)
    private Date fechaReportDerivac;
    @Size(max = 7)
    @Column(name = "uzdi_recept_deriva")
    private String uzdiReceptDeriva;
    @Column(name = "fecha_report_incump")
    @Temporal(TemporalType.DATE)
    private Date fechaReportIncump;
    @Size(max = 20)
    @Column(name = "estado_incump")
    private String estadoIncump;
    @Column(name = "reanudacion_med")
    private Boolean reanudacionMed;
    @Column(name = "fecha_reanudacion")
    @Temporal(TemporalType.DATE)
    private Date fechaReanudacion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public EstadoCumplimientoMedida() {
    }

    public EstadoCumplimientoMedida(Integer idEstadCumpMedPk) {
        this.idEstadCumpMedPk = idEstadCumpMedPk;
    }

    public Integer getIdEstadCumpMedPk() {
        return idEstadCumpMedPk;
    }

    public void setIdEstadCumpMedPk(Integer idEstadCumpMedPk) {
        this.idEstadCumpMedPk = idEstadCumpMedPk;
    }

    public String getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(String situacionActual) {
        this.situacionActual = situacionActual;
    }

    public Date getFechaReportCulmin() {
        return fechaReportCulmin;
    }

    public void setFechaReportCulmin(Date fechaReportCulmin) {
        this.fechaReportCulmin = fechaReportCulmin;
    }

    public Date getFechaReportDerivac() {
        return fechaReportDerivac;
    }

    public void setFechaReportDerivac(Date fechaReportDerivac) {
        this.fechaReportDerivac = fechaReportDerivac;
    }

    public String getUzdiReceptDeriva() {
        return uzdiReceptDeriva;
    }

    public void setUzdiReceptDeriva(String uzdiReceptDeriva) {
        this.uzdiReceptDeriva = uzdiReceptDeriva;
    }

    public Date getFechaReportIncump() {
        return fechaReportIncump;
    }

    public void setFechaReportIncump(Date fechaReportIncump) {
        this.fechaReportIncump = fechaReportIncump;
    }

    public String getEstadoIncump() {
        return estadoIncump;
    }

    public void setEstadoIncump(String estadoIncump) {
        this.estadoIncump = estadoIncump;
    }

    public Boolean getReanudacionMed() {
        return reanudacionMed;
    }

    public void setReanudacionMed(Boolean reanudacionMed) {
        this.reanudacionMed = reanudacionMed;
    }

    public Date getFechaReanudacion() {
        return fechaReanudacion;
    }

    public void setFechaReanudacion(Date fechaReanudacion) {
        this.fechaReanudacion = fechaReanudacion;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.EstadoCumplimientoMedida[ idEstadCumpMedPk=" + idEstadCumpMedPk + " ]";
    }
    
}
