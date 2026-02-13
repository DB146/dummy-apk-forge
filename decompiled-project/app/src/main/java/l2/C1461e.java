package l2;

import java.util.HashMap;

/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461e implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19211a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19212b;

    public /* synthetic */ C1461e(Object obj, int i7) {
        this.f19211a = i7;
        this.f19212b = obj;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        switch (this.f19211a) {
            case 0:
                new HashMap();
                InterfaceC1469m[] interfaceC1469mArr = (InterfaceC1469m[]) this.f19212b;
                if (interfaceC1469mArr.length > 0) {
                    InterfaceC1469m interfaceC1469m = interfaceC1469mArr[0];
                    throw null;
                }
                if (interfaceC1469mArr.length <= 0) {
                    return;
                }
                InterfaceC1469m interfaceC1469m2 = interfaceC1469mArr[0];
                throw null;
            default:
                if (rVar == r.ON_CREATE) {
                    interfaceC1479x.w().f(this);
                    ((S) this.f19212b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + rVar).toString());
                }
        }
    }
}
