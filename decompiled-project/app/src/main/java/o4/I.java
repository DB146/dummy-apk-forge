package o4;

import N6.t0;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import ea.C1108c;
import i1.C1290a;
import ia.C1358d;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l2.X;
import m4.C1550D;
import m4.s0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class I implements u {

    /* renamed from: g0, reason: collision with root package name */
    public static final Object f21694g0 = new Object();

    /* renamed from: h0, reason: collision with root package name */
    public static ExecutorService f21695h0;

    /* renamed from: i0, reason: collision with root package name */
    public static int f21696i0;

    /* renamed from: A, reason: collision with root package name */
    public F f21697A;

    /* renamed from: B, reason: collision with root package name */
    public s0 f21698B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21699C;

    /* renamed from: D, reason: collision with root package name */
    public ByteBuffer f21700D;

    /* renamed from: E, reason: collision with root package name */
    public int f21701E;

    /* renamed from: F, reason: collision with root package name */
    public long f21702F;

    /* renamed from: G, reason: collision with root package name */
    public long f21703G;

    /* renamed from: H, reason: collision with root package name */
    public long f21704H;

    /* renamed from: I, reason: collision with root package name */
    public long f21705I;

    /* renamed from: J, reason: collision with root package name */
    public int f21706J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21707K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public long f21708M;

    /* renamed from: N, reason: collision with root package name */
    public float f21709N;

    /* renamed from: O, reason: collision with root package name */
    public ByteBuffer f21710O;

    /* renamed from: P, reason: collision with root package name */
    public int f21711P;

    /* renamed from: Q, reason: collision with root package name */
    public ByteBuffer f21712Q;

    /* renamed from: R, reason: collision with root package name */
    public byte[] f21713R;

    /* renamed from: S, reason: collision with root package name */
    public int f21714S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f21715T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f21716U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f21717V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f21718W;

    /* renamed from: X, reason: collision with root package name */
    public int f21719X;

    /* renamed from: Y, reason: collision with root package name */
    public y f21720Y;

    /* renamed from: Z, reason: collision with root package name */
    public D f21721Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21722a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f21723a0;

    /* renamed from: b, reason: collision with root package name */
    public final X f21724b;

    /* renamed from: b0, reason: collision with root package name */
    public long f21725b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21726c;

    /* renamed from: c0, reason: collision with root package name */
    public long f21727c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1785A f21728d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f21729d0;

    /* renamed from: e, reason: collision with root package name */
    public final T f21730e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f21731e0;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f21732f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f21733f0;
    public final t0 g;

    /* renamed from: h, reason: collision with root package name */
    public final N7.a f21734h;

    /* renamed from: i, reason: collision with root package name */
    public final x f21735i;
    public final ArrayDeque j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21736l;

    /* renamed from: m, reason: collision with root package name */
    public X f21737m;

    /* renamed from: n, reason: collision with root package name */
    public final A4.f f21738n;

    /* renamed from: o, reason: collision with root package name */
    public final A4.f f21739o;

    /* renamed from: p, reason: collision with root package name */
    public final J f21740p;

    /* renamed from: q, reason: collision with root package name */
    public n4.l f21741q;

    /* renamed from: r, reason: collision with root package name */
    public C1290a f21742r;

    /* renamed from: s, reason: collision with root package name */
    public E f21743s;

    /* renamed from: t, reason: collision with root package name */
    public E f21744t;

    /* renamed from: u, reason: collision with root package name */
    public C1799m f21745u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f21746v;

    /* renamed from: w, reason: collision with root package name */
    public C1794h f21747w;

    /* renamed from: x, reason: collision with root package name */
    public C1798l f21748x;

    /* renamed from: y, reason: collision with root package name */
    public C1791e f21749y;

    /* renamed from: z, reason: collision with root package name */
    public F f21750z;

    /* JADX WARN: Type inference failed for: r10v11, types: [o4.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [N7.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [o4.z, java.lang.Object, o4.A] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o4.z, o4.T, java.lang.Object] */
    public I(r8.o oVar) {
        Context context = (Context) oVar.f23857b;
        this.f21722a = context;
        this.f21747w = context != null ? C1794h.b(context) : (C1794h) oVar.f23858c;
        this.f21724b = (X) oVar.f23859d;
        int i7 = n5.D.f21141a;
        this.f21726c = false;
        this.k = false;
        this.f21736l = 0;
        this.f21740p = (J) oVar.f23860e;
        ?? obj = new Object();
        this.f21734h = obj;
        obj.b();
        this.f21735i = new x(new C1358d(this, 8));
        ?? zVar = new z();
        this.f21728d = zVar;
        ?? zVar2 = new z();
        zVar2.f21813m = n5.D.f21146f;
        this.f21730e = zVar2;
        this.f21732f = N6.H.M(new z(), zVar, zVar2);
        this.g = N6.H.K(new z());
        this.f21709N = 1.0f;
        this.f21749y = C1791e.f21838u;
        this.f21719X = 0;
        this.f21720Y = new Object();
        s0 s0Var = s0.f20500d;
        this.f21697A = new F(s0Var, 0L, 0L);
        this.f21698B = s0Var;
        this.f21699C = false;
        this.j = new ArrayDeque();
        this.f21738n = new A4.f(5);
        this.f21739o = new A4.f(5);
    }

    public static AudioFormat f(int i7, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (n5.D.f21141a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0 != 4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        s0 s0Var;
        boolean z8;
        C1290a c1290a;
        boolean s3 = s();
        boolean z10 = this.f21726c;
        X x2 = this.f21724b;
        if (s3) {
            s0Var = s0.f20500d;
        } else {
            if (!this.f21723a0) {
                E e2 = this.f21744t;
                if (e2.f21683c == 0) {
                    int i7 = e2.f21681a.f20077O;
                    if (z10) {
                        int i10 = n5.D.f21141a;
                        if (i7 != 536870912) {
                            if (i7 != 805306368) {
                            }
                        }
                    }
                    s0Var = this.f21698B;
                    x2.getClass();
                    float f4 = s0Var.f20501a;
                    P p10 = (P) x2.f19196d;
                    if (p10.f21799c != f4) {
                        p10.f21799c = f4;
                        p10.f21804i = true;
                    }
                    float f10 = p10.f21800d;
                    float f11 = s0Var.f20502b;
                    if (f10 != f11) {
                        p10.f21800d = f11;
                        p10.f21804i = true;
                    }
                    this.f21698B = s0Var;
                }
            }
            s0Var = s0.f20500d;
            this.f21698B = s0Var;
        }
        s0 s0Var2 = s0Var;
        if (!this.f21723a0) {
            E e10 = this.f21744t;
            if (e10.f21683c == 0) {
                int i11 = e10.f21681a.f20077O;
                if (z10) {
                    int i12 = n5.D.f21141a;
                    if (i11 != 536870912) {
                        if (i11 != 805306368) {
                        }
                    }
                }
                z8 = this.f21699C;
                ((N) x2.f19195c).f21771m = z8;
                this.f21699C = z8;
                ArrayDeque arrayDeque = this.j;
                long max = Math.max(0L, j);
                E e11 = this.f21744t;
                arrayDeque.add(new F(s0Var2, max, n5.D.S(e11.f21685e, i())));
                C1799m c1799m = this.f21744t.f21688i;
                this.f21745u = c1799m;
                c1799m.b();
                c1290a = this.f21742r;
                if (c1290a == null) {
                    boolean z11 = this.f21699C;
                    C1108c c1108c = ((L) c1290a.f18187b).f21753T0;
                    Handler handler = (Handler) c1108c.f16831c;
                    if (handler != null) {
                        handler.post(new T8.a(2, c1108c, z11));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z8 = false;
        this.f21699C = z8;
        ArrayDeque arrayDeque2 = this.j;
        long max2 = Math.max(0L, j);
        E e112 = this.f21744t;
        arrayDeque2.add(new F(s0Var2, max2, n5.D.S(e112.f21685e, i())));
        C1799m c1799m2 = this.f21744t.f21688i;
        this.f21745u = c1799m2;
        c1799m2.b();
        c1290a = this.f21742r;
        if (c1290a == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [N6.B, N6.E] */
    public final void b(m4.L l10, int[] iArr) {
        C1799m c1799m;
        boolean z8;
        int i7;
        int intValue;
        int i10;
        int intValue2;
        int i11;
        C1799m c1799m2;
        boolean z10;
        int i12;
        int i13;
        int[] iArr2;
        boolean equals = "audio/raw".equals(l10.f20096z);
        boolean z11 = this.k;
        int i14 = l10.f20076N;
        int i15 = l10.f20075M;
        if (equals) {
            int i16 = l10.f20077O;
            AbstractC1705a.h(n5.D.J(i16));
            i7 = n5.D.z(i16, i15);
            ?? b2 = new N6.B();
            if (this.f21726c && (i16 == 536870912 || i16 == 805306368 || i16 == 4)) {
                b2.e(this.g);
            } else {
                b2.e(this.f21732f);
                b2.b((InterfaceC1802p[]) this.f21724b.f19194b);
            }
            c1799m = new C1799m(b2.h());
            if (c1799m.equals(this.f21745u)) {
                c1799m = this.f21745u;
            }
            int i17 = l10.f20078P;
            T t5 = this.f21730e;
            t5.f21811i = i17;
            t5.j = l10.f20079Q;
            if (n5.D.f21141a < 21 && i15 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i18 = 0; i18 < 6; i18++) {
                    iArr2[i18] = i18;
                }
            } else {
                iArr2 = iArr;
            }
            this.f21728d.f21679i = iArr2;
            try {
                C1800n a9 = c1799m.a(new C1800n(i14, i15, i16));
                int i19 = a9.f21868b;
                int p10 = n5.D.p(i19);
                int i20 = a9.f21869c;
                i11 = n5.D.z(i20, i19);
                z8 = z11;
                intValue = i20;
                i10 = 0;
                intValue2 = p10;
                i14 = a9.f21867a;
            } catch (C1801o e2) {
                throw new r(e2, l10);
            }
        } else {
            N6.F f4 = N6.H.f7232b;
            C1799m c1799m3 = new C1799m(t0.f7341e);
            if (t(l10, this.f21749y)) {
                String str = l10.f20096z;
                str.getClass();
                c1799m = c1799m3;
                intValue = n5.o.c(str, l10.f20093w);
                i7 = -1;
                intValue2 = n5.D.p(i15);
                i10 = 1;
                z8 = true;
            } else {
                Pair d10 = e().d(l10);
                if (d10 == null) {
                    throw new r("Unable to configure passthrough for: " + l10, l10);
                }
                c1799m = c1799m3;
                z8 = z11;
                i7 = -1;
                intValue = ((Integer) d10.first).intValue();
                i10 = 2;
                intValue2 = ((Integer) d10.second).intValue();
            }
            i11 = i7;
        }
        if (intValue == 0) {
            throw new r("Invalid output encoding (mode=" + i10 + ") for: " + l10, l10);
        }
        if (intValue2 == 0) {
            throw new r("Invalid output channel config (mode=" + i10 + ") for: " + l10, l10);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue2, intValue);
        AbstractC1705a.m(minBufferSize != -2);
        int i21 = i11 != -1 ? i11 : 1;
        double d11 = z8 ? 8.0d : 1.0d;
        this.f21740p.getClass();
        if (i10 != 0) {
            if (i10 == 1) {
                i13 = h3.H.f((50000000 * J.a(intValue)) / 1000000);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                i13 = h3.H.f(((intValue == 5 ? 500000 : 250000) * (l10.f20092v != -1 ? O5.b.n(r4, 8, RoundingMode.CEILING) : J.a(intValue))) / 1000000);
            }
            i12 = i14;
            c1799m2 = c1799m;
            z10 = z8;
        } else {
            c1799m2 = c1799m;
            z10 = z8;
            long j = i14;
            i12 = i14;
            long j10 = i21;
            i13 = n5.D.i(4 * minBufferSize, h3.H.f(((250000 * j) * j10) / 1000000), h3.H.f(((750000 * j) * j10) / 1000000));
        }
        int max = (((Math.max(minBufferSize, (int) (i13 * d11)) + i21) - 1) / i21) * i21;
        this.f21729d0 = false;
        E e10 = new E(l10, i7, i10, i11, i12, intValue2, intValue, max, c1799m2, z10);
        if (m()) {
            this.f21743s = e10;
        } else {
            this.f21744t = e10;
        }
    }

    public final boolean c() {
        if (!this.f21745u.e()) {
            ByteBuffer byteBuffer = this.f21712Q;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            return this.f21712Q == null;
        }
        C1799m c1799m = this.f21745u;
        if (c1799m.e() && !c1799m.f21865d) {
            c1799m.f21865d = true;
            ((InterfaceC1802p) c1799m.f21863b.get(0)).c();
        }
        p(Long.MIN_VALUE);
        if (!this.f21745u.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f21712Q;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void d() {
        if (m()) {
            this.f21702F = 0L;
            this.f21703G = 0L;
            this.f21704H = 0L;
            this.f21705I = 0L;
            this.f21731e0 = false;
            this.f21706J = 0;
            this.f21697A = new F(this.f21698B, 0L, 0L);
            this.f21708M = 0L;
            this.f21750z = null;
            this.j.clear();
            this.f21710O = null;
            this.f21711P = 0;
            this.f21712Q = null;
            this.f21716U = false;
            this.f21715T = false;
            this.f21700D = null;
            this.f21701E = 0;
            this.f21730e.f21815o = 0L;
            C1799m c1799m = this.f21744t.f21688i;
            this.f21745u = c1799m;
            c1799m.b();
            AudioTrack audioTrack = this.f21735i.f21900c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f21746v.pause();
            }
            if (n(this.f21746v)) {
                X x2 = this.f21737m;
                x2.getClass();
                this.f21746v.unregisterStreamEventCallback((H) x2.f19194b);
                ((Handler) x2.f19195c).removeCallbacksAndMessages(null);
            }
            if (n5.D.f21141a < 21 && !this.f21718W) {
                this.f21719X = 0;
            }
            E e2 = this.f21743s;
            if (e2 != null) {
                this.f21744t = e2;
                this.f21743s = null;
            }
            x xVar = this.f21735i;
            xVar.d();
            xVar.f21900c = null;
            xVar.f21903f = null;
            AudioTrack audioTrack2 = this.f21746v;
            N7.a aVar = this.f21734h;
            aVar.a();
            synchronized (f21694g0) {
                try {
                    if (f21695h0 == null) {
                        f21695h0 = Executors.newSingleThreadExecutor(new n5.B("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f21696i0++;
                    f21695h0.execute(new Aa.j(27, audioTrack2, aVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21746v = null;
        }
        this.f21739o.f383c = null;
        this.f21738n.f383c = null;
    }

    public final C1794h e() {
        Context context;
        C1794h c10;
        C1796j c1796j;
        if (this.f21748x == null && (context = this.f21722a) != null) {
            this.f21733f0 = Looper.myLooper();
            C1798l c1798l = new C1798l(context, new Q9.a(this, 27));
            this.f21748x = c1798l;
            if (c1798l.f21855a) {
                c10 = (C1794h) c1798l.f21861h;
                c10.getClass();
            } else {
                c1798l.f21855a = true;
                C1797k c1797k = (C1797k) c1798l.g;
                if (c1797k != null) {
                    c1797k.f21852a.registerContentObserver(c1797k.f21853b, false, c1797k);
                }
                int i7 = n5.D.f21141a;
                Handler handler = (Handler) c1798l.f21858d;
                Context context2 = (Context) c1798l.f21856b;
                if (i7 >= 23 && (c1796j = (C1796j) c1798l.f21859e) != null) {
                    AbstractC1795i.a(context2, c1796j, handler);
                }
                F6.j jVar = (F6.j) c1798l.f21860f;
                c10 = C1794h.c(context2, jVar != null ? context2.registerReceiver(jVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                c1798l.f21861h = c10;
            }
            this.f21747w = c10;
        }
        return this.f21747w;
    }

    public final int g(m4.L l10) {
        if (!"audio/raw".equals(l10.f20096z)) {
            return ((this.f21729d0 || !t(l10, this.f21749y)) && e().d(l10) == null) ? 0 : 2;
        }
        int i7 = l10.f20077O;
        if (n5.D.J(i7)) {
            return (i7 == 2 || (this.f21726c && i7 == 4)) ? 2 : 1;
        }
        h3.o.u(i7, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final long h() {
        return this.f21744t.f21683c == 0 ? this.f21702F / r0.f21682b : this.f21703G;
    }

    public final long i() {
        return this.f21744t.f21683c == 0 ? this.f21704H / r0.f21684d : this.f21705I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r10.b() == 0) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x0173. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0349 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(ByteBuffer byteBuffer, long j, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b2;
        int i15;
        int i16;
        int i17;
        ByteBuffer byteBuffer2 = this.f21710O;
        AbstractC1705a.h(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f21743s != null) {
            if (!c()) {
                return false;
            }
            E e2 = this.f21743s;
            E e10 = this.f21744t;
            e2.getClass();
            if (e10.f21683c == e2.f21683c && e10.g == e2.g && e10.f21685e == e2.f21685e && e10.f21686f == e2.f21686f && e10.f21684d == e2.f21684d && e10.j == e2.j) {
                this.f21744t = this.f21743s;
                this.f21743s = null;
                if (n(this.f21746v) && this.f21736l != 3) {
                    if (this.f21746v.getPlayState() == 3) {
                        this.f21746v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f21746v;
                    m4.L l10 = this.f21744t.f21681a;
                    audioTrack.setOffloadDelayPadding(l10.f20078P, l10.f20079Q);
                    this.f21731e0 = true;
                }
            } else {
                o();
                if (k()) {
                    return false;
                }
                d();
            }
            a(j);
        }
        boolean m10 = m();
        A4.f fVar = this.f21738n;
        if (!m10) {
            try {
                if (!l()) {
                    return false;
                }
            } catch (C1804s e11) {
                if (e11.f21876b) {
                    throw e11;
                }
                fVar.P(e11);
                return false;
            }
        }
        fVar.f383c = null;
        boolean z8 = this.L;
        x xVar = this.f21735i;
        if (z8) {
            this.f21708M = Math.max(0L, j);
            this.f21707K = false;
            this.L = false;
            if (s()) {
                r();
            }
            a(j);
            if (this.f21717V) {
                this.f21717V = true;
                if (m()) {
                    w wVar = xVar.f21903f;
                    wVar.getClass();
                    wVar.a();
                    this.f21746v.play();
                }
            }
        }
        long i18 = i();
        AudioTrack audioTrack2 = xVar.f21900c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (xVar.f21904h) {
            if (playState == 2) {
                xVar.f21910p = false;
            } else if (playState == 1) {
            }
            return false;
        }
        boolean z10 = xVar.f21910p;
        boolean c10 = xVar.c(i18);
        xVar.f21910p = c10;
        if (z10 && !c10 && playState != 1) {
            int i19 = xVar.f21902e;
            long Z7 = n5.D.Z(xVar.f21905i);
            I i20 = (I) xVar.f21898a.f18487b;
            if (i20.f21742r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - i20.f21727c0;
                C1108c c1108c = ((L) i20.f21742r.f18187b).f21753T0;
                Handler handler = (Handler) c1108c.f16831c;
                if (handler != null) {
                    handler.post(new RunnableC1803q(c1108c, i19, Z7, elapsedRealtime));
                }
            }
        }
        if (this.f21710O == null) {
            AbstractC1705a.h(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            E e12 = this.f21744t;
            if (e12.f21683c != 0 && this.f21706J == 0) {
                int i21 = e12.g;
                switch (i21) {
                    case 5:
                    case 6:
                    case 18:
                        i10 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10 ? AbstractC1787a.f21818c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256 : 1536;
                        i13 = i10;
                        this.f21706J = i13;
                        if (i13 == 0) {
                            return true;
                        }
                        break;
                    case 7:
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                i13 = 4096;
                            } else {
                                int position = byteBuffer.position();
                                byte b10 = byteBuffer.get(position);
                                if (b10 != -2) {
                                    if (b10 == -1) {
                                        i14 = (byteBuffer.get(position + 4) & 7) << 4;
                                        b2 = byteBuffer.get(position + 7);
                                    } else if (b10 != 31) {
                                        i14 = (byteBuffer.get(position + 4) & 1) << 6;
                                        i15 = byteBuffer.get(position + 5) & 252;
                                        i12 = (i15 >> 2) | i14;
                                        i11 = 1;
                                    } else {
                                        i14 = (byteBuffer.get(position + 5) & 7) << 4;
                                        b2 = byteBuffer.get(position + 6);
                                    }
                                    i15 = b2 & 60;
                                    i12 = (i15 >> 2) | i14;
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                    i12 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                                }
                                i13 = (i12 + i11) * 32;
                            }
                            this.f21706J = i13;
                            if (i13 == 0) {
                            }
                        }
                        i13 = 1024;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case 9:
                        int i22 = byteBuffer.getInt(byteBuffer.position());
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            i22 = Integer.reverseBytes(i22);
                        }
                        i10 = AbstractC1787a.l(i22);
                        if (i10 == -1) {
                            throw new IllegalArgumentException();
                        }
                        i13 = i10;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        i13 = 1024;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    case 12:
                        i13 = 2048;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(h3.o.l(i21, "Unexpected audio encoding: "));
                    case 14:
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i23 = position2;
                        while (true) {
                            if (i23 <= limit) {
                                int i24 = byteBuffer.getInt(i23 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    i24 = Integer.reverseBytes(i24);
                                }
                                if ((i24 & (-2)) == -126718022) {
                                    i16 = i23 - position2;
                                } else {
                                    i23++;
                                }
                            } else {
                                i16 = -1;
                            }
                        }
                        if (i16 == -1) {
                            i13 = 0;
                            this.f21706J = i13;
                            if (i13 == 0) {
                            }
                        } else {
                            i10 = (40 << ((byteBuffer.get((byteBuffer.position() + i16) + ((byteBuffer.get((byteBuffer.position() + i16) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            i13 = i10;
                            this.f21706J = i13;
                            if (i13 == 0) {
                            }
                        }
                        break;
                    case 15:
                        i13 = 512;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position3);
                        i13 = AbstractC1787a.j(new b5.f(bArr, 16)).f3539c;
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                    case 20:
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i17 = 0;
                        } else {
                            byte b11 = byteBuffer.get(26);
                            int i25 = 28;
                            int i26 = 28;
                            for (int i27 = 0; i27 < b11; i27++) {
                                i26 += byteBuffer.get(i27 + 27);
                            }
                            byte b12 = byteBuffer.get(i26 + 26);
                            for (int i28 = 0; i28 < b12; i28++) {
                                i25 += byteBuffer.get(i26 + 27 + i28);
                            }
                            i17 = i26 + i25;
                        }
                        int i29 = byteBuffer.get(i17 + 26) + 27 + i17;
                        i13 = (int) ((AbstractC1787a.g(byteBuffer.get(i29), byteBuffer.limit() - i29 > 1 ? byteBuffer.get(i29 + 1) : (byte) 0) * 48000) / 1000000);
                        this.f21706J = i13;
                        if (i13 == 0) {
                        }
                        break;
                }
            }
            if (this.f21750z != null) {
                if (!c()) {
                    return false;
                }
                a(j);
                this.f21750z = null;
            }
            long S7 = n5.D.S(this.f21744t.f21681a.f20076N, h() - this.f21730e.f21815o) + this.f21708M;
            if (!this.f21707K && Math.abs(S7 - j) > 200000) {
                C1290a c1290a = this.f21742r;
                if (c1290a != null) {
                    StringBuilder l11 = X.c.l(S7, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                    l11.append(j);
                    c1290a.n(new Exception(l11.toString()));
                }
                this.f21707K = true;
            }
            if (this.f21707K) {
                if (!c()) {
                    return false;
                }
                long j10 = j - S7;
                this.f21708M += j10;
                this.f21707K = false;
                a(j);
                C1290a c1290a2 = this.f21742r;
                if (c1290a2 != null && j10 != 0) {
                    ((L) c1290a2.f18187b).f21761b1 = true;
                }
            }
            if (this.f21744t.f21683c == 0) {
                this.f21702F += byteBuffer.remaining();
            } else {
                this.f21703G = (this.f21706J * i7) + this.f21703G;
            }
            this.f21710O = byteBuffer;
            this.f21711P = i7;
        }
        p(j);
        if (!this.f21710O.hasRemaining()) {
            this.f21710O = null;
            this.f21711P = 0;
            return true;
        }
        long i30 = i();
        if (xVar.f21920z == -9223372036854775807L || i30 <= 0 || SystemClock.elapsedRealtime() - xVar.f21920z < 200) {
            return false;
        }
        AbstractC1705a.S("DefaultAudioSink", "Resetting stalled audio track");
        d();
        return true;
    }

    public final boolean k() {
        return m() && this.f21735i.c(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        boolean z8;
        AudioTrack a9;
        n4.l lVar;
        N7.a aVar = this.f21734h;
        synchronized (aVar) {
            z8 = aVar.f7385a;
        }
        if (!z8) {
            return false;
        }
        try {
            E e2 = this.f21744t;
            e2.getClass();
            try {
                a9 = e2.a(this.f21723a0, this.f21749y, this.f21719X);
            } catch (C1804s e10) {
                C1290a c1290a = this.f21742r;
                if (c1290a != null) {
                    c1290a.n(e10);
                }
                throw e10;
            }
        } catch (C1804s e11) {
            E e12 = this.f21744t;
            if (e12.f21687h > 1000000) {
                E e13 = new E(e12.f21681a, e12.f21682b, e12.f21683c, e12.f21684d, e12.f21685e, e12.f21686f, e12.g, 1000000, e12.f21688i, e12.j);
                try {
                    try {
                        a9 = e13.a(this.f21723a0, this.f21749y, this.f21719X);
                        this.f21744t = e13;
                    } catch (C1804s e14) {
                        C1290a c1290a2 = this.f21742r;
                        if (c1290a2 != null) {
                            c1290a2.n(e14);
                        }
                        throw e14;
                    }
                } catch (C1804s e15) {
                    e11.addSuppressed(e15);
                    if (this.f21744t.f21683c == 1) {
                    }
                }
            }
            if (this.f21744t.f21683c == 1) {
                throw e11;
            }
            this.f21729d0 = true;
            throw e11;
        }
        this.f21746v = a9;
        if (n(a9)) {
            AudioTrack audioTrack = this.f21746v;
            if (this.f21737m == null) {
                this.f21737m = new X(this);
            }
            X x2 = this.f21737m;
            Handler handler = (Handler) x2.f19195c;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new G(handler), (H) x2.f19194b);
            if (this.f21736l != 3) {
                AudioTrack audioTrack2 = this.f21746v;
                m4.L l10 = this.f21744t.f21681a;
                audioTrack2.setOffloadDelayPadding(l10.f20078P, l10.f20079Q);
            }
        }
        int i7 = n5.D.f21141a;
        if (i7 >= 31 && (lVar = this.f21741q) != null) {
            C.a(this.f21746v, lVar);
        }
        this.f21719X = this.f21746v.getAudioSessionId();
        AudioTrack audioTrack3 = this.f21746v;
        E e16 = this.f21744t;
        boolean z10 = e16.f21683c == 2;
        int i10 = e16.g;
        int i11 = e16.f21684d;
        int i12 = e16.f21687h;
        x xVar = this.f21735i;
        xVar.f21900c = audioTrack3;
        xVar.f21901d = i11;
        xVar.f21902e = i12;
        xVar.f21903f = new w(audioTrack3);
        xVar.g = audioTrack3.getSampleRate();
        xVar.f21904h = z10 && i7 < 23 && (i10 == 5 || i10 == 6);
        boolean J10 = n5.D.J(i10);
        xVar.f21911q = J10;
        xVar.f21905i = J10 ? n5.D.S(xVar.g, i12 / i11) : -9223372036854775807L;
        xVar.f21914t = 0L;
        xVar.f21915u = 0L;
        xVar.f21916v = 0L;
        xVar.f21910p = false;
        xVar.f21919y = -9223372036854775807L;
        xVar.f21920z = -9223372036854775807L;
        xVar.f21912r = 0L;
        xVar.f21909o = 0L;
        xVar.j = 1.0f;
        if (m()) {
            if (i7 >= 21) {
                this.f21746v.setVolume(this.f21709N);
            } else {
                AudioTrack audioTrack4 = this.f21746v;
                float f4 = this.f21709N;
                audioTrack4.setStereoVolume(f4, f4);
            }
        }
        this.f21720Y.getClass();
        D d10 = this.f21721Z;
        if (d10 != null && i7 >= 23) {
            AbstractC1786B.a(this.f21746v, d10);
        }
        this.L = true;
        return true;
    }

    public final boolean m() {
        return this.f21746v != null;
    }

    public final void o() {
        if (this.f21716U) {
            return;
        }
        this.f21716U = true;
        long i7 = i();
        x xVar = this.f21735i;
        xVar.f21891A = xVar.b();
        xVar.f21919y = SystemClock.elapsedRealtime() * 1000;
        xVar.f21892B = i7;
        this.f21746v.stop();
        this.f21701E = 0;
    }

    public final void p(long j) {
        ByteBuffer byteBuffer;
        if (!this.f21745u.e()) {
            ByteBuffer byteBuffer2 = this.f21710O;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC1802p.f21871a;
            }
            u(byteBuffer2, j);
            return;
        }
        while (!this.f21745u.d()) {
            do {
                C1799m c1799m = this.f21745u;
                if (c1799m.e()) {
                    ByteBuffer byteBuffer3 = c1799m.f21864c[c1799m.c()];
                    if (!byteBuffer3.hasRemaining()) {
                        c1799m.f(InterfaceC1802p.f21871a);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = InterfaceC1802p.f21871a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f21710O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C1799m c1799m2 = this.f21745u;
                    ByteBuffer byteBuffer5 = this.f21710O;
                    if (c1799m2.e() && !c1799m2.f21865d) {
                        c1799m2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void q() {
        d();
        N6.F listIterator = this.f21732f.listIterator(0);
        while (listIterator.hasNext()) {
            ((InterfaceC1802p) listIterator.next()).reset();
        }
        N6.F listIterator2 = this.g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((InterfaceC1802p) listIterator2.next()).reset();
        }
        C1799m c1799m = this.f21745u;
        if (c1799m != null) {
            int i7 = 0;
            while (true) {
                t0 t0Var = c1799m.f21862a;
                if (i7 >= t0Var.size()) {
                    break;
                }
                InterfaceC1802p interfaceC1802p = (InterfaceC1802p) t0Var.get(i7);
                interfaceC1802p.flush();
                interfaceC1802p.reset();
                i7++;
            }
            c1799m.f21864c = new ByteBuffer[0];
            C1800n c1800n = C1800n.f21866e;
            c1799m.f21865d = false;
        }
        this.f21717V = false;
        this.f21729d0 = false;
    }

    public final void r() {
        if (m()) {
            try {
                this.f21746v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f21698B.f20501a).setPitch(this.f21698B.f20502b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                AbstractC1705a.R(e2, "DefaultAudioSink", "Failed to set playback params");
            }
            s0 s0Var = new s0(this.f21746v.getPlaybackParams().getSpeed(), this.f21746v.getPlaybackParams().getPitch());
            this.f21698B = s0Var;
            float f4 = s0Var.f20501a;
            x xVar = this.f21735i;
            xVar.j = f4;
            w wVar = xVar.f21903f;
            if (wVar != null) {
                wVar.a();
            }
            xVar.d();
        }
    }

    public final boolean s() {
        E e2 = this.f21744t;
        return e2 != null && e2.j && n5.D.f21141a >= 23;
    }

    public final boolean t(m4.L l10, C1791e c1791e) {
        int i7;
        int p10;
        boolean isOffloadedPlaybackSupported;
        int i10;
        int i11 = n5.D.f21141a;
        if (i11 < 29 || (i7 = this.f21736l) == 0) {
            return false;
        }
        String str = l10.f20096z;
        str.getClass();
        int c10 = n5.o.c(str, l10.f20093w);
        if (c10 == 0 || (p10 = n5.D.p(l10.f20075M)) == 0) {
            return false;
        }
        AudioFormat f4 = f(l10.f20076N, p10, c10);
        AudioAttributes audioAttributes = (AudioAttributes) c1791e.a().f8929b;
        if (i11 >= 31) {
            i10 = AudioManager.getPlaybackOffloadSupport(f4, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(f4, audioAttributes);
            i10 = !isOffloadedPlaybackSupported ? 0 : (i11 == 30 && n5.D.f21144d.startsWith("Pixel")) ? 2 : 1;
        }
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return ((l10.f20078P != 0 || l10.f20079Q != 0) && (i7 == 1)) ? false : true;
        }
        if (i10 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(ByteBuffer byteBuffer, long j) {
        int write;
        C1290a c1290a;
        C1550D c1550d;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f21712Q;
            if (byteBuffer2 != null) {
                AbstractC1705a.h(byteBuffer2 == byteBuffer);
            } else {
                this.f21712Q = byteBuffer;
                if (n5.D.f21141a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f21713R;
                    if (bArr == null || bArr.length < remaining) {
                        this.f21713R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f21713R, 0, remaining);
                    byteBuffer.position(position);
                    this.f21714S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i7 = n5.D.f21141a;
            if (i7 < 21) {
                long j10 = this.f21704H;
                x xVar = this.f21735i;
                int b2 = xVar.f21902e - ((int) (j10 - (xVar.b() * xVar.f21901d)));
                if (b2 > 0) {
                    write = this.f21746v.write(this.f21713R, this.f21714S, Math.min(remaining2, b2));
                    if (write > 0) {
                        this.f21714S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                }
                write = 0;
            } else if (this.f21723a0) {
                AbstractC1705a.m(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f21725b0;
                } else {
                    this.f21725b0 = j;
                }
                AudioTrack audioTrack = this.f21746v;
                if (i7 >= 26) {
                    write = audioTrack.write(byteBuffer, remaining2, 1, j * 1000);
                } else {
                    if (this.f21700D == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f21700D = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f21700D.putInt(1431633921);
                    }
                    if (this.f21701E == 0) {
                        this.f21700D.putInt(4, remaining2);
                        this.f21700D.putLong(8, j * 1000);
                        this.f21700D.position(0);
                        this.f21701E = remaining2;
                    }
                    int remaining3 = this.f21700D.remaining();
                    if (remaining3 > 0) {
                        int write2 = audioTrack.write(this.f21700D, remaining3, 1);
                        if (write2 < 0) {
                            this.f21701E = 0;
                            write = write2;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining2, 1);
                    if (write < 0) {
                        this.f21701E = 0;
                    } else {
                        this.f21701E -= write;
                    }
                }
            } else {
                write = this.f21746v.write(byteBuffer, remaining2, 1);
            }
            this.f21727c0 = SystemClock.elapsedRealtime();
            A4.f fVar = this.f21739o;
            if (write < 0) {
                C1805t c1805t = new C1805t(write, this.f21744t.f21681a, ((i7 >= 24 && write == -6) || write == -32) && this.f21705I > 0);
                C1290a c1290a2 = this.f21742r;
                if (c1290a2 != null) {
                    c1290a2.n(c1805t);
                }
                if (c1805t.f21878b) {
                    this.f21747w = C1794h.f21846c;
                    throw c1805t;
                }
                fVar.P(c1805t);
                return;
            }
            fVar.f383c = null;
            if (n(this.f21746v)) {
                if (this.f21705I > 0) {
                    this.f21731e0 = false;
                }
                if (this.f21717V && (c1290a = this.f21742r) != null && write < remaining2 && !this.f21731e0 && (c1550d = ((L) c1290a.f18187b).f21763d1) != null) {
                    c1550d.f19880a.f19935U = true;
                }
            }
            int i10 = this.f21744t.f21683c;
            if (i10 == 0) {
                this.f21704H += write;
            }
            if (write == remaining2) {
                if (i10 != 0) {
                    AbstractC1705a.m(byteBuffer == this.f21710O);
                    this.f21705I = (this.f21706J * this.f21711P) + this.f21705I;
                }
                this.f21712Q = null;
            }
        }
    }
}
