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
@Table(name = "t_info_judicial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionJudicial.findAll", query = "SELECT i FROM InformacionJudicial i")
    , @NamedQuery(name = "InformacionJudicial.findByIdInfoJudicialPk", query = "SELECT i FROM InformacionJudicial i WHERE i.idInfoJudicialPk = :idInfoJudicialPk")
    , @NamedQuery(name = "InformacionJudicial.findByReincidencia", query = "SELECT i FROM InformacionJudicial i WHERE i.reincidencia = :reincidencia")
    , @NamedQuery(name = "InformacionJudicial.findByNombreFiscal", query = "SELECT i FROM InformacionJudicial i WHERE i.nombreFiscal = :nombreFiscal")
    , @NamedQuery(name = "InformacionJudicial.findByUnidadJudicial", query = "SELECT i FROM InformacionJudicial i WHERE i.unidadJudicial = :unidadJudicial")
    , @NamedQuery(name = "InformacionJudicial.findByNombreJuez", query = "SELECT i FROM InformacionJudicial i WHERE i.nombreJuez = :nombreJuez")
    , @NamedQuery(name = "InformacionJudicial.findByDefensor", query = "SELECT i FROM InformacionJudicial i WHERE i.defensor = :defensor")
    , @NamedQuery(name = "InformacionJudicial.findByNombreDefensor", query = "SELECT i FROM InformacionJudicial i WHERE i.nombreDefensor = :nombreDefensor")
    , @NamedQuery(name = "InformacionJudicial.findByNumeroCausa", query = "SELECT i FROM InformacionJudicial i WHERE i.numeroCausa = :numeroCausa")
    , @NamedQuery(name = "InformacionJudicial.findByFechaImposMed", query = "SELECT i FROM InformacionJudicial i WHERE i.fechaImposMed = :fechaImposMed")
    , @NamedQuery(name = "InformacionJudicial.findByFechaRepecZonReso", query = "SELECT i FROM InformacionJudicial i WHERE i.fechaRepecZonReso = :fechaRepecZonReso")
    , @NamedQuery(name = "InformacionJudicial.findByFechaIniCumpMed", query = "SELECT i FROM InformacionJudicial i WHERE i.fechaIniCumpMed = :fechaIniCumpMed")
    , @NamedQuery(name = "InformacionJudicial.findByFormaImposMed", query = "SELECT i FROM InformacionJudicial i WHERE i.formaImposMed = :formaImposMed")
    , @NamedQuery(name = "InformacionJudicial.findByTipoTermAntiMed", query = "SELECT i FROM InformacionJudicial i WHERE i.tipoTermAntiMed = :tipoTermAntiMed")
    , @NamedQuery(name = "InformacionJudicial.findByAmonestacionVerbal", query = "SELECT i FROM InformacionJudicial i WHERE i.amonestacionVerbal = :amonestacionVerbal")
    , @NamedQuery(name = "InformacionJudicial.findByImposReglasCond", query = "SELECT i FROM InformacionJudicial i WHERE i.imposReglasCond = :imposReglasCond")
    , @NamedQuery(name = "InformacionJudicial.findByOrientApoSocFami", query = "SELECT i FROM InformacionJudicial i WHERE i.orientApoSocFami = :orientApoSocFami")
    , @NamedQuery(name = "InformacionJudicial.findByServicioComunidad", query = "SELECT i FROM InformacionJudicial i WHERE i.servicioComunidad = :servicioComunidad")
    , @NamedQuery(name = "InformacionJudicial.findByLibertadAsistida", query = "SELECT i FROM InformacionJudicial i WHERE i.libertadAsistida = :libertadAsistida")
    , @NamedQuery(name = "InformacionJudicial.findByNumeroMedidas", query = "SELECT i FROM InformacionJudicial i WHERE i.numeroMedidas = :numeroMedidas")})
public class InformacionJudicial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_info_judicial_pk")
    private Integer idInfoJudicialPk;
    @Column(name = "reincidencia")
    private Boolean reincidencia;
    @Size(max = 40)
    @Column(name = "nombre_fiscal")
    private String nombreFiscal;
    @Size(max = 20)
    @Column(name = "unidad_judicial")
    private String unidadJudicial;
    @Size(max = 40)
    @Column(name = "nombre_juez")
    private String nombreJuez;
    @Size(max = 10)
    @Column(name = "defensor")
    private String defensor;
    @Size(max = 40)
    @Column(name = "nombre_defensor")
    private String nombreDefensor;
    @Size(max = 10)
    @Column(name = "numero_causa")
    private String numeroCausa;
    @Column(name = "fecha_impos_med")
    @Temporal(TemporalType.DATE)
    private Date fechaImposMed;
    @Column(name = "fecha_repec_zon_reso")
    @Temporal(TemporalType.DATE)
    private Date fechaRepecZonReso;
    @Column(name = "fecha_ini_cump_med")
    @Temporal(TemporalType.DATE)
    private Date fechaIniCumpMed;
    @Size(max = 40)
    @Column(name = "forma_impos_med")
    private String formaImposMed;
    @Size(max = 40)
    @Column(name = "tipo_term_anti_med")
    private String tipoTermAntiMed;
    @Column(name = "amonestacion_verbal")
    private Boolean amonestacionVerbal;
    @Column(name = "impos_reglas_cond")
    private Boolean imposReglasCond;
    @Column(name = "orient_apo_soc_fami")
    private Boolean orientApoSocFami;
    @Column(name = "servicio_comunidad")
    private Boolean servicioComunidad;
    @Column(name = "libertad_asistida")
    private Boolean libertadAsistida;
    @Column(name = "numero_medidas")
    private Integer numeroMedidas;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private AdolescenteInfractor idAdolescenteFk;

    public InformacionJudicial() {
    }

    public InformacionJudicial(Integer idInfoJudicialPk) {
        this.idInfoJudicialPk = idInfoJudicialPk;
    }

    public Integer getIdInfoJudicialPk() {
        return idInfoJudicialPk;
    }

    public void setIdInfoJudicialPk(Integer idInfoJudicialPk) {
        this.idInfoJudicialPk = idInfoJudicialPk;
    }

    public Boolean getReincidencia() {
        return reincidencia;
    }

    public void setReincidencia(Boolean reincidencia) {
        this.reincidencia = reincidencia;
    }

    public String getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public String getUnidadJudicial() {
        return unidadJudicial;
    }

    public void setUnidadJudicial(String unidadJudicial) {
        this.unidadJudicial = unidadJudicial;
    }

    public String getNombreJuez() {
        return nombreJuez;
    }

    public void setNombreJuez(String nombreJuez) {
        this.nombreJuez = nombreJuez;
    }

    public String getDefensor() {
        return defensor;
    }

    public void setDefensor(String defensor) {
        this.defensor = defensor;
    }

    public String getNombreDefensor() {
        return nombreDefensor;
    }

    public void setNombreDefensor(String nombreDefensor) {
        this.nombreDefensor = nombreDefensor;
    }

    public String getNumeroCausa() {
        return numeroCausa;
    }

    public void setNumeroCausa(String numeroCausa) {
        this.numeroCausa = numeroCausa;
    }

    public Date getFechaImposMed() {
        return fechaImposMed;
    }

    public void setFechaImposMed(Date fechaImposMed) {
        this.fechaImposMed = fechaImposMed;
    }

    public Date getFechaRepecZonReso() {
        return fechaRepecZonReso;
    }

    public void setFechaRepecZonReso(Date fechaRepecZonReso) {
        this.fechaRepecZonReso = fechaRepecZonReso;
    }

    public Date getFechaIniCumpMed() {
        return fechaIniCumpMed;
    }

    public void setFechaIniCumpMed(Date fechaIniCumpMed) {
        this.fechaIniCumpMed = fechaIniCumpMed;
    }

    public String getFormaImposMed() {
        return formaImposMed;
    }

    public void setFormaImposMed(String formaImposMed) {
        this.formaImposMed = formaImposMed;
    }

    public String getTipoTermAntiMed() {
        return tipoTermAntiMed;
    }

    public void setTipoTermAntiMed(String tipoTermAntiMed) {
        this.tipoTermAntiMed = tipoTermAntiMed;
    }

    public Boolean getAmonestacionVerbal() {
        return amonestacionVerbal;
    }

    public void setAmonestacionVerbal(Boolean amonestacionVerbal) {
        this.amonestacionVerbal = amonestacionVerbal;
    }

    public Boolean getImposReglasCond() {
        return imposReglasCond;
    }

    public void setImposReglasCond(Boolean imposReglasCond) {
        this.imposReglasCond = imposReglasCond;
    }

    public Boolean getOrientApoSocFami() {
        return orientApoSocFami;
    }

    public void setOrientApoSocFami(Boolean orientApoSocFami) {
        this.orientApoSocFami = orientApoSocFami;
    }

    public Boolean getServicioComunidad() {
        return servicioComunidad;
    }

    public void setServicioComunidad(Boolean servicioComunidad) {
        this.servicioComunidad = servicioComunidad;
    }

    public Boolean getLibertadAsistida() {
        return libertadAsistida;
    }

    public void setLibertadAsistida(Boolean libertadAsistida) {
        this.libertadAsistida = libertadAsistida;
    }

    public Integer getNumeroMedidas() {
        return numeroMedidas;
    }

    public void setNumeroMedidas(Integer numeroMedidas) {
        this.numeroMedidas = numeroMedidas;
    }

    public AdolescenteInfractor getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(AdolescenteInfractor idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.entidad.InformacionJudicial[ idInfoJudicialPk=" + idInfoJudicialPk + " ]";
    }
    
}
