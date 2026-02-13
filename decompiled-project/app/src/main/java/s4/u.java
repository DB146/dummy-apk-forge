package s4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f24089a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24092d;

    public u(int i7, byte[] bArr, int i10, int i11) {
        this.f24089a = i7;
        this.f24090b = bArr;
        this.f24091c = i10;
        this.f24092d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f24089a == uVar.f24089a && this.f24091c == uVar.f24091c && this.f24092d == uVar.f24092d && Arrays.equals(this.f24090b, uVar.f24090b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f24090b) + (this.f24089a * 31)) * 31) + this.f24091c) * 31) + this.f24092d;
    }
}
