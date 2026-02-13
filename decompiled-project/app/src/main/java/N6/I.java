package N6;

import java.io.Serializable;

/* loaded from: classes.dex */
public class I extends AbstractC0444q implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient y0 f7233d;

    public I(y0 y0Var, int i7) {
        this.f7233d = y0Var;
    }

    @Override // N6.AbstractC0443p
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // N6.AbstractC0443p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public y0 a() {
        return this.f7233d;
    }

    public final H d(String str) {
        H h10 = (H) this.f7233d.get(str);
        if (h10 != null) {
            return h10;
        }
        F f4 = H.f7232b;
        return t0.f7341e;
    }

    public final L e() {
        return this.f7233d.keySet();
    }
}
