package g9;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(V8.a aVar, int i7) {
        super(aVar);
        this.f17465c = i7;
    }

    @Override // B0.AbstractC0169c
    public final String k() {
        if (((V8.a) this.f1861a).f10193b != 60) {
            throw P8.j.a();
        }
        StringBuilder sb2 = new StringBuilder();
        o(5, sb2);
        s(sb2, 45, 15);
        return sb2.toString();
    }

    @Override // g9.e
    public final void q(int i7, StringBuilder sb2) {
        switch (this.f17465c) {
            case 0:
                sb2.append("(3103)");
                return;
            default:
                if (i7 < 10000) {
                    sb2.append("(3202)");
                    return;
                } else {
                    sb2.append("(3203)");
                    return;
                }
        }
    }

    @Override // g9.e
    public final int r(int i7) {
        switch (this.f17465c) {
            case 0:
                return i7;
            default:
                return i7 < 10000 ? i7 : i7 - 10000;
        }
    }
}
