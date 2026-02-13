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
public final class d implements h {

    /* renamed from: A, reason: collision with root package name */
    public boolean f10938A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10939a;

    /* renamed from: b, reason: collision with root package name */
    public final l f10940b;

    /* renamed from: c, reason: collision with root package name */
    public v f10941c;

    /* renamed from: d, reason: collision with root package name */
    public long f10942d;

    /* renamed from: e, reason: collision with root package name */
    public long f10943e;

    /* renamed from: f, reason: collision with root package name */
    public int f10944f;

    /* renamed from: u, reason: collision with root package name */
    public int f10945u;

    /* renamed from: v, reason: collision with root package name */
    public long f10946v;

    /* renamed from: w, reason: collision with root package name */
    public int f10947w;

    /* renamed from: x, reason: collision with root package name */
    public int f10948x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10949y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10950z;

    public d(l lVar, int i7) {
        this.f10939a = i7;
        switch (i7) {
            case 1:
                this.f10940b = lVar;
                this.f10942d = -9223372036854775807L;
                this.f10945u = -1;
                this.f10946v = -9223372036854775807L;
                this.f10943e = 0L;
                this.f10944f = -1;
                this.f10947w = -1;
                this.f10948x = -1;
                return;
            default:
                this.f10940b = lVar;
                this.f10942d = -9223372036854775807L;
                this.f10945u = -1;
                return;
        }
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        switch (this.f10939a) {
            case 0:
                this.f10942d = j;
                this.f10944f = 0;
                this.f10943e = j10;
                return;
            default:
                this.f10942d = j;
                this.f10945u = -1;
                this.f10943e = j10;
                return;
        }
    }

    @Override // X4.h
    public final void b(long j) {
        switch (this.f10939a) {
            case 0:
                AbstractC1705a.m(this.f10942d == -9223372036854775807L);
                this.f10942d = j;
                return;
            default:
                AbstractC1705a.m(this.f10942d == -9223372036854775807L);
                this.f10942d = j;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        int i10;
        int i11;
        l lVar = this.f10940b;
        switch (this.f10939a) {
            case 0:
                AbstractC1705a.n(this.f10941c);
                int i12 = vVar.f21230b;
                int A10 = vVar.A();
                Object[] objArr = (A10 & 1024) > 0;
                if ((A10 & 512) != 0 || (A10 & 504) != 0 || (A10 & 7) != 0) {
                    AbstractC1705a.S("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    return;
                }
                if (objArr == true) {
                    if (this.f10938A && this.f10944f > 0) {
                        v vVar2 = this.f10941c;
                        vVar2.getClass();
                        vVar2.e(this.f10946v, this.f10949y ? 1 : 0, this.f10944f, 0, null);
                        this.f10944f = 0;
                        this.f10946v = -9223372036854775807L;
                        this.f10949y = false;
                        this.f10938A = false;
                    }
                    this.f10938A = true;
                    if ((vVar.e() & 252) < 128) {
                        AbstractC1705a.S("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        return;
                    }
                    byte[] bArr = vVar.f21229a;
                    bArr[i12] = 0;
                    bArr[i12 + 1] = 0;
                    vVar.G(i12);
                } else {
                    if (!this.f10938A) {
                        AbstractC1705a.S("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    int a9 = C0591i.a(this.f10945u);
                    if (i7 < a9) {
                        int i13 = D.f21141a;
                        Locale locale = Locale.US;
                        AbstractC1705a.S("RtpH263Reader", A3.c.e(a9, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
                        return;
                    }
                }
                if (this.f10944f == 0) {
                    boolean z10 = this.f10950z;
                    int i14 = vVar.f21230b;
                    if (((vVar.w() >> 10) & 63) == 32) {
                        int e2 = vVar.e();
                        int i15 = (e2 >> 1) & 1;
                        if (!z10 && i15 == 0) {
                            int i16 = (e2 >> 2) & 7;
                            if (i16 == 1) {
                                this.f10947w = 128;
                                this.f10948x = 96;
                            } else {
                                int i17 = i16 - 2;
                                this.f10947w = 176 << i17;
                                this.f10948x = 144 << i17;
                            }
                        }
                        vVar.G(i14);
                        this.f10949y = i15 == 0;
                    } else {
                        vVar.G(i14);
                        this.f10949y = false;
                    }
                    if (!this.f10950z && this.f10949y) {
                        int i18 = this.f10947w;
                        L l10 = lVar.f10722c;
                        if (i18 != l10.f20068E || this.f10948x != l10.f20069F) {
                            v vVar3 = this.f10941c;
                            K a10 = l10.a();
                            a10.f19988p = this.f10947w;
                            a10.f19989q = this.f10948x;
                            o.w(a10, vVar3);
                        }
                        this.f10950z = true;
                    }
                }
                int a11 = vVar.a();
                this.f10941c.c(a11, vVar);
                this.f10944f += a11;
                this.f10946v = x.U(this.f10943e, j, this.f10942d, 90000);
                if (z8) {
                    v vVar4 = this.f10941c;
                    vVar4.getClass();
                    vVar4.e(this.f10946v, this.f10949y ? 1 : 0, this.f10944f, 0, null);
                    this.f10944f = 0;
                    this.f10946v = -9223372036854775807L;
                    this.f10949y = false;
                    this.f10938A = false;
                }
                this.f10945u = i7;
                return;
            default:
                AbstractC1705a.n(this.f10941c);
                int v10 = vVar.v();
                if ((v10 & 8) == 8) {
                    if (this.f10949y && this.f10945u > 0) {
                        v vVar5 = this.f10941c;
                        vVar5.getClass();
                        vVar5.e(this.f10946v, this.f10938A ? 1 : 0, this.f10945u, 0, null);
                        this.f10945u = -1;
                        this.f10946v = -9223372036854775807L;
                        this.f10949y = false;
                    }
                    this.f10949y = true;
                } else {
                    if (!this.f10949y) {
                        AbstractC1705a.S("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                        return;
                    }
                    int a12 = C0591i.a(this.f10944f);
                    if (i7 < a12) {
                        int i19 = D.f21141a;
                        Locale locale2 = Locale.US;
                        AbstractC1705a.S("RtpVp9Reader", A3.c.e(a12, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
                        return;
                    }
                }
                if ((v10 & 128) == 0 || (vVar.v() & 128) == 0 || vVar.a() >= 1) {
                    int i20 = v10 & 16;
                    AbstractC1705a.g("VP9 flexible mode is not supported.", i20 == 0);
                    if ((v10 & 32) != 0) {
                        vVar.H(1);
                        if (vVar.a() < 1) {
                            return;
                        }
                        if (i20 == 0) {
                            vVar.H(1);
                        }
                    }
                    if ((v10 & 2) != 0) {
                        int v11 = vVar.v();
                        int i21 = (v11 >> 5) & 7;
                        if ((v11 & 16) != 0) {
                            int i22 = i21 + 1;
                            if (vVar.a() < i22 * 4) {
                                return;
                            }
                            for (int i23 = 0; i23 < i22; i23++) {
                                this.f10947w = vVar.A();
                                this.f10948x = vVar.A();
                            }
                        }
                        if ((v11 & 8) != 0) {
                            int v12 = vVar.v();
                            if (vVar.a() < v12) {
                                return;
                            }
                            for (int i24 = 0; i24 < v12; i24++) {
                                int A11 = (vVar.A() & 12) >> 2;
                                if (vVar.a() < A11) {
                                    return;
                                }
                                vVar.H(A11);
                            }
                        }
                    }
                    if (this.f10945u == -1 && this.f10949y) {
                        this.f10938A = (vVar.e() & 4) == 0;
                    }
                    if (!this.f10950z && (i10 = this.f10947w) != -1 && (i11 = this.f10948x) != -1) {
                        L l11 = lVar.f10722c;
                        if (i10 != l11.f20068E || i11 != l11.f20069F) {
                            v vVar6 = this.f10941c;
                            K a13 = l11.a();
                            a13.f19988p = this.f10947w;
                            a13.f19989q = this.f10948x;
                            o.w(a13, vVar6);
                        }
                        this.f10950z = true;
                    }
                    int a14 = vVar.a();
                    this.f10941c.c(a14, vVar);
                    int i25 = this.f10945u;
                    if (i25 == -1) {
                        this.f10945u = a14;
                    } else {
                        this.f10945u = i25 + a14;
                    }
                    this.f10946v = x.U(this.f10943e, j, this.f10942d, 90000);
                    if (z8) {
                        v vVar7 = this.f10941c;
                        vVar7.getClass();
                        vVar7.e(this.f10946v, this.f10938A ? 1 : 0, this.f10945u, 0, null);
                        this.f10945u = -1;
                        this.f10946v = -9223372036854775807L;
                        this.f10949y = false;
                    }
                    this.f10944f = i7;
                    return;
                }
                return;
        }
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        switch (this.f10939a) {
            case 0:
                v u3 = interfaceC1984l.u(i7, 2);
                this.f10941c = u3;
                u3.a(this.f10940b.f10722c);
                return;
            default:
                v u10 = interfaceC1984l.u(i7, 2);
                this.f10941c = u10;
                u10.a(this.f10940b.f10722c);
                return;
        }
    }
}
