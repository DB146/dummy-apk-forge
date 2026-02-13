package g9;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final String f17467c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17468d;

    public c(V8.a aVar, String str, String str2) {
        super(aVar);
        this.f17467c = str2;
        this.f17468d = str;
    }

    @Override // B0.AbstractC0169c
    public final String k() {
        if (((V8.a) this.f1861a).f10193b != 84) {
            throw P8.j.a();
        }
        StringBuilder sb2 = new StringBuilder();
        o(8, sb2);
        s(sb2, 48, 20);
        int v10 = Q7.h.v(68, 16, (V8.a) ((Q7.h) this.f1862b).f8695b);
        if (v10 != 38400) {
            sb2.append('(');
            sb2.append(this.f17467c);
            sb2.append(')');
            int i7 = v10 % 32;
            int i10 = v10 / 32;
            int i11 = (i10 % 12) + 1;
            int i12 = i10 / 12;
            if (i12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i12);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i7 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i7);
        }
        return sb2.toString();
    }

    @Override // g9.e
    public final void q(int i7, StringBuilder sb2) {
        sb2.append('(');
        sb2.append(this.f17468d);
        sb2.append(i7 / 100000);
        sb2.append(')');
    }

    @Override // g9.e
    public final int r(int i7) {
        return i7 % 100000;
    }
}
