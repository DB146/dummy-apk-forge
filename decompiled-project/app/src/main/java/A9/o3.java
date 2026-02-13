package A9;

import android.transition.Scene;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public View f1334a;

    /* renamed from: b, reason: collision with root package name */
    public Transition f1335b;

    /* renamed from: c, reason: collision with root package name */
    public Transition f1336c;

    /* renamed from: d, reason: collision with root package name */
    public Scene f1337d;

    /* renamed from: e, reason: collision with root package name */
    public Scene f1338e;

    public o3(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            throw new IllegalArgumentException("Views may not be null");
        }
        this.f1334a = view;
        this.f1335b = E6.b.u(viewGroup.getContext(), R.transition.lb_title_out);
        this.f1336c = E6.b.u(viewGroup.getContext(), R.transition.lb_title_in);
        this.f1337d = E6.b.g(viewGroup, new n3(this, 0));
        this.f1338e = E6.b.g(viewGroup, new n3(this, 1));
    }
}
