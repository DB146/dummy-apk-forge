package i6;

import android.view.View;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f18443a;

    public f(h hVar) {
        this.f18443a = hVar;
    }

    @Override // i6.d
    public final void b(View view) {
    }

    @Override // i6.d
    public final void c(View view, int i7) {
        if (i7 == 5) {
            this.f18443a.cancel();
        }
    }
}
