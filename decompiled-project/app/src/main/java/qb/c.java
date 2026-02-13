package qb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import xb.AbstractC2275c;

/* loaded from: classes2.dex */
public final class c extends AtomicReference implements InterfaceC1269b, gb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23596a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23597b;

    public c(gb.g gVar) {
        this.f23597b = gVar;
    }

    public c(sb.m mVar) {
        this.f23597b = mVar;
    }

    @Override // gb.b
    public void a() {
        sb.m mVar = (sb.m) this.f23597b;
        mVar.f24303e.a(this);
        mVar.a();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23596a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.b, gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        EnumC1437b.j(this, interfaceC1269b);
    }

    public void d(Object obj) {
        InterfaceC1269b interfaceC1269b;
        Object obj2 = get();
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        if (obj2 == enumC1437b || (interfaceC1269b = (InterfaceC1269b) getAndSet(enumC1437b)) == enumC1437b) {
            return;
        }
        gb.g gVar = (gb.g) this.f23597b;
        try {
            if (obj == null) {
                gVar.onError(AbstractC2275c.a("onSuccess called with a null value."));
            } else {
                gVar.onSuccess(obj);
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

    public boolean e(Throwable th) {
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
            ((gb.g) this.f23597b).onError(th);
        } finally {
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23596a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.b, gb.q
    public void onError(Throwable th) {
        sb.m mVar = (sb.m) this.f23597b;
        mVar.f24303e.a(this);
        mVar.onError(th);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f23596a) {
            case 0:
                return X.c.j(c.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }
}
