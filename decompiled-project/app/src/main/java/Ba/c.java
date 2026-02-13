package Ba;

import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.Map;
import jb.InterfaceC1393d;
import y9.G;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2244b;

    public /* synthetic */ c(h hVar, int i7) {
        this.f2243a = i7;
        this.f2244b = hVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f2243a) {
            case 0:
                Map it = (Map) obj;
                kotlin.jvm.internal.l.e(it, "it");
                this.f2244b.b().l(new G(it));
                return;
            case 1:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                it2.getMessage();
                h t5 = this.f2244b;
                kotlin.jvm.internal.l.e(t5, "t");
                A3.c.r(it2, t5.c());
                return;
            case 2:
                TVChannelLinkStream it3 = (TVChannelLinkStream) obj;
                kotlin.jvm.internal.l.e(it3, "it");
                this.f2244b.c().l(new G(it3));
                return;
            case 3:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it4, "it");
                it4.getMessage();
                h t10 = this.f2244b;
                kotlin.jvm.internal.l.e(t10, "t");
                A3.c.r(it4, t10.c());
                return;
            default:
                Throwable it5 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it5, "it");
                A3.c.r(it5, this.f2244b.b());
                return;
        }
    }
}
