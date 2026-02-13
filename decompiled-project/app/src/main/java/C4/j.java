package C4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2744e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f2745a;

    /* renamed from: b, reason: collision with root package name */
    public int f2746b;

    /* renamed from: c, reason: collision with root package name */
    public int f2747c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2748d;

    public final void a(int i7, byte[] bArr, int i10) {
        if (this.f2745a) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.f2748d;
            int length = bArr2.length;
            int i12 = this.f2746b + i11;
            if (length < i12) {
                this.f2748d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i7, this.f2748d, this.f2746b, i11);
            this.f2746b += i11;
        }
    }
}
