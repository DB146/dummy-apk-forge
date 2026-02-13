package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803f extends C0804g {

    /* renamed from: e, reason: collision with root package name */
    public final int f13394e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13395f;

    public C0803f(byte[] bArr, int i7, int i10) {
        super(bArr);
        C0804g.i(i7, i7 + i10, bArr.length);
        this.f13394e = i7;
        this.f13395f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0804g
    public final byte b(int i7) {
        int i10 = this.f13395f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f13399b[this.f13394e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(h3.o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(X.c.e(i7, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0804g
    public final int size() {
        return this.f13395f;
    }

    @Override // androidx.datastore.preferences.protobuf.C0804g
    public final void t(int i7, byte[] bArr) {
        System.arraycopy(this.f13399b, this.f13394e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.C0804g
    public final int y() {
        return this.f13394e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0804g
    public final byte z(int i7) {
        return this.f13399b[this.f13394e + i7];
    }
}
