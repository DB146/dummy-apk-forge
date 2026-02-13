package xa;

import java.util.List;
import jb.InterfaceC1393d;
import y9.G;

/* loaded from: classes2.dex */
public final class k implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26303b;

    public /* synthetic */ k(n nVar, int i7) {
        this.f26302a = i7;
        this.f26303b = nVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f26302a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                this.f26303b.d().l(new G(it));
                kotlin.jvm.internal.l.d(new G8.m().f(it), "toJson(...)");
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                A3.c.r(it2, this.f26303b.c());
                return;
        }
    }
}
