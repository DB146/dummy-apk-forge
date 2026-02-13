package v;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2121a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24921a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f24922b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f24923c = new Object[0];

    public static final int a(int i7, int i10, int[] array) {
        l.e(array, "array");
        int i11 = i7 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i7, long j) {
        l.e(array, "array");
        int i10 = i7 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = array[i12];
            if (j10 < j) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final void c(String message) {
        l.e(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void d(String message) {
        l.e(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void e(String message) {
        l.e(message, "message");
        throw new NoSuchElementException(message);
    }
}
