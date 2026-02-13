package A4;

import android.os.SystemClock;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.OnFailureListener;
import i0.C1289b;
import java.util.concurrent.atomic.AtomicLong;
import n5.AbstractC1705a;
import n5.D;
import s4.C1978f;
import s4.C1979g;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import u0.C2080j;
import x4.C2265c;
import z.V;

/* loaded from: classes.dex */
public final class f implements S4.i, OnFailureListener, InterfaceC1983k, InterfaceC1984l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f381a;

    /* renamed from: b, reason: collision with root package name */
    public long f382b;

    /* renamed from: c, reason: collision with root package name */
    public Object f383c;

    public f(int i7) {
        this.f381a = i7;
        switch (i7) {
            case 5:
                return;
            default:
                this.f382b = 0L;
                return;
        }
    }

    public f(long j, InterfaceC1984l interfaceC1984l) {
        this.f381a = 7;
        this.f382b = j;
        this.f383c = interfaceC1984l;
    }

    public f(M5.b bVar) {
        this.f381a = 4;
        G.g(bVar);
        this.f383c = bVar;
    }

    public /* synthetic */ f(Object obj, int i7, long j) {
        this.f381a = i7;
        this.f383c = obj;
        this.f382b = j;
    }

    public f(C1979g c1979g, long j) {
        this.f381a = 6;
        this.f383c = c1979g;
        AbstractC1705a.h(c1979g.f24055d >= j);
        this.f382b = j;
    }

    @Override // s4.InterfaceC1983k
    public long A() {
        return ((C1979g) this.f383c).A() - this.f382b;
    }

    @Override // s4.InterfaceC1983k
    public void C(int i7) {
        ((C1979g) this.f383c).b(i7, false);
    }

    @Override // m5.InterfaceC1613j
    public int D(byte[] bArr, int i7, int i10) {
        return ((C1979g) this.f383c).D(bArr, i7, i10);
    }

    @Override // s4.InterfaceC1983k
    public long E() {
        return ((C1979g) this.f383c).f24055d - this.f382b;
    }

    public long F(C2080j c2080j, float f4) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        long e2 = C1289b.e(this.f382b, C1289b.d(c2080j.f24765c, c2080j.g));
        this.f382b = e2;
        V v10 = (V) this.f383c;
        if ((v10 == null ? C1289b.c(e2) : Math.abs(L(e2))) < f4) {
            return 9205357640488583168L;
        }
        if (v10 == null) {
            long j = this.f382b;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / C1289b.c(j);
            return C1289b.d(this.f382b, C1289b.f((4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / r9)) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f4));
        }
        float L = L(this.f382b) - (Math.signum(L(this.f382b)) * f4);
        long j10 = this.f382b;
        V v11 = V.f27944b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (v10 == v11 ? j10 & 4294967295L : j10 >> 32));
        if (v10 == v11) {
            floatToRawIntBits = Float.floatToRawIntBits(L);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat2);
            floatToRawIntBits2 = Float.floatToRawIntBits(L);
        }
        return (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2);
    }

    public void G(int i7) {
        if (i7 < 64) {
            this.f382b &= ~(1 << i7);
            return;
        }
        f fVar = (f) this.f383c;
        if (fVar != null) {
            fVar.G(i7 - 64);
        }
    }

    public int H(int i7) {
        f fVar = (f) this.f383c;
        if (fVar == null) {
            return i7 >= 64 ? Long.bitCount(this.f382b) : Long.bitCount(this.f382b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.f382b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.f382b) + fVar.H(i7 - 64);
    }

    public void I() {
        if (((f) this.f383c) == null) {
            this.f383c = new f(1);
        }
    }

    public boolean J(int i7) {
        if (i7 < 64) {
            return (this.f382b & (1 << i7)) != 0;
        }
        I();
        return ((f) this.f383c).J(i7 - 64);
    }

    public void K(int i7, boolean z8) {
        if (i7 >= 64) {
            I();
            ((f) this.f383c).K(i7 - 64, z8);
            return;
        }
        long j = this.f382b;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j10 = (1 << i7) - 1;
        this.f382b = ((j & (~j10)) << 1) | (j & j10);
        if (z8) {
            O(i7);
        } else {
            G(i7);
        }
        if (z10 || ((f) this.f383c) != null) {
            I();
            ((f) this.f383c).K(0, z10);
        }
    }

    public float L(long j) {
        return Float.intBitsToFloat((int) (((V) this.f383c) == V.f27944b ? j >> 32 : j & 4294967295L));
    }

    public boolean M(int i7) {
        if (i7 >= 64) {
            I();
            return ((f) this.f383c).M(i7 - 64);
        }
        long j = 1 << i7;
        long j10 = this.f382b;
        boolean z8 = (j10 & j) != 0;
        long j11 = j10 & (~j);
        this.f382b = j11;
        long j12 = j - 1;
        this.f382b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        f fVar = (f) this.f383c;
        if (fVar != null) {
            if (fVar.J(0)) {
                O(63);
            }
            ((f) this.f383c).M(0);
        }
        return z8;
    }

    public void N() {
        this.f382b = 0L;
        f fVar = (f) this.f383c;
        if (fVar != null) {
            fVar.N();
        }
    }

    public void O(int i7) {
        if (i7 < 64) {
            this.f382b |= 1 << i7;
        } else {
            I();
            ((f) this.f383c).O(i7 - 64);
        }
    }

    public void P(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f383c) == null) {
            this.f383c = exc;
            this.f382b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f382b) {
            Exception exc2 = (Exception) this.f383c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f383c;
            this.f383c = null;
            throw exc3;
        }
    }

    @Override // S4.i
    public long b(long j) {
        return ((C1978f) this.f383c).f24050e[(int) j] - this.f382b;
    }

    @Override // S4.i
    public long c(long j, long j10) {
        return D.e(((C1978f) this.f383c).f24050e, j + this.f382b, true);
    }

    @Override // s4.InterfaceC1984l
    public void f() {
        ((InterfaceC1984l) this.f383c).f();
    }

    @Override // S4.i
    public long g(long j, long j10) {
        return ((C1978f) this.f383c).f24049d[(int) j];
    }

    @Override // s4.InterfaceC1983k
    public boolean h(byte[] bArr, int i7, int i10, boolean z8) {
        return ((C1979g) this.f383c).h(bArr, 0, i10, z8);
    }

    @Override // s4.InterfaceC1984l
    public void i(s4.s sVar) {
        ((InterfaceC1984l) this.f383c).i(new C2265c(this, sVar));
    }

    @Override // s4.InterfaceC1983k
    public long k() {
        return ((C1979g) this.f383c).f24054c - this.f382b;
    }

    @Override // S4.i
    public long l(long j, long j10) {
        return 0L;
    }

    @Override // s4.InterfaceC1983k
    public void m(int i7, byte[] bArr, int i10) {
        ((C1979g) this.f383c).x(bArr, i7, i10, false);
    }

    @Override // S4.i
    public long o(long j, long j10) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        ((AtomicLong) ((Q7.h) this.f383c).f8697d).set(this.f382b);
    }

    @Override // S4.i
    public T4.j p(long j) {
        return new T4.j(((C1978f) this.f383c).f24048c[(int) j], r0.f24047b[r8], null);
    }

    @Override // s4.InterfaceC1983k
    public void q() {
        ((C1979g) this.f383c).f24057f = 0;
    }

    @Override // s4.InterfaceC1983k
    public void r(int i7) {
        ((C1979g) this.f383c).r(i7);
    }

    @Override // s4.InterfaceC1983k
    public void readFully(byte[] bArr, int i7, int i10) {
        ((C1979g) this.f383c).h(bArr, i7, i10, false);
    }

    @Override // S4.i
    public boolean s() {
        return true;
    }

    public String toString() {
        switch (this.f381a) {
            case 1:
                if (((f) this.f383c) == null) {
                    return Long.toBinaryString(this.f382b);
                }
                return ((f) this.f383c).toString() + "xx" + Long.toBinaryString(this.f382b);
            default:
                return super.toString();
        }
    }

    @Override // s4.InterfaceC1984l
    public s4.v u(int i7, int i10) {
        return ((InterfaceC1984l) this.f383c).u(i7, i10);
    }

    @Override // S4.i
    public long v() {
        return 0L;
    }

    @Override // s4.InterfaceC1983k
    public boolean x(byte[] bArr, int i7, int i10, boolean z8) {
        return ((C1979g) this.f383c).x(bArr, i7, i10, z8);
    }

    @Override // S4.i
    public long y(long j) {
        return ((C1978f) this.f383c).f24046a;
    }

    @Override // S4.i
    public long z(long j, long j10) {
        return ((C1978f) this.f383c).f24046a;
    }
}
