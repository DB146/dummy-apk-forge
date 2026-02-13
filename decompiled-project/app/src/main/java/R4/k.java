package R4;

import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;

/* loaded from: classes.dex */
public abstract class k extends e {

    /* renamed from: x, reason: collision with root package name */
    public final long f8916x;

    public k(InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, int i7, Object obj, long j, long j10, long j11) {
        super(interfaceC1616m, c1619p, 1, l10, i7, obj, j, j10);
        l10.getClass();
        this.f8916x = j11;
    }

    public long a() {
        long j = this.f8916x;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean c();
}
