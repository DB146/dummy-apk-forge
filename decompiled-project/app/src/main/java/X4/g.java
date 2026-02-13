package X4;

import W4.C0591i;
import W4.l;
import Z9.x;
import h3.o;
import java.util.ArrayList;
import java.util.Locale;
import m4.K;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f10969a;

    /* renamed from: b, reason: collision with root package name */
    public v f10970b;

    /* renamed from: d, reason: collision with root package name */
    public long f10972d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10974f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10975u;

    /* renamed from: c, reason: collision with root package name */
    public long f10971c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f10973e = -1;

    public g(l lVar) {
        this.f10969a = lVar;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10971c = j;
        this.f10972d = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        this.f10971c = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        AbstractC1705a.n(this.f10970b);
        if (!this.f10974f) {
            int i10 = vVar.f21230b;
            AbstractC1705a.g("ID Header has insufficient data", vVar.f21231c > 18);
            AbstractC1705a.g("ID Header missing", vVar.t(8, M6.e.f6799c).equals("OpusHead"));
            AbstractC1705a.g("version number must always be 1", vVar.v() == 1);
            vVar.G(i10);
            ArrayList c10 = AbstractC1787a.c(vVar.f21229a);
            K a9 = this.f10969a.f10722c.a();
            a9.f19985m = c10;
            o.w(a9, this.f10970b);
            this.f10974f = true;
        } else if (this.f10975u) {
            int a10 = C0591i.a(this.f10973e);
            if (i7 != a10) {
                int i11 = D.f21141a;
                Locale locale = Locale.US;
                AbstractC1705a.S("RtpOpusReader", A3.c.e(a10, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", "."));
            }
            int a11 = vVar.a();
            this.f10970b.c(a11, vVar);
            this.f10970b.e(x.U(this.f10972d, j, this.f10971c, 48000), 1, a11, 0, null);
        } else {
            AbstractC1705a.g("Comment Header has insufficient data", vVar.f21231c >= 8);
            AbstractC1705a.g("Comment Header should follow ID Header", vVar.t(8, M6.e.f6799c).equals("OpusTags"));
            this.f10975u = true;
        }
        this.f10973e = i7;
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 1);
        this.f10970b = u3;
        u3.a(this.f10969a.f10722c);
    }
}
