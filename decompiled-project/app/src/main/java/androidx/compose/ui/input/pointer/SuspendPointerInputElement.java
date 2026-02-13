package androidx.compose.ui.input.pointer;

import A0.AbstractC0012d0;
import c0.l;
import c2.q;
import u0.y;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13200a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13201b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f13202c;

    public SuspendPointerInputElement(Object obj, q qVar, PointerInputEventHandler pointerInputEventHandler, int i7) {
        qVar = (i7 & 2) != 0 ? null : qVar;
        this.f13200a = obj;
        this.f13201b = qVar;
        this.f13202c = pointerInputEventHandler;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        return new y(this.f13200a, this.f13201b, this.f13202c);
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        y yVar = (y) lVar;
        Object obj = yVar.f24811C;
        Object obj2 = this.f13200a;
        boolean z8 = !kotlin.jvm.internal.l.a(obj, obj2);
        yVar.f24811C = obj2;
        Object obj3 = yVar.f24812D;
        Object obj4 = this.f13201b;
        if (!kotlin.jvm.internal.l.a(obj3, obj4)) {
            z8 = true;
        }
        yVar.f24812D = obj4;
        Class<?> cls = yVar.f24813E.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f13202c;
        if (cls == pointerInputEventHandler.getClass() ? z8 : true) {
            yVar.q0();
        }
        yVar.f24813E = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return this.f13200a.equals(suspendPointerInputElement.f13200a) && kotlin.jvm.internal.l.a(this.f13201b, suspendPointerInputElement.f13201b) && this.f13202c == suspendPointerInputElement.f13202c;
    }

    public final int hashCode() {
        int hashCode = this.f13200a.hashCode() * 31;
        Object obj = this.f13201b;
        return this.f13202c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
