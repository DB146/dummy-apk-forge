package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1013g extends AbstractC1014h {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15773d;

    public C1013g(byte[] bArr) {
        this.f15777a = 0;
        bArr.getClass();
        this.f15773d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public byte b(int i7) {
        return this.f15773d[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1014h) || size() != ((AbstractC1014h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1013g)) {
            return obj.equals(this);
        }
        C1013g c1013g = (C1013g) obj;
        int i7 = this.f15777a;
        int i10 = c1013g.f15777a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > c1013g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1013g.size()) {
            StringBuilder r10 = h3.o.r(size, "Ran off end of other: 0, ", ", ");
            r10.append(c1013g.size());
            throw new IllegalArgumentException(r10.toString());
        }
        int z8 = z() + size;
        int z10 = z();
        int z11 = c1013g.z();
        while (z10 < z8) {
            if (this.f15773d[z10] != c1013g.f15773d[z11]) {
                return false;
            }
            z10++;
            z11++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public int size() {
        return this.f15773d.length;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public void t(int i7, byte[] bArr) {
        System.arraycopy(this.f15773d, 0, bArr, 0, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1014h
    public byte y(int i7) {
        return this.f15773d[i7];
    }

    public int z() {
        return 0;
    }
}
