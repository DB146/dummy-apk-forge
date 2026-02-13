package c2;

import android.os.Handler;
import e3.RunnableC1077b;
import i2.C1326n;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14168a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f14169b;

    public o(p pVar) {
        this.f14169b = new WeakReference(pVar);
        pVar.f10277U.postDelayed(this, 200L);
    }

    public o(C1326n c1326n) {
        this.f14169b = new WeakReference(c1326n);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14168a) {
            case 0:
                p pVar = (p) this.f14169b.get();
                if (pVar != null) {
                    pVar.C0.h(pVar.f14184P0);
                    return;
                }
                return;
            default:
                C1326n c1326n = (C1326n) this.f14169b.get();
                if (c1326n == null) {
                    return;
                }
                new Handler().post(new RunnableC1077b(c1326n, 2));
                return;
        }
    }
}
