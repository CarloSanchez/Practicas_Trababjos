package modelo.entidad;
// Generated 11/05/2015 09:44:32 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Asistente generated by hbm2java
 */
public class Asistente  implements java.io.Serializable {


     private String idAsistente;
     private String nombres;
     private String apellidos;
     private String dni;
     private String genero;
     private String telefono;
     private Date FNacimiento;

    public Asistente() {
    }

	
    public Asistente(String idAsistente) {
        this.idAsistente = idAsistente;
    }
    public Asistente(String idAsistente, String nombres, String apellidos, String dni, String genero, String telefono, Date FNacimiento) {
       this.idAsistente = idAsistente;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.dni = dni;
       this.genero = genero;
       this.telefono = telefono;
       this.FNacimiento = FNacimiento;
    }
   
    public String getIdAsistente() {
        return this.idAsistente;
    }
    
    public void setIdAsistente(String idAsistente) {
        this.idAsistente = idAsistente;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFNacimiento() {
        return this.FNacimiento;
    }
    
    public void setFNacimiento(Date FNacimiento) {
        this.FNacimiento = FNacimiento;
    }




}

