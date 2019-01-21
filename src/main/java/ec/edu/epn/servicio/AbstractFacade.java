/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.servicio;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Javier
 */
public abstract class AbstractFacade<T> {

    private Class<T> entidadClase;

    public AbstractFacade(Class<T> entidadClass) {
        this.entidadClase = entidadClass;
    }

    protected abstract EntityManager getEntityManager();

    public T crear(T entidad) {
        getEntityManager().persist(entidad);
        return entidad;
    }

    public T editar(T entidad) {
        getEntityManager().merge(entidad);
        return entidad;
    }

    public void eliminar(T entidad) {
        getEntityManager().remove(getEntityManager().merge(entidad));
    }

    public T buscarPorId(Object id) {
        return getEntityManager().find(entidadClase, id);
    }

    public List<T> listarTodo() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entidadClase));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
}
