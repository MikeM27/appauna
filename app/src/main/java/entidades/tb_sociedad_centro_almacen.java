package entidades;

public class tb_sociedad_centro_almacen {

    private int id_tb_sociedad_centro_almacen;
    private String v_cod_sociedad, v_descripcion_sociedad, v_cod_centro, v_descripcion_centro, v_cod_almacen, v_descripcion_almacen,
            dt_fecha_registro, v_usuario_registro, dt_fecha_modificacion, v_usuario_modificacion;

    public tb_sociedad_centro_almacen() {

    }

    public tb_sociedad_centro_almacen(int id_tb_sociedad_centro_almacen, String v_cod_sociedad,
                                      String v_descripcion_sociedad, String v_cod_centro,
                                      String v_descripcion_centro, String v_cod_almacen,
                                      String v_descripcion_almacen, String dt_fecha_registro,
                                      String v_usuario_registro, String dt_fecha_modificacion,
                                      String v_usuario_modificacion) {
        this.id_tb_sociedad_centro_almacen = id_tb_sociedad_centro_almacen;
        this.v_cod_sociedad = v_cod_sociedad;
        this.v_descripcion_sociedad = v_descripcion_sociedad;
        this.v_cod_centro = v_cod_centro;
        this.v_descripcion_centro = v_descripcion_centro;
        this.v_cod_almacen = v_cod_almacen;
        this.v_descripcion_almacen = v_descripcion_almacen;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_usuario_registro = v_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_usuario_modificacion = v_usuario_modificacion;
    }

    public int getId_tb_sociedad_centro_almacen() {
        return id_tb_sociedad_centro_almacen;
    }

    public void setId_tb_sociedad_centro_almacen(int id_tb_sociedad_centro_almacen) {
        this.id_tb_sociedad_centro_almacen = id_tb_sociedad_centro_almacen;
    }

    public String getV_cod_sociedad() {
        return v_cod_sociedad;
    }

    public void setV_cod_sociedad(String v_cod_sociedad) {
        this.v_cod_sociedad = v_cod_sociedad;
    }

    public String getV_descripcion_sociedad() {
        return v_descripcion_sociedad;
    }

    public void setV_descripcion_sociedad(String v_descripcion_sociedad) {
        this.v_descripcion_sociedad = v_descripcion_sociedad;
    }

    public String getV_cod_centro() {
        return v_cod_centro;
    }

    public void setV_cod_centro(String v_cod_centro) {
        this.v_cod_centro = v_cod_centro;
    }

    public String getV_descripcion_centro() {
        return v_descripcion_centro;
    }

    public void setV_descripcion_centro(String v_descripcion_centro) {
        this.v_descripcion_centro = v_descripcion_centro;
    }

    public String getV_cod_almacen() {
        return v_cod_almacen;
    }

    public void setV_cod_almacen(String v_cod_almacen) {
        this.v_cod_almacen = v_cod_almacen;
    }

    public String getV_descripcion_almacen() {
        return v_descripcion_almacen;
    }

    public void setV_descripcion_almacen(String v_descripcion_almacen) {
        this.v_descripcion_almacen = v_descripcion_almacen;
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
