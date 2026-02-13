package M1;

import java.util.LinkedHashSet;

/* renamed from: M1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399n extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0399n(Q q10, int i7) {
        super(0);
        this.f6704a = i7;
        this.f6705b = q10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f6704a) {
            case 0:
                return ((O1.i) this.f6705b.j.getValue()).f7453c;
            default:
                O1.f fVar = this.f6705b.f6621a;
                String E10 = ((rc.z) fVar.f7437d.getValue()).f24007a.E();
                synchronized (O1.f.f7433f) {
                    LinkedHashSet linkedHashSet = O1.f.f7432e;
                    if (linkedHashSet.contains(E10)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + E10 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(E10);
                }
                return new O1.i(fVar.f7434a, (rc.z) fVar.f7437d.getValue(), (a0) fVar.f7435b.invoke((rc.z) fVar.f7437d.getValue(), fVar.f7434a), new O1.e(fVar, 1));
        }
    }
}
