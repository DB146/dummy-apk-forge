package B0;

import A0.InterfaceC0024m;
import h0.C1229p;
import java.util.List;

/* renamed from: B0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210x extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f2013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0210x(kotlin.jvm.internal.v vVar, int i7) {
        super(1);
        this.f2012a = i7;
        this.f2013b = vVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        boolean z8;
        switch (this.f2012a) {
            case 0:
                this.f2013b.f19134a = (C1229p) obj;
                return Boolean.TRUE;
            case 1:
                A0.E0 e02 = (A0.E0) obj;
                kotlin.jvm.internal.l.c(e02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                F.D d10 = ((F.W) e02).f3956C;
                kotlin.jvm.internal.v vVar = this.f2013b;
                List list = (List) vVar.f19134a;
                if (list != null) {
                    list.add(d10);
                } else {
                    list = y7.u0.B(d10);
                }
                vVar.f19134a = list;
                return A0.D0.f17b;
            default:
                InterfaceC0024m interfaceC0024m = (A0.E0) obj;
                if (((c0.l) interfaceC0024m).f14113a.f14112B) {
                    this.f2013b.f19134a = interfaceC0024m;
                    z8 = false;
                } else {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
        }
    }
}
