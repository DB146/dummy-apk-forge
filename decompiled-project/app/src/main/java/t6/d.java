package t6;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c.C0857a;

/* loaded from: classes.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f24499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f24500b;

    public d(e eVar, b bVar) {
        this.f24500b = eVar;
        this.f24499a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f24500b.f24498a != null) {
            this.f24499a.d();
        }
    }

    public final void onBackInvoked() {
        this.f24499a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f24500b.f24498a != null) {
            this.f24499a.b(new C0857a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f24500b.f24498a != null) {
            this.f24499a.c(new C0857a(backEvent));
        }
    }
}
