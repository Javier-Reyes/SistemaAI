/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.servicio;

import ec.edu.epn.entidad.AdolescenteInfractor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Javier
 */
@Stateless
@Path("ec.edu.epn.entidad.adolescenteinfractor")
public class AdolescenteInfractorFacadeREST extends AbstractFacade<AdolescenteInfractor> {

    @PersistenceContext(unitName = "ec.edu.epnSAIPU")
    private EntityManager em;

    public AdolescenteInfractorFacadeREST() {
        super(AdolescenteInfractor.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public AdolescenteInfractor crear(AdolescenteInfractor entidad) {
        return super.crear(entidad);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public AdolescenteInfractor editar(@PathParam("id") Integer id, AdolescenteInfractor entidad) {
        return super.editar(entidad);
    }

    @DELETE
    @Path("{id}")
    public void eliminar(@PathParam("id") Integer id) {
        super.eliminar(super.buscarPorId(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public AdolescenteInfractor buscarPorId(@PathParam("id") Integer id) {
        return super.buscarPorId(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<AdolescenteInfractor> listarTodo() {
        return super.listarTodo();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
