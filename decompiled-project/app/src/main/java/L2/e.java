package L2;

import a.AbstractC0672a;
import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import t8.C2034c;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public int[] f6272d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f6273e;

    /* renamed from: f, reason: collision with root package name */
    public double[] f6274f;

    /* renamed from: u, reason: collision with root package name */
    public String[] f6275u;

    /* renamed from: v, reason: collision with root package name */
    public byte[][] f6276v;

    /* renamed from: w, reason: collision with root package name */
    public Cursor f6277w;

    public static void K(Cursor cursor, int i7) {
        if (i7 < 0 || i7 >= cursor.getColumnCount()) {
            AbstractC0672a.s(25, "column index out of range");
            throw null;
        }
    }

    @Override // T2.c
    public final boolean E(int i7) {
        l();
        Cursor P10 = P();
        K(P10, i7);
        return P10.isNull(i7);
    }

    public final void F() {
        if (this.f6277w == null) {
            this.f6277w = this.f6279a.v(new C2034c(this, 21));
        }
    }

    @Override // T2.c
    public final String G(int i7) {
        l();
        F();
        Cursor cursor = this.f6277w;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        K(cursor, i7);
        String columnName = cursor.getColumnName(i7);
        l.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // T2.c
    public final boolean J() {
        l();
        F();
        Cursor cursor = this.f6277w;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Cursor P() {
        Cursor cursor = this.f6277w;
        if (cursor != null) {
            return cursor;
        }
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final void a(int i7) {
        l();
        n(5, i7);
        this.f6272d[i7] = 5;
    }

    @Override // T2.c
    public final void b(int i7, double d10) {
        l();
        n(2, i7);
        this.f6272d[i7] = 2;
        this.f6274f[i7] = d10;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f6281c) {
            l();
            this.f6272d = new int[0];
            this.f6273e = new long[0];
            this.f6274f = new double[0];
            this.f6275u = new String[0];
            this.f6276v = new byte[0];
            reset();
        }
        this.f6281c = true;
    }

    @Override // T2.c
    public final void f(int i7, long j) {
        l();
        n(1, i7);
        this.f6272d[i7] = 1;
        this.f6273e[i7] = j;
    }

    @Override // T2.c
    public final void g(int i7, byte[] bArr) {
        l();
        n(4, i7);
        this.f6272d[i7] = 4;
        this.f6276v[i7] = bArr;
    }

    @Override // T2.c
    public final String j(int i7) {
        l();
        Cursor P10 = P();
        K(P10, i7);
        String string = P10.getString(i7);
        l.d(string, "getString(...)");
        return string;
    }

    @Override // T2.c
    public final int k() {
        l();
        F();
        Cursor cursor = this.f6277w;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    public final void n(int i7, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f6272d;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            l.d(copyOf, "copyOf(...)");
            this.f6272d = copyOf;
        }
        if (i7 == 1) {
            long[] jArr = this.f6273e;
            if (jArr.length < i11) {
                long[] copyOf2 = Arrays.copyOf(jArr, i11);
                l.d(copyOf2, "copyOf(...)");
                this.f6273e = copyOf2;
                return;
            }
            return;
        }
        if (i7 == 2) {
            double[] dArr = this.f6274f;
            if (dArr.length < i11) {
                double[] copyOf3 = Arrays.copyOf(dArr, i11);
                l.d(copyOf3, "copyOf(...)");
                this.f6274f = copyOf3;
                return;
            }
            return;
        }
        if (i7 == 3) {
            String[] strArr = this.f6275u;
            if (strArr.length < i11) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i11);
                l.d(copyOf4, "copyOf(...)");
                this.f6275u = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i7 != 4) {
            return;
        }
        byte[][] bArr = this.f6276v;
        if (bArr.length < i11) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i11);
            l.d(copyOf5, "copyOf(...)");
            this.f6276v = (byte[][]) copyOf5;
        }
    }

    @Override // T2.c
    public final void reset() {
        l();
        Cursor cursor = this.f6277w;
        if (cursor != null) {
            cursor.close();
        }
        this.f6277w = null;
    }

    @Override // T2.c
    public final double s(int i7) {
        l();
        Cursor P10 = P();
        K(P10, i7);
        return P10.getDouble(i7);
    }

    @Override // T2.c
    public final long x(int i7) {
        l();
        Cursor P10 = P();
        K(P10, i7);
        return P10.getLong(i7);
    }

    @Override // T2.c
    public final void y(int i7, String value) {
        l.e(value, "value");
        l();
        n(3, i7);
        this.f6272d[i7] = 3;
        this.f6275u[i7] = value;
    }
}
