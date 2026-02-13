package o8;

import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import q3.s;

/* renamed from: o8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824b {

    /* renamed from: a, reason: collision with root package name */
    public String f22125a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1824b) {
            return G.k(this.f22125a, ((C1824b) obj).f22125a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22125a});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(this.f22125a, "token");
        return sVar.toString();
    }
}
