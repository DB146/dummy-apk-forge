package P4;

import N6.t0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import m4.C1558a0;
import m4.C1562c0;
import m4.L0;
import m5.C1620q;

/* loaded from: classes.dex */
public final class N extends AbstractC0462j {

    /* renamed from: F, reason: collision with root package name */
    public static final C1558a0 f7884F;

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f7885A;

    /* renamed from: B, reason: collision with root package name */
    public final h8.e f7886B;

    /* renamed from: C, reason: collision with root package name */
    public int f7887C;

    /* renamed from: D, reason: collision with root package name */
    public long[][] f7888D;

    /* renamed from: E, reason: collision with root package name */
    public A3.e f7889E;

    /* renamed from: y, reason: collision with root package name */
    public final AbstractC0453a[] f7890y;

    /* renamed from: z, reason: collision with root package name */
    public final L0[] f7891z;

    /* JADX WARN: Type inference failed for: r4v0, types: [m4.Q, m4.S] */
    static {
        m4.P p10 = new m4.P();
        N6.F f4 = N6.H.f7232b;
        t0 t0Var = t0.f7341e;
        Collections.emptyList();
        t0 t0Var2 = t0.f7341e;
        f7884F = new C1558a0("MergingMediaSource", new m4.Q(p10), null, new m4.U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1562c0.f20268W, m4.W.f20184c);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [N6.r, java.lang.Object] */
    public N(AbstractC0453a... abstractC0453aArr) {
        h8.e eVar = new h8.e(12);
        this.f7890y = abstractC0453aArr;
        this.f7886B = eVar;
        this.f7885A = new ArrayList(Arrays.asList(abstractC0453aArr));
        this.f7887C = -1;
        this.f7891z = new L0[abstractC0453aArr.length];
        this.f7888D = new long[0];
        new HashMap();
        N6.r.e(8, "expectedKeys");
        new Object().a().t();
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(B b2, C1620q c1620q, long j) {
        AbstractC0453a[] abstractC0453aArr = this.f7890y;
        int length = abstractC0453aArr.length;
        InterfaceC0476y[] interfaceC0476yArr = new InterfaceC0476y[length];
        L0[] l0Arr = this.f7891z;
        int b10 = l0Arr[0].b(b2.f8157a);
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0476yArr[i7] = abstractC0453aArr[i7].b(b2.b(l0Arr[i7].l(b10)), c1620q, j - this.f7888D[b10][i7]);
        }
        return new M(this.f7886B, this.f7888D[b10], interfaceC0476yArr);
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        AbstractC0453a[] abstractC0453aArr = this.f7890y;
        return abstractC0453aArr.length > 0 ? abstractC0453aArr[0].i() : f7884F;
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void k() {
        A3.e eVar = this.f7889E;
        if (eVar != null) {
            throw eVar;
        }
        super.k();
    }

    @Override // P4.AbstractC0453a
    public final void n(m5.T t5) {
        this.f8068x = t5;
        this.f8067w = n5.D.m(null);
        int i7 = 0;
        while (true) {
            AbstractC0453a[] abstractC0453aArr = this.f7890y;
            if (i7 >= abstractC0453aArr.length) {
                return;
            }
            z(Integer.valueOf(i7), abstractC0453aArr[i7]);
            i7++;
        }
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        M m10 = (M) interfaceC0476y;
        int i7 = 0;
        while (true) {
            AbstractC0453a[] abstractC0453aArr = this.f7890y;
            if (i7 >= abstractC0453aArr.length) {
                return;
            }
            AbstractC0453a abstractC0453a = abstractC0453aArr[i7];
            InterfaceC0476y interfaceC0476y2 = m10.f7875a[i7];
            if (interfaceC0476y2 instanceof K) {
                interfaceC0476y2 = ((K) interfaceC0476y2).f7870a;
            }
            abstractC0453a.p(interfaceC0476y2);
            i7++;
        }
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void r() {
        super.r();
        Arrays.fill(this.f7891z, (Object) null);
        this.f7887C = -1;
        this.f7889E = null;
        ArrayList arrayList = this.f7885A;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7890y);
    }

    @Override // P4.AbstractC0462j
    public final B v(Object obj, B b2) {
        if (((Integer) obj).intValue() == 0) {
            return b2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [A3.e, java.io.IOException] */
    @Override // P4.AbstractC0462j
    public final void y(Object obj, AbstractC0453a abstractC0453a, L0 l02) {
        Integer num = (Integer) obj;
        if (this.f7889E != null) {
            return;
        }
        if (this.f7887C == -1) {
            this.f7887C = l02.h();
        } else if (l02.h() != this.f7887C) {
            this.f7889E = new IOException();
            return;
        }
        int length = this.f7888D.length;
        L0[] l0Arr = this.f7891z;
        if (length == 0) {
            this.f7888D = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f7887C, l0Arr.length);
        }
        ArrayList arrayList = this.f7885A;
        arrayList.remove(abstractC0453a);
        l0Arr[num.intValue()] = l02;
        if (arrayList.isEmpty()) {
            o(l0Arr[0]);
        }
    }
}
