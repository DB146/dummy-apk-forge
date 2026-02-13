package J1;

import java.util.ArrayList;
import y6.C2399e;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final C2399e f5418f = new C2399e(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f5419a;

    /* renamed from: b, reason: collision with root package name */
    public long f5420b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f5421c;

    /* renamed from: d, reason: collision with root package name */
    public int f5422d;

    /* renamed from: e, reason: collision with root package name */
    public final C2399e f5423e;

    public g() {
        C2399e c2399e = f5418f;
        this.f5419a = new ArrayList();
        this.f5420b = 0L;
        this.f5423e = c2399e;
    }

    public final boolean a(int i7) {
        int i10;
        if (i7 < 64) {
            return ((1 << i7) & this.f5420b) != 0;
        }
        long[] jArr = this.f5421c;
        if (jArr != null && (i10 = (i7 / 64) - 1) < jArr.length) {
            return ((1 << (i7 % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    public final synchronized void b(int i7, a aVar) {
        try {
            this.f5422d++;
            int size = this.f5419a.size();
            int length = this.f5421c == null ? -1 : r0.length - 1;
            d(i7, length, aVar);
            c(aVar, i7, (length + 2) * 64, size, 0L);
            int i10 = this.f5422d - 1;
            this.f5422d = i10;
            if (i10 == 0) {
                long[] jArr = this.f5421c;
                if (jArr != null) {
                    for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
                        long j = this.f5421c[length2];
                        if (j != 0) {
                            e((length2 + 1) * 64, j);
                            this.f5421c[length2] = 0;
                        }
                    }
                }
                long j10 = this.f5420b;
                if (j10 != 0) {
                    e(0, j10);
                    this.f5420b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(a aVar, int i7, int i10, int i11, long j) {
        long j10 = 1;
        while (i10 < i11) {
            if ((j & j10) == 0) {
                Object obj = this.f5419a.get(i10);
                this.f5423e.getClass();
                l lVar = ((j) obj).f5426a;
                k kVar = (k) lVar.get();
                if (kVar == null) {
                    lVar.a();
                }
                if (kVar != null && lVar.f5442c == aVar && kVar.i(lVar.f5441b, i7, aVar)) {
                    kVar.j();
                }
            }
            j10 <<= 1;
            i10++;
        }
    }

    public final Object clone() {
        g gVar;
        CloneNotSupportedException e2;
        synchronized (this) {
            try {
                gVar = (g) super.clone();
            } catch (CloneNotSupportedException e10) {
                gVar = null;
                e2 = e10;
            }
            try {
                gVar.f5420b = 0L;
                gVar.f5421c = null;
                gVar.f5422d = 0;
                gVar.f5419a = new ArrayList();
                int size = this.f5419a.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (!a(i7)) {
                        gVar.f5419a.add(this.f5419a.get(i7));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e2 = e11;
                e2.printStackTrace();
                return gVar;
            }
        }
        return gVar;
    }

    public final void d(int i7, int i10, a aVar) {
        if (i10 < 0) {
            c(aVar, i7, 0, Math.min(64, this.f5419a.size()), this.f5420b);
            return;
        }
        long j = this.f5421c[i10];
        int i11 = (i10 + 1) * 64;
        int min = Math.min(this.f5419a.size(), i11 + 64);
        d(i7, i10 - 1, aVar);
        c(aVar, i7, i11, min, j);
    }

    public final void e(int i7, long j) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = i7 + 63; i10 >= i7; i10--) {
            if ((j & j10) != 0) {
                this.f5419a.remove(i10);
            }
            j10 >>>= 1;
        }
    }

    public final void f(int i7) {
        if (i7 < 64) {
            this.f5420b = (1 << i7) | this.f5420b;
            return;
        }
        int i10 = (i7 / 64) - 1;
        long[] jArr = this.f5421c;
        if (jArr == null) {
            this.f5421c = new long[this.f5419a.size() / 64];
        } else if (jArr.length <= i10) {
            long[] jArr2 = new long[this.f5419a.size() / 64];
            long[] jArr3 = this.f5421c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f5421c = jArr2;
        }
        long j = 1 << (i7 % 64);
        long[] jArr4 = this.f5421c;
        jArr4[i10] = j | jArr4[i10];
    }
}
