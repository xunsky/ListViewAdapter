package xunsky.base.listview_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junx on 2017/11/13.
 */

public abstract class LvBaseAdapter<T> extends BaseAdapter {
    public Context mContext;
    public List<T> mDatas;
    LayoutInflater mLayoutInflater;
    public LvBaseAdapter(Context context, List<T> datas) {
        mContext = context;
        mDatas = datas;
        mLayoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDatas!=null?mDatas.size():0;
    }
    @Override
    public T getItem(int position) {
        return mDatas!=null?mDatas.get(position):null;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);

    //datas相关
    public void setDatas(List<T> datas){
        mDatas=datas;
        notifyDataSetChanged();
    }
    public void clearDatas(){
        mDatas=null;
        notifyDataSetChanged();
    }
    public void appendDatas(List<T> datas){
        if (mDatas==null)mDatas=new ArrayList<>();
        mDatas.addAll(datas);
        notifyDataSetChanged();
    }
    public void appendDatas(T data){
        if (mDatas==null)mDatas=new ArrayList<>();
        mDatas.add(data);
        notifyDataSetChanged();
    }
}
