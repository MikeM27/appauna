package entidades;

public class tb_guia {

    private int id_tb_guia, d_tb_orden_compra;
    private String v_cod_guia, v_doc_material, v_anio, i_estado_guia, v_motivo_anulacion, dt_fecha_registro,
            v_cod_usuario_registro, dt_fecha_modificacion, v_cod_usuario_modificacion;

    public tb_guia(int id_tb_guia, int d_tb_orden_compra, String v_cod_guia, String v_doc_material,
                   String v_anio, String i_estado_guia, String v_motivo_anulacion, String dt_fecha_registro,
                   String v_cod_usuario_registro, String dt_fecha_modificacion, String v_cod_usuario_modificacion) {
        this.id_tb_guia = id_tb_guia;
        this.d_tb_orden_compra = d_tb_orden_compra;
        this.v_cod_guia = v_cod_guia;
        this.v_doc_material = v_doc_material;
        this.v_anio = v_anio;
        this.i_estado_guia = i_estado_guia;
        this.v_motivo_anulacion = v_motivo_anulacion;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registro = v_cod_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
    }

    public int getId_tb_guia() {
        return id_tb_guia;
    }

    public void setId_tb_guia(int id_tb_guia) {
        this.id_tb_guia = id_tb_guia;
    }

    public int getD_tb_orden_compra() {
        return d_tb_orden_compra;
    }

    public void setD_tb_orden_compra(int d_tb_orden_compra) {
        this.d_tb_orden_compra = d_tb_orden_compra;
    }

    public String getV_cod_guia() {
        return v_cod_guia;
    }

    public void setV_cod_guia(String v_cod_guia) {
        this.v_cod_guia = v_cod_guia;
    }

    public String getV_doc_material() {
        return v_doc_material;
    }

    public void setV_doc_material(String v_doc_material) {
        this.v_doc_material = v_doc_material;
    }

    public String getV_anio() {
        return v_anio;
    }

    public void setV_anio(String v_anio) {
        this.v_anio = v_anio;
    }

    public String getI_estado_guia() {
        return i_estado_guia;
    }

    public void setI_estado_guia(String i_estado_guia) {
        this.i_estado_guia = i_estado_guia;
    }

    public String getV_motivo_anulacion() {
        return v_motivo_anulacion;
    }

    public void setV_motivo_anulacion(String v_motivo_anulacion) {
        this.v_motivo_anulacion = v_motivo_anulacion;
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
}
