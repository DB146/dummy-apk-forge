package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19911e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f19912f;

    /* renamed from: u, reason: collision with root package name */
    public static final G0 f19913u;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19915d;

    static {
        int i7 = n5.D.f21141a;
        f19911e = Integer.toString(1, 36);
        f19912f = Integer.toString(2, 36);
        f19913u = new G0(0);
    }

    public H0() {
        this.f19914c = false;
        this.f19915d = false;
    }

    public H0(boolean z8) {
        this.f19914c = true;
        this.f19915d = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.f19915d == h02.f19915d && this.f19914c == h02.f19914c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19914c), Boolean.valueOf(this.f19915d)});
    }
}
