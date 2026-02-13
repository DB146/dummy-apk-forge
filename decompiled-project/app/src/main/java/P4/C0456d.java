package P4;

import java.util.ArrayList;
import m4.E0;
import n5.AbstractC1705a;

/* renamed from: P4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456d implements InterfaceC0476y, InterfaceC0475x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0476y f8020a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0475x f8021b;

    /* renamed from: c, reason: collision with root package name */
    public C0455c[] f8022c = new C0455c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f8023d;

    /* renamed from: e, reason: collision with root package name */
    public long f8024e;

    /* renamed from: f, reason: collision with root package name */
    public long f8025f;

    /* renamed from: u, reason: collision with root package name */
    public C0458f f8026u;

    public C0456d(InterfaceC0476y interfaceC0476y, boolean z8, long j, long j10) {
        this.f8020a = interfaceC0476y;
        this.f8023d = z8 ? j : -9223372036854775807L;
        this.f8024e = j;
        this.f8025f = j10;
    }

    @Override // P4.InterfaceC0475x
    public final void a(InterfaceC0476y interfaceC0476y) {
        if (this.f8026u != null) {
            return;
        }
        InterfaceC0475x interfaceC0475x = this.f8021b;
        interfaceC0475x.getClass();
        interfaceC0475x.a(this);
    }

    public final boolean b() {
        return this.f8023d != -9223372036854775807L;
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        long j10 = this.f8024e;
        if (j == j10) {
            return j10;
        }
        long j11 = n5.D.j(e02.f19888a, 0L, j - j10);
        long j12 = this.f8025f;
        long j13 = n5.D.j(e02.f19889b, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j);
        if (j11 != e02.f19888a || j13 != e02.f19889b) {
            e02 = new E0(j11, j13);
        }
        return this.f8020a.c(j, e02);
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f8020a.d();
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        InterfaceC0475x interfaceC0475x = this.f8021b;
        interfaceC0475x.getClass();
        interfaceC0475x.i(this);
    }

    @Override // P4.f0
    public final long j() {
        long j = this.f8020a.j();
        if (j != Long.MIN_VALUE) {
            long j10 = this.f8025f;
            if (j10 == Long.MIN_VALUE || j < j10) {
                return j;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        if (b()) {
            long j = this.f8023d;
            this.f8023d = -9223372036854775807L;
            long k = k();
            return k != -9223372036854775807L ? k : j;
        }
        long k7 = this.f8020a.k();
        if (k7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1705a.m(k7 >= this.f8024e);
        long j10 = this.f8025f;
        AbstractC1705a.m(j10 == Long.MIN_VALUE || k7 <= j10);
        return k7;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        return this.f8020a.l();
    }

    @Override // P4.f0
    public final long n() {
        long n6 = this.f8020a.n();
        if (n6 != Long.MIN_VALUE) {
            long j = this.f8025f;
            if (j == Long.MIN_VALUE || n6 < j) {
                return n6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        C0458f c0458f = this.f8026u;
        if (c0458f != null) {
            throw c0458f;
        }
        this.f8020a.o();
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f8021b = interfaceC0475x;
        this.f8020a.q(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // P4.InterfaceC0476y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r(long j) {
        this.f8023d = -9223372036854775807L;
        boolean z8 = false;
        for (C0455c c0455c : this.f8022c) {
            if (c0455c != null) {
                c0455c.f7988b = false;
            }
        }
        long r10 = this.f8020a.r(j);
        if (r10 != j) {
            if (r10 >= this.f8024e) {
                long j10 = this.f8025f;
                if (j10 != Long.MIN_VALUE) {
                }
            }
            AbstractC1705a.m(z8);
            return r10;
        }
        z8 = true;
        AbstractC1705a.m(z8);
        return r10;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        this.f8020a.s(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        if (r1 > r3) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    @Override // P4.InterfaceC0476y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        long j10;
        boolean z8;
        H2.O f4;
        int a9;
        this.f8022c = new C0455c[d0VarArr.length];
        d0[] d0VarArr2 = new d0[d0VarArr.length];
        int i7 = 0;
        while (true) {
            d0 d0Var = null;
            if (i7 >= d0VarArr.length) {
                break;
            }
            C0455c[] c0455cArr = this.f8022c;
            C0455c c0455c = (C0455c) d0VarArr[i7];
            c0455cArr[i7] = c0455c;
            if (c0455c != null) {
                d0Var = c0455c.f7987a;
            }
            d0VarArr2[i7] = d0Var;
            i7++;
        }
        long v10 = this.f8020a.v(sVarArr, zArr, d0VarArr2, zArr2, j);
        if (b()) {
            long j11 = this.f8024e;
            if (j == j11 && j11 != 0) {
                for (k5.s sVar : sVarArr) {
                    if (sVar != null) {
                        m4.L l10 = sVar.l();
                        String str = l10.f20096z;
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
                                case 3:
                                    String str2 = l10.f20093w;
                                    if (str2 != null && (f4 = n5.o.f(str2)) != null && (a9 = f4.a()) != 0 && a9 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.f8023d = j10;
                            if (v10 != j) {
                                if (v10 >= this.f8024e) {
                                    long j12 = this.f8025f;
                                    if (j12 != Long.MIN_VALUE) {
                                    }
                                }
                                z8 = false;
                                AbstractC1705a.m(z8);
                                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                                    d0 d0Var2 = d0VarArr2[i10];
                                    if (d0Var2 == null) {
                                        this.f8022c[i10] = null;
                                    } else {
                                        C0455c[] c0455cArr2 = this.f8022c;
                                        C0455c c0455c2 = c0455cArr2[i10];
                                        if (c0455c2 == null || c0455c2.f7987a != d0Var2) {
                                            c0455cArr2[i10] = new C0455c(this, d0Var2);
                                        }
                                    }
                                    d0VarArr[i10] = this.f8022c[i10];
                                }
                                return v10;
                            }
                            z8 = true;
                            AbstractC1705a.m(z8);
                            while (i10 < d0VarArr.length) {
                            }
                            return v10;
                        }
                        j10 = v10;
                        this.f8023d = j10;
                        if (v10 != j) {
                        }
                        z8 = true;
                        AbstractC1705a.m(z8);
                        while (i10 < d0VarArr.length) {
                        }
                        return v10;
                    }
                }
            }
        }
        j10 = -9223372036854775807L;
        this.f8023d = j10;
        if (v10 != j) {
        }
        z8 = true;
        AbstractC1705a.m(z8);
        while (i10 < d0VarArr.length) {
        }
        return v10;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        return this.f8020a.x(j);
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f8020a.y(j);
    }
}
