
package com.windar.otropaquete;

public class Personal {

    private String telefono;
    private String correo;

    public Personal() {

    }

    public Personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;

    }

    public void darValorTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String devolverValortelefono() {
        return telefono;

    }

    public void darValorCorreo(String Correo) {
        this.correo = correo;
    }

    public String devolverValorCorreo() {
        return correo;

    }

    @Override
    public String toString() {

        return "\n telefono = " + telefono + "\n Correo = " + correo;

    

   
        
    }

}
