package l5;

import H2.i0;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class x extends i0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f19550u;

    /* renamed from: v, reason: collision with root package name */
    public final View f19551v;

    public x(View view) {
        super(view);
        if (n5.D.f21141a < 26) {
            view.setFocusable(true);
        }
        this.f19550u = (TextView) view.findViewById(R.id.exo_text);
        this.f19551v = view.findViewById(R.id.exo_check);
    }
}
