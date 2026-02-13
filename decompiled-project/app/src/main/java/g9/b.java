package g9;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(V8.a aVar, int i7) {
        super(aVar);
        this.f17466c = i7;
    }

    @Override // B0.AbstractC0169c
    public final String k() {
        switch (this.f17466c) {
            case 0:
                if (((V8.a) this.f1861a).f10193b < 48) {
                    throw P8.j.a();
                }
                StringBuilder sb2 = new StringBuilder();
                o(8, sb2);
                Q7.h hVar = (Q7.h) this.f1862b;
                int v10 = Q7.h.v(48, 2, (V8.a) hVar.f8695b);
                sb2.append("(392");
                sb2.append(v10);
                sb2.append(')');
                sb2.append(hVar.r(50, null).f17470c);
                return sb2.toString();
            case 1:
                if (((V8.a) this.f1861a).f10193b < 48) {
                    throw P8.j.a();
                }
                StringBuilder sb3 = new StringBuilder();
                o(8, sb3);
                Q7.h hVar2 = (Q7.h) this.f1862b;
                int v11 = Q7.h.v(48, 2, (V8.a) hVar2.f8695b);
                sb3.append("(393");
                sb3.append(v11);
                sb3.append(')');
                int v12 = Q7.h.v(50, 10, (V8.a) hVar2.f8695b);
                if (v12 / 100 == 0) {
                    sb3.append('0');
                }
                if (v12 / 10 == 0) {
                    sb3.append('0');
                }
                sb3.append(v12);
                sb3.append(hVar2.r(60, null).f17470c);
                return sb3.toString();
            default:
                StringBuilder m10 = X.c.m("(01)");
                int length = m10.length();
                Q7.h hVar3 = (Q7.h) this.f1862b;
                m10.append(Q7.h.v(4, 4, (V8.a) hVar3.f8695b));
                p(m10, 8, length);
                return hVar3.q(48, m10);
        }
    }
}
