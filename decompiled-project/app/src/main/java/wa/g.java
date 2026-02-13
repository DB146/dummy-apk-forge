package wa;

import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;
import l2.H;

/* loaded from: classes2.dex */
public final class g implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f25840b;

    public /* synthetic */ g(h hVar, int i7) {
        this.f25839a = i7;
        this.f25840b = hVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f25839a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                A3.c.r(it, (H) this.f25840b.f5331e.getValue());
                return;
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                A3.c.r(it2, (H) this.f25840b.f5329c.getValue());
                return;
        }
    }
}
