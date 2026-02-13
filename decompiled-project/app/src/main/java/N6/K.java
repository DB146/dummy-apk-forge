package N6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class K extends B {
    @Override // N6.B
    public final B c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final L h() {
        int i7 = this.f7211b;
        if (i7 == 0) {
            int i10 = L.f7237c;
            return z0.f7379x;
        }
        if (i7 != 1) {
            L E10 = L.E(i7, this.f7210a);
            this.f7211b = E10.size();
            this.f7212c = true;
            return E10;
        }
        Object obj = this.f7210a[0];
        Objects.requireNonNull(obj);
        int i11 = L.f7237c;
        return new G0(obj);
    }
}
