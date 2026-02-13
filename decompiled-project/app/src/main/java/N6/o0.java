package N6;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements M6.q, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f7325a;

    public o0() {
        r.e(2, "expectedValuesPerKey");
        this.f7325a = 2;
    }

    @Override // M6.q
    public final Object get() {
        return new ArrayList(this.f7325a);
    }
}
