package com.example.appauna.modals;

public class tb_orden_compra_detalle {

    private int id_tb_orden_compra_detalle, id_tb_orden_compra, id_tb_sociedad_centro_almacen, b_lote, b_dia_vencimiento, i_estado;
    private String v_posicion, v_cod_material, v_descripcion, v_unidad_medida, v_cod_barras, dt_fecha_registro, v_cod_usuario_registo,
            dt_fecha_modificacion, v_cod_usuario_modificacion;
    private double d_cantidad, d_cantidad_pendiente;


    public tb_orden_compra_detalle(){

    }

    public tb_orden_compra_detalle(int id_tb_orden_compra_detalle, int id_tb_orden_compra,
                                   int id_tb_sociedad_centro_almacen, int b_lote, int b_dia_vencimiento,
                                   int i_estado, String v_posicion, String v_cod_material, String v_descripcion,
                                   String v_unidad_medida, String v_cod_barras, String dt_fecha_registro,
                                   String v_cod_usuario_registo, String dt_fecha_modificacion,
                                   String v_cod_usuario_modificacion, double d_cantidad, double d_cantidad_pendiente) {
        this.id_tb_orden_compra_detalle = id_tb_orden_compra_detalle;
        this.id_tb_orden_compra = id_tb_orden_compra;
        this.id_tb_sociedad_centro_almacen = id_tb_sociedad_centro_almacen;
        this.b_lote = b_lote;
        this.b_dia_vencimiento = b_dia_vencimiento;
        this.i_estado = i_estado;
        this.v_posicion = v_posicion;
        this.v_cod_material = v_cod_material;
        this.v_descripcion = v_descripcion;
        this.v_unidad_medida = v_unidad_medida;
        this.v_cod_barras = v_cod_barras;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registo = v_cod_usuario_registo;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
        this.d_cantidad = d_cantidad;
        this.d_cantidad_pendiente = d_cantidad_pendiente;
    }

    public int getId_tb_orden_compra_detalle() {
        return id_tb_orden_compra_detalle;
    }

    public void setId_tb_orden_compra_detalle(int id_tb_orden_compra_detalle) {
        this.id_tb_orden_compra_detalle = id_tb_orden_compra_detalle;
    }

    public int getId_tb_orden_compra() {
        return id_tb_orden_compra;
    }

    public void setId_tb_orden_compra(int id_tb_orden_compra) {
        this.id_tb_orden_compra = id_tb_orden_compra;
    }

    public int getId_tb_sociedad_centro_almacen() {
        return id_tb_sociedad_centro_almacen;
    }

    public void setId_tb_sociedad_centro_almacen(int id_tb_sociedad_centro_almacen) {
        this.id_tb_sociedad_centro_almacen = id_tb_sociedad_centro_almacen;
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

    public String getV_posicion() {
        return v_posicion;
    }

    public void setV_posicion(String v_posicion) {
        this.v_posicion = v_posicion;
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

    public String getV_cod_usuario_registo() {
        return v_cod_usuario_registo;
    }

    public void setV_cod_usuario_registo(String v_cod_usuario_registo) {
        this.v_cod_usuario_registo = v_cod_usuario_registo;
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

    public double getD_cantidad_pendiente() {
        return d_cantidad_pendiente;
    }

    public void setD_cantidad_pendiente(double d_cantidad_pendiente) {
        this.d_cantidad_pendiente = d_cantidad_pendiente;
    }
}
