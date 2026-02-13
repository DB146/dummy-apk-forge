package zc;

/* loaded from: classes2.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f28382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28384c;

    public i(String str, int i7, String str2, boolean z8) {
        this.f28384c = i7;
        vc.i.A(str);
        vc.i.A(str2);
        this.f28382a = wc.c.d(str);
        boolean z10 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z10 ? str2.substring(1, str2.length() - 1) : str2;
        this.f28383b = z8 ? wc.c.d(str2) : z10 ? wc.c.c(str2) : wc.c.d(str2);
    }

    @Override // zc.p
    public final int a() {
        switch (this.f28384c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        switch (this.f28384c) {
            case 0:
                String str = this.f28382a;
                if (lVar2.I(str)) {
                    if (this.f28383b.equalsIgnoreCase(lVar2.o(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = this.f28382a;
                return lVar2.I(str2) && wc.c.c(lVar2.o(str2)).contains(this.f28383b);
            case 2:
                String str3 = this.f28382a;
                return lVar2.I(str3) && wc.c.c(lVar2.o(str3)).endsWith(this.f28383b);
            case 3:
                return !this.f28383b.equalsIgnoreCase(lVar2.o(this.f28382a));
            default:
                String str4 = this.f28382a;
                return lVar2.I(str4) && wc.c.c(lVar2.o(str4)).startsWith(this.f28383b);
        }
    }

    public final String toString() {
        switch (this.f28384c) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(this.f28382a);
                sb2.append("=");
                return h3.o.p(sb2, this.f28383b, "]");
            case 1:
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(this.f28382a);
                sb3.append("*=");
                return h3.o.p(sb3, this.f28383b, "]");
            case 2:
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append(this.f28382a);
                sb4.append("$=");
                return h3.o.p(sb4, this.f28383b, "]");
            case 3:
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(this.f28382a);
                sb5.append("!=");
                return h3.o.p(sb5, this.f28383b, "]");
            default:
                StringBuilder sb6 = new StringBuilder("[");
                sb6.append(this.f28382a);
                sb6.append("^=");
                return h3.o.p(sb6, this.f28383b, "]");
        }
    }
}
