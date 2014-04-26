package Clases;


public class Comuna {

    private int com_codigo;
    private String com_nombre;
   

    public Comuna() {
        com_codigo = 0;
        com_nombre = "";
    }

    public Comuna(int com_codigo, String com_nombre) {
        this.com_codigo = com_codigo;
        this.com_nombre = com_nombre;
    }

    public int getCom_codigo() {
        return com_codigo;
    }

    public void setCom_codigo(int com_codigo) {
        this.com_codigo = com_codigo;
    }

    public String getCom_nombre() {
        return com_nombre;
    }

    public void setCom_nombre(String com_nombre) {
        this.com_nombre = com_nombre;
    }


}
