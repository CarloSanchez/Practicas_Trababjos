package modelo.dao.impl;

import java.util.ArrayList;
import java.util.List;
import modelo.dao.EventoDao;
import modelo.entidad.Evento;
import modelo.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class EventoDaoImpl implements EventoDao {

    @Override
    public List<Evento> listarEvento() 
    {
        List<Evento> lista = null;
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            lista = new ArrayList<Evento>();
            Query query = session.createQuery("FROM Evento");
            lista = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            session.close();
        }
        return lista;
    }
    
}
