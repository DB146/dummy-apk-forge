package m3;

import android.net.ConnectivityManager;
import fc.C1156c;
import h3.C1243e;
import n3.InterfaceC1700e;
import q3.p;

/* loaded from: classes.dex */
public final class f implements InterfaceC1700e {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f19786a;

    public f(ConnectivityManager connectivityManager) {
        this.f19786a = connectivityManager;
    }

    @Override // n3.InterfaceC1700e
    public final C1156c a(C1243e constraints) {
        kotlin.jvm.internal.l.e(constraints, "constraints");
        return new C1156c(new e(constraints, this, null), Hb.j.f4919a, -2, 1);
    }

    @Override // n3.InterfaceC1700e
    public final boolean b(p workSpec) {
        kotlin.jvm.internal.l.e(workSpec, "workSpec");
        return workSpec.j.f17683b.f23664a != null;
    }

    @Override // n3.InterfaceC1700e
    public final boolean c(p pVar) {
        if (b(pVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
