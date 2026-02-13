package l5;

import H2.i0;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class v extends i0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f19543u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f19544v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f19545w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B f19546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(B b2, View view) {
        super(view);
        this.f19546x = b2;
        if (n5.D.f21141a < 26) {
            view.setFocusable(true);
        }
        this.f19543u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f19544v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f19545w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new Aa.q(this, 9));
    }
}
