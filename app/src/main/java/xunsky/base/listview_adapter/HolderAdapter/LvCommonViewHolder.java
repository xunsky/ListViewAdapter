package xunsky.base.listview_adapter.HolderAdapter;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/**
 * Created by junx on 2017/11/13.
 */

public class LvCommonViewHolder {
    private View convertView;
    private SparseArray<View> views;

    public LvCommonViewHolder(View convertView) {
        this.convertView = convertView;
        views=new SparseArray<>();
    }
    protected  <T extends View> T findView(int id){
    T t = (T) convertView.findViewById(id);
        if (t==null){
            throw new RuntimeException("找不到该id所表示的view");
        }
        return t;
    }
    //使用SparseArray<View>对已经fvbi的view进行了复用,不用担心
    public <T extends View> T getView(int id){
        View v =views.get(id);
        if (v==null){
            v=findView(id);
            views.put(id,v);
        }
        return (T) v;
    }
    //TextView
    public TextView setText(int resId,CharSequence string){
        TextView tv = getView(resId);
        tv.setText(string);
        return tv;
    }
    public TextView setText(int resId){
        TextView tv = getView(resId);
        return tv;
    }
    public View getRootView(){
        return convertView;
    }
}
