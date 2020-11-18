package com.example.appauna.modals;

public class tb_usuario {

    private int id_tb_usuario;
    private String cod_login_name, cod_centro, dt_fecha_registro, v_cod_usuario_registro, dt_fecha_modificacion, v_cod_usuario_modificacion;

    public tb_usuario(){

    }

    public tb_usuario(int id_tb_usuario, String cod_login_name, String cod_centro, String dt_fecha_registro,
                      String v_cod_usuario_registro, String dt_fecha_modificacion, String v_cod_usuario_modificacion) {
        this.id_tb_usuario = id_tb_usuario;
        this.cod_login_name = cod_login_name;
        this.cod_centro = cod_centro;
        this.dt_fecha_registro = dt_fecha_registro;
        this.v_cod_usuario_registro = v_cod_usuario_registro;
        this.dt_fecha_modificacion = dt_fecha_modificacion;
        this.v_cod_usuario_modificacion = v_cod_usuario_modificacion;
    }

    public int getId_tb_usuario() {
        return id_tb_usuario;
    }

    public void setId_tb_usuario(int id_tb_usuario) {
        this.id_tb_usuario = id_tb_usuario;
    }

    public String getCod_login_name() {
        return cod_login_name;
    }

    public void setCod_login_name(String cod_login_name) {
        this.cod_login_name = cod_login_name;
    }

    public String getCod_centro() {
        return cod_centro;
    }

    public void setCod_centro(String cod_centro) {
        this.cod_centro = cod_centro;
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
