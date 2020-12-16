package mx.com.sgah.dominio;

/**
 *
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class MovimientoDTO {

    // Define variables 
    private int id_movimiento;
    private float monto;
    private String fecha;
    private String descripcion;
    private String tipo_movimiento;

    /**
     * Contructos vacio
     */
    public MovimientoDTO() {

    }

    /**
     * Contstructor que recibe 4 parametros para inicializar las varibles de
     * instancia
     *
     * @param monto
     * @param fecha
     * @param descripcion
     * @param tipo_movimiento
     */
    public MovimientoDTO(float monto, String fecha, String descripcion, String tipo_movimiento) {

        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo_movimiento = tipo_movimiento;

    }

    /**
     * Contstructor que recibe 4 parametros para inicializar las varibles de
     * instancia
     *
     * @param id_movimiento
     * @param monto
     * @param fecha
     * @param descripcion
     * @param tipo_movimiento
     */
    public MovimientoDTO(int id_movimiento, float monto, String fecha, String descripcion, String tipo_movimiento) {

        this.id_movimiento = id_movimiento;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo_movimiento = tipo_movimiento;

    }

    public int getIdMovimiento() {
        return this.id_movimiento;
    }

    public void setIdMovimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public float getMonto() {
        return this.monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMovimiento() {
        return this.tipo_movimiento;
    }

    public void setTipoMovimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    @Override
    public String toString() {

        return "Ahorro{ " + "id_movimiento = " + this.id_movimiento + " monto = "
                + this.monto + " fecha = " + this.fecha + " descripcion = "
                + this.descripcion + " tipo_movimiento = " + this.tipo_movimiento + " }";

    }

}
