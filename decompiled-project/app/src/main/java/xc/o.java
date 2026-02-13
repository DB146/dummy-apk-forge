package xc;

import java.util.ArrayList;
import java.util.Arrays;
import yc.F;

/* loaded from: classes2.dex */
public final class o extends l {

    /* renamed from: x, reason: collision with root package name */
    public final zc.e f26365x;

    static {
        String[] strArr = wc.c.f25872e;
        String[] strArr2 = wc.l.f25891a;
        zc.v.X(wc.l.j(Arrays.asList(strArr), ", "));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [zc.e, java.util.ArrayList] */
    public o(F f4, b bVar) {
        super(f4, null, bVar);
        this.f26365x = new ArrayList();
    }

    @Override // xc.l, xc.q
    public final q E() {
        return (o) super.E();
    }

    @Override // xc.q
    public final void W(q qVar) {
        super.W(qVar);
        this.f26365x.remove(qVar);
    }

    @Override // xc.l, xc.q
    /* renamed from: clone */
    public final Object E() {
        return (o) super.E();
    }

    @Override // xc.l
    /* renamed from: d0 */
    public final l E() {
        return (o) super.E();
    }
}
