package sb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import xb.AbstractC2275c;

/* renamed from: sb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2010d extends AtomicReference implements InterfaceC1269b, gb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24255a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final gb.l f24256b;

    public C2010d(gb.l lVar) {
        this.f24256b = lVar;
    }

    public C2010d(o oVar) {
        this.f24256b = oVar;
    }

    @Override // gb.b
    public final void a() {
        switch (this.f24255a) {
            case 0:
                if (g()) {
                    return;
                }
                try {
                    this.f24256b.a();
                    return;
                } finally {
                    EnumC1437b.a(this);
                }
            default:
                o oVar = (o) this.f24256b;
                oVar.f24312e.a(this);
                oVar.a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f24255a) {
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
        if (obj == null) {
            onError(AbstractC2275c.a("onNext called with a null value."));
        } else {
            if (g()) {
                return;
            }
            this.f24256b.e(obj);
        }
    }

    public boolean e(Throwable th) {
        if (th == null) {
            th = AbstractC2275c.a("onError called with a null Throwable.");
        }
        if (g()) {
            return false;
        }
        try {
            this.f24256b.onError(th);
            EnumC1437b.a(this);
            return true;
        } catch (Throwable th2) {
            EnumC1437b.a(this);
            throw th2;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f24255a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        switch (this.f24255a) {
            case 0:
                if (e(th)) {
                    return;
                }
                com.bumptech.glide.d.t(th);
                return;
            default:
                o oVar = (o) this.f24256b;
                oVar.f24312e.a(this);
                oVar.onError(th);
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f24255a) {
            case 0:
                return X.c.j(C2010d.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }
}
