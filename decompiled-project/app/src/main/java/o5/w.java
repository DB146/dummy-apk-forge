package o5;

import m4.InterfaceC1569g;
import n5.D;

/* loaded from: classes.dex */
public final class w implements InterfaceC1569g {

    /* renamed from: e, reason: collision with root package name */
    public static final w f22047e = new w(1.0f, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f22048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22049b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22050c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22051d;

    static {
        int i7 = D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public w(float f4, int i7, int i10, int i11) {
        this.f22048a = i7;
        this.f22049b = i10;
        this.f22050c = i11;
        this.f22051d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f22048a == wVar.f22048a && this.f22049b == wVar.f22049b && this.f22050c == wVar.f22050c && this.f22051d == wVar.f22051d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f22051d) + ((((((217 + this.f22048a) * 31) + this.f22049b) * 31) + this.f22050c) * 31);
    }
}
