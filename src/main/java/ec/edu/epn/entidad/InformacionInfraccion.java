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
@Table(name = "t_info_infraccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionInfraccion.findAll", query = "SELECT i FROM InformacionInfraccion i")
    , @NamedQuery(name = "InformacionInfraccion.findByIdInfoInfracPk", query = "SELECT i FROM InformacionInfraccion i WHERE i.idInfoInfracPk = :idInfoInfracPk")
    , @NamedQuery(name = "InformacionInfraccion.findByProvinciaDetencion", query = "SELECT i FROM InformacionInfraccion i WHERE i.provinciaDetencion = :provinciaDetencion")
    , @NamedQuery(name = "InformacionInfraccion.findByCantonDetencion", query = "SELECT i FROM InformacionInfraccion i WHERE i.cantonDetencion = :cantonDetencion")
    , @NamedQuery(name = "InformacionInfraccion.findByTipoInfraccion", query = "SELECT i FROM InformacionInfraccion i WHERE i.tipoInfraccion = :tipoInfraccion")})
public class InformacionInfraccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_info_infrac_pk")
    private Integer idInfoInfracPk;
    @Size(max = 50)
    @Column(name = "provincia_detencion")
    private String provinciaDetencion;
    @Size(max = 50)
    @Column(name = "canton_detencion")
    private String cantonDetencion;
    @Size(max = 200)
    @Column(name = "tipo_infraccion")
    private String tipoInfraccion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public InformacionInfraccion() {
    }

    public InformacionInfraccion(Integer idInfoInfracPk) {
        this.idInfoInfracPk = idInfoInfracPk;
    }

    public Integer getIdInfoInfracPk() {
        return idInfoInfracPk;
    }

    public void setIdInfoInfracPk(Integer idInfoInfracPk) {
        this.idInfoInfracPk = idInfoInfracPk;
    }

    public String getProvinciaDetencion() {
        return provinciaDetencion;
    }

    public void setProvinciaDetencion(String provinciaDetencion) {
        this.provinciaDetencion = provinciaDetencion;
    }

    public String getCantonDetencion() {
        return cantonDetencion;
    }

    public void setCantonDetencion(String cantonDetencion) {
        this.cantonDetencion = cantonDetencion;
    }

    public String getTipoInfraccion() {
        return tipoInfraccion;
    }

    public void setTipoInfraccion(String tipoInfraccion) {
        this.tipoInfraccion = tipoInfraccion;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.InformacionInfraccion[ idInfoInfracPk=" + idInfoInfracPk + " ]";
    }
    
}
