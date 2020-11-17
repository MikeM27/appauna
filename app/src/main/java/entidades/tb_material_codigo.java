package entidades;

public class tb_material_codigo {

    private int id_tb_material_codigo, id_tb_material;
    private String v_cod_barras, v_cod_proveedor, dt_fecha_registro,
            v_cod_usuario_registro, dt_fecha_modificacion, v_cod_usuario_modificacion;

    public tb_material_codigo() {

    }

    public tb_material_codigo(int id_tb_material_codigo, int id_tb_material, String v_cod_barras,
                              String v_cod_proveedor, String dt_fecha_registro, String v_cod_usuario_registro,
                              String dt_fecha_modificacion, String v_cod_usuario_modificacion) {
        this.id_tb_material_codigo = id_tb_material_codigo;
        this.id_tb_material = id_tb_material;
        this.v_cod_barras = v_cod_barras;
        this.v_cod_proveedor = v_cod_proveedor;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registro = v_cod_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
    }

    public int getId_tb_material_codigo() {
        return id_tb_material_codigo;
    }

    public void setId_tb_material_codigo(int id_tb_material_codigo) {
        this.id_tb_material_codigo = id_tb_material_codigo;
    }

    public int getId_tb_material() {
        return id_tb_material;
    }

    public void setId_tb_material(int id_tb_material) {
        this.id_tb_material = id_tb_material;
    }

    public String getV_cod_barras() {
        return v_cod_barras;
    }

    public void setV_cod_barras(String v_cod_barras) {
        this.v_cod_barras = v_cod_barras;
    }

    public String getV_cod_proveedor() {
        return v_cod_proveedor;
    }

    public void setV_cod_proveedor(String v_cod_proveedor) {
        this.v_cod_proveedor = v_cod_proveedor;
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
