package a0;

import Q.AbstractC0495i0;
import java.util.ArrayList;
import java.util.HashMap;
import u.C2047J;
import u.S;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0678e extends AbstractC0682i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12373n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final Rb.c f12374e;

    /* renamed from: f, reason: collision with root package name */
    public final Rb.c f12375f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public C2047J f12376h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f12377i;
    public C0686m j;
    public int[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f12378l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12379m;

    public C0678e(long j, C0686m c0686m, Rb.c cVar, Rb.c cVar2) {
        super(j, c0686m);
        this.f12374e = cVar;
        this.f12375f = cVar2;
        this.j = C0686m.f12397e;
        this.k = f12373n;
        this.f12378l = 1;
    }

    public final void A(long j) {
        synchronized (AbstractC0688o.f12405b) {
            this.j = this.j.z(j);
        }
    }

    public void B(C2047J c2047j) {
        this.f12376h = c2047j;
    }

    public C0678e C(Rb.c cVar, Rb.c cVar2) {
        C0679f c0679f;
        if (this.f12388c) {
            AbstractC0495i0.a("Cannot use a disposed snapshot");
        }
        if (this.f12379m && this.f12389d < 0) {
            AbstractC0495i0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = AbstractC0688o.f12405b;
        synchronized (obj) {
            long j = AbstractC0688o.f12407d;
            AbstractC0688o.f12407d = j + 1;
            AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(j);
            C0686m d10 = d();
            r(d10.z(j));
            c0679f = new C0679f(j, AbstractC0688o.e(d10, g() + 1, j), AbstractC0688o.l(cVar, e(), true), AbstractC0688o.b(cVar2, i()), this);
        }
        if (!this.f12379m && !this.f12388c) {
            long g = g();
            synchronized (obj) {
                long j10 = AbstractC0688o.f12407d;
                AbstractC0688o.f12407d = j10 + 1;
                s(j10);
                AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(g());
            }
            r(AbstractC0688o.e(d(), g + 1, g()));
        }
        return c0679f;
    }

    @Override // a0.AbstractC0682i
    public final void b() {
        AbstractC0688o.f12406c = AbstractC0688o.f12406c.o(g()).b(this.j);
    }

    @Override // a0.AbstractC0682i
    public void c() {
        if (this.f12388c) {
            return;
        }
        this.f12388c = true;
        synchronized (AbstractC0688o.f12405b) {
            o();
        }
        l();
    }

    @Override // a0.AbstractC0682i
    public boolean f() {
        return false;
    }

    @Override // a0.AbstractC0682i
    public int h() {
        return this.g;
    }

    @Override // a0.AbstractC0682i
    public Rb.c i() {
        return this.f12375f;
    }

    @Override // a0.AbstractC0682i
    public void k() {
        this.f12378l++;
    }

    @Override // a0.AbstractC0682i
    public void l() {
        if (this.f12378l <= 0) {
            AbstractC0495i0.a("no pending nested snapshots");
        }
        int i7 = this.f12378l - 1;
        this.f12378l = i7;
        if (i7 != 0 || this.f12379m) {
            return;
        }
        C2047J x2 = x();
        if (x2 != null) {
            if (this.f12379m) {
                AbstractC0495i0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x2.f24610b;
            long[] jArr = x2.f24609a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                for (AbstractC0697x b2 = ((InterfaceC0695v) objArr[(i10 << 3) + i12]).b(); b2 != null; b2 = b2.f12436b) {
                                    long j10 = b2.f12435a;
                                    if (j10 == g || Eb.o.V(this.j, Long.valueOf(j10))) {
                                        Q7.h hVar = AbstractC0688o.f12404a;
                                        b2.f12435a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        a();
    }

    @Override // a0.AbstractC0682i
    public void m() {
        if (this.f12379m || this.f12388c) {
            return;
        }
        v();
    }

    @Override // a0.AbstractC0682i
    public void n(InterfaceC0695v interfaceC0695v) {
        C2047J x2 = x();
        if (x2 == null) {
            int i7 = S.f24634a;
            x2 = new C2047J();
            B(x2);
        }
        x2.a(interfaceC0695v);
    }

    @Override // a0.AbstractC0682i
    public final void p() {
        int length = this.k.length;
        for (int i7 = 0; i7 < length; i7++) {
            AbstractC0688o.u(this.k[i7]);
        }
        o();
    }

    @Override // a0.AbstractC0682i
    public void t(int i7) {
        this.g = i7;
    }

    @Override // a0.AbstractC0682i
    public AbstractC0682i u(Rb.c cVar) {
        C0680g c0680g;
        if (this.f12388c) {
            AbstractC0495i0.a("Cannot use a disposed snapshot");
        }
        if (this.f12379m && this.f12389d < 0) {
            AbstractC0495i0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        boolean z8 = this instanceof C0677d;
        A(g());
        Object obj = AbstractC0688o.f12405b;
        synchronized (obj) {
            long j = AbstractC0688o.f12407d;
            AbstractC0688o.f12407d = j + 1;
            AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(j);
            c0680g = new C0680g(j, AbstractC0688o.e(d(), g + 1, j), AbstractC0688o.l(cVar, e(), true), this);
        }
        if (!this.f12379m && !this.f12388c) {
            long g2 = g();
            synchronized (obj) {
                long j10 = AbstractC0688o.f12407d;
                AbstractC0688o.f12407d = j10 + 1;
                s(j10);
                AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(g());
            }
            r(AbstractC0688o.e(d(), g2 + 1, g()));
        }
        return c0680g;
    }

    public final void v() {
        A(g());
        if (this.f12379m || this.f12388c) {
            return;
        }
        long g = g();
        synchronized (AbstractC0688o.f12405b) {
            long j = AbstractC0688o.f12407d;
            AbstractC0688o.f12407d = j + 1;
            s(j);
            AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(g());
        }
        r(AbstractC0688o.e(d(), g + 1, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5 A[LOOP:1: B:31:0x00f3->B:32:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0692s w() {
        HashMap hashMap;
        Eb.v vVar;
        C2047J c2047j;
        int size;
        int i7;
        C2047J x2 = x();
        if (x2 != null) {
            long j = AbstractC0688o.f12411i.f12387b;
            hashMap = AbstractC0688o.c(j, this, AbstractC0688o.f12406c.o(j));
        } else {
            hashMap = null;
        }
        Eb.v vVar2 = Eb.v.f3891a;
        synchronized (AbstractC0688o.f12405b) {
            try {
                AbstractC0688o.d(this);
                int i10 = 0;
                if (x2 != null && x2.f24612d != 0) {
                    C0677d c0677d = AbstractC0688o.f12411i;
                    AbstractC0692s z8 = z(AbstractC0688o.f12407d, x2, hashMap, AbstractC0688o.f12406c.o(c0677d.f12387b));
                    if (!z8.equals(C0684k.f12390b)) {
                        return z8;
                    }
                    b();
                    c2047j = c0677d.f12376h;
                    long j10 = c0677d.f12387b;
                    AbstractC0688o.f12406c.o(j10);
                    long j11 = AbstractC0688o.f12407d;
                    AbstractC0688o.f12407d = 1 + j11;
                    C0686m o10 = AbstractC0688o.f12406c.o(j10);
                    AbstractC0688o.f12406c = o10;
                    c0677d.f12387b = j11;
                    c0677d.f12386a = o10;
                    c0677d.g = 0;
                    c0677d.f12376h = null;
                    c0677d.o();
                    AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(j11);
                    B(null);
                    c0677d.f12376h = null;
                    vVar = AbstractC0688o.g;
                    this.f12379m = true;
                    if (c2047j != null) {
                        S.h hVar = new S.h(c2047j);
                        if (!c2047j.g()) {
                            int size2 = vVar.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((Rb.e) vVar.get(i11)).invoke(hVar, this);
                            }
                        }
                    }
                    if (x2 != null && x2.h()) {
                        S.h hVar2 = new S.h(x2);
                        size = vVar.size();
                        for (i7 = 0; i7 < size; i7++) {
                            ((Rb.e) vVar.get(i7)).invoke(hVar2, this);
                        }
                    }
                    synchronized (AbstractC0688o.f12405b) {
                        try {
                            p();
                            AbstractC0688o.g();
                            if (c2047j != null) {
                                Object[] objArr = c2047j.f24610b;
                                long[] jArr = c2047j.f24609a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    while (true) {
                                        long j12 = jArr[i10];
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((j12 & 255) < 128) {
                                                    AbstractC0688o.q((InterfaceC0695v) objArr[(i10 << 3) + i13]);
                                                }
                                                j12 >>= 8;
                                            }
                                            if (i12 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                            if (x2 != null) {
                                Object[] objArr2 = x2.f24610b;
                                long[] jArr2 = x2.f24609a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j13 = jArr2[i14];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                if ((j13 & 255) < 128) {
                                                    AbstractC0688o.q((InterfaceC0695v) objArr2[(i14 << 3) + i16]);
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i15 != 8) {
                                                break;
                                            }
                                        }
                                        if (i14 == length2) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                            ArrayList arrayList = this.f12377i;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i17 = 0; i17 < size3; i17++) {
                                    AbstractC0688o.q((InterfaceC0695v) arrayList.get(i17));
                                }
                            }
                            this.f12377i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return C0684k.f12390b;
                }
                b();
                C0677d c0677d2 = AbstractC0688o.f12411i;
                C2047J c2047j2 = c0677d2.f12376h;
                long j14 = c0677d2.f12387b;
                AbstractC0688o.f12406c.o(j14);
                long j15 = AbstractC0688o.f12407d;
                AbstractC0688o.f12407d = 1 + j15;
                C0686m o11 = AbstractC0688o.f12406c.o(j14);
                AbstractC0688o.f12406c = o11;
                c0677d2.f12387b = j15;
                c0677d2.f12386a = o11;
                c0677d2.g = 0;
                c0677d2.f12376h = null;
                c0677d2.o();
                AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(j15);
                if (c2047j2 == null || !c2047j2.h()) {
                    vVar = vVar2;
                    c2047j = null;
                } else {
                    vVar = AbstractC0688o.g;
                    c2047j = c2047j2;
                }
                this.f12379m = true;
                if (c2047j != null) {
                }
                if (x2 != null) {
                    S.h hVar22 = new S.h(x2);
                    size = vVar.size();
                    while (i7 < size) {
                    }
                }
                synchronized (AbstractC0688o.f12405b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C2047J x() {
        return this.f12376h;
    }

    @Override // a0.AbstractC0682i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Rb.c e() {
        return this.f12374e;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [a0.s, java.lang.Object] */
    public final AbstractC0692s z(long j, C2047J c2047j, HashMap hashMap, C0686m c0686m) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0686m c0686m2;
        Object[] objArr;
        long[] jArr;
        C0686m c0686m3;
        Object[] objArr2;
        long[] jArr2;
        int i7;
        int i10;
        AbstractC0697x s3;
        AbstractC0697x t5;
        long j10 = j;
        C0686m y10 = d().z(g()).y(this.j);
        Object[] objArr3 = c2047j.f24610b;
        long[] jArr3 = c2047j.f24609a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j11 = jArr3[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            AbstractC0697x b2 = interfaceC0695v.b();
                            AbstractC0697x s10 = AbstractC0688o.s(b2, j10, c0686m);
                            if (s10 == null || (s3 = AbstractC0688o.s(b2, g(), y10)) == null) {
                                c0686m3 = y10;
                                i7 = length;
                                i10 = i12;
                            } else {
                                c0686m3 = y10;
                                i7 = length;
                                i10 = i12;
                                if (s3.f12435a != 1 && !s10.equals(s3)) {
                                    AbstractC0697x s11 = AbstractC0688o.s(b2, g(), d());
                                    if (s11 == null) {
                                        AbstractC0688o.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (t5 = (AbstractC0697x) hashMap.get(s10)) == null) {
                                        t5 = interfaceC0695v.t(s3, s10, s11);
                                    }
                                    if (t5 == null) {
                                        return new Object();
                                    }
                                    if (!t5.equals(s11)) {
                                        if (t5.equals(s10)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new Db.j(interfaceC0695v, s10.b(g())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(interfaceC0695v);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!t5.equals(s3) ? new Db.j(interfaceC0695v, t5) : new Db.j(interfaceC0695v, s3.b(g())));
                                        }
                                    }
                                }
                            }
                        } else {
                            c0686m3 = y10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i7 = length;
                            i10 = i12;
                        }
                        j11 >>= 8;
                        i13++;
                        j10 = j;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        y10 = c0686m3;
                        length = i7;
                        i12 = i10;
                    }
                    c0686m2 = y10;
                    objArr = objArr3;
                    jArr = jArr3;
                    int i14 = length;
                    if (i12 != 8) {
                        break;
                    }
                    length = i14;
                } else {
                    c0686m2 = y10;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i11++;
                j10 = j;
                jArr3 = jArr;
                objArr3 = objArr;
                y10 = c0686m2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i15 = 0; i15 < size; i15++) {
                Db.j jVar = (Db.j) arrayList3.get(i15);
                InterfaceC0695v interfaceC0695v2 = (InterfaceC0695v) jVar.f3354a;
                AbstractC0697x abstractC0697x = (AbstractC0697x) jVar.f3355b;
                abstractC0697x.f12435a = j;
                synchronized (AbstractC0688o.f12405b) {
                    abstractC0697x.f12436b = interfaceC0695v2.b();
                    interfaceC0695v2.z(abstractC0697x);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                c2047j.l((InterfaceC0695v) arrayList2.get(i16));
            }
            ArrayList arrayList4 = this.f12377i;
            if (arrayList4 != null) {
                arrayList2 = Eb.o.i0(arrayList4, arrayList2);
            }
            this.f12377i = arrayList2;
        }
        return C0684k.f12390b;
    }
}
