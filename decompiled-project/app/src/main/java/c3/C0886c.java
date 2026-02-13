package c3;

import A0.AbstractC0017g;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import y3.AbstractC2383f;
import y3.p;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14269b;

    public /* synthetic */ C0886c(Object obj, int i7) {
        this.f14268a = i7;
        this.f14269b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d10) {
        switch (this.f14268a) {
            case 0:
                ((C0888e) this.f14269b).invalidateSelf();
                return;
            default:
                kotlin.jvm.internal.l.e(d10, "d");
                AbstractC0017g.k((p) this.f14269b);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Db.g, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d10, Runnable what, long j) {
        switch (this.f14268a) {
            case 0:
                ((C0888e) this.f14269b).scheduleSelf(what, j);
                return;
            default:
                kotlin.jvm.internal.l.e(d10, "d");
                kotlin.jvm.internal.l.e(what, "what");
                ((Handler) AbstractC2383f.f26803b.getValue()).postAtTime(what, j);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Db.g, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d10, Runnable what) {
        switch (this.f14268a) {
            case 0:
                ((C0888e) this.f14269b).unscheduleSelf(what);
                return;
            default:
                kotlin.jvm.internal.l.e(d10, "d");
                kotlin.jvm.internal.l.e(what, "what");
                ((Handler) AbstractC2383f.f26803b.getValue()).removeCallbacks(what);
                return;
        }
    }
}
