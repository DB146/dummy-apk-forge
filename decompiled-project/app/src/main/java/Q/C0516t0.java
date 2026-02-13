package Q;

import cc.C0944m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import u.C2042E;
import u.C2046I;
import u.C2047J;

/* renamed from: Q.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516t0 extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public List f8509a;

    /* renamed from: b, reason: collision with root package name */
    public List f8510b;

    /* renamed from: c, reason: collision with root package name */
    public List f8511c;

    /* renamed from: d, reason: collision with root package name */
    public C2047J f8512d;

    /* renamed from: e, reason: collision with root package name */
    public C2047J f8513e;

    /* renamed from: f, reason: collision with root package name */
    public C2047J f8514f;

    /* renamed from: u, reason: collision with root package name */
    public Set f8515u;

    /* renamed from: v, reason: collision with root package name */
    public C2047J f8516v;

    /* renamed from: w, reason: collision with root package name */
    public int f8517w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ T f8518x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f8519y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516t0(C0518u0 c0518u0, Hb.d dVar) {
        super(3, dVar);
        this.f8519y = c0518u0;
    }

    public static final void c(C0518u0 c0518u0, List list, List list2, List list3, C2047J c2047j, C2047J c2047j2, C2047J c2047j3, C2047J c2047j4) {
        synchronized (c0518u0.f8543b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0517u c0517u = (C0517u) list3.get(i7);
                    c0517u.a();
                    c0518u0.B(c0517u);
                }
                list3.clear();
                Object[] objArr = c2047j.f24610b;
                long[] jArr = c2047j.f24609a;
                int length = jArr.length - 2;
                long j = -9187201950435737472L;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        long[] jArr2 = jArr;
                        if ((((~j10) << 7) & j10 & j) != j) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j10 & 255) < 128) {
                                    C0517u c0517u2 = (C0517u) objArr[(i10 << 3) + i12];
                                    c0517u2.a();
                                    c0518u0.B(c0517u2);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        jArr = jArr2;
                        j = -9187201950435737472L;
                    }
                }
                c2047j.b();
                Object[] objArr2 = c2047j2.f24610b;
                long[] jArr3 = c2047j2.f24609a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j11 = jArr3[i13];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j11 & 255) < 128) {
                                    ((C0517u) objArr2[(i13 << 3) + i15]).g();
                                }
                                j11 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length2) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                c2047j2.b();
                c2047j3.b();
                Object[] objArr3 = c2047j4.f24610b;
                long[] jArr4 = c2047j4.f24609a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j12 = jArr4[i16];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j12 & 255) < 128) {
                                    C0517u c0517u3 = (C0517u) objArr3[(i16 << 3) + i18];
                                    c0517u3.a();
                                    c0518u0.B(c0517u3);
                                }
                                j12 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            }
                        }
                        if (i16 == length3) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                c2047j4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void g(List list, C0518u0 c0518u0) {
        list.clear();
        synchronized (c0518u0.f8543b) {
            try {
                ArrayList arrayList = c0518u0.j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((V) arrayList.get(i7));
                }
                c0518u0.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        C0516t0 c0516t0 = new C0516t0(this.f8519y, (Hb.d) obj3);
        c0516t0.f8518x = (T) obj2;
        c0516t0.invokeSuspend(Db.q.f3365a);
        return Ib.a.f5345a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014c -> B:6:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01f2 -> B:22:0x0094). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        T t5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C2047J c2047j;
        C2047J c2047j2;
        C2047J c2047j3;
        S.h hVar;
        C2047J c2047j4;
        S.h hVar2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        C2047J c2047j5;
        C2047J c2047j6;
        ArrayList arrayList6;
        Object obj2;
        C0944m c0944m;
        ArrayList arrayList7;
        C2047J c2047j7;
        C2042E c2042e;
        C0516t0 c0516t0 = this;
        int i7 = 1;
        Ib.a aVar = Ib.a.f5345a;
        int i10 = c0516t0.f8517w;
        if (i10 == 0) {
            com.bumptech.glide.c.c0(obj);
            t5 = c0516t0.f8518x;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            int i11 = u.S.f24634a;
            c2047j = new C2047J();
            c2047j2 = new C2047J();
            c2047j3 = new C2047J();
            hVar = new S.h(c2047j3);
            c2047j4 = new C2047J();
            synchronized (c0516t0.f8519y.f8543b) {
            }
        } else if (i10 == 1) {
            C2047J c2047j8 = c0516t0.f8516v;
            Set set = c0516t0.f8515u;
            C2047J c2047j9 = c0516t0.f8514f;
            C2047J c2047j10 = c0516t0.f8513e;
            c2047j = c0516t0.f8512d;
            ?? r10 = c0516t0.f8511c;
            ?? r11 = c0516t0.f8510b;
            ?? r12 = c0516t0.f8509a;
            T t10 = c0516t0.f8518x;
            com.bumptech.glide.c.c0(obj);
            hVar2 = set;
            arrayList5 = r10;
            arrayList4 = r11;
            arrayList6 = r12;
            c2047j6 = c2047j8;
            c2047j3 = c2047j9;
            c2047j5 = c2047j10;
            t5 = t10;
            C2047J c2047j11 = c2047j;
            if (C0518u0.r(c0516t0.f8519y)) {
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2047J c2047j12 = c0516t0.f8516v;
            Set set2 = c0516t0.f8515u;
            C2047J c2047j13 = c0516t0.f8514f;
            C2047J c2047j14 = c0516t0.f8513e;
            c2047j = c0516t0.f8512d;
            ?? r102 = c0516t0.f8511c;
            ?? r112 = c0516t0.f8510b;
            ?? r122 = c0516t0.f8509a;
            T t11 = c0516t0.f8518x;
            com.bumptech.glide.c.c0(obj);
            arrayList6 = r122;
            hVar = set2;
            Ib.a aVar2 = aVar;
            C2047J c2047j15 = c2047j14;
            arrayList3 = r102;
            c2047j4 = c2047j12;
            t5 = t11;
            c2047j3 = c2047j13;
            arrayList2 = r112;
            C0518u0 c0518u0 = c0516t0.f8519y;
            synchronized (c0518u0.f8543b) {
                try {
                    C2046I c2046i = c0518u0.k;
                    if (c2046i.f24607e != 0) {
                        C2042E b2 = S.a.b(c2046i);
                        c0518u0.k.a();
                        q3.l lVar = c0518u0.f8550l;
                        ((C2046I) lVar.f23391b).a();
                        ((C2046I) lVar.f23392c).a();
                        c0518u0.f8552n.a();
                        c2042e = new C2042E(b2.f24585b);
                        Object[] objArr = b2.f24584a;
                        int i12 = b2.f24585b;
                        int i13 = 0;
                        while (i13 < i12) {
                            int i14 = i12;
                            V v10 = (V) objArr[i13];
                            c2042e.a(new Db.j(v10, c0518u0.f8551m.g(v10)));
                            i13++;
                            arrayList6 = arrayList6;
                            i12 = i14;
                            c2047j15 = c2047j15;
                        }
                        arrayList7 = arrayList6;
                        c2047j7 = c2047j15;
                        c0518u0.f8551m.a();
                    } else {
                        arrayList7 = arrayList6;
                        c2047j7 = c2047j15;
                        c2042e = u.O.f24631b;
                        kotlin.jvm.internal.l.c(c2042e, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Object[] objArr2 = c2042e.f24584a;
            int i15 = c2042e.f24585b;
            for (int i16 = 0; i16 < i15; i16++) {
                Db.j jVar = (Db.j) objArr2[i16];
            }
            c0516t0 = this;
            aVar = aVar2;
            arrayList = arrayList7;
            c2047j2 = c2047j7;
            i7 = 1;
            synchronized (c0516t0.f8519y.f8543b) {
            }
            C0518u0 c0518u02 = c0516t0.f8519y;
            c0516t0.f8518x = t5;
            c0516t0.f8509a = arrayList;
            c0516t0.f8510b = arrayList2;
            c0516t0.f8511c = arrayList3;
            c0516t0.f8512d = c2047j;
            c0516t0.f8513e = c2047j2;
            c0516t0.f8514f = c2047j3;
            c0516t0.f8515u = hVar;
            c0516t0.f8516v = c2047j4;
            c0516t0.f8517w = i7;
            if (c0518u02.w()) {
                obj2 = Db.q.f3365a;
            } else {
                C0944m c0944m2 = new C0944m(i7, com.bumptech.glide.c.F(this));
                c0944m2.s();
                synchronized (c0518u02.f8543b) {
                    if (c0518u02.w()) {
                        c0944m = c0944m2;
                    } else {
                        c0518u02.f8555q = c0944m2;
                        c0944m = null;
                    }
                }
                if (c0944m != null) {
                    c0944m.resumeWith(Db.q.f3365a);
                }
                obj2 = c0944m2.r();
                if (obj2 != Ib.a.f5345a) {
                    obj2 = Db.q.f3365a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
            arrayList6 = arrayList;
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
            hVar2 = hVar;
            c2047j5 = c2047j2;
            c2047j6 = c2047j4;
            C2047J c2047j112 = c2047j;
            if (C0518u0.r(c0516t0.f8519y)) {
                C2047J c2047j16 = c2047j5;
                c2047j4 = c2047j6;
                c0516t0 = this;
                c2047j = c2047j112;
                hVar = hVar2;
                arrayList2 = arrayList4;
                aVar = aVar;
                c2047j2 = c2047j16;
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                i7 = 1;
                synchronized (c0516t0.f8519y.f8543b) {
                }
            } else {
                Ib.a aVar3 = aVar;
                C2047J c2047j17 = c2047j3;
                C2047J c2047j18 = c2047j5;
                ArrayList arrayList8 = arrayList5;
                ArrayList arrayList9 = arrayList4;
                C0514s0 c0514s0 = new C0514s0(c0516t0.f8519y, c2047j3, c2047j6, arrayList6, arrayList4, c2047j112, arrayList5, c2047j18, hVar2);
                c0516t0.f8518x = t5;
                c0516t0.f8509a = arrayList6;
                c0516t0.f8510b = arrayList9;
                c0516t0.f8511c = arrayList8;
                c0516t0.f8512d = c2047j112;
                c0516t0.f8513e = c2047j18;
                c0516t0.f8514f = c2047j17;
                c0516t0.f8515u = hVar2;
                c2047j4 = c2047j6;
                c0516t0.f8516v = c2047j4;
                c0516t0.f8517w = 2;
                aVar2 = aVar3;
                if (t5.n(c0514s0, c0516t0) == aVar2) {
                    return aVar2;
                }
                c2047j = c2047j112;
                c2047j3 = c2047j17;
                hVar = hVar2;
                arrayList2 = arrayList9;
                c2047j15 = c2047j18;
                arrayList3 = arrayList8;
                C0518u0 c0518u03 = c0516t0.f8519y;
                synchronized (c0518u03.f8543b) {
                }
            }
        }
    }
}
