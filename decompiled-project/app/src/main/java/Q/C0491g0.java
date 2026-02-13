package Q;

import java.util.ArrayList;
import u.C2070x;

/* renamed from: Q.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8399b;

    /* renamed from: c, reason: collision with root package name */
    public int f8400c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8401d;

    /* renamed from: e, reason: collision with root package name */
    public final C2070x f8402e;

    /* renamed from: f, reason: collision with root package name */
    public final Db.o f8403f;

    public C0491g0(int i7, ArrayList arrayList) {
        this.f8398a = arrayList;
        this.f8399b = i7;
        if (i7 < 0) {
            AbstractC0495i0.a("Invalid start index");
        }
        this.f8401d = new ArrayList();
        C2070x c2070x = new C2070x();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            O o10 = (O) this.f8398a.get(i11);
            int i12 = o10.f8345c;
            int i13 = o10.f8346d;
            c2070x.g(i12, new I(i11, i10, i13));
            i10 += i13;
        }
        this.f8402e = c2070x;
        this.f8403f = android.support.v4.media.session.b.z(new A0.J(this, 11));
    }

    public final boolean a(int i7, int i10) {
        int i11;
        C2070x c2070x = this.f8402e;
        I i12 = (I) c2070x.b(i7);
        if (i12 == null) {
            return false;
        }
        int i13 = i12.f8306b;
        int i14 = i10 - i12.f8307c;
        i12.f8307c = i10;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = c2070x.f24693c;
        long[] jArr = c2070x.f24691a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j = jArr[i15];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j) < 128) {
                        I i18 = (I) objArr[(i15 << 3) + i17];
                        if (i18.f8306b >= i13 && !i18.equals(i12) && (i11 = i18.f8306b + i14) >= 0) {
                            i18.f8306b = i11;
                        }
                    }
                    j >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
