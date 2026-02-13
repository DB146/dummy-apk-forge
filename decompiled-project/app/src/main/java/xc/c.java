package xc;

/* loaded from: classes2.dex */
public final class c extends x {
    @Override // xc.x, xc.q
    public final q E() {
        return (c) super.clone();
    }

    @Override // xc.x, xc.q
    public final String N() {
        return "#cdata";
    }

    @Override // xc.x, xc.q
    public final void R(wc.c cVar, f fVar) {
        cVar.b("<![CDATA[").b(Z()).b("]]>");
    }

    @Override // xc.x
    /* renamed from: b0 */
    public final x clone() {
        return (c) super.clone();
    }

    @Override // xc.x, xc.q
    /* renamed from: clone */
    public final Object E() {
        return (c) super.clone();
    }
}
