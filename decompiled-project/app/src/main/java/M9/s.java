package M9;

import java.util.List;
import jb.InterfaceC1393d;
import y.S;

/* loaded from: classes2.dex */
public final class s implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6902c;

    public /* synthetic */ s(t tVar, d dVar, int i7) {
        this.f6900a = i7;
        this.f6901b = tVar;
        this.f6902c = dVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f6900a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                d dVar = this.f6902c;
                String message = S.b("Offline ", dVar.f6851b, " success");
                t t5 = this.f6901b;
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                t5.h().remove(dVar.f6851b);
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                d dVar2 = this.f6902c;
                String message2 = X.c.t("Error ", dVar2.f6851b);
                t t10 = this.f6901b;
                kotlin.jvm.internal.l.e(t10, "t");
                kotlin.jvm.internal.l.e(message2, "message");
                t10.g().put(dVar2.f6851b, o.f6889b);
                return;
        }
    }
}
