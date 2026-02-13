package sa;

import android.content.Context;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.media.xemtv.beta.R;
import m.C1521c;

/* loaded from: classes2.dex */
public final class d extends ImageCardView {
    public d(Context context) {
        super(new C1521c(context, R.style.ImageCardViewStyleTitle), null);
    }

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
