package tb;

import gb.q;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import xb.AbstractC2275c;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2037a extends AtomicReference implements InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final q f24524a;

    public C2037a(q qVar) {
        this.f24524a = qVar;
    }

    public final void a(Throwable th) {
        if (d(th)) {
            return;
        }
        com.bumptech.glide.d.t(th);
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        EnumC1437b.a(this);
    }

    public final void c(Object obj) {
        InterfaceC1269b interfaceC1269b;
        Object obj2 = get();
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        if (obj2 == enumC1437b || (interfaceC1269b = (InterfaceC1269b) getAndSet(enumC1437b)) == enumC1437b) {
            return;
        }
        q qVar = this.f24524a;
        try {
            if (obj == null) {
                qVar.onError(AbstractC2275c.a("onSuccess called with a null value."));
            } else {
                qVar.onSuccess(obj);
            }
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
        } catch (Throwable th) {
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
            throw th;
        }
    }

    public final boolean d(Throwable th) {
        InterfaceC1269b interfaceC1269b;
        if (th == null) {
            th = AbstractC2275c.a("onError called with a null Throwable.");
        }
        Object obj = get();
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        if (obj == enumC1437b || (interfaceC1269b = (InterfaceC1269b) getAndSet(enumC1437b)) == enumC1437b) {
            return false;
        }
        try {
            this.f24524a.onError(th);
        } finally {
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return EnumC1437b.d((InterfaceC1269b) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return X.c.j(C2037a.class.getSimpleName(), "{", super.toString(), "}");
    }
}
