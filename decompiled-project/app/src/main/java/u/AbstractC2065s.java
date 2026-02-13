package u;

import java.util.ConcurrentModificationException;
import v.AbstractC2121a;

/* renamed from: u.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2065s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24714a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f24715b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24716c = new Object();

    public static final void a(U u3) {
        int i7 = u3.f24641d;
        int[] iArr = u3.f24639b;
        Object[] objArr = u3.f24640c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            if (obj != f24716c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        u3.f24638a = false;
        u3.f24641d = i10;
    }

    public static final void b(C2053f c2053f, int i7) {
        kotlin.jvm.internal.l.e(c2053f, "<this>");
        c2053f.f24670a = new int[i7];
        c2053f.f24671b = new Object[i7];
    }

    public static final int c(C2053f c2053f, Object obj, int i7) {
        kotlin.jvm.internal.l.e(c2053f, "<this>");
        int i10 = c2053f.f24672c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a9 = AbstractC2121a.a(c2053f.f24672c, i7, c2053f.f24670a);
            if (a9 < 0 || kotlin.jvm.internal.l.a(obj, c2053f.f24671b[a9])) {
                return a9;
            }
            int i11 = a9 + 1;
            while (i11 < i10 && c2053f.f24670a[i11] == i7) {
                if (kotlin.jvm.internal.l.a(obj, c2053f.f24671b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a9 - 1; i12 >= 0 && c2053f.f24670a[i12] == i7; i12--) {
                if (kotlin.jvm.internal.l.a(obj, c2053f.f24671b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
