package fc;

import gc.AbstractC1212g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: fc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157d extends AbstractC1212g {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17136f = AtomicIntegerFieldUpdater.newUpdater(C1157d.class, "consumed");
    private volatile int consumed;

    /* renamed from: d, reason: collision with root package name */
    public final ec.d f17137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17138e;

    public /* synthetic */ C1157d(ec.d dVar, boolean z8) {
        this(dVar, z8, Hb.j.f4919a, -3, 1);
    }

    public C1157d(ec.d dVar, boolean z8, Hb.i iVar, int i7, int i10) {
        super(iVar, i7, i10);
        this.f17137d = dVar;
        this.f17138e = z8;
        this.consumed = 0;
    }

    @Override // gc.AbstractC1212g, fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        Db.q qVar = Db.q.f3365a;
        if (this.f17516b != -3) {
            Object a9 = super.a(interfaceC1162i, dVar);
            return a9 == Ib.a.f5345a ? a9 : qVar;
        }
        boolean z8 = this.f17138e;
        if (z8 && f17136f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object i7 = Q.i(interfaceC1162i, this.f17137d, z8, dVar);
        return i7 == Ib.a.f5345a ? i7 : qVar;
    }

    @Override // gc.AbstractC1212g
    public final String c() {
        return "channel=" + this.f17137d;
    }

    @Override // gc.AbstractC1212g
    public final Object d(ec.r rVar, Hb.d dVar) {
        Object i7 = Q.i(new gc.D(rVar), this.f17137d, this.f17138e, dVar);
        return i7 == Ib.a.f5345a ? i7 : Db.q.f3365a;
    }

    @Override // gc.AbstractC1212g
    public final AbstractC1212g e(Hb.i iVar, int i7, int i10) {
        return new C1157d(this.f17137d, this.f17138e, iVar, i7, i10);
    }

    @Override // gc.AbstractC1212g
    public final InterfaceC1161h f() {
        return new C1157d(this.f17137d, this.f17138e);
    }

    @Override // gc.AbstractC1212g
    public final ec.t g(cc.E e2) {
        if (!this.f17138e || f17136f.getAndSet(this, 1) == 0) {
            return this.f17516b == -3 ? this.f17137d : super.g(e2);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }
}
