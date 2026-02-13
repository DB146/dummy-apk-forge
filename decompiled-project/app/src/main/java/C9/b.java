package C9;

import A0.C0016f0;
import A9.C0099j0;
import A9.C0115n0;
import A9.RunnableC0102k;
import A9.T;
import A9.Z1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import m4.AbstractC1556J;
import m4.C1549C;
import n5.D;
import t8.C2034c;
import y9.s;

/* loaded from: classes2.dex */
public final class b extends h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3060b;

    /* renamed from: c, reason: collision with root package name */
    public final C1549C f3061c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3062d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3063e;

    /* renamed from: f, reason: collision with root package name */
    public s f3064f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3065u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3066v;

    static {
        AbstractC1556J.a("goog.exo.leanback");
    }

    public b(Context context, C1549C c1549c) {
        this.f3060b = context;
        this.f3061c = c1549c;
        int i7 = D.f21141a;
        Looper myLooper = Looper.myLooper();
        this.f3062d = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f3063e = new a(this);
    }

    public final long K() {
        C1549C c1549c = this.f3061c;
        if (c1549c.d0() == 1) {
            return -1L;
        }
        return c1549c.W();
    }

    public final boolean L() {
        return this.f3061c.d0() != 1 && (this.f3064f == null || this.f3065u);
    }

    public final void M(C2034c c2034c) {
        boolean L = L();
        if (this.f3066v != L) {
            this.f3066v = L;
            c cVar = (c) c2034c.f24513b;
            Z1 z12 = cVar.f3073e;
            if (z12 != null) {
                b bVar = cVar.f3072d;
                long j = -1;
                if (bVar.L()) {
                    long b02 = bVar.f3061c.b0();
                    if (b02 != -9223372036854775807L) {
                        j = b02;
                    }
                }
                z12.d(j);
            }
            ArrayList arrayList = cVar.f3071c == null ? null : new ArrayList(cVar.f3071c);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0099j0 c0099j0 = (C0099j0) arrayList.get(i7);
                    switch (c0099j0.f1236a) {
                        case 0:
                            if (cVar.f3072d.L()) {
                                C0016f0 c0016f0 = (C0016f0) c0099j0.f1237b;
                                ((C0115n0) c0016f0.f219d).f1296f.postDelayed(new RunnableC0102k(c0016f0, 1), 1000L);
                                break;
                            } else {
                                break;
                            }
                        default:
                            if (cVar.f3072d.L()) {
                                c cVar2 = (c) c0099j0.f1237b;
                                ArrayList arrayList2 = cVar2.f3071c;
                                if (arrayList2 != null) {
                                    arrayList2.remove(c0099j0);
                                }
                                cVar2.b();
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
    }

    public final void N() {
        int d02 = this.f3061c.d0();
        C2034c c2034c = (C2034c) this.f3094a;
        M(c2034c);
        c2034c.g();
        c cVar = (c) c2034c.f24513b;
        cVar.getClass();
        T t5 = cVar.f3077w;
        if (t5 != null) {
            ((s) t5.f964a).f27531b.getClass();
        }
        if (d02 == 4) {
            ArrayList arrayList = cVar.f3071c == null ? null : new ArrayList(cVar.f3071c);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((C0099j0) arrayList.get(i7)).getClass();
                }
            }
        }
    }

    public final void O() {
        this.f3061c.m0(this.f3063e);
        s sVar = this.f3064f;
        if (sVar != null) {
            sVar.c(null);
            this.f3064f = null;
        }
        this.f3065u = false;
        C2034c c2034c = (C2034c) this.f3094a;
        c cVar = (c) c2034c.f24513b;
        cVar.getClass();
        T t5 = cVar.f3077w;
        if (t5 != null) {
            ((s) t5.f964a).f27531b.getClass();
        }
        c2034c.g();
        M(c2034c);
    }

    public final void P() {
        C1549C c1549c = this.f3061c;
        if (c1549c.o(1)) {
            c1549c.getClass();
            c1549c.q0(false);
            ((C2034c) this.f3094a).g();
        }
    }

    public final void Q() {
        C1549C c1549c = this.f3061c;
        if (c1549c.d0() == 1) {
            c1549c.k0();
        } else if (c1549c.d0() == 4) {
            c1549c.y(c1549c.U(), -9223372036854775807L, false);
        }
        if (c1549c.o(1)) {
            c1549c.getClass();
            c1549c.q0(true);
            ((C2034c) this.f3094a).g();
        }
    }

    public final void R(boolean z8) {
        Handler handler = this.f3062d;
        handler.removeCallbacks(this);
        if (z8) {
            handler.post(this);
        }
    }

    public final void S(Surface surface) {
        this.f3065u = surface != null;
        C1549C c1549c = this.f3061c;
        c1549c.E0();
        c1549c.n0();
        c1549c.v0(surface);
        int i7 = surface != null ? -1 : 0;
        c1549c.j0(i7, i7);
        M((C2034c) this.f3094a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2034c c2034c = (C2034c) this.f3094a;
        ((c) c2034c.f24513b).a();
        c2034c.d();
        this.f3062d.postDelayed(this, 5);
    }

    @Override // C9.h
    public final boolean s() {
        C1549C c1549c = this.f3061c;
        int d02 = c1549c.d0();
        return (d02 == 1 || d02 == 4 || !c1549c.c0()) ? false : true;
    }
}
