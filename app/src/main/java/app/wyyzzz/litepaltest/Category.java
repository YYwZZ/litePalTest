package app.wyyzzz.litepaltest;

import org.litepal.crud.DataSupport;

/**
 * Created by wuyuanyang on 2017/10/11.
 */

public class Category extends DataSupport {

    private int id;

    private String categoryName;

    private int categoryCode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }
}
