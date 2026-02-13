package m4;

import ha.C1265a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M extends C0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20098e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f20099f;

    /* renamed from: u, reason: collision with root package name */
    public static final C1265a f20100u;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20101c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20102d;

    static {
        int i7 = n5.D.f21141a;
        f20098e = Integer.toString(1, 36);
        f20099f = Integer.toString(2, 36);
        f20100u = new C1265a(16);
    }

    public M() {
        this.f20101c = false;
        this.f20102d = false;
    }

    public M(boolean z8) {
        this.f20101c = true;
        this.f20102d = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return this.f20102d == m10.f20102d && this.f20101c == m10.f20101c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f20101c), Boolean.valueOf(this.f20102d)});
    }
}
