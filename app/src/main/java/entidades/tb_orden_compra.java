package entidades;

public class tb_orden_compra {

    private int id_tb_orden_compra;
    private String v_codigo_orden_compra, v_cod_centro, v_nombre_centro, v_grupo_compra, v_sociedad, v_cod_proveedor, v_ruc_proveedor,
            v_descripcion_proveedor, dt_fecha_registro, v_cod_usuario_registro, dt_fecha_modificacion, v_cod_usuario_modificacion, dt_fecha_pedido;


    public tb_orden_compra() {

    }

    public tb_orden_compra(int id_tb_orden_compra, String v_codigo_orden_compra, String v_cod_centro,
                           String v_nombre_centro, String v_grupo_compra, String v_sociedad,
                           String v_cod_proveedor, String v_ruc_proveedor, String v_descripcion_proveedor,
                           String dt_fecha_registro, String v_cod_usuario_registro, String dt_fecha_modificacion,
                           String v_cod_usuario_modificacion, String dt_fecha_pedido) {
        this.id_tb_orden_compra = id_tb_orden_compra;
        this.v_codigo_orden_compra = v_codigo_orden_compra;
        this.v_cod_centro = v_cod_centro;
        this.v_nombre_centro = v_nombre_centro;
        this.v_grupo_compra = v_grupo_compra;
        this.v_sociedad = v_sociedad;
        this.v_cod_proveedor = v_cod_proveedor;
        this.v_ruc_proveedor = v_ruc_proveedor;
        this.v_descripcion_proveedor = v_descripcion_proveedor;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registro = v_cod_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
        this.dt_fecha_pedido = dt_fecha_pedido;
    }

    public int getId_tb_orden_compra() {
        return id_tb_orden_compra;
    }

    public void setId_tb_orden_compra(int id_tb_orden_compra) {
        this.id_tb_orden_compra = id_tb_orden_compra;
    }

    public String getV_codigo_orden_compra() {
        return v_codigo_orden_compra;
    }

    public void setV_codigo_orden_compra(String v_codigo_orden_compra) {
        this.v_codigo_orden_compra = v_codigo_orden_compra;
    }

    public String getV_cod_centro() {
        return v_cod_centro;
    }

    public void setV_cod_centro(String v_cod_centro) {
        this.v_cod_centro = v_cod_centro;
    }

    public String getV_nombre_centro() {
        return v_nombre_centro;
    }

    public void setV_nombre_centro(String v_nombre_centro) {
        this.v_nombre_centro = v_nombre_centro;
    }

    public String getV_grupo_compra() {
        return v_grupo_compra;
    }

    public void setV_grupo_compra(String v_grupo_compra) {
        this.v_grupo_compra = v_grupo_compra;
    }

    public String getV_sociedad() {
        return v_sociedad;
    }

    public void setV_sociedad(String v_sociedad) {
        this.v_sociedad = v_sociedad;
    }

    public String getV_cod_proveedor() {
        return v_cod_proveedor;
    }

    public void setV_cod_proveedor(String v_cod_proveedor) {
        this.v_cod_proveedor = v_cod_proveedor;
    }

    public String getV_ruc_proveedor() {
        return v_ruc_proveedor;
    }

    public void setV_ruc_proveedor(String v_ruc_proveedor) {
        this.v_ruc_proveedor = v_ruc_proveedor;
    }

    public String getV_descripcion_proveedor() {
        return v_descripcion_proveedor;
    }

    public void setV_descripcion_proveedor(String v_descripcion_proveedor) {
        this.v_descripcion_proveedor = v_descripcion_proveedor;
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

    public String getDt_fecha_pedido() {
        return dt_fecha_pedido;
    }

    public void setDt_fecha_pedido(String dt_fecha_pedido) {
        this.dt_fecha_pedido = dt_fecha_pedido;
    }
}
