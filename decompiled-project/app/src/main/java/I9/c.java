package I9;

import java.util.List;
import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;
import l2.H;
import va.C2161e;
import y9.G;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2161e f5318b;

    public /* synthetic */ c(C2161e c2161e, int i7) {
        this.f5317a = i7;
        this.f5318b = c2161e;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f5317a) {
            case 0:
                W9.c it = (W9.c) obj;
                l.e(it, "it");
                ((H) this.f5318b.f25321i.getValue()).l(new G(it));
                return;
            default:
                List it2 = (List) obj;
                l.e(it2, "it");
                this.f5318b.b().l(new G(it2));
                return;
        }
    }
}
