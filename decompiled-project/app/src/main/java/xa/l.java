package xa;

import jb.InterfaceC1393d;
import ma.C1652c;
import y9.G;

/* loaded from: classes2.dex */
public final class l implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26305b;

    public /* synthetic */ l(n nVar, int i7) {
        this.f26304a = i7;
        this.f26305b = nVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f26304a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                A3.c.r(it, this.f26305b.d());
                return;
            default:
                C1652c it2 = (C1652c) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                this.f26305b.c().l(new G(it2));
                kotlin.jvm.internal.l.d(new G8.m().f(it2), "toJson(...)");
                return;
        }
    }
}
