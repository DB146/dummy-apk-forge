package C4;

import n5.C1704A;
import s4.C1979g;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final C1704A f2893b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2894c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2895d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2897f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f2898h;

    /* renamed from: i, reason: collision with root package name */
    public long f2899i;

    public y(int i7) {
        this.f2892a = i7;
        switch (i7) {
            case 1:
                this.f2893b = new C1704A(0L);
                this.g = -9223372036854775807L;
                this.f2898h = -9223372036854775807L;
                this.f2899i = -9223372036854775807L;
                this.f2894c = new n5.v();
                return;
            default:
                this.f2893b = new C1704A(0L);
                this.g = -9223372036854775807L;
                this.f2898h = -9223372036854775807L;
                this.f2899i = -9223372036854775807L;
                this.f2894c = new n5.v();
                return;
        }
    }

    public static int b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(n5.v vVar) {
        int i7 = vVar.f21230b;
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.f(0, bArr, 9);
        vVar.G(i7);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j10 = b10;
                    return ((j10 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C1979g c1979g) {
        switch (this.f2892a) {
            case 0:
                byte[] bArr = n5.D.f21146f;
                n5.v vVar = this.f2894c;
                vVar.getClass();
                vVar.E(bArr.length, bArr);
                this.f2895d = true;
                c1979g.f24057f = 0;
                return;
            default:
                byte[] bArr2 = n5.D.f21146f;
                n5.v vVar2 = this.f2894c;
                vVar2.getClass();
                vVar2.E(bArr2.length, bArr2);
                this.f2895d = true;
                c1979g.f24057f = 0;
                return;
        }
    }
}
