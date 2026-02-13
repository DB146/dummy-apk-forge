package Q;

import R.C0524a;
import a0.AbstractC0696w;
import a0.InterfaceC0695v;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import u.C2041D;
import u.C2046I;
import u.C2047J;
import u.C2070x;

/* renamed from: Q.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517u implements InterfaceC0510q {

    /* renamed from: A, reason: collision with root package name */
    public final C2046I f8520A;

    /* renamed from: B, reason: collision with root package name */
    public C2046I f8521B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8522C;

    /* renamed from: D, reason: collision with root package name */
    public C0517u f8523D;

    /* renamed from: E, reason: collision with root package name */
    public int f8524E;

    /* renamed from: F, reason: collision with root package name */
    public final S f8525F;

    /* renamed from: G, reason: collision with root package name */
    public final C0506o f8526G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8527H;

    /* renamed from: a, reason: collision with root package name */
    public final r f8528a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.G0 f8529b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f8530c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f8531d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final u.L f8532e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f8533f;

    /* renamed from: u, reason: collision with root package name */
    public final C2046I f8534u;

    /* renamed from: v, reason: collision with root package name */
    public final C2047J f8535v;

    /* renamed from: w, reason: collision with root package name */
    public final C2047J f8536w;

    /* renamed from: x, reason: collision with root package name */
    public final C2046I f8537x;

    /* renamed from: y, reason: collision with root package name */
    public final C0524a f8538y;

    /* renamed from: z, reason: collision with root package name */
    public final C0524a f8539z;

    public C0517u(r rVar, A0.G0 g02) {
        this.f8528a = rVar;
        this.f8529b = g02;
        u.L l10 = new u.L(new C2047J());
        this.f8532e = l10;
        z0 z0Var = new z0();
        if (rVar.c()) {
            z0Var.f8596y = new C2070x();
        }
        if (rVar.e()) {
            z0Var.o();
        }
        this.f8533f = z0Var;
        this.f8534u = Q5.e.q();
        this.f8535v = new C2047J();
        this.f8536w = new C2047J();
        this.f8537x = Q5.e.q();
        C0524a c0524a = new C0524a();
        this.f8538y = c0524a;
        C0524a c0524a2 = new C0524a();
        this.f8539z = c0524a2;
        this.f8520A = Q5.e.q();
        this.f8521B = Q5.e.q();
        this.f8525F = new S(7);
        C0506o c0506o = new C0506o(g02, rVar, z0Var, l10, c0524a, c0524a2, this);
        rVar.l(c0506o);
        this.f8526G = c0506o;
        boolean z8 = rVar instanceof C0518u0;
        Y.e eVar = AbstractC0492h.f8404a;
    }

    public final void a() {
        this.f8530c.set(null);
        this.f8538y.f8745f.J();
        this.f8539z.f8745f.J();
        u.L l10 = this.f8532e;
        if (l10.f24626a.g()) {
            return;
        }
        new ArrayList();
        if (l10.f24626a.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            W.c cVar = new W.c(l10);
            Zb.h hVar = (Zb.h) cVar.f10248b;
            while (hVar.hasNext()) {
                v0 v0Var = (v0) hVar.next();
                cVar.remove();
                v0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z8) {
        int i7;
        Object g = this.f8534u.g(obj);
        if (g == null) {
            return;
        }
        boolean z10 = g instanceof C2047J;
        C2047J c2047j = this.f8535v;
        C2047J c2047j2 = this.f8536w;
        C2046I c2046i = this.f8520A;
        if (!z10) {
            C0505n0 c0505n0 = (C0505n0) g;
            if (Q5.e.L(c2046i, obj, c0505n0) || c0505n0.c(obj) == M.f8329a) {
                return;
            }
            if (c0505n0.g == null || z8) {
                c2047j.a(c0505n0);
                return;
            } else {
                c2047j2.a(c0505n0);
                return;
            }
        }
        C2047J c2047j3 = (C2047J) g;
        Object[] objArr = c2047j3.f24610b;
        long[] jArr = c2047j3.f24609a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        C0505n0 c0505n02 = (C0505n0) objArr[(i10 << 3) + i13];
                        if (!Q5.e.L(c2046i, obj, c0505n02) && c0505n02.c(obj) != M.f8329a) {
                            if (c0505n02.g == null || z8) {
                                c2047j.a(c0505n02);
                            } else {
                                c2047j2.a(c0505n02);
                            }
                        }
                        i7 = 8;
                    } else {
                        i7 = i11;
                    }
                    j >>= i7;
                    i13++;
                    i11 = i7;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(Set set, boolean z8) {
        C2046I c2046i;
        int i7;
        long[] jArr;
        String str;
        long[] jArr2;
        int i10;
        int i11;
        String str2;
        int i12;
        boolean c10;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        int i13;
        String str5;
        long[] jArr4;
        int i14;
        int i15;
        long j;
        boolean z10;
        long[] jArr5;
        Object[] objArr3;
        long[] jArr6;
        Object[] objArr4;
        Object[] objArr5;
        C2046I c2046i2;
        Object[] objArr6;
        C2046I c2046i3;
        int i16;
        int i17;
        int i18;
        boolean z11 = set instanceof S.h;
        C2046I c2046i4 = this.f8537x;
        char c11 = 7;
        long j10 = -9187201950435737472L;
        int i19 = 8;
        if (z11) {
            C2047J c2047j = ((S.h) set).f8972a;
            Object[] objArr7 = c2047j.f24610b;
            long[] jArr7 = c2047j.f24609a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i20 = 0;
                while (true) {
                    long j11 = jArr7[i20];
                    if ((((~j11) << c11) & j11 & j10) != j10) {
                        int i21 = 8 - ((~(i20 - length)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j11 & 255) < 128) {
                                Object obj = objArr7[(i20 << 3) + i22];
                                if (obj instanceof C0505n0) {
                                    ((C0505n0) obj).c(null);
                                } else {
                                    b(obj, z8);
                                    Object g = c2046i4.g(obj);
                                    if (g != null) {
                                        if (g instanceof C2047J) {
                                            C2047J c2047j2 = (C2047J) g;
                                            Object[] objArr8 = c2047j2.f24610b;
                                            long[] jArr8 = c2047j2.f24609a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                c2046i3 = c2046i4;
                                                int i23 = 0;
                                                while (true) {
                                                    long j12 = jArr8[i23];
                                                    i16 = i21;
                                                    i17 = i22;
                                                    if ((((~j12) << c11) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                        for (int i25 = 0; i25 < i24; i25++) {
                                                            if ((j12 & 255) < 128) {
                                                                b((C) objArr8[(i23 << 3) + i25], z8);
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i23 == length2) {
                                                        break;
                                                    }
                                                    i23++;
                                                    i21 = i16;
                                                    i22 = i17;
                                                    c11 = 7;
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            c2046i3 = c2046i4;
                                            i16 = i21;
                                            i17 = i22;
                                            b((C) g, z8);
                                        }
                                        i18 = 8;
                                    }
                                }
                                objArr6 = objArr7;
                                c2046i3 = c2046i4;
                                i16 = i21;
                                i17 = i22;
                                i18 = 8;
                            } else {
                                objArr6 = objArr7;
                                c2046i3 = c2046i4;
                                i16 = i21;
                                i17 = i22;
                                i18 = i19;
                            }
                            j11 >>= i18;
                            i22 = i17 + 1;
                            i19 = i18;
                            c2046i4 = c2046i3;
                            i21 = i16;
                            c11 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        c2046i2 = c2046i4;
                        if (i21 != i19) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        c2046i2 = c2046i4;
                    }
                    if (i20 == length) {
                        break;
                    }
                    i20++;
                    objArr7 = objArr5;
                    c2046i4 = c2046i2;
                    c11 = 7;
                    j10 = -9187201950435737472L;
                    i19 = 8;
                }
            }
        } else {
            C2046I c2046i5 = c2046i4;
            for (Object obj2 : set) {
                if (obj2 instanceof C0505n0) {
                    ((C0505n0) obj2).c(null);
                    c2046i = c2046i5;
                } else {
                    b(obj2, z8);
                    c2046i = c2046i5;
                    Object g2 = c2046i.g(obj2);
                    if (g2 != null) {
                        if (g2 instanceof C2047J) {
                            C2047J c2047j3 = (C2047J) g2;
                            Object[] objArr9 = c2047j3.f24610b;
                            long[] jArr9 = c2047j3.f24609a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j13 = jArr9[i7];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i7 - length3)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j13 & 255) < 128) {
                                                b((C) objArr9[(i7 << 3) + i27], z8);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        }
                                    }
                                    i7 = i7 != length3 ? i7 + 1 : 0;
                                }
                            }
                        } else {
                            b((C) g2, z8);
                        }
                    }
                }
                c2046i5 = c2046i;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        C2046I c2046i6 = this.f8534u;
        C2047J c2047j4 = this.f8535v;
        if (z8) {
            C2047J c2047j5 = this.f8536w;
            if (c2047j5.h()) {
                long[] jArr10 = c2046i6.f24603a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i28 = 0;
                    while (true) {
                        long j14 = jArr10[i28];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i29 = 8 - ((~(i28 - length4)) >>> 31);
                            int i30 = 0;
                            while (i30 < i29) {
                                if ((j14 & 255) < 128) {
                                    int i31 = (i28 << 3) + i30;
                                    Object obj3 = c2046i6.f24604b[i31];
                                    Object obj4 = c2046i6.f24605c[i31];
                                    if (obj4 instanceof C2047J) {
                                        kotlin.jvm.internal.l.c(obj4, str6);
                                        C2047J c2047j6 = (C2047J) obj4;
                                        Object[] objArr10 = c2047j6.f24610b;
                                        long[] jArr11 = c2047j6.f24609a;
                                        jArr4 = jArr10;
                                        int length5 = jArr11.length - 2;
                                        str5 = str6;
                                        i14 = length4;
                                        i15 = i28;
                                        if (length5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                long j15 = jArr11[i32];
                                                j = j14;
                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j15 & 255) < 128) {
                                                            jArr6 = jArr11;
                                                            int i35 = (i32 << 3) + i34;
                                                            objArr4 = objArr10;
                                                            C0505n0 c0505n0 = (C0505n0) objArr10[i35];
                                                            if (c2047j5.c(c0505n0) || c2047j4.c(c0505n0)) {
                                                                c2047j6.m(i35);
                                                            }
                                                        } else {
                                                            jArr6 = jArr11;
                                                            objArr4 = objArr10;
                                                        }
                                                        j15 >>= 8;
                                                        i34++;
                                                        jArr11 = jArr6;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                }
                                                if (i32 == length5) {
                                                    break;
                                                }
                                                i32++;
                                                j14 = j;
                                                jArr11 = jArr5;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j = j14;
                                        }
                                        z10 = c2047j6.g();
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr10;
                                        i14 = length4;
                                        i15 = i28;
                                        j = j14;
                                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C0505n0 c0505n02 = (C0505n0) obj4;
                                        z10 = c2047j5.c(c0505n02) || c2047j4.c(c0505n02);
                                    }
                                    if (z10) {
                                        c2046i6.k(i31);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr10;
                                    i14 = length4;
                                    i15 = i28;
                                    j = j14;
                                }
                                j14 = j >> 8;
                                i30++;
                                length4 = i14;
                                jArr10 = jArr4;
                                str6 = str5;
                                i28 = i15;
                            }
                            str4 = str6;
                            jArr3 = jArr10;
                            int i36 = length4;
                            int i37 = i28;
                            if (i29 != 8) {
                                break;
                            }
                            length4 = i36;
                            i13 = i37;
                        } else {
                            str4 = str6;
                            jArr3 = jArr10;
                            i13 = i28;
                        }
                        if (i13 == length4) {
                            break;
                        }
                        i28 = i13 + 1;
                        jArr10 = jArr3;
                        str6 = str4;
                    }
                }
                c2047j5.b();
                h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (c2047j4.h()) {
            long[] jArr12 = c2046i6.f24603a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i38 = 0;
                while (true) {
                    long j16 = jArr12[i38];
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i39 = 8 - ((~(i38 - length6)) >>> 31);
                        int i40 = 0;
                        while (i40 < i39) {
                            if ((j16 & 255) < 128) {
                                int i41 = (i38 << 3) + i40;
                                Object obj5 = c2046i6.f24604b[i41];
                                Object obj6 = c2046i6.f24605c[i41];
                                if (obj6 instanceof C2047J) {
                                    String str8 = str7;
                                    kotlin.jvm.internal.l.c(obj6, str8);
                                    C2047J c2047j7 = (C2047J) obj6;
                                    Object[] objArr11 = c2047j7.f24610b;
                                    long[] jArr13 = c2047j7.f24609a;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    i10 = length6;
                                    i12 = i38;
                                    if (length7 >= 0) {
                                        int i42 = 0;
                                        while (true) {
                                            long j17 = jArr13[i42];
                                            long[] jArr14 = jArr13;
                                            i11 = i39;
                                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i43 = 8 - ((~(i42 - length7)) >>> 31);
                                                int i44 = 0;
                                                while (i44 < i43) {
                                                    if ((j17 & 255) < 128) {
                                                        str3 = str8;
                                                        int i45 = (i42 << 3) + i44;
                                                        objArr2 = objArr11;
                                                        if (c2047j4.c((C0505n0) objArr11[i45])) {
                                                            c2047j7.m(i45);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j17 >>= 8;
                                                    i44++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i43 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i42 == length7) {
                                                break;
                                            }
                                            i42++;
                                            i39 = i11;
                                            jArr13 = jArr14;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i11 = i39;
                                    }
                                    c10 = c2047j7.g();
                                } else {
                                    jArr2 = jArr12;
                                    i10 = length6;
                                    i11 = i39;
                                    str2 = str7;
                                    i12 = i38;
                                    kotlin.jvm.internal.l.c(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    c10 = c2047j4.c((C0505n0) obj6);
                                }
                                if (c10) {
                                    c2046i6.k(i41);
                                }
                            } else {
                                jArr2 = jArr12;
                                i10 = length6;
                                i11 = i39;
                                str2 = str7;
                                i12 = i38;
                            }
                            j16 >>= 8;
                            i40++;
                            length6 = i10;
                            jArr12 = jArr2;
                            i38 = i12;
                            i39 = i11;
                            str7 = str2;
                        }
                        jArr = jArr12;
                        int i46 = length6;
                        str = str7;
                        int i47 = i38;
                        if (i39 != 8) {
                            break;
                        }
                        length6 = i46;
                        i38 = i47;
                    } else {
                        jArr = jArr12;
                        str = str7;
                    }
                    if (i38 == length6) {
                        break;
                    }
                    i38++;
                    jArr12 = jArr;
                    str7 = str;
                }
            }
            h();
            c2047j4.b();
        }
    }

    public final void d() {
        synchronized (this.f8531d) {
            try {
                e(this.f8538y);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f8532e.f24626a.g()) {
                            u.L l10 = this.f8532e;
                            new ArrayList();
                            if (!l10.f24626a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    W.c cVar = new W.c(l10);
                                    while (((Zb.h) cVar.f10248b).hasNext()) {
                                        v0 v0Var = (v0) ((Zb.h) cVar.f10248b).next();
                                        cVar.remove();
                                        v0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        a();
                        throw e2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0524a c0524a) {
        C0524a c0524a2;
        Y.k kVar;
        C0524a c0524a3;
        Y.k kVar2;
        C0524a c0524a4;
        long[] jArr;
        int i7;
        C0524a c0524a5;
        Y.k kVar3;
        long[] jArr2;
        int i10;
        int i11;
        char c10;
        long j;
        int i12;
        boolean z8;
        long[] jArr3;
        C0524a c0524a6 = this.f8539z;
        Y.k kVar4 = new Y.k(this.f8532e);
        try {
            if (c0524a.f8745f.L()) {
                if (c0524a6.f8745f.L()) {
                    kVar4.e();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                A0.G0 g02 = this.f8529b;
                C0 y10 = this.f8533f.y();
                int i13 = 0;
                try {
                    c0524a.J(g02, y10, kVar4);
                    y10.e(true);
                    g02.M();
                    Trace.endSection();
                    kVar4.f();
                    S.e eVar = (S.e) kVar4.f11058e;
                    if (eVar.f8961c != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            Object[] objArr = eVar.f8959a;
                            int i14 = eVar.f8961c;
                            for (int i15 = 0; i15 < i14; i15++) {
                                ((Rb.a) objArr[i15]).invoke();
                            }
                            eVar.g();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.f8522C) {
                        try {
                            try {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.f8522C = false;
                                    C2046I c2046i = this.f8534u;
                                    long[] jArr4 = c2046i.f24603a;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i16 = 0;
                                        while (true) {
                                            long j10 = jArr4[i16];
                                            char c11 = 7;
                                            long j11 = -9187201950435737472L;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i17 = 8;
                                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                                int i19 = i13;
                                                while (i19 < i18) {
                                                    if ((j10 & 255) < 128) {
                                                        int i20 = (i16 << 3) + i19;
                                                        Object obj = c2046i.f24604b[i20];
                                                        Object obj2 = c2046i.f24605c[i20];
                                                        if (obj2 instanceof C2047J) {
                                                            kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                            C2047J c2047j = (C2047J) obj2;
                                                            Object[] objArr2 = c2047j.f24610b;
                                                            long[] jArr5 = c2047j.f24609a;
                                                            int length2 = jArr5.length - 2;
                                                            c0524a5 = c0524a6;
                                                            kVar3 = kVar4;
                                                            if (length2 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j12 = jArr5[i21];
                                                                        i10 = length;
                                                                        i11 = i16;
                                                                        c10 = 7;
                                                                        j = -9187201950435737472L;
                                                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                            int i23 = 0;
                                                                            while (i23 < i22) {
                                                                                if ((j12 & 255) < 128) {
                                                                                    jArr3 = jArr4;
                                                                                    int i24 = (i21 << 3) + i23;
                                                                                    if (!((C0505n0) objArr2[i24]).b()) {
                                                                                        c2047j.m(i24);
                                                                                    }
                                                                                } else {
                                                                                    jArr3 = jArr4;
                                                                                }
                                                                                j12 >>= 8;
                                                                                i23++;
                                                                                jArr4 = jArr3;
                                                                            }
                                                                            jArr2 = jArr4;
                                                                            if (i22 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr2 = jArr4;
                                                                        }
                                                                        if (i21 == length2) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        length = i10;
                                                                        i16 = i11;
                                                                        jArr4 = jArr2;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        Trace.endSection();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                i10 = length;
                                                                i11 = i16;
                                                                j = -9187201950435737472L;
                                                                c10 = 7;
                                                            }
                                                            z8 = c2047j.g();
                                                        } else {
                                                            c0524a5 = c0524a6;
                                                            kVar3 = kVar4;
                                                            jArr2 = jArr4;
                                                            i10 = length;
                                                            i11 = i16;
                                                            c10 = c11;
                                                            j = -9187201950435737472L;
                                                            kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                            z8 = !((C0505n0) obj2).b();
                                                        }
                                                        if (z8) {
                                                            c2046i.k(i20);
                                                        }
                                                        i12 = 8;
                                                    } else {
                                                        c0524a5 = c0524a6;
                                                        kVar3 = kVar4;
                                                        jArr2 = jArr4;
                                                        i10 = length;
                                                        i11 = i16;
                                                        c10 = c11;
                                                        j = j11;
                                                        i12 = i17;
                                                    }
                                                    j10 >>= i12;
                                                    i19++;
                                                    i17 = i12;
                                                    j11 = j;
                                                    c11 = c10;
                                                    kVar4 = kVar3;
                                                    c0524a6 = c0524a5;
                                                    length = i10;
                                                    i16 = i11;
                                                    jArr4 = jArr2;
                                                }
                                                c0524a3 = c0524a6;
                                                kVar2 = kVar4;
                                                jArr = jArr4;
                                                int i25 = length;
                                                int i26 = i16;
                                                if (i18 != i17) {
                                                    break;
                                                }
                                                length = i25;
                                                i7 = i26;
                                            } else {
                                                c0524a3 = c0524a6;
                                                kVar2 = kVar4;
                                                jArr = jArr4;
                                                i7 = i16;
                                            }
                                            if (i7 == length) {
                                                break;
                                            }
                                            i16 = i7 + 1;
                                            kVar4 = kVar2;
                                            c0524a6 = c0524a3;
                                            jArr4 = jArr;
                                            i13 = 0;
                                        }
                                    } else {
                                        c0524a3 = c0524a6;
                                        kVar2 = kVar4;
                                    }
                                    h();
                                    Trace.endSection();
                                    c0524a4 = c0524a3;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                kVar = kVar4;
                                c0524a2 = c0524a6;
                                if (c0524a2.f8745f.L()) {
                                    kVar.e();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c0524a2 = c0524a6;
                            if (c0524a2.f8745f.L()) {
                            }
                            throw th;
                        }
                    } else {
                        kVar2 = kVar4;
                        c0524a4 = c0524a6;
                    }
                    if (c0524a4.f8745f.L()) {
                        kVar2.e();
                    }
                } catch (Throwable th6) {
                    c0524a2 = c0524a6;
                    kVar = kVar4;
                    try {
                        y10.e(false);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        try {
                            Trace.endSection();
                            throw th;
                        } catch (Throwable th8) {
                            th = th8;
                            if (c0524a2.f8745f.L()) {
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c0524a2 = c0524a6;
                kVar = kVar4;
            }
        } catch (Throwable th10) {
            th = th10;
            c0524a2 = c0524a6;
            kVar = kVar4;
        }
    }

    public final void f() {
        synchronized (this.f8531d) {
            try {
                if (this.f8539z.f8745f.M()) {
                    e(this.f8539z);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f8532e.f24626a.g()) {
                            u.L l10 = this.f8532e;
                            new ArrayList();
                            if (!l10.f24626a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    W.c cVar = new W.c(l10);
                                    while (((Zb.h) cVar.f10248b).hasNext()) {
                                        v0 v0Var = (v0) ((Zb.h) cVar.f10248b).next();
                                        cVar.remove();
                                        v0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        a();
                        throw e2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f8531d) {
            try {
                this.f8526G.f8468u = null;
                if (!this.f8532e.f24626a.g()) {
                    u.L l10 = this.f8532e;
                    new ArrayList();
                    if (!l10.f24626a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            W.c cVar = new W.c(l10);
                            while (((Zb.h) cVar.f10248b).hasNext()) {
                                v0 v0Var = (v0) ((Zb.h) cVar.f10248b).next();
                                cVar.remove();
                                v0Var.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f8532e.f24626a.g()) {
                            u.L l11 = this.f8532e;
                            new ArrayList();
                            if (!l11.f24626a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    W.c cVar2 = new W.c(l11);
                                    while (((Zb.h) cVar2.f10248b).hasNext()) {
                                        v0 v0Var2 = (v0) ((Zb.h) cVar2.f10248b).next();
                                        cVar2.remove();
                                        v0Var2.c();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        a();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long[] jArr;
        int i7;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        boolean z8;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        C2046I c2046i = this.f8537x;
        long[] jArr5 = c2046i.f24603a;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j10 = jArr5[i14];
                if ((((~j10) << c10) & j10 & j) != j) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            Object obj = c2046i.f24604b[i17];
                            Object obj2 = c2046i.f24605c[i17];
                            boolean z10 = obj2 instanceof C2047J;
                            C2046I c2046i2 = this.f8534u;
                            if (z10) {
                                kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                C2047J c2047j = (C2047J) obj2;
                                Object[] objArr2 = c2047j.f24610b;
                                long[] jArr6 = c2047j.f24609a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i10 = length;
                                if (length2 >= 0) {
                                    int i18 = 0;
                                    while (true) {
                                        long j11 = jArr6[i18];
                                        i11 = i14;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                int i21 = i20;
                                                Object[] objArr4 = objArr3;
                                                if ((j11 & 255) < 128) {
                                                    int i22 = (i18 << 3) + i21;
                                                    jArr4 = jArr6;
                                                    if (!c2046i2.c((C) objArr4[i22])) {
                                                        c2047j.m(i22);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j11 >>= 8;
                                                i20 = i21 + 1;
                                                objArr3 = objArr4;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                            if (i19 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        objArr2 = objArr;
                                        i14 = i11;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i11 = i14;
                                }
                                z8 = c2047j.g();
                            } else {
                                jArr2 = jArr5;
                                i10 = length;
                                i11 = i14;
                                kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z8 = !c2046i2.c((C) obj2);
                            }
                            if (z8) {
                                c2046i.k(i17);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr5;
                            i10 = length;
                            i11 = i14;
                            i12 = i13;
                        }
                        j10 >>= i12;
                        i16++;
                        i13 = i12;
                        jArr5 = jArr2;
                        length = i10;
                        i14 = i11;
                    }
                    jArr = jArr5;
                    int i23 = length;
                    int i24 = i14;
                    if (i15 != i13) {
                        break;
                    }
                    length = i23;
                    i7 = i24;
                } else {
                    jArr = jArr5;
                    i7 = i14;
                }
                if (i7 == length) {
                    break;
                }
                i14 = i7 + 1;
                jArr5 = jArr;
                c10 = 7;
                j = -9187201950435737472L;
                i13 = 8;
            }
        }
        C2047J c2047j2 = this.f8536w;
        if (!c2047j2.h()) {
            return;
        }
        Object[] objArr5 = c2047j2.f24610b;
        long[] jArr7 = c2047j2.f24609a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j12 = jArr7[i25];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j12 & 255) < 128) {
                        int i28 = (i25 << 3) + i27;
                        if (!(((C0505n0) objArr5[i28]).g != null)) {
                            c2047j2.m(i28);
                        }
                    }
                    j12 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    public final void i(Y.e eVar) {
        try {
            synchronized (this.f8531d) {
                m();
                C2046I c2046i = this.f8521B;
                this.f8521B = Q5.e.q();
                try {
                    u();
                    C0506o c0506o = this.f8526G;
                    if (!c0506o.f8455e.f8745f.L()) {
                        AbstractC0508p.c("Expected applyChanges() to have been called");
                    }
                    c0506o.n(c2046i, eVar);
                } catch (Exception e2) {
                    this.f8521B = c2046i;
                    throw e2;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f8532e.f24626a.g()) {
                    u.L l10 = this.f8532e;
                    new ArrayList();
                    if (!l10.f24626a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            W.c cVar = new W.c(l10);
                            while (((Zb.h) cVar.f10248b).hasNext()) {
                                v0 v0Var = (v0) ((Zb.h) cVar.f10248b).next();
                                cVar.remove();
                                v0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e10) {
                a();
                throw e10;
            }
        }
    }

    public final void j(Y.e eVar) {
        if (this.f8527H) {
            AbstractC0495i0.b("The composition is disposed");
        }
        this.f8528a.a(this, eVar);
    }

    public final void k() {
        synchronized (this.f8531d) {
            try {
                boolean z8 = this.f8533f.f8587b > 0;
                try {
                    if (!z8) {
                        if (!this.f8532e.f24626a.g()) {
                        }
                        this.f8534u.a();
                        this.f8537x.a();
                        this.f8521B.a();
                        this.f8538y.f8745f.J();
                        this.f8539z.f8745f.J();
                        C0506o c0506o = this.f8526G;
                        c0506o.f8438D.clear();
                        c0506o.f8465r.clear();
                        c0506o.f8455e.f8745f.J();
                        c0506o.f8468u = null;
                    }
                    Y.k kVar = new Y.k(this.f8532e);
                    if (z8) {
                        C0 y10 = this.f8533f.y();
                        try {
                            AbstractC0508p.e(y10, kVar);
                            y10.e(true);
                            this.f8529b.M();
                            kVar.f();
                        } catch (Throwable th) {
                            y10.e(false);
                            throw th;
                        }
                    }
                    kVar.e();
                    Trace.endSection();
                    this.f8534u.a();
                    this.f8537x.a();
                    this.f8521B.a();
                    this.f8538y.f8745f.J();
                    this.f8539z.f8745f.J();
                    C0506o c0506o2 = this.f8526G;
                    c0506o2.f8438D.clear();
                    c0506o2.f8465r.clear();
                    c0506o2.f8455e.f8745f.J();
                    c0506o2.f8468u = null;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f8531d) {
            try {
                if (this.f8526G.f8439E) {
                    AbstractC0495i0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f8527H) {
                    this.f8527H = true;
                    Y.e eVar = AbstractC0492h.f8405b;
                    C0524a c0524a = this.f8526G.f8445K;
                    if (c0524a != null) {
                        e(c0524a);
                    }
                    boolean z8 = this.f8533f.f8587b > 0;
                    if (z8 || !this.f8532e.f24626a.g()) {
                        Y.k kVar = new Y.k(this.f8532e);
                        if (z8) {
                            C0 y10 = this.f8533f.y();
                            try {
                                AbstractC0508p.g(y10, kVar);
                                y10.e(true);
                                this.f8529b.D();
                                this.f8529b.M();
                                kVar.f();
                            } catch (Throwable th) {
                                y10.e(false);
                                throw th;
                            }
                        }
                        kVar.e();
                    }
                    C0506o c0506o = this.f8526G;
                    c0506o.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0506o.f8452b.o(c0506o);
                        c0506o.f8438D.clear();
                        c0506o.f8465r.clear();
                        c0506o.f8455e.f8745f.J();
                        c0506o.f8468u = null;
                        c0506o.f8451a.D();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f8528a.p(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f8530c;
        Object obj = C0480b.f8375a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0508p.d("pending composition has not been applied");
                throw new Db.d(0);
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0508p.d("corrupt pendingModifications drain: " + atomicReference);
                throw new Db.d(0);
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f8530c;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.l.a(andSet, C0480b.f8375a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC0508p.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new Db.d(0);
        }
        AbstractC0508p.d("corrupt pendingModifications drain: " + atomicReference);
        throw new Db.d(0);
    }

    public final void o() {
        AtomicReference atomicReference = this.f8530c;
        Object andSet = atomicReference.getAndSet(Eb.x.f3893a);
        if (kotlin.jvm.internal.l.a(andSet, C0480b.f8375a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0508p.d("corrupt pendingModifications drain: " + atomicReference);
            throw new Db.d(0);
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((V) ((Db.j) arrayList.get(0)).f3354a).getClass();
            throw null;
        }
        try {
            C0506o c0506o = this.f8526G;
            c0506o.getClass();
            try {
                c0506o.y(arrayList);
                c0506o.j();
            } catch (Throwable th) {
                c0506o.a();
                throw th;
            }
        } catch (Throwable th2) {
            u.L l10 = this.f8532e;
            try {
                if (!l10.f24626a.g()) {
                    new ArrayList();
                    if (!l10.f24626a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            W.c cVar = new W.c(l10);
                            Zb.h hVar = (Zb.h) cVar.f10248b;
                            while (hVar.hasNext()) {
                                v0 v0Var = (v0) hVar.next();
                                cVar.remove();
                                v0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e2) {
                a();
                throw e2;
            }
        }
    }

    public final M q(C0505n0 c0505n0, Object obj) {
        C0517u c0517u;
        int i7 = c0505n0.f8429a;
        if ((i7 & 2) != 0) {
            c0505n0.f8429a = i7 | 4;
        }
        C0478a c0478a = c0505n0.f8431c;
        if (c0478a == null || !c0478a.a()) {
            return M.f8329a;
        }
        if (this.f8533f.z(c0478a)) {
            return c0505n0.f8432d != null ? s(c0505n0, c0478a, obj) : M.f8329a;
        }
        synchronized (this.f8531d) {
            c0517u = this.f8523D;
        }
        if (c0517u != null) {
            C0506o c0506o = c0517u.f8526G;
            if (c0506o.f8439E && c0506o.Y(c0505n0, obj)) {
                return M.f8332d;
            }
        }
        return M.f8329a;
    }

    public final void r() {
        C0517u c0517u;
        synchronized (this.f8531d) {
            try {
                for (Object obj : this.f8533f.f8588c) {
                    C0505n0 c0505n0 = obj instanceof C0505n0 ? (C0505n0) obj : null;
                    if (c0505n0 != null && (c0517u = c0505n0.f8430b) != null) {
                        c0517u.q(c0505n0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final M s(C0505n0 c0505n0, C0478a c0478a, Object obj) {
        C0517u c0517u;
        int i7;
        synchronized (this.f8531d) {
            try {
                C0517u c0517u2 = this.f8523D;
                if (c0517u2 != null) {
                    z0 z0Var = this.f8533f;
                    int i10 = this.f8524E;
                    if (z0Var.f8592u) {
                        AbstractC0508p.c("Writer is active");
                    }
                    if (i10 < 0 || i10 >= z0Var.f8587b) {
                        AbstractC0508p.c("Invalid group index");
                    }
                    if (z0Var.z(c0478a)) {
                        int i11 = z0Var.f8586a[(i10 * 5) + 3] + i10;
                        int i12 = c0478a.f8373a;
                        c0517u = (i10 <= i12 && i12 < i11) ? c0517u2 : null;
                    }
                    c0517u2 = null;
                }
                if (c0517u == null) {
                    C0506o c0506o = this.f8526G;
                    if (c0506o.f8439E && c0506o.Y(c0505n0, obj)) {
                        return M.f8332d;
                    }
                    u();
                    if (obj == null) {
                        this.f8521B.l(c0505n0, S.f8367e);
                    } else if (obj instanceof C) {
                        Object g = this.f8521B.g(c0505n0);
                        if (g != null) {
                            if (g instanceof C2047J) {
                                C2047J c2047j = (C2047J) g;
                                Object[] objArr = c2047j.f24610b;
                                long[] jArr = c2047j.f24609a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i13];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j & 255) >= 128) {
                                                    i7 = i14;
                                                } else {
                                                    if (objArr[(i13 << 3) + i16] == S.f8367e) {
                                                        break loop0;
                                                    }
                                                    i7 = 8;
                                                }
                                                j >>= i7;
                                                i16++;
                                                i14 = i7;
                                            }
                                            if (i15 != i14) {
                                                break;
                                            }
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            } else if (g == S.f8367e) {
                            }
                        }
                        Q5.e.c(this.f8521B, c0505n0, obj);
                    } else {
                        this.f8521B.l(c0505n0, S.f8367e);
                    }
                }
                if (c0517u != null) {
                    return c0517u.s(c0505n0, c0478a, obj);
                }
                this.f8528a.i(this);
                return this.f8526G.f8439E ? M.f8331c : M.f8330b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(Object obj) {
        Object g = this.f8534u.g(obj);
        if (g == null) {
            return;
        }
        boolean z8 = g instanceof C2047J;
        C2046I c2046i = this.f8520A;
        if (!z8) {
            C0505n0 c0505n0 = (C0505n0) g;
            if (c0505n0.c(obj) == M.f8332d) {
                Q5.e.c(c2046i, obj, c0505n0);
                return;
            }
            return;
        }
        C2047J c2047j = (C2047J) g;
        Object[] objArr = c2047j.f24610b;
        long[] jArr = c2047j.f24609a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        C0505n0 c0505n02 = (C0505n0) objArr[(i7 << 3) + i11];
                        if (c0505n02.c(obj) == M.f8332d) {
                            Q5.e.c(c2046i, obj, c0505n02);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void u() {
        this.f8525F.getClass();
        this.f8528a.getClass();
        kotlin.jvm.internal.l.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(Set set) {
        boolean z8 = set instanceof S.h;
        C2046I c2046i = this.f8537x;
        C2046I c2046i2 = this.f8534u;
        if (z8) {
            C2047J c2047j = ((S.h) set).f8972a;
            Object[] objArr = c2047j.f24610b;
            long[] jArr = c2047j.f24609a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                loop0: while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i7 << 3) + i11];
                                if (c2046i2.c(obj) || c2046i.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (c2046i2.c(obj2) || c2046i.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean B10;
        synchronized (this.f8531d) {
            try {
                m();
                try {
                    C2046I c2046i = this.f8521B;
                    this.f8521B = Q5.e.q();
                    try {
                        u();
                        B10 = this.f8526G.B(c2046i);
                        if (!B10) {
                            n();
                        }
                    } catch (Exception e2) {
                        this.f8521B = c2046i;
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f8532e.f24626a.g()) {
                            u.L l10 = this.f8532e;
                            new ArrayList();
                            if (!l10.f24626a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    W.c cVar = new W.c(l10);
                                    while (((Zb.h) cVar.f10248b).hasNext()) {
                                        v0 v0Var = (v0) ((Zb.h) cVar.f10248b).next();
                                        cVar.remove();
                                        v0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        a();
                        throw e10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return B10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void x(S.h hVar) {
        S.h hVar2;
        while (true) {
            Object obj = this.f8530c.get();
            if (obj == null ? true : obj.equals(C0480b.f8375a)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f8530c).toString());
                }
                kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                kotlin.jvm.internal.l.e(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = hVar;
                hVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f8530c;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f8531d) {
                    n();
                }
                return;
            }
            return;
        }
    }

    public final void y(Object obj) {
        C0505n0 v10;
        boolean z8;
        boolean z10;
        int i7;
        int i10;
        C0506o c0506o = this.f8526G;
        if (c0506o.f8473z <= 0 && (v10 = c0506o.v()) != null) {
            boolean z11 = true;
            int i11 = v10.f8429a | 1;
            v10.f8429a = i11;
            if ((i11 & 32) == 0) {
                C2041D c2041d = v10.f8434f;
                if (c2041d == null) {
                    c2041d = new C2041D();
                    v10.f8434f = c2041d;
                }
                int i12 = v10.f8433e;
                int c10 = c2041d.c(obj);
                if (c10 < 0) {
                    c10 = ~c10;
                    i10 = -1;
                } else {
                    i10 = c2041d.f24580c[c10];
                }
                c2041d.f24579b[c10] = obj;
                c2041d.f24580c[c10] = i12;
                if (i10 == v10.f8433e) {
                    return;
                }
            }
            if (obj instanceof AbstractC0696w) {
                ((AbstractC0696w) obj).d(1);
            }
            Q5.e.c(this.f8534u, obj, v10);
            if (obj instanceof C) {
                C c11 = (C) obj;
                B f4 = c11.f();
                C2046I c2046i = this.f8537x;
                Q5.e.M(c2046i, obj);
                C2041D c2041d2 = f4.f8272e;
                Object[] objArr = c2041d2.f24579b;
                long[] jArr = c2041d2.f24578a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j & 255) < 128) {
                                    InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr[(i13 << 3) + i16];
                                    if (interfaceC0695v instanceof AbstractC0696w) {
                                        z10 = true;
                                        ((AbstractC0696w) interfaceC0695v).d(1);
                                    } else {
                                        z10 = true;
                                    }
                                    Q5.e.c(c2046i, interfaceC0695v, obj);
                                    i7 = 8;
                                } else {
                                    z10 = z11;
                                    i7 = i14;
                                }
                                j >>= i7;
                                i16++;
                                i14 = i7;
                                z11 = z10;
                            }
                            z8 = z11;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z8 = z11;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z11 = z8;
                    }
                }
                Object obj2 = f4.f8273f;
                C2046I c2046i2 = v10.g;
                if (c2046i2 == null) {
                    c2046i2 = new C2046I();
                    v10.g = c2046i2;
                }
                c2046i2.l(c11, obj2);
            }
        }
    }

    public final void z(Object obj) {
        synchronized (this.f8531d) {
            try {
                t(obj);
                Object g = this.f8537x.g(obj);
                if (g != null) {
                    if (g instanceof C2047J) {
                        C2047J c2047j = (C2047J) g;
                        Object[] objArr = c2047j.f24610b;
                        long[] jArr = c2047j.f24609a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j = jArr[i7];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j) < 128) {
                                            t((C) objArr[(i7 << 3) + i11]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    }
                                }
                                if (i7 == length) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        t((C) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
