/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.servicio;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Javier
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ec.edu.epn.servicio.ActividadesEInstrumentosFacadeREST.class);
        resources.add(ec.edu.epn.servicio.AdolescenteInfractorFacadeREST.class);
        resources.add(ec.edu.epn.servicio.EjeEducativoFacadeREST.class);
        resources.add(ec.edu.epn.servicio.EjeLaboralFacadeREST.class);
        resources.add(ec.edu.epn.servicio.EjeSaludFacadeREST.class);
        resources.add(ec.edu.epn.servicio.EstadoCumplimientoMedidaFacadeREST.class);
        resources.add(ec.edu.epn.servicio.IdentificacionGeograficaAdolescenteFacadeREST.class);
        resources.add(ec.edu.epn.servicio.InformacionInfraccionFacadeREST.class);
        resources.add(ec.edu.epn.servicio.InformacionJudicialFacadeREST.class);
        resources.add(ec.edu.epn.servicio.MedidaMasAltaFacadeREST.class);
        resources.add(ec.edu.epn.servicio.MedidaSocioeducativaFacadeREST.class);
        resources.add(ec.edu.epn.servicio.RepresentanteFacadeREST.class);
        resources.add(ec.edu.epn.servicio.UnidadZonalFacadeREST.class);
    }
    
}
