package I9;

import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;
import l2.H;
import y9.D;
import y9.G;

/* loaded from: classes2.dex */
public final class h implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wa.h f5326b;

    public /* synthetic */ h(wa.h hVar, int i7) {
        this.f5325a = i7;
        this.f5326b = hVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f5325a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                A3.c.r(it, (H) this.f5326b.f5331e.getValue());
                return;
            case 1:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                wa.h hVar = this.f5326b;
                ((H) hVar.f5329c.getValue()).l(new D(it2));
                hVar.a();
                return;
            default:
                M9.b it3 = (M9.b) obj;
                l.e(it3, "it");
                this.f5326b.d().l(new G(it3));
                String.valueOf(it3);
                return;
        }
    }
}
