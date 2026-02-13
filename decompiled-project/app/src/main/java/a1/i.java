package a1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f12471a;

    /* renamed from: b, reason: collision with root package name */
    public l f12472b;

    /* renamed from: c, reason: collision with root package name */
    public n f12473c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12474d;

    public final void a(Object obj) {
        this.f12474d = true;
        l lVar = this.f12472b;
        if (lVar == null || !lVar.f12477b.t(obj)) {
            return;
        }
        this.f12471a = null;
        this.f12472b = null;
        this.f12473c = null;
    }

    public final void b(Throwable th) {
        this.f12474d = true;
        l lVar = this.f12472b;
        if (lVar == null || !lVar.f12477b.u(th)) {
            return;
        }
        this.f12471a = null;
        this.f12472b = null;
        this.f12473c = null;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.f12472b;
        if (lVar != null) {
            k kVar = lVar.f12477b;
            if (!kVar.isDone()) {
                kVar.u(new C0701b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f12471a, 1));
            }
        }
        if (this.f12474d || (nVar = this.f12473c) == null) {
            return;
        }
        nVar.t(null);
    }
}
