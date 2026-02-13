package gc;

import B0.C0165a;
import fc.InterfaceC1162i;

/* renamed from: gc.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1205A extends Jb.c implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1162i f17487a;

    /* renamed from: b, reason: collision with root package name */
    public final Hb.i f17488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17489c;

    /* renamed from: d, reason: collision with root package name */
    public Hb.i f17490d;

    /* renamed from: e, reason: collision with root package name */
    public Hb.d f17491e;

    public C1205A(InterfaceC1162i interfaceC1162i, Hb.i iVar) {
        super(x.f17562a, Hb.j.f4919a);
        this.f17487a = interfaceC1162i;
        this.f17488b = iVar;
        this.f17489c = ((Number) iVar.fold(0, z.f17564a)).intValue();
    }

    public final Object c(Hb.d dVar, Object obj) {
        Hb.i context = dVar.getContext();
        cc.F.m(context);
        Hb.i iVar = this.f17490d;
        if (iVar != context) {
            if (iVar instanceof v) {
                throw new IllegalStateException(ac.h.Q("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v) iVar).f17560a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new C0165a(this, 8))).intValue() != this.f17489c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f17488b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f17490d = context;
        }
        this.f17491e = dVar;
        B b2 = C.f17493a;
        InterfaceC1162i interfaceC1162i = this.f17487a;
        kotlin.jvm.internal.l.c(interfaceC1162i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        b2.getClass();
        Object emit = interfaceC1162i.emit(obj, this);
        if (!kotlin.jvm.internal.l.a(emit, Ib.a.f5345a)) {
            this.f17491e = null;
        }
        return emit;
    }

    @Override // fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        try {
            Object c10 = c(dVar, obj);
            return c10 == Ib.a.f5345a ? c10 : Db.q.f3365a;
        } catch (Throwable th) {
            this.f17490d = new v(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // Jb.a, Jb.d
    public final Jb.d getCallerFrame() {
        Hb.d dVar = this.f17491e;
        if (dVar instanceof Jb.d) {
            return (Jb.d) dVar;
        }
        return null;
    }

    @Override // Jb.c, Hb.d
    public final Hb.i getContext() {
        Hb.i iVar = this.f17490d;
        return iVar == null ? Hb.j.f4919a : iVar;
    }

    @Override // Jb.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Throwable a9 = Db.m.a(obj);
        if (a9 != null) {
            this.f17490d = new v(getContext(), a9);
        }
        Hb.d dVar = this.f17491e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return Ib.a.f5345a;
    }
}
