package entidades;

public class tb_material {

    private int id_tb_material, id_tb_almacen_material, b_lote, b_dia_vencimiento, i_estado;
    private String v_cod_material, v_descripcion, v_unidad_Medida, dt_fecha_registro, v_usuario_registro, dt_fecha_modificacion, v_usuario_modificacion;

    public tb_material() {

    }

    public tb_material(int id_tb_material, int id_tb_almacen_material, int b_lote, int b_dia_vencimiento,
                       int i_estado, String v_cod_material, String v_descripcion, String v_unidad_Medida,
                       String dt_fecha_registro, String v_usuario_registro, String dt_fecha_modificacion,
                       String v_usuario_modificacion) {
        this.id_tb_material = id_tb_material;
        this.id_tb_almacen_material = id_tb_almacen_material;
        this.b_lote = b_lote;
        this.b_dia_vencimiento = b_dia_vencimiento;
        this.i_estado = i_estado;
        this.v_cod_material = v_cod_material;
        this.v_descripcion = v_descripcion;
        this.v_unidad_Medida = v_unidad_Medida;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_usuario_registro = v_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_usuario_modificacion = v_usuario_modificacion;
    }

    public int getId_tb_material() {
        return id_tb_material;
    }

    public void setId_tb_material(int id_tb_material) {
        this.id_tb_material = id_tb_material;
    }

    public int getId_tb_almacen_material() {
        return id_tb_almacen_material;
    }

    public void setId_tb_almacen_material(int id_tb_almacen_material) {
        this.id_tb_almacen_material = id_tb_almacen_material;
    }

    public int getB_lote() {
        return b_lote;
    }

    public void setB_lote(int b_lote) {
        this.b_lote = b_lote;
    }

    public int getB_dia_vencimiento() {
        return b_dia_vencimiento;
    }

    public void setB_dia_vencimiento(int b_dia_vencimiento) {
        this.b_dia_vencimiento = b_dia_vencimiento;
    }

    public int getI_estado() {
        return i_estado;
    }

    public void setI_estado(int i_estado) {
        this.i_estado = i_estado;
    }

    public String getV_cod_material() {
        return v_cod_material;
    }

    public void setV_cod_material(String v_cod_material) {
        this.v_cod_material = v_cod_material;
    }

    public String getV_descripcion() {
        return v_descripcion;
    }

    public void setV_descripcion(String v_descripcion) {
        this.v_descripcion = v_descripcion;
    }

    public String getV_unidad_Medida() {
        return v_unidad_Medida;
    }

    public void setV_unidad_Medida(String v_unidad_Medida) {
        this.v_unidad_Medida = v_unidad_Medida;
    }

    public String getDt_fecha_registro() {
        return dt_fecha_registro;
    }

    public void setDt_fecha_registro(String dt_fecha_registro) {
        this.dt_fecha_registro = dt_fecha_registro;
    }

    public String getV_usuario_registro() {
        return v_usuario_registro;
    }

    public void setV_usuario_registro(String v_usuario_registro) {
        this.v_usuario_registro = v_usuario_registro;
    }

    public String getDt_fecha_modificacion() {
        return dt_fecha_modificacion;
    }

    public void setDt_fecha_modificacion(String dt_fecha_modificacion) {
        this.dt_fecha_modificacion = dt_fecha_modificacion;
    }

    public String getV_usuario_modificacion() {
        return v_usuario_modificacion;
    }

    public void setV_usuario_modificacion(String v_usuario_modificacion) {
        this.v_usuario_modificacion = v_usuario_modificacion;
    }
}
