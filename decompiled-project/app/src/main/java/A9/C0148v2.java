package A9;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: A9.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0148v2 extends C0109l2 {

    /* renamed from: b, reason: collision with root package name */
    public final C0152w2 f1439b;

    public C0148v2(C0136s2 c0136s2, C0152w2 c0152w2) {
        super(c0136s2);
        c0136s2.addView(c0152w2.f1271a);
        C0140t2 c0140t2 = c0152w2.f1459c;
        if (c0140t2 != null) {
            View view = c0140t2.f1271a;
            ViewGroup viewGroup = c0136s2.f1366a;
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view, 0);
            }
        }
        this.f1439b = c0152w2;
        c0152w2.f1458b = this;
    }
}
