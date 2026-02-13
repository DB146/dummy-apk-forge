package S4;

import P4.X;
import P4.c0;
import android.os.Handler;
import m4.C1586o0;
import m4.L;
import m5.C1620q;
import m5.InterfaceC1613j;
import n5.D;
import s4.u;
import s4.v;

/* loaded from: classes.dex */
public final class p implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9157a;

    /* renamed from: b, reason: collision with root package name */
    public final ha.g f9158b = new ha.g(3, false);

    /* renamed from: c, reason: collision with root package name */
    public final F4.e f9159c = new q4.g(1);

    /* renamed from: d, reason: collision with root package name */
    public long f9160d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f9161e;

    /* JADX WARN: Type inference failed for: r2v3, types: [F4.e, q4.g] */
    public p(q qVar, C1620q c1620q) {
        this.f9161e = qVar;
        this.f9157a = new c0(c1620q, null, null);
    }

    @Override // s4.v
    public final void a(L l10) {
        this.f9157a.a(l10);
    }

    @Override // s4.v
    public final void c(int i7, n5.v vVar) {
        this.f9157a.c(i7, vVar);
    }

    @Override // s4.v
    public final int d(InterfaceC1613j interfaceC1613j, int i7, boolean z8) {
        return this.f9157a.b(interfaceC1613j, i7, z8);
    }

    @Override // s4.v
    public final void e(long j, int i7, int i10, int i11, u uVar) {
        long f4;
        long j10;
        this.f9157a.e(j, i7, i10, i11, uVar);
        while (this.f9157a.t(false)) {
            F4.e eVar = this.f9159c;
            eVar.G();
            if (this.f9157a.y(this.f9158b, eVar, 0, false) == -4) {
                eVar.J();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j11 = eVar.f23460f;
                F4.c t5 = this.f9161e.f9164c.t(eVar);
                if (t5 != null) {
                    H4.a aVar = (H4.a) t5.f4071a[0];
                    String str = aVar.f4887a;
                    String str2 = aVar.f4888b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = D.P(D.o(aVar.f4891e));
                        } catch (C1586o0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            o oVar = new o(j11, j10);
                            Handler handler = this.f9161e.f9165d;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        c0 c0Var = this.f9157a;
        X x2 = c0Var.f7997a;
        synchronized (c0Var) {
            int i12 = c0Var.f8012s;
            f4 = i12 == 0 ? -1L : c0Var.f(i12);
        }
        x2.b(f4);
    }
}
