package a4;

import java.util.Arrays;

/* renamed from: a4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765p extends AbstractC0741B {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12669a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12670b;

    public C0765p(byte[] bArr, byte[] bArr2) {
        this.f12669a = bArr;
        this.f12670b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0741B)) {
            return false;
        }
        AbstractC0741B abstractC0741B = (AbstractC0741B) obj;
        boolean z8 = abstractC0741B instanceof C0765p;
        if (Arrays.equals(this.f12669a, z8 ? ((C0765p) abstractC0741B).f12669a : ((C0765p) abstractC0741B).f12669a)) {
            if (Arrays.equals(this.f12670b, z8 ? ((C0765p) abstractC0741B).f12670b : ((C0765p) abstractC0741B).f12670b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f12669a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12670b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f12669a) + ", encryptedBlob=" + Arrays.toString(this.f12670b) + "}";
    }
}
