package Y5;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzcn;

/* renamed from: Y5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0636n {

    /* renamed from: d, reason: collision with root package name */
    public static volatile zzcn f11842d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0661y0 f11843a;

    /* renamed from: b, reason: collision with root package name */
    public final E5.k f11844b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f11845c;

    public AbstractC0636n(InterfaceC0661y0 interfaceC0661y0) {
        com.google.android.gms.common.internal.G.g(interfaceC0661y0);
        this.f11843a = interfaceC0661y0;
        this.f11844b = new E5.k(this, interfaceC0661y0);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            InterfaceC0661y0 interfaceC0661y0 = this.f11843a;
            ((M5.b) interfaceC0661y0.e()).getClass();
            this.f11845c = System.currentTimeMillis();
            if (d().postDelayed(this.f11844b, j)) {
                return;
            }
            interfaceC0661y0.b().f11577f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f11845c = 0L;
        d().removeCallbacks(this.f11844b);
    }

    public final Handler d() {
        zzcn zzcnVar;
        if (f11842d != null) {
            return f11842d;
        }
        synchronized (AbstractC0636n.class) {
            try {
                if (f11842d == null) {
                    f11842d = new zzcn(this.f11843a.d().getMainLooper());
                }
                zzcnVar = f11842d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcnVar;
    }
}
