package o4;

import N6.t0;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import ea.C1108c;
import i1.C1290a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l2.X;
import m4.AbstractC1565e;
import m4.C1550D;
import m4.D0;
import m4.SurfaceHolderCallbackC1596z;
import m4.s0;
import n5.AbstractC1705a;
import r4.InterfaceC1938j;

/* loaded from: classes.dex */
public final class L extends E4.q implements n5.n {

    /* renamed from: S0, reason: collision with root package name */
    public final Context f21752S0;

    /* renamed from: T0, reason: collision with root package name */
    public final C1108c f21753T0;

    /* renamed from: U0, reason: collision with root package name */
    public final I f21754U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f21755V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f21756W0;

    /* renamed from: X0, reason: collision with root package name */
    public m4.L f21757X0;

    /* renamed from: Y0, reason: collision with root package name */
    public m4.L f21758Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public long f21759Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f21760a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f21761b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f21762c1;

    /* renamed from: d1, reason: collision with root package name */
    public C1550D f21763d1;

    public L(Context context, E4.i iVar, Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z, I i7) {
        super(1, iVar, 44100.0f);
        this.f21752S0 = context.getApplicationContext();
        this.f21754U0 = i7;
        this.f21753T0 = new C1108c(8, handler, surfaceHolderCallbackC1596z);
        i7.f21742r = new C1290a(this, 12);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [N6.B, N6.E] */
    public static t0 u0(E4.r rVar, m4.L l10, boolean z8, I i7) {
        List e2;
        if (l10.f20096z == null) {
            N6.F f4 = N6.H.f7232b;
            return t0.f7341e;
        }
        if (i7.g(l10) != 0) {
            List e10 = E4.x.e("audio/raw", false, false);
            E4.m mVar = e10.isEmpty() ? null : (E4.m) e10.get(0);
            if (mVar != null) {
                return N6.H.K(mVar);
            }
        }
        Pattern pattern = E4.x.f3667a;
        rVar.getClass();
        List e11 = E4.x.e(l10.f20096z, z8, false);
        String b2 = E4.x.b(l10);
        if (b2 == null) {
            N6.F f10 = N6.H.f7232b;
            e2 = t0.f7341e;
        } else {
            e2 = E4.x.e(b2, z8, false);
        }
        N6.F f11 = N6.H.f7232b;
        ?? b10 = new N6.B();
        b10.e(e11);
        b10.e(e2);
        return b10.h();
    }

    @Override // E4.q
    public final q4.i D(E4.m mVar, m4.L l10, m4.L l11) {
        q4.i b2 = mVar.b(l10, l11);
        boolean z8 = this.f3625Q == null && o0(l11);
        int i7 = b2.f23468e;
        if (z8) {
            i7 |= 32768;
        }
        if (t0(mVar, l11) > this.f21755V0) {
            i7 |= 64;
        }
        int i10 = i7;
        return new q4.i(mVar.f3581a, l10, l11, i10 == 0 ? b2.f23467d : 0, i10);
    }

    @Override // E4.q
    public final float N(float f4, m4.L[] lArr) {
        int i7 = -1;
        for (m4.L l10 : lArr) {
            int i10 = l10.f20076N;
            if (i10 != -1) {
                i7 = Math.max(i7, i10);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f4 * i7;
    }

    @Override // E4.q
    public final ArrayList O(E4.r rVar, m4.L l10, boolean z8) {
        t0 u02 = u0(rVar, l10, z8, this.f21754U0);
        Pattern pattern = E4.x.f3667a;
        ArrayList arrayList = new ArrayList(u02);
        Collections.sort(arrayList, new B0.M(new A1.d(l10, 15), 1));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    @Override // E4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E4.h P(E4.m mVar, m4.L l10, MediaCrypto mediaCrypto, float f4) {
        boolean z8;
        MediaFormat mediaFormat;
        m4.L[] lArr = this.f20360w;
        lArr.getClass();
        int t02 = t0(mVar, l10);
        if (lArr.length != 1) {
            for (m4.L l11 : lArr) {
                if (mVar.b(l10, l11).f23467d != 0) {
                    t02 = Math.max(t02, t0(mVar, l11));
                }
            }
        }
        this.f21755V0 = t02;
        int i7 = n5.D.f21141a;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(mVar.f3581a) && "samsung".equals(n5.D.f21143c)) {
            String str = n5.D.f21142b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z8 = true;
                this.f21756W0 = z8;
                int i10 = this.f21755V0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", mVar.f3583c);
                mediaFormat.setInteger("channel-count", l10.f20075M);
                int i11 = l10.f20076N;
                mediaFormat.setInteger("sample-rate", i11);
                AbstractC1705a.P(mediaFormat, l10.f20065B);
                AbstractC1705a.H(mediaFormat, "max-input-size", i10);
                if (i7 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f4 != -1.0f) {
                        if (i7 == 23) {
                            String str2 = n5.D.f21144d;
                            if (!"ZTE B2017G".equals(str2)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f4);
                    }
                }
                String str3 = l10.f20096z;
                if (i7 <= 28 && "audio/ac4".equals(str3)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i7 >= 24) {
                    m4.K k = new m4.K();
                    k.k = "audio/raw";
                    k.f19996x = l10.f20075M;
                    k.f19997y = i11;
                    k.f19998z = 4;
                    if (this.f21754U0.g(new m4.L(k)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i7 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.f21758Y0 = ("audio/raw".equals(mVar.f3582b) || "audio/raw".equals(str3)) ? null : l10;
                return new E4.h(mVar, mediaFormat, l10, null, mediaCrypto);
            }
        }
        z8 = false;
        this.f21756W0 = z8;
        int i102 = this.f21755V0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f3583c);
        mediaFormat.setInteger("channel-count", l10.f20075M);
        int i112 = l10.f20076N;
        mediaFormat.setInteger("sample-rate", i112);
        AbstractC1705a.P(mediaFormat, l10.f20065B);
        AbstractC1705a.H(mediaFormat, "max-input-size", i102);
        if (i7 >= 23) {
        }
        String str32 = l10.f20096z;
        if (i7 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24) {
        }
        if (i7 >= 32) {
        }
        this.f21758Y0 = ("audio/raw".equals(mVar.f3582b) || "audio/raw".equals(str32)) ? null : l10;
        return new E4.h(mVar, mediaFormat, l10, null, mediaCrypto);
    }

    @Override // E4.q
    public final void U(Exception exc) {
        AbstractC1705a.u("MediaCodecAudioRenderer", "Audio codec error", exc);
        C1108c c1108c = this.f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new RunnableC1803q(c1108c, exc, 2));
        }
    }

    @Override // E4.q
    public final void V(long j, long j10, String str) {
        C1108c c1108c = this.f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new RunnableC1803q(c1108c, str, j, j10));
        }
    }

    @Override // E4.q
    public final void W(String str) {
        C1108c c1108c = this.f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new RunnableC1803q(c1108c, str, 0));
        }
    }

    @Override // E4.q
    public final q4.i X(ha.g gVar) {
        m4.L l10 = (m4.L) gVar.f17916c;
        l10.getClass();
        this.f21757X0 = l10;
        q4.i X10 = super.X(gVar);
        m4.L l11 = this.f21757X0;
        C1108c c1108c = this.f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new Aa.j(c1108c, l11, X10, 26));
        }
        return X10;
    }

    @Override // E4.q
    public final void Y(m4.L l10, MediaFormat mediaFormat) {
        int i7;
        m4.L l11 = this.f21758Y0;
        int[] iArr = null;
        if (l11 != null) {
            l10 = l11;
        } else if (this.f3632W != null) {
            int y10 = "audio/raw".equals(l10.f20096z) ? l10.f20077O : (n5.D.f21141a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? n5.D.y(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            m4.K k = new m4.K();
            k.k = "audio/raw";
            k.f19998z = y10;
            k.f19970A = l10.f20078P;
            k.f19971B = l10.f20079Q;
            k.f19996x = mediaFormat.getInteger("channel-count");
            k.f19997y = mediaFormat.getInteger("sample-rate");
            m4.L l12 = new m4.L(k);
            if (this.f21756W0 && l12.f20075M == 6 && (i7 = l10.f20075M) < 6) {
                iArr = new int[i7];
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = i10;
                }
            }
            l10 = l12;
        }
        try {
            this.f21754U0.b(l10, iArr);
        } catch (r e2) {
            throw f(e2, e2.f21874a, false, 5001);
        }
    }

    @Override // E4.q
    public final void Z() {
        this.f21754U0.getClass();
    }

    @Override // n5.n
    public final s0 a() {
        return this.f21754U0.f21698B;
    }

    @Override // n5.n
    public final void b(s0 s0Var) {
        I i7 = this.f21754U0;
        i7.getClass();
        i7.f21698B = new s0(n5.D.h(s0Var.f20501a, 0.1f, 8.0f), n5.D.h(s0Var.f20502b, 0.1f, 8.0f));
        if (i7.s()) {
            i7.r();
            return;
        }
        F f4 = new F(s0Var, -9223372036854775807L, -9223372036854775807L);
        if (i7.m()) {
            i7.f21750z = f4;
        } else {
            i7.f21697A = f4;
        }
    }

    @Override // E4.q
    public final void b0() {
        this.f21754U0.f21707K = true;
    }

    @Override // m4.AbstractC1565e, m4.y0
    public final void c(int i7, Object obj) {
        I i10 = this.f21754U0;
        if (i7 == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (i10.f21709N != floatValue) {
                i10.f21709N = floatValue;
                if (i10.m()) {
                    if (n5.D.f21141a >= 21) {
                        i10.f21746v.setVolume(i10.f21709N);
                        return;
                    }
                    AudioTrack audioTrack = i10.f21746v;
                    float f4 = i10.f21709N;
                    audioTrack.setStereoVolume(f4, f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            C1791e c1791e = (C1791e) obj;
            if (i10.f21749y.equals(c1791e)) {
                return;
            }
            i10.f21749y = c1791e;
            if (i10.f21723a0) {
                return;
            }
            i10.d();
            return;
        }
        if (i7 == 6) {
            y yVar = (y) obj;
            if (i10.f21720Y.equals(yVar)) {
                return;
            }
            yVar.getClass();
            if (i10.f21746v != null) {
                i10.f21720Y.getClass();
            }
            i10.f21720Y = yVar;
            return;
        }
        switch (i7) {
            case 9:
                i10.f21699C = ((Boolean) obj).booleanValue();
                F f10 = new F(i10.s() ? s0.f20500d : i10.f21698B, -9223372036854775807L, -9223372036854775807L);
                if (i10.m()) {
                    i10.f21750z = f10;
                    return;
                } else {
                    i10.f21697A = f10;
                    return;
                }
            case 10:
                int intValue = ((Integer) obj).intValue();
                if (i10.f21719X != intValue) {
                    i10.f21719X = intValue;
                    i10.f21718W = intValue != 0;
                    i10.d();
                    return;
                }
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this.f21763d1 = (C1550D) obj;
                return;
            case 12:
                if (n5.D.f21141a >= 23) {
                    K.a(i10, obj);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // E4.q
    public final void c0(q4.g gVar) {
        if (!this.f21760a1 || gVar.i(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(gVar.f23460f - this.f21759Z0) > 500000) {
            this.f21759Z0 = gVar.f23460f;
        }
        this.f21760a1 = false;
    }

    @Override // n5.n
    public final long d() {
        if (this.f20358u == 2) {
            v0();
        }
        return this.f21759Z0;
    }

    @Override // E4.q
    public final boolean f0(long j, long j10, E4.j jVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z8, boolean z10, m4.L l10) {
        byteBuffer.getClass();
        if (this.f21758Y0 != null && (i10 & 2) != 0) {
            jVar.getClass();
            jVar.d(i7, false);
            return true;
        }
        I i12 = this.f21754U0;
        if (z8) {
            if (jVar != null) {
                jVar.d(i7, false);
            }
            this.f3620N0.f23453f += i11;
            i12.f21707K = true;
            return true;
        }
        try {
            if (!i12.j(byteBuffer, j11, i11)) {
                return false;
            }
            if (jVar != null) {
                jVar.d(i7, false);
            }
            this.f3620N0.f23452e += i11;
            return true;
        } catch (C1804s e2) {
            throw f(e2, this.f21757X0, e2.f21876b, 5001);
        } catch (C1805t e10) {
            throw f(e10, l10, e10.f21878b, 5002);
        }
    }

    @Override // m4.AbstractC1565e
    public final n5.n i() {
        return this;
    }

    @Override // E4.q
    public final void i0() {
        try {
            I i7 = this.f21754U0;
            if (!i7.f21715T && i7.m() && i7.c()) {
                i7.o();
                i7.f21715T = true;
            }
        } catch (C1805t e2) {
            throw f(e2, e2.f21879c, e2.f21878b, 5002);
        }
    }

    @Override // m4.AbstractC1565e
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // m4.AbstractC1565e
    public final boolean l() {
        if (this.f3613J0) {
            I i7 = this.f21754U0;
            if (!i7.m() || (i7.f21715T && !i7.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // E4.q, m4.AbstractC1565e
    public final boolean m() {
        return this.f21754U0.k() || super.m();
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void n() {
        C1108c c1108c = this.f21753T0;
        this.f21762c1 = true;
        this.f21757X0 = null;
        try {
            this.f21754U0.d();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.n();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, q4.d] */
    @Override // m4.AbstractC1565e
    public final void o(boolean z8, boolean z10) {
        ?? obj = new Object();
        this.f3620N0 = obj;
        C1108c c1108c = this.f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new RunnableC1803q(c1108c, obj, 4));
        }
        D0 d02 = this.f20355d;
        d02.getClass();
        boolean z11 = d02.f19882a;
        I i7 = this.f21754U0;
        if (z11) {
            i7.getClass();
            AbstractC1705a.m(n5.D.f21141a >= 21);
            AbstractC1705a.m(i7.f21718W);
            if (!i7.f21723a0) {
                i7.f21723a0 = true;
                i7.d();
            }
        } else if (i7.f21723a0) {
            i7.f21723a0 = false;
            i7.d();
        }
        n4.l lVar = this.f20357f;
        lVar.getClass();
        i7.f21741q = lVar;
    }

    @Override // E4.q
    public final boolean o0(m4.L l10) {
        return this.f21754U0.g(l10) != 0;
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void p(long j, boolean z8) {
        super.p(j, z8);
        this.f21754U0.d();
        this.f21759Z0 = j;
        this.f21760a1 = true;
        this.f21761b1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (E4.m) r4.get(0)) != null) goto L30;
     */
    @Override // E4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p0(E4.r rVar, m4.L l10) {
        boolean z8;
        if (!n5.o.j(l10.f20096z)) {
            return AbstractC1565e.e(0, 0, 0);
        }
        int i7 = n5.D.f21141a >= 21 ? 32 : 0;
        boolean z10 = true;
        int i10 = l10.f20083U;
        boolean z11 = i10 != 0;
        boolean z12 = i10 == 0 || i10 == 2;
        int i11 = 8;
        I i12 = this.f21754U0;
        if (z12 && i12.g(l10) != 0) {
            if (z11) {
                List e2 = E4.x.e("audio/raw", false, false);
            }
            return AbstractC1565e.e(4, 8, i7);
        }
        if ("audio/raw".equals(l10.f20096z) && i12.g(l10) == 0) {
            return AbstractC1565e.e(1, 0, 0);
        }
        m4.K k = new m4.K();
        k.k = "audio/raw";
        k.f19996x = l10.f20075M;
        k.f19997y = l10.f20076N;
        k.f19998z = 2;
        if (i12.g(new m4.L(k)) == 0) {
            return AbstractC1565e.e(1, 0, 0);
        }
        t0 u02 = u0(rVar, l10, false, i12);
        if (u02.isEmpty()) {
            return AbstractC1565e.e(1, 0, 0);
        }
        if (!z12) {
            return AbstractC1565e.e(2, 0, 0);
        }
        E4.m mVar = (E4.m) u02.get(0);
        boolean d10 = mVar.d(l10);
        if (!d10) {
            for (int i13 = 1; i13 < u02.f7343d; i13++) {
                E4.m mVar2 = (E4.m) u02.get(i13);
                if (mVar2.d(l10)) {
                    z8 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z8 = true;
        z10 = d10;
        int i14 = z10 ? 4 : 3;
        if (z10 && mVar.e(l10)) {
            i11 = 16;
        }
        return i14 | i11 | i7 | (mVar.g ? 64 : 0) | (z8 ? 128 : 0);
    }

    @Override // m4.AbstractC1565e
    public final void q() {
        C1796j c1796j;
        C1798l c1798l = this.f21754U0.f21748x;
        if (c1798l == null || !c1798l.f21855a) {
            return;
        }
        c1798l.f21861h = null;
        int i7 = n5.D.f21141a;
        Context context = (Context) c1798l.f21856b;
        if (i7 >= 23 && (c1796j = (C1796j) c1798l.f21859e) != null) {
            AbstractC1795i.b(context, c1796j);
        }
        F6.j jVar = (F6.j) c1798l.f21860f;
        if (jVar != null) {
            context.unregisterReceiver(jVar);
        }
        C1797k c1797k = (C1797k) c1798l.g;
        if (c1797k != null) {
            c1797k.f21852a.unregisterContentObserver(c1797k);
        }
        c1798l.f21855a = false;
    }

    @Override // m4.AbstractC1565e
    public final void r() {
        I i7 = this.f21754U0;
        try {
            try {
                F();
                h0();
                InterfaceC1938j interfaceC1938j = this.f3625Q;
                if (interfaceC1938j != null) {
                    interfaceC1938j.a(null);
                }
                this.f3625Q = null;
            } catch (Throwable th) {
                InterfaceC1938j interfaceC1938j2 = this.f3625Q;
                if (interfaceC1938j2 != null) {
                    interfaceC1938j2.a(null);
                }
                this.f3625Q = null;
                throw th;
            }
        } finally {
            if (this.f21762c1) {
                this.f21762c1 = false;
                i7.q();
            }
        }
    }

    @Override // m4.AbstractC1565e
    public final void s() {
        I i7 = this.f21754U0;
        i7.f21717V = true;
        if (i7.m()) {
            w wVar = i7.f21735i.f21903f;
            wVar.getClass();
            wVar.a();
            i7.f21746v.play();
        }
    }

    @Override // m4.AbstractC1565e
    public final void t() {
        v0();
        I i7 = this.f21754U0;
        i7.f21717V = false;
        if (i7.m()) {
            x xVar = i7.f21735i;
            xVar.d();
            if (xVar.f21919y == -9223372036854775807L) {
                w wVar = xVar.f21903f;
                wVar.getClass();
                wVar.a();
                i7.f21746v.pause();
            }
        }
    }

    public final int t0(E4.m mVar, m4.L l10) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(mVar.f3581a) || (i7 = n5.D.f21141a) >= 24 || (i7 == 23 && n5.D.L(this.f21752S0))) {
            return l10.f20064A;
        }
        return -1;
    }

    public final void v0() {
        long j;
        ArrayDeque arrayDeque;
        long w10;
        long j10;
        boolean l10 = l();
        I i7 = this.f21754U0;
        if (!i7.m() || i7.L) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(i7.f21735i.a(l10), n5.D.S(i7.f21744t.f21685e, i7.i()));
            while (true) {
                arrayDeque = i7.j;
                if (arrayDeque.isEmpty() || min < ((F) arrayDeque.getFirst()).f21691c) {
                    break;
                } else {
                    i7.f21697A = (F) arrayDeque.remove();
                }
            }
            F f4 = i7.f21697A;
            long j11 = min - f4.f21691c;
            boolean equals = f4.f21689a.equals(s0.f20500d);
            X x2 = i7.f21724b;
            if (equals) {
                w10 = i7.f21697A.f21690b + j11;
            } else if (arrayDeque.isEmpty()) {
                P p10 = (P) x2.f19196d;
                if (p10.f21808o >= 1024) {
                    long j12 = p10.f21807n;
                    p10.j.getClass();
                    long j13 = j12 - ((r2.k * r2.f21780b) * 2);
                    int i10 = p10.f21803h.f21867a;
                    int i11 = p10.g.f21867a;
                    j10 = i10 == i11 ? n5.D.T(j11, j13, p10.f21808o) : n5.D.T(j11, j13 * i10, p10.f21808o * i11);
                } else {
                    j10 = (long) (p10.f21799c * j11);
                }
                w10 = j10 + i7.f21697A.f21690b;
            } else {
                F f10 = (F) arrayDeque.getFirst();
                w10 = f10.f21690b - n5.D.w(f10.f21691c - min, i7.f21697A.f21689a.f20501a);
            }
            j = n5.D.S(i7.f21744t.f21685e, ((N) x2.f19195c).f21778t) + w10;
        }
        if (j != Long.MIN_VALUE) {
            if (!this.f21761b1) {
                j = Math.max(this.f21759Z0, j);
            }
            this.f21759Z0 = j;
            this.f21761b1 = false;
        }
    }
}
