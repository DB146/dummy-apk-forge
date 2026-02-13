package F;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f3914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(L l10, int i7) {
        super(1);
        this.f3913a = i7;
        this.f3914b = l10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f3913a) {
            case 0:
                E.j jVar = (E.j) this.f3914b.f3918C.invoke();
                int b2 = jVar.b();
                int i7 = 0;
                while (true) {
                    if (i7 >= b2) {
                        i7 = -1;
                    } else if (!jVar.c(i7).equals(obj)) {
                        i7++;
                    }
                }
                return Integer.valueOf(i7);
            default:
                int intValue = ((Number) obj).intValue();
                L l10 = this.f3914b;
                E.j jVar2 = (E.j) l10.f3918C.invoke();
                if (intValue < 0 || intValue >= jVar2.b()) {
                    StringBuilder r10 = h3.o.r(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    r10.append(jVar2.b());
                    r10.append(')');
                    B.a.a(r10.toString());
                }
                cc.F.B(l10.d0(), null, 0, new K(l10, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
