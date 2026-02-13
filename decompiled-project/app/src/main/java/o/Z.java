package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class Z {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C1723a0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
