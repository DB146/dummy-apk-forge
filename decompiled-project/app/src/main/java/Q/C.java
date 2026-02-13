package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0692s;
import a0.AbstractC0696w;
import a0.AbstractC0697x;
import a0.InterfaceC0695v;
import u.C2041D;

/* loaded from: classes.dex */
public final class C extends AbstractC0696w implements R0 {

    /* renamed from: b, reason: collision with root package name */
    public final Rb.a f8274b;

    /* renamed from: c, reason: collision with root package name */
    public final S f8275c;

    /* renamed from: d, reason: collision with root package name */
    public B f8276d = new B(AbstractC0688o.k().g());

    public C(Rb.a aVar, S s3) {
        this.f8274b = aVar;
        this.f8275c = s3;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f8276d;
    }

    public final B e(B b2, AbstractC0682i abstractC0682i, boolean z8, Rb.a aVar) {
        S.e l10;
        S s3;
        int i7;
        B b10 = b2;
        if (b10.c(this, abstractC0682i)) {
            if (z8) {
                l10 = C0480b.l();
                Object[] objArr = l10.f8959a;
                int i10 = l10.f8961c;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((C0504n) objArr[i11]).b();
                }
                try {
                    C2041D c2041d = b10.f8272e;
                    Q7.h hVar = I0.f8308a;
                    Y.g gVar = (Y.g) hVar.w();
                    if (gVar == null) {
                        gVar = new Y.g();
                        hVar.N(gVar);
                    }
                    int i12 = gVar.f11046a;
                    Object[] objArr2 = c2041d.f24579b;
                    int[] iArr = c2041d.f24580c;
                    long[] jArr = c2041d.f24578a;
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
                                        int i17 = (i13 << 3) + i16;
                                        InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr2[i17];
                                        gVar.f11046a = i12 + iArr[i17];
                                        Rb.c e2 = abstractC0682i.e();
                                        if (e2 != null) {
                                            e2.invoke(interfaceC0695v);
                                        }
                                        i7 = 8;
                                    } else {
                                        i7 = i14;
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
                    gVar.f11046a = i12;
                    Object[] objArr3 = l10.f8959a;
                    int i18 = l10.f8961c;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((C0504n) objArr3[i19]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return b10;
        }
        C2041D c2041d2 = new C2041D();
        Q7.h hVar2 = I0.f8308a;
        Y.g gVar2 = (Y.g) hVar2.w();
        if (gVar2 == null) {
            gVar2 = new Y.g();
            hVar2.N(gVar2);
        }
        int i20 = gVar2.f11046a;
        l10 = C0480b.l();
        Object[] objArr4 = l10.f8959a;
        int i21 = l10.f8961c;
        for (int i22 = 0; i22 < i21; i22++) {
            ((C0504n) objArr4[i22]).b();
        }
        try {
            gVar2.f11046a = i20 + 1;
            Object e10 = AbstractC0692s.e(aVar, new C.J(this, gVar2, c2041d2, i20));
            gVar2.f11046a = i20;
            Object[] objArr5 = l10.f8959a;
            int i23 = l10.f8961c;
            for (int i24 = 0; i24 < i23; i24++) {
                ((C0504n) objArr5[i24]).a();
            }
            Object obj = AbstractC0688o.f12405b;
            synchronized (obj) {
                try {
                    AbstractC0682i k = AbstractC0688o.k();
                    Object obj2 = b10.f8273f;
                    if (obj2 == B.f8269h || (s3 = this.f8275c) == null || !s3.a(e10, obj2)) {
                        B b11 = this.f8276d;
                        synchronized (obj) {
                            AbstractC0697x m10 = AbstractC0688o.m(b11, this);
                            m10.a(b11);
                            m10.f12435a = k.g();
                            b10 = (B) m10;
                            b10.f8272e = c2041d2;
                            b10.g = b10.d(this, k);
                            b10.f8273f = e10;
                        }
                        return b10;
                    }
                    b10.f8272e = c2041d2;
                    b10.g = b10.d(this, k);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Y.g gVar3 = (Y.g) I0.f8308a.w();
            if (gVar3 != null && gVar3.f11046a == 0) {
                AbstractC0688o.k().m();
                synchronized (obj) {
                    AbstractC0682i k7 = AbstractC0688o.k();
                    b10.f8270c = k7.g();
                    b10.f8271d = k7.h();
                }
            }
            return b10;
        } finally {
            Object[] objArr6 = l10.f8959a;
            int i25 = l10.f8961c;
            for (int i26 = 0; i26 < i25; i26++) {
                ((C0504n) objArr6[i26]).a();
            }
        }
    }

    public final B f() {
        AbstractC0682i k = AbstractC0688o.k();
        return e((B) AbstractC0688o.j(this.f8276d, k), k, false, this.f8274b);
    }

    @Override // Q.R0
    public final Object getValue() {
        Rb.c e2 = AbstractC0688o.k().e();
        if (e2 != null) {
            e2.invoke(this);
        }
        AbstractC0682i k = AbstractC0688o.k();
        return e((B) AbstractC0688o.j(this.f8276d, k), k, true, this.f8274b).f8273f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        B b2 = (B) AbstractC0688o.i(this.f8276d);
        sb2.append(b2.c(this, AbstractC0688o.k()) ? String.valueOf(b2.f8273f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f8276d = (B) abstractC0697x;
    }
}
