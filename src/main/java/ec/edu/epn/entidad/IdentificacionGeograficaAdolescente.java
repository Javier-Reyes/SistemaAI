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
@Table(name = "t_id_geografica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdentificacionGeograficaAdolescente.findAll", query = "SELECT i FROM IdentificacionGeograficaAdolescente i")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByIdIdGeograficaPk", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.idIdGeograficaPk = :idIdGeograficaPk")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByPaisNacimiento", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.paisNacimiento = :paisNacimiento")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByProvinciaAdolescent", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.provinciaAdolescent = :provinciaAdolescent")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByCantonAdolescente", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.cantonAdolescente = :cantonAdolescente")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByParroquia", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.parroquia = :parroquia")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByDireccionDomicilio", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.direccionDomicilio = :direccionDomicilio")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByReferenciaDomicilio", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.referenciaDomicilio = :referenciaDomicilio")
    , @NamedQuery(name = "IdentificacionGeograficaAdolescente.findByTelefono", query = "SELECT i FROM IdentificacionGeograficaAdolescente i WHERE i.telefono = :telefono")})
public class IdentificacionGeograficaAdolescente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_id_geografica_pk")
    private Integer idIdGeograficaPk;
    @Size(max = 20)
    @Column(name = "pais_nacimiento")
    private String paisNacimiento;
    @Size(max = 20)
    @Column(name = "provincia_adolescent")
    private String provinciaAdolescent;
    @Size(max = 20)
    @Column(name = "canton_adolescente")
    private String cantonAdolescente;
    @Size(max = 20)
    @Column(name = "parroquia")
    private String parroquia;
    @Size(max = 125)
    @Column(name = "direccion_domicilio")
    private String direccionDomicilio;
    @Size(max = 125)
    @Column(name = "referencia_domicilio")
    private String referenciaDomicilio;
    @Size(max = 10)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public IdentificacionGeograficaAdolescente() {
    }

    public IdentificacionGeograficaAdolescente(Integer idIdGeograficaPk) {
        this.idIdGeograficaPk = idIdGeograficaPk;
    }

    public Integer getIdIdGeograficaPk() {
        return idIdGeograficaPk;
    }

    public void setIdIdGeograficaPk(Integer idIdGeograficaPk) {
        this.idIdGeograficaPk = idIdGeograficaPk;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getProvinciaAdolescent() {
        return provinciaAdolescent;
    }

    public void setProvinciaAdolescent(String provinciaAdolescent) {
        this.provinciaAdolescent = provinciaAdolescent;
    }

    public String getCantonAdolescente() {
        return cantonAdolescente;
    }

    public void setCantonAdolescente(String cantonAdolescente) {
        this.cantonAdolescente = cantonAdolescente;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getReferenciaDomicilio() {
        return referenciaDomicilio;
    }

    public void setReferenciaDomicilio(String referenciaDomicilio) {
        this.referenciaDomicilio = referenciaDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.IdentificacionGeograficaAdolescente[ idIdGeograficaPk=" + idIdGeograficaPk + " ]";
    }
    
}
