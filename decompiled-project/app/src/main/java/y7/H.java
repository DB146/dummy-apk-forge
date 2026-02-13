package y7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27123a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27124b;

    public H(String str, byte[] bArr) {
        this.f27123a = str;
        this.f27124b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f27123a.equals(((H) s0Var).f27123a)) {
            if (Arrays.equals(this.f27124b, (s0Var instanceof H ? (H) s0Var : (H) s0Var).f27124b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27123a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27124b);
    }

    public final String toString() {
        return "File{filename=" + this.f27123a + ", contents=" + Arrays.toString(this.f27124b) + "}";
    }
}
