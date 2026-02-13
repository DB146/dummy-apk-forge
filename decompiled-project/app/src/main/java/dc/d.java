package dc;

import B0.C0170c0;
import E5.k;
import Hb.i;
import android.os.Handler;
import android.os.Looper;
import cc.A;
import cc.A0;
import cc.C0944m;
import cc.F;
import cc.I0;
import cc.K;
import cc.P;
import cc.S;
import h3.H;
import hc.AbstractC1273a;
import hc.o;
import java.util.concurrent.CancellationException;
import kc.C1441d;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d extends A implements K {
    private volatile d _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f16628c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16629d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16630e;

    /* renamed from: f, reason: collision with root package name */
    public final d f16631f;

    public d(Handler handler) {
        this(handler, null, false);
    }

    public d(Handler handler, String str, boolean z8) {
        this.f16628c = handler;
        this.f16629d = str;
        this.f16630e = z8;
        this._immediate = z8 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f16631f = dVar;
    }

    @Override // cc.K
    public final S K(long j, final I0 i02, i iVar) {
        if (this.f16628c.postDelayed(i02, H.h(j, 4611686018427387903L))) {
            return new S() { // from class: dc.c
                @Override // cc.S
                public final void b() {
                    d.this.f16628c.removeCallbacks(i02);
                }
            };
        }
        X(iVar, i02);
        return A0.f14465a;
    }

    @Override // cc.A
    public final void T(i iVar, Runnable runnable) {
        if (this.f16628c.post(runnable)) {
            return;
        }
        X(iVar, runnable);
    }

    @Override // cc.A
    public final boolean V(i iVar) {
        return (this.f16630e && l.a(Looper.myLooper(), this.f16628c.getLooper())) ? false : true;
    }

    @Override // cc.A
    public A W(int i7) {
        AbstractC1273a.a(1);
        return this;
    }

    public final void X(i iVar, Runnable runnable) {
        F.h(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        P.f14500c.T(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f16628c == this.f16628c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16628c);
    }

    @Override // cc.K
    public final void l(long j, C0944m c0944m) {
        k kVar = new k(28, c0944m, this);
        if (this.f16628c.postDelayed(kVar, H.h(j, 4611686018427387903L))) {
            c0944m.u(new C0170c0(20, this, kVar));
        } else {
            X(c0944m.f14552e, kVar);
        }
    }

    @Override // cc.A
    public final String toString() {
        d dVar;
        String str;
        C1441d c1441d = P.f14498a;
        d dVar2 = o.f17967a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f16631f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f16629d;
        if (str2 == null) {
            str2 = this.f16628c.toString();
        }
        return this.f16630e ? X.c.h(str2, ".immediate") : str2;
    }
}
