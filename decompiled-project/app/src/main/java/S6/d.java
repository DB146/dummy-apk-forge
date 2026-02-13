package S6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9176a;

    public d(byte[] bArr) {
        this.f9176a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        byte[] bArr = this.f9176a;
        int length = bArr.length;
        byte[] bArr2 = dVar.f9176a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b2 = bArr[i7];
            byte b10 = dVar.f9176a[i7];
            if (b2 != b10) {
                return b2 - b10;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return Arrays.equals(this.f9176a, ((d) obj).f9176a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9176a);
    }

    public final String toString() {
        return com.bumptech.glide.c.x(this.f9176a);
    }
}
