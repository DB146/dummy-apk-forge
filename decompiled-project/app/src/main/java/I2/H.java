package I2;

import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class H implements U2.f, U2.e {

    /* renamed from: w, reason: collision with root package name */
    public static final TreeMap f5039w = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f5040a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f5041b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f5042c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f5043d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f5044e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f5045f;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f5046u;

    /* renamed from: v, reason: collision with root package name */
    public int f5047v;

    public H(int i7) {
        this.f5040a = i7;
        int i10 = i7 + 1;
        this.f5046u = new int[i10];
        this.f5042c = new long[i10];
        this.f5043d = new double[i10];
        this.f5044e = new String[i10];
        this.f5045f = new byte[i10];
    }

    public final void F() {
        TreeMap treeMap = f5039w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5040a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.l.d(it, "iterator(...)");
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
        }
    }

    @Override // U2.e
    public final void a(int i7) {
        this.f5046u[i7] = 1;
    }

    @Override // U2.e
    public final void b(int i7, double d10) {
        this.f5046u[i7] = 3;
        this.f5043d[i7] = d10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // U2.e
    public final void f(int i7, long j) {
        this.f5046u[i7] = 2;
        this.f5042c[i7] = j;
    }

    @Override // U2.e
    public final void g(int i7, byte[] bArr) {
        this.f5046u[i7] = 5;
        this.f5045f[i7] = bArr;
    }

    @Override // U2.f
    public final String l() {
        String str = this.f5041b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // U2.f
    public final void n(U2.e eVar) {
        int i7 = this.f5047v;
        if (1 > i7) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f5046u[i10];
            if (i11 == 1) {
                eVar.a(i10);
            } else if (i11 == 2) {
                eVar.f(i10, this.f5042c[i10]);
            } else if (i11 == 3) {
                eVar.b(i10, this.f5043d[i10]);
            } else if (i11 == 4) {
                String str = this.f5044e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.p(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f5045f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.g(i10, bArr);
            }
            if (i10 == i7) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // U2.e
    public final void p(int i7, String value) {
        kotlin.jvm.internal.l.e(value, "value");
        this.f5046u[i7] = 4;
        this.f5044e[i7] = value;
    }
}
