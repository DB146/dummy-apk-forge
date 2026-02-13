package Ba;

import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.Map;
import jb.InterfaceC1393d;
import y9.G;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2248b;

    public /* synthetic */ e(h hVar, int i7) {
        this.f2247a = i7;
        this.f2248b = hVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f2247a) {
            case 0:
                TVChannelLinkStream it = (TVChannelLinkStream) obj;
                kotlin.jvm.internal.l.e(it, "it");
                this.f2248b.c().l(new G(it));
                return;
            case 1:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                it2.getMessage();
                h t5 = this.f2248b;
                kotlin.jvm.internal.l.e(t5, "t");
                A3.c.r(it2, t5.c());
                return;
            case 2:
                M9.b it3 = (M9.b) obj;
                kotlin.jvm.internal.l.e(it3, "it");
                String.valueOf(it3);
                h t10 = this.f2248b;
                kotlin.jvm.internal.l.e(t10, "t");
                t10.c().l(new G(it3));
                return;
            default:
                Map it4 = (Map) obj;
                kotlin.jvm.internal.l.e(it4, "it");
                this.f2248b.b().l(new G(it4));
                return;
        }
    }
}
