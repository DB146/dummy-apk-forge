package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012f extends C1013g {

    /* renamed from: e, reason: collision with root package name */
    public final int f15770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15771f;

    public C1012f(byte[] bArr, int i7, int i10) {
        super(bArr);
        AbstractC1014h.i(i7, i7 + i10, bArr.length);
        this.f15770e = i7;
        this.f15771f = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1013g, com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public final byte b(int i7) {
        int i10 = this.f15771f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f15773d[this.f15770e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(h3.o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(X.c.e(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1013g, com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public final int size() {
        return this.f15771f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1013g, com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public final void t(int i7, byte[] bArr) {
        System.arraycopy(this.f15773d, this.f15770e, bArr, 0, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1013g, com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public final byte y(int i7) {
        return this.f15773d[this.f15770e + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1013g
    public final int z() {
        return this.f15770e;
    }
}
