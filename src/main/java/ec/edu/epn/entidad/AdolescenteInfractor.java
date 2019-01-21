/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.entidad;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "t_adolescente_infract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdolescenteInfractor.findAll", query = "SELECT a FROM AdolescenteInfractor a")
    , @NamedQuery(name = "AdolescenteInfractor.findByIdAdolescentePk", query = "SELECT a FROM AdolescenteInfractor a WHERE a.idAdolescentePk = :idAdolescentePk")
    , @NamedQuery(name = "AdolescenteInfractor.findByNombres", query = "SELECT a FROM AdolescenteInfractor a WHERE a.nombres = :nombres")
    , @NamedQuery(name = "AdolescenteInfractor.findByApellidos", query = "SELECT a FROM AdolescenteInfractor a WHERE a.apellidos = :apellidos")
    , @NamedQuery(name = "AdolescenteInfractor.findByCedula", query = "SELECT a FROM AdolescenteInfractor a WHERE a.cedula = :cedula")
    , @NamedQuery(name = "AdolescenteInfractor.findByGenero", query = "SELECT a FROM AdolescenteInfractor a WHERE a.genero = :genero")
    , @NamedQuery(name = "AdolescenteInfractor.findByEtnia", query = "SELECT a FROM AdolescenteInfractor a WHERE a.etnia = :etnia")
    , @NamedQuery(name = "AdolescenteInfractor.findByDiscapacidad", query = "SELECT a FROM AdolescenteInfractor a WHERE a.discapacidad = :discapacidad")
    , @NamedQuery(name = "AdolescenteInfractor.findByTipoDiscapacidad", query = "SELECT a FROM AdolescenteInfractor a WHERE a.tipoDiscapacidad = :tipoDiscapacidad")
    , @NamedQuery(name = "AdolescenteInfractor.findByPorcentajeDiscapaci", query = "SELECT a FROM AdolescenteInfractor a WHERE a.porcentajeDiscapaci = :porcentajeDiscapaci")
    , @NamedQuery(name = "AdolescenteInfractor.findByRegistroSocial", query = "SELECT a FROM AdolescenteInfractor a WHERE a.registroSocial = :registroSocial")
    , @NamedQuery(name = "AdolescenteInfractor.findByEstadoCivil", query = "SELECT a FROM AdolescenteInfractor a WHERE a.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "AdolescenteInfractor.findByFechaNacimiento", query = "SELECT a FROM AdolescenteInfractor a WHERE a.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "AdolescenteInfractor.findByEdad", query = "SELECT a FROM AdolescenteInfractor a WHERE a.edad = :edad")
    , @NamedQuery(name = "AdolescenteInfractor.findByNumeroHijos", query = "SELECT a FROM AdolescenteInfractor a WHERE a.numeroHijos = :numeroHijos")
    , @NamedQuery(name = "AdolescenteInfractor.findByConQuienVive", query = "SELECT a FROM AdolescenteInfractor a WHERE a.conQuienVive = :conQuienVive")
    , @NamedQuery(name = "AdolescenteInfractor.findByEnfermedadesCr", query = "SELECT a FROM AdolescenteInfractor a WHERE a.enfermedadesCr = :enfermedadesCr")})
public class AdolescenteInfractor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adolescente_pk")
    private Integer idAdolescentePk;
    @Size(max = 20)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 30)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 15)
    @Column(name = "genero")
    private String genero;
    @Size(max = 20)
    @Column(name = "etnia")
    private String etnia;
    @Size(max = 20)
    @Column(name = "discapacidad")
    private String discapacidad;
    @Size(max = 20)
    @Column(name = "tipo_discapacidad")
    private String tipoDiscapacidad;
    @Column(name = "porcentaje_discapaci")
    private Integer porcentajeDiscapaci;
    @Column(name = "registro_social")
    private Boolean registroSocial;
    @Size(max = 10)
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "numero_hijos")
    private Integer numeroHijos;
    @Size(max = 20)
    @Column(name = "con_quien_vive")
    private String conQuienVive;
    @Column(name = "enfermedades_cr")
    private Boolean enfermedadesCr;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<IdentificacionGeograficaAdolescente> identificacionGeograficaAdolescenteCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<EstadoCumplimientoMedida> estadoCumplimientoMedidaCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<MedidaSocioeducativa> medidaSocioeducativaCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<EjeLaboral> ejeLaboralCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<UnidadZonal> unidadZonalCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<EjeSalud> ejeSaludCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<MedidaMasAlta> medidaMasAltaCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<ActividadesEInstrumentos> actividadesEInstrumentosCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<InformacionInfraccion> informacionInfraccionCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<Representante> representanteCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<EjeEducativo> ejeEducativoCollection;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<InformacionJudicial> informacionJudicialCollection;

    public AdolescenteInfractor() {
    }

    public AdolescenteInfractor(Integer idAdolescentePk) {
        this.idAdolescentePk = idAdolescentePk;
    }

    public Integer getIdAdolescentePk() {
        return idAdolescentePk;
    }

    public void setIdAdolescentePk(Integer idAdolescentePk) {
        this.idAdolescentePk = idAdolescentePk;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getTipoDiscapacidad() {
        return tipoDiscapacidad;
    }

    public void setTipoDiscapacidad(String tipoDiscapacidad) {
        this.tipoDiscapacidad = tipoDiscapacidad;
    }

    public Integer getPorcentajeDiscapaci() {
        return porcentajeDiscapaci;
    }

    public void setPorcentajeDiscapaci(Integer porcentajeDiscapaci) {
        this.porcentajeDiscapaci = porcentajeDiscapaci;
    }

    public Boolean getRegistroSocial() {
        return registroSocial;
    }

    public void setRegistroSocial(Boolean registroSocial) {
        this.registroSocial = registroSocial;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getConQuienVive() {
        return conQuienVive;
    }

    public void setConQuienVive(String conQuienVive) {
        this.conQuienVive = conQuienVive;
    }

    public Boolean getEnfermedadesCr() {
        return enfermedadesCr;
    }

    public void setEnfermedadesCr(Boolean enfermedadesCr) {
        this.enfermedadesCr = enfermedadesCr;
    }

    @XmlTransient
    public List<IdentificacionGeograficaAdolescente> getIdentificacionGeograficaAdolescenteCollection() {
        return identificacionGeograficaAdolescenteCollection;
    }

    public void setIdentificacionGeograficaAdolescenteCollection(List<IdentificacionGeograficaAdolescente> identificacionGeograficaAdolescenteCollection) {
        this.identificacionGeograficaAdolescenteCollection = identificacionGeograficaAdolescenteCollection;
    }

    @XmlTransient
    public List<EstadoCumplimientoMedida> getEstadoCumplimientoMedidaCollection() {
        return estadoCumplimientoMedidaCollection;
    }

    public void setEstadoCumplimientoMedidaCollection(List<EstadoCumplimientoMedida> estadoCumplimientoMedidaCollection) {
        this.estadoCumplimientoMedidaCollection = estadoCumplimientoMedidaCollection;
    }

    @XmlTransient
    public List<MedidaSocioeducativa> getMedidaSocioeducativaCollection() {
        return medidaSocioeducativaCollection;
    }

    public void setMedidaSocioeducativaCollection(List<MedidaSocioeducativa> medidaSocioeducativaCollection) {
        this.medidaSocioeducativaCollection = medidaSocioeducativaCollection;
    }

    @XmlTransient
    public List<EjeLaboral> getEjeLaboralCollection() {
        return ejeLaboralCollection;
    }

    public void setEjeLaboralCollection(List<EjeLaboral> ejeLaboralCollection) {
        this.ejeLaboralCollection = ejeLaboralCollection;
    }

    @XmlTransient
    public List<UnidadZonal> getUnidadZonalCollection() {
        return unidadZonalCollection;
    }

    public void setUnidadZonalCollection(List<UnidadZonal> unidadZonalCollection) {
        this.unidadZonalCollection = unidadZonalCollection;
    }

    @XmlTransient
    public List<EjeSalud> getEjeSaludCollection() {
        return ejeSaludCollection;
    }

    public void setEjeSaludCollection(List<EjeSalud> ejeSaludCollection) {
        this.ejeSaludCollection = ejeSaludCollection;
    }

    @XmlTransient
    public List<MedidaMasAlta> getMedidaMasAltaCollection() {
        return medidaMasAltaCollection;
    }

    public void setMedidaMasAltaCollection(List<MedidaMasAlta> medidaMasAltaCollection) {
        this.medidaMasAltaCollection = medidaMasAltaCollection;
    }

    @XmlTransient
    public List<ActividadesEInstrumentos> getActividadesEInstrumentosCollection() {
        return actividadesEInstrumentosCollection;
    }

    public void setActividadesEInstrumentosCollection(List<ActividadesEInstrumentos> actividadesEInstrumentosCollection) {
        this.actividadesEInstrumentosCollection = actividadesEInstrumentosCollection;
    }

    @XmlTransient
    public List<InformacionInfraccion> getInformacionInfraccionCollection() {
        return informacionInfraccionCollection;
    }

    public void setInformacionInfraccionCollection(List<InformacionInfraccion> informacionInfraccionCollection) {
        this.informacionInfraccionCollection = informacionInfraccionCollection;
    }

    @XmlTransient
    public List<Representante> getRepresentanteCollection() {
        return representanteCollection;
    }

    public void setRepresentanteCollection(List<Representante> representanteCollection) {
        this.representanteCollection = representanteCollection;
    }

    @XmlTransient
    public List<EjeEducativo> getEjeEducativoCollection() {
        return ejeEducativoCollection;
    }

    public void setEjeEducativoCollection(List<EjeEducativo> ejeEducativoCollection) {
        this.ejeEducativoCollection = ejeEducativoCollection;
    }

    @XmlTransient
    public List<InformacionJudicial> getInformacionJudicialCollection() {
        return informacionJudicialCollection;
    }

    public void setInformacionJudicialCollection(List<InformacionJudicial> informacionJudicialCollection) {
        this.informacionJudicialCollection = informacionJudicialCollection;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.AdolescenteInfractor[ idAdolescentePk=" + idAdolescentePk + " ]";
    }
    
}
