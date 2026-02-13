package F4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import m4.AbstractC1565e;
import m4.C1549C;
import m4.C1560b0;
import m4.C1562c0;
import m4.L;
import m4.SurfaceHolderCallbackC1596z;
import n5.AbstractC1705a;
import n5.D;
import n5.l;
import q4.g;

/* loaded from: classes.dex */
public final class f extends AbstractC1565e implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public final d f4075C;

    /* renamed from: D, reason: collision with root package name */
    public final SurfaceHolderCallbackC1596z f4076D;

    /* renamed from: E, reason: collision with root package name */
    public final Handler f4077E;

    /* renamed from: F, reason: collision with root package name */
    public final e f4078F;

    /* renamed from: G, reason: collision with root package name */
    public Q5.e f4079G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4080H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4081I;

    /* renamed from: J, reason: collision with root package name */
    public long f4082J;

    /* renamed from: K, reason: collision with root package name */
    public c f4083K;
    public long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [F4.e, q4.g] */
    public f(SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z, Looper looper) {
        super(5);
        Handler handler;
        d dVar = d.f4073a;
        this.f4076D = surfaceHolderCallbackC1596z;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = D.f21141a;
            handler = new Handler(looper, this);
        }
        this.f4077E = handler;
        this.f4075C = dVar;
        this.f4078F = new g(1);
        this.L = -9223372036854775807L;
    }

    @Override // m4.AbstractC1565e
    public final int A(L l10) {
        if (this.f4075C.b(l10)) {
            return AbstractC1565e.e(l10.f20083U == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC1565e.e(0, 0, 0);
    }

    public final void C(c cVar, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            b[] bVarArr = cVar.f4071a;
            if (i7 >= bVarArr.length) {
                return;
            }
            L o10 = bVarArr[i7].o();
            if (o10 != null) {
                d dVar = this.f4075C;
                if (dVar.b(o10)) {
                    Q5.e a9 = dVar.a(o10);
                    byte[] y10 = bVarArr[i7].y();
                    y10.getClass();
                    e eVar = this.f4078F;
                    eVar.G();
                    eVar.I(y10.length);
                    eVar.f23458d.put(y10);
                    eVar.J();
                    c t5 = a9.t(eVar);
                    if (t5 != null) {
                        C(t5, arrayList);
                    }
                    i7++;
                }
            }
            arrayList.add(bVarArr[i7]);
            i7++;
        }
    }

    public final long D(long j) {
        AbstractC1705a.m(j != -9223372036854775807L);
        AbstractC1705a.m(this.L != -9223372036854775807L);
        return j - this.L;
    }

    public final void E(c cVar) {
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = this.f4076D;
        C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
        C1560b0 a9 = c1549c.f19870v0.a();
        int i7 = 0;
        while (true) {
            b[] bVarArr = cVar.f4071a;
            if (i7 >= bVarArr.length) {
                break;
            }
            bVarArr[i7].i(a9);
            i7++;
        }
        c1549c.f19870v0 = new C1562c0(a9);
        C1562c0 L = c1549c.L();
        boolean equals = L.equals(c1549c.f19842a0);
        l lVar = c1549c.f19877z;
        if (!equals) {
            c1549c.f19842a0 = L;
            lVar.c(14, new Q9.a(surfaceHolderCallbackC1596z, 22));
        }
        lVar.c(28, new Q9.a(cVar, 23));
        lVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        E((c) message.obj);
        return true;
    }

    @Override // m4.AbstractC1565e
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // m4.AbstractC1565e
    public final boolean l() {
        return this.f4081I;
    }

    @Override // m4.AbstractC1565e
    public final boolean m() {
        return true;
    }

    @Override // m4.AbstractC1565e
    public final void n() {
        this.f4083K = null;
        this.f4079G = null;
        this.L = -9223372036854775807L;
    }

    @Override // m4.AbstractC1565e
    public final void p(long j, boolean z8) {
        this.f4083K = null;
        this.f4080H = false;
        this.f4081I = false;
    }

    @Override // m4.AbstractC1565e
    public final void u(L[] lArr, long j, long j10) {
        this.f4079G = this.f4075C.a(lArr[0]);
        c cVar = this.f4083K;
        if (cVar != null) {
            long j11 = this.L;
            long j12 = cVar.f4072b;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f4071a);
            }
            this.f4083K = cVar;
        }
        this.L = j10;
    }

    @Override // m4.AbstractC1565e
    public final void w(long j, long j10) {
        boolean z8 = true;
        while (z8) {
            if (!this.f4080H && this.f4083K == null) {
                e eVar = this.f4078F;
                eVar.G();
                ha.g gVar = this.f20354c;
                gVar.clear();
                int v10 = v(gVar, eVar, 0);
                if (v10 == -4) {
                    if (eVar.i(4)) {
                        this.f4080H = true;
                    } else {
                        eVar.f4074w = this.f4082J;
                        eVar.J();
                        Q5.e eVar2 = this.f4079G;
                        int i7 = D.f21141a;
                        c t5 = eVar2.t(eVar);
                        if (t5 != null) {
                            ArrayList arrayList = new ArrayList(t5.f4071a.length);
                            C(t5, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f4083K = new c(D(eVar.f23460f), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (v10 == -5) {
                    L l10 = (L) gVar.f17916c;
                    l10.getClass();
                    this.f4082J = l10.f20067D;
                }
            }
            c cVar = this.f4083K;
            if (cVar == null || cVar.f4072b > D(j)) {
                z8 = false;
            } else {
                c cVar2 = this.f4083K;
                Handler handler = this.f4077E;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    E(cVar2);
                }
                this.f4083K = null;
                z8 = true;
            }
            if (this.f4080H && this.f4083K == null) {
                this.f4081I = true;
            }
        }
    }
}
