package yc;

/* loaded from: classes2.dex */
public final class O extends P {
    @Override // yc.P, yc.S
    /* renamed from: n */
    public final P g() {
        super.g();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f27672f ? "/>" : ">";
        xc.b bVar = this.g;
        if (!(bVar != null) || bVar.f26332a <= 0) {
            return "<" + o() + str;
        }
        return "<" + o() + " " + this.g.toString() + str;
    }
}
