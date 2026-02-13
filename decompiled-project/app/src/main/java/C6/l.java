package C6;

import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2946a;

    /* renamed from: b, reason: collision with root package name */
    public int f2947b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2948c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2949d;

    public l() {
        this.f2948c = new long[10];
        this.f2949d = new Object[10];
    }

    public l(int i7, int i10, float[] fArr, float[] fArr2) {
        this.f2946a = i7;
        AbstractC1705a.h(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f2948c = fArr;
        this.f2949d = fArr2;
        this.f2947b = i10;
    }

    public synchronized void a(Object obj, long j) {
        if (this.f2947b > 0) {
            if (j <= ((long[]) this.f2948c)[((this.f2946a + r0) - 1) % ((Object[]) this.f2949d).length]) {
                b();
            }
        }
        c();
        int i7 = this.f2946a;
        int i10 = this.f2947b;
        Object[] objArr = (Object[]) this.f2949d;
        int length = (i7 + i10) % objArr.length;
        ((long[]) this.f2948c)[length] = j;
        objArr[length] = obj;
        this.f2947b = i10 + 1;
    }

    public synchronized void b() {
        this.f2946a = 0;
        this.f2947b = 0;
        Arrays.fill((Object[]) this.f2949d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f2949d).length;
        if (this.f2947b < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i10 = this.f2946a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f2948c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f2949d, this.f2946a, objArr, 0, i11);
        int i12 = this.f2946a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f2948c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f2949d, 0, objArr, i11, this.f2946a);
        }
        this.f2948c = jArr;
        this.f2949d = objArr;
        this.f2946a = 0;
    }

    public Object d(long j, boolean z8) {
        Object obj = null;
        long j10 = Long.MAX_VALUE;
        while (this.f2947b > 0) {
            long j11 = j - ((long[]) this.f2948c)[this.f2946a];
            if (j11 < 0 && (z8 || (-j11) >= j10)) {
                break;
            }
            obj = e();
            j10 = j11;
        }
        return obj;
    }

    public Object e() {
        AbstractC1705a.m(this.f2947b > 0);
        Object[] objArr = (Object[]) this.f2949d;
        int i7 = this.f2946a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f2946a = (i7 + 1) % objArr.length;
        this.f2947b--;
        return obj;
    }
}
