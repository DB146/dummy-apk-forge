package Jb;

import cc.A;
import cc.C0944m;
import hc.AbstractC1273a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final Hb.i _context;
    private transient Hb.d<Object> intercepted;

    public c(Hb.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public c(Hb.d dVar, Hb.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // Hb.d
    public Hb.i getContext() {
        Hb.i iVar = this._context;
        l.b(iVar);
        return iVar;
    }

    public final Hb.d<Object> intercepted() {
        Hb.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            Hb.f fVar = (Hb.f) getContext().get(Hb.e.f4918a);
            dVar = fVar != null ? new hc.h((A) fVar, this) : this;
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // Jb.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Hb.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            Hb.g gVar = getContext().get(Hb.e.f4918a);
            l.b(gVar);
            hc.h hVar = (hc.h) dVar;
            do {
                atomicReferenceFieldUpdater = hc.h.f17942v;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC1273a.f17932d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0944m c0944m = obj instanceof C0944m ? (C0944m) obj : null;
            if (c0944m != null) {
                c0944m.o();
            }
        }
        this.intercepted = b.f5767a;
    }
}
