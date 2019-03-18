package listview.base.xunsky.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by junx on 2017/11/13.
 */

public class CommonAdapterDEMO extends CommonAdapter<String, CommonAdapterDEMO.Holder > {
    public CommonAdapterDEMO(Context context, List datas) {
        super(context, datas);
    }

    @Override
    public View createConvertView(LayoutInflater layoutInflater, int position, ViewGroup parent, int itemViewType) {
        View layout = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return layout;
    }

    @Override
    public Holder createViewHolder(View convertView, String data, int position) {
        return new Holder(convertView);
    }

    @Override
    protected void bindDatas(Holder holder, String data, int position) {
        holder.tv.setText(data);
    }

    class Holder {
        TextView tv;
        public Holder(View view) {
            tv= (TextView) view.findViewById(android.R.id.text1);
        }
    }
}
