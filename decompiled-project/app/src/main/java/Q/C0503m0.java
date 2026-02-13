package Q;

import u.C2041D;
import u.C2046I;

/* renamed from: Q.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503m0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0505n0 f8424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2041D f8426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503m0(C0505n0 c0505n0, int i7, C2041D c2041d) {
        super(1);
        this.f8424a = c0505n0;
        this.f8425b = i7;
        this.f8426c = c2041d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        InterfaceC0510q interfaceC0510q;
        InterfaceC0510q interfaceC0510q2;
        int i7;
        InterfaceC0510q interfaceC0510q3 = (InterfaceC0510q) obj;
        C0505n0 c0505n0 = this.f8424a;
        int i10 = c0505n0.f8433e;
        int i11 = this.f8425b;
        if (i10 == i11) {
            C2041D c2041d = c0505n0.f8434f;
            C2041D c2041d2 = this.f8426c;
            if (kotlin.jvm.internal.l.a(c2041d2, c2041d) && (interfaceC0510q3 instanceof C0517u)) {
                long[] jArr = c2041d2.f24578a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j = jArr[i12];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((255 & j) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj2 = c2041d2.f24579b[i16];
                                    boolean z8 = c2041d2.f24580c[i16] != i11;
                                    if (z8) {
                                        C0517u c0517u = (C0517u) interfaceC0510q3;
                                        Q5.e.L(c0517u.f8534u, obj2, c0505n0);
                                        if (obj2 instanceof C) {
                                            C c10 = (C) obj2;
                                            interfaceC0510q2 = interfaceC0510q3;
                                            if (!c0517u.f8534u.c(c10)) {
                                                Q5.e.M(c0517u.f8537x, c10);
                                            }
                                            C2046I c2046i = c0505n0.g;
                                            if (c2046i != null) {
                                                c2046i.j(obj2);
                                            }
                                            if (z8) {
                                                c2041d2.f(i16);
                                            }
                                            i7 = 8;
                                        }
                                    }
                                    interfaceC0510q2 = interfaceC0510q3;
                                    if (z8) {
                                    }
                                    i7 = 8;
                                } else {
                                    interfaceC0510q2 = interfaceC0510q3;
                                    i7 = i13;
                                }
                                j >>= i7;
                                i15++;
                                i13 = i7;
                                interfaceC0510q3 = interfaceC0510q2;
                            }
                            interfaceC0510q = interfaceC0510q3;
                            if (i14 != i13) {
                                break;
                            }
                        } else {
                            interfaceC0510q = interfaceC0510q3;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        interfaceC0510q3 = interfaceC0510q;
                    }
                }
            }
        }
        return Db.q.f3365a;
    }
}
