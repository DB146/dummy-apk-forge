package Y;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f11062a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11063b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11064c;

    public l(int i7, long[] jArr, Object[] objArr) {
        this.f11062a = i7;
        this.f11063b = jArr;
        this.f11064c = objArr;
    }

    public final int a(long j) {
        int i7 = this.f11062a - 1;
        if (i7 == -1) {
            return -1;
        }
        long[] jArr = this.f11063b;
        int i10 = 0;
        if (i7 == 0) {
            long j10 = jArr[0];
            if (j10 == j) {
                return 0;
            }
            return j10 > j ? -2 : -1;
        }
        while (i10 <= i7) {
            int i11 = (i10 + i7) >>> 1;
            long j11 = jArr[i11] - j;
            if (j11 < 0) {
                i10 = i11 + 1;
            } else {
                if (j11 <= 0) {
                    return i11;
                }
                i7 = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public final l b(Object obj, long j) {
        long[] jArr;
        int i7;
        Object[] objArr = this.f11064c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f11063b;
                i7 = this.f11062a;
                if (i10 >= i12 || i13 >= i7) {
                    break;
                }
                long j10 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j10 > j) {
                    jArr2[i10] = j;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j10;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i7) {
                jArr2[i11] = j;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j11 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j11;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new l(i12, jArr2, objArr2);
    }
}
