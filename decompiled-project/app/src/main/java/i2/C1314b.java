package i2;

import android.text.TextUtils;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314b {

    /* renamed from: a, reason: collision with root package name */
    public String f18252a;

    /* renamed from: b, reason: collision with root package name */
    public String f18253b;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f18252a)) {
            sb2.append((CharSequence) this.f18252a);
        }
        if (!TextUtils.isEmpty(this.f18253b)) {
            if (!TextUtils.isEmpty(this.f18252a)) {
                sb2.append(" ");
            }
            sb2.append((CharSequence) this.f18253b);
        }
        return sb2.toString();
    }
}
