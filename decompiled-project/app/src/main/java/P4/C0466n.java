package P4;

import A9.O0;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;
import java.util.HashSet;
import m4.C1558a0;
import m5.InterfaceC1615l;
import n5.AbstractC1705a;
import s4.C1980h;
import t8.C2034c;

/* renamed from: P4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466n implements A {

    /* renamed from: a, reason: collision with root package name */
    public final O0 f8111a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1615l f8112b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8113c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8114d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8115e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8116f;
    public final float g;

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.O0, java.lang.Object] */
    public C0466n(InterfaceC1615l interfaceC1615l, C1980h c1980h) {
        this.f8112b = interfaceC1615l;
        ?? obj = new Object();
        obj.f922a = c1980h;
        obj.f923b = new HashMap();
        obj.f924c = new HashSet();
        obj.f925d = new HashMap();
        this.f8111a = obj;
        if (interfaceC1615l != ((InterfaceC1615l) obj.f926e)) {
            obj.f926e = interfaceC1615l;
            ((HashMap) obj.f923b).clear();
            ((HashMap) obj.f925d).clear();
        }
        this.f8113c = -9223372036854775807L;
        this.f8114d = -9223372036854775807L;
        this.f8115e = -9223372036854775807L;
        this.f8116f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s4.h] */
    public C0466n(C2034c c2034c) {
        this(c2034c, new Object());
    }

    public static A b(Class cls, InterfaceC1615l interfaceC1615l) {
        try {
            return (A) cls.getConstructor(InterfaceC1615l.class).newInstance(interfaceC1615l);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    @Override // P4.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0453a a(C1558a0 c1558a0) {
        M6.q qVar;
        M6.q qVar2;
        M6.q c0465m;
        c1558a0.f20224b.getClass();
        m4.V v10 = c1558a0.f20224b;
        String scheme = v10.f20177a.getScheme();
        A a9 = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int H10 = n5.D.H(v10.f20177a, v10.f20178b);
        final O0 o02 = this.f8111a;
        HashMap hashMap = (HashMap) o02.f925d;
        A a10 = (A) hashMap.get(Integer.valueOf(H10));
        if (a10 != null) {
            a9 = a10;
        } else {
            HashMap hashMap2 = (HashMap) o02.f923b;
            if (hashMap2.containsKey(Integer.valueOf(H10))) {
                qVar = (M6.q) hashMap2.get(Integer.valueOf(H10));
            } else {
                final InterfaceC1615l interfaceC1615l = (InterfaceC1615l) o02.f926e;
                interfaceC1615l.getClass();
                M6.q qVar3 = null;
                if (H10 == 0) {
                    final Class asSubclass = DashMediaSource$Factory.class.asSubclass(A.class);
                    final int i7 = 0;
                    qVar2 = new M6.q() { // from class: P4.l
                        @Override // M6.q
                        public final Object get() {
                            switch (i7) {
                                case 0:
                                    return C0466n.b((Class) asSubclass, interfaceC1615l);
                                case 1:
                                    return C0466n.b((Class) asSubclass, interfaceC1615l);
                                case 2:
                                    return C0466n.b((Class) asSubclass, interfaceC1615l);
                                default:
                                    return new V(interfaceC1615l, (C1980h) ((O0) asSubclass).f922a);
                            }
                        }
                    };
                } else if (H10 == 1) {
                    final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(A.class);
                    final int i10 = 1;
                    qVar2 = new M6.q() { // from class: P4.l
                        @Override // M6.q
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return C0466n.b((Class) asSubclass2, interfaceC1615l);
                                case 1:
                                    return C0466n.b((Class) asSubclass2, interfaceC1615l);
                                case 2:
                                    return C0466n.b((Class) asSubclass2, interfaceC1615l);
                                default:
                                    return new V(interfaceC1615l, (C1980h) ((O0) asSubclass2).f922a);
                            }
                        }
                    };
                } else if (H10 != 2) {
                    if (H10 != 3) {
                        if (H10 == 4) {
                            final int i11 = 3;
                            c0465m = new M6.q() { // from class: P4.l
                                @Override // M6.q
                                public final Object get() {
                                    switch (i11) {
                                        case 0:
                                            return C0466n.b((Class) o02, interfaceC1615l);
                                        case 1:
                                            return C0466n.b((Class) o02, interfaceC1615l);
                                        case 2:
                                            return C0466n.b((Class) o02, interfaceC1615l);
                                        default:
                                            return new V(interfaceC1615l, (C1980h) ((O0) o02).f922a);
                                    }
                                }
                            };
                        }
                        hashMap2.put(Integer.valueOf(H10), qVar3);
                        if (qVar3 != null) {
                            ((HashSet) o02.f924c).add(Integer.valueOf(H10));
                        }
                        qVar = qVar3;
                    } else {
                        c0465m = new C0465m(RtspMediaSource$Factory.class.asSubclass(A.class), 0);
                    }
                    qVar3 = c0465m;
                    hashMap2.put(Integer.valueOf(H10), qVar3);
                    if (qVar3 != null) {
                    }
                    qVar = qVar3;
                } else {
                    final Class asSubclass3 = HlsMediaSource$Factory.class.asSubclass(A.class);
                    final int i12 = 2;
                    qVar2 = new M6.q() { // from class: P4.l
                        @Override // M6.q
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return C0466n.b((Class) asSubclass3, interfaceC1615l);
                                case 1:
                                    return C0466n.b((Class) asSubclass3, interfaceC1615l);
                                case 2:
                                    return C0466n.b((Class) asSubclass3, interfaceC1615l);
                                default:
                                    return new V(interfaceC1615l, (C1980h) ((O0) asSubclass3).f922a);
                            }
                        }
                    };
                }
                qVar3 = qVar2;
                hashMap2.put(Integer.valueOf(H10), qVar3);
                if (qVar3 != null) {
                }
                qVar = qVar3;
            }
            if (qVar != null) {
                a9 = (A) qVar.get();
                hashMap.put(Integer.valueOf(H10), a9);
            }
        }
        AbstractC1705a.o(a9, "No suitable media source factory found for content type: " + H10);
        m4.U u3 = c1558a0.f20225c;
        T4.t a11 = u3.a();
        if (u3.f20164a == -9223372036854775807L) {
            a11.f9310a = this.f8113c;
        }
        if (u3.f20167d == -3.4028235E38f) {
            a11.f9313d = this.f8116f;
        }
        if (u3.f20168e == -3.4028235E38f) {
            a11.f9314e = this.g;
        }
        if (u3.f20165b == -9223372036854775807L) {
            a11.f9311b = this.f8114d;
        }
        if (u3.f20166c == -9223372036854775807L) {
            a11.f9312c = this.f8115e;
        }
        m4.U a12 = a11.a();
        if (!a12.equals(u3)) {
            L7.j a13 = c1558a0.a();
            a13.f6363l = a12.a();
            c1558a0 = a13.b();
        }
        AbstractC0453a a14 = a9.a(c1558a0);
        m4.V v11 = c1558a0.f20224b;
        N6.H h10 = v11.f20183u;
        if (!h10.isEmpty()) {
            AbstractC0453a[] abstractC0453aArr = new AbstractC0453a[h10.size() + 1];
            int i13 = 0;
            abstractC0453aArr[0] = a14;
            while (i13 < h10.size()) {
                InterfaceC1615l interfaceC1615l2 = this.f8112b;
                interfaceC1615l2.getClass();
                int i14 = i13 + 1;
                abstractC0453aArr[i14] = new l0((m4.Z) h10.get(i13), interfaceC1615l2, new Y5.B(14));
                i13 = i14;
            }
            a14 = new N(abstractC0453aArr);
        }
        AbstractC0453a abstractC0453a = a14;
        m4.S s3 = c1558a0.f20227e;
        long j = s3.f20134a;
        long j10 = s3.f20135b;
        if (j != 0 || j10 != Long.MIN_VALUE || s3.f20137d) {
            abstractC0453a = new C0459g(abstractC0453a, n5.D.M(j), n5.D.M(j10), !s3.f20138e, s3.f20136c, s3.f20137d);
        }
        if (v11.f20180d != null) {
            AbstractC1705a.S("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        }
        return abstractC0453a;
    }
}
