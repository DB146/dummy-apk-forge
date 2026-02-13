package xc;

import androidx.datastore.preferences.protobuf.C0801d;

/* loaded from: classes2.dex */
public final class y extends p {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26386e;

    public y(String str, boolean z8) {
        super(str);
        this.f26386e = z8;
    }

    @Override // xc.q
    public final q E() {
        return (y) super.E();
    }

    @Override // xc.q
    public final String N() {
        return "#declaration";
    }

    @Override // xc.q
    public final void R(wc.c cVar, f fVar) {
        wc.c b2 = cVar.b("<");
        boolean z8 = this.f26386e;
        b2.b(z8 ? "!" : "?").b(Z());
        b y10 = y();
        y10.getClass();
        C0801d c0801d = new C0801d(y10);
        while (true) {
            if (!c0801d.hasNext()) {
                break;
            }
            a aVar = (a) c0801d.next();
            String str = aVar.f26330b;
            String str2 = str != null ? str : "";
            String str3 = aVar.f26329a;
            if (!str3.equals("#declaration")) {
                cVar.a(' ');
                cVar.b(str3);
                if (!str2.isEmpty()) {
                    cVar.b("=\"");
                    n.c(cVar, str2, fVar, 2);
                    cVar.a('\"');
                }
            }
        }
        cVar.b(z8 ? "" : "?").b(">");
    }

    @Override // xc.q
    /* renamed from: clone */
    public final Object E() {
        return (y) super.E();
    }

    @Override // xc.q
    public final String toString() {
        return Q();
    }
}
