package listview.base.xunsky.listviewadapter.HolderAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import listview.base.xunsky.listviewadapter.CommonAdapter;


/**
 * Created by junx on 2017/11/13.
 */

public abstract class HolderAdapter<T> extends CommonAdapter<T,CommonViewHolder> {
    int mLayoutResId;
    public HolderAdapter(Context context, List<T> datas, int LayoutResId) {
        this(context, datas);
        this.mLayoutResId=LayoutResId;
    }
    private HolderAdapter(Context context, List<T> datas) {
        super(context, datas);
    }

    @Override
    public View createConvertView(LayoutInflater layoutInflater, int position, ViewGroup parent, int itemViewType) {

        return layoutInflater.inflate(mLayoutResId, parent, false);
    }

    @Override
    public CommonViewHolder createViewHolder(View convertView, T data, int position) {
        return new CommonViewHolder(convertView);
    }

    @Override
    protected abstract void bindDatas(CommonViewHolder holder, T data, int position);
}
