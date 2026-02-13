package A9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0071c0 extends AbstractC0113m2 {

    /* renamed from: e, reason: collision with root package name */
    public static int f1085e;

    /* renamed from: f, reason: collision with root package name */
    public static int f1086f;

    /* renamed from: b, reason: collision with root package name */
    public T f1087b;

    /* renamed from: c, reason: collision with root package name */
    public d3 f1088c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1089d = true;

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        C0067b0 c0067b0 = (C0067b0) c0109l2;
        C0093h2 c0093h2 = (C0093h2) obj;
        C0098j c0098j = c0067b0.f1058b;
        C0098j c0098j2 = c0093h2.f1219a;
        if (c0098j != c0098j2) {
            c0067b0.f1058b = c0098j2;
            if (c0098j2 != null) {
                c0098j2.f851a.registerObserver(c0067b0.f1063h);
            }
        }
        AbstractC0113m2 abstractC0113m2 = c0093h2.f1220b;
        c0067b0.f1060d = abstractC0113m2;
        c0067b0.f1059c = c0093h2;
        c0067b0.d(abstractC0113m2);
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        return new C0067b0(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_control_bar, viewGroup, false));
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        C0067b0 c0067b0 = (C0067b0) c0109l2;
        C0098j c0098j = c0067b0.f1058b;
        if (c0098j != null) {
            c0098j.f851a.unregisterObserver(c0067b0.f1063h);
            c0067b0.f1058b = null;
        }
        c0067b0.f1059c = null;
    }
}
