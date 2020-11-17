package openhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQliteDataBase extends SQLiteOpenHelper {

    public SQliteDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tb_guia = "CREATE TABLE tb_guia (" +
                "  id_tb_guia INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  id_tb_orden_compra INTEGER(11) NOT NULL," +
                "  v_cod_guia TEXT(50) NOT NULL," +
                "  v_doc_material TEXT(45) NOT NULL," +
                "  v_anio TEXT(4) NOT NULL," +
                "  i_estado_guia INTEGER(11) NOT NULL," +
                "  v_motivo_anulacion TEXT(250) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_cod_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  CONSTRAINT fk_id_tb_orden_compra FOREIGN KEY (id_tb_orden_compra) REFERENCES tb_orden_compra (id_tb_orden_compra) ON DELETE NO ACTION ON UPDATE NO ACTION" +
                ");";
        db.execSQL(tb_guia);

        String tb_guia_detalle = "CREATE TABLE tb_guia_detalle (" +
                "  id_tb_guia_detalle INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  id_tb_guia INTEGER(11) NOT NULL," +
                "  id_tb_orden_compra_detalle INTEGER(11) NOT NULL," +
                "  id_tb_almacen INTEGER(11) NOT NULL," +
                "  id_tb_material INTEGER(11) NOT NULL," +
                "  v_cod_material TEXT(30) NOT NULL," +
                "  d_cantidad REAL(12,4) NOT NULL," +
                "  v_lote TEXT(50) NOT NULL," +
                "  dt_fecha_vencimiento TEXT NOT NULL," +
                "  b_lote NUMERIC(1) NOT NULL," +
                "  b_dia_vencimiento NUMERIC(1) NOT NULL," +
                "  v_unidad_medida TEXT(10) NOT NULL," +
                "  v_cod_barras TEXT(100) NOT NULL," +
                "  i_estado INTEGER(11) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_cod_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  CONSTRAINT fk_id_tb_almacen FOREIGN KEY (id_tb_almacen) REFERENCES tb_sociedad_centro_almacen (id_tb_sociedad_centro_almacen) ON DELETE NO ACTION ON UPDATE NO ACTION," +
                "  CONSTRAINT fk_id_tb_orden_compra_detalle FOREIGN KEY (id_tb_orden_compra_detalle) REFERENCES tb_orden_compra_detalle (id_tb_orden_compra_detalle) ON DELETE NO ACTION ON UPDATE NO ACTION," +
                "  CONSTRAINT fk_id_tb_guia FOREIGN KEY (id_tb_guia) REFERENCES tb_guia (id_tb_guia) ON DELETE NO ACTION ON UPDATE NO ACTION" +
                ");";
        db.execSQL(tb_guia_detalle);

        String tb_material = "CREATE TABLE tb_material (" +
                "  id_tb_material INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  id_tb_almacen_material INTEGER(11) NOT NULL," +
                "  v_cod_material TEXT(10) NOT NULL," +
                "  v_descripcion TEXT(250) NOT NULL," +
                "  b_lote NUMERIC(1) NOT NULL," +
                "  b_dia_vencimiento NUMERIC(1) NOT NULL," +
                "  v_unidad_Medida TEXT(10) NOT NULL," +
                "  i_estado INTEGER(11) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_usuario_modificacion TEXT(50)," +
                "  CONSTRAINT fk_id_tb_almacen_material FOREIGN KEY (id_tb_almacen_material) REFERENCES tb_sociedad_centro_almacen (id_tb_sociedad_centro_almacen) ON DELETE NO ACTION ON UPDATE NO ACTION" +
                ");";
        db.execSQL(tb_material);

        String tb_material_codigo = "CREATE TABLE tb_material_codigo (" +
                "  id_tb_material_codigo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  id_tb_material INTEGER(11) NOT NULL," +
                "  v_cod_barras TEXT(50) NOT NULL," +
                "  v_cod_proveedor TEXT(10) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_cod_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  CONSTRAINT id_tb_material FOREIGN KEY (id_tb_material) REFERENCES tb_material (id_tb_material) ON DELETE NO ACTION ON UPDATE NO ACTION" +
                ");";
        db.execSQL(tb_material_codigo);

        String tb_orden_compra = "CREATE TABLE tb_orden_compra (" +
                "  id_tb_orden_compra INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  v_codigo_orden_compra TEXT(25) NOT NULL," +
                "  v_cod_centro TEXT(10) NOT NULL," +
                "  v_nombre_centro TEXT(150) NOT NULL," +
                "  v_grupo_compra TEXT(50) NOT NULL," +
                "  v_sociedad TEXT(50) NOT NULL," +
                "  v_cod_proveedor TEXT(50) NOT NULL," +
                "  v_ruc_proveedor TEXT(11) NOT NULL," +
                "  v_descripcion_proveedor TEXT(150) NOT NULL," +
                "  dt_fecha_registro TEXT NOT NULL," +
                "  v_cod_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  dt_fecha_pedido TEXT" +
                ");";
        db.execSQL(tb_orden_compra);

        String tb_orden_compra_detalle = "CREATE TABLE tb_orden_compra_detalle (" +
                "  id_tb_orden_compra_detalle INTEGER NOT NULL," +
                "  id_tb_orden_compra INTEGER(11) NOT NULL," +
                "  id_tb_sociedad_centro_almacen INTEGER(11) NOT NULL," +
                "  v_posicion TEXT(5) NOT NULL," +
                "  v_cod_material TEXT(30) NOT NULL," +
                "  v_descripcion TEXT(150) NOT NULL," +
                "  d_cantidad REAL(12,4) NOT NULL," +
                "  d_cantidad_pendiente REAL(12,4) NOT NULL," +
                "  b_lote NUMERIC(1) NOT NULL," +
                "  b_dia_vencimiento NUMERIC(1) NOT NULL," +
                "  v_unidad_medida TEXT(10) NOT NULL," +
                "  v_cod_barras TEXT(100) NOT NULL," +
                "  i_estado INTEGER(11) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_cod_usuario_registo TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  PRIMARY KEY (id_tb_orden_compra_detalle, id_tb_orden_compra, id_tb_sociedad_centro_almacen)," +
                "  CONSTRAINT fk_id_tb_sociedad_centro_almacen FOREIGN KEY (id_tb_sociedad_centro_almacen) REFERENCES tb_sociedad_centro_almacen (id_tb_sociedad_centro_almacen) ON DELETE NO ACTION ON UPDATE NO ACTION," +
                "  CONSTRAINT fk_tb_orden_compra_detalle_tb_orden_compra FOREIGN KEY (id_tb_orden_compra) REFERENCES tb_orden_compra (id_tb_orden_compra) ON DELETE NO ACTION ON UPDATE NO ACTION" +
                ");";
        db.execSQL(tb_orden_compra_detalle);

        String tb_sociedad_centro_almacen = "CREATE TABLE tb_sociedad_centro_almacen (" +
                "  id_tb_sociedad_centro_almacen INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "  v_cod_sociedad TEXT(12) NOT NULL," +
                "  v_descripcion_sociedad TEXT(250) NOT NULL," +
                "  v_cod_centro TEXT(12) NOT NULL," +
                "  v_descripcion_centro TEXT(255) NOT NULL," +
                "  v_cod_almacen TEXT(12) NOT NULL," +
                "  v_descripcion_almacen TEXT(250) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_usuario_modificacion TEXT(50)" +
                ")";
        db.execSQL(tb_sociedad_centro_almacen);

        String tb_usuario = "CREATE TABLE tb_usuario (" +
                "  id_tb_usuario INTEGER(11) NOT NULL," +
                "  cod_login_name TEXT(50) NOT NULL," +
                "  cod_centro TEXT(50) NOT NULL," +
                "  dt_fecha_registro TEXT," +
                "  v_cod_usuario_registro TEXT(50)," +
                "  dt_fecha_modificacion TEXT," +
                "  v_cod_usuario_modificacion TEXT(50)," +
                "  PRIMARY KEY (id_tb_usuario)" +
                ");";
        db.execSQL(tb_usuario);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void abrir(){
        this.getWritableDatabase();
    }

    public void cerrar(){
        this.close();
    }
}
