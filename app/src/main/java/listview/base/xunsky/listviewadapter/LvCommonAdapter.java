package listview.base.xunsky.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by junx on 2017/11/13.
 */

public abstract class LvCommonAdapter<T,H> extends LvBaseAdapter<T> {

    public LvCommonAdapter(Context context, List<T> datas) {
        super(context, datas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        T data=null;
        try{
            data = mDatas.get(position);
        }catch (Exception ex){
        }
        H holder=null;
        if (convertView==null){
            convertView=createConvertView(mLayoutInflater,position,parent,getItemViewType(position));
            holder=createViewHolder(convertView,data,position);
            convertView.setTag(holder);
        }else{
            holder= (H) convertView.getTag();
        }
        bindDatas(holder,data,position);
        return convertView;
    }

    public abstract View createConvertView(LayoutInflater layoutInflater, int position, ViewGroup parent, int itemViewType);
    public abstract H createViewHolder(View convertView, T data, int position);
    protected abstract void bindDatas(H holder, T data, int position);
}
