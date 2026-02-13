package a0;

import A0.C0005a;
import A0.C0015f;
import Q.B;
import Q.C;
import Q.C0480b;
import Q.C0504n;
import java.util.HashMap;
import u.C2041D;
import u.C2046I;
import u.C2047J;

/* renamed from: a0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693t {

    /* renamed from: a, reason: collision with root package name */
    public final Rb.c f12417a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12418b;

    /* renamed from: c, reason: collision with root package name */
    public C2041D f12419c;
    public int j;

    /* renamed from: d, reason: collision with root package name */
    public int f12420d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final C2046I f12421e = Q5.e.q();

    /* renamed from: f, reason: collision with root package name */
    public final C2046I f12422f = new C2046I();
    public final C2047J g = new C2047J();

    /* renamed from: h, reason: collision with root package name */
    public final S.e f12423h = new S.e(new C[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0504n f12424i = new C0504n(this, 1);
    public final C2046I k = Q5.e.q();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f12425l = new HashMap();

    public C0693t(Rb.c cVar) {
        this.f12417a = cVar;
    }

    public final void a(Object obj, C0005a c0005a, Rb.a aVar) {
        long[] jArr;
        long[] jArr2;
        int i7;
        Object obj2 = this.f12418b;
        C2041D c2041d = this.f12419c;
        int i10 = this.f12420d;
        this.f12418b = obj;
        this.f12419c = (C2041D) this.f12422f.g(obj);
        if (this.f12420d == -1) {
            this.f12420d = Long.hashCode(AbstractC0688o.k().g());
        }
        C0504n c0504n = this.f12424i;
        S.e l10 = C0480b.l();
        try {
            l10.b(c0504n);
            AbstractC0692s.e(aVar, c0005a);
            l10.l(l10.f8961c - 1);
            Object obj3 = this.f12418b;
            kotlin.jvm.internal.l.b(obj3);
            int i11 = this.f12420d;
            C2041D c2041d2 = this.f12419c;
            if (c2041d2 != null) {
                long[] jArr3 = c2041d2.f24578a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j = jArr3[i12];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj4 = c2041d2.f24579b[i16];
                                    jArr2 = jArr3;
                                    boolean z8 = c2041d2.f24580c[i16] != i11;
                                    if (z8) {
                                        d(obj3, obj4);
                                    }
                                    if (z8) {
                                        c2041d2.f(i16);
                                    }
                                    i7 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i7 = i13;
                                }
                                j >>= i7;
                                i15++;
                                i13 = i7;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i14 != i13) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f12418b = obj2;
            this.f12419c = c2041d;
            this.f12420d = i10;
        } catch (Throwable th) {
            l10.l(l10.f8961c - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0693t.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i7, Object obj2, C2041D c2041d) {
        int i10;
        if (this.j > 0) {
            return;
        }
        int c10 = c2041d.c(obj);
        if (c10 < 0) {
            c10 = ~c10;
            i10 = -1;
        } else {
            i10 = c2041d.f24580c[c10];
        }
        c2041d.f24579b[c10] = obj;
        c2041d.f24580c[c10] = i7;
        if ((obj instanceof C) && i10 != i7) {
            B f4 = ((C) obj).f();
            this.f12425l.put(obj, f4.f8273f);
            C2041D c2041d2 = f4.f8272e;
            C2046I c2046i = this.k;
            Q5.e.M(c2046i, obj);
            Object[] objArr = c2041d2.f24579b;
            long[] jArr = c2041d2.f24578a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j = jArr[i11];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j & 255) < 128) {
                                InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr[(i11 << 3) + i13];
                                if (interfaceC0695v instanceof AbstractC0696w) {
                                    ((AbstractC0696w) interfaceC0695v).d(2);
                                }
                                Q5.e.c(c2046i, interfaceC0695v, obj);
                            }
                            j >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (i10 == -1) {
            if (obj instanceof AbstractC0696w) {
                ((AbstractC0696w) obj).d(2);
            }
            Q5.e.c(this.f12421e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C2046I c2046i = this.f12421e;
        Q5.e.L(c2046i, obj2, obj);
        if (!(obj2 instanceof C) || c2046i.c(obj2)) {
            return;
        }
        Q5.e.M(this.k, obj2);
        this.f12425l.remove(obj2);
    }

    public final void e() {
        C0015f c0015f;
        long[] jArr;
        int i7;
        C0015f c0015f2;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        char c10;
        long j;
        int i13;
        int i14;
        C0015f c0015f3 = C0015f.f209u;
        C2046I c2046i = this.f12422f;
        long[] jArr3 = c2046i.f24603a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr3[i15];
            char c11 = 7;
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j10 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj = c2046i.f24604b[i19];
                        C2041D c2041d = (C2041D) c2046i.f24605c[i19];
                        Boolean bool = (Boolean) c0015f3.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c2041d.f24579b;
                            int[] iArr = c2041d.f24580c;
                            long[] jArr4 = c2041d.f24578a;
                            int length2 = jArr4.length - 2;
                            c0015f2 = c0015f3;
                            jArr2 = jArr3;
                            i10 = length;
                            if (length2 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j12 = jArr4[i20];
                                    i12 = i17;
                                    long[] jArr5 = jArr4;
                                    c10 = 7;
                                    j = -9187201950435737472L;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j12 & 255) < 128) {
                                                int i23 = (i20 << 3) + i22;
                                                i14 = i15;
                                                Object obj2 = objArr[i23];
                                                int i24 = iArr[i23];
                                                d(obj, obj2);
                                            } else {
                                                i14 = i15;
                                            }
                                            j12 >>= 8;
                                            i22++;
                                            i15 = i14;
                                        }
                                        i11 = i15;
                                        if (i21 != 8) {
                                            break;
                                        }
                                    } else {
                                        i11 = i15;
                                    }
                                    if (i20 == length2) {
                                        break;
                                    }
                                    i20++;
                                    i17 = i12;
                                    jArr4 = jArr5;
                                    i15 = i11;
                                }
                            } else {
                                i11 = i15;
                                i12 = i17;
                                j = -9187201950435737472L;
                                c10 = 7;
                            }
                        } else {
                            c0015f2 = c0015f3;
                            jArr2 = jArr3;
                            i10 = length;
                            i11 = i15;
                            i12 = i17;
                            c10 = c11;
                            j = j11;
                        }
                        if (bool.booleanValue()) {
                            c2046i.k(i19);
                        }
                        i13 = 8;
                    } else {
                        c0015f2 = c0015f3;
                        jArr2 = jArr3;
                        i10 = length;
                        i11 = i15;
                        i12 = i17;
                        c10 = c11;
                        j = j11;
                        i13 = i16;
                    }
                    j10 >>= i13;
                    i18++;
                    i16 = i13;
                    j11 = j;
                    c11 = c10;
                    c0015f3 = c0015f2;
                    jArr3 = jArr2;
                    length = i10;
                    i17 = i12;
                    i15 = i11;
                }
                c0015f = c0015f3;
                jArr = jArr3;
                int i25 = length;
                int i26 = i15;
                if (i17 != i16) {
                    return;
                }
                length = i25;
                i7 = i26;
            } else {
                c0015f = c0015f3;
                jArr = jArr3;
                i7 = i15;
            }
            if (i7 == length) {
                return;
            }
            i15 = i7 + 1;
            c0015f3 = c0015f;
            jArr3 = jArr;
        }
    }
}
