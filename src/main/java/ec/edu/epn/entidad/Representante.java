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
@Table(name = "t_representante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representante.findAll", query = "SELECT r FROM Representante r")
    , @NamedQuery(name = "Representante.findByTIdRepresentantePk", query = "SELECT r FROM Representante r WHERE r.tIdRepresentantePk = :tIdRepresentantePk")
    , @NamedQuery(name = "Representante.findByCedula", query = "SELECT r FROM Representante r WHERE r.cedula = :cedula")
    , @NamedQuery(name = "Representante.findByNombresApellidos", query = "SELECT r FROM Representante r WHERE r.nombresApellidos = :nombresApellidos")
    , @NamedQuery(name = "Representante.findByParentesco", query = "SELECT r FROM Representante r WHERE r.parentesco = :parentesco")})
public class Representante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "t_id_representante_pk")
    private Integer tIdRepresentantePk;
    @Size(max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 40)
    @Column(name = "nombres_apellidos")
    private String nombresApellidos;
    @Size(max = 15)
    @Column(name = "parentesco")
    private String parentesco;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public Representante() {
    }

    public Representante(Integer tIdRepresentantePk) {
        this.tIdRepresentantePk = tIdRepresentantePk;
    }

    public Integer getTIdRepresentantePk() {
        return tIdRepresentantePk;
    }

    public void setTIdRepresentantePk(Integer tIdRepresentantePk) {
        this.tIdRepresentantePk = tIdRepresentantePk;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.Representante[ tIdRepresentantePk=" + tIdRepresentantePk + " ]";
    }
    
}
