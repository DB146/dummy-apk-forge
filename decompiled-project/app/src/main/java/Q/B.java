package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0697x;
import a0.InterfaceC0695v;
import u.C2041D;

/* loaded from: classes.dex */
public final class B extends AbstractC0697x {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f8269h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f8270c;

    /* renamed from: d, reason: collision with root package name */
    public int f8271d;

    /* renamed from: e, reason: collision with root package name */
    public C2041D f8272e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8273f;
    public int g;

    public B(long j) {
        super(j);
        C2041D c2041d = u.N.f24629a;
        kotlin.jvm.internal.l.c(c2041d, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f8272e = c2041d;
        this.f8273f = f8269h;
    }

    @Override // a0.AbstractC0697x
    public final void a(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        B b2 = (B) abstractC0697x;
        this.f8272e = b2.f8272e;
        this.f8273f = b2.f8273f;
        this.g = b2.g;
    }

    @Override // a0.AbstractC0697x
    public final AbstractC0697x b(long j) {
        return new B(j);
    }

    public final boolean c(C c10, AbstractC0682i abstractC0682i) {
        boolean z8;
        boolean z10;
        Object obj = AbstractC0688o.f12405b;
        synchronized (obj) {
            z8 = true;
            if (this.f8270c == abstractC0682i.g()) {
                if (this.f8271d == abstractC0682i.h()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (this.f8273f == f8269h || (z10 && this.g != d(c10, abstractC0682i))) {
            z8 = false;
        }
        if (z8 && z10) {
            synchronized (obj) {
                this.f8270c = abstractC0682i.g();
                this.f8271d = abstractC0682i.h();
            }
        }
        return z8;
    }

    public final int d(C c10, AbstractC0682i abstractC0682i) {
        C2041D c2041d;
        int i7;
        int i10;
        int i11;
        int i12;
        AbstractC0697x j;
        synchronized (AbstractC0688o.f12405b) {
            c2041d = this.f8272e;
        }
        int i13 = 1;
        char c11 = 7;
        if (!(c2041d.f24582e != 0)) {
            return 7;
        }
        S.e l10 = C0480b.l();
        Object[] objArr = l10.f8959a;
        int i14 = l10.f8961c;
        for (int i15 = 0; i15 < i14; i15++) {
            ((C0504n) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = c2041d.f24579b;
            int[] iArr = c2041d.f24580c;
            long[] jArr = c2041d.f24578a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i16 = 7;
                int i17 = 0;
                while (true) {
                    long j10 = jArr[i17];
                    if ((((~j10) << c11) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j10 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr2[i21];
                                if (iArr[i21] == i13) {
                                    if (interfaceC0695v instanceof C) {
                                        C c12 = (C) interfaceC0695v;
                                        i7 = 0;
                                        try {
                                            j = c12.e((B) AbstractC0688o.j(c12.f8276d, abstractC0682i), abstractC0682i, false, c12.f8274b);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = l10.f8959a;
                                            int i22 = l10.f8961c;
                                            for (int i23 = i7; i23 < i22; i23++) {
                                                ((C0504n) objArr3[i23]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i7 = 0;
                                        j = AbstractC0688o.j(interfaceC0695v.b(), abstractC0682i);
                                    }
                                    i16 = (((i16 * 31) + System.identityHashCode(j)) * 31) + Long.hashCode(j.f12435a);
                                }
                                i12 = 8;
                            } else {
                                i12 = i18;
                            }
                            j10 >>= i12;
                            i20++;
                            i18 = i12;
                            i13 = 1;
                        }
                        i10 = 0;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        i10 = 0;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    i13 = 1;
                    c11 = 7;
                }
                i11 = i16;
            } else {
                i10 = 0;
                i11 = 7;
            }
            Object[] objArr4 = l10.f8959a;
            int i24 = l10.f8961c;
            for (int i25 = i10; i25 < i24; i25++) {
                ((C0504n) objArr4[i25]).a();
            }
            return i11;
        } catch (Throwable th2) {
            th = th2;
            i7 = 0;
        }
    }
}
