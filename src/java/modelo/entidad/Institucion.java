package modelo.entidad;
// Generated 11/05/2015 09:44:32 PM by Hibernate Tools 4.3.1



/**
 * Institucion generated by hbm2java
 */
public class Institucion  implements java.io.Serializable {


     private String idInstitucion;
     private String institucion;

    public Institucion() {
    }

	
    public Institucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
    public Institucion(String idInstitucion, String institucion) {
       this.idInstitucion = idInstitucion;
       this.institucion = institucion;
    }
   
    public String getIdInstitucion() {
        return this.idInstitucion;
    }
    
    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
    public String getInstitucion() {
        return this.institucion;
    }
    
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }




}

