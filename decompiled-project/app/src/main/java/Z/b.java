package Z;

import A0.J;
import Q.S;
import Q.v0;
import a0.InterfaceC0689p;

/* loaded from: classes.dex */
public final class b implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public m f12073a;

    /* renamed from: b, reason: collision with root package name */
    public j f12074b;

    /* renamed from: c, reason: collision with root package name */
    public String f12075c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12076d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f12077e;

    /* renamed from: f, reason: collision with root package name */
    public i f12078f;

    /* renamed from: u, reason: collision with root package name */
    public final J f12079u = new J(this, 15);

    public b(m mVar, j jVar, String str, Object obj, Object[] objArr) {
        this.f12073a = mVar;
        this.f12074b = jVar;
        this.f12075c = str;
        this.f12076d = obj;
        this.f12077e = objArr;
    }

    public final void a() {
        String o10;
        j jVar = this.f12074b;
        if (this.f12078f != null) {
            throw new IllegalArgumentException(("entry(" + this.f12078f + ") is not null").toString());
        }
        if (jVar != null) {
            J j = this.f12079u;
            Object invoke = j.invoke();
            if (invoke == null || jVar.b(invoke)) {
                this.f12078f = jVar.a(this.f12075c, j);
                return;
            }
            if (invoke instanceof InterfaceC0689p) {
                InterfaceC0689p interfaceC0689p = (InterfaceC0689p) invoke;
                if (interfaceC0689p.a() == S.f8365c || interfaceC0689p.a() == S.f8368f || interfaceC0689p.a() == S.f8366d) {
                    o10 = "MutableState containing " + interfaceC0689p.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    o10 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                o10 = c2.i.o(invoke);
            }
            throw new IllegalArgumentException(o10);
        }
    }

    @Override // Q.v0
    public final void b() {
        a();
    }

    @Override // Q.v0
    public final void c() {
        i iVar = this.f12078f;
        if (iVar != null) {
            ((Q7.h) iVar).X();
        }
    }

    @Override // Q.v0
    public final void d() {
        i iVar = this.f12078f;
        if (iVar != null) {
            ((Q7.h) iVar).X();
        }
    }
}
