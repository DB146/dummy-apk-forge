package E4;

import P4.d0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m4.AbstractC1565e;
import m4.AbstractC1571h;
import m4.C1581m;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import o4.InterfaceC1802p;
import o4.M;
import o5.C1807b;
import q4.C1889b;
import q4.InterfaceC1888a;
import r4.C1936h;
import r4.C1937i;
import r4.InterfaceC1938j;
import r4.z;

/* loaded from: classes.dex */
public abstract class q extends AbstractC1565e {

    /* renamed from: R0, reason: collision with root package name */
    public static final byte[] f3596R0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    public int f3597A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f3598B0;

    /* renamed from: C, reason: collision with root package name */
    public final i f3599C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public final r f3600D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f3601D0;

    /* renamed from: E, reason: collision with root package name */
    public final float f3602E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f3603E0;

    /* renamed from: F, reason: collision with root package name */
    public final q4.g f3604F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3605F0;

    /* renamed from: G, reason: collision with root package name */
    public final q4.g f3606G;

    /* renamed from: G0, reason: collision with root package name */
    public long f3607G0;

    /* renamed from: H, reason: collision with root package name */
    public final q4.g f3608H;

    /* renamed from: H0, reason: collision with root package name */
    public long f3609H0;

    /* renamed from: I, reason: collision with root package name */
    public final f f3610I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f3611I0;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f3612J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f3613J0;

    /* renamed from: K, reason: collision with root package name */
    public final MediaCodec.BufferInfo f3614K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f3615K0;
    public final ArrayDeque L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f3616L0;

    /* renamed from: M, reason: collision with root package name */
    public final M f3617M;

    /* renamed from: M0, reason: collision with root package name */
    public C1581m f3618M0;

    /* renamed from: N, reason: collision with root package name */
    public L f3619N;

    /* renamed from: N0, reason: collision with root package name */
    public q4.d f3620N0;

    /* renamed from: O, reason: collision with root package name */
    public L f3621O;

    /* renamed from: O0, reason: collision with root package name */
    public p f3622O0;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1938j f3623P;

    /* renamed from: P0, reason: collision with root package name */
    public long f3624P0;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC1938j f3625Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f3626Q0;

    /* renamed from: R, reason: collision with root package name */
    public MediaCrypto f3627R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3628S;

    /* renamed from: T, reason: collision with root package name */
    public final long f3629T;

    /* renamed from: U, reason: collision with root package name */
    public float f3630U;

    /* renamed from: V, reason: collision with root package name */
    public float f3631V;

    /* renamed from: W, reason: collision with root package name */
    public j f3632W;

    /* renamed from: X, reason: collision with root package name */
    public L f3633X;

    /* renamed from: Y, reason: collision with root package name */
    public MediaFormat f3634Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3635Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f3636a0;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayDeque f3637b0;

    /* renamed from: c0, reason: collision with root package name */
    public o f3638c0;

    /* renamed from: d0, reason: collision with root package name */
    public m f3639d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f3640e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3641f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f3642g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3643h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3644i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f3645j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f3646k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f3647l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3648m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f3649n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f3650o0;

    /* renamed from: p0, reason: collision with root package name */
    public g f3651p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f3652q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f3653r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f3654s0;

    /* renamed from: t0, reason: collision with root package name */
    public ByteBuffer f3655t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f3656u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3657v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f3658w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f3659x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3660y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f3661z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [E4.f, q4.g] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o4.M, java.lang.Object] */
    public q(int i7, i iVar, float f4) {
        super(i7);
        r rVar = r.f3662b;
        this.f3599C = iVar;
        this.f3600D = rVar;
        this.f3602E = f4;
        this.f3604F = new q4.g(0);
        this.f3606G = new q4.g(0);
        this.f3608H = new q4.g(2);
        ?? gVar = new q4.g(2);
        gVar.f3571y = 32;
        this.f3610I = gVar;
        this.f3612J = new ArrayList();
        this.f3614K = new MediaCodec.BufferInfo();
        this.f3630U = 1.0f;
        this.f3631V = 1.0f;
        this.f3629T = -9223372036854775807L;
        this.L = new ArrayDeque();
        m0(p.f3592d);
        gVar.I(0);
        gVar.f23458d.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f21768c = InterfaceC1802p.f21871a;
        obj.f21767b = 0;
        obj.f21766a = 2;
        this.f3617M = obj;
        this.f3636a0 = -1.0f;
        this.f3640e0 = 0;
        this.f3597A0 = 0;
        this.f3653r0 = -1;
        this.f3654s0 = -1;
        this.f3652q0 = -9223372036854775807L;
        this.f3607G0 = -9223372036854775807L;
        this.f3609H0 = -9223372036854775807L;
        this.f3624P0 = -9223372036854775807L;
        this.f3598B0 = 0;
        this.C0 = 0;
    }

    @Override // m4.AbstractC1565e
    public final int A(L l10) {
        try {
            return p0(this.f3600D, l10);
        } catch (u e2) {
            throw f(e2, l10, false, 4002);
        }
    }

    @Override // m4.AbstractC1565e
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028b A[LOOP:0: B:26:0x0090->B:91:0x028b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j, long j10) {
        boolean z8;
        f fVar;
        boolean z10;
        boolean z11;
        String str;
        int i7;
        int i10;
        AbstractC1705a.m(!this.f3613J0);
        f fVar2 = this.f3610I;
        int i11 = fVar2.f3570x;
        if (!(i11 > 0)) {
            z8 = false;
            fVar = fVar2;
        } else {
            if (!f0(j, j10, null, fVar2.f23458d, this.f3654s0, 0, i11, fVar2.f23460f, fVar2.i(Integer.MIN_VALUE), fVar2.i(4), this.f3621O)) {
                return false;
            }
            fVar = fVar2;
            a0(fVar.f3569w);
            fVar.G();
            z8 = false;
        }
        if (this.f3611I0) {
            this.f3613J0 = true;
            return z8;
        }
        boolean z12 = true;
        boolean z13 = this.f3659x0;
        q4.g gVar = this.f3608H;
        if (z13) {
            AbstractC1705a.m(fVar.K(gVar));
            this.f3659x0 = z8;
        }
        if (this.f3660y0) {
            if (fVar.f3570x > 0) {
                return true;
            }
            F();
            this.f3660y0 = z8;
            S();
            if (!this.f3658w0) {
                return z8;
            }
        }
        AbstractC1705a.m(!this.f3611I0);
        ha.g gVar2 = this.f20354c;
        gVar2.clear();
        gVar.G();
        ?? r12 = z8;
        while (true) {
            gVar.G();
            int v10 = v(gVar2, gVar, r12);
            if (v10 == -5) {
                z10 = r12;
                z11 = z12;
                X(gVar2);
                break;
            }
            if (v10 != -4) {
                if (v10 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (gVar.i(4)) {
                    this.f3611I0 = z12;
                    break;
                }
                byte[] bArr = null;
                if (this.f3615K0) {
                    L l10 = this.f3619N;
                    l10.getClass();
                    this.f3621O = l10;
                    Y(l10, null);
                    this.f3615K0 = r12;
                }
                gVar.J();
                L l11 = this.f3619N;
                if (l11 != null && (str = l11.f20096z) != null && str.equals("audio/opus")) {
                    List list = this.f3619N.f20065B;
                    M m10 = this.f3617M;
                    m10.getClass();
                    gVar.f23458d.getClass();
                    if (gVar.f23458d.limit() - gVar.f23458d.position() != 0) {
                        if (m10.f21766a == 2 && (list.size() == z12 || list.size() == 3)) {
                            bArr = (byte[]) list.get(r12);
                        }
                        ByteBuffer byteBuffer = gVar.f23458d;
                        int position = byteBuffer.position();
                        int limit = byteBuffer.limit();
                        int i12 = limit - position;
                        int i13 = (i12 + 255) / 255;
                        int i14 = i13 + 27 + i12;
                        if (m10.f21766a == 2) {
                            i7 = bArr != null ? bArr.length + 28 : 47;
                            i14 = i7 + 44 + i14;
                        } else {
                            i7 = r12;
                        }
                        int i15 = i14;
                        if (((ByteBuffer) m10.f21768c).capacity() < i15) {
                            m10.f21768c = ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) m10.f21768c).clear();
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) m10.f21768c;
                        if (m10.f21766a == 2) {
                            if (bArr != null) {
                                M.a(byteBuffer2, 0L, 0, 1, true);
                                i10 = limit;
                                long length = bArr.length;
                                Q5.e.j(length, "out of range: %s", (length >> 8) == 0);
                                byteBuffer2.put((byte) length);
                                byteBuffer2.put(bArr);
                                byteBuffer2.putInt(22, D.l(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                                byteBuffer2.position(bArr.length + 28);
                            } else {
                                i10 = limit;
                                byteBuffer2.put(M.f21764d);
                            }
                            byteBuffer2.put(M.f21765e);
                        } else {
                            i10 = limit;
                        }
                        int g = m10.f21767b + ((int) ((AbstractC1787a.g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000));
                        m10.f21767b = g;
                        M.a(byteBuffer2, g, m10.f21766a, i13, false);
                        int i16 = i12;
                        for (int i17 = 0; i17 < i13; i17++) {
                            if (i16 >= 255) {
                                byteBuffer2.put((byte) -1);
                                i16 -= 255;
                            } else {
                                byteBuffer2.put((byte) i16);
                                i16 = 0;
                            }
                        }
                        int i18 = i10;
                        while (position < i18) {
                            byteBuffer2.put(byteBuffer.get(position));
                            position++;
                        }
                        byteBuffer.position(byteBuffer.limit());
                        byteBuffer2.flip();
                        if (m10.f21766a == 2) {
                            z10 = false;
                            byteBuffer2.putInt(i7 + 66, D.l(byteBuffer2.arrayOffset() + i7 + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
                        } else {
                            z10 = false;
                            byteBuffer2.putInt(22, D.l(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
                        }
                        m10.f21766a++;
                        m10.f21768c = byteBuffer2;
                        gVar.G();
                        gVar.I(((ByteBuffer) m10.f21768c).remaining());
                        gVar.f23458d.put((ByteBuffer) m10.f21768c);
                        gVar.J();
                        if (fVar.K(gVar)) {
                            z11 = true;
                            this.f3659x0 = true;
                            break;
                        }
                        r12 = z10;
                        z12 = true;
                    }
                }
                z10 = r12;
                if (fVar.K(gVar)) {
                }
            }
        }
        z10 = r12;
        z11 = z12;
        if (fVar.f3570x > 0) {
            fVar.J();
        }
        return (fVar.f3570x > 0 || this.f3611I0 || this.f3660y0) ? z11 : z10;
    }

    public abstract q4.i D(m mVar, L l10, L l11);

    public k E(IllegalStateException illegalStateException, m mVar) {
        return new k(illegalStateException, mVar);
    }

    public final void F() {
        this.f3660y0 = false;
        this.f3610I.G();
        this.f3608H.G();
        this.f3659x0 = false;
        this.f3658w0 = false;
        M m10 = this.f3617M;
        m10.getClass();
        m10.f21768c = InterfaceC1802p.f21871a;
        m10.f21767b = 0;
        m10.f21766a = 2;
    }

    public final boolean G() {
        if (this.f3601D0) {
            this.f3598B0 = 1;
            if (this.f3642g0 || this.f3644i0) {
                this.C0 = 3;
                return false;
            }
            this.C0 = 2;
        } else {
            r0();
        }
        return true;
    }

    public final boolean H(long j, long j10) {
        boolean z8;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean f02;
        int a9;
        boolean z11;
        boolean z12 = this.f3654s0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f3614K;
        if (!z12) {
            if (this.f3645j0 && this.f3603E0) {
                try {
                    a9 = this.f3632W.a(bufferInfo2);
                } catch (IllegalStateException unused) {
                    e0();
                    if (this.f3613J0) {
                        h0();
                    }
                    return false;
                }
            } else {
                a9 = this.f3632W.a(bufferInfo2);
            }
            if (a9 < 0) {
                if (a9 != -2) {
                    if (this.f3650o0 && (this.f3611I0 || this.f3598B0 == 2)) {
                        e0();
                    }
                    return false;
                }
                this.f3605F0 = true;
                MediaFormat p10 = this.f3632W.p();
                if (this.f3640e0 != 0 && p10.getInteger("width") == 32 && p10.getInteger("height") == 32) {
                    this.f3649n0 = true;
                } else {
                    if (this.f3647l0) {
                        p10.setInteger("channel-count", 1);
                    }
                    this.f3634Y = p10;
                    this.f3635Z = true;
                }
                return true;
            }
            if (this.f3649n0) {
                this.f3649n0 = false;
                this.f3632W.d(a9, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                e0();
                return false;
            }
            this.f3654s0 = a9;
            ByteBuffer v10 = this.f3632W.v(a9);
            this.f3655t0 = v10;
            if (v10 != null) {
                v10.position(bufferInfo2.offset);
                this.f3655t0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f3646k0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j11 = this.f3607G0;
                if (j11 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j11;
                }
            }
            long j12 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f3612J;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z11 = false;
                    break;
                }
                if (((Long) arrayList.get(i7)).longValue() == j12) {
                    arrayList.remove(i7);
                    z11 = true;
                    break;
                }
                i7++;
            }
            this.f3656u0 = z11;
            long j13 = this.f3609H0;
            long j14 = bufferInfo2.presentationTimeUs;
            this.f3657v0 = j13 == j14;
            s0(j14);
        }
        if (this.f3645j0 && this.f3603E0) {
            try {
                z8 = true;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                f02 = f0(j, j10, this.f3632W, this.f3655t0, this.f3654s0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f3656u0, this.f3657v0, this.f3621O);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                e0();
                if (this.f3613J0) {
                    h0();
                }
                return z10;
            }
        } else {
            z8 = true;
            z10 = false;
            bufferInfo = bufferInfo2;
            f02 = f0(j, j10, this.f3632W, this.f3655t0, this.f3654s0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f3656u0, this.f3657v0, this.f3621O);
        }
        if (f02) {
            a0(bufferInfo.presentationTimeUs);
            boolean z13 = (bufferInfo.flags & 4) != 0 ? z8 : z10;
            this.f3654s0 = -1;
            this.f3655t0 = null;
            if (!z13) {
                return z8;
            }
            e0();
        }
        return z10;
    }

    public final boolean I() {
        boolean z8;
        C1889b c1889b;
        j jVar = this.f3632W;
        if (jVar == null || this.f3598B0 == 2 || this.f3611I0) {
            return false;
        }
        int i7 = this.f3653r0;
        q4.g gVar = this.f3606G;
        if (i7 < 0) {
            int z10 = jVar.z();
            this.f3653r0 = z10;
            if (z10 < 0) {
                return false;
            }
            gVar.f23458d = this.f3632W.q(z10);
            gVar.G();
        }
        if (this.f3598B0 == 1) {
            if (!this.f3650o0) {
                this.f3603E0 = true;
                this.f3632W.C(this.f3653r0, 0, 0L, 4);
                this.f3653r0 = -1;
                gVar.f23458d = null;
            }
            this.f3598B0 = 2;
            return false;
        }
        if (this.f3648m0) {
            this.f3648m0 = false;
            gVar.f23458d.put(f3596R0);
            this.f3632W.C(this.f3653r0, 38, 0L, 0);
            this.f3653r0 = -1;
            gVar.f23458d = null;
            this.f3601D0 = true;
            return true;
        }
        if (this.f3597A0 == 1) {
            for (int i10 = 0; i10 < this.f3633X.f20065B.size(); i10++) {
                gVar.f23458d.put((byte[]) this.f3633X.f20065B.get(i10));
            }
            this.f3597A0 = 2;
        }
        int position = gVar.f23458d.position();
        ha.g gVar2 = this.f20354c;
        gVar2.clear();
        try {
            int v10 = v(gVar2, gVar, 0);
            if (k() || gVar.i(536870912)) {
                this.f3609H0 = this.f3607G0;
            }
            if (v10 == -3) {
                return false;
            }
            if (v10 == -5) {
                if (this.f3597A0 == 2) {
                    gVar.G();
                    this.f3597A0 = 1;
                }
                X(gVar2);
                return true;
            }
            if (gVar.i(4)) {
                if (this.f3597A0 == 2) {
                    gVar.G();
                    this.f3597A0 = 1;
                }
                this.f3611I0 = true;
                if (!this.f3601D0) {
                    e0();
                    return false;
                }
                try {
                    if (!this.f3650o0) {
                        this.f3603E0 = true;
                        this.f3632W.C(this.f3653r0, 0, 0L, 4);
                        this.f3653r0 = -1;
                        gVar.f23458d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw f(e2, this.f3619N, false, D.u(e2.getErrorCode()));
                }
            }
            if (!this.f3601D0 && !gVar.i(1)) {
                gVar.G();
                if (this.f3597A0 == 2) {
                    this.f3597A0 = 1;
                }
                return true;
            }
            boolean i11 = gVar.i(1073741824);
            C1889b c1889b2 = gVar.f23457c;
            if (i11) {
                if (position == 0) {
                    c1889b2.getClass();
                } else {
                    if (c1889b2.f23443d == null) {
                        int[] iArr = new int[1];
                        c1889b2.f23443d = iArr;
                        c1889b2.f23447i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c1889b2.f23443d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f3641f0 && !i11) {
                ByteBuffer byteBuffer = gVar.f23458d;
                int position2 = byteBuffer.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i15 = byteBuffer.get(i12) & 255;
                    if (i13 == 3) {
                        if (i15 == 1 && (byteBuffer.get(i14) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.position(i12 - 3);
                            duplicate.limit(position2);
                            byteBuffer.position(0);
                            byteBuffer.put(duplicate);
                            break;
                        }
                    } else if (i15 == 0) {
                        i13++;
                    }
                    if (i15 != 0) {
                        i13 = 0;
                    }
                    i12 = i14;
                }
                if (gVar.f23458d.position() == 0) {
                    return true;
                }
                this.f3641f0 = false;
            }
            long j = gVar.f23460f;
            g gVar3 = this.f3651p0;
            if (gVar3 != null) {
                L l10 = this.f3619N;
                if (gVar3.f3573b == 0) {
                    gVar3.f3572a = j;
                }
                if (!gVar3.f3574c) {
                    ByteBuffer byteBuffer2 = gVar.f23458d;
                    byteBuffer2.getClass();
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 4; i16 < i18; i18 = 4) {
                        i17 = (i17 << 8) | (byteBuffer2.get(i16) & 255);
                        i16++;
                    }
                    int l11 = AbstractC1787a.l(i17);
                    if (l11 == -1) {
                        gVar3.f3574c = true;
                        gVar3.f3573b = 0L;
                        gVar3.f3572a = gVar.f23460f;
                        AbstractC1705a.S("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = gVar.f23460f;
                    } else {
                        z8 = i11;
                        j = Math.max(0L, ((gVar3.f3573b - 529) * 1000000) / l10.f20076N) + gVar3.f3572a;
                        gVar3.f3573b += l11;
                        long j10 = this.f3607G0;
                        g gVar4 = this.f3651p0;
                        L l12 = this.f3619N;
                        gVar4.getClass();
                        c1889b = c1889b2;
                        this.f3607G0 = Math.max(j10, Math.max(0L, ((gVar4.f3573b - 529) * 1000000) / l12.f20076N) + gVar4.f3572a);
                    }
                }
                z8 = i11;
                long j102 = this.f3607G0;
                g gVar42 = this.f3651p0;
                L l122 = this.f3619N;
                gVar42.getClass();
                c1889b = c1889b2;
                this.f3607G0 = Math.max(j102, Math.max(0L, ((gVar42.f3573b - 529) * 1000000) / l122.f20076N) + gVar42.f3572a);
            } else {
                z8 = i11;
                c1889b = c1889b2;
            }
            if (gVar.i(Integer.MIN_VALUE)) {
                this.f3612J.add(Long.valueOf(j));
            }
            if (this.f3615K0) {
                ArrayDeque arrayDeque = this.L;
                if (arrayDeque.isEmpty()) {
                    this.f3622O0.f3595c.a(this.f3619N, j);
                } else {
                    ((p) arrayDeque.peekLast()).f3595c.a(this.f3619N, j);
                }
                this.f3615K0 = false;
            }
            this.f3607G0 = Math.max(this.f3607G0, j);
            gVar.J();
            if (gVar.i(268435456)) {
                Q(gVar);
            }
            c0(gVar);
            try {
                if (z8) {
                    this.f3632W.x(this.f3653r0, c1889b, j);
                } else {
                    this.f3632W.C(this.f3653r0, gVar.f23458d.limit(), j, 0);
                }
                this.f3653r0 = -1;
                gVar.f23458d = null;
                this.f3601D0 = true;
                this.f3597A0 = 0;
                this.f3620N0.f23450c++;
                return true;
            } catch (MediaCodec.CryptoException e10) {
                throw f(e10, this.f3619N, false, D.u(e10.getErrorCode()));
            }
        } catch (q4.f e11) {
            U(e11);
            g0(0);
            J();
            return true;
        }
    }

    public final void J() {
        try {
            this.f3632W.flush();
        } finally {
            j0();
        }
    }

    public final boolean K() {
        if (this.f3632W == null) {
            return false;
        }
        int i7 = this.C0;
        if (i7 == 3 || this.f3642g0 || ((this.f3643h0 && !this.f3605F0) || (this.f3644i0 && this.f3603E0))) {
            h0();
            return true;
        }
        if (i7 == 2) {
            int i10 = D.f21141a;
            AbstractC1705a.m(i10 >= 23);
            if (i10 >= 23) {
                try {
                    r0();
                } catch (C1581m e2) {
                    AbstractC1705a.R(e2, "MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.");
                    h0();
                    return true;
                }
            }
        }
        J();
        return false;
    }

    public final List L(boolean z8) {
        L l10 = this.f3619N;
        r rVar = this.f3600D;
        ArrayList O10 = O(rVar, l10, z8);
        if (O10.isEmpty() && z8) {
            O10 = O(rVar, this.f3619N, false);
            if (!O10.isEmpty()) {
                AbstractC1705a.S("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f3619N.f20096z + ", but no secure decoder available. Trying to proceed with " + O10 + ".");
            }
        }
        return O10;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f4, L[] lArr);

    public abstract ArrayList O(r rVar, L l10, boolean z8);

    public abstract h P(m mVar, L l10, MediaCrypto mediaCrypto, float f4);

    public void Q(q4.g gVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03f9, code lost:
    
        if ("stvm8".equals(r8) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0409, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e9  */
    /* JADX WARN: Type inference failed for: r0v11, types: [E4.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(m mVar, MediaCrypto mediaCrypto) {
        float N10;
        int i7;
        boolean z8;
        boolean z10;
        String str;
        String str2;
        String sb2;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        C1936h c1936h;
        String str4 = mVar.f3581a;
        int i14 = D.f21141a;
        if (i14 < 23) {
            N10 = -1.0f;
        } else {
            float f4 = this.f3631V;
            L[] lArr = this.f20360w;
            lArr.getClass();
            N10 = N(f4, lArr);
        }
        if (N10 <= this.f3602E) {
            N10 = -1.0f;
        }
        d0(this.f3619N);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h P10 = P(mVar, this.f3619N, mediaCrypto, N10);
        if (i14 >= 31) {
            n4.l lVar = this.f20357f;
            lVar.getClass();
            n.a(P10, lVar);
        }
        try {
            AbstractC1705a.c("createCodec:" + str4);
            this.f3632W = this.f3599C.i(P10);
            AbstractC1705a.v();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mVar.d(this.f3619N)) {
                L l10 = this.f3619N;
                if (l10 == null) {
                    sb2 = "null";
                } else {
                    StringBuilder m10 = X.c.m("id=");
                    m10.append(l10.f20085a);
                    m10.append(", mimeType=");
                    m10.append(l10.f20096z);
                    int i15 = l10.f20092v;
                    if (i15 != -1) {
                        m10.append(", bitrate=");
                        m10.append(i15);
                    }
                    String str5 = l10.f20093w;
                    if (str5 != null) {
                        m10.append(", codecs=");
                        m10.append(str5);
                    }
                    C1936h c1936h2 = l10.f20066C;
                    if (c1936h2 != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i16 = 0;
                        while (i16 < c1936h2.f23764d) {
                            UUID uuid = c1936h2.f23761a[i16].f23757b;
                            if (uuid.equals(AbstractC1571h.f20383b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(AbstractC1571h.f20384c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(AbstractC1571h.f20386e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(AbstractC1571h.f20385d)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(AbstractC1571h.f20382a)) {
                                linkedHashSet.add("universal");
                            } else {
                                c1936h = c1936h2;
                                linkedHashSet.add("unknown (" + uuid + ")");
                                i16++;
                                c1936h2 = c1936h;
                            }
                            c1936h = c1936h2;
                            i16++;
                            c1936h2 = c1936h;
                        }
                        m10.append(", drm=[");
                        new D7.a(String.valueOf(','), 1).a(m10, linkedHashSet.iterator());
                        m10.append(']');
                    }
                    int i17 = l10.f20068E;
                    if (i17 != -1 && (i13 = l10.f20069F) != -1) {
                        m10.append(", res=");
                        m10.append(i17);
                        m10.append("x");
                        m10.append(i13);
                    }
                    C1807b c1807b = l10.L;
                    if (c1807b != null && (i10 = c1807b.f21941a) != -1 && (i11 = c1807b.f21942b) != -1 && (i12 = c1807b.f21943c) != -1) {
                        m10.append(", color=");
                        if (i10 == -1 || i11 == -1 || i12 == -1) {
                            str3 = "NA";
                        } else {
                            String str6 = i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
                            String str7 = i11 != -1 ? i11 != 1 ? i11 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
                            String a9 = C1807b.a(i12);
                            int i18 = D.f21141a;
                            Locale locale = Locale.US;
                            str3 = str6 + "/" + str7 + "/" + a9;
                        }
                        m10.append(str3);
                    }
                    float f10 = l10.f20070G;
                    if (f10 != -1.0f) {
                        m10.append(", fps=");
                        m10.append(f10);
                    }
                    int i19 = l10.f20075M;
                    if (i19 != -1) {
                        m10.append(", channels=");
                        m10.append(i19);
                    }
                    int i20 = l10.f20076N;
                    if (i20 != -1) {
                        m10.append(", sample_rate=");
                        m10.append(i20);
                    }
                    String str8 = l10.f20087c;
                    if (str8 != null) {
                        m10.append(", language=");
                        m10.append(str8);
                    }
                    String str9 = l10.f20086b;
                    if (str9 != null) {
                        m10.append(", label=");
                        m10.append(str9);
                    }
                    int i21 = l10.f20088d;
                    if (i21 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i21 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i21 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i21 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        m10.append(", selectionFlags=[");
                        new D7.a(String.valueOf(','), 1).a(m10, arrayList.iterator());
                        m10.append("]");
                    }
                    int i22 = l10.f20089e;
                    if (i22 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i22 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i22 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i22 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i22 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i22 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i22 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i22 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i22 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i22 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i22 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i22 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i22 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i22 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i22 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i22 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        m10.append(", roleFlags=[");
                        new D7.a(String.valueOf(','), 1).a(m10, arrayList2.iterator());
                        m10.append("]");
                    }
                    sb2 = m10.toString();
                }
                Locale locale2 = Locale.US;
                AbstractC1705a.S("MediaCodecRenderer", h3.o.n("Format exceeds selected codec's capabilities [", sb2, ", ", str4, "]"));
            }
            this.f3639d0 = mVar;
            this.f3636a0 = N10;
            this.f3633X = this.f3619N;
            int i23 = D.f21141a;
            if (i23 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str4)) {
                String str10 = D.f21144d;
                if (str10.startsWith("SM-T585") || str10.startsWith("SM-A510") || str10.startsWith("SM-A520") || str10.startsWith("SM-J700")) {
                    i7 = 2;
                    this.f3640e0 = i7;
                    this.f3641f0 = i23 >= 21 && this.f3633X.f20065B.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
                    this.f3642g0 = i23 >= 18 || (i23 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i23 == 19 && D.f21144d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
                    this.f3643h0 = i23 != 29 && "c2.android.aac.decoder".equals(str4);
                    if (i23 <= 23 || !"OMX.google.vorbis.decoder".equals(str4)) {
                        if (i23 <= 19) {
                            String str11 = D.f21142b;
                            if (!"hb2000".equals(str11)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str4)) {
                            }
                        }
                        z8 = false;
                        this.f3644i0 = z8;
                        this.f3645j0 = i23 != 21 && "OMX.google.aac.decoder".equals(str4);
                        if (i23 < 21 && "OMX.SEC.mp3.dec".equals(str4) && "samsung".equals(D.f21143c)) {
                            str2 = D.f21142b;
                            if (!str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                                z10 = true;
                                this.f3646k0 = z10;
                                this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                                str = mVar.f3581a;
                                this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
                                this.f3632W.getClass();
                                if ("c2.android.mp3.decoder".equals(str)) {
                                    this.f3651p0 = new Object();
                                }
                                if (this.f20358u == 2) {
                                    this.f3652q0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.f3620N0.f23448a++;
                                V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
                            }
                        }
                        z10 = false;
                        this.f3646k0 = z10;
                        this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                        str = mVar.f3581a;
                        this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
                        this.f3632W.getClass();
                        if ("c2.android.mp3.decoder".equals(str)) {
                        }
                        if (this.f20358u == 2) {
                        }
                        this.f3620N0.f23448a++;
                        V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
                    }
                    z8 = true;
                    this.f3644i0 = z8;
                    this.f3645j0 = i23 != 21 && "OMX.google.aac.decoder".equals(str4);
                    if (i23 < 21) {
                        str2 = D.f21142b;
                        if (!str2.startsWith("baffin")) {
                        }
                        z10 = true;
                        this.f3646k0 = z10;
                        this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                        str = mVar.f3581a;
                        this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
                        this.f3632W.getClass();
                        if ("c2.android.mp3.decoder".equals(str)) {
                        }
                        if (this.f20358u == 2) {
                        }
                        this.f3620N0.f23448a++;
                        V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
                    }
                    z10 = false;
                    this.f3646k0 = z10;
                    this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                    str = mVar.f3581a;
                    this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
                    this.f3632W.getClass();
                    if ("c2.android.mp3.decoder".equals(str)) {
                    }
                    if (this.f20358u == 2) {
                    }
                    this.f3620N0.f23448a++;
                    V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
                }
            }
            if (i23 < 24 && ("OMX.Nvidia.h264.decode".equals(str4) || "OMX.Nvidia.h264.decode.secure".equals(str4))) {
                String str12 = D.f21142b;
                if ("flounder".equals(str12) || "flounder_lte".equals(str12) || "grouper".equals(str12) || "tilapia".equals(str12)) {
                    i7 = 1;
                    this.f3640e0 = i7;
                    this.f3641f0 = i23 >= 21 && this.f3633X.f20065B.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
                    this.f3642g0 = i23 >= 18 || (i23 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i23 == 19 && D.f21144d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
                    this.f3643h0 = i23 != 29 && "c2.android.aac.decoder".equals(str4);
                    if (i23 <= 23) {
                    }
                    if (i23 <= 19) {
                    }
                    z8 = false;
                    this.f3644i0 = z8;
                    this.f3645j0 = i23 != 21 && "OMX.google.aac.decoder".equals(str4);
                    if (i23 < 21) {
                    }
                    z10 = false;
                    this.f3646k0 = z10;
                    this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                    str = mVar.f3581a;
                    this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
                    this.f3632W.getClass();
                    if ("c2.android.mp3.decoder".equals(str)) {
                    }
                    if (this.f20358u == 2) {
                    }
                    this.f3620N0.f23448a++;
                    V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
                }
            }
            i7 = 0;
            this.f3640e0 = i7;
            this.f3641f0 = i23 >= 21 && this.f3633X.f20065B.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
            this.f3642g0 = i23 >= 18 || (i23 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i23 == 19 && D.f21144d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
            this.f3643h0 = i23 != 29 && "c2.android.aac.decoder".equals(str4);
            if (i23 <= 23) {
            }
            if (i23 <= 19) {
            }
            z8 = false;
            this.f3644i0 = z8;
            this.f3645j0 = i23 != 21 && "OMX.google.aac.decoder".equals(str4);
            if (i23 < 21) {
            }
            z10 = false;
            this.f3646k0 = z10;
            this.f3647l0 = i23 > 18 && this.f3633X.f20075M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
            str = mVar.f3581a;
            this.f3650o0 = (i23 > 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i23 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i23 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(D.f21143c) && "AFTS".equals(D.f21144d) && mVar.f3586f) || M()));
            this.f3632W.getClass();
            if ("c2.android.mp3.decoder".equals(str)) {
            }
            if (this.f20358u == 2) {
            }
            this.f3620N0.f23448a++;
            V(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str4);
        } catch (Throwable th) {
            AbstractC1705a.v();
            throw th;
        }
    }

    public final void S() {
        L l10;
        if (this.f3632W != null || this.f3658w0 || (l10 = this.f3619N) == null) {
            return;
        }
        if (this.f3625Q == null && o0(l10)) {
            L l11 = this.f3619N;
            F();
            String str = l11.f20096z;
            boolean equals = "audio/mp4a-latm".equals(str);
            f fVar = this.f3610I;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                fVar.getClass();
                fVar.f3571y = 32;
            } else {
                fVar.getClass();
                fVar.f3571y = 1;
            }
            this.f3658w0 = true;
            return;
        }
        l0(this.f3625Q);
        String str2 = this.f3619N.f20096z;
        InterfaceC1938j interfaceC1938j = this.f3623P;
        if (interfaceC1938j != null) {
            InterfaceC1888a f4 = interfaceC1938j.f();
            if (this.f3627R == null) {
                if (f4 == null) {
                    if (this.f3623P.getError() == null) {
                        return;
                    }
                } else if (f4 instanceof z) {
                    z zVar = (z) f4;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(zVar.f23782a, zVar.f23783b);
                        this.f3627R = mediaCrypto;
                        this.f3628S = !zVar.f23784c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e2) {
                        throw f(e2, this.f3619N, false, 6006);
                    }
                }
            }
            if (z.f23781d && (f4 instanceof z)) {
                int state = this.f3623P.getState();
                if (state == 1) {
                    C1937i error = this.f3623P.getError();
                    error.getClass();
                    throw f(error, this.f3619N, false, error.f23765a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            T(this.f3627R, this.f3628S);
        } catch (o e10) {
            throw f(e10, this.f3619N, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(MediaCrypto mediaCrypto, boolean z8) {
        String str;
        o oVar;
        if (this.f3637b0 == null) {
            try {
                List L = L(z8);
                this.f3637b0 = new ArrayDeque();
                if (!L.isEmpty()) {
                    this.f3637b0.add((m) L.get(0));
                }
                this.f3638c0 = null;
            } catch (u e2) {
                throw new o(this.f3619N, e2, z8, -49998);
            }
        }
        if (this.f3637b0.isEmpty()) {
            throw new o(this.f3619N, null, z8, -49999);
        }
        m mVar = (m) this.f3637b0.peekFirst();
        while (this.f3632W == null) {
            m mVar2 = (m) this.f3637b0.peekFirst();
            if (!n0(mVar2)) {
                return;
            }
            try {
                R(mVar2, mediaCrypto);
            } catch (Exception e10) {
                if (mVar2 != mVar) {
                    throw e10;
                    break;
                }
                try {
                    AbstractC1705a.S("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    R(mVar2, mediaCrypto);
                } catch (Exception e11) {
                    AbstractC1705a.R(e11, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                    this.f3637b0.removeFirst();
                    L l10 = this.f3619N;
                    String str2 = "Decoder init failed: " + mVar2.f3581a + ", " + l10;
                    String str3 = l10.f20096z;
                    if (D.f21141a < 21) {
                        str = e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null;
                    } else {
                        str = null;
                    }
                    o oVar2 = new o(str2, e11, str3, z8, mVar2, str);
                    U(oVar2);
                    oVar = this.f3638c0;
                    if (oVar != null) {
                        this.f3638c0 = oVar2;
                    } else {
                        this.f3638c0 = new o(oVar.getMessage(), oVar.getCause(), oVar.f3588a, oVar.f3589b, oVar.f3590c, oVar.f3591d);
                    }
                    if (!this.f3637b0.isEmpty()) {
                        throw this.f3638c0;
                    }
                }
                AbstractC1705a.R(e11, "MediaCodecRenderer", "Failed to initialize decoder: " + mVar2);
                this.f3637b0.removeFirst();
                L l102 = this.f3619N;
                String str22 = "Decoder init failed: " + mVar2.f3581a + ", " + l102;
                String str32 = l102.f20096z;
                if (D.f21141a < 21) {
                }
                o oVar22 = new o(str22, e11, str32, z8, mVar2, str);
                U(oVar22);
                oVar = this.f3638c0;
                if (oVar != null) {
                }
                if (!this.f3637b0.isEmpty()) {
                }
            }
        }
        this.f3637b0 = null;
    }

    public abstract void U(Exception exc);

    public abstract void V(long j, long j10, String str);

    public abstract void W(String str);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012e, code lost:
    
        if (G() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r14 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e9, code lost:
    
        if (G() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010e, code lost:
    
        if (r5.f20069F == r6.f20069F) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011c, code lost:
    
        if (G() == false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q4.i X(ha.g gVar) {
        int i7;
        InterfaceC1888a f4;
        InterfaceC1888a f10;
        boolean z8 = true;
        this.f3615K0 = true;
        L l10 = (L) gVar.f17916c;
        l10.getClass();
        String str = l10.f20096z;
        if (str == null) {
            throw f(new IllegalArgumentException(), l10, false, 4005);
        }
        InterfaceC1938j interfaceC1938j = (InterfaceC1938j) gVar.f17915b;
        InterfaceC1938j interfaceC1938j2 = this.f3625Q;
        if (interfaceC1938j2 != interfaceC1938j) {
            if (interfaceC1938j != null) {
                interfaceC1938j.d(null);
            }
            if (interfaceC1938j2 != null) {
                interfaceC1938j2.a(null);
            }
        }
        this.f3625Q = interfaceC1938j;
        this.f3619N = l10;
        if (this.f3658w0) {
            this.f3660y0 = true;
            return null;
        }
        j jVar = this.f3632W;
        if (jVar == null) {
            this.f3637b0 = null;
            S();
            return null;
        }
        m mVar = this.f3639d0;
        L l11 = this.f3633X;
        InterfaceC1938j interfaceC1938j3 = this.f3623P;
        if (interfaceC1938j3 != interfaceC1938j) {
            if (interfaceC1938j != null && interfaceC1938j3 != null && (f4 = interfaceC1938j.f()) != null && (f10 = interfaceC1938j3.f()) != null && f4.getClass().equals(f10.getClass())) {
                if (f4 instanceof z) {
                    z zVar = (z) f4;
                    if (interfaceC1938j.c().equals(interfaceC1938j3.c()) && D.f21141a >= 23) {
                        UUID uuid = AbstractC1571h.f20386e;
                        if (!uuid.equals(interfaceC1938j3.c()) && !uuid.equals(interfaceC1938j.c())) {
                            boolean e2 = zVar.f23784c ? false : interfaceC1938j.e(str);
                            if (!mVar.f3586f) {
                            }
                        }
                    }
                }
            }
            if (this.f3601D0) {
                this.f3598B0 = 1;
                this.C0 = 3;
            } else {
                h0();
                S();
            }
            return new q4.i(mVar.f3581a, l11, l10, 0, 128);
        }
        boolean z10 = this.f3625Q != this.f3623P;
        AbstractC1705a.m(!z10 || D.f21141a >= 23);
        q4.i D10 = D(mVar, l11, l10);
        int i10 = D10.f23467d;
        if (i10 != 0) {
            i7 = 2;
            if (i10 == 1) {
                if (q0(l10)) {
                    this.f3633X = l10;
                    if (!z10) {
                        if (this.f3601D0) {
                            this.f3598B0 = 1;
                            if (this.f3642g0 || this.f3644i0) {
                                this.C0 = 3;
                            } else {
                                this.C0 = 1;
                            }
                        }
                    }
                }
                i7 = 16;
            } else if (i10 == 2) {
                if (q0(l10)) {
                    this.f3661z0 = true;
                    this.f3597A0 = 1;
                    int i11 = this.f3640e0;
                    if (i11 != 2) {
                        if (i11 == 1) {
                            if (l10.f20068E == l11.f20068E) {
                            }
                        }
                        z8 = false;
                    }
                    this.f3648m0 = z8;
                    this.f3633X = l10;
                    if (z10) {
                    }
                }
                i7 = 16;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                if (q0(l10)) {
                    this.f3633X = l10;
                    if (z10) {
                    }
                }
                i7 = 16;
            }
            return (i10 != 0 || (this.f3632W == jVar && this.C0 != 3)) ? D10 : new q4.i(mVar.f3581a, l11, l10, 0, i7);
        }
        if (this.f3601D0) {
            this.f3598B0 = 1;
            this.C0 = 3;
        } else {
            h0();
            S();
        }
        i7 = 0;
        if (i10 != 0) {
        }
    }

    public abstract void Y(L l10, MediaFormat mediaFormat);

    public void Z() {
    }

    public void a0(long j) {
        this.f3624P0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.L;
            if (arrayDeque.isEmpty() || j < ((p) arrayDeque.peek()).f3593a) {
                return;
            }
            m0((p) arrayDeque.poll());
            b0();
        }
    }

    public abstract void b0();

    public abstract void c0(q4.g gVar);

    public void d0(L l10) {
    }

    public final void e0() {
        int i7 = this.C0;
        if (i7 == 1) {
            J();
            return;
        }
        if (i7 == 2) {
            J();
            r0();
        } else if (i7 != 3) {
            this.f3613J0 = true;
            i0();
        } else {
            h0();
            S();
        }
    }

    public abstract boolean f0(long j, long j10, j jVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z8, boolean z10, L l10);

    public final boolean g0(int i7) {
        ha.g gVar = this.f20354c;
        gVar.clear();
        q4.g gVar2 = this.f3604F;
        gVar2.G();
        int v10 = v(gVar, gVar2, i7 | 4);
        if (v10 == -5) {
            X(gVar);
            return true;
        }
        if (v10 != -4 || !gVar2.i(4)) {
            return false;
        }
        this.f3611I0 = true;
        e0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        try {
            j jVar = this.f3632W;
            if (jVar != null) {
                jVar.release();
                this.f3620N0.f23449b++;
                W(this.f3639d0.f3581a);
            }
            this.f3632W = null;
            try {
                MediaCrypto mediaCrypto = this.f3627R;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f3632W = null;
            try {
                MediaCrypto mediaCrypto2 = this.f3627R;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void i0() {
    }

    public void j0() {
        this.f3653r0 = -1;
        this.f3606G.f23458d = null;
        this.f3654s0 = -1;
        this.f3655t0 = null;
        this.f3652q0 = -9223372036854775807L;
        this.f3603E0 = false;
        this.f3601D0 = false;
        this.f3648m0 = false;
        this.f3649n0 = false;
        this.f3656u0 = false;
        this.f3657v0 = false;
        this.f3612J.clear();
        this.f3607G0 = -9223372036854775807L;
        this.f3609H0 = -9223372036854775807L;
        this.f3624P0 = -9223372036854775807L;
        g gVar = this.f3651p0;
        if (gVar != null) {
            gVar.f3572a = 0L;
            gVar.f3573b = 0L;
            gVar.f3574c = false;
        }
        this.f3598B0 = 0;
        this.C0 = 0;
        this.f3597A0 = this.f3661z0 ? 1 : 0;
    }

    public final void k0() {
        j0();
        this.f3618M0 = null;
        this.f3651p0 = null;
        this.f3637b0 = null;
        this.f3639d0 = null;
        this.f3633X = null;
        this.f3634Y = null;
        this.f3635Z = false;
        this.f3605F0 = false;
        this.f3636a0 = -1.0f;
        this.f3640e0 = 0;
        this.f3641f0 = false;
        this.f3642g0 = false;
        this.f3643h0 = false;
        this.f3644i0 = false;
        this.f3645j0 = false;
        this.f3646k0 = false;
        this.f3647l0 = false;
        this.f3650o0 = false;
        this.f3661z0 = false;
        this.f3597A0 = 0;
        this.f3628S = false;
    }

    public final void l0(InterfaceC1938j interfaceC1938j) {
        InterfaceC1938j interfaceC1938j2 = this.f3623P;
        if (interfaceC1938j2 != interfaceC1938j) {
            if (interfaceC1938j != null) {
                interfaceC1938j.d(null);
            }
            if (interfaceC1938j2 != null) {
                interfaceC1938j2.a(null);
            }
        }
        this.f3623P = interfaceC1938j;
    }

    @Override // m4.AbstractC1565e
    public boolean m() {
        boolean b2;
        if (this.f3619N == null) {
            return false;
        }
        if (k()) {
            b2 = this.f20363z;
        } else {
            d0 d0Var = this.f20359v;
            d0Var.getClass();
            b2 = d0Var.b();
        }
        if (!b2) {
            if (!(this.f3654s0 >= 0) && (this.f3652q0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f3652q0)) {
                return false;
            }
        }
        return true;
    }

    public final void m0(p pVar) {
        this.f3622O0 = pVar;
        if (pVar.f3594b != -9223372036854775807L) {
            this.f3626Q0 = true;
            Z();
        }
    }

    @Override // m4.AbstractC1565e
    public void n() {
        this.f3619N = null;
        m0(p.f3592d);
        this.L.clear();
        K();
    }

    public boolean n0(m mVar) {
        return true;
    }

    public boolean o0(L l10) {
        return false;
    }

    @Override // m4.AbstractC1565e
    public void p(long j, boolean z8) {
        int i7;
        this.f3611I0 = false;
        this.f3613J0 = false;
        this.f3616L0 = false;
        if (this.f3658w0) {
            this.f3610I.G();
            this.f3608H.G();
            this.f3659x0 = false;
            M m10 = this.f3617M;
            m10.getClass();
            m10.f21768c = InterfaceC1802p.f21871a;
            m10.f21767b = 0;
            m10.f21766a = 2;
        } else if (K()) {
            S();
        }
        C6.l lVar = this.f3622O0.f3595c;
        synchronized (lVar) {
            i7 = lVar.f2947b;
        }
        if (i7 > 0) {
            this.f3615K0 = true;
        }
        this.f3622O0.f3595c.b();
        this.L.clear();
    }

    public abstract int p0(r rVar, L l10);

    public final boolean q0(L l10) {
        if (D.f21141a >= 23 && this.f3632W != null && this.C0 != 3 && this.f20358u != 0) {
            float f4 = this.f3631V;
            L[] lArr = this.f20360w;
            lArr.getClass();
            float N10 = N(f4, lArr);
            float f10 = this.f3636a0;
            if (f10 == N10) {
                return true;
            }
            if (N10 == -1.0f) {
                if (this.f3601D0) {
                    this.f3598B0 = 1;
                    this.C0 = 3;
                    return false;
                }
                h0();
                S();
                return false;
            }
            if (f10 == -1.0f && N10 <= this.f3602E) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", N10);
            this.f3632W.t(bundle);
            this.f3636a0 = N10;
        }
        return true;
    }

    public final void r0() {
        InterfaceC1888a f4 = this.f3625Q.f();
        if (f4 instanceof z) {
            try {
                this.f3627R.setMediaDrmSession(((z) f4).f23783b);
            } catch (MediaCryptoException e2) {
                throw f(e2, this.f3619N, false, 6006);
            }
        }
        l0(this.f3625Q);
        this.f3598B0 = 0;
        this.C0 = 0;
    }

    public final void s0(long j) {
        Object d10;
        Object e2;
        C6.l lVar = this.f3622O0.f3595c;
        synchronized (lVar) {
            d10 = lVar.d(j, true);
        }
        L l10 = (L) d10;
        if (l10 == null && this.f3626Q0 && this.f3634Y != null) {
            C6.l lVar2 = this.f3622O0.f3595c;
            synchronized (lVar2) {
                e2 = lVar2.f2947b == 0 ? null : lVar2.e();
            }
            l10 = (L) e2;
        }
        if (l10 != null) {
            this.f3621O = l10;
        } else if (!this.f3635Z || this.f3621O == null) {
            return;
        }
        Y(this.f3621O, this.f3634Y);
        this.f3635Z = false;
        this.f3626Q0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // m4.AbstractC1565e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(L[] lArr, long j, long j10) {
        if (this.f3622O0.f3594b == -9223372036854775807L) {
            m0(new p(-9223372036854775807L, j10));
            return;
        }
        ArrayDeque arrayDeque = this.L;
        if (arrayDeque.isEmpty()) {
            long j11 = this.f3607G0;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f3624P0;
                if (j12 != -9223372036854775807L) {
                }
            }
            m0(new p(-9223372036854775807L, j10));
            if (this.f3622O0.f3594b != -9223372036854775807L) {
                b0();
                return;
            }
            return;
        }
        arrayDeque.add(new p(this.f3607G0, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[LOOP:1: B:33:0x004b->B:42:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EDGE_INSN: B:43:0x006c->B:44:0x006c BREAK  A[LOOP:1: B:33:0x004b->B:42:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[LOOP:2: B:45:0x006c->B:54:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EDGE_INSN: B:55:0x0088->B:56:0x0088 BREAK  A[LOOP:2: B:45:0x006c->B:54:0x0087], SYNTHETIC] */
    @Override // m4.AbstractC1565e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(long j, long j10) {
        boolean z8;
        boolean z10;
        boolean z11 = false;
        if (this.f3616L0) {
            this.f3616L0 = false;
            e0();
        }
        C1581m c1581m = this.f3618M0;
        if (c1581m != null) {
            this.f3618M0 = null;
            throw c1581m;
        }
        try {
            if (this.f3613J0) {
                i0();
                return;
            }
            if (this.f3619N != null || g0(2)) {
                S();
                if (this.f3658w0) {
                    AbstractC1705a.c("bypassRender");
                    do {
                    } while (C(j, j10));
                    AbstractC1705a.v();
                } else if (this.f3632W != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC1705a.c("drainAndFeed");
                    while (H(j, j10)) {
                        long j11 = this.f3629T;
                        if (j11 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j11) {
                            z10 = false;
                            if (z10) {
                                break;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    while (I()) {
                        long j12 = this.f3629T;
                        if (j12 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                            z8 = false;
                            if (z8) {
                                break;
                            }
                        }
                        z8 = true;
                        if (z8) {
                        }
                    }
                    AbstractC1705a.v();
                } else {
                    q4.d dVar = this.f3620N0;
                    int i7 = dVar.f23451d;
                    d0 d0Var = this.f20359v;
                    d0Var.getClass();
                    dVar.f23451d = i7 + d0Var.h(j - this.f20361x);
                    g0(1);
                }
                synchronized (this.f3620N0) {
                }
            }
        } catch (IllegalStateException e2) {
            int i10 = D.f21141a;
            if (i10 < 21 || !(e2 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            U(e2);
            if (i10 >= 21) {
                if (e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).isRecoverable() : false) {
                    z11 = true;
                }
            }
            if (z11) {
                h0();
            }
            throw f(E(e2, this.f3639d0), this.f3619N, z11, 4003);
        }
    }

    @Override // m4.AbstractC1565e
    public void z(float f4, float f10) {
        this.f3630U = f4;
        this.f3631V = f10;
        q0(this.f3633X);
    }
}
