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
@Table(name = "t_unidad_zonal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadZonal.findAll", query = "SELECT u FROM UnidadZonal u")
    , @NamedQuery(name = "UnidadZonal.findByIdUnidadZonal", query = "SELECT u FROM UnidadZonal u WHERE u.idUnidadZonal = :idUnidadZonal")
    , @NamedQuery(name = "UnidadZonal.findByUnidadZonal", query = "SELECT u FROM UnidadZonal u WHERE u.unidadZonal = :unidadZonal")
    , @NamedQuery(name = "UnidadZonal.findByNumExpediente", query = "SELECT u FROM UnidadZonal u WHERE u.numExpediente = :numExpediente")})
public class UnidadZonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad_zonal")
    private Integer idUnidadZonal;
    @Size(max = 7)
    @Column(name = "unidad_zonal")
    private String unidadZonal;
    @Size(max = 10)
    @Column(name = "num_expediente")
    private String numExpediente;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public UnidadZonal() {
    }

    public UnidadZonal(Integer idUnidadZonal) {
        this.idUnidadZonal = idUnidadZonal;
    }

    public Integer getIdUnidadZonal() {
        return idUnidadZonal;
    }

    public void setIdUnidadZonal(Integer idUnidadZonal) {
        this.idUnidadZonal = idUnidadZonal;
    }

    public String getUnidadZonal() {
        return unidadZonal;
    }

    public void setUnidadZonal(String unidadZonal) {
        this.unidadZonal = unidadZonal;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.UnidadZonal[ idUnidadZonal=" + idUnidadZonal + " ]";
    }
    
}
