package l2;

/* renamed from: l2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480y {

    /* renamed from: a, reason: collision with root package name */
    public EnumC1474s f19237a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1477v f19238b;

    public final void a(InterfaceC1479x interfaceC1479x, r rVar) {
        EnumC1474s a9 = rVar.a();
        EnumC1474s state1 = this.f19237a;
        kotlin.jvm.internal.l.e(state1, "state1");
        if (a9.compareTo(state1) < 0) {
            state1 = a9;
        }
        this.f19237a = state1;
        this.f19238b.onStateChanged(interfaceC1479x, rVar);
        this.f19237a = a9;
    }
}
