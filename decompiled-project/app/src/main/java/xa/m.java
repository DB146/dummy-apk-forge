package xa;

import jb.InterfaceC1393d;
import ma.C1652c;
import y9.G;

/* loaded from: classes2.dex */
public final class m implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26307b;

    public /* synthetic */ m(n nVar, int i7) {
        this.f26306a = i7;
        this.f26307b = nVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f26306a) {
            case 0:
                C1652c it = (C1652c) obj;
                kotlin.jvm.internal.l.e(it, "it");
                this.f26307b.c().l(new G(it));
                kotlin.jvm.internal.l.d(new G8.m().f(it), "toJson(...)");
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                n t5 = this.f26307b;
                kotlin.jvm.internal.l.e(t5, "t");
                A3.c.r(it2, t5.c());
                return;
        }
    }
}
