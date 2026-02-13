package X4;

import W4.C0591i;
import W4.l;
import Z9.x;
import h3.o;
import java.util.Locale;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f10981a;

    /* renamed from: b, reason: collision with root package name */
    public v f10982b;

    /* renamed from: c, reason: collision with root package name */
    public long f10983c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f10984d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f10985e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f10986f = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f10987u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10988v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10989w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10990x;

    public j(l lVar) {
        this.f10981a = lVar;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10983c = j;
        this.f10985e = -1;
        this.f10987u = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        AbstractC1705a.m(this.f10983c == -9223372036854775807L);
        this.f10983c = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        AbstractC1705a.n(this.f10982b);
        int v10 = vVar.v();
        if ((v10 & 16) == 16 && (v10 & 7) == 0) {
            if (this.f10988v && this.f10985e > 0) {
                v vVar2 = this.f10982b;
                vVar2.getClass();
                vVar2.e(this.f10986f, this.f10989w ? 1 : 0, this.f10985e, 0, null);
                this.f10985e = -1;
                this.f10986f = -9223372036854775807L;
                this.f10988v = false;
            }
            this.f10988v = true;
        } else {
            if (!this.f10988v) {
                AbstractC1705a.S("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a9 = C0591i.a(this.f10984d);
            if (i7 < a9) {
                int i10 = D.f21141a;
                Locale locale = Locale.US;
                AbstractC1705a.S("RtpVP8Reader", A3.c.e(a9, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
                return;
            }
        }
        if ((v10 & 128) != 0) {
            int v11 = vVar.v();
            if ((v11 & 128) != 0 && (vVar.v() & 128) != 0) {
                vVar.H(1);
            }
            if ((v11 & 64) != 0) {
                vVar.H(1);
            }
            if ((v11 & 32) != 0 || (16 & v11) != 0) {
                vVar.H(1);
            }
        }
        if (this.f10985e == -1 && this.f10988v) {
            this.f10989w = (vVar.e() & 1) == 0;
        }
        if (!this.f10990x) {
            int i11 = vVar.f21230b;
            vVar.G(i11 + 6);
            int o10 = vVar.o() & 16383;
            int o11 = vVar.o() & 16383;
            vVar.G(i11);
            L l10 = this.f10981a.f10722c;
            if (o10 != l10.f20068E || o11 != l10.f20069F) {
                v vVar3 = this.f10982b;
                K a10 = l10.a();
                a10.f19988p = o10;
                a10.f19989q = o11;
                o.w(a10, vVar3);
            }
            this.f10990x = true;
        }
        int a11 = vVar.a();
        this.f10982b.c(a11, vVar);
        int i12 = this.f10985e;
        if (i12 == -1) {
            this.f10985e = a11;
        } else {
            this.f10985e = i12 + a11;
        }
        this.f10986f = x.U(this.f10987u, j, this.f10983c, 90000);
        if (z8) {
            v vVar4 = this.f10982b;
            vVar4.getClass();
            vVar4.e(this.f10986f, this.f10989w ? 1 : 0, this.f10985e, 0, null);
            this.f10985e = -1;
            this.f10986f = -9223372036854775807L;
            this.f10988v = false;
        }
        this.f10984d = i7;
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 2);
        this.f10982b = u3;
        u3.a(this.f10981a.f10722c);
    }
}
