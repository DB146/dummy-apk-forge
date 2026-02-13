package W4;

import N6.y0;
import android.os.Handler;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class m implements Runnable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10725a = n5.D.m(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f10726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f10727c;

    public m(n nVar) {
        this.f10727c = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10726b = false;
        this.f10725a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f10727c;
        A4.s sVar = nVar.f10740u;
        sVar.F(sVar.n(4, nVar.f10744y, y0.f7368u, nVar.f10741v));
        this.f10725a.postDelayed(this, 30000L);
    }
}
