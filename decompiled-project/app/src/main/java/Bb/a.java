package Bb;

import gb.l;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a extends AtomicBoolean implements InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final l f2293a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2294b;

    public a(l lVar, b bVar) {
        this.f2293a = lVar;
        this.f2294b = bVar;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (compareAndSet(false, true)) {
            this.f2294b.r(this);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get();
    }
}
