package xc;

/* loaded from: classes2.dex */
public class x extends p {
    public static boolean c0(StringBuilder sb2) {
        return sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ';
    }

    @Override // xc.q
    public String N() {
        return "#text";
    }

    @Override // xc.q
    public void R(wc.c cVar, f fVar) {
        n.c(cVar, Z(), fVar, 1);
    }

    @Override // xc.q
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public x E() {
        return (x) super.clone();
    }

    @Override // xc.q
    public final String toString() {
        return Q();
    }
}
