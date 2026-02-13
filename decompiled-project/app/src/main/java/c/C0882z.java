package c;

/* renamed from: c.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882z implements InterfaceC0858b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0876t f14085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0853A f14086b;

    public C0882z(C0853A c0853a, AbstractC0876t onBackPressedCallback) {
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        this.f14086b = c0853a;
        this.f14085a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Rb.a, kotlin.jvm.internal.j] */
    @Override // c.InterfaceC0858b
    public final void cancel() {
        C0853A c0853a = this.f14086b;
        Eb.l lVar = c0853a.f14008b;
        AbstractC0876t abstractC0876t = this.f14085a;
        lVar.remove(abstractC0876t);
        if (kotlin.jvm.internal.l.a(c0853a.f14009c, abstractC0876t)) {
            abstractC0876t.a();
            c0853a.f14009c = null;
        }
        abstractC0876t.f14069b.remove(this);
        ?? r02 = abstractC0876t.f14070c;
        if (r02 != 0) {
            r02.invoke();
        }
        abstractC0876t.f14070c = null;
    }
}
