package j0;

import android.graphics.RectF;

/* loaded from: classes.dex */
public final class v extends AbstractC1362A {

    /* renamed from: e, reason: collision with root package name */
    public final C1368f f18559e;

    public v(C1368f c1368f) {
        this.f18559e = c1368f;
    }

    @Override // j0.AbstractC1362A
    public final i0.c p() {
        C1368f c1368f = this.f18559e;
        if (c1368f.f18540b == null) {
            c1368f.f18540b = new RectF();
        }
        RectF rectF = c1368f.f18540b;
        kotlin.jvm.internal.l.b(rectF);
        c1368f.f18539a.computeBounds(rectF, true);
        return new i0.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
