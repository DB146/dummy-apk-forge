package C4;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f2749q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f2750a;

    /* renamed from: b, reason: collision with root package name */
    public s4.v f2751b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.s f2752c;

    /* renamed from: d, reason: collision with root package name */
    public final n5.v f2753d;

    /* renamed from: e, reason: collision with root package name */
    public final v f2754e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2755f = new boolean[4];
    public final j g;

    /* renamed from: h, reason: collision with root package name */
    public long f2756h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2757i;
    public boolean j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f2758l;

    /* renamed from: m, reason: collision with root package name */
    public long f2759m;

    /* renamed from: n, reason: collision with root package name */
    public long f2760n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2761o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2762p;

    /* JADX WARN: Type inference failed for: r0v2, types: [C4.j, java.lang.Object] */
    public k(q3.s sVar) {
        this.f2752c = sVar;
        ?? obj = new Object();
        obj.f2748d = new byte[128];
        this.g = obj;
        if (sVar != null) {
            this.f2754e = new v(178);
            this.f2753d = new n5.v();
        } else {
            this.f2754e = null;
            this.f2753d = null;
        }
        this.f2758l = -9223372036854775807L;
        this.f2760n = -9223372036854775807L;
    }

    @Override // C4.i
    public final void a() {
        AbstractC1705a.q(this.f2755f);
        j jVar = this.g;
        jVar.f2745a = false;
        jVar.f2746b = 0;
        jVar.f2747c = 0;
        v vVar = this.f2754e;
        if (vVar != null) {
            vVar.f();
        }
        this.f2756h = 0L;
        this.f2757i = false;
        this.f2758l = -9223372036854775807L;
        this.f2760n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        j jVar;
        v vVar2;
        int i7;
        int i10;
        int i11;
        boolean z8;
        int i12;
        long j;
        boolean z10;
        boolean z11;
        long j10;
        int i13;
        float f4;
        long j11;
        float f10;
        int i14;
        char c10 = 4;
        AbstractC1705a.n(this.f2751b);
        int i15 = vVar.f21230b;
        int i16 = vVar.f21231c;
        byte[] bArr = vVar.f21229a;
        this.f2756h += vVar.a();
        this.f2751b.c(vVar.a(), vVar);
        while (true) {
            int w10 = AbstractC1705a.w(bArr, i15, i16, this.f2755f);
            jVar = this.g;
            vVar2 = this.f2754e;
            if (w10 == i16) {
                break;
            }
            int i17 = w10 + 3;
            int i18 = vVar.f21229a[i17] & 255;
            int i19 = w10 - i15;
            if (this.j) {
                i7 = i16;
                i10 = i17;
                i11 = i15;
            } else {
                if (i19 > 0) {
                    jVar.a(i15, bArr, w10);
                }
                int i20 = i19 < 0 ? -i19 : 0;
                if (jVar.f2745a) {
                    int i21 = jVar.f2746b - i20;
                    jVar.f2746b = i21;
                    if (jVar.f2747c == 0 && i18 == 181) {
                        jVar.f2747c = i21;
                        i7 = i16;
                        i10 = i17;
                        i11 = i15;
                    } else {
                        jVar.f2745a = false;
                        String str = this.f2750a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(jVar.f2748d, jVar.f2746b);
                        int i22 = copyOf[c10] & 255;
                        byte b2 = copyOf[5];
                        i10 = i17;
                        i7 = i16;
                        int i23 = ((b2 & 255) >> 4) | (i22 << 4);
                        int i24 = ((b2 & 15) << 8) | (copyOf[6] & 255);
                        int i25 = (copyOf[7] & 240) >> 4;
                        if (i25 != 2) {
                            if (i25 == 3) {
                                f10 = i24 * 16;
                                i14 = i23 * 9;
                            } else if (i25 != 4) {
                                f4 = 1.0f;
                            } else {
                                f10 = i24 * 121;
                                i14 = i23 * 100;
                            }
                            f4 = f10 / i14;
                        } else {
                            f4 = (i24 * 4) / (i23 * 3);
                        }
                        K k = new K();
                        k.f19976a = str;
                        k.k = "video/mpeg2";
                        k.f19988p = i23;
                        k.f19989q = i24;
                        k.f19992t = f4;
                        k.f19985m = Collections.singletonList(copyOf);
                        L l10 = new L(k);
                        int i26 = (copyOf[7] & 15) - 1;
                        if (i26 < 0 || i26 >= 8) {
                            i11 = i15;
                            j11 = 0;
                        } else {
                            double d10 = f2749q[i26];
                            byte b10 = copyOf[jVar.f2747c + 9];
                            int i27 = (b10 & 96) >> 5;
                            if (i27 != (b10 & 31)) {
                                i11 = i15;
                                d10 *= (i27 + 1.0d) / (r3 + 1);
                            } else {
                                i11 = i15;
                            }
                            j11 = (long) (1000000.0d / d10);
                        }
                        Pair create = Pair.create(l10, Long.valueOf(j11));
                        this.f2751b.a((L) create.first);
                        this.k = ((Long) create.second).longValue();
                        this.j = true;
                    }
                } else {
                    i7 = i16;
                    i10 = i17;
                    i11 = i15;
                    if (i18 == 179) {
                        jVar.f2745a = true;
                    }
                }
                jVar.a(0, j.f2744e, 3);
            }
            if (vVar2 != null) {
                if (i19 > 0) {
                    vVar2.a(i11, bArr, w10);
                    i13 = 0;
                } else {
                    i13 = -i19;
                }
                if (vVar2.e(i13)) {
                    int Q3 = AbstractC1705a.Q(vVar2.f2875c, (byte[]) vVar2.f2878f);
                    int i28 = n5.D.f21141a;
                    byte[] bArr2 = (byte[]) vVar2.f2878f;
                    n5.v vVar3 = this.f2753d;
                    vVar3.E(Q3, bArr2);
                    this.f2752c.n(this.f2760n, vVar3);
                }
                if (i18 == 178) {
                    z8 = true;
                    if (vVar.f21229a[w10 + 2] == 1) {
                        vVar2.g(i18);
                    }
                    if (i18 != 0 || i18 == 179) {
                        i12 = i7 - w10;
                        if (this.f2762p && this.j) {
                            j10 = this.f2760n;
                            if (j10 != -9223372036854775807L) {
                                this.f2751b.e(j10, this.f2761o ? 1 : 0, ((int) (this.f2756h - this.f2759m)) - i12, i12, null);
                            }
                        }
                        if (this.f2757i || this.f2762p) {
                            this.f2759m = this.f2756h - i12;
                            j = this.f2758l;
                            if (j == -9223372036854775807L) {
                                long j12 = this.f2760n;
                                j = j12 != -9223372036854775807L ? j12 + this.k : -9223372036854775807L;
                            }
                            this.f2760n = j;
                            z10 = false;
                            this.f2761o = false;
                            this.f2758l = -9223372036854775807L;
                            z11 = true;
                            this.f2757i = true;
                        } else {
                            z10 = false;
                            z11 = true;
                        }
                        this.f2762p = i18 != 0 ? z11 : z10;
                    } else if (i18 == 184) {
                        this.f2761o = z8;
                    }
                    i16 = i7;
                    i15 = i10;
                    c10 = 4;
                }
            }
            z8 = true;
            if (i18 != 0) {
            }
            i12 = i7 - w10;
            if (this.f2762p) {
                j10 = this.f2760n;
                if (j10 != -9223372036854775807L) {
                }
            }
            if (this.f2757i) {
            }
            this.f2759m = this.f2756h - i12;
            j = this.f2758l;
            if (j == -9223372036854775807L) {
            }
            this.f2760n = j;
            z10 = false;
            this.f2761o = false;
            this.f2758l = -9223372036854775807L;
            z11 = true;
            this.f2757i = true;
            this.f2762p = i18 != 0 ? z11 : z10;
            i16 = i7;
            i15 = i10;
            c10 = 4;
        }
        if (!this.j) {
            jVar.a(i15, bArr, i16);
        }
        if (vVar2 != null) {
            vVar2.a(i15, bArr, i16);
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        this.f2758l = j;
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2750a = f4.f2684e;
        f4.b();
        this.f2751b = interfaceC1984l.u(f4.f2683d, 2);
        q3.s sVar = this.f2752c;
        if (sVar != null) {
            sVar.p(interfaceC1984l, f4);
        }
    }
}
