package F5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4121c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4121c = bArr;
    }

    @Override // F5.n
    public final byte[] F() {
        return this.f4121c;
    }
}
