package M4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.C1704A;
import n5.v;

/* loaded from: classes.dex */
public final class c extends Q5.e {

    /* renamed from: d, reason: collision with root package name */
    public final v f6748d = new v();

    /* renamed from: e, reason: collision with root package name */
    public final b5.f f6749e = new b5.f();

    /* renamed from: f, reason: collision with root package name */
    public C1704A f6750f;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r6 != r8) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F4.c u(F4.e eVar, ByteBuffer byteBuffer) {
        Object obj;
        int i7;
        int i10;
        long j;
        ArrayList arrayList;
        long j10;
        long j11;
        boolean z8;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        long j12;
        boolean z12;
        List list;
        long j13;
        long j14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        int i15;
        int i16;
        boolean z17;
        int i17 = 32;
        boolean z18 = true;
        C1704A c1704a = this.f6750f;
        if (c1704a != null) {
            long j15 = eVar.f4074w;
            synchronized (c1704a) {
                long j16 = c1704a.f21137b;
            }
        }
        C1704A c1704a2 = new C1704A(eVar.f23460f);
        this.f6750f = c1704a2;
        c1704a2.a(eVar.f23460f - eVar.f4074w);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.f6748d;
        vVar.E(limit, array);
        b5.f fVar = this.f6749e;
        fVar.n(limit, array);
        fVar.s(39);
        long i18 = (fVar.i(1) << 32) | fVar.i(32);
        fVar.s(20);
        int i19 = fVar.i(12);
        int i20 = fVar.i(8);
        vVar.H(14);
        if (i20 == 0) {
            obj = new Object();
        } else if (i20 != 255) {
            long j17 = 1;
            long j18 = -9223372036854775807L;
            if (i20 == 4) {
                int v10 = vVar.v();
                ArrayList arrayList2 = new ArrayList(v10);
                int i21 = 0;
                while (i21 < v10) {
                    long w10 = vVar.w();
                    boolean z19 = (vVar.v() & 128) != 0 ? z18 : false;
                    ArrayList arrayList3 = new ArrayList();
                    if (z19) {
                        i7 = i17;
                        i10 = i21;
                        j = j17;
                        arrayList = arrayList3;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z8 = false;
                        z10 = false;
                        z11 = false;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                    } else {
                        int v11 = vVar.v();
                        boolean z20 = (v11 & 128) != 0 ? z18 : false;
                        boolean z21 = (v11 & 64) != 0 ? z18 : false;
                        boolean z22 = (v11 & i17) != 0 ? z18 : false;
                        long w11 = z21 ? vVar.w() : -9223372036854775807L;
                        if (z21) {
                            i10 = i21;
                        } else {
                            int v12 = vVar.v();
                            ArrayList arrayList4 = new ArrayList(v12);
                            int i22 = 0;
                            while (i22 < v12) {
                                arrayList4.add(new g(vVar.v(), vVar.w()));
                                i22++;
                                i21 = i21;
                            }
                            i10 = i21;
                            arrayList3 = arrayList4;
                        }
                        if (z22) {
                            long v13 = vVar.v();
                            z12 = (v13 & 128) != 0;
                            j = 1;
                            i7 = 32;
                            j12 = ((((v13 & 1) << 32) | vVar.w()) * 1000) / 90;
                        } else {
                            i7 = 32;
                            j = 1;
                            j12 = -9223372036854775807L;
                            z12 = false;
                        }
                        j11 = j12;
                        z11 = z12;
                        arrayList = arrayList3;
                        z8 = z20;
                        z10 = z21;
                        j10 = w11;
                        i11 = vVar.A();
                        i12 = vVar.v();
                        i13 = vVar.v();
                    }
                    arrayList2.add(new h(w10, z19, z8, z10, arrayList, j10, z11, j11, i11, i12, i13));
                    i21 = i10 + 1;
                    z18 = true;
                    i17 = i7;
                    j17 = j;
                }
                obj = new i(arrayList2);
            } else if (i20 == 5) {
                C1704A c1704a3 = this.f6750f;
                long w12 = vVar.w();
                boolean z23 = (vVar.v() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z23) {
                    list = emptyList;
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z13 = false;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                } else {
                    int v14 = vVar.v();
                    boolean z24 = (v14 & 128) != 0;
                    boolean z25 = (v14 & 64) != 0;
                    boolean z26 = (v14 & 32) != 0;
                    boolean z27 = (v14 & 16) != 0;
                    long a9 = (!z25 || z27) ? -9223372036854775807L : j.a(i18, vVar);
                    if (!z25) {
                        int v15 = vVar.v();
                        ArrayList arrayList5 = new ArrayList(v15);
                        for (int i23 = 0; i23 < v15; i23++) {
                            int v16 = vVar.v();
                            long a10 = !z27 ? j.a(i18, vVar) : -9223372036854775807L;
                            arrayList5.add(new d(v16, a10, c1704a3.b(a10)));
                        }
                        emptyList = arrayList5;
                    }
                    if (z26) {
                        long v17 = vVar.v();
                        z17 = (v17 & 128) != 0;
                        j18 = ((((v17 & 1) << 32) | vVar.w()) * 1000) / 90;
                    } else {
                        z17 = false;
                    }
                    int A10 = vVar.A();
                    int v18 = vVar.v();
                    z16 = z17;
                    i14 = A10;
                    list = emptyList;
                    i16 = vVar.v();
                    i15 = v18;
                    z13 = z24;
                    j14 = j18;
                    j13 = a9;
                    z15 = z27;
                    z14 = z25;
                }
                obj = new e(w12, z23, z13, z14, z15, j13, c1704a3.b(j13), list, z16, j14, i14, i15, i16);
            } else if (i20 != 6) {
                obj = null;
            } else {
                C1704A c1704a4 = this.f6750f;
                long a11 = j.a(i18, vVar);
                obj = new j(a11, c1704a4.b(a11));
            }
        } else {
            long w13 = vVar.w();
            int i24 = i19 - 4;
            byte[] bArr = new byte[i24];
            vVar.f(0, bArr, i24);
            obj = new a(w13, bArr, i18);
        }
        return obj == null ? new F4.c(new F4.b[0]) : new F4.c(obj);
    }
}
