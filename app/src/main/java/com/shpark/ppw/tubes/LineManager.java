package com.shpark.ppw.tubes;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.shpark.ppw.tubes.database.openHelper.LineDBOpenHelper;
import com.shpark.ppw.tubes.database.vo.LineVo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coolage73 on 16. 4. 19..
 */
public class LineManager {

    private static final String dbName = "Line.db";

    private SQLiteDatabase db;
    private Context context;
    private LineDBOpenHelper opener;
    private int dbVersion = 1;


    public LineManager(Context context) {
        this.context = context;
        this.opener = new LineDBOpenHelper(context, dbName, null, dbVersion);
        db = opener.getWritableDatabase();
    }

    public List getLines() {
        String sql = "select id, line_name, location from SWLines;";

        Cursor results = db.rawQuery(sql, null);

        results.moveToFirst();
        ArrayList<LineVo> lines = new ArrayList<LineVo>();

        while (!results.isAfterLast()) {
            LineVo info = new LineVo(results.getInt(0), results.getString(1), results.getString(2));
            lines.add(info);
            results.moveToNext();
        }
        results.close();
        return lines;
    }
}
