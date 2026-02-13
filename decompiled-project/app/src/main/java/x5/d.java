package x5;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.G;
import ea.C1112g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final d f26223c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26225b;

    static {
        C1112g c1112g = new C1112g(18);
        c1112g.f16840b = Boolean.FALSE;
        f26223c = new d(c1112g);
    }

    public d(C1112g c1112g) {
        this.f26224a = ((Boolean) c1112g.f16840b).booleanValue();
        this.f26225b = (String) c1112g.f16841c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return G.k(null, null) && this.f26224a == dVar.f26224a && G.k(this.f26225b, dVar.f26225b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f26224a), this.f26225b});
    }
}
