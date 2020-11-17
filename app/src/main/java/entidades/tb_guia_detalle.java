package entidades;

public class tb_guia_detalle {

    private int id_tb_guia_detalle, id_tb_guia, id_tb_orden_compra_detalle, id_tb_almacen, id_tb_material, b_lote, b_dia_vencimiento, i_estado;
    private String v_cod_material, v_lote, dt_fecha_vencimiento, v_unidad_medida,
            v_cod_barras, dt_fecha_registro, v_cod_usuario_registro, dt_fecha_modificacion, v_cod_usuario_modificacion;
    private double d_cantidad;

    public tb_guia_detalle() {

    }

    public tb_guia_detalle(int id_tb_guia_detalle, int id_tb_guia, int id_tb_orden_compra_detalle, int id_tb_almacen, int id_tb_material, int b_lote, int b_dia_vencimiento, int i_estado, String v_cod_material, String v_lote, String dt_fecha_vencimiento, String v_unidad_medida, String v_cod_barras, String dt_fecha_registro, String v_cod_usuario_registro, String dt_fecha_modificacion, String v_cod_usuario_modificacion, double d_cantidad) {
        this.id_tb_guia_detalle = id_tb_guia_detalle;
        this.id_tb_guia = id_tb_guia;
        this.id_tb_orden_compra_detalle = id_tb_orden_compra_detalle;
        this.id_tb_almacen = id_tb_almacen;
        this.id_tb_material = id_tb_material;
        this.b_lote = b_lote;
        this.b_dia_vencimiento = b_dia_vencimiento;
        this.i_estado = i_estado;
        this.v_cod_material = v_cod_material;
        this.v_lote = v_lote;
        this.dt_fecha_vencimiento = dt_fecha_vencimiento;
        this.v_unidad_medida = v_unidad_medida;
        this.v_cod_barras = v_cod_barras;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registro = v_cod_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
        this.d_cantidad = d_cantidad;
    }

    public int getId_tb_guia_detalle() {
        return id_tb_guia_detalle;
    }

    public void setId_tb_guia_detalle(int id_tb_guia_detalle) {
        this.id_tb_guia_detalle = id_tb_guia_detalle;
    }

    public int getId_tb_guia() {
        return id_tb_guia;
    }

    public void setId_tb_guia(int id_tb_guia) {
        this.id_tb_guia = id_tb_guia;
    }

    public int getId_tb_orden_compra_detalle() {
        return id_tb_orden_compra_detalle;
    }

    public void setId_tb_orden_compra_detalle(int id_tb_orden_compra_detalle) {
        this.id_tb_orden_compra_detalle = id_tb_orden_compra_detalle;
    }

    public int getId_tb_almacen() {
        return id_tb_almacen;
    }

    public void setId_tb_almacen(int id_tb_almacen) {
        this.id_tb_almacen = id_tb_almacen;
    }

    public int getId_tb_material() {
        return id_tb_material;
    }

    public void setId_tb_material(int id_tb_material) {
        this.id_tb_material = id_tb_material;
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

    public String getV_lote() {
        return v_lote;
    }

    public void setV_lote(String v_lote) {
        this.v_lote = v_lote;
    }

    public String getDt_fecha_vencimiento() {
        return dt_fecha_vencimiento;
    }

    public void setDt_fecha_vencimiento(String dt_fecha_vencimiento) {
        this.dt_fecha_vencimiento = dt_fecha_vencimiento;
    }

    public String getV_unidad_medida() {
        return v_unidad_medida;
    }

    public void setV_unidad_medida(String v_unidad_medida) {
        this.v_unidad_medida = v_unidad_medida;
    }

    public String getV_cod_barras() {
        return v_cod_barras;
    }

    public void setV_cod_barras(String v_cod_barras) {
        this.v_cod_barras = v_cod_barras;
    }

    public String getDt_fecha_registro() {
        return dt_fecha_registro;
    }

    public void setDt_fecha_registro(String dt_fecha_registro) {
        this.dt_fecha_registro = dt_fecha_registro;
    }

    public String getV_cod_usuario_registro() {
        return v_cod_usuario_registro;
    }

    public void setV_cod_usuario_registro(String v_cod_usuario_registro) {
        this.v_cod_usuario_registro = v_cod_usuario_registro;
    }

    public String getDt_fecha_modificacion() {
        return dt_fecha_modificacion;
    }

    public void setDt_fecha_modificacion(String dt_fecha_modificacion) {
        this.dt_fecha_modificacion = dt_fecha_modificacion;
    }

    public String getV_cod_usuario_modificacion() {
        return v_cod_usuario_modificacion;
    }

    public void setV_cod_usuario_modificacion(String v_cod_usuario_modificacion) {
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
    }

    public double getD_cantidad() {
        return d_cantidad;
    }

    public void setD_cantidad(double d_cantidad) {
        this.d_cantidad = d_cantidad;
    }
}
