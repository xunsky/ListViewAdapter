package xunsky.base.auto_adapterview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by junx on 2018/8/17.
 */

public class AutoFitListView extends ListView {
    public AutoFitListView(Context context) {
        super(context);
    }

    public AutoFitListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoFitListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
