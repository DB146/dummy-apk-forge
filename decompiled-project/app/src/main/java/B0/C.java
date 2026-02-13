package B0;

import Aa.j;
import C3.C0237c;
import F.C0257a;
import G3.C0283e;
import H2.C0304s;
import L7.AbstractC0382b;
import L7.B;
import L7.C0381a;
import L7.C0384d;
import L7.C0385e;
import W1.DialogInterfaceOnCancelListenerC0577u;
import Y5.C0598a0;
import Y5.C0604c0;
import Y5.C0610e0;
import Y5.C0613f0;
import Y5.C0615g;
import Y5.C0619h0;
import Y5.C0628k0;
import Y5.C0632l1;
import Y5.C0633m;
import Y5.C0638n1;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.D1;
import Y5.I1;
import Y5.M1;
import Y5.RunnableC0617g1;
import Y5.RunnableC0626j1;
import Y5.ServiceConnectionC0629k1;
import Y6.i;
import android.R;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import b6.C0844a;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.kt.apps.core.utils.blurry.BlurFactor;
import g3.C1191j;
import h7.C1256b;
import h7.C1257c;
import h7.C1259e;
import h7.C1260f;
import h7.k;
import j7.InterfaceC1385a;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o7.C1818h;
import o7.InterfaceC1811a;
import o7.r;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1570b;

    public C(I1 i12, C0283e c0283e) {
        this.f1569a = 20;
        Objects.requireNonNull(i12);
        this.f1570b = i12;
    }

    public C(C0604c0 c0604c0, boolean z8) {
        this.f1569a = 16;
        this.f1570b = c0604c0;
    }

    public C(ServiceConnectionC0629k1 serviceConnectionC0629k1) {
        this.f1569a = 17;
        Objects.requireNonNull(serviceConnectionC0629k1);
        this.f1570b = serviceConnectionC0629k1;
    }

    public /* synthetic */ C(Object obj, int i7) {
        this.f1569a = i7;
        this.f1570b = obj;
    }

    private final void a() {
        C0844a c0844a = (C0844a) this.f1570b;
        synchronized (c0844a.f13978a) {
            try {
                if (c0844a.b()) {
                    Log.e("WakeLock", String.valueOf(c0844a.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c0844a.d();
                    if (c0844a.b()) {
                        c0844a.f13980c = 1;
                        c0844a.e();
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        c2.u uVar = (c2.u) this.f1570b;
        if (uVar.f14237e && uVar.f14234b != null && uVar.f14238f && uVar.f14235c == null) {
            uVar.f14235c = new ProgressBar(uVar.f14234b.getContext(), null, R.attr.progressBarStyleLarge);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            uVar.f14234b.addView(uVar.f14235c, layoutParams);
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x025c, code lost:
    
        if (r5.p0() >= 242600) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v83, types: [Y5.D1, Y5.c] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.RuntimeException, U7.e] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.RuntimeException, U7.e] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c10;
        Socket d10;
        int i7 = 23;
        int i10 = 3;
        int i11 = 2;
        final int i12 = 1;
        switch (this.f1569a) {
            case 0:
                D d11 = (D) this.f1570b;
                d11.removeCallbacks(this);
                MotionEvent motionEvent = d11.f1585E0;
                if (motionEvent != null) {
                    r11 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r11 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i13 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    D d12 = (D) this.f1570b;
                    d12.I(motionEvent, i13, d12.f1587F0, false);
                    return;
                }
                return;
            case 1:
                C1.d dVar = (C1.d) this.f1570b;
                if (dVar.f2461C) {
                    boolean z8 = dVar.f2459A;
                    C1.a aVar = dVar.f2464a;
                    if (z8) {
                        dVar.f2459A = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f2454e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f2455f = currentAnimationTimeMillis;
                        aVar.f2456h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.f2457i) || !dVar.e()) {
                        dVar.f2461C = false;
                        return;
                    }
                    boolean z10 = dVar.f2460B;
                    ListView listView = dVar.f2466c;
                    if (z10) {
                        dVar.f2460B = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f2455f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - aVar.f2455f;
                    aVar.f2455f = currentAnimationTimeMillis2;
                    dVar.f2463E.scrollListBy((int) (((float) j) * ((a9 * 4.0f) + ((-4.0f) * a9 * a9)) * aVar.f2453d));
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                q3.i iVar = (q3.i) this.f1570b;
                iVar.getClass();
                while (true) {
                    try {
                        iVar.p((C0237c) ((ReferenceQueue) iVar.f23384c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 3:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1570b).f15486c.f2966u;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 4:
                if (((TaskCompletionSource) this.f1570b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 5:
                C0304s c0304s = (C0304s) this.f1570b;
                int i14 = c0304s.f4800A;
                ValueAnimator valueAnimator = c0304s.f4824z;
                if (i14 == 1) {
                    valueAnimator.cancel();
                } else if (i14 != 2) {
                    return;
                }
                c0304s.f4800A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.f1570b).X0();
                return;
            case 7:
                ((I1.c) this.f1570b).n(0);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                synchronized (this) {
                    ((J1.k) this.f1570b).f5432c = false;
                }
                while (true) {
                    Reference poll = J1.k.f5427A.poll();
                    if (poll == null) {
                        if (((J1.k) this.f1570b).f5434e.isAttachedToWindow()) {
                            ((J1.k) this.f1570b).d();
                            return;
                        }
                        View view = ((J1.k) this.f1570b).f5434e;
                        J1.h hVar = J1.k.f5428B;
                        view.removeOnAttachStateChangeListener(hVar);
                        ((J1.k) this.f1570b).f5434e.addOnAttachStateChangeListener(hVar);
                        return;
                    }
                    if (poll instanceof J1.l) {
                        ((J1.l) poll).a();
                    }
                }
            case 9:
                J7.r rVar = (J7.r) this.f1570b;
                rVar.f5614E = null;
                rVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (!rVar.d() || currentTimeMillis <= rVar.f5615F + 60000) {
                    rVar.b();
                    return;
                } else {
                    rVar.c("connection_idle");
                    return;
                }
            case 10:
                L7.j jVar = (L7.j) this.f1570b;
                L7.k kVar = (L7.k) jVar.f6356b;
                P3.p pVar = new P3.p(kVar.f6365a, kVar.f6367c, kVar.f6366b);
                C0384d c0384d = (C0384d) jVar.f6362i;
                q3.l c11 = c0384d.c();
                A7.a aVar2 = c0384d.f6329a;
                F8.a aVar3 = new F8.a(i11, c0384d.f6331c, c0384d.a());
                F8.a aVar4 = new F8.a(i11, c0384d.f6332d, c0384d.a());
                O7.b a10 = c0384d.a();
                String str = c0384d.g;
                Y6.i iVar2 = c0384d.f6336i;
                iVar2.b();
                o.Y0 y02 = new o.Y0(aVar2, aVar3, aVar4, a10, str, iVar2.f12043c.f12055b, ((Context) c0384d.c().f23391b).getApplicationContext().getDir("sslcache", 0).getAbsolutePath());
                c11.getClass();
                J7.r rVar2 = new J7.r(y02, pVar, jVar);
                ((Y6.i) c11.f23392c).a(new H7.f(rVar2));
                jVar.f6358d = rVar2;
                q3.e eVar = c0384d.f6331c;
                final O7.b bVar = (O7.b) c0384d.f6333e.f27b;
                final L7.f fVar = new L7.f(jVar);
                eVar.getClass();
                ((p7.n) eVar.f23376b).a(new InterfaceC1386a() { // from class: H7.a
                    @Override // j8.InterfaceC1386a
                    public final void f(InterfaceC1387b interfaceC1387b) {
                        r rVar3;
                        switch (i12) {
                            case 0:
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = bVar;
                                B b2 = fVar;
                                InterfaceC1385a interfaceC1385a = (InterfaceC1385a) interfaceC1387b.get();
                                b bVar2 = new b(scheduledThreadPoolExecutor, b2);
                                C1259e c1259e = (C1259e) interfaceC1385a;
                                c1259e.getClass();
                                c1259e.f17838c.add(bVar2);
                                k kVar2 = c1259e.f17841f;
                                int size = c1259e.f17839d.size() + c1259e.f17838c.size();
                                if (kVar2.f17864d == 0 && size > 0) {
                                    kVar2.f17864d = size;
                                    if (kVar2.a()) {
                                        C1260f c1260f = kVar2.f17861a;
                                        long j10 = kVar2.f17865e;
                                        kVar2.f17862b.getClass();
                                        c1260f.b(j10 - System.currentTimeMillis());
                                    }
                                } else if (kVar2.f17864d > 0 && size == 0) {
                                    kVar2.f17861a.a();
                                }
                                kVar2.f17864d = size;
                                C1256b c1256b = c1259e.f17845m;
                                if (c1256b != null) {
                                    long j11 = c1256b.f17830b + c1256b.f17831c;
                                    c1259e.k.getClass();
                                    if (j11 - System.currentTimeMillis() > 300000) {
                                        scheduledThreadPoolExecutor.execute(new j(2, b2, C1257c.a(c1259e.f17845m)));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = bVar;
                                B b10 = fVar;
                                InterfaceC1811a interfaceC1811a = (InterfaceC1811a) interfaceC1387b.get();
                                d dVar2 = new d(scheduledThreadPoolExecutor2, b10);
                                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1811a;
                                firebaseAuth.getClass();
                                firebaseAuth.f15830c.add(dVar2);
                                synchronized (firebaseAuth) {
                                    if (firebaseAuth.f15842r == null) {
                                        i iVar3 = firebaseAuth.f15828a;
                                        G.g(iVar3);
                                        firebaseAuth.f15842r = new r(iVar3);
                                    }
                                    rVar3 = firebaseAuth.f15842r;
                                }
                                int size2 = firebaseAuth.f15830c.size();
                                if (size2 > 0 && rVar3.f22105a == 0) {
                                    rVar3.f22105a = size2;
                                    if (rVar3.f22105a > 0 && !rVar3.f22107c) {
                                        rVar3.f22106b.a();
                                    }
                                } else if (size2 == 0 && rVar3.f22105a != 0) {
                                    C1818h c1818h = rVar3.f22106b;
                                    c1818h.f22092d.removeCallbacks(c1818h.f22093e);
                                }
                                rVar3.f22105a = size2;
                                return;
                        }
                    }
                });
                q3.c cVar = c0384d.f6332d;
                final O7.b bVar2 = (O7.b) c0384d.f6333e.f27b;
                final D5.i iVar3 = new D5.i(jVar, 22);
                cVar.getClass();
                ((p7.n) cVar.f23371b).a(new InterfaceC1386a() { // from class: H7.a
                    @Override // j8.InterfaceC1386a
                    public final void f(InterfaceC1387b interfaceC1387b) {
                        r rVar3;
                        switch (r3) {
                            case 0:
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = bVar2;
                                B b2 = iVar3;
                                InterfaceC1385a interfaceC1385a = (InterfaceC1385a) interfaceC1387b.get();
                                b bVar22 = new b(scheduledThreadPoolExecutor, b2);
                                C1259e c1259e = (C1259e) interfaceC1385a;
                                c1259e.getClass();
                                c1259e.f17838c.add(bVar22);
                                k kVar2 = c1259e.f17841f;
                                int size = c1259e.f17839d.size() + c1259e.f17838c.size();
                                if (kVar2.f17864d == 0 && size > 0) {
                                    kVar2.f17864d = size;
                                    if (kVar2.a()) {
                                        C1260f c1260f = kVar2.f17861a;
                                        long j10 = kVar2.f17865e;
                                        kVar2.f17862b.getClass();
                                        c1260f.b(j10 - System.currentTimeMillis());
                                    }
                                } else if (kVar2.f17864d > 0 && size == 0) {
                                    kVar2.f17861a.a();
                                }
                                kVar2.f17864d = size;
                                C1256b c1256b = c1259e.f17845m;
                                if (c1256b != null) {
                                    long j11 = c1256b.f17830b + c1256b.f17831c;
                                    c1259e.k.getClass();
                                    if (j11 - System.currentTimeMillis() > 300000) {
                                        scheduledThreadPoolExecutor.execute(new j(2, b2, C1257c.a(c1259e.f17845m)));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = bVar2;
                                B b10 = iVar3;
                                InterfaceC1811a interfaceC1811a = (InterfaceC1811a) interfaceC1387b.get();
                                d dVar2 = new d(scheduledThreadPoolExecutor2, b10);
                                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1811a;
                                firebaseAuth.getClass();
                                firebaseAuth.f15830c.add(dVar2);
                                synchronized (firebaseAuth) {
                                    if (firebaseAuth.f15842r == null) {
                                        i iVar32 = firebaseAuth.f15828a;
                                        G.g(iVar32);
                                        firebaseAuth.f15842r = new r(iVar32);
                                    }
                                    rVar3 = firebaseAuth.f15842r;
                                }
                                int size2 = firebaseAuth.f15830c.size();
                                if (size2 > 0 && rVar3.f22105a == 0) {
                                    rVar3.f22105a = size2;
                                    if (rVar3.f22105a > 0 && !rVar3.f22107c) {
                                        rVar3.f22106b.a();
                                    }
                                } else if (size2 == 0 && rVar3.f22105a != 0) {
                                    C1818h c1818h = rVar3.f22106b;
                                    c1818h.f22092d.removeCallbacks(c1818h.f22093e);
                                }
                                rVar3.f22105a = size2;
                                return;
                        }
                    }
                });
                ((J7.r) jVar.f6358d).o();
                N7.a aVar5 = new N7.a();
                D5.i iVar4 = new D5.i(23);
                iVar4.f3256b = T7.k.f9348e;
                jVar.f6359e = iVar4;
                jVar.f6360f = new Hc.e(9);
                Object obj = null;
                jVar.g = new A0.G0(obj, obj, new O7.j(), 27);
                jVar.f6363l = new L7.z(c0384d, new N7.a(), new C1191j(jVar, i7));
                jVar.f6364m = new L7.z(c0384d, aVar5, new L7.f(jVar));
                List<L7.D> emptyList = Collections.emptyList();
                HashMap B10 = com.bumptech.glide.c.B((C0257a) jVar.f6357c);
                long j10 = Long.MIN_VALUE;
                for (L7.D d13 : emptyList) {
                    q3.c cVar2 = new q3.c(14, jVar, d13);
                    long j11 = d13.f6312a;
                    if (j10 >= j11) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    boolean c12 = d13.c();
                    C0385e c0385e = d13.f6313b;
                    Q7.h hVar2 = (Q7.h) jVar.j;
                    long j12 = d13.f6312a;
                    if (c12) {
                        if (hVar2.H()) {
                            hVar2.p(A3.c.h("Restoring overwrite with id ", j12), null, new Object[0]);
                        }
                        ((J7.r) jVar.f6358d).e("p", c0385e.b(), d13.b().x(true), null, cVar2);
                        T7.s Z7 = com.bumptech.glide.c.Z(d13.b(), new q3.e(14, (L7.z) jVar.f6364m, c0385e), B10);
                        L7.z zVar = (L7.z) jVar.f6364m;
                        T7.s b2 = d13.b();
                        zVar.getClass();
                        O7.k.b("We shouldn't be persisting non-visible writes.", true);
                        c10 = zVar.g.c(new L7.u(zVar, c0385e, b2, d13.f6312a, Z7, 0));
                    } else {
                        if (hVar2.H()) {
                            hVar2.p(A3.c.h("Restoring merge with id ", j12), null, new Object[0]);
                        }
                        ((J7.r) jVar.f6358d).e("m", c0385e.b(), d13.a().D(), null, cVar2);
                        C0381a Y2 = com.bumptech.glide.c.Y(d13.a(), (L7.z) jVar.f6364m, c0385e, B10);
                        L7.z zVar2 = (L7.z) jVar.f6364m;
                        C0381a a11 = d13.a();
                        zVar2.getClass();
                        c10 = zVar2.g.c(new L7.u(zVar2, c0385e, a11, d13.f6312a, Y2, 1));
                    }
                    j10 = j11;
                }
                T7.c cVar3 = AbstractC0382b.f6324c;
                Boolean bool = Boolean.FALSE;
                jVar.j(cVar3, bool);
                jVar.j(AbstractC0382b.f6325d, bool);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                U7.d dVar2 = (U7.d) this.f1570b;
                dVar2.getClass();
                try {
                    try {
                        d10 = dVar2.d();
                    } finally {
                        dVar2.a();
                    }
                } catch (U7.e e2) {
                    dVar2.f9829c.t(e2);
                    dVar2.a();
                    return;
                } catch (Throwable th) {
                    dVar2.f9829c.t(new RuntimeException("error while connecting: " + th.getMessage(), th));
                    dVar2.a();
                    return;
                }
                synchronized (dVar2) {
                    dVar2.f9828b = d10;
                    if (dVar2.f9827a == 5) {
                        try {
                            dVar2.f9828b.close();
                            dVar2.f9828b = null;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(d10.getInputStream());
                        OutputStream outputStream = d10.getOutputStream();
                        outputStream.write(dVar2.f9833h.A());
                        byte[] bArr = new byte[1000];
                        ArrayList arrayList = new ArrayList();
                        boolean z11 = false;
                        int i15 = 0;
                        while (!z11) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                throw new RuntimeException("Connection closed before handshake was complete");
                            }
                            byte b10 = (byte) read;
                            bArr[i15] = b10;
                            int i16 = i15 + 1;
                            if (b10 == 10 && bArr[i15 - 1] == 13) {
                                String str2 = new String(bArr, U7.d.f9824m);
                                if (str2.trim().equals("")) {
                                    z11 = true;
                                } else {
                                    arrayList.add(str2.trim());
                                }
                                bArr = new byte[1000];
                                i15 = 0;
                            } else {
                                if (i16 == 1000) {
                                    throw new RuntimeException("Unexpected long line in handshake: " + new String(bArr, U7.d.f9824m));
                                }
                                i15 = i16;
                            }
                        }
                        Q7.h hVar3 = dVar2.f9833h;
                        String str3 = (String) arrayList.get(0);
                        hVar3.getClass();
                        Q7.h.a0(str3);
                        arrayList.remove(0);
                        HashMap hashMap = new HashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = ((String) it.next()).split(": ", 2);
                            String str4 = split[0];
                            Locale locale = Locale.US;
                            hashMap.put(str4.toLowerCase(locale), split[1].toLowerCase(locale));
                        }
                        dVar2.f9833h.getClass();
                        Q7.h.Z(hashMap);
                        U7.g gVar = dVar2.g;
                        gVar.getClass();
                        gVar.f9846f = Channels.newChannel(outputStream);
                        dVar2.f9832f.f9835a = dataInputStream;
                        dVar2.f9827a = 3;
                        dVar2.g.g.start();
                        q3.c cVar4 = dVar2.f9829c;
                        ((J7.w) cVar4.f23372c).f5653i.execute(new J7.v(cVar4, r11));
                        dVar2.f9832f.c();
                    }
                    dVar2.a();
                    return;
                }
            case 12:
                U7.g gVar2 = (U7.g) this.f1570b;
                gVar2.getClass();
                while (!gVar2.f9843c && !Thread.interrupted()) {
                    try {
                        gVar2.f9846f.write((ByteBuffer) gVar2.f9841a.take());
                    } catch (IOException e11) {
                        ?? runtimeException = new RuntimeException("IO Exception", e11);
                        U7.d dVar3 = gVar2.f9845e;
                        dVar3.f9829c.t(runtimeException);
                        if (dVar3.f9827a == 3) {
                            dVar3.a();
                        }
                        dVar3.b();
                        return;
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
                while (r11 < gVar2.f9841a.size()) {
                    gVar2.f9846f.write((ByteBuffer) gVar2.f9841a.take());
                    r11++;
                }
                return;
            case 13:
                DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u = (DialogInterfaceOnCancelListenerC0577u) this.f1570b;
                dialogInterfaceOnCancelListenerC0577u.f10557p0.onDismiss(dialogInterfaceOnCancelListenerC0577u.f10565x0);
                return;
            case 14:
                W1.C c13 = (W1.C) this.f1570b;
                if (c13.f10280X != null) {
                    c13.z().getClass();
                    return;
                }
                return;
            case 15:
                ((W1.U) this.f1570b).A(true);
                return;
            case 16:
                ((C0604c0) this.f1570b).f11683a.L();
                return;
            case 17:
                C0632l1 c0632l1 = ((ServiceConnectionC0629k1) this.f1570b).f11809c;
                c0632l1.U(new ComponentName(((C0646q0) c0632l1.f3094a).f11907a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 18:
                C0632l1 c0632l12 = ((ServiceConnectionC0629k1) ((E5.k) this.f1570b).f3697c).f11809c;
                C0640o0 c0640o0 = ((C0646q0) c0632l12.f3094a).f11913u;
                C0646q0.l(c0640o0);
                c0640o0.S(new RunnableC0626j1(c0632l12, r11));
                return;
            case 19:
                Y5.r1 r1Var = (Y5.r1) this.f1570b;
                Y5.t1 t1Var = (Y5.t1) r1Var.f11928c.f23377c;
                t1Var.J();
                C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
                Y5.W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11572A.a("Application going to the background");
                C0613f0 c0613f0 = c0646q0.f11911e;
                C0646q0.j(c0613f0);
                c0613f0.f11735G.b(true);
                t1Var.J();
                t1Var.f11947d = true;
                C0615g c0615g = c0646q0.f11910d;
                if (!c0615g.X()) {
                    long j13 = r1Var.f11927b;
                    A4.e eVar2 = t1Var.f11949f;
                    eVar2.a(j13, false, false);
                    ((Y5.s1) eVar2.f379c).c();
                }
                Y5.W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11583z.b(Long.valueOf(r1Var.f11926a), "Application backgrounded at: timestamp_millis");
                Y5.S0 s02 = c0646q0.f11890A;
                C0646q0.k(s02);
                s02.J();
                s02.K();
                C0646q0 c0646q02 = (C0646q0) s02.f3094a;
                C0632l1 o10 = c0646q02.o();
                o10.J();
                o10.K();
                if (o10.Q()) {
                    M1 m12 = ((C0646q0) o10.f3094a).f11915w;
                    C0646q0.j(m12);
                    break;
                }
                C0632l1 o11 = c0646q02.o();
                o11.J();
                o11.K();
                o11.X(new RunnableC0617g1(o11, o11.Z(true), i11));
                if (c0615g.T(null, Y5.F.f11279N0)) {
                    M1 m13 = c0646q0.f11915w;
                    C0646q0.j(m13);
                    Context context = c0646q0.f11907a;
                    long Q3 = m13.j0(context.getPackageName(), c0615g.f11754c) ? 1000L : c0615g.Q(context.getPackageName(), Y5.F.f11261E);
                    C0646q0.l(w11);
                    w11.f11573B.b(Long.valueOf(Q3), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    C0646q0.i(c0646q0.f11898I);
                    c0646q0.f11898I.N(Q3);
                    return;
                }
                return;
            case 20:
                I1 i17 = (I1) this.f1570b;
                i17.c().J();
                i17.f11413y = new C0619h0(i17);
                C0633m c0633m = new C0633m(i17);
                c0633m.L();
                i17.f11405c = c0633m;
                C0615g d02 = i17.d0();
                C0628k0 c0628k0 = i17.f11403a;
                com.google.android.gms.common.internal.G.g(c0628k0);
                d02.f11755d = c0628k0;
                C0638n1 c0638n1 = new C0638n1(i17);
                c0638n1.L();
                i17.f11411w = c0638n1;
                ?? d14 = new D1(i17);
                d14.L();
                i17.f11408f = d14;
                C0598a0 c0598a0 = new C0598a0(i17, i12);
                c0598a0.L();
                i17.f11410v = c0598a0;
                Y5.y1 y1Var = new Y5.y1(i17);
                y1Var.L();
                i17.f11407e = y1Var;
                i17.f11406d = new C0604c0(i17);
                if (i17.f11385F != i17.f11386G) {
                    i17.b().f11577f.c("Not all upload components initialized", Integer.valueOf(i17.f11385F), Integer.valueOf(i17.f11386G));
                }
                i17.f11380A.set(true);
                i17.b().f11573B.a("UploadController is now fully initialized");
                i17.c().J();
                C0633m c0633m2 = i17.f11405c;
                I1.S(c0633m2);
                c0633m2.T();
                C0633m c0633m3 = i17.f11405c;
                I1.S(c0633m3);
                c0633m3.J();
                c0633m3.K();
                if (c0633m3.u0()) {
                    Y5.E e12 = Y5.F.f11354v0;
                    if (((Long) e12.a(null)).longValue() != 0) {
                        SQLiteDatabase A02 = c0633m3.A0();
                        C0646q0 c0646q03 = (C0646q0) c0633m3.f3094a;
                        c0646q03.f11917y.getClass();
                        int delete = A02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(e12.a(null))});
                        if (delete > 0) {
                            Y5.W w12 = c0646q03.f11912f;
                            C0646q0.l(w12);
                            w12.f11573B.b(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (i17.f11411w.f11854v.f() == 0) {
                    C0610e0 c0610e0 = i17.f11411w.f11854v;
                    ((M5.b) i17.e()).getClass();
                    c0610e0.g(System.currentTimeMillis());
                }
                i17.L();
                return;
            case 21:
                C0646q0 c0646q04 = (C0646q0) ((F6.j) this.f1570b).f4156b;
                C0646q0.i(c0646q04.f11898I);
                c0646q04.f11898I.N(((Long) Y5.F.f11259D.a(null)).longValue());
                return;
            case 22:
                C0646q0 c0646q05 = (C0646q0) this.f1570b;
                M1 m14 = c0646q05.f11915w;
                C0646q0.j(m14);
                m14.J();
                if (m14.e0() != 1) {
                    Y5.W w13 = c0646q05.f11912f;
                    C0646q0.l(w13);
                    w13.f11580w.a("registerTrigger called but app not eligible");
                    return;
                }
                Y5.S0 s03 = c0646q05.f11890A;
                C0646q0.k(s03);
                s03.J();
                Y5.I0 i02 = s03.f11559z;
                if (i02 != null) {
                    i02.c();
                }
                C0646q0.k(s03);
                new Thread(new Y5.H0(s03, i10)).start();
                return;
            case 23:
                a();
                return;
            case 24:
                ((c2.b) this.f1570b).f14131b.d();
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                b();
                return;
            case 26:
                com.bumptech.glide.n nVar = (com.bumptech.glide.n) this.f1570b;
                nVar.f14698c.j(nVar);
                return;
            case 27:
                ((com.google.android.gms.common.api.internal.E) this.f1570b).e();
                return;
            case 28:
                com.google.android.gms.common.api.g gVar3 = ((com.google.android.gms.common.api.internal.E) ((R7.b) this.f1570b).f8929b).f14918b;
                gVar3.disconnect(gVar3.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((com.google.android.gms.common.api.internal.N) this.f1570b).j.d(new F5.b(4));
                return;
        }
    }
}
