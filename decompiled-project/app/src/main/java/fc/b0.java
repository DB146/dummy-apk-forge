package fc;

import cc.C0944m;
import gc.AbstractC1207b;
import gc.AbstractC1208c;
import gc.AbstractC1209d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class b0 extends AbstractC1207b implements J, InterfaceC1161h, gc.w {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17131f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public int f17132e;

    public b0(Object obj) {
        this._state = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c7, B:31:0x00df, B:37:0x00f3, B:33:0x00ea, B:36:0x00f0, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c7, B:31:0x00df, B:37:0x00f3, B:33:0x00ea, B:36:0x00f0, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c6 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // fc.InterfaceC1161h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(fc.InterfaceC1162i r17, Hb.d r18) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.b0.a(fc.i, Hb.d):java.lang.Object");
    }

    @Override // gc.w
    public final InterfaceC1161h b(Hb.i iVar, int i7, int i10) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || i10 != 2) ? Q.l(this, iVar, i7, i10) : this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gc.d, java.lang.Object] */
    @Override // gc.AbstractC1207b
    public final AbstractC1209d d() {
        return new Object();
    }

    @Override // gc.AbstractC1207b
    public final AbstractC1209d[] e() {
        return new c0[2];
    }

    @Override // fc.I, fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        i(obj);
        return Db.q.f3365a;
    }

    @Override // fc.Z
    public final Object getValue() {
        R7.a aVar = AbstractC1208c.f17506b;
        Object obj = f17131f.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        R7.a aVar = AbstractC1208c.f17506b;
        if (obj == null) {
            obj = aVar;
        }
        if (obj2 == null) {
            obj2 = aVar;
        }
        return j(obj, obj2);
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = AbstractC1208c.f17506b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i7;
        AbstractC1209d[] abstractC1209dArr;
        R7.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17131f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f17132e;
            if ((i10 & 1) != 0) {
                this.f17132e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f17132e = i11;
            AbstractC1209d[] abstractC1209dArr2 = this.f17501a;
            while (true) {
                c0[] c0VarArr = (c0[]) abstractC1209dArr2;
                if (c0VarArr != null) {
                    for (c0 c0Var : c0VarArr) {
                        if (c0Var != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c0.f17135a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(c0Var);
                                if (obj4 != null && obj4 != (aVar = Q.f17100c)) {
                                    R7.a aVar2 = Q.f17099b;
                                    if (obj4 != aVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, obj4, aVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(c0Var) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0944m) obj4).resumeWith(Db.q.f3365a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, obj4, aVar)) {
                                        if (atomicReferenceFieldUpdater2.get(c0Var) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f17132e;
                    if (i7 == i11) {
                        this.f17132e = i11 + 1;
                        return true;
                    }
                    abstractC1209dArr = this.f17501a;
                }
                abstractC1209dArr2 = abstractC1209dArr;
                i11 = i7;
            }
        }
    }
}
