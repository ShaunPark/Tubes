package com.shpark.ppw.tubes.database.vo;

import java.io.Serializable;

/**
 * Created by coolage73 on 16. 4. 19..
 */
public class LineVo implements Serializable {

    private int id;
    private String name;
    private String location;

    public LineVo(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
