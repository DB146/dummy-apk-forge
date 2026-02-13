package kb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import jc.C1397a;
import y7.u0;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1436a extends AtomicReference implements InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19069a = 1;

    public /* synthetic */ C1436a() {
    }

    public /* synthetic */ C1436a(Object obj) {
        super(obj);
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        C1397a c1397a;
        switch (this.f19069a) {
            case 0:
                if (get() == null || (c1397a = (C1397a) getAndSet(null)) == null) {
                    return;
                }
                try {
                    c1397a.f18675a.cancel(null);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    com.bumptech.glide.d.t(th);
                    return;
                }
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f19069a) {
            case 0:
                return get() == null;
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }
}
