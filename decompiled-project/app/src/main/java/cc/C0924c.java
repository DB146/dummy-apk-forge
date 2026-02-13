package cc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0924c extends AbstractC0945m0 {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14520v = AtomicReferenceFieldUpdater.newUpdater(C0924c.class, Object.class, "_disposer");
    private volatile Object _disposer;

    /* renamed from: e, reason: collision with root package name */
    public final C0944m f14521e;

    /* renamed from: f, reason: collision with root package name */
    public S f14522f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0928e f14523u;

    public C0924c(C0928e c0928e, C0944m c0944m) {
        this.f14523u = c0928e;
        this.f14521e = c0944m;
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return Db.q.f3365a;
    }

    @Override // cc.AbstractC0945m0
    public final void l(Throwable th) {
        C0944m c0944m = this.f14521e;
        if (th != null) {
            c0944m.getClass();
            R7.a D10 = c0944m.D(new C0955v(false, th), null);
            if (D10 != null) {
                c0944m.j(D10);
                C0926d c0926d = (C0926d) f14520v.get(this);
                if (c0926d != null) {
                    c0926d.c();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0928e.f14527b;
        C0928e c0928e = this.f14523u;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0928e) == 0) {
            I[] iArr = c0928e.f14528a;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (I i7 : iArr) {
                arrayList.add(i7.getCompleted());
            }
            c0944m.resumeWith(arrayList);
        }
    }
}
