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
@Table(name = "t_eje_laboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EjeLaboral.findAll", query = "SELECT e FROM EjeLaboral e")
    , @NamedQuery(name = "EjeLaboral.findByIdEjeLaboralPk", query = "SELECT e FROM EjeLaboral e WHERE e.idEjeLaboralPk = :idEjeLaboralPk")
    , @NamedQuery(name = "EjeLaboral.findByTrabaja", query = "SELECT e FROM EjeLaboral e WHERE e.trabaja = :trabaja")
    , @NamedQuery(name = "EjeLaboral.findByOcupacionAdolescent", query = "SELECT e FROM EjeLaboral e WHERE e.ocupacionAdolescent = :ocupacionAdolescent")
    , @NamedQuery(name = "EjeLaboral.findByRamaActivEcon", query = "SELECT e FROM EjeLaboral e WHERE e.ramaActivEcon = :ramaActivEcon")
    , @NamedQuery(name = "EjeLaboral.findByDescripcionActiv", query = "SELECT e FROM EjeLaboral e WHERE e.descripcionActiv = :descripcionActiv")
    , @NamedQuery(name = "EjeLaboral.findByNumHorasTrabajo", query = "SELECT e FROM EjeLaboral e WHERE e.numHorasTrabajo = :numHorasTrabajo")
    , @NamedQuery(name = "EjeLaboral.findByIngresoMensual", query = "SELECT e FROM EjeLaboral e WHERE e.ingresoMensual = :ingresoMensual")
    , @NamedQuery(name = "EjeLaboral.findByAfiliacionIess", query = "SELECT e FROM EjeLaboral e WHERE e.afiliacionIess = :afiliacionIess")
    , @NamedQuery(name = "EjeLaboral.findByInclinacionVocacion", query = "SELECT e FROM EjeLaboral e WHERE e.inclinacionVocacion = :inclinacionVocacion")})
public class EjeLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje_laboral_pk")
    private Integer idEjeLaboralPk;
    @Column(name = "trabaja")
    private Boolean trabaja;
    @Size(max = 30)
    @Column(name = "ocupacion_adolescent")
    private String ocupacionAdolescent;
    @Size(max = 20)
    @Column(name = "rama_activ_econ")
    private String ramaActivEcon;
    @Size(max = 100)
    @Column(name = "descripcion_activ")
    private String descripcionActiv;
    @Column(name = "num_horas_trabajo")
    private Integer numHorasTrabajo;
    @Size(max = 20)
    @Column(name = "ingreso_mensual")
    private String ingresoMensual;
    @Column(name = "afiliacion_iess")
    private Boolean afiliacionIess;
    @Size(max = 80)
    @Column(name = "inclinacion_vocacion")
    private String inclinacionVocacion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public EjeLaboral() {
    }

    public EjeLaboral(Integer idEjeLaboralPk) {
        this.idEjeLaboralPk = idEjeLaboralPk;
    }

    public Integer getIdEjeLaboralPk() {
        return idEjeLaboralPk;
    }

    public void setIdEjeLaboralPk(Integer idEjeLaboralPk) {
        this.idEjeLaboralPk = idEjeLaboralPk;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    public String getOcupacionAdolescent() {
        return ocupacionAdolescent;
    }

    public void setOcupacionAdolescent(String ocupacionAdolescent) {
        this.ocupacionAdolescent = ocupacionAdolescent;
    }

    public String getRamaActivEcon() {
        return ramaActivEcon;
    }

    public void setRamaActivEcon(String ramaActivEcon) {
        this.ramaActivEcon = ramaActivEcon;
    }

    public String getDescripcionActiv() {
        return descripcionActiv;
    }

    public void setDescripcionActiv(String descripcionActiv) {
        this.descripcionActiv = descripcionActiv;
    }

    public Integer getNumHorasTrabajo() {
        return numHorasTrabajo;
    }

    public void setNumHorasTrabajo(Integer numHorasTrabajo) {
        this.numHorasTrabajo = numHorasTrabajo;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Boolean getAfiliacionIess() {
        return afiliacionIess;
    }

    public void setAfiliacionIess(Boolean afiliacionIess) {
        this.afiliacionIess = afiliacionIess;
    }

    public String getInclinacionVocacion() {
        return inclinacionVocacion;
    }

    public void setInclinacionVocacion(String inclinacionVocacion) {
        this.inclinacionVocacion = inclinacionVocacion;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.EjeLaboral[ idEjeLaboralPk=" + idEjeLaboralPk + " ]";
    }
    
}
