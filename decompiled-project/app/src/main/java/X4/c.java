package X4;

import W4.C0591i;
import W4.l;
import Z9.x;
import java.util.Locale;
import n5.AbstractC1705a;
import n5.D;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f10929v = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f10930w = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final l f10931a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10933c;

    /* renamed from: d, reason: collision with root package name */
    public v f10934d;

    /* renamed from: e, reason: collision with root package name */
    public long f10935e;

    /* renamed from: f, reason: collision with root package name */
    public long f10936f;

    /* renamed from: u, reason: collision with root package name */
    public int f10937u;

    public c(l lVar) {
        this.f10931a = lVar;
        String str = lVar.f10722c.f20096z;
        str.getClass();
        this.f10932b = "audio/amr-wb".equals(str);
        this.f10933c = lVar.f10721b;
        this.f10935e = -9223372036854775807L;
        this.f10937u = -1;
        this.f10936f = 0L;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10935e = j;
        this.f10936f = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        this.f10935e = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        int a9;
        AbstractC1705a.n(this.f10934d);
        int i10 = this.f10937u;
        if (i10 != -1 && i7 != (a9 = C0591i.a(i10))) {
            int i11 = D.f21141a;
            Locale locale = Locale.US;
            AbstractC1705a.S("RtpAmrReader", A3.c.e(a9, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", "."));
        }
        vVar.H(1);
        int e2 = (vVar.e() >> 3) & 15;
        boolean z10 = (e2 >= 0 && e2 <= 8) || e2 == 15;
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        boolean z11 = this.f10932b;
        sb2.append(z11 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(e2);
        AbstractC1705a.g(sb2.toString(), z10);
        int i12 = z11 ? f10930w[e2] : f10929v[e2];
        int a10 = vVar.a();
        AbstractC1705a.g("compound payload not supported currently", a10 == i12);
        this.f10934d.c(a10, vVar);
        this.f10934d.e(x.U(this.f10936f, j, this.f10935e, this.f10933c), 1, a10, 0, null);
        this.f10937u = i7;
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 1);
        this.f10934d = u3;
        u3.a(this.f10931a.f10722c);
    }
}
