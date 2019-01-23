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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "t_actividades_instru")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActividadesEInstrumentos.findAll", query = "SELECT a FROM ActividadesEInstrumentos a")
    , @NamedQuery(name = "ActividadesEInstrumentos.findByIdActividadInstPk", query = "SELECT a FROM ActividadesEInstrumentos a WHERE a.idActividadInstPk = :idActividadInstPk")
    })
public class ActividadesEInstrumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad_inst_pk")
    private Integer idActividadInstPk;
    @Column(name = "plan_ejecucion_med")
    private Boolean planEjecucionMed;
    @Column(name = "plan_global_familia")
    private Boolean planGlobalFamilia;
    @Column(name = "plan_vida")
    private Boolean planVida;
    @Column(name = "plan_ind_aplic_med")
    private Boolean planIndAplicMed;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public ActividadesEInstrumentos() {
    }

    public ActividadesEInstrumentos(Integer idActividadInstPk) {
        this.idActividadInstPk = idActividadInstPk;
    }

    public Integer getIdActividadInstPk() {
        return idActividadInstPk;
    }

    public void setIdActividadInstPk(Integer idActividadInstPk) {
        this.idActividadInstPk = idActividadInstPk;
    }

    public Boolean getPlanEjecucionMed() {
        return planEjecucionMed;
    }

    public void setPlanEjecucionMed(Boolean planEjecucionMed) {
        this.planEjecucionMed = planEjecucionMed;
    }

    public Boolean getPlanGlobalFamilia() {
        return planGlobalFamilia;
    }

    public void setPlanGlobalFamilia(Boolean planGlobalFamilia) {
        this.planGlobalFamilia = planGlobalFamilia;
    }

    public Boolean getPlanVida() {
        return planVida;
    }

    public void setPlanVida(Boolean planVida) {
        this.planVida = planVida;
    }

    public Boolean getPlanIndAplicMed() {
        return planIndAplicMed;
    }

    public void setPlanIndAplicMed(Boolean planIndAplicMed) {
        this.planIndAplicMed = planIndAplicMed;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.ActividadesEInstrumentos[ idActividadInstPk=" + idActividadInstPk + " ]";
    }
    
}
