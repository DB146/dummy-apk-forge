package P4;

import java.util.Arrays;
import m5.C1619p;
import m5.InterfaceC1603G;
import m5.InterfaceC1616m;

/* loaded from: classes.dex */
public final class j0 implements InterfaceC1603G {

    /* renamed from: a, reason: collision with root package name */
    public final C1619p f8069a;

    /* renamed from: b, reason: collision with root package name */
    public final m5.S f8070b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8071c;

    public j0(InterfaceC1616m interfaceC1616m, C1619p c1619p) {
        r.f8129b.getAndIncrement();
        this.f8069a = c1619p;
        this.f8070b = new m5.S(interfaceC1616m);
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        m5.S s3 = this.f8070b;
        s3.f20580b = 0L;
        try {
            s3.d(this.f8069a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) s3.f20580b;
                byte[] bArr = this.f8071c;
                if (bArr == null) {
                    this.f8071c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f8071c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f8071c;
                i7 = s3.D(bArr2, i10, bArr2.length - i10);
            }
            c2.i.f(s3);
        } catch (Throwable th) {
            c2.i.f(s3);
            throw th;
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
    }
}
