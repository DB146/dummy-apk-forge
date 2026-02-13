package sa;

import android.widget.TextView;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class a extends ImageCardView {
    @Override // A9.AbstractC0118o, android.view.View
    public void setSelected(boolean z8) {
        TextView textView = (TextView) findViewById(R.id.title_text);
        textView.setBackground(null);
        textView.setSelected(z8);
        setBackground(null);
        setInfoAreaBackground(null);
        super.setSelected(z8);
    }
}
