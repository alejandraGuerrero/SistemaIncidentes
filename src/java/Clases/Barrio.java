package Clases;


public class Barrio {

    private int codigo_barrio;
    private String nombre_barrio;
    private String string_est_codigo;
    private int comuna;
 

    public Barrio() {
        codigo_barrio = 0;
        nombre_barrio = "";
        string_est_codigo = "";
    }

    public Barrio(int codigo_barrio) {
        this.codigo_barrio = codigo_barrio;
    }
    
    public Barrio(int codigo_barrio, String nombre_barrio, String string_est_codigo, int comuna) {
        this.codigo_barrio = codigo_barrio;
        this.nombre_barrio = nombre_barrio;
        this.string_est_codigo = string_est_codigo;
        this.comuna = comuna;
    }

    public int getCodigo_barrio() {
        return codigo_barrio;
    }

    public void setCodigo_barrio(int codigo_barrio) {
        this.codigo_barrio = codigo_barrio;
    }

    public String getNombre_barrio() {
        return nombre_barrio;
    }

    public void setNombre_barrio(String nombre_barrio) {
        this.nombre_barrio = nombre_barrio;
    }

    
    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public String getString_est_codigo() {
        return string_est_codigo;
    }

    public void setString_est_codigo(String string_est_codigo) {
        this.string_est_codigo = string_est_codigo;
    }
    
    
  
}
