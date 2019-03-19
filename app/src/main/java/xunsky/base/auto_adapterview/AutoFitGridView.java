package xunsky.base.auto_adapterview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by junx on 2018/8/17.
 */

public class AutoFitGridView extends GridView {

    public AutoFitGridView(Context context) {
        super(context);
    }

    public AutoFitGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoFitGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec=MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>4,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
