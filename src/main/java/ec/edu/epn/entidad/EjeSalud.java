/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.entidad;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "t_eje_salud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EjeSalud.findAll", query = "SELECT e FROM EjeSalud e")
    , @NamedQuery(name = "EjeSalud.findByIdEjeSaludPk", query = "SELECT e FROM EjeSalud e WHERE e.idEjeSaludPk = :idEjeSaludPk")
    , @NamedQuery(name = "EjeSalud.findBySituacionSalud", query = "SELECT e FROM EjeSalud e WHERE e.situacionSalud = :situacionSalud")
    , @NamedQuery(name = "EjeSalud.findByDiagnosticoEnfermed", query = "SELECT e FROM EjeSalud e WHERE e.diagnosticoEnfermed = :diagnosticoEnfermed")
    , @NamedQuery(name = "EjeSalud.findByRecibeTratamiento", query = "SELECT e FROM EjeSalud e WHERE e.recibeTratamiento = :recibeTratamiento")
    , @NamedQuery(name = "EjeSalud.findByTomaMedicacion", query = "SELECT e FROM EjeSalud e WHERE e.tomaMedicacion = :tomaMedicacion")
    , @NamedQuery(name = "EjeSalud.findByNumHistoriaClinica", query = "SELECT e FROM EjeSalud e WHERE e.numHistoriaClinica = :numHistoriaClinica")
    , @NamedQuery(name = "EjeSalud.findByEmbarazo", query = "SELECT e FROM EjeSalud e WHERE e.embarazo = :embarazo")
    , @NamedQuery(name = "EjeSalud.findByTiempGestacionMes", query = "SELECT e FROM EjeSalud e WHERE e.tiempGestacionMes = :tiempGestacionMes")
    , @NamedQuery(name = "EjeSalud.findByConsumeSustancias", query = "SELECT e FROM EjeSalud e WHERE e.consumeSustancias = :consumeSustancias")
    , @NamedQuery(name = "EjeSalud.findByTipoSustancia", query = "SELECT e FROM EjeSalud e WHERE e.tipoSustancia = :tipoSustancia")
    , @NamedQuery(name = "EjeSalud.findByRecibeTratamDrogas", query = "SELECT e FROM EjeSalud e WHERE e.recibeTratamDrogas = :recibeTratamDrogas")})
public class EjeSalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje_salud_pk")
    private Integer idEjeSaludPk;
    @Size(max = 15)
    @Column(name = "situacion_salud")
    private String situacionSalud;
    @Size(max = 100)
    @Column(name = "diagnostico_enfermed")
    private String diagnosticoEnfermed;
    @Column(name = "recibe_tratamiento")
    private Boolean recibeTratamiento;
    @Column(name = "toma_medicacion")
    private Boolean tomaMedicacion;
    @Size(max = 10)
    @Column(name = "num_historia_clinica")
    private String numHistoriaClinica;
    @Size(max = 10)
    @Column(name = "embarazo")
    private String embarazo;
    @Size(max = 10)
    @Column(name = "tiemp_gestacion_mes")
    private String tiempGestacionMes;
    @Column(name = "consume_sustancias")
    private Boolean consumeSustancias;
    @Size(max = 20)
    @Column(name = "tipo_sustancia")
    private String tipoSustancia;
    @Column(name = "recibe_tratam_drogas")
    private Boolean recibeTratamDrogas;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public EjeSalud() {
    }

    public EjeSalud(Integer idEjeSaludPk) {
        this.idEjeSaludPk = idEjeSaludPk;
    }

    public Integer getIdEjeSaludPk() {
        return idEjeSaludPk;
    }

    public void setIdEjeSaludPk(Integer idEjeSaludPk) {
        this.idEjeSaludPk = idEjeSaludPk;
    }

    public String getSituacionSalud() {
        return situacionSalud;
    }

    public void setSituacionSalud(String situacionSalud) {
        this.situacionSalud = situacionSalud;
    }

    public String getDiagnosticoEnfermed() {
        return diagnosticoEnfermed;
    }

    public void setDiagnosticoEnfermed(String diagnosticoEnfermed) {
        this.diagnosticoEnfermed = diagnosticoEnfermed;
    }

    public Boolean getRecibeTratamiento() {
        return recibeTratamiento;
    }

    public void setRecibeTratamiento(Boolean recibeTratamiento) {
        this.recibeTratamiento = recibeTratamiento;
    }

    public Boolean getTomaMedicacion() {
        return tomaMedicacion;
    }

    public void setTomaMedicacion(Boolean tomaMedicacion) {
        this.tomaMedicacion = tomaMedicacion;
    }

    public String getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(String numHistoriaClinica) {
        this.numHistoriaClinica = numHistoriaClinica;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getTiempGestacionMes() {
        return tiempGestacionMes;
    }

    public void setTiempGestacionMes(String tiempGestacionMes) {
        this.tiempGestacionMes = tiempGestacionMes;
    }

    public Boolean getConsumeSustancias() {
        return consumeSustancias;
    }

    public void setConsumeSustancias(Boolean consumeSustancias) {
        this.consumeSustancias = consumeSustancias;
    }

    public String getTipoSustancia() {
        return tipoSustancia;
    }

    public void setTipoSustancia(String tipoSustancia) {
        this.tipoSustancia = tipoSustancia;
    }

    public Boolean getRecibeTratamDrogas() {
        return recibeTratamDrogas;
    }

    public void setRecibeTratamDrogas(Boolean recibeTratamDrogas) {
        this.recibeTratamDrogas = recibeTratamDrogas;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.EjeSalud[ idEjeSaludPk=" + idEjeSaludPk + " ]";
    }
    
}
