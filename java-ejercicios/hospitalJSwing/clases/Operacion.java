package clases;

import java.time.LocalDate;

public class Operacion {
    
    private String cod_operacion;
    private String descripcion;
    private LocalDate fecha;
    private String tipo;
    private String dni;
    private String cod_quirofano;

    public Operacion() {
    }

    public Operacion(String cod_operacion, String descripcion, LocalDate fecha, String tipo, String dni, String cod_quirofano) {
        this.cod_operacion = cod_operacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.dni = dni;
        this.cod_quirofano = cod_quirofano;
    }

    public String getCod_operacion() {
        return cod_operacion;
    }

    public void setCod_operacion(String cod_operacion) {
        this.cod_operacion = cod_operacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCod_quirofano() {
        return cod_quirofano;
    }

    public void setCod_quirofano(String cod_quirofano) {
        this.cod_quirofano = cod_quirofano;
    }
    
    
}
