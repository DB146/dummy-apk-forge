package H0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f4564a;

    /* renamed from: b, reason: collision with root package name */
    public final Rb.e f4565b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4566c;

    public /* synthetic */ t(String str) {
        this(str, p.f4515D);
    }

    public t(String str, Rb.e eVar) {
        this.f4564a = str;
        this.f4565b = eVar;
    }

    public t(String str, boolean z8, Rb.e eVar) {
        this(str, eVar);
        this.f4566c = z8;
    }

    public final void a(i iVar, Object obj) {
        iVar.z(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f4564a;
    }
}
