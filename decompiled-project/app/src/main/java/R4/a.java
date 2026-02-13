package R4;

import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import q3.s;

/* loaded from: classes.dex */
public abstract class a extends k {

    /* renamed from: A, reason: collision with root package name */
    public s f8846A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f8847B;

    /* renamed from: y, reason: collision with root package name */
    public final long f8848y;

    /* renamed from: z, reason: collision with root package name */
    public final long f8849z;

    public a(InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, int i7, Object obj, long j, long j10, long j11, long j12, long j13) {
        super(interfaceC1616m, c1619p, l10, i7, obj, j, j10, j13);
        this.f8848y = j11;
        this.f8849z = j12;
    }

    public final int e(int i7) {
        int[] iArr = this.f8847B;
        AbstractC1705a.n(iArr);
        return iArr[i7];
    }
}
