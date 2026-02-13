package P4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import m4.E0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class M implements InterfaceC0476y, InterfaceC0475x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0476y[] f7875a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f7876b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.e f7877c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7878d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7879e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0475x f7880f;

    /* renamed from: u, reason: collision with root package name */
    public n0 f7881u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0476y[] f7882v;

    /* renamed from: w, reason: collision with root package name */
    public C0463k f7883w;

    public M(h8.e eVar, long[] jArr, InterfaceC0476y... interfaceC0476yArr) {
        this.f7877c = eVar;
        this.f7875a = interfaceC0476yArr;
        eVar.getClass();
        this.f7883w = new C0463k(new f0[0], 0);
        this.f7876b = new IdentityHashMap();
        this.f7882v = new InterfaceC0476y[0];
        for (int i7 = 0; i7 < interfaceC0476yArr.length; i7++) {
            long j = jArr[i7];
            if (j != 0) {
                this.f7875a[i7] = new K(interfaceC0476yArr[i7], j);
            }
        }
    }

    @Override // P4.InterfaceC0475x
    public final void a(InterfaceC0476y interfaceC0476y) {
        ArrayList arrayList = this.f7878d;
        arrayList.remove(interfaceC0476y);
        if (arrayList.isEmpty()) {
            InterfaceC0476y[] interfaceC0476yArr = this.f7875a;
            int i7 = 0;
            for (InterfaceC0476y interfaceC0476y2 : interfaceC0476yArr) {
                i7 += interfaceC0476y2.l().f8119a;
            }
            m0[] m0VarArr = new m0[i7];
            int i10 = 0;
            for (int i11 = 0; i11 < interfaceC0476yArr.length; i11++) {
                n0 l10 = interfaceC0476yArr[i11].l();
                int i12 = l10.f8119a;
                int i13 = 0;
                while (i13 < i12) {
                    m0 a9 = l10.a(i13);
                    m0 m0Var = new m0(i11 + ":" + a9.f8107b, a9.f8109d);
                    this.f7879e.put(m0Var, a9);
                    m0VarArr[i10] = m0Var;
                    i13++;
                    i10++;
                }
            }
            this.f7881u = new n0(m0VarArr);
            InterfaceC0475x interfaceC0475x = this.f7880f;
            interfaceC0475x.getClass();
            interfaceC0475x.a(this);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        InterfaceC0476y[] interfaceC0476yArr = this.f7882v;
        return (interfaceC0476yArr.length > 0 ? interfaceC0476yArr[0] : this.f7875a[0]).c(j, e02);
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f7883w.d();
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        InterfaceC0475x interfaceC0475x = this.f7880f;
        interfaceC0475x.getClass();
        interfaceC0475x.i(this);
    }

    @Override // P4.f0
    public final long j() {
        return this.f7883w.j();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        long j = -9223372036854775807L;
        for (InterfaceC0476y interfaceC0476y : this.f7882v) {
            long k = interfaceC0476y.k();
            if (k != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC0476y interfaceC0476y2 : this.f7882v) {
                        if (interfaceC0476y2 == interfaceC0476y) {
                            break;
                        }
                        if (interfaceC0476y2.r(k) != k) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = k;
                } else if (k != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC0476y.r(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        n0 n0Var = this.f7881u;
        n0Var.getClass();
        return n0Var;
    }

    @Override // P4.f0
    public final long n() {
        return this.f7883w.n();
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        for (InterfaceC0476y interfaceC0476y : this.f7875a) {
            interfaceC0476y.o();
        }
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f7880f = interfaceC0475x;
        ArrayList arrayList = this.f7878d;
        InterfaceC0476y[] interfaceC0476yArr = this.f7875a;
        Collections.addAll(arrayList, interfaceC0476yArr);
        for (InterfaceC0476y interfaceC0476y : interfaceC0476yArr) {
            interfaceC0476y.q(this, j);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        long r10 = this.f7882v[0].r(j);
        int i7 = 1;
        while (true) {
            InterfaceC0476y[] interfaceC0476yArr = this.f7882v;
            if (i7 >= interfaceC0476yArr.length) {
                return r10;
            }
            if (interfaceC0476yArr[i7].r(r10) != r10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        for (InterfaceC0476y interfaceC0476y : this.f7882v) {
            interfaceC0476y.s(j);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f7876b;
            if (i10 >= length) {
                break;
            }
            d0 d0Var = d0VarArr[i10];
            Integer num = d0Var == null ? null : (Integer) identityHashMap.get(d0Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            k5.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.k().f8107b;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        d0[] d0VarArr2 = new d0[length2];
        d0[] d0VarArr3 = new d0[sVarArr.length];
        k5.s[] sVarArr2 = new k5.s[sVarArr.length];
        InterfaceC0476y[] interfaceC0476yArr = this.f7875a;
        ArrayList arrayList2 = new ArrayList(interfaceC0476yArr.length);
        long j10 = j;
        int i11 = 0;
        while (i11 < interfaceC0476yArr.length) {
            int i12 = i7;
            while (i12 < sVarArr.length) {
                d0VarArr3[i12] = iArr[i12] == i11 ? d0VarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    k5.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    m0 m0Var = (m0) this.f7879e.get(sVar2.k());
                    m0Var.getClass();
                    sVarArr2[i12] = new J(sVar2, m0Var);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i12] = null;
                }
                i12++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i13 = i11;
            InterfaceC0476y[] interfaceC0476yArr2 = interfaceC0476yArr;
            k5.s[] sVarArr3 = sVarArr2;
            long v10 = interfaceC0476yArr[i11].v(sVarArr2, zArr, d0VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = v10;
            } else if (v10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z8 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                if (iArr2[i14] == i13) {
                    d0 d0Var2 = d0VarArr3[i14];
                    d0Var2.getClass();
                    d0VarArr2[i14] = d0VarArr3[i14];
                    identityHashMap.put(d0Var2, Integer.valueOf(i13));
                    z8 = true;
                } else if (iArr[i14] == i13) {
                    AbstractC1705a.m(d0VarArr3[i14] == null);
                }
            }
            if (z8) {
                arrayList3.add(interfaceC0476yArr2[i13]);
            }
            i11 = i13 + 1;
            arrayList2 = arrayList3;
            interfaceC0476yArr = interfaceC0476yArr2;
            sVarArr2 = sVarArr3;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(d0VarArr2, i15, d0VarArr, i15, length2);
        InterfaceC0476y[] interfaceC0476yArr3 = (InterfaceC0476y[]) arrayList2.toArray(new InterfaceC0476y[i15]);
        this.f7882v = interfaceC0476yArr3;
        this.f7877c.getClass();
        this.f7883w = new C0463k(interfaceC0476yArr3, 0);
        return j10;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        ArrayList arrayList = this.f7878d;
        if (arrayList.isEmpty()) {
            return this.f7883w.x(j);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC0476y) arrayList.get(i7)).x(j);
        }
        return false;
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f7883w.y(j);
    }
}
