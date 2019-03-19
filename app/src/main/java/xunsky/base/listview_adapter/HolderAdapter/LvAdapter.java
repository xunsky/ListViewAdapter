package xunsky.base.listview_adapter.HolderAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import xunsky.base.listview_adapter.LvCommonAdapter;


/**
 * Created by junx on 2017/11/13.
 */

public abstract class LvAdapter<T> extends LvCommonAdapter<T, LvCommonViewHolder> {
    int mLayoutResId;
    public LvAdapter(Context context, List<T> datas, int LayoutResId) {
        this(context, datas);
        this.mLayoutResId=LayoutResId;
    }
    private LvAdapter(Context context, List<T> datas) {
        super(context, datas);
    }

    @Override
    public View createConvertView(LayoutInflater layoutInflater, int position, ViewGroup parent, int itemViewType) {

        return layoutInflater.inflate(mLayoutResId, parent, false);
    }

    @Override
    public LvCommonViewHolder createViewHolder(View convertView, T data, int position) {
        return new LvCommonViewHolder(convertView);
    }

    @Override
    protected abstract void bindDatas(LvCommonViewHolder holder, T data, int position);
}
