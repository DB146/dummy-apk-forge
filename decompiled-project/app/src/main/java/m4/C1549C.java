package m4;

import H2.C0288b;
import I2.C0330t;
import P4.C0465m;
import P4.C0477z;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import ha.C1265a;
import i1.C1290a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k5.C1429h;
import m5.C1608e;
import m5.C1621s;
import m5.InterfaceC1609f;
import n4.C1703a;
import n5.AbstractC1705a;
import o4.C1791e;

/* renamed from: m4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549C extends C9.h implements InterfaceC1587p {

    /* renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArraySet f19817A;

    /* renamed from: B, reason: collision with root package name */
    public final J0 f19818B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f19819C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f19820D;

    /* renamed from: E, reason: collision with root package name */
    public final n4.f f19821E;

    /* renamed from: F, reason: collision with root package name */
    public final Looper f19822F;

    /* renamed from: G, reason: collision with root package name */
    public final InterfaceC1609f f19823G;

    /* renamed from: H, reason: collision with root package name */
    public final long f19824H;

    /* renamed from: I, reason: collision with root package name */
    public final long f19825I;

    /* renamed from: J, reason: collision with root package name */
    public final n5.x f19826J;

    /* renamed from: K, reason: collision with root package name */
    public final SurfaceHolderCallbackC1596z f19827K;
    public final C1547A L;

    /* renamed from: M, reason: collision with root package name */
    public final P3.p f19828M;

    /* renamed from: N, reason: collision with root package name */
    public final C1563d f19829N;

    /* renamed from: O, reason: collision with root package name */
    public final O0 f19830O;

    /* renamed from: P, reason: collision with root package name */
    public final O0 f19831P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f19832Q;

    /* renamed from: R, reason: collision with root package name */
    public int f19833R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f19834S;

    /* renamed from: T, reason: collision with root package name */
    public int f19835T;

    /* renamed from: U, reason: collision with root package name */
    public int f19836U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19837V;

    /* renamed from: W, reason: collision with root package name */
    public int f19838W;

    /* renamed from: X, reason: collision with root package name */
    public E0 f19839X;

    /* renamed from: Y, reason: collision with root package name */
    public P4.g0 f19840Y;

    /* renamed from: Z, reason: collision with root package name */
    public t0 f19841Z;

    /* renamed from: a0, reason: collision with root package name */
    public C1562c0 f19842a0;

    /* renamed from: b, reason: collision with root package name */
    public final k5.y f19843b;

    /* renamed from: b0, reason: collision with root package name */
    public L f19844b0;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f19845c;

    /* renamed from: c0, reason: collision with root package name */
    public L f19846c0;

    /* renamed from: d, reason: collision with root package name */
    public final N7.a f19847d;

    /* renamed from: d0, reason: collision with root package name */
    public AudioTrack f19848d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19849e;

    /* renamed from: e0, reason: collision with root package name */
    public Object f19850e0;

    /* renamed from: f, reason: collision with root package name */
    public final C1549C f19851f;

    /* renamed from: f0, reason: collision with root package name */
    public Surface f19852f0;

    /* renamed from: g0, reason: collision with root package name */
    public SurfaceHolder f19853g0;

    /* renamed from: h0, reason: collision with root package name */
    public p5.l f19854h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f19855i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextureView f19856j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f19857k0;

    /* renamed from: l0, reason: collision with root package name */
    public n5.w f19858l0;

    /* renamed from: m0, reason: collision with root package name */
    public q4.d f19859m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f19860n0;

    /* renamed from: o0, reason: collision with root package name */
    public final C1791e f19861o0;

    /* renamed from: p0, reason: collision with root package name */
    public final float f19862p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f19863q0;

    /* renamed from: r0, reason: collision with root package name */
    public a5.c f19864r0;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f19865s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f19866t0;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC1565e[] f19867u;

    /* renamed from: u0, reason: collision with root package name */
    public o5.w f19868u0;

    /* renamed from: v, reason: collision with root package name */
    public final k5.u f19869v;

    /* renamed from: v0, reason: collision with root package name */
    public C1562c0 f19870v0;

    /* renamed from: w, reason: collision with root package name */
    public final n5.z f19871w;

    /* renamed from: w0, reason: collision with root package name */
    public r0 f19872w0;

    /* renamed from: x, reason: collision with root package name */
    public final C1590t f19873x;

    /* renamed from: x0, reason: collision with root package name */
    public int f19874x0;

    /* renamed from: y, reason: collision with root package name */
    public final C1555I f19875y;

    /* renamed from: y0, reason: collision with root package name */
    public long f19876y0;

    /* renamed from: z, reason: collision with root package name */
    public final n5.l f19877z;

    static {
        AbstractC1556J.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0383 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:3:0x001b, B:6:0x0091, B:8:0x010f, B:10:0x011b, B:11:0x0141, B:13:0x0149, B:15:0x0157, B:17:0x01a0, B:19:0x01b4, B:21:0x020a, B:23:0x020e, B:25:0x0214, B:26:0x021e, B:28:0x0222, B:29:0x0232, B:30:0x024f, B:31:0x027b, B:33:0x0281, B:36:0x028b, B:41:0x0292, B:43:0x02c8, B:44:0x02cc, B:46:0x02d4, B:49:0x0301, B:54:0x030c, B:56:0x02da, B:57:0x02de, B:58:0x02e1, B:59:0x02e7, B:63:0x02f1, B:68:0x02fb, B:69:0x0311, B:73:0x0324, B:75:0x032a, B:77:0x0330, B:78:0x035b, B:82:0x036f, B:84:0x0375, B:86:0x037b, B:87:0x03a6, B:88:0x03c3, B:93:0x03cf, B:94:0x03d2, B:101:0x0423, B:102:0x0383, B:103:0x0390, B:107:0x039b, B:109:0x039f, B:110:0x03a3, B:112:0x0338, B:113:0x0345, B:117:0x0350, B:119:0x0354, B:120:0x0358, B:124:0x023b, B:127:0x024d, B:128:0x0249, B:129:0x01ab, B:90:0x03c4, B:91:0x03cc), top: B:2:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037b A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:3:0x001b, B:6:0x0091, B:8:0x010f, B:10:0x011b, B:11:0x0141, B:13:0x0149, B:15:0x0157, B:17:0x01a0, B:19:0x01b4, B:21:0x020a, B:23:0x020e, B:25:0x0214, B:26:0x021e, B:28:0x0222, B:29:0x0232, B:30:0x024f, B:31:0x027b, B:33:0x0281, B:36:0x028b, B:41:0x0292, B:43:0x02c8, B:44:0x02cc, B:46:0x02d4, B:49:0x0301, B:54:0x030c, B:56:0x02da, B:57:0x02de, B:58:0x02e1, B:59:0x02e7, B:63:0x02f1, B:68:0x02fb, B:69:0x0311, B:73:0x0324, B:75:0x032a, B:77:0x0330, B:78:0x035b, B:82:0x036f, B:84:0x0375, B:86:0x037b, B:87:0x03a6, B:88:0x03c3, B:93:0x03cf, B:94:0x03d2, B:101:0x0423, B:102:0x0383, B:103:0x0390, B:107:0x039b, B:109:0x039f, B:110:0x03a3, B:112:0x0338, B:113:0x0345, B:117:0x0350, B:119:0x0354, B:120:0x0358, B:124:0x023b, B:127:0x024d, B:128:0x0249, B:129:0x01ab, B:90:0x03c4, B:91:0x03cc), top: B:2:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4, types: [m4.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [N7.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1549C(C1585o c1585o) {
        super(9);
        C1791e c1791e;
        O0 o02;
        boolean z8;
        WifiManager.WifiLock wifiLock;
        k5.q qVar;
        boolean equals;
        WifiManager wifiManager;
        int i7;
        boolean z10;
        this.f19847d = new Object();
        try {
            AbstractC1705a.B("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + n5.D.f21145e + "]");
            this.f19849e = c1585o.f20451a.getApplicationContext();
            this.f19821E = new n4.f(c1585o.f20452b);
            this.f19861o0 = c1585o.f20457h;
            this.f19857k0 = c1585o.f20459l;
            this.f19863q0 = false;
            this.f19832Q = c1585o.f20466s;
            SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = new SurfaceHolderCallbackC1596z(this);
            this.f19827K = surfaceHolderCallbackC1596z;
            this.L = new Object();
            Handler handler = new Handler(c1585o.g);
            AbstractC1565e[] a9 = ((C1577k) c1585o.f20453c.get()).a(handler, surfaceHolderCallbackC1596z, surfaceHolderCallbackC1596z, surfaceHolderCallbackC1596z, surfaceHolderCallbackC1596z);
            this.f19867u = a9;
            AbstractC1705a.m(a9.length > 0);
            this.f19869v = (k5.u) c1585o.f20455e.get();
            this.f19823G = (InterfaceC1609f) c1585o.f20456f.get();
            this.f19820D = c1585o.f20460m;
            this.f19839X = c1585o.f20461n;
            this.f19824H = c1585o.f20462o;
            this.f19825I = c1585o.f20463p;
            Looper looper = c1585o.g;
            this.f19822F = looper;
            n5.x xVar = c1585o.f20452b;
            this.f19826J = xVar;
            this.f19851f = this;
            this.f19877z = new n5.l(looper, xVar, new C1590t(this));
            this.f19817A = new CopyOnWriteArraySet();
            this.f19819C = new ArrayList();
            this.f19840Y = new P4.g0();
            this.f19843b = new k5.y(new D0[a9.length], new k5.s[a9.length], N0.f20113b, null);
            this.f19818B = new J0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 19; i10++) {
                int i11 = iArr[i10];
                AbstractC1705a.m(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.f19869v.getClass();
            AbstractC1705a.m(!false);
            sparseBooleanArray.append(29, true);
            AbstractC1705a.m(!false);
            n5.f fVar = new n5.f(sparseBooleanArray);
            this.f19845c = new t0(fVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < fVar.f21175a.size(); i12++) {
                int a10 = fVar.a(i12);
                AbstractC1705a.m(!false);
                sparseBooleanArray2.append(a10, true);
            }
            AbstractC1705a.m(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1705a.m(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1705a.m(!false);
            this.f19841Z = new t0(new n5.f(sparseBooleanArray2));
            this.f19871w = this.f19826J.a(this.f19822F, null);
            C1590t c1590t = new C1590t(this);
            this.f19873x = c1590t;
            this.f19872w0 = r0.i(this.f19843b);
            this.f19821E.R(this.f19851f, this.f19822F);
            int i13 = n5.D.f21141a;
            this.f19875y = new C1555I(this.f19867u, this.f19869v, this.f19843b, new C1575j(), this.f19823G, this.f19833R, this.f19834S, this.f19821E, this.f19839X, c1585o.f20464q, c1585o.f20465r, this.f19822F, this.f19826J, c1590t, i13 < 31 ? new n4.l() : AbstractC1594x.a(this.f19849e, this, c1585o.f20467t));
            this.f19862p0 = 1.0f;
            this.f19833R = 0;
            C1562c0 c1562c0 = C1562c0.f20268W;
            this.f19842a0 = c1562c0;
            this.f19870v0 = c1562c0;
            int i14 = -1;
            this.f19874x0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.f19848d0;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    c1791e = null;
                } else {
                    this.f19848d0.release();
                    c1791e = null;
                    this.f19848d0 = null;
                }
                if (this.f19848d0 == null) {
                    this.f19848d0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f19860n0 = this.f19848d0.getAudioSessionId();
            } else {
                c1791e = null;
                AudioManager audioManager = (AudioManager) this.f19849e.getSystemService("audio");
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.f19860n0 = i14;
            }
            this.f19864r0 = a5.c.f12743b;
            this.f19865s0 = true;
            K(this.f19821E);
            InterfaceC1609f interfaceC1609f = this.f19823G;
            Handler handler2 = new Handler(this.f19822F);
            n4.f fVar2 = this.f19821E;
            C1621s c1621s = (C1621s) interfaceC1609f;
            c1621s.getClass();
            fVar2.getClass();
            R7.b bVar = c1621s.f20650b;
            bVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) bVar.f8929b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1608e c1608e = (C1608e) it.next();
                if (c1608e.f20604b == fVar2) {
                    c1608e.f20605c = true;
                    copyOnWriteArrayList.remove(c1608e);
                }
            }
            ((CopyOnWriteArrayList) bVar.f8929b).add(new C1608e(handler2, fVar2));
            this.f19817A.add(this.f19827K);
            P3.p pVar = new P3.p(c1585o.f20451a, handler, this.f19827K);
            this.f19828M = pVar;
            pVar.j(c1585o.k);
            C1563d c1563d = new C1563d(c1585o.f20451a, handler, this.f19827K);
            this.f19829N = c1563d;
            C1791e c1791e2 = c1585o.f20458i ? this.f19861o0 : c1791e;
            if (!n5.D.a(c1563d.f20334d, c1791e2)) {
                c1563d.f20334d = c1791e2;
                if (c1791e2 != null) {
                    int i15 = c1791e2.f21841c;
                    switch (i15) {
                        case 0:
                            AbstractC1705a.S("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                            i7 = 1;
                            break;
                        case 1:
                        case 14:
                            i7 = 1;
                            break;
                        case 2:
                        case 4:
                            i7 = 2;
                            break;
                        case 3:
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                            i7 = 3;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            if (c1791e2.f21839a == 1) {
                                i7 = 2;
                                break;
                            }
                            i7 = 3;
                            break;
                        case 15:
                        default:
                            h3.o.u(i15, "Unidentified audio usage: ", "AudioFocusManager");
                            break;
                        case 16:
                            if (n5.D.f21141a >= 19) {
                                i7 = 4;
                                break;
                            }
                            i7 = 2;
                            break;
                    }
                    c1563d.f20336f = i7;
                    if (i7 != 1 && i7 != 0) {
                        z10 = false;
                        AbstractC1705a.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
                    }
                    z10 = true;
                    AbstractC1705a.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
                }
                i7 = 0;
                c1563d.f20336f = i7;
                if (i7 != 1) {
                    z10 = false;
                    AbstractC1705a.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
                }
                z10 = true;
                AbstractC1705a.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
            }
            O0 o03 = new O0(c1585o.f20451a, 0);
            this.f19830O = o03;
            boolean z11 = c1585o.j != 0;
            if (z11 && ((PowerManager.WakeLock) o03.f20121d) == null) {
                PowerManager powerManager = (PowerManager) o03.f20120c;
                if (powerManager == null) {
                    AbstractC1705a.S("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    o02 = new O0(c1585o.f20451a, 1);
                    this.f19831P = o02;
                    z8 = c1585o.j != 2;
                    if (z8 && ((WifiManager.WifiLock) o02.f20121d) == null) {
                        wifiManager = (WifiManager) o02.f20120c;
                        if (wifiManager != null) {
                            AbstractC1705a.S("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                            E3.h hVar = new E3.h(0);
                            hVar.f3538b = 0;
                            hVar.f3539c = 0;
                            hVar.a();
                            this.f19868u0 = o5.w.f22047e;
                            this.f19858l0 = n5.w.f21232c;
                            k5.u uVar = this.f19869v;
                            C1791e c1791e3 = this.f19861o0;
                            qVar = (k5.q) uVar;
                            synchronized (qVar.f18955c) {
                                equals = qVar.f18960i.equals(c1791e3);
                                qVar.f18960i = c1791e3;
                            }
                            if (!equals) {
                                qVar.f();
                            }
                            o0(Integer.valueOf(this.f19860n0), 1, 10);
                            o0(Integer.valueOf(this.f19860n0), 2, 10);
                            o0(this.f19861o0, 1, 3);
                            o0(Integer.valueOf(this.f19857k0), 2, 4);
                            o0(0, 2, 5);
                            o0(Boolean.valueOf(this.f19863q0), 1, 9);
                            o0(this.L, 2, 7);
                            o0(this.L, 6, 8);
                            this.f19847d.b();
                            return;
                        }
                        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                        o02.f20121d = createWifiLock;
                        createWifiLock.setReferenceCounted(false);
                    }
                    o02.f20118a = z8;
                    wifiLock = (WifiManager.WifiLock) o02.f20121d;
                    if (wifiLock != null) {
                        if (z8 && o02.f20119b) {
                            wifiLock.acquire();
                        } else {
                            wifiLock.release();
                        }
                    }
                    E3.h hVar2 = new E3.h(0);
                    hVar2.f3538b = 0;
                    hVar2.f3539c = 0;
                    hVar2.a();
                    this.f19868u0 = o5.w.f22047e;
                    this.f19858l0 = n5.w.f21232c;
                    k5.u uVar2 = this.f19869v;
                    C1791e c1791e32 = this.f19861o0;
                    qVar = (k5.q) uVar2;
                    synchronized (qVar.f18955c) {
                    }
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    o03.f20121d = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            o03.f20118a = z11;
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) o03.f20121d;
            if (wakeLock != null) {
                if (z11 && o03.f20119b) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            }
            o02 = new O0(c1585o.f20451a, 1);
            this.f19831P = o02;
            if (c1585o.j != 2) {
            }
            if (z8) {
                wifiManager = (WifiManager) o02.f20120c;
                if (wifiManager != null) {
                }
            }
            o02.f20118a = z8;
            wifiLock = (WifiManager.WifiLock) o02.f20121d;
            if (wifiLock != null) {
            }
            E3.h hVar22 = new E3.h(0);
            hVar22.f3538b = 0;
            hVar22.f3539c = 0;
            hVar22.a();
            this.f19868u0 = o5.w.f22047e;
            this.f19858l0 = n5.w.f21232c;
            k5.u uVar22 = this.f19869v;
            C1791e c1791e322 = this.f19861o0;
            qVar = (k5.q) uVar22;
            synchronized (qVar.f18955c) {
            }
        } catch (Throwable th) {
            this.f19847d.b();
            throw th;
        }
    }

    public static long e0(r0 r0Var) {
        K0 k02 = new K0();
        J0 j02 = new J0();
        r0Var.f20482a.g(r0Var.f20483b.f8157a, j02);
        long j = r0Var.f20484c;
        if (j != -9223372036854775807L) {
            return j02.f19967e + j;
        }
        return r0Var.f20482a.m(j02.f19965c, k02, 0L).f20014A;
    }

    public final void A0() {
        int k;
        int e2;
        t0 t0Var = this.f19841Z;
        int i7 = n5.D.f21141a;
        C1549C c1549c = this.f19851f;
        boolean g02 = c1549c.g0();
        boolean r10 = c1549c.r();
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            k = -1;
        } else {
            int U8 = c1549c.U();
            c1549c.E0();
            int i10 = c1549c.f19833R;
            if (i10 == 1) {
                i10 = 0;
            }
            c1549c.E0();
            k = Y2.k(c1549c.f19834S, U8, i10);
        }
        boolean z8 = k != -1;
        L0 Y10 = c1549c.Y();
        if (Y10.p()) {
            e2 = -1;
        } else {
            int U10 = c1549c.U();
            c1549c.E0();
            int i11 = c1549c.f19833R;
            if (i11 == 1) {
                i11 = 0;
            }
            c1549c.E0();
            e2 = Y10.e(c1549c.f19834S, U10, i11);
        }
        boolean z10 = e2 != -1;
        boolean q10 = c1549c.q();
        boolean p10 = c1549c.p();
        boolean p11 = c1549c.Y().p();
        C1290a c1290a = new C1290a();
        n5.f fVar = this.f19845c.f20505a;
        A9.O o10 = (A9.O) c1290a.f18187b;
        o10.getClass();
        for (int i12 = 0; i12 < fVar.f21175a.size(); i12++) {
            o10.c(fVar.a(i12));
        }
        boolean z11 = !g02;
        c1290a.j(4, z11);
        c1290a.j(5, r10 && !g02);
        c1290a.j(6, z8 && !g02);
        c1290a.j(7, !p11 && (z8 || !q10 || r10) && !g02);
        c1290a.j(8, z10 && !g02);
        c1290a.j(9, !p11 && (z10 || (q10 && p10)) && !g02);
        c1290a.j(10, z11);
        c1290a.j(11, r10 && !g02);
        c1290a.j(12, r10 && !g02);
        t0 t0Var2 = new t0(o10.d());
        this.f19841Z = t0Var2;
        if (t0Var2.equals(t0Var)) {
            return;
        }
        this.f19877z.c(13, new C1590t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void B0(boolean z8, int i7, int i10) {
        int i11 = 0;
        ?? r13 = (!z8 || i7 == -1) ? 0 : 1;
        if (r13 != 0 && i7 != 1) {
            i11 = 1;
        }
        r0 r0Var = this.f19872w0;
        if (r0Var.f20490l == r13 && r0Var.f20491m == i11) {
            return;
        }
        this.f19835T++;
        boolean z10 = r0Var.f20493o;
        r0 r0Var2 = r0Var;
        if (z10) {
            r0Var2 = r0Var.a();
        }
        r0 d10 = r0Var2.d(i11, r13);
        n5.z zVar = this.f19875y.f19951v;
        zVar.getClass();
        n5.y b2 = n5.z.b();
        b2.f21236a = zVar.f21238a.obtainMessage(1, r13, i11);
        b2.b();
        C0(d10, 0, i10, false, 5, -9223372036854775807L, -1, false);
    }

    public final void C0(final r0 r0Var, final int i7, final int i10, boolean z8, int i11, long j, int i12, boolean z10) {
        Pair pair;
        int i13;
        C1558a0 c1558a0;
        boolean z11;
        boolean z12;
        int i14;
        Object obj;
        C1558a0 c1558a02;
        Object obj2;
        int i15;
        long j10;
        long j11;
        long j12;
        long e02;
        Object obj3;
        C1558a0 c1558a03;
        Object obj4;
        int i16;
        r0 r0Var2 = this.f19872w0;
        this.f19872w0 = r0Var;
        boolean equals = r0Var2.f20482a.equals(r0Var.f20482a);
        L0 l02 = r0Var2.f20482a;
        L0 l03 = r0Var.f20482a;
        if (l03.p() && l02.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l03.p() != l02.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            P4.B b2 = r0Var2.f20483b;
            Object obj5 = b2.f8157a;
            J0 j02 = this.f19818B;
            int i17 = l02.g(obj5, j02).f19965c;
            K0 k02 = (K0) this.f3094a;
            Object obj6 = l02.m(i17, k02, 0L).f20019a;
            P4.B b10 = r0Var.f20483b;
            if (obj6.equals(l03.m(l03.g(b10.f8157a, j02).f19965c, k02, 0L).f20019a)) {
                pair = (z8 && i11 == 0 && b2.f8160d < b10.f8160d) ? new Pair(Boolean.TRUE, 0) : (z8 && i11 == 1 && z10) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z8 && i11 == 0) {
                    i13 = 1;
                } else if (z8 && i11 == 1) {
                    i13 = 2;
                } else {
                    if (equals) {
                        throw new IllegalStateException();
                    }
                    i13 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        C1562c0 c1562c0 = this.f19842a0;
        if (booleanValue) {
            c1558a0 = !r0Var.f20482a.p() ? r0Var.f20482a.m(r0Var.f20482a.g(r0Var.f20483b.f8157a, this.f19818B).f19965c, (K0) this.f3094a, 0L).f20021c : null;
            this.f19870v0 = C1562c0.f20268W;
        } else {
            c1558a0 = null;
        }
        if (booleanValue || !r0Var2.j.equals(r0Var.j)) {
            C1560b0 a9 = this.f19870v0.a();
            List list = r0Var.j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                F4.c cVar = (F4.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    F4.b[] bVarArr = cVar.f4071a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].i(a9);
                        i19++;
                    }
                }
            }
            this.f19870v0 = new C1562c0(a9);
            c1562c0 = L();
        }
        boolean equals2 = c1562c0.equals(this.f19842a0);
        this.f19842a0 = c1562c0;
        boolean z13 = r0Var2.f20490l != r0Var.f20490l;
        boolean z14 = r0Var2.f20486e != r0Var.f20486e;
        if (z14 || z13) {
            D0();
        }
        boolean z15 = r0Var2.g != r0Var.g;
        if (!equals) {
            final int i20 = 0;
            this.f19877z.c(0, new n5.i() { // from class: m4.q
                @Override // n5.i
                public final void invoke(Object obj7) {
                    v0 v0Var = (v0) obj7;
                    switch (i20) {
                        case 0:
                            L0 l04 = r0Var.f20482a;
                            v0Var.b(i7);
                            return;
                        default:
                            v0Var.t(i7, r0Var.f20490l);
                            return;
                    }
                }
            });
        }
        if (z8) {
            J0 j03 = new J0();
            if (r0Var2.f20482a.p()) {
                z11 = z14;
                z12 = z15;
                i14 = i12;
                obj = null;
                c1558a02 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj7 = r0Var2.f20483b.f8157a;
                r0Var2.f20482a.g(obj7, j03);
                int i21 = j03.f19965c;
                int b11 = r0Var2.f20482a.b(obj7);
                z11 = z14;
                z12 = z15;
                obj = r0Var2.f20482a.m(i21, (K0) this.f3094a, 0L).f20019a;
                c1558a02 = ((K0) this.f3094a).f20021c;
                i14 = i21;
                i15 = b11;
                obj2 = obj7;
            }
            if (i11 == 0) {
                if (r0Var2.f20483b.a()) {
                    P4.B b12 = r0Var2.f20483b;
                    j12 = j03.a(b12.f8158b, b12.f8159c);
                    e02 = e0(r0Var2);
                } else if (r0Var2.f20483b.f8161e != -1) {
                    j12 = e0(this.f19872w0);
                    e02 = j12;
                } else {
                    j10 = j03.f19967e;
                    j11 = j03.f19966d;
                    j12 = j10 + j11;
                    e02 = j12;
                }
            } else if (r0Var2.f20483b.a()) {
                j12 = r0Var2.f20496r;
                e02 = e0(r0Var2);
            } else {
                j10 = j03.f19967e;
                j11 = r0Var2.f20496r;
                j12 = j10 + j11;
                e02 = j12;
            }
            long Z7 = n5.D.Z(j12);
            long Z10 = n5.D.Z(e02);
            P4.B b13 = r0Var2.f20483b;
            w0 w0Var = new w0(obj, i14, c1558a02, obj2, i15, Z7, Z10, b13.f8158b, b13.f8159c);
            int U8 = U();
            if (this.f19872w0.f20482a.p()) {
                obj3 = null;
                c1558a03 = null;
                obj4 = null;
                i16 = -1;
            } else {
                r0 r0Var3 = this.f19872w0;
                Object obj8 = r0Var3.f20483b.f8157a;
                r0Var3.f20482a.g(obj8, this.f19818B);
                int b14 = this.f19872w0.f20482a.b(obj8);
                L0 l04 = this.f19872w0.f20482a;
                K0 k03 = (K0) this.f3094a;
                i16 = b14;
                obj3 = l04.m(U8, k03, 0L).f20019a;
                c1558a03 = k03.f20021c;
                obj4 = obj8;
            }
            long Z11 = n5.D.Z(j);
            long Z12 = this.f19872w0.f20483b.a() ? n5.D.Z(e0(this.f19872w0)) : Z11;
            P4.B b15 = this.f19872w0.f20483b;
            this.f19877z.c(11, new h3.r(i11, w0Var, new w0(obj3, U8, c1558a03, obj4, i16, Z11, Z12, b15.f8158b, b15.f8159c)));
        } else {
            z11 = z14;
            z12 = z15;
        }
        if (booleanValue) {
            this.f19877z.c(1, new C1593w(c1558a0, intValue, 0));
        }
        if (r0Var2.f20487f != r0Var.f20487f) {
            final int i22 = 6;
            this.f19877z.c(10, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i22) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
            if (r0Var.f20487f != null) {
                final int i23 = 7;
                this.f19877z.c(10, new n5.i() { // from class: m4.r
                    @Override // n5.i
                    public final void invoke(Object obj9) {
                        v0 v0Var = (v0) obj9;
                        switch (i23) {
                            case 0:
                                r0 r0Var4 = r0Var;
                                boolean z16 = r0Var4.g;
                                v0Var.getClass();
                                v0Var.n(r0Var4.g);
                                return;
                            case 1:
                                r0 r0Var5 = r0Var;
                                v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                                return;
                            case 2:
                                v0Var.v(r0Var.f20486e);
                                return;
                            case 3:
                                v0Var.a(r0Var.f20491m);
                                return;
                            case 4:
                                v0Var.L(r0Var.k());
                                return;
                            case 5:
                                v0Var.u(r0Var.f20492n);
                                return;
                            case 6:
                                v0Var.w(r0Var.f20487f);
                                return;
                            case 7:
                                v0Var.i(r0Var.f20487f);
                                return;
                            default:
                                v0Var.j(r0Var.f20489i.f19020d);
                                return;
                        }
                    }
                });
            }
        }
        k5.y yVar = r0Var2.f20489i;
        k5.y yVar2 = r0Var.f20489i;
        if (yVar != yVar2) {
            k5.u uVar = this.f19869v;
            C0288b c0288b = yVar2.f19021e;
            uVar.getClass();
            final int i24 = 8;
            this.f19877z.c(2, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i24) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (!equals2) {
            this.f19877z.c(14, new Q9.a(this.f19842a0, 19));
        }
        if (z12) {
            final int i25 = 0;
            this.f19877z.c(3, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i25) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (z11 || z13) {
            final int i26 = 1;
            this.f19877z.c(-1, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i26) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (z11) {
            final int i27 = 2;
            this.f19877z.c(4, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i27) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (z13) {
            final int i28 = 1;
            this.f19877z.c(5, new n5.i() { // from class: m4.q
                @Override // n5.i
                public final void invoke(Object obj72) {
                    v0 v0Var = (v0) obj72;
                    switch (i28) {
                        case 0:
                            L0 l042 = r0Var.f20482a;
                            v0Var.b(i10);
                            return;
                        default:
                            v0Var.t(i10, r0Var.f20490l);
                            return;
                    }
                }
            });
        }
        if (r0Var2.f20491m != r0Var.f20491m) {
            final int i29 = 3;
            this.f19877z.c(6, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i29) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (r0Var2.k() != r0Var.k()) {
            final int i30 = 4;
            this.f19877z.c(7, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i30) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        if (!r0Var2.f20492n.equals(r0Var.f20492n)) {
            final int i31 = 5;
            this.f19877z.c(12, new n5.i() { // from class: m4.r
                @Override // n5.i
                public final void invoke(Object obj9) {
                    v0 v0Var = (v0) obj9;
                    switch (i31) {
                        case 0:
                            r0 r0Var4 = r0Var;
                            boolean z16 = r0Var4.g;
                            v0Var.getClass();
                            v0Var.n(r0Var4.g);
                            return;
                        case 1:
                            r0 r0Var5 = r0Var;
                            v0Var.r(r0Var5.f20486e, r0Var5.f20490l);
                            return;
                        case 2:
                            v0Var.v(r0Var.f20486e);
                            return;
                        case 3:
                            v0Var.a(r0Var.f20491m);
                            return;
                        case 4:
                            v0Var.L(r0Var.k());
                            return;
                        case 5:
                            v0Var.u(r0Var.f20492n);
                            return;
                        case 6:
                            v0Var.w(r0Var.f20487f);
                            return;
                        case 7:
                            v0Var.i(r0Var.f20487f);
                            return;
                        default:
                            v0Var.j(r0Var.f20489i.f19020d);
                            return;
                    }
                }
            });
        }
        A0();
        this.f19877z.b();
        if (r0Var2.f20493o != r0Var.f20493o) {
            Iterator it = this.f19817A.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC1596z) it.next()).f20525a.D0();
            }
        }
    }

    public final void D0() {
        int d02 = d0();
        O0 o02 = this.f19831P;
        O0 o03 = this.f19830O;
        if (d02 != 1) {
            if (d02 == 2 || d02 == 3) {
                E0();
                boolean z8 = c0() && !this.f19872w0.f20493o;
                o03.f20119b = z8;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) o03.f20121d;
                if (wakeLock != null) {
                    if (o03.f20118a && z8) {
                        wakeLock.acquire();
                    } else {
                        wakeLock.release();
                    }
                }
                boolean c02 = c0();
                o02.f20119b = c02;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) o02.f20121d;
                if (wifiLock == null) {
                    return;
                }
                if (o02.f20118a && c02) {
                    wifiLock.acquire();
                    return;
                } else {
                    wifiLock.release();
                    return;
                }
            }
            if (d02 != 4) {
                throw new IllegalStateException();
            }
        }
        o03.f20119b = false;
        PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) o03.f20121d;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        o02.f20119b = false;
        WifiManager.WifiLock wifiLock2 = (WifiManager.WifiLock) o02.f20121d;
        if (wifiLock2 == null) {
            return;
        }
        wifiLock2.release();
    }

    public final void E0() {
        N7.a aVar = this.f19847d;
        synchronized (aVar) {
            boolean z8 = false;
            while (!aVar.f7385a) {
                try {
                    aVar.wait();
                } catch (InterruptedException unused) {
                    z8 = true;
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f19822F.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f19822F.getThread().getName();
            int i7 = n5.D.f21141a;
            Locale locale = Locale.US;
            String n6 = h3.o.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f19865s0) {
                throw new IllegalStateException(n6);
            }
            AbstractC1705a.R(this.f19866t0 ? null : new IllegalStateException(), "ExoPlayerImpl", n6);
            this.f19866t0 = true;
        }
    }

    public final void K(v0 v0Var) {
        v0Var.getClass();
        this.f19877z.a(v0Var);
    }

    public final C1562c0 L() {
        L0 Y2 = Y();
        if (Y2.p()) {
            return this.f19870v0;
        }
        C1558a0 c1558a0 = Y2.m(U(), (K0) this.f3094a, 0L).f20021c;
        C1560b0 a9 = this.f19870v0.a();
        C1562c0 c1562c0 = c1558a0.f20226d;
        if (c1562c0 != null) {
            CharSequence charSequence = c1562c0.f20319a;
            if (charSequence != null) {
                a9.f20239a = charSequence;
            }
            CharSequence charSequence2 = c1562c0.f20320b;
            if (charSequence2 != null) {
                a9.f20240b = charSequence2;
            }
            CharSequence charSequence3 = c1562c0.f20321c;
            if (charSequence3 != null) {
                a9.f20241c = charSequence3;
            }
            CharSequence charSequence4 = c1562c0.f20322d;
            if (charSequence4 != null) {
                a9.f20242d = charSequence4;
            }
            CharSequence charSequence5 = c1562c0.f20323e;
            if (charSequence5 != null) {
                a9.f20243e = charSequence5;
            }
            CharSequence charSequence6 = c1562c0.f20324f;
            if (charSequence6 != null) {
                a9.f20244f = charSequence6;
            }
            CharSequence charSequence7 = c1562c0.f20325u;
            if (charSequence7 != null) {
                a9.g = charSequence7;
            }
            C0 c02 = c1562c0.f20326v;
            if (c02 != null) {
                a9.f20245h = c02;
            }
            C0 c03 = c1562c0.f20327w;
            if (c03 != null) {
                a9.f20246i = c03;
            }
            byte[] bArr = c1562c0.f20328x;
            if (bArr != null) {
                a9.j = (byte[]) bArr.clone();
                a9.k = c1562c0.f20329y;
            }
            Uri uri = c1562c0.f20330z;
            if (uri != null) {
                a9.f20247l = uri;
            }
            Integer num = c1562c0.f20298A;
            if (num != null) {
                a9.f20248m = num;
            }
            Integer num2 = c1562c0.f20299B;
            if (num2 != null) {
                a9.f20249n = num2;
            }
            Integer num3 = c1562c0.f20300C;
            if (num3 != null) {
                a9.f20250o = num3;
            }
            Boolean bool = c1562c0.f20301D;
            if (bool != null) {
                a9.f20251p = bool;
            }
            Boolean bool2 = c1562c0.f20302E;
            if (bool2 != null) {
                a9.f20252q = bool2;
            }
            Integer num4 = c1562c0.f20303F;
            if (num4 != null) {
                a9.f20253r = num4;
            }
            Integer num5 = c1562c0.f20304G;
            if (num5 != null) {
                a9.f20253r = num5;
            }
            Integer num6 = c1562c0.f20305H;
            if (num6 != null) {
                a9.f20254s = num6;
            }
            Integer num7 = c1562c0.f20306I;
            if (num7 != null) {
                a9.f20255t = num7;
            }
            Integer num8 = c1562c0.f20307J;
            if (num8 != null) {
                a9.f20256u = num8;
            }
            Integer num9 = c1562c0.f20308K;
            if (num9 != null) {
                a9.f20257v = num9;
            }
            Integer num10 = c1562c0.L;
            if (num10 != null) {
                a9.f20258w = num10;
            }
            CharSequence charSequence8 = c1562c0.f20309M;
            if (charSequence8 != null) {
                a9.f20259x = charSequence8;
            }
            CharSequence charSequence9 = c1562c0.f20310N;
            if (charSequence9 != null) {
                a9.f20260y = charSequence9;
            }
            CharSequence charSequence10 = c1562c0.f20311O;
            if (charSequence10 != null) {
                a9.f20261z = charSequence10;
            }
            Integer num11 = c1562c0.f20312P;
            if (num11 != null) {
                a9.f20232A = num11;
            }
            Integer num12 = c1562c0.f20313Q;
            if (num12 != null) {
                a9.f20233B = num12;
            }
            CharSequence charSequence11 = c1562c0.f20314R;
            if (charSequence11 != null) {
                a9.f20234C = charSequence11;
            }
            CharSequence charSequence12 = c1562c0.f20315S;
            if (charSequence12 != null) {
                a9.f20235D = charSequence12;
            }
            CharSequence charSequence13 = c1562c0.f20316T;
            if (charSequence13 != null) {
                a9.f20236E = charSequence13;
            }
            Integer num13 = c1562c0.f20317U;
            if (num13 != null) {
                a9.f20237F = num13;
            }
            Bundle bundle = c1562c0.f20318V;
            if (bundle != null) {
                a9.f20238G = bundle;
            }
        }
        return new C1562c0(a9);
    }

    public final void M() {
        E0();
        n0();
        v0(null);
        j0(0, 0);
    }

    public final z0 N(y0 y0Var) {
        int a02 = a0(this.f19872w0);
        L0 l02 = this.f19872w0.f20482a;
        if (a02 == -1) {
            a02 = 0;
        }
        C1555I c1555i = this.f19875y;
        return new z0(c1555i, y0Var, l02, a02, this.f19826J, c1555i.f19953x);
    }

    public final long O() {
        E0();
        if (!g0()) {
            return P();
        }
        r0 r0Var = this.f19872w0;
        return r0Var.k.equals(r0Var.f20483b) ? n5.D.Z(this.f19872w0.f20494p) : b0();
    }

    public final long P() {
        E0();
        if (this.f19872w0.f20482a.p()) {
            return this.f19876y0;
        }
        r0 r0Var = this.f19872w0;
        if (r0Var.k.f8160d != r0Var.f20483b.f8160d) {
            return n5.D.Z(r0Var.f20482a.m(U(), (K0) this.f3094a, 0L).f20015B);
        }
        long j = r0Var.f20494p;
        if (this.f19872w0.k.a()) {
            r0 r0Var2 = this.f19872w0;
            J0 g = r0Var2.f20482a.g(r0Var2.k.f8157a, this.f19818B);
            long d10 = g.d(this.f19872w0.k.f8158b);
            j = d10 == Long.MIN_VALUE ? g.f19966d : d10;
        }
        r0 r0Var3 = this.f19872w0;
        L0 l02 = r0Var3.f20482a;
        Object obj = r0Var3.k.f8157a;
        J0 j02 = this.f19818B;
        l02.g(obj, j02);
        return n5.D.Z(j + j02.f19967e);
    }

    public final long Q() {
        E0();
        return R(this.f19872w0);
    }

    public final long R(r0 r0Var) {
        if (!r0Var.f20483b.a()) {
            return n5.D.Z(X(r0Var));
        }
        Object obj = r0Var.f20483b.f8157a;
        L0 l02 = r0Var.f20482a;
        J0 j02 = this.f19818B;
        l02.g(obj, j02);
        long j = r0Var.f20484c;
        return j == -9223372036854775807L ? n5.D.Z(l02.m(a0(r0Var), (K0) this.f3094a, 0L).f20014A) : n5.D.Z(j02.f19967e) + n5.D.Z(j);
    }

    public final int S() {
        E0();
        if (g0()) {
            return this.f19872w0.f20483b.f8158b;
        }
        return -1;
    }

    public final int T() {
        E0();
        if (g0()) {
            return this.f19872w0.f20483b.f8159c;
        }
        return -1;
    }

    public final int U() {
        E0();
        int a02 = a0(this.f19872w0);
        if (a02 == -1) {
            return 0;
        }
        return a02;
    }

    public final int V() {
        E0();
        if (this.f19872w0.f20482a.p()) {
            return 0;
        }
        r0 r0Var = this.f19872w0;
        return r0Var.f20482a.b(r0Var.f20483b.f8157a);
    }

    public final long W() {
        E0();
        return n5.D.Z(X(this.f19872w0));
    }

    public final long X(r0 r0Var) {
        if (r0Var.f20482a.p()) {
            return n5.D.M(this.f19876y0);
        }
        long j = r0Var.f20493o ? r0Var.j() : r0Var.f20496r;
        if (r0Var.f20483b.a()) {
            return j;
        }
        L0 l02 = r0Var.f20482a;
        Object obj = r0Var.f20483b.f8157a;
        J0 j02 = this.f19818B;
        l02.g(obj, j02);
        return j + j02.f19967e;
    }

    public final L0 Y() {
        E0();
        return this.f19872w0.f20482a;
    }

    public final N0 Z() {
        E0();
        return this.f19872w0.f20489i.f19020d;
    }

    public final int a0(r0 r0Var) {
        if (r0Var.f20482a.p()) {
            return this.f19874x0;
        }
        return r0Var.f20482a.g(r0Var.f20483b.f8157a, this.f19818B).f19965c;
    }

    public final long b0() {
        E0();
        if (!g0()) {
            return j();
        }
        r0 r0Var = this.f19872w0;
        P4.B b2 = r0Var.f20483b;
        L0 l02 = r0Var.f20482a;
        Object obj = b2.f8157a;
        J0 j02 = this.f19818B;
        l02.g(obj, j02);
        return n5.D.Z(j02.a(b2.f8158b, b2.f8159c));
    }

    public final boolean c0() {
        E0();
        return this.f19872w0.f20490l;
    }

    public final int d0() {
        E0();
        return this.f19872w0.f20486e;
    }

    public final k5.i f0() {
        E0();
        return ((k5.q) this.f19869v).d();
    }

    public final boolean g0() {
        E0();
        return this.f19872w0.f20483b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [P4.z] */
    public final r0 h0(r0 r0Var, L0 l02, Pair pair) {
        List list;
        AbstractC1705a.h(l02.p() || pair != null);
        L0 l03 = r0Var.f20482a;
        long R10 = R(r0Var);
        r0 h10 = r0Var.h(l02);
        if (l02.p()) {
            P4.B b2 = r0.f20481t;
            long M3 = n5.D.M(this.f19876y0);
            r0 b10 = h10.c(b2, M3, M3, M3, 0L, P4.n0.f8117d, this.f19843b, N6.t0.f7341e).b(b2);
            b10.f20494p = b10.f20496r;
            return b10;
        }
        Object obj = h10.f20483b.f8157a;
        int i7 = n5.D.f21141a;
        boolean equals = obj.equals(pair.first);
        P4.B c0477z = !equals ? new C0477z(pair.first) : h10.f20483b;
        long longValue = ((Long) pair.second).longValue();
        long M10 = n5.D.M(R10);
        if (!l03.p()) {
            M10 -= l03.g(obj, this.f19818B).f19967e;
        }
        if (!equals || longValue < M10) {
            AbstractC1705a.m(!c0477z.a());
            P4.n0 n0Var = !equals ? P4.n0.f8117d : h10.f20488h;
            k5.y yVar = !equals ? this.f19843b : h10.f20489i;
            if (equals) {
                list = h10.j;
            } else {
                N6.F f4 = N6.H.f7232b;
                list = N6.t0.f7341e;
            }
            r0 b11 = h10.c(c0477z, longValue, longValue, longValue, 0L, n0Var, yVar, list).b(c0477z);
            b11.f20494p = longValue;
            return b11;
        }
        if (longValue != M10) {
            AbstractC1705a.m(!c0477z.a());
            long max = Math.max(0L, h10.f20495q - (longValue - M10));
            long j = h10.f20494p;
            if (h10.k.equals(h10.f20483b)) {
                j = longValue + max;
            }
            r0 c10 = h10.c(c0477z, longValue, longValue, longValue, max, h10.f20488h, h10.f20489i, h10.j);
            c10.f20494p = j;
            return c10;
        }
        int b12 = l02.b(h10.k.f8157a);
        if (b12 != -1 && l02.f(b12, this.f19818B, false).f19965c == l02.g(c0477z.f8157a, this.f19818B).f19965c) {
            return h10;
        }
        l02.g(c0477z.f8157a, this.f19818B);
        long a9 = c0477z.a() ? this.f19818B.a(c0477z.f8158b, c0477z.f8159c) : this.f19818B.f19966d;
        r0 b13 = h10.c(c0477z, h10.f20496r, h10.f20496r, h10.f20485d, a9 - h10.f20496r, h10.f20488h, h10.f20489i, h10.j).b(c0477z);
        b13.f20494p = a9;
        return b13;
    }

    public final Pair i0(L0 l02, int i7, long j) {
        if (l02.p()) {
            this.f19874x0 = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f19876y0 = j;
            return null;
        }
        if (i7 == -1 || i7 >= l02.o()) {
            i7 = l02.a(this.f19834S);
            j = n5.D.Z(l02.m(i7, (K0) this.f3094a, 0L).f20014A);
        }
        return l02.i((K0) this.f3094a, this.f19818B, i7, n5.D.M(j));
    }

    public final void j0(final int i7, final int i10) {
        n5.w wVar = this.f19858l0;
        if (i7 == wVar.f21233a && i10 == wVar.f21234b) {
            return;
        }
        this.f19858l0 = new n5.w(i7, i10);
        this.f19877z.e(24, new n5.i() { // from class: m4.v
            @Override // n5.i
            public final void invoke(Object obj) {
                ((v0) obj).A(i7, i10);
            }
        });
        o0(new n5.w(i7, i10), 2, 14);
    }

    public final void k0() {
        E0();
        boolean c02 = c0();
        int c10 = this.f19829N.c(2, c02);
        B0(c02, c10, (!c02 || c10 == 1) ? 1 : 2);
        r0 r0Var = this.f19872w0;
        if (r0Var.f20486e != 1) {
            return;
        }
        r0 e2 = r0Var.e(null);
        r0 g = e2.g(e2.f20482a.p() ? 4 : 2);
        this.f19835T++;
        n5.z zVar = this.f19875y.f19951v;
        zVar.getClass();
        n5.y b2 = n5.z.b();
        b2.f21236a = zVar.f21238a.obtainMessage(0);
        b2.b();
        C0(g, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void l0() {
        String str;
        boolean z8;
        k5.l lVar;
        AudioTrack audioTrack;
        int i7 = 1;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.19.1] [");
        sb2.append(n5.D.f21145e);
        sb2.append("] [");
        HashSet hashSet = AbstractC1556J.f19956a;
        synchronized (AbstractC1556J.class) {
            str = AbstractC1556J.f19957b;
        }
        sb2.append(str);
        sb2.append("]");
        AbstractC1705a.B("ExoPlayerImpl", sb2.toString());
        E0();
        int i10 = n5.D.f21141a;
        if (i10 < 21 && (audioTrack = this.f19848d0) != null) {
            audioTrack.release();
            this.f19848d0 = null;
        }
        this.f19828M.j(false);
        O0 o02 = this.f19830O;
        o02.f20119b = false;
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) o02.f20121d;
        if (wakeLock != null) {
            wakeLock.release();
        }
        O0 o03 = this.f19831P;
        o03.f20119b = false;
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) o03.f20121d;
        if (wifiLock != null) {
            wifiLock.release();
        }
        C1563d c1563d = this.f19829N;
        c1563d.f20333c = null;
        c1563d.a();
        C1555I c1555i = this.f19875y;
        synchronized (c1555i) {
            if (!c1555i.f19927M && c1555i.f19953x.getThread().isAlive()) {
                c1555i.f19951v.d(7);
                c1555i.f0(new C0465m(c1555i, i7), c1555i.f19924I);
                z8 = c1555i.f19927M;
            }
            z8 = true;
        }
        if (!z8) {
            this.f19877z.e(10, new C1265a(13));
        }
        this.f19877z.d();
        this.f19871w.f21238a.removeCallbacksAndMessages(null);
        InterfaceC1609f interfaceC1609f = this.f19823G;
        n4.f fVar = this.f19821E;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((C1621s) interfaceC1609f).f20650b.f8929b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1608e c1608e = (C1608e) it.next();
            if (c1608e.f20604b == fVar) {
                c1608e.f20605c = true;
                copyOnWriteArrayList.remove(c1608e);
            }
        }
        r0 r0Var = this.f19872w0;
        if (r0Var.f20493o) {
            this.f19872w0 = r0Var.a();
        }
        r0 g = this.f19872w0.g(1);
        this.f19872w0 = g;
        r0 b2 = g.b(g.f20483b);
        this.f19872w0 = b2;
        b2.f20494p = b2.f20496r;
        this.f19872w0.f20495q = 0L;
        n4.f fVar2 = this.f19821E;
        n5.z zVar = fVar2.f21093v;
        AbstractC1705a.n(zVar);
        zVar.c(new k1.a(fVar2, 4));
        k5.q qVar = (k5.q) this.f19869v;
        synchronized (qVar.f18955c) {
            if (i10 >= 32) {
                try {
                    C0330t c0330t = qVar.f18959h;
                    if (c0330t != null && (lVar = (k5.l) c0330t.f5202d) != null && ((Handler) c0330t.f5201c) != null) {
                        ((Spatializer) c0330t.f5200b).removeOnSpatializerStateChangedListener(lVar);
                        ((Handler) c0330t.f5201c).removeCallbacksAndMessages(null);
                        c0330t.f5201c = null;
                        c0330t.f5202d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        qVar.f18963a = null;
        qVar.f18964b = null;
        n0();
        Surface surface = this.f19852f0;
        if (surface != null) {
            surface.release();
            this.f19852f0 = null;
        }
        this.f19864r0 = a5.c.f12743b;
    }

    public final void m0(v0 v0Var) {
        E0();
        v0Var.getClass();
        n5.l lVar = this.f19877z;
        lVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = lVar.f21185d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            n5.k kVar = (n5.k) it.next();
            if (kVar.f21178a.equals(v0Var)) {
                kVar.f21181d = true;
                if (kVar.f21180c) {
                    kVar.f21180c = false;
                    n5.f d10 = kVar.f21179b.d();
                    lVar.f21184c.d(kVar.f21178a, d10);
                }
                copyOnWriteArraySet.remove(kVar);
            }
        }
    }

    public final void n0() {
        p5.l lVar = this.f19854h0;
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = this.f19827K;
        if (lVar != null) {
            z0 N10 = N(this.L);
            AbstractC1705a.m(!N10.g);
            N10.f20529d = 10000;
            AbstractC1705a.m(!N10.g);
            N10.f20530e = null;
            N10.c();
            this.f19854h0.f23101a.remove(surfaceHolderCallbackC1596z);
            this.f19854h0 = null;
        }
        TextureView textureView = this.f19856j0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC1596z) {
                AbstractC1705a.S("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f19856j0.setSurfaceTextureListener(null);
            }
            this.f19856j0 = null;
        }
        SurfaceHolder surfaceHolder = this.f19853g0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC1596z);
            this.f19853g0 = null;
        }
    }

    public final void o0(Object obj, int i7, int i10) {
        for (AbstractC1565e abstractC1565e : this.f19867u) {
            if (abstractC1565e.f20353b == i7) {
                z0 N10 = N(abstractC1565e);
                AbstractC1705a.m(!N10.g);
                N10.f20529d = i10;
                AbstractC1705a.m(!N10.g);
                N10.f20530e = obj;
                N10.c();
            }
        }
    }

    public final void p0(SurfaceHolder surfaceHolder) {
        this.f19855i0 = false;
        this.f19853g0 = surfaceHolder;
        surfaceHolder.addCallback(this.f19827K);
        Surface surface = this.f19853g0.getSurface();
        if (surface == null || !surface.isValid()) {
            j0(0, 0);
        } else {
            Rect surfaceFrame = this.f19853g0.getSurfaceFrame();
            j0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void q0(boolean z8) {
        E0();
        int c10 = this.f19829N.c(d0(), z8);
        int i7 = 1;
        if (z8 && c10 != 1) {
            i7 = 2;
        }
        B0(z8, c10, i7);
    }

    public final void r0(int i7) {
        E0();
        if (this.f19833R != i7) {
            this.f19833R = i7;
            n5.z zVar = this.f19875y.f19951v;
            zVar.getClass();
            n5.y b2 = n5.z.b();
            b2.f21236a = zVar.f21238a.obtainMessage(11, i7, 0);
            b2.b();
            C1591u c1591u = new C1591u(i7);
            n5.l lVar = this.f19877z;
            lVar.c(8, c1591u);
            A0();
            lVar.b();
        }
    }

    public final void s0(E0 e02) {
        E0();
        if (this.f19839X.equals(e02)) {
            return;
        }
        this.f19839X = e02;
        this.f19875y.f19951v.a(5, e02).b();
    }

    public final void t0(boolean z8) {
        E0();
        if (this.f19834S != z8) {
            this.f19834S = z8;
            n5.z zVar = this.f19875y.f19951v;
            zVar.getClass();
            n5.y b2 = n5.z.b();
            b2.f21236a = zVar.f21238a.obtainMessage(12, z8 ? 1 : 0, 0);
            b2.b();
            C1589s c1589s = new C1589s(0, z8);
            n5.l lVar = this.f19877z;
            lVar.c(9, c1589s);
            A0();
            lVar.b();
        }
    }

    public final void u0(k5.x xVar) {
        E0();
        k5.u uVar = this.f19869v;
        uVar.getClass();
        k5.q qVar = (k5.q) uVar;
        if (xVar.equals(qVar.d())) {
            return;
        }
        if (xVar instanceof k5.i) {
            qVar.i((k5.i) xVar);
        }
        C1429h c1429h = new C1429h(qVar.d());
        c1429h.b(xVar);
        qVar.i(new k5.i(c1429h));
        this.f19877z.e(19, new Q9.a(xVar, 20));
    }

    public final void v0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (AbstractC1565e abstractC1565e : this.f19867u) {
            if (abstractC1565e.f20353b == 2) {
                z0 N10 = N(abstractC1565e);
                AbstractC1705a.m(!N10.g);
                N10.f20529d = 1;
                AbstractC1705a.m(true ^ N10.g);
                N10.f20530e = obj;
                N10.c();
                arrayList.add(N10);
            }
        }
        Object obj2 = this.f19850e0;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z0) it.next()).a(this.f19832Q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z8 = true;
            }
            Object obj3 = this.f19850e0;
            Surface surface = this.f19852f0;
            if (obj3 == surface) {
                surface.release();
                this.f19852f0 = null;
            }
        }
        this.f19850e0 = obj;
        if (z8) {
            z0(new C1581m(2, new Db.d("Detaching surface timed out.", 11), 1003));
        }
    }

    public final void w0(SurfaceView surfaceView) {
        E0();
        if (surfaceView instanceof o5.n) {
            n0();
            v0(surfaceView);
            p0(surfaceView.getHolder());
            return;
        }
        boolean z8 = surfaceView instanceof p5.l;
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = this.f19827K;
        if (z8) {
            n0();
            this.f19854h0 = (p5.l) surfaceView;
            z0 N10 = N(this.L);
            AbstractC1705a.m(!N10.g);
            N10.f20529d = 10000;
            p5.l lVar = this.f19854h0;
            AbstractC1705a.m(true ^ N10.g);
            N10.f20530e = lVar;
            N10.c();
            this.f19854h0.f23101a.add(surfaceHolderCallbackC1596z);
            v0(this.f19854h0.getVideoSurface());
            p0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        E0();
        if (holder == null) {
            M();
            return;
        }
        n0();
        this.f19855i0 = true;
        this.f19853g0 = holder;
        holder.addCallback(surfaceHolderCallbackC1596z);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            v0(null);
            j0(0, 0);
        } else {
            v0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            j0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void x0(TextureView textureView) {
        E0();
        if (textureView == null) {
            M();
            return;
        }
        n0();
        this.f19856j0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC1705a.S("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f19827K);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            v0(null);
            j0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            v0(surface);
            this.f19852f0 = surface;
            j0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // C9.h
    public final void y(int i7, long j, boolean z8) {
        E0();
        AbstractC1705a.h(i7 >= 0);
        n4.f fVar = this.f19821E;
        if (!fVar.f21094w) {
            C1703a d10 = fVar.d();
            fVar.f21094w = true;
            fVar.Q(d10, -1, new G0(10));
        }
        L0 l02 = this.f19872w0.f20482a;
        if (l02.p() || i7 < l02.o()) {
            this.f19835T++;
            if (g0()) {
                AbstractC1705a.S("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1552F c1552f = new C1552F(this.f19872w0);
                c1552f.a(1);
                C1549C c1549c = this.f19873x.f20504a;
                c1549c.getClass();
                c1549c.f19871w.c(new Aa.j(20, c1549c, c1552f));
                return;
            }
            r0 r0Var = this.f19872w0;
            int i10 = r0Var.f20486e;
            if (i10 == 3 || (i10 == 4 && !l02.p())) {
                r0Var = this.f19872w0.g(2);
            }
            int U8 = U();
            r0 h02 = h0(r0Var, l02, i0(l02, i7, j));
            this.f19875y.f19951v.a(3, new C1554H(l02, i7, n5.D.M(j))).b();
            C0(h02, 0, 1, true, 1, X(h02), U8, z8);
        }
    }

    public final void y0() {
        E0();
        this.f19829N.c(1, c0());
        z0(null);
        this.f19864r0 = new a5.c(this.f19872w0.f20496r, N6.t0.f7341e);
    }

    public final void z0(C1581m c1581m) {
        r0 r0Var = this.f19872w0;
        r0 b2 = r0Var.b(r0Var.f20483b);
        b2.f20494p = b2.f20496r;
        b2.f20495q = 0L;
        r0 g = b2.g(1);
        if (c1581m != null) {
            g = g.e(c1581m);
        }
        r0 r0Var2 = g;
        this.f19835T++;
        n5.z zVar = this.f19875y.f19951v;
        zVar.getClass();
        n5.y b10 = n5.z.b();
        b10.f21236a = zVar.f21238a.obtainMessage(6);
        b10.b();
        C0(r0Var2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }
}
