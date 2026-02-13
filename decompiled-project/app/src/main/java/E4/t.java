package E4;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f3664a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3665b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3666c;

    public t(String str, boolean z8, boolean z10) {
        this.f3664a = str;
        this.f3665b = z8;
        this.f3666c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != t.class) {
            return false;
        }
        t tVar = (t) obj;
        return TextUtils.equals(this.f3664a, tVar.f3664a) && this.f3665b == tVar.f3665b && this.f3666c == tVar.f3666c;
    }

    public final int hashCode() {
        return ((A3.c.d(31, 31, this.f3664a) + (this.f3665b ? 1231 : 1237)) * 31) + (this.f3666c ? 1231 : 1237);
    }
}
