package X6;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class d implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public final V6.a f10999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11000b;

    public d(V6.a aVar, int i7) {
        this.f10999a = aVar;
        this.f11000b = i7;
        if (i7 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.e(i7, new byte[0]);
    }

    @Override // S6.b
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] b2 = b(bArr2);
        if (b2 != null && bArr != null && b2.length == bArr.length) {
            int i7 = 0;
            for (int i10 = 0; i10 < b2.length; i10++) {
                i7 |= b2[i10] ^ bArr[i10];
            }
            if (i7 == 0) {
                return;
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // S6.b
    public final byte[] b(byte[] bArr) {
        return this.f10999a.e(this.f11000b, bArr);
    }
}
