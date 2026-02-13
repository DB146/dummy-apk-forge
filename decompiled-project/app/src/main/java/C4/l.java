package C4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2763f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f2764a;

    /* renamed from: b, reason: collision with root package name */
    public int f2765b;

    /* renamed from: c, reason: collision with root package name */
    public int f2766c;

    /* renamed from: d, reason: collision with root package name */
    public int f2767d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2768e;

    public final void a(int i7, byte[] bArr, int i10) {
        if (this.f2764a) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.f2768e;
            int length = bArr2.length;
            int i12 = this.f2766c + i11;
            if (length < i12) {
                this.f2768e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i7, this.f2768e, this.f2766c, i11);
            this.f2766c += i11;
        }
    }
}
