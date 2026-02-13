package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: c.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880x implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0877u f14077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0877u f14078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0878v f14079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0878v f14080d;

    public C0880x(C0877u c0877u, C0877u c0877u2, C0878v c0878v, C0878v c0878v2) {
        this.f14077a = c0877u;
        this.f14078b = c0877u2;
        this.f14079c = c0878v;
        this.f14080d = c0878v2;
    }

    public final void onBackCancelled() {
        this.f14080d.invoke();
    }

    public final void onBackInvoked() {
        this.f14079c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        this.f14078b.invoke(new C0857a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        this.f14077a.invoke(new C0857a(backEvent));
    }
}
