package xc;

/* loaded from: classes2.dex */
public final class e extends p {
    @Override // xc.q
    public final q E() {
        return (e) super.E();
    }

    @Override // xc.q
    public final String N() {
        return "#data";
    }

    @Override // xc.q
    public final void R(wc.c cVar, f fVar) {
        String Z7 = Z();
        if (fVar.f26340f != 2 || Z7.contains("<![CDATA[")) {
            cVar.b(Z7);
            return;
        }
        l lVar = this.f26368a;
        if (lVar != null && lVar.f26349d.f27658c.equals("script")) {
            cVar.b("//<![CDATA[\n").b(Z7).b("\n//]]>");
            return;
        }
        l lVar2 = this.f26368a;
        if (lVar2 == null || !lVar2.f26349d.f27658c.equals("style")) {
            cVar.b("<![CDATA[").b(Z7).b("]]>");
        } else {
            cVar.b("/*<![CDATA[*/\n").b(Z7).b("\n/*]]>*/");
        }
    }

    @Override // xc.q
    /* renamed from: clone */
    public final Object E() {
        return (e) super.E();
    }
}
