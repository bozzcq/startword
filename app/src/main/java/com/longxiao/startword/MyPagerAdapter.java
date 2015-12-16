package com.longxiao.startword;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2015/12/15.
 */
public class MyPagerAdapter extends PagerAdapter {
    private List<View> viewList;
    public  MyPagerAdapter(List<View>viewList){
        this.viewList = viewList;
    }
    // 页卡的数量
    @Override
    public int getCount(){
        return this.viewList.size();
    }

    // 当前view对象是否来自这个对象
    @Override
    public boolean isViewFromObject(View arg0, Object arg1){
        return arg0 == arg1;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
       // super.destroyItem(container, position, object);
        container.removeView(viewList.get(position));
    }

}
