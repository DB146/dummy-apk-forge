package u0;

import N.C;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2089s implements PointerInputEventHandler, kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f24798a;

    public C2089s(C c10) {
        this.f24798a = c10;
    }

    @Override // kotlin.jvm.internal.g
    public final Db.c a() {
        return this.f24798a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.g)) {
            return this.f24798a.equals(((kotlin.jvm.internal.g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f24798a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC2083m interfaceC2083m, Hb.d dVar) {
        this.f24798a.invoke(interfaceC2083m, dVar);
        return Db.q.f3365a;
    }
}
