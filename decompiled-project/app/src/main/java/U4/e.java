package U4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends R4.e {

    /* renamed from: x, reason: collision with root package name */
    public byte[] f9521x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f9522y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f9523z;

    @Override // m5.InterfaceC1603G
    public final void b() {
        try {
            this.f8877w.d(this.f8870b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f9522y) {
                byte[] bArr = this.f9521x;
                if (bArr.length < i10 + 16384) {
                    this.f9521x = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f8877w.D(this.f9521x, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f9522y) {
                this.f9523z = Arrays.copyOf(this.f9521x, i10);
            }
            c2.i.f(this.f8877w);
        } catch (Throwable th) {
            c2.i.f(this.f8877w);
            throw th;
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f9522y = true;
    }
}
