package Aa;

import A9.C0152w2;
import A9.R2;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class r extends C0152w2 {

    /* renamed from: o, reason: collision with root package name */
    public final TextView f1534o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f1535p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f1536q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f1537r;

    public r(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.time);
        kotlin.jvm.internal.l.d(findViewById, "findViewById(...)");
        this.f1534o = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        kotlin.jvm.internal.l.d(findViewById2, "findViewById(...)");
        this.f1535p = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.description);
        kotlin.jvm.internal.l.d(findViewById3, "findViewById(...)");
        this.f1536q = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.is_live_text);
        kotlin.jvm.internal.l.d(findViewById4, "findViewById(...)");
        this.f1537r = (TextView) findViewById4;
        view.setOnFocusChangeListener(new R2(view, 1));
        view.setOnClickListener(new q(view, 0));
    }
}
