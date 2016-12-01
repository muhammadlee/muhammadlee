package cn.edu.yangbiao8169nwsuaf.myapplication;

import android.graphics.drawable.shapes.RectShape;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */
public class box extends RectShape {
    public static final int INT = 10;
//***************************
//helllo
//*************************


    @Override
    public boolean hasAlpha() {
        return super.hasAlpha();
    }

    List<String> mList = new ArrayList<>();
    int i=0;
    int j=1;



    public int getI() {
        return  INT;
    }

    public void setI(int i) {
        this.i = i;
    }

    public List<String> getList() {
        return mList;
    }

    public void setList(List<String> list) {
        mList = list;
    }

}
