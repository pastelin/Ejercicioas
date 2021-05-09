package mx.com.sgah.dominio;

/**
 *
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class MovimientoDTO {

    // Define variables 
    private int idMovimiento;
    private float monto;
    private String fecha;
    private String descripcion;
    private String tipoMovimiento;
    private String asignacion;

    /**
     * Contructor vacio
     */
    public MovimientoDTO() {

    }
    
    /**
     * Contructor que recibe un parametro para inicializar las variables de 
     * instancia, usado para eliminar y llenar un objeto a mostrar para actualizar
     * 
     * @param idMovimiento
     */
    public MovimientoDTO(int idMovimiento) {

        this.idMovimiento = idMovimiento;
        
    }

    /**
     * Contstructor que recibe 5 parametros para inicializar las varibles de
     * instancia, usado para insertar en BD
     *
     * @param monto
     * @param fecha
     * @param descripcion
     * @param tipoMovimiento
     * @param asignacion
     */
    public MovimientoDTO(float monto, String fecha, String descripcion, 
            String tipoMovimiento, String asignacion) {

        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipoMovimiento = tipoMovimiento;
        this.asignacion = asignacion;

    }

    /**
     * Contstructor que recibe todos los parametros para inicializar las varibles de
     * instancia, usado para actualizar en BD
     *
     * @param idMovimiento
     * @param monto
     * @param fecha
     * @param descripcion
     * @param tipoMovimiento
     * @param asignacion
     */
    public MovimientoDTO(int idMovimiento, float monto, String fecha, 
            String descripcion, String tipoMovimiento, String asignacion) {

        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipoMovimiento = tipoMovimiento;
        this.asignacion = asignacion;

    }

    public int getIdMovimiento() {
        return this.idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
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
        return this.tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    
    public String getAsignacion() {
        return this.asignacion;
    }
    
    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    @Override
    public String toString() {

        return "Ahorro{ " + "id_movimiento = " + this.idMovimiento + " monto = "
                + this.monto + " fecha = " + this.fecha + " descripcion = "
                + this.descripcion + " tipo_movimiento = " + this.tipoMovimiento +
                " asignacion = " + this.asignacion +  " }";

    }

}
