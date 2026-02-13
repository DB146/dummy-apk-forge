package R7;

import L7.C0385e;
import T7.l;
import T7.m;
import T7.q;
import T7.s;
import T7.t;
import V8.f;
import a5.C0776b;
import a5.h;
import a5.k;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.G;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e3.RunnableC1077b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l2.X;
import m9.C1649f;
import m9.EnumC1647d;
import n5.AbstractC1705a;
import q4.g;
import r8.o;
import y.S;
import y1.K;

/* loaded from: classes.dex */
public final class c implements e, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8930a;

    /* renamed from: b, reason: collision with root package name */
    public int f8931b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8932c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8933d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8934e;

    public c() {
        this.f8930a = 1;
        this.f8933d = new g(1);
        this.f8934e = new ArrayDeque();
        for (int i7 = 0; i7 < 2; i7++) {
            ((ArrayDeque) this.f8934e).addFirst(new a5.d(this, 0));
        }
        this.f8931b = 0;
    }

    public c(Q7.e eVar) {
        this.f8930a = 0;
        this.f8933d = new o(eVar);
        this.f8934e = eVar.f8684e;
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f8930a = 2;
        this.f8934e = bottomSheetBehavior;
        this.f8933d = new RunnableC1077b(this, 4);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f8930a = 4;
        this.f8934e = sideSheetBehavior;
        this.f8933d = new k1.a(this, 16);
    }

    public c(String str, Charset charset, boolean z8, int i7) {
        this.f8930a = 3;
        this.f8933d = str;
        this.f8932c = z8;
        this.f8934e = new f(str, charset);
        this.f8931b = i7;
    }

    public static void i(o9.d[][][] dVarArr, int i7, o9.d dVar) {
        o9.d[] dVarArr2 = dVarArr[i7 + dVar.f22137d][dVar.f22136c];
        EnumC1647d enumC1647d = dVar.f22134a;
        int ordinal = enumC1647d.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c10 = 1;
            } else if (ordinal == 4) {
                c10 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + enumC1647d);
                }
                c10 = 0;
            }
        }
        o9.d dVar2 = dVarArr2[c10];
        if (dVar2 != null) {
            if (dVar2.f22139f <= dVar.f22139f) {
                return;
            }
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean l(EnumC1647d enumC1647d, char c10) {
        int i7;
        int ordinal = enumC1647d.ordinal();
        if (ordinal == 1) {
            return c10 >= '0' && c10 <= '9';
        }
        if (ordinal != 2) {
            if (ordinal == 4) {
                return true;
            }
            if (ordinal != 6) {
                return false;
            }
            return o9.b.b(String.valueOf(c10));
        }
        if (c10 < '`') {
            i7 = o9.b.f22128a[c10];
        } else {
            int[] iArr = o9.b.f22128a;
            i7 = -1;
        }
        return i7 != -1;
    }

    public static C1649f o(int i7) {
        int b2 = P.c.b(i7);
        return b2 != 0 ? b2 != 1 ? C1649f.c(40) : C1649f.c(26) : C1649f.c(9);
    }

    @Override // q4.c
    public void a(k kVar) {
        AbstractC1705a.m(!this.f8932c);
        AbstractC1705a.m(this.f8931b == 1);
        AbstractC1705a.h(((k) this.f8933d) == kVar);
        this.f8931b = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    @Override // R7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m b(m mVar, T7.c cVar, s sVar, C0385e c0385e, d dVar, a aVar) {
        q qVar;
        boolean n6;
        s sVar2 = sVar;
        q qVar2 = new q(cVar, sVar2);
        o oVar = (o) this.f8933d;
        if (!oVar.l(qVar2)) {
            sVar2 = T7.k.f9348e;
        }
        if (mVar.f9350a.h(cVar).equals(sVar2)) {
            return mVar;
        }
        s sVar3 = mVar.f9350a;
        int q10 = sVar3.q();
        int i7 = this.f8931b;
        if (q10 < i7) {
            return ((b) oVar.f23857b).b(mVar, cVar, sVar2, c0385e, dVar, aVar);
        }
        O7.k.c(sVar3.q() == i7);
        q qVar3 = new q(cVar, sVar2);
        boolean z8 = this.f8932c;
        if (z8) {
            if (sVar3 instanceof T7.f) {
                mVar.b();
                if (G.k(mVar.f9351b, m.f9349d)) {
                    T7.c cVar2 = (T7.c) ((T7.f) sVar3).f9335a.y();
                    qVar = new q(cVar2, sVar3.h(cVar2));
                } else {
                    qVar = (q) mVar.f9351b.f5243a.y();
                }
                boolean l10 = oVar.l(qVar3);
                n6 = sVar3.n(cVar);
                t tVar = t.f9361a;
                l lVar = (l) this.f8934e;
                if (n6) {
                    if (!sVar2.isEmpty() && l10) {
                        if ((z8 ? lVar.compare(qVar3, qVar) : lVar.compare(qVar, qVar3)) >= 0) {
                            if (aVar != null) {
                                aVar.G(new Q7.c(1, new m(qVar.f9360b, tVar), qVar.f9359a, null));
                                aVar.G(new Q7.c(2, new m(sVar2, tVar), cVar, null));
                            }
                            return mVar.i(cVar, sVar2).i(qVar.f9359a, T7.k.f9348e);
                        }
                    }
                    return mVar;
                }
                s h10 = sVar3.h(cVar);
                q a9 = dVar.a(lVar, qVar, z8);
                while (a9 != null) {
                    T7.c cVar3 = a9.f9359a;
                    if (!cVar3.equals(cVar) && !sVar3.n(cVar3)) {
                        break;
                    }
                    a9 = dVar.a(lVar, a9, z8);
                }
                int compare = a9 == null ? 1 : z8 ? lVar.compare(qVar3, a9) : lVar.compare(a9, qVar3);
                if (l10 && !sVar2.isEmpty() && compare >= 0) {
                    if (aVar != null) {
                        aVar.G(new Q7.c(4, new m(sVar2, tVar), cVar, new m(h10, tVar)));
                    }
                    return mVar.i(cVar, sVar2);
                }
                if (aVar != null) {
                    aVar.G(new Q7.c(1, new m(h10, tVar), cVar, null));
                }
                m i10 = mVar.i(cVar, T7.k.f9348e);
                if (a9 == null || !oVar.l(a9)) {
                    return i10;
                }
                s sVar4 = a9.f9360b;
                T7.c cVar4 = a9.f9359a;
                if (aVar != null) {
                    aVar.G(new Q7.c(2, new m(sVar4, tVar), cVar4, null));
                }
                return i10.i(cVar4, sVar4);
            }
            qVar = null;
            boolean l102 = oVar.l(qVar3);
            n6 = sVar3.n(cVar);
            t tVar2 = t.f9361a;
            l lVar2 = (l) this.f8934e;
            if (n6) {
            }
        } else {
            if (sVar3 instanceof T7.f) {
                mVar.b();
                if (G.k(mVar.f9351b, m.f9349d)) {
                    T7.c cVar5 = (T7.c) ((T7.f) sVar3).f9335a.t();
                    qVar = new q(cVar5, sVar3.h(cVar5));
                } else {
                    qVar = (q) mVar.f9351b.f5243a.t();
                }
                boolean l1022 = oVar.l(qVar3);
                n6 = sVar3.n(cVar);
                t tVar22 = t.f9361a;
                l lVar22 = (l) this.f8934e;
                if (n6) {
                }
            }
            qVar = null;
            boolean l10222 = oVar.l(qVar3);
            n6 = sVar3.n(cVar);
            t tVar222 = t.f9361a;
            l lVar222 = (l) this.f8934e;
            if (n6) {
            }
        }
    }

    @Override // R7.e
    public b c() {
        return (b) ((o) this.f8933d).f23857b;
    }

    @Override // R7.e
    public m d(m mVar, m mVar2, a aVar) {
        m mVar3;
        Iterator it;
        q qVar;
        q qVar2;
        int i7;
        boolean p10 = mVar2.f9350a.p();
        l lVar = (l) this.f8934e;
        o oVar = (o) this.f8933d;
        if (!p10) {
            s sVar = mVar2.f9350a;
            if (!sVar.isEmpty()) {
                mVar3 = new m(sVar.s(T7.k.f9348e), mVar2.f9352c, mVar2.f9351b);
                if (this.f8932c) {
                    mVar2.b();
                    it = G.k(mVar2.f9351b, m.f9349d) ? sVar.A() : new I7.e(mVar2.f9351b.f5243a.A(), 0);
                    qVar = (q) oVar.f23860e;
                    qVar2 = (q) oVar.f23859d;
                    i7 = -1;
                } else {
                    it = mVar2.iterator();
                    qVar = (q) oVar.f23859d;
                    qVar2 = (q) oVar.f23860e;
                    i7 = 1;
                }
                boolean z8 = false;
                int i10 = 0;
                while (it.hasNext()) {
                    q qVar3 = (q) it.next();
                    if (!z8 && lVar.compare(qVar, qVar3) * i7 <= 0) {
                        z8 = true;
                    }
                    if (!z8 || i10 >= this.f8931b || lVar.compare(qVar3, qVar2) * i7 > 0) {
                        mVar3 = mVar3.i(qVar3.f9359a, T7.k.f9348e);
                    } else {
                        i10++;
                    }
                }
                ((b) oVar.f23857b).d(mVar, mVar3, aVar);
                return mVar3;
            }
        }
        mVar3 = new m(T7.k.f9348e, lVar);
        ((b) oVar.f23857b).d(mVar, mVar3, aVar);
        return mVar3;
    }

    @Override // a5.h
    public void e(long j) {
    }

    @Override // q4.c
    public Object f() {
        AbstractC1705a.m(!this.f8932c);
        if (this.f8931b == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f8934e;
            if (!arrayDeque.isEmpty()) {
                a5.d dVar = (a5.d) arrayDeque.removeFirst();
                k kVar = (k) this.f8933d;
                if (kVar.i(4)) {
                    dVar.a(4);
                } else {
                    long j = kVar.f23460f;
                    ByteBuffer byteBuffer = kVar.f23458d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    dVar.H(kVar.f23460f, new a5.e(j, AbstractC1705a.x(C0776b.f12725X, parcelableArrayList)), 0L);
                }
                kVar.G();
                this.f8931b = 0;
                return dVar;
            }
        }
        return null;
    }

    @Override // q4.c
    public void flush() {
        AbstractC1705a.m(!this.f8932c);
        ((k) this.f8933d).G();
        this.f8931b = 0;
    }

    @Override // R7.e
    public m g(m mVar, s sVar) {
        return mVar;
    }

    @Override // R7.e
    public l getIndex() {
        return (l) this.f8934e;
    }

    @Override // q4.c
    public Object h() {
        AbstractC1705a.m(!this.f8932c);
        if (this.f8931b != 0) {
            return null;
        }
        this.f8931b = 1;
        return (k) this.f8933d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(C1649f c1649f, o9.d[][][] dVarArr, int i7, o9.d dVar) {
        int i10;
        int i11;
        EnumC1647d enumC1647d;
        EnumC1647d enumC1647d2;
        EnumC1647d enumC1647d3;
        int i12;
        f fVar = (f) this.f8934e;
        int length = fVar.f10215a.length;
        CharsetEncoder[] charsetEncoderArr = fVar.f10215a;
        int i13 = fVar.f10216b;
        String str = (String) this.f8933d;
        if (i13 >= 0) {
            char charAt = str.charAt(i7);
            if (charsetEncoderArr[i13].canEncode("" + charAt)) {
                length = i13 + 1;
                i10 = length;
                for (i11 = i13; i11 < i10; i11++) {
                    char charAt2 = str.charAt(i7);
                    if (charsetEncoderArr[i11].canEncode("" + charAt2)) {
                        i(dVarArr, i7, new o9.d(this, EnumC1647d.BYTE, i7, i11, 1, dVar, c1649f));
                    }
                }
                enumC1647d = EnumC1647d.KANJI;
                if (l(enumC1647d, str.charAt(i7))) {
                    i(dVarArr, i7, new o9.d(this, enumC1647d, i7, 0, 1, dVar, c1649f));
                }
                int length2 = str.length();
                enumC1647d2 = EnumC1647d.ALPHANUMERIC;
                if (l(enumC1647d2, str.charAt(i7))) {
                    int i14 = i7 + 1;
                    i(dVarArr, i7, new o9.d(this, enumC1647d2, i7, 0, (i14 >= length2 || !l(enumC1647d2, str.charAt(i14))) ? 1 : 2, dVar, c1649f));
                }
                enumC1647d3 = EnumC1647d.NUMERIC;
                if (l(enumC1647d3, str.charAt(i7))) {
                    return;
                }
                int i15 = i7 + 1;
                if (i15 >= length2 || !l(enumC1647d3, str.charAt(i15))) {
                    i12 = 1;
                } else {
                    int i16 = i7 + 2;
                    i12 = (i16 >= length2 || !l(enumC1647d3, str.charAt(i16))) ? 2 : 3;
                }
                i(dVarArr, i7, new o9.d(this, enumC1647d3, i7, 0, i12, dVar, c1649f));
                return;
            }
        }
        i13 = 0;
        i10 = length;
        while (i11 < i10) {
        }
        enumC1647d = EnumC1647d.KANJI;
        if (l(enumC1647d, str.charAt(i7))) {
        }
        int length22 = str.length();
        enumC1647d2 = EnumC1647d.ALPHANUMERIC;
        if (l(enumC1647d2, str.charAt(i7))) {
        }
        enumC1647d3 = EnumC1647d.NUMERIC;
        if (l(enumC1647d3, str.charAt(i7))) {
        }
    }

    @Override // R7.e
    public boolean k() {
        return true;
    }

    public void m(int i7) {
        Object obj = this.f8933d;
        Object obj2 = this.f8934e;
        switch (this.f8930a) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f15200U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.f8931b = i7;
                if (this.f8932c) {
                    return;
                }
                WeakHashMap weakHashMap = K.f26642a;
                ((View) bottomSheetBehavior.f15200U.get()).postOnAnimation((RunnableC1077b) obj);
                this.f8932c = true;
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f15430p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f8931b = i7;
                if (this.f8932c) {
                    return;
                }
                WeakHashMap weakHashMap2 = K.f26642a;
                ((View) sideSheetBehavior.f15430p.get()).postOnAnimation((k1.a) obj);
                this.f8932c = true;
                return;
        }
    }

    public X n(C1649f c1649f) {
        CharsetEncoder[] charsetEncoderArr;
        int i7;
        String str = (String) this.f8933d;
        int length = str.length();
        f fVar = (f) this.f8934e;
        int i10 = 1;
        o9.d[][][] dVarArr = (o9.d[][][]) Array.newInstance((Class<?>) o9.d.class, length + 1, fVar.f10215a.length, 4);
        j(c1649f, dVarArr, 0, null);
        while (true) {
            charsetEncoderArr = fVar.f10215a;
            if (i10 > length) {
                break;
            }
            for (int i11 = 0; i11 < charsetEncoderArr.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    o9.d dVar = dVarArr[i10][i11][i12];
                    if (dVar != null && i10 < length) {
                        j(c1649f, dVarArr, i10, dVar);
                    }
                }
            }
            i10++;
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < charsetEncoderArr.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                o9.d dVar2 = dVarArr[length][i16][i17];
                if (dVar2 != null && (i7 = dVar2.f22139f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i7;
                }
            }
        }
        if (i13 >= 0) {
            return new X(this, c1649f, dVarArr[length][i13][i15]);
        }
        throw new Exception(S.b("Internal error: failed to encode \"", str, "\""));
    }

    @Override // q4.c
    public void release() {
        this.f8932c = true;
    }
}
