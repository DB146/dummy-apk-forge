package yc;

/* loaded from: classes2.dex */
public final class Q extends P {
    public boolean k;

    @Override // yc.P
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ P g() {
        g();
        return this;
    }

    @Override // yc.P, yc.S
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void g() {
        super.g();
        this.k = true;
    }

    public final String toString() {
        boolean z8 = this.k;
        String str = z8 ? "<!" : "<?";
        String str2 = z8 ? ">" : "?>";
        xc.b bVar = this.g;
        if (bVar == null || bVar.f26332a <= 0) {
            StringBuilder m10 = X.c.m(str);
            m10.append(o());
            m10.append(str2);
            return m10.toString();
        }
        StringBuilder m11 = X.c.m(str);
        m11.append(o());
        m11.append(" ");
        m11.append(this.g.toString());
        m11.append(str2);
        return m11.toString();
    }
}
