package fc;

import cc.C0944m;
import gc.AbstractC1207b;
import gc.AbstractC1209d;

/* loaded from: classes2.dex */
public final class S extends AbstractC1209d {

    /* renamed from: a, reason: collision with root package name */
    public long f17101a;

    /* renamed from: b, reason: collision with root package name */
    public C0944m f17102b;

    @Override // gc.AbstractC1209d
    public final boolean a(AbstractC1207b abstractC1207b) {
        P p10 = (P) abstractC1207b;
        if (this.f17101a >= 0) {
            return false;
        }
        long j = p10.f17094w;
        if (j < p10.f17095x) {
            p10.f17095x = j;
        }
        this.f17101a = j;
        return true;
    }

    @Override // gc.AbstractC1209d
    public final Hb.d[] b(AbstractC1207b abstractC1207b) {
        long j = this.f17101a;
        this.f17101a = -1L;
        this.f17102b = null;
        return ((P) abstractC1207b).u(j);
    }
}
