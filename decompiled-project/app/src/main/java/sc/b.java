package sc;

import Db.q;
import Eb.B;
import Eb.o;
import H2.C0297k;
import Y5.C0660y;
import ac.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import rc.C;
import rc.C1964h;
import rc.F;
import rc.z;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24357a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24358b = new byte[0];

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = z.f24006b;
        z a9 = C0660y.a("/", false);
        LinkedHashMap I6 = B.I(new Db.j(a9, new g(a9, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (g gVar : o.n0(new C0297k(16), arrayList)) {
            if (((g) I6.put(gVar.f24372a, gVar)) == null) {
                while (true) {
                    z zVar = gVar.f24372a;
                    z d10 = zVar.d();
                    if (d10 != null) {
                        g gVar2 = (g) I6.get(d10);
                        if (gVar2 != null) {
                            gVar2.f24385q.add(zVar);
                            break;
                        }
                        g gVar3 = new g(d10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        I6.put(d10, gVar3);
                        gVar3.f24385q.add(zVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return I6;
    }

    public static final String c(int i7) {
        com.bumptech.glide.c.g(16);
        String num = Integer.toString(i7, 16);
        l.d(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    public static final g d(final C c10) {
        String str;
        long j;
        int T10 = c10.T();
        if (T10 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(T10));
        }
        c10.a0(4L);
        short W10 = c10.W();
        int i7 = W10 & 65535;
        if ((W10 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        int W11 = c10.W() & 65535;
        int W12 = c10.W() & 65535;
        int W13 = c10.W() & 65535;
        long T11 = c10.T() & 4294967295L;
        final ?? obj = new Object();
        obj.f19133a = c10.T() & 4294967295L;
        final ?? obj2 = new Object();
        obj2.f19133a = c10.T() & 4294967295L;
        int W14 = c10.W() & 65535;
        int W15 = c10.W() & 65535;
        int W16 = c10.W() & 65535;
        c10.a0(8L);
        final ?? obj3 = new Object();
        obj3.f19133a = c10.T() & 4294967295L;
        String X10 = c10.X(W14);
        if (ac.g.a0(X10, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (obj2.f19133a == 4294967295L) {
            j = 8;
            str = X10;
        } else {
            str = X10;
            j = 0;
        }
        if (obj.f19133a == 4294967295L) {
            j += 8;
        }
        if (obj3.f19133a == 4294967295L) {
            j += 8;
        }
        final long j10 = j;
        final ?? obj4 = new Object();
        final ?? obj5 = new Object();
        final ?? obj6 = new Object();
        final ?? obj7 = new Object();
        String str2 = str;
        e(c10, W15, new Rb.e() { // from class: sc.i
            @Override // Rb.e
            public final Object invoke(Object obj8, Object obj9) {
                int intValue = ((Integer) obj8).intValue();
                long longValue = ((Long) obj9).longValue();
                C c11 = c10;
                if (intValue == 1) {
                    r rVar = r.this;
                    if (rVar.f19130a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    rVar.f19130a = true;
                    if (longValue < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    u uVar = obj2;
                    long j11 = uVar.f19133a;
                    if (j11 == 4294967295L) {
                        j11 = c11.U();
                    }
                    uVar.f19133a = j11;
                    u uVar2 = obj;
                    uVar2.f19133a = uVar2.f19133a == 4294967295L ? c11.U() : 0L;
                    u uVar3 = obj3;
                    uVar3.f19133a = uVar3.f19133a == 4294967295L ? c11.U() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    c11.a0(4L);
                    b.e(c11, (int) (longValue - 4), new h(obj4, c11, obj5, obj6));
                }
                return q.f3365a;
            }
        });
        if (j10 > 0 && !obj7.f19130a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String X11 = c10.X(W16);
        String str3 = z.f24006b;
        return new g(C0660y.a("/", false).g(str2), n.S(str2, "/", false), X11, T11, obj.f19133a, obj2.f19133a, W11, obj3.f19133a, W13, W12, (Long) obj4.f19134a, (Long) obj5.f19134a, (Long) obj6.f19134a, 57344);
    }

    public static final void e(C c10, int i7, Rb.e eVar) {
        long j = i7;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int W10 = c10.W() & 65535;
            long W11 = c10.W() & 65535;
            long j10 = j - 4;
            if (j10 < W11) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c10.Z(W11);
            C1964h c1964h = c10.f23929b;
            long j11 = c1964h.f23966b;
            eVar.invoke(Integer.valueOf(W10), Long.valueOf(W11));
            long j12 = (c1964h.f23966b + W11) - j11;
            if (j12 < 0) {
                throw new IOException(h3.o.l(W10, "unsupported zip: too many bytes processed for "));
            }
            if (j12 > 0) {
                c1964h.f0(j12);
            }
            j = j10 - W11;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public static final g f(C c10, g gVar) {
        int T10 = c10.T();
        if (T10 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(T10));
        }
        c10.a0(2L);
        short W10 = c10.W();
        int i7 = W10 & 65535;
        if ((W10 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        c10.a0(18L);
        int W11 = c10.W() & 65535;
        c10.a0(c10.W() & 65535);
        if (gVar == null) {
            c10.a0(W11);
            return null;
        }
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        e(c10, W11, new h(c10, (v) obj, (v) obj2, (v) obj3));
        return new g(gVar.f24372a, gVar.f24373b, gVar.f24374c, gVar.f24375d, gVar.f24376e, gVar.f24377f, gVar.g, gVar.f24378h, gVar.f24379i, gVar.j, gVar.k, gVar.f24380l, gVar.f24381m, (Integer) obj.f19134a, (Integer) obj2.f19134a, (Integer) obj3.f19134a);
    }

    public static final int g(F f4, int i7) {
        int i10;
        l.e(f4, "<this>");
        int i11 = i7 + 1;
        int length = f4.f23940e.length;
        int[] iArr = f4.f23941f;
        l.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }
}
