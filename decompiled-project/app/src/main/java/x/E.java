package x;

import u.C2042E;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f25913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(O o10, int i7) {
        super(1);
        this.f25912a = i7;
        this.f25913b = o10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f25912a) {
            case 0:
                long longValue = ((Number) obj).longValue();
                O o10 = this.f25913b;
                long j = longValue - o10.f25974z;
                o10.f25974z = longValue;
                long G9 = Tb.a.G(j / o10.f25962D);
                C2042E c2042e = o10.f25959A;
                if (c2042e.h()) {
                    Object[] objArr = c2042e.f24584a;
                    int i7 = c2042e.f24585b;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        D d10 = (D) objArr[i11];
                        O.L(o10, d10, G9);
                        d10.f25907c = true;
                    }
                    i0 i0Var = o10.f25967e;
                    if (i0Var != null) {
                        i0Var.o();
                    }
                    int i12 = c2042e.f24585b;
                    Object[] objArr2 = c2042e.f24584a;
                    Xb.g I6 = h3.H.I(0, i12);
                    int i13 = I6.f11025a;
                    int i14 = I6.f11026b;
                    if (i13 <= i14) {
                        while (true) {
                            objArr2[i13 - i10] = objArr2[i13];
                            if (((D) objArr2[i13]).f25907c) {
                                i10++;
                            }
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    Eb.n.U(objArr2, null, i12 - i10, i12);
                    c2042e.f24585b -= i10;
                }
                D d11 = o10.f25960B;
                if (d11 != null) {
                    d11.g = o10.f25968f;
                    O.L(o10, d11, G9);
                    o10.T(d11.f25908d);
                    if (d11.f25908d == 1.0f) {
                        o10.f25960B = null;
                    }
                    o10.S();
                }
                return Db.q.f3365a;
            default:
                this.f25913b.f25974z = ((Number) obj).longValue();
                return Db.q.f3365a;
        }
    }
}
