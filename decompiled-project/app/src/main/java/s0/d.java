package s0;

import B0.C0214z;
import android.view.KeyEvent;
import c0.l;

/* loaded from: classes.dex */
public final class d extends l implements c {

    /* renamed from: C, reason: collision with root package name */
    public C0214z f24021C;

    @Override // s0.c
    public final boolean C(KeyEvent keyEvent) {
        C0214z c0214z = this.f24021C;
        if (c0214z != null) {
            return ((Boolean) c0214z.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // s0.c
    public final boolean d(KeyEvent keyEvent) {
        return false;
    }
}
