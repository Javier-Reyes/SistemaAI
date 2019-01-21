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
@Table(name = "t_medida_mas_alta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedidaMasAlta.findAll", query = "SELECT m FROM MedidaMasAlta m")
    , @NamedQuery(name = "MedidaMasAlta.findByIdMedidaAltaPk", query = "SELECT m FROM MedidaMasAlta m WHERE m.idMedidaAltaPk = :idMedidaAltaPk")
    , @NamedQuery(name = "MedidaMasAlta.findByMedidaMasAlta", query = "SELECT m FROM MedidaMasAlta m WHERE m.medidaMasAlta = :medidaMasAlta")
    , @NamedQuery(name = "MedidaMasAlta.findByTiempoMeses", query = "SELECT m FROM MedidaMasAlta m WHERE m.tiempoMeses = :tiempoMeses")
    , @NamedQuery(name = "MedidaMasAlta.findByTiempoDia", query = "SELECT m FROM MedidaMasAlta m WHERE m.tiempoDia = :tiempoDia")})
public class MedidaMasAlta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medida_alta_pk")
    private Integer idMedidaAltaPk;
    @Column(name = "medida_mas_alta")
    private Integer medidaMasAlta;
    @Column(name = "tiempo_meses")
    private Integer tiempoMeses;
    @Column(name = "tiempo_dia")
    private Integer tiempoDia;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public MedidaMasAlta() {
    }

    public MedidaMasAlta(Integer idMedidaAltaPk) {
        this.idMedidaAltaPk = idMedidaAltaPk;
    }

    public Integer getIdMedidaAltaPk() {
        return idMedidaAltaPk;
    }

    public void setIdMedidaAltaPk(Integer idMedidaAltaPk) {
        this.idMedidaAltaPk = idMedidaAltaPk;
    }

    public Integer getMedidaMasAlta() {
        return medidaMasAlta;
    }

    public void setMedidaMasAlta(Integer medidaMasAlta) {
        this.medidaMasAlta = medidaMasAlta;
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

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.MedidaMasAlta[ idMedidaAltaPk=" + idMedidaAltaPk + " ]";
    }
    
}
