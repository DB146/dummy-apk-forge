package v2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class p implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final q f25010a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f25011b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25013d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25014e;

    public p(q destination, Bundle bundle, boolean z8, int i7, boolean z10) {
        kotlin.jvm.internal.l.e(destination, "destination");
        this.f25010a = destination;
        this.f25011b = bundle;
        this.f25012c = z8;
        this.f25013d = i7;
        this.f25014e = z10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p other) {
        kotlin.jvm.internal.l.e(other, "other");
        boolean z8 = other.f25012c;
        boolean z10 = this.f25012c;
        if (z10 && !z8) {
            return 1;
        }
        if (!z10 && z8) {
            return -1;
        }
        int i7 = this.f25013d - other.f25013d;
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        Bundle bundle = other.f25011b;
        Bundle bundle2 = this.f25011b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.l.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = other.f25014e;
        boolean z12 = this.f25014e;
        if (!z12 || z11) {
            return (z12 || !z11) ? 0 : -1;
        }
        return 1;
    }
}
