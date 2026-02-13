package P4;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import m5.C1604a;
import m5.C1620q;
import m5.InterfaceC1613j;
import n5.AbstractC1705a;
import r4.C1936h;
import r4.C1937i;
import r4.C1941m;
import r4.InterfaceC1938j;

/* loaded from: classes.dex */
public class c0 implements s4.v {

    /* renamed from: A, reason: collision with root package name */
    public m4.L f7990A;

    /* renamed from: B, reason: collision with root package name */
    public m4.L f7991B;

    /* renamed from: C, reason: collision with root package name */
    public long f7992C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7993D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7994E;

    /* renamed from: F, reason: collision with root package name */
    public long f7995F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7996G;

    /* renamed from: a, reason: collision with root package name */
    public final X f7997a;

    /* renamed from: c, reason: collision with root package name */
    public final A4.s f7999c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.q f8000d;

    /* renamed from: e, reason: collision with root package name */
    public final C1941m f8001e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f8002f;
    public m4.L g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1938j f8003h;

    /* renamed from: p, reason: collision with root package name */
    public int f8009p;

    /* renamed from: q, reason: collision with root package name */
    public int f8010q;

    /* renamed from: r, reason: collision with root package name */
    public int f8011r;

    /* renamed from: s, reason: collision with root package name */
    public int f8012s;

    /* renamed from: t, reason: collision with root package name */
    public long f8013t;

    /* renamed from: u, reason: collision with root package name */
    public long f8014u;

    /* renamed from: v, reason: collision with root package name */
    public long f8015v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8016w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8017x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8018y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8019z;

    /* renamed from: b, reason: collision with root package name */
    public final Z f7998b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f8004i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f8007n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f8006m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f8005l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public s4.u[] f8008o = new s4.u[1000];

    /* JADX WARN: Type inference failed for: r1v1, types: [P4.Z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [A4.s, java.lang.Object] */
    public c0(C1620q c1620q, r4.q qVar, C1941m c1941m) {
        this.f8000d = qVar;
        this.f8001e = c1941m;
        this.f7997a = new X(c1620q);
        Y y10 = new Y(0);
        ?? obj = new Object();
        obj.f471b = new SparseArray();
        obj.f472c = y10;
        obj.f470a = -1;
        this.f7999c = obj;
        this.f8013t = Long.MIN_VALUE;
        this.f8014u = Long.MIN_VALUE;
        this.f8015v = Long.MIN_VALUE;
        this.f8018y = true;
        this.f8017x = true;
    }

    public final void A(boolean z8) {
        A4.s sVar;
        SparseArray sparseArray;
        X x2 = this.f7997a;
        x2.a(x2.f7971d);
        A4.e eVar = x2.f7971d;
        int i7 = 0;
        AbstractC1705a.m(((C1604a) eVar.f379c) == null);
        eVar.f377a = 0L;
        eVar.f378b = x2.f7969b;
        A4.e eVar2 = x2.f7971d;
        x2.f7972e = eVar2;
        x2.f7973f = eVar2;
        x2.g = 0L;
        x2.f7968a.b();
        this.f8009p = 0;
        this.f8010q = 0;
        this.f8011r = 0;
        this.f8012s = 0;
        this.f8017x = true;
        this.f8013t = Long.MIN_VALUE;
        this.f8014u = Long.MIN_VALUE;
        this.f8015v = Long.MIN_VALUE;
        this.f8016w = false;
        while (true) {
            sVar = this.f7999c;
            sparseArray = (SparseArray) sVar.f471b;
            if (i7 >= sparseArray.size()) {
                break;
            }
            ((Y) sVar.f472c).d(sparseArray.valueAt(i7));
            i7++;
        }
        sVar.f470a = -1;
        sparseArray.clear();
        if (z8) {
            this.f7990A = null;
            this.f7991B = null;
            this.f8018y = true;
        }
    }

    public final synchronized boolean B(long j, boolean z8) {
        synchronized (this) {
            this.f8012s = 0;
            X x2 = this.f7997a;
            x2.f7972e = x2.f7971d;
        }
        int p10 = p(0);
        if (s() && j >= this.f8007n[p10] && (j <= this.f8015v || z8)) {
            int k = k(p10, this.f8009p - this.f8012s, j, true);
            if (k == -1) {
                return false;
            }
            this.f8013t = j;
            this.f8012s += k;
            return true;
        }
        return false;
    }

    public final synchronized void C(int i7) {
        boolean z8;
        if (i7 >= 0) {
            try {
                if (this.f8012s + i7 <= this.f8009p) {
                    z8 = true;
                    AbstractC1705a.h(z8);
                    this.f8012s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z8 = false;
        AbstractC1705a.h(z8);
        this.f8012s += i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010f, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(m4.L l10) {
        String str;
        boolean z8;
        boolean z10 = true;
        m4.L l11 = l(l10);
        this.f8019z = false;
        this.f7990A = l10;
        synchronized (this) {
            try {
                this.f8018y = false;
                if (n5.D.a(l11, this.f7991B)) {
                    z10 = false;
                } else {
                    if (!(((SparseArray) this.f7999c.f471b).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.f7999c.f471b;
                        if (((a0) sparseArray.valueAt(sparseArray.size() - 1)).f7985a.equals(l11)) {
                            SparseArray sparseArray2 = (SparseArray) this.f7999c.f471b;
                            this.f7991B = ((a0) sparseArray2.valueAt(sparseArray2.size() - 1)).f7985a;
                            m4.L l12 = this.f7991B;
                            str = l12.f20096z;
                            String str2 = l12.f20093w;
                            ArrayList arrayList = n5.o.f21193a;
                            if (str != null) {
                                char c10 = 65535;
                                switch (str.hashCode()) {
                                    case -2123537834:
                                        if (str.equals("audio/eac3-joc")) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case -432837260:
                                        if (str.equals("audio/mpeg-L1")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                    case -432837259:
                                        if (str.equals("audio/mpeg-L2")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case -53558318:
                                        if (str.equals("audio/mp4a-latm")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case 187078296:
                                        if (str.equals("audio/ac3")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                    case 187094639:
                                        if (str.equals("audio/raw")) {
                                            c10 = 5;
                                            break;
                                        }
                                        break;
                                    case 1504578661:
                                        if (str.equals("audio/eac3")) {
                                            c10 = 6;
                                            break;
                                        }
                                        break;
                                    case 1504619009:
                                        if (str.equals("audio/flac")) {
                                            c10 = 7;
                                            break;
                                        }
                                        break;
                                    case 1504831518:
                                        if (str.equals("audio/mpeg")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        break;
                                    case 1903231877:
                                        if (str.equals("audio/g711-alaw")) {
                                            c10 = '\t';
                                            break;
                                        }
                                        break;
                                    case 1903589369:
                                        if (str.equals("audio/g711-mlaw")) {
                                            c10 = '\n';
                                            break;
                                        }
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    case '\t':
                                    case '\n':
                                        z8 = true;
                                        break;
                                    case 3:
                                        if (str2 != null) {
                                            H2.O f4 = n5.o.f(str2);
                                            if (f4 == null) {
                                                break;
                                            } else {
                                                int a9 = f4.a();
                                                if (a9 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                this.f7993D = z8;
                                this.f7994E = false;
                            }
                            z8 = false;
                            this.f7993D = z8;
                            this.f7994E = false;
                        }
                    }
                    this.f7991B = l11;
                    m4.L l122 = this.f7991B;
                    str = l122.f20096z;
                    String str22 = l122.f20093w;
                    ArrayList arrayList2 = n5.o.f21193a;
                    if (str != null) {
                    }
                    z8 = false;
                    this.f7993D = z8;
                    this.f7994E = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b0 b0Var = this.f8002f;
        if (b0Var == null || !z10) {
            return;
        }
        b0Var.p();
    }

    @Override // s4.v
    public final void c(int i7, n5.v vVar) {
        while (true) {
            X x2 = this.f7997a;
            if (i7 <= 0) {
                x2.getClass();
                return;
            }
            int c10 = x2.c(i7);
            A4.e eVar = x2.f7973f;
            C1604a c1604a = (C1604a) eVar.f379c;
            vVar.f(((int) (x2.g - eVar.f377a)) + c1604a.f20593b, c1604a.f20592a, c10);
            i7 -= c10;
            long j = x2.g + c10;
            x2.g = j;
            A4.e eVar2 = x2.f7973f;
            if (j == eVar2.f378b) {
                x2.f7973f = (A4.e) eVar2.f380d;
            }
        }
    }

    @Override // s4.v
    public final int d(InterfaceC1613j interfaceC1613j, int i7, boolean z8) {
        X x2 = this.f7997a;
        int c10 = x2.c(i7);
        A4.e eVar = x2.f7973f;
        C1604a c1604a = (C1604a) eVar.f379c;
        int D10 = interfaceC1613j.D(c1604a.f20592a, ((int) (x2.g - eVar.f377a)) + c1604a.f20593b, c10);
        if (D10 == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        long j = x2.g + D10;
        x2.g = j;
        A4.e eVar2 = x2.f7973f;
        if (j != eVar2.f378b) {
            return D10;
        }
        x2.f7973f = (A4.e) eVar2.f380d;
        return D10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        if (((P4.a0) r0.valueAt(r0.size() - 1)).f7985a.equals(r16.f7991B) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(long j, int i7, int i10, int i11, s4.u uVar) {
        int i12;
        boolean z8;
        if (this.f8019z) {
            m4.L l10 = this.f7990A;
            AbstractC1705a.n(l10);
            a(l10);
        }
        int i13 = i7 & 1;
        boolean z10 = i13 != 0;
        if (this.f8017x) {
            if (!z10) {
                return;
            } else {
                this.f8017x = false;
            }
        }
        long j10 = j + this.f7995F;
        if (this.f7993D) {
            if (j10 < this.f8013t) {
                return;
            }
            if (i13 == 0) {
                if (!this.f7994E) {
                    AbstractC1705a.S("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f7991B);
                    this.f7994E = true;
                }
                i12 = i7 | 1;
                if (this.f7996G) {
                    if (!z10) {
                        return;
                    }
                    synchronized (this) {
                        if (this.f8009p == 0) {
                            z8 = j10 > this.f8014u;
                        } else {
                            synchronized (this) {
                                long max = Math.max(this.f8014u, n(this.f8012s));
                                if (max >= j10) {
                                    z8 = false;
                                } else {
                                    int i14 = this.f8009p;
                                    int p10 = p(i14 - 1);
                                    while (i14 > this.f8012s && this.f8007n[p10] >= j10) {
                                        i14--;
                                        p10--;
                                        if (p10 == -1) {
                                            p10 = this.f8004i - 1;
                                        }
                                    }
                                    i(this.f8010q + i14);
                                    z8 = true;
                                }
                            }
                        }
                    }
                    if (!z8) {
                        return;
                    } else {
                        this.f7996G = false;
                    }
                }
                long j11 = (this.f7997a.g - i10) - i11;
                synchronized (this) {
                    try {
                        int i15 = this.f8009p;
                        if (i15 > 0) {
                            int p11 = p(i15 - 1);
                            AbstractC1705a.h(this.k[p11] + ((long) this.f8005l[p11]) <= j11);
                        }
                        this.f8016w = (536870912 & i12) != 0;
                        this.f8015v = Math.max(this.f8015v, j10);
                        int p12 = p(this.f8009p);
                        this.f8007n[p12] = j10;
                        this.k[p12] = j11;
                        this.f8005l[p12] = i10;
                        this.f8006m[p12] = i12;
                        this.f8008o[p12] = uVar;
                        this.j[p12] = this.f7992C;
                        if (!(((SparseArray) this.f7999c.f471b).size() == 0)) {
                            SparseArray sparseArray = (SparseArray) this.f7999c.f471b;
                        }
                        r4.q qVar = this.f8000d;
                        r4.p c10 = qVar != null ? qVar.c(this.f8001e, this.f7991B) : r4.p.f23774s;
                        A4.s sVar = this.f7999c;
                        int i16 = this.f8010q + this.f8009p;
                        m4.L l11 = this.f7991B;
                        l11.getClass();
                        a0 a0Var = new a0(l11, c10);
                        int i17 = sVar.f470a;
                        SparseArray sparseArray2 = (SparseArray) sVar.f471b;
                        if (i17 == -1) {
                            AbstractC1705a.m(sparseArray2.size() == 0);
                            sVar.f470a = 0;
                        }
                        if (sparseArray2.size() > 0) {
                            int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                            AbstractC1705a.h(i16 >= keyAt);
                            if (keyAt == i16) {
                                ((Y) sVar.f472c).d(sparseArray2.valueAt(sparseArray2.size() - 1));
                            }
                        }
                        sparseArray2.append(i16, a0Var);
                        int i18 = this.f8009p + 1;
                        this.f8009p = i18;
                        int i19 = this.f8004i;
                        if (i18 == i19) {
                            int i20 = i19 + 1000;
                            long[] jArr = new long[i20];
                            long[] jArr2 = new long[i20];
                            long[] jArr3 = new long[i20];
                            int[] iArr = new int[i20];
                            int[] iArr2 = new int[i20];
                            s4.u[] uVarArr = new s4.u[i20];
                            int i21 = this.f8011r;
                            int i22 = i19 - i21;
                            System.arraycopy(this.k, i21, jArr2, 0, i22);
                            System.arraycopy(this.f8007n, this.f8011r, jArr3, 0, i22);
                            System.arraycopy(this.f8006m, this.f8011r, iArr, 0, i22);
                            System.arraycopy(this.f8005l, this.f8011r, iArr2, 0, i22);
                            System.arraycopy(this.f8008o, this.f8011r, uVarArr, 0, i22);
                            System.arraycopy(this.j, this.f8011r, jArr, 0, i22);
                            int i23 = this.f8011r;
                            System.arraycopy(this.k, 0, jArr2, i22, i23);
                            System.arraycopy(this.f8007n, 0, jArr3, i22, i23);
                            System.arraycopy(this.f8006m, 0, iArr, i22, i23);
                            System.arraycopy(this.f8005l, 0, iArr2, i22, i23);
                            System.arraycopy(this.f8008o, 0, uVarArr, i22, i23);
                            System.arraycopy(this.j, 0, jArr, i22, i23);
                            this.k = jArr2;
                            this.f8007n = jArr3;
                            this.f8006m = iArr;
                            this.f8005l = iArr2;
                            this.f8008o = uVarArr;
                            this.j = jArr;
                            this.f8011r = 0;
                            this.f8004i = i20;
                        }
                    } finally {
                    }
                }
                return;
            }
        }
        i12 = i7;
        if (this.f7996G) {
        }
        long j112 = (this.f7997a.g - i10) - i11;
        synchronized (this) {
        }
    }

    public final long f(int i7) {
        this.f8014u = Math.max(this.f8014u, n(i7));
        this.f8009p -= i7;
        int i10 = this.f8010q + i7;
        this.f8010q = i10;
        int i11 = this.f8011r + i7;
        this.f8011r = i11;
        int i12 = this.f8004i;
        if (i11 >= i12) {
            this.f8011r = i11 - i12;
        }
        int i13 = this.f8012s - i7;
        this.f8012s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f8012s = 0;
        }
        while (true) {
            A4.s sVar = this.f7999c;
            SparseArray sparseArray = (SparseArray) sVar.f471b;
            if (i14 >= sparseArray.size() - 1) {
                break;
            }
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((Y) sVar.f472c).d(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = sVar.f470a;
            if (i16 > 0) {
                sVar.f470a = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f8009p != 0) {
            return this.k[this.f8011r];
        }
        int i17 = this.f8011r;
        if (i17 == 0) {
            i17 = this.f8004i;
        }
        return this.k[i17 - 1] + this.f8005l[r7];
    }

    public final void g(long j, boolean z8) {
        long j10;
        int i7;
        X x2 = this.f7997a;
        synchronized (this) {
            try {
                int i10 = this.f8009p;
                j10 = -1;
                if (i10 != 0) {
                    long[] jArr = this.f8007n;
                    int i11 = this.f8011r;
                    if (j >= jArr[i11]) {
                        if (z8 && (i7 = this.f8012s) != i10) {
                            i10 = i7 + 1;
                        }
                        int k = k(i11, i10, j, false);
                        if (k != -1) {
                            j10 = f(k);
                        }
                    }
                }
            } finally {
            }
        }
        x2.b(j10);
    }

    public final void h() {
        long f4;
        X x2 = this.f7997a;
        synchronized (this) {
            int i7 = this.f8009p;
            f4 = i7 == 0 ? -1L : f(i7);
        }
        x2.b(f4);
    }

    public final long i(int i7) {
        int i10 = this.f8010q;
        int i11 = this.f8009p;
        int i12 = (i10 + i11) - i7;
        boolean z8 = false;
        AbstractC1705a.h(i12 >= 0 && i12 <= i11 - this.f8012s);
        int i13 = this.f8009p - i12;
        this.f8009p = i13;
        this.f8015v = Math.max(this.f8014u, n(i13));
        if (i12 == 0 && this.f8016w) {
            z8 = true;
        }
        this.f8016w = z8;
        A4.s sVar = this.f7999c;
        SparseArray sparseArray = (SparseArray) sVar.f471b;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((Y) sVar.f472c).d(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        sVar.f470a = sparseArray.size() > 0 ? Math.min(sVar.f470a, sparseArray.size() - 1) : -1;
        int i14 = this.f8009p;
        if (i14 == 0) {
            return 0L;
        }
        return this.k[p(i14 - 1)] + this.f8005l[r9];
    }

    public final void j(int i7) {
        long i10 = i(i7);
        X x2 = this.f7997a;
        AbstractC1705a.h(i10 <= x2.g);
        x2.g = i10;
        int i11 = x2.f7969b;
        if (i10 != 0) {
            A4.e eVar = x2.f7971d;
            if (i10 != eVar.f377a) {
                while (x2.g > eVar.f378b) {
                    eVar = (A4.e) eVar.f380d;
                }
                A4.e eVar2 = (A4.e) eVar.f380d;
                eVar2.getClass();
                x2.a(eVar2);
                A4.e eVar3 = new A4.e(i11, eVar.f378b);
                eVar.f380d = eVar3;
                if (x2.g == eVar.f378b) {
                    eVar = eVar3;
                }
                x2.f7973f = eVar;
                if (x2.f7972e == eVar2) {
                    x2.f7972e = eVar3;
                    return;
                }
                return;
            }
        }
        x2.a(x2.f7971d);
        A4.e eVar4 = new A4.e(i11, x2.g);
        x2.f7971d = eVar4;
        x2.f7972e = eVar4;
        x2.f7973f = eVar4;
    }

    public final int k(int i7, int i10, long j, boolean z8) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f8007n[i7];
            if (j10 > j) {
                break;
            }
            if (!z8 || (this.f8006m[i7] & 1) != 0) {
                i11 = i12;
                if (j10 == j) {
                    break;
                }
            }
            i7++;
            if (i7 == this.f8004i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public m4.L l(m4.L l10) {
        if (this.f7995F == 0 || l10.f20067D == Long.MAX_VALUE) {
            return l10;
        }
        m4.K a9 = l10.a();
        a9.f19987o = l10.f20067D + this.f7995F;
        return new m4.L(a9);
    }

    public final synchronized long m() {
        return this.f8015v;
    }

    public final long n(int i7) {
        long j = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int p10 = p(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            j = Math.max(j, this.f8007n[p10]);
            if ((this.f8006m[p10] & 1) != 0) {
                break;
            }
            p10--;
            if (p10 == -1) {
                p10 = this.f8004i - 1;
            }
        }
        return j;
    }

    public final int o() {
        return this.f8010q + this.f8012s;
    }

    public final int p(int i7) {
        int i10 = this.f8011r + i7;
        int i11 = this.f8004i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int q(long j, boolean z8) {
        int p10 = p(this.f8012s);
        if (s() && j >= this.f8007n[p10]) {
            if (j > this.f8015v && z8) {
                return this.f8009p - this.f8012s;
            }
            int k = k(p10, this.f8009p - this.f8012s, j, true);
            if (k == -1) {
                return 0;
            }
            return k;
        }
        return 0;
    }

    public final synchronized m4.L r() {
        return this.f8018y ? null : this.f7991B;
    }

    public final boolean s() {
        return this.f8012s != this.f8009p;
    }

    public final synchronized boolean t(boolean z8) {
        m4.L l10;
        boolean z10 = true;
        if (s()) {
            if (((a0) this.f7999c.l(o())).f7985a != this.g) {
                return true;
            }
            return u(p(this.f8012s));
        }
        if (!z8 && !this.f8016w && ((l10 = this.f7991B) == null || l10 == this.g)) {
            z10 = false;
        }
        return z10;
    }

    public final boolean u(int i7) {
        InterfaceC1938j interfaceC1938j = this.f8003h;
        return interfaceC1938j == null || interfaceC1938j.getState() == 4 || ((this.f8006m[i7] & 1073741824) == 0 && this.f8003h.b());
    }

    public final void v() {
        InterfaceC1938j interfaceC1938j = this.f8003h;
        if (interfaceC1938j == null || interfaceC1938j.getState() != 1) {
            return;
        }
        C1937i error = this.f8003h.getError();
        error.getClass();
        throw error;
    }

    public final void w(m4.L l10, ha.g gVar) {
        m4.L l11;
        m4.L l12 = this.g;
        boolean z8 = l12 == null;
        C1936h c1936h = z8 ? null : l12.f20066C;
        this.g = l10;
        C1936h c1936h2 = l10.f20066C;
        r4.q qVar = this.f8000d;
        if (qVar != null) {
            int e2 = qVar.e(l10);
            m4.K a9 = l10.a();
            a9.f19975F = e2;
            l11 = new m4.L(a9);
        } else {
            l11 = l10;
        }
        gVar.f17916c = l11;
        gVar.f17915b = this.f8003h;
        if (qVar == null) {
            return;
        }
        if (z8 || !n5.D.a(c1936h, c1936h2)) {
            InterfaceC1938j interfaceC1938j = this.f8003h;
            C1941m c1941m = this.f8001e;
            InterfaceC1938j d10 = qVar.d(c1941m, l10);
            this.f8003h = d10;
            gVar.f17915b = d10;
            if (interfaceC1938j != null) {
                interfaceC1938j.a(c1941m);
            }
        }
    }

    public final synchronized long x() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return s() ? this.j[p(this.f8012s)] : this.f7992C;
    }

    public final int y(ha.g gVar, q4.g gVar2, int i7, boolean z8) {
        int i10;
        boolean z10 = (i7 & 2) != 0;
        Z z11 = this.f7998b;
        synchronized (this) {
            try {
                gVar2.f23459e = false;
                i10 = -3;
                if (s()) {
                    m4.L l10 = ((a0) this.f7999c.l(o())).f7985a;
                    if (!z10 && l10 == this.g) {
                        int p10 = p(this.f8012s);
                        if (u(p10)) {
                            gVar2.f368b = this.f8006m[p10];
                            if (this.f8012s == this.f8009p - 1 && (z8 || this.f8016w)) {
                                gVar2.a(536870912);
                            }
                            long j = this.f8007n[p10];
                            gVar2.f23460f = j;
                            if (j < this.f8013t) {
                                gVar2.a(Integer.MIN_VALUE);
                            }
                            z11.f7975a = this.f8005l[p10];
                            z11.f7976b = this.k[p10];
                            z11.f7977c = this.f8008o[p10];
                            i10 = -4;
                        } else {
                            gVar2.f23459e = true;
                        }
                    }
                    w(l10, gVar);
                    i10 = -5;
                } else {
                    if (!z8 && !this.f8016w) {
                        m4.L l11 = this.f7991B;
                        if (l11 == null || (!z10 && l11 == this.g)) {
                        }
                        w(l11, gVar);
                        i10 = -5;
                    }
                    gVar2.f368b = 4;
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !gVar2.i(4)) {
            boolean z12 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z12) {
                    X x2 = this.f7997a;
                    X.f(x2.f7972e, gVar2, this.f7998b, x2.f7970c);
                } else {
                    X x10 = this.f7997a;
                    x10.f7972e = X.f(x10.f7972e, gVar2, this.f7998b, x10.f7970c);
                }
            }
            if (!z12) {
                this.f8012s++;
            }
        }
        return i10;
    }

    public final void z() {
        A(true);
        InterfaceC1938j interfaceC1938j = this.f8003h;
        if (interfaceC1938j != null) {
            interfaceC1938j.a(this.f8001e);
            this.f8003h = null;
            this.g = null;
        }
    }
}
