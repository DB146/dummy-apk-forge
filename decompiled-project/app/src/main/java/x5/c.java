package x5;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final c f26221b = new c(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f26222a;

    public /* synthetic */ c(Bundle bundle) {
        this.f26222a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f26222a;
        Bundle bundle2 = this.f26222a;
        if (bundle2 == null || bundle == null) {
            if (bundle2 == bundle) {
                return true;
            }
        } else if (bundle2.size() == bundle.size()) {
            Set<String> keySet = bundle2.keySet();
            if (keySet.containsAll(bundle.keySet())) {
                for (String str : keySet) {
                    if (!G.k(bundle2.get(str), bundle.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26222a});
    }
}
