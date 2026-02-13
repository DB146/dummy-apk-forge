package w;

import Q.R0;
import x.AbstractC2232b;
import x.InterfaceC2249t;
import x.c0;

/* renamed from: w.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2185l extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2186m f25584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2185l(C2186m c2186m, long j, int i7) {
        super(1);
        this.f25583a = i7;
        this.f25584b = c2186m;
        this.f25585c = j;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long j;
        long j10;
        switch (this.f25583a) {
            case 0:
                c0 c0Var = (c0) obj;
                Object a9 = c0Var.a();
                C2186m c2186m = this.f25584b;
                if (kotlin.jvm.internal.l.a(a9, c2186m.f25588E.a())) {
                    j = V0.k.a(c2186m.f25589F, androidx.compose.animation.a.f13122a) ? this.f25585c : c2186m.f25589F;
                } else {
                    R0 r02 = (R0) c2186m.f25588E.f25593d.g(c0Var.a());
                    j = r02 != null ? ((V0.k) r02.getValue()).f9981a : 0L;
                }
                R0 r03 = (R0) c2186m.f25588E.f25593d.g(c0Var.c());
                long j11 = r03 != null ? ((V0.k) r03.getValue()).f9981a : 0L;
                T t5 = (T) c2186m.f25587D.getValue();
                if (t5 != null) {
                    InterfaceC2249t interfaceC2249t = (InterfaceC2249t) t5.f25538a.invoke(new V0.k(j), new V0.k(j11));
                    if (interfaceC2249t != null) {
                        return interfaceC2249t;
                    }
                }
                return AbstractC2232b.j(5, null);
            default:
                C2186m c2186m2 = this.f25584b;
                if (kotlin.jvm.internal.l.a(obj, c2186m2.f25588E.a())) {
                    j10 = V0.k.a(c2186m2.f25589F, androidx.compose.animation.a.f13122a) ? this.f25585c : c2186m2.f25589F;
                } else {
                    R0 r04 = (R0) c2186m2.f25588E.f25593d.g(obj);
                    j10 = r04 != null ? ((V0.k) r04.getValue()).f9981a : 0L;
                }
                return new V0.k(j10);
        }
    }
}
