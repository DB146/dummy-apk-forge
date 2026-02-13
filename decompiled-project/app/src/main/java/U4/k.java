package U4;

import C4.C0239a;
import C4.C0241c;
import C4.C0242d;
import C4.C0244f;
import C4.D;
import N6.F;
import N6.H;
import N6.t0;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import m4.K;
import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import n5.C1704A;
import r4.C1936h;
import s4.C1979g;
import s4.InterfaceC1982j;
import y7.u0;
import z4.C2591d;

/* loaded from: classes.dex */
public final class k extends R4.k {

    /* renamed from: Z, reason: collision with root package name */
    public static final AtomicInteger f9547Z = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final Uri f9548A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f9549B;

    /* renamed from: C, reason: collision with root package name */
    public final int f9550C;

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC1616m f9551D;

    /* renamed from: E, reason: collision with root package name */
    public final C1619p f9552E;

    /* renamed from: F, reason: collision with root package name */
    public final b f9553F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f9554G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f9555H;

    /* renamed from: I, reason: collision with root package name */
    public final C1704A f9556I;

    /* renamed from: J, reason: collision with root package name */
    public final c f9557J;

    /* renamed from: K, reason: collision with root package name */
    public final List f9558K;
    public final C1936h L;

    /* renamed from: M, reason: collision with root package name */
    public final K4.i f9559M;

    /* renamed from: N, reason: collision with root package name */
    public final n5.v f9560N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f9561O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f9562P;

    /* renamed from: Q, reason: collision with root package name */
    public b f9563Q;

    /* renamed from: R, reason: collision with root package name */
    public r f9564R;

    /* renamed from: S, reason: collision with root package name */
    public int f9565S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f9566T;

    /* renamed from: U, reason: collision with root package name */
    public volatile boolean f9567U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9568V;

    /* renamed from: W, reason: collision with root package name */
    public t0 f9569W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9570X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f9571Y;

    /* renamed from: y, reason: collision with root package name */
    public final int f9572y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9573z;

    public k(c cVar, InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, boolean z8, InterfaceC1616m interfaceC1616m2, C1619p c1619p2, boolean z10, Uri uri, List list, int i7, Object obj, long j, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, C1704A c1704a, C1936h c1936h, b bVar, K4.i iVar, n5.v vVar, boolean z14, n4.l lVar) {
        super(interfaceC1616m, c1619p, l10, i7, obj, j, j10, j11);
        this.f9561O = z8;
        this.f9550C = i10;
        this.f9571Y = z11;
        this.f9573z = i11;
        this.f9552E = c1619p2;
        this.f9551D = interfaceC1616m2;
        this.f9566T = c1619p2 != null;
        this.f9562P = z10;
        this.f9548A = uri;
        this.f9554G = z13;
        this.f9556I = c1704a;
        this.f9555H = z12;
        this.f9557J = cVar;
        this.f9558K = list;
        this.L = c1936h;
        this.f9553F = bVar;
        this.f9559M = iVar;
        this.f9560N = vVar;
        this.f9549B = z14;
        F f4 = H.f7232b;
        this.f9569W = t0.f7341e;
        this.f9572y = f9547Z.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (u0.N(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        b bVar;
        this.f9564R.getClass();
        if (this.f9563Q == null && (bVar = this.f9553F) != null) {
            InterfaceC1982j interfaceC1982j = bVar.f9517a;
            if ((interfaceC1982j instanceof D) || (interfaceC1982j instanceof A4.n)) {
                this.f9563Q = bVar;
                this.f9566T = false;
            }
        }
        if (this.f9566T) {
            InterfaceC1616m interfaceC1616m = this.f9551D;
            interfaceC1616m.getClass();
            C1619p c1619p = this.f9552E;
            c1619p.getClass();
            e(interfaceC1616m, c1619p, this.f9562P, false);
            this.f9565S = 0;
            this.f9566T = false;
        }
        if (this.f9567U) {
            return;
        }
        if (!this.f9555H) {
            e(this.f8877w, this.f8870b, this.f9561O, true);
        }
        this.f9568V = !this.f9567U;
    }

    @Override // R4.k
    public final boolean c() {
        throw null;
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f9567U = true;
    }

    public final void e(InterfaceC1616m interfaceC1616m, C1619p c1619p, boolean z8, boolean z10) {
        C1619p b2;
        long j;
        long j10;
        if (z8) {
            r0 = this.f9565S != 0;
            b2 = c1619p;
        } else {
            b2 = c1619p.b(this.f9565S);
        }
        try {
            C1979g h10 = h(interfaceC1616m, b2, z10);
            if (r0) {
                h10.r(this.f9565S);
            }
            while (!this.f9567U) {
                try {
                    try {
                        if (this.f9563Q.f9517a.e(h10, b.f9516d) != 0) {
                            break;
                        }
                    } catch (EOFException e2) {
                        if ((this.f8872d.f20089e & 16384) == 0) {
                            throw e2;
                        }
                        this.f9563Q.f9517a.a(0L, 0L);
                        j = h10.f24055d;
                        j10 = c1619p.f20632e;
                    }
                } catch (Throwable th) {
                    this.f9565S = (int) (h10.f24055d - c1619p.f20632e);
                    throw th;
                }
            }
            j = h10.f24055d;
            j10 = c1619p.f20632e;
            this.f9565S = (int) (j - j10);
        } finally {
            c2.i.f(interfaceC1616m);
        }
    }

    public final int g(int i7) {
        AbstractC1705a.m(!this.f9549B);
        if (i7 >= this.f9569W.size()) {
            return 0;
        }
        return ((Integer) this.f9569W.get(i7)).intValue();
    }

    public final C1979g h(InterfaceC1616m interfaceC1616m, C1619p c1619p, boolean z8) {
        int i7;
        long j;
        long j10;
        C1704A c1704a;
        long j11;
        b bVar;
        b bVar2;
        ArrayList arrayList;
        InterfaceC1982j c0239a;
        boolean z10;
        boolean z11;
        int i10;
        InterfaceC1982j c2591d;
        long d10 = interfaceC1616m.d(c1619p);
        long j12 = this.f8875u;
        C1704A c1704a2 = this.f9556I;
        if (z8) {
            try {
                c1704a2.f(j12, this.f9554G);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e2) {
                throw new IOException(e2);
            }
        }
        C1979g c1979g = new C1979g(interfaceC1616m, c1619p.f20632e, d10);
        if (this.f9563Q == null) {
            n5.v vVar = this.f9560N;
            c1979g.f24057f = 0;
            try {
                vVar.D(10);
                c1979g.x(vVar.f21229a, 0, 10, false);
                if (vVar.x() == 4801587) {
                    vVar.H(3);
                    int u3 = vVar.u();
                    int i11 = u3 + 10;
                    byte[] bArr = vVar.f21229a;
                    if (i11 > bArr.length) {
                        vVar.D(i11);
                        System.arraycopy(bArr, 0, vVar.f21229a, 0, 10);
                    }
                    c1979g.x(vVar.f21229a, 10, u3, false);
                    F4.c W10 = this.f9559M.W(u3, vVar.f21229a);
                    if (W10 != null) {
                        for (F4.b bVar3 : W10.f4071a) {
                            if (bVar3 instanceof K4.n) {
                                K4.n nVar = (K4.n) bVar3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(nVar.f6151b)) {
                                    System.arraycopy(nVar.f6152c, 0, vVar.f21229a, 0, 8);
                                    vVar.G(0);
                                    vVar.F(8);
                                    j = vVar.p() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            c1979g.f24057f = 0;
            b bVar4 = this.f9553F;
            if (bVar4 != null) {
                InterfaceC1982j interfaceC1982j = bVar4.f9517a;
                AbstractC1705a.m(!((interfaceC1982j instanceof D) || (interfaceC1982j instanceof A4.n)));
                boolean z12 = interfaceC1982j instanceof v;
                C1704A c1704a3 = bVar4.f9519c;
                L l10 = bVar4.f9518b;
                if (z12) {
                    c2591d = new v(l10.f20087c, c1704a3);
                } else if (interfaceC1982j instanceof C0242d) {
                    c2591d = new C0242d();
                } else if (interfaceC1982j instanceof C0239a) {
                    c2591d = new C0239a();
                } else if (interfaceC1982j instanceof C0241c) {
                    c2591d = new C0241c();
                } else {
                    if (!(interfaceC1982j instanceof C2591d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC1982j.getClass().getSimpleName()));
                    }
                    c2591d = new C2591d();
                }
                bVar2 = new b(c2591d, l10, c1704a3);
                j10 = j12;
                c1704a = c1704a2;
                j11 = j;
                i7 = 0;
            } else {
                Map n6 = interfaceC1616m.n();
                this.f9557J.getClass();
                L l11 = this.f8872d;
                int C2 = AbstractC1705a.C(l11.f20096z);
                List list = (List) n6.get("Content-Type");
                int C10 = AbstractC1705a.C((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int D10 = AbstractC1705a.D(c1619p.f20628a);
                ArrayList arrayList2 = new ArrayList(7);
                c.a(C2, arrayList2);
                c.a(C10, arrayList2);
                c.a(D10, arrayList2);
                int[] iArr = c.f9520b;
                int i12 = 0;
                for (int i13 = 7; i12 < i13; i13 = 7) {
                    c.a(iArr[i12], arrayList2);
                    i12++;
                }
                c1979g.f24057f = 0;
                int i14 = 0;
                InterfaceC1982j interfaceC1982j2 = null;
                while (true) {
                    int size = arrayList2.size();
                    C1704A c1704a4 = this.f9556I;
                    if (i14 >= size) {
                        j10 = j12;
                        c1704a = c1704a2;
                        j11 = j;
                        i7 = 0;
                        interfaceC1982j2.getClass();
                        bVar = new b(interfaceC1982j2, l11, c1704a4);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i14)).intValue();
                    j10 = j12;
                    if (intValue == 0) {
                        c1704a = c1704a2;
                        j11 = j;
                        arrayList = arrayList2;
                        c0239a = new C0239a();
                    } else if (intValue == 1) {
                        c1704a = c1704a2;
                        j11 = j;
                        arrayList = arrayList2;
                        c0239a = new C0241c();
                    } else if (intValue == 2) {
                        c1704a = c1704a2;
                        j11 = j;
                        arrayList = arrayList2;
                        c0239a = new C0242d();
                    } else if (intValue != 7) {
                        List list2 = this.f9558K;
                        arrayList = arrayList2;
                        if (intValue != 8) {
                            if (intValue == 11) {
                                if (list2 != null) {
                                    i10 = 48;
                                } else {
                                    K k = new K();
                                    k.k = "application/cea-608";
                                    list2 = Collections.singletonList(new L(k));
                                    i10 = 16;
                                }
                                String str = l11.f20093w;
                                c1704a = c1704a2;
                                if (!TextUtils.isEmpty(str)) {
                                    if (n5.o.b(str, "audio/mp4a-latm") == null) {
                                        i10 |= 2;
                                    }
                                    if (n5.o.b(str, "video/avc") == null) {
                                        i10 |= 4;
                                    }
                                }
                                c0239a = new D(2, c1704a4, new C0244f(i10, list2));
                            } else if (intValue != 13) {
                                c1704a = c1704a2;
                                j11 = j;
                                c0239a = null;
                            } else {
                                c0239a = new v(l11.f20087c, c1704a4);
                                c1704a = c1704a2;
                            }
                            j11 = j;
                        } else {
                            c1704a = c1704a2;
                            F4.c cVar = l11.f20094x;
                            if (cVar != null) {
                                j11 = j;
                                int i15 = 0;
                                while (true) {
                                    F4.b[] bVarArr = cVar.f4071a;
                                    if (i15 >= bVarArr.length) {
                                        break;
                                    }
                                    F4.b bVar5 = bVarArr[i15];
                                    if (bVar5 instanceof u) {
                                        z11 = !((u) bVar5).f9682c.isEmpty();
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                j11 = j;
                            }
                            z11 = false;
                            int i16 = z11 ? 4 : 0;
                            if (list2 == null) {
                                list2 = Collections.emptyList();
                            }
                            c0239a = new A4.n(i16, c1704a4, null, list2, null);
                        }
                    } else {
                        c1704a = c1704a2;
                        j11 = j;
                        arrayList = arrayList2;
                        c0239a = new C2591d(0L);
                    }
                    c0239a.getClass();
                    try {
                        z10 = c0239a.c(c1979g);
                        i7 = 0;
                        c1979g.f24057f = 0;
                    } catch (EOFException unused3) {
                        i7 = 0;
                        c1979g.f24057f = 0;
                        z10 = false;
                    } catch (Throwable th) {
                        c1979g.f24057f = 0;
                        throw th;
                    }
                    if (z10) {
                        bVar = new b(c0239a, l11, c1704a4);
                        break;
                    }
                    if (interfaceC1982j2 == null && (intValue == C2 || intValue == C10 || intValue == D10 || intValue == 11)) {
                        interfaceC1982j2 = c0239a;
                    }
                    i14++;
                    j12 = j10;
                    arrayList2 = arrayList;
                    c1704a2 = c1704a;
                    j = j11;
                }
                bVar2 = bVar;
            }
            this.f9563Q = bVar2;
            InterfaceC1982j interfaceC1982j3 = bVar2.f9517a;
            if ((((interfaceC1982j3 instanceof C0242d) || (interfaceC1982j3 instanceof C0239a) || (interfaceC1982j3 instanceof C0241c) || (interfaceC1982j3 instanceof C2591d)) ? 1 : i7) != 0) {
                r rVar = this.f9564R;
                long b2 = j11 != -9223372036854775807L ? c1704a.b(j11) : j10;
                if (rVar.f9664j0 != b2) {
                    rVar.f9664j0 = b2;
                    q[] qVarArr = rVar.f9633J;
                    int length = qVarArr.length;
                    for (int i17 = i7; i17 < length; i17++) {
                        q qVar = qVarArr[i17];
                        if (qVar.f7995F != b2) {
                            qVar.f7995F = b2;
                            qVar.f8019z = true;
                        }
                    }
                }
            } else {
                r rVar2 = this.f9564R;
                if (rVar2.f9664j0 != 0) {
                    rVar2.f9664j0 = 0L;
                    q[] qVarArr2 = rVar2.f9633J;
                    int length2 = qVarArr2.length;
                    for (int i18 = i7; i18 < length2; i18++) {
                        q qVar2 = qVarArr2[i18];
                        if (qVar2.f7995F != 0) {
                            qVar2.f7995F = 0L;
                            qVar2.f8019z = true;
                        }
                    }
                }
            }
            this.f9564R.L.clear();
            this.f9563Q.f9517a.f(this.f9564R);
        } else {
            i7 = 0;
        }
        r rVar3 = this.f9564R;
        C1936h c1936h = rVar3.f9665k0;
        C1936h c1936h2 = this.L;
        if (!n5.D.a(c1936h, c1936h2)) {
            rVar3.f9665k0 = c1936h2;
            int i19 = i7;
            while (true) {
                q[] qVarArr3 = rVar3.f9633J;
                if (i19 >= qVarArr3.length) {
                    break;
                }
                if (rVar3.f9654c0[i19]) {
                    q qVar3 = qVarArr3[i19];
                    qVar3.f9622I = c1936h2;
                    qVar3.f8019z = true;
                }
                i19++;
            }
        }
        return c1979g;
    }
}
