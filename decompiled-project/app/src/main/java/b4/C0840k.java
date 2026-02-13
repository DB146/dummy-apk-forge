package b4;

import java.util.Arrays;

/* renamed from: b4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840k {

    /* renamed from: a, reason: collision with root package name */
    public final Y3.c f13868a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13869b;

    public C0840k(Y3.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f13868a = cVar;
        this.f13869b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840k)) {
            return false;
        }
        C0840k c0840k = (C0840k) obj;
        if (this.f13868a.equals(c0840k.f13868a)) {
            return Arrays.equals(this.f13869b, c0840k.f13869b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13868a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13869b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13868a + ", bytes=[...]}";
    }
}
