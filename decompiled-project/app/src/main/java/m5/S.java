package m5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class S implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1616m f20579a;

    /* renamed from: b, reason: collision with root package name */
    public long f20580b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f20581c;

    /* renamed from: d, reason: collision with root package name */
    public Map f20582d;

    public S(InterfaceC1616m interfaceC1616m) {
        interfaceC1616m.getClass();
        this.f20579a = interfaceC1616m;
        this.f20581c = Uri.EMPTY;
        this.f20582d = Collections.emptyMap();
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        int D10 = this.f20579a.D(bArr, i7, i10);
        if (D10 != -1) {
            this.f20580b += D10;
        }
        return D10;
    }

    @Override // m5.InterfaceC1616m
    public final void a(T t5) {
        t5.getClass();
        this.f20579a.a(t5);
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20579a.close();
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        this.f20581c = c1619p.f20628a;
        this.f20582d = Collections.emptyMap();
        InterfaceC1616m interfaceC1616m = this.f20579a;
        long d10 = interfaceC1616m.d(c1619p);
        Uri w10 = interfaceC1616m.w();
        w10.getClass();
        this.f20581c = w10;
        this.f20582d = interfaceC1616m.n();
        return d10;
    }

    @Override // m5.InterfaceC1616m
    public final Map n() {
        return this.f20579a.n();
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20579a.w();
    }
}
