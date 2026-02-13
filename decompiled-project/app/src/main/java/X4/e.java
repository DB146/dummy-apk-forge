package X4;

import W4.C0591i;
import W4.l;
import Z9.x;
import java.util.Locale;
import java.util.TreeMap;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10951a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10952b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10953c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10954d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10955e;

    /* renamed from: f, reason: collision with root package name */
    public int f10956f;

    /* renamed from: u, reason: collision with root package name */
    public long f10957u;

    /* renamed from: v, reason: collision with root package name */
    public int f10958v;

    /* renamed from: w, reason: collision with root package name */
    public int f10959w;

    /* renamed from: x, reason: collision with root package name */
    public long f10960x;

    public e(l lVar, int i7) {
        this.f10951a = i7;
        switch (i7) {
            case 1:
                this.f10952b = new v();
                this.f10953c = new v(AbstractC1705a.f21155d);
                this.f10954d = lVar;
                this.f10957u = -9223372036854775807L;
                this.f10958v = -1;
                return;
            default:
                this.f10953c = new v(AbstractC1705a.f21155d);
                this.f10954d = lVar;
                this.f10952b = new v();
                this.f10957u = -9223372036854775807L;
                this.f10958v = -1;
                return;
        }
    }

    public e(String str, String str2, long j, int i7, int i10, int i11, int[] iArr, TreeMap treeMap) {
        this.f10951a = 2;
        this.f10952b = str;
        this.f10953c = str2;
        this.f10957u = j;
        this.f10960x = 0L;
        this.f10956f = i7;
        this.f10958v = i10;
        this.f10959w = i11;
        this.f10954d = iArr;
        this.f10955e = treeMap;
    }

    private final void e(long j) {
    }

    private final void f(long j) {
    }

    @Override // X4.h
    public void a(long j, long j10) {
        switch (this.f10951a) {
            case 0:
                this.f10957u = j;
                this.f10959w = 0;
                this.f10960x = j10;
                return;
            default:
                this.f10957u = j;
                this.f10959w = 0;
                this.f10960x = j10;
                return;
        }
    }

    @Override // X4.h
    public void b(long j) {
        int i7 = this.f10951a;
    }

    @Override // X4.h
    public void c(v vVar, long j, int i7, boolean z8) {
        int i10;
        Object obj = this.f10952b;
        int i11 = 1;
        switch (this.f10951a) {
            case 0:
                try {
                    int i12 = vVar.f21229a[0] & 31;
                    AbstractC1705a.n((s4.v) this.f10955e);
                    if (i12 > 0 && i12 < 24) {
                        int a9 = vVar.a();
                        this.f10959w = g() + this.f10959w;
                        ((s4.v) this.f10955e).c(a9, vVar);
                        this.f10959w += a9;
                        this.f10956f = (vVar.f21229a[0] & 31) == 5 ? 1 : 0;
                    } else if (i12 == 24) {
                        vVar.v();
                        while (vVar.a() > 4) {
                            int A10 = vVar.A();
                            this.f10959w = g() + this.f10959w;
                            ((s4.v) this.f10955e).c(A10, vVar);
                            this.f10959w += A10;
                        }
                        this.f10956f = 0;
                    } else {
                        if (i12 != 28) {
                            throw C1586o0.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i12)), null);
                        }
                        byte[] bArr = vVar.f21229a;
                        byte b2 = bArr[0];
                        byte b10 = bArr[1];
                        int i13 = (b2 & 224) | (b10 & 31);
                        boolean z10 = (b10 & 128) > 0;
                        boolean z11 = (b10 & 64) > 0;
                        v vVar2 = (v) obj;
                        if (z10) {
                            this.f10959w = g() + this.f10959w;
                            byte[] bArr2 = vVar.f21229a;
                            i10 = 1;
                            bArr2[1] = (byte) i13;
                            vVar2.getClass();
                            vVar2.E(bArr2.length, bArr2);
                            vVar2.G(1);
                        } else {
                            i10 = 1;
                            int a10 = C0591i.a(this.f10958v);
                            if (i7 != a10) {
                                int i14 = D.f21141a;
                                Locale locale = Locale.US;
                                AbstractC1705a.S("RtpH264Reader", A3.c.e(a10, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
                            } else {
                                byte[] bArr3 = vVar.f21229a;
                                vVar2.getClass();
                                vVar2.E(bArr3.length, bArr3);
                                vVar2.G(2);
                            }
                        }
                        int a11 = vVar2.a();
                        ((s4.v) this.f10955e).c(a11, vVar2);
                        this.f10959w += a11;
                        if (z11) {
                            this.f10956f = (i13 & 31) == 5 ? i10 : 0;
                        }
                    }
                    if (z8) {
                        if (this.f10957u == -9223372036854775807L) {
                            this.f10957u = j;
                        }
                        ((s4.v) this.f10955e).e(x.U(this.f10960x, j, this.f10957u, 90000), this.f10956f, this.f10959w, 0, null);
                        this.f10959w = 0;
                    }
                    this.f10958v = i7;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw C1586o0.b(null, e2);
                }
            default:
                byte[] bArr4 = vVar.f21229a;
                if (bArr4.length == 0) {
                    throw C1586o0.b("Empty RTP data packet.", null);
                }
                int i15 = (bArr4[0] >> 1) & 63;
                AbstractC1705a.n((s4.v) this.f10955e);
                v vVar3 = (v) this.f10953c;
                if (i15 >= 0 && i15 < 48) {
                    int a12 = vVar.a();
                    int i16 = this.f10959w;
                    vVar3.G(0);
                    int a13 = vVar3.a();
                    s4.v vVar4 = (s4.v) this.f10955e;
                    vVar4.getClass();
                    vVar4.c(a13, vVar3);
                    this.f10959w = a13 + i16;
                    ((s4.v) this.f10955e).c(a12, vVar);
                    this.f10959w += a12;
                    int i17 = (vVar.f21229a[0] >> 1) & 63;
                    if (i17 != 19 && i17 != 20) {
                        i11 = 0;
                    }
                    this.f10956f = i11;
                } else {
                    if (i15 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i15 != 49) {
                        throw C1586o0.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i15)), null);
                    }
                    byte[] bArr5 = vVar.f21229a;
                    if (bArr5.length < 3) {
                        throw C1586o0.b("Malformed FU header.", null);
                    }
                    int i18 = bArr5[1] & 7;
                    byte b11 = bArr5[2];
                    int i19 = b11 & 63;
                    boolean z12 = (b11 & 128) > 0;
                    boolean z13 = (b11 & 64) > 0;
                    v vVar5 = (v) obj;
                    if (z12) {
                        int i20 = this.f10959w;
                        vVar3.G(0);
                        int a14 = vVar3.a();
                        s4.v vVar6 = (s4.v) this.f10955e;
                        vVar6.getClass();
                        vVar6.c(a14, vVar3);
                        this.f10959w = a14 + i20;
                        byte[] bArr6 = vVar.f21229a;
                        bArr6[1] = (byte) ((i19 << 1) & 127);
                        bArr6[2] = (byte) i18;
                        vVar5.getClass();
                        vVar5.E(bArr6.length, bArr6);
                        vVar5.G(1);
                    } else {
                        int i21 = (this.f10958v + 1) % 65535;
                        if (i7 != i21) {
                            int i22 = D.f21141a;
                            Locale locale2 = Locale.US;
                            AbstractC1705a.S("RtpH265Reader", A3.c.e(i21, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
                        } else {
                            vVar5.getClass();
                            vVar5.E(bArr5.length, bArr5);
                            vVar5.G(3);
                        }
                    }
                    int a15 = vVar5.a();
                    ((s4.v) this.f10955e).c(a15, vVar5);
                    this.f10959w += a15;
                    if (z13) {
                        this.f10956f = (i19 == 19 || i19 == 20) ? 1 : 0;
                    }
                }
                if (z8) {
                    if (this.f10957u == -9223372036854775807L) {
                        this.f10957u = j;
                    }
                    ((s4.v) this.f10955e).e(x.U(this.f10960x, j, this.f10957u, 90000), this.f10956f, this.f10959w, 0, null);
                    this.f10959w = 0;
                }
                this.f10958v = i7;
                return;
        }
    }

    @Override // X4.h
    public void d(InterfaceC1984l interfaceC1984l, int i7) {
        switch (this.f10951a) {
            case 0:
                s4.v u3 = interfaceC1984l.u(i7, 2);
                this.f10955e = u3;
                int i10 = D.f21141a;
                u3.a(((l) this.f10954d).f10722c);
                return;
            default:
                s4.v u10 = interfaceC1984l.u(i7, 2);
                this.f10955e = u10;
                u10.a(((l) this.f10954d).f10722c);
                return;
        }
    }

    public int g() {
        v vVar = (v) this.f10953c;
        vVar.G(0);
        int a9 = vVar.a();
        s4.v vVar2 = (s4.v) this.f10955e;
        vVar2.getClass();
        vVar2.c(a9, vVar);
        return a9;
    }
}
