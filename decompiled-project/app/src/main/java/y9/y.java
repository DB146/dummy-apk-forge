package y9;

import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class y implements InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final y f27546b = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final y f27547c = new y(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27548a;

    public /* synthetic */ y(int i7) {
        this.f27548a = i7;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f27548a) {
            case 0:
                Boolean it = (Boolean) obj;
                kotlin.jvm.internal.l.e(it, "it");
                return;
            default:
                Boolean it2 = (Boolean) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                return;
        }
    }
}
