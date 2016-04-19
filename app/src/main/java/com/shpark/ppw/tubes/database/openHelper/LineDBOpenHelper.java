package com.shpark.ppw.tubes.database.openHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by coolage73 on 16. 4. 19..
 */
public class LineDBOpenHelper extends SQLiteOpenHelper {

    private static String createSql = "create table SWLines (" +
            " id integer primary key autoincrement, " +
            " line_name text, " +
            " location text )";
    public LineDBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createSql);

        String sql = "insert into SWLines values(NULL, '지하철 1호선', '서울');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
