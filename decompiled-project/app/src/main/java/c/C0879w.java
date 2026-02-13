package c;

import android.window.OnBackInvokedCallback;

/* renamed from: c.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0879w implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14076b;

    public /* synthetic */ C0879w(Object obj, int i7) {
        this.f14075a = i7;
        this.f14076b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f14075a) {
            case 0:
                ((C0878v) this.f14076b).invoke();
                return;
            case 1:
                ((i.v) this.f14076b).C();
                return;
            case 2:
                ((Runnable) this.f14076b).run();
                return;
            default:
                ((t6.b) this.f14076b).a();
                return;
        }
    }
}
