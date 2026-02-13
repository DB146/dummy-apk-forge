package R7;

import Db.j;
import Db.o;
import L7.C0385e;
import M1.C0386a;
import M9.t;
import O7.k;
import P4.b0;
import S4.h;
import T7.q;
import T7.s;
import U5.C0556y;
import W1.C;
import W1.P;
import W1.U;
import W4.C0588f;
import W4.p;
import W4.r;
import X6.f;
import Y5.C0;
import Y5.C0613f0;
import Y5.C0628k0;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.EnumC0663z0;
import Y5.F;
import Y5.I1;
import Y5.S0;
import Y5.W;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.internal.InterfaceC0989e;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import f.C1117a;
import f.InterfaceC1118b;
import gb.i;
import ia.C1357c;
import j9.C1388a;
import java.io.IOException;
import java.net.BindException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.J;
import n.InterfaceC1689w;
import n.MenuC1678l;
import n.SubMenuC1666D;
import n5.AbstractC1705a;
import n5.D;
import o.C1740j;
import o.InterfaceC1746m;
import o4.AbstractC1789c;
import o4.AbstractC1790d;
import o4.C1791e;
import o7.C1818h;
import ob.C1833a;
import ob.C1837e;
import ob.m;
import q3.n;
import s4.InterfaceC1984l;
import s4.v;
import sb.g;
import y.S;
import y1.InterfaceC2366n;
import y1.p0;

/* loaded from: classes.dex */
public final class b implements e, InterfaceC0978t, InterfaceC1118b, InterfaceC1984l, InterfaceC1601E, b0, zzr, InterfaceC1394e, InterfaceC0989e, InterfaceC1393d, InterfaceC2366n, InterfaceC1689w, InterfaceC1746m, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8928a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8929b;

    public b(int i7) {
        this.f8928a = i7;
        switch (i7) {
            case 5:
                this.f8929b = new LinkedHashMap(5, 1.0f, false);
                return;
            case 18:
                return;
            case 23:
                this.f8929b = C1388a.f18670e;
                return;
            case 24:
                this.f8929b = new CopyOnWriteArrayList();
                return;
            default:
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    this.f8929b = keyStore;
                    return;
                } catch (IOException | GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }

    public /* synthetic */ b(T5.a aVar, C0556y c0556y) {
        this.f8928a = 3;
        this.f8929b = c0556y;
    }

    public b(I1 i12) {
        this.f8928a = 13;
        Objects.requireNonNull(i12);
        this.f8929b = i12;
    }

    public b(S0 s02) {
        this.f8928a = 12;
        Objects.requireNonNull(s02);
        this.f8929b = s02;
    }

    public b(C0628k0 c0628k0) {
        this.f8928a = 11;
        Objects.requireNonNull(c0628k0);
        this.f8929b = c0628k0;
    }

    public b(EditText editText) {
        this.f8928a = 2;
        this.f8929b = new q3.c(editText);
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.f8928a = i7;
        this.f8929b = obj;
    }

    public b(C1791e c1791e) {
        this.f8928a = 28;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1791e.f21839a).setFlags(c1791e.f21840b).setUsage(c1791e.f21841c);
        int i7 = D.f21141a;
        if (i7 >= 29) {
            AbstractC1789c.a(usage, c1791e.f21842d);
        }
        if (i7 >= 32) {
            AbstractC1790d.a(usage, c1791e.f21843e);
        }
        this.f8929b = usage.build();
    }

    public static void o(String str) {
        if (new b(4).r(str)) {
            throw new IllegalArgumentException(S.b("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
        }
        String a9 = f.a(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(a9, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    private final void s(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
    }

    public static b z(String str) {
        return new b((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC0663z0.UNINITIALIZED : C0.e(str.charAt(0)), 10);
    }

    public boolean A() {
        if (!B()) {
            return false;
        }
        C0646q0 c0646q0 = (C0646q0) this.f8929b;
        c0646q0.f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        return currentTimeMillis - c0613f0.L.f() > c0646q0.f11910d.Q(null, F.f11330j0);
    }

    public boolean B() {
        C0613f0 c0613f0 = ((C0646q0) this.f8929b).f11911e;
        C0646q0.j(c0613f0);
        return c0613f0.L.f() > 0;
    }

    @Override // n.InterfaceC1689w
    public void a(MenuC1678l menuC1678l, boolean z8) {
        if (menuC1678l instanceof SubMenuC1666D) {
            ((SubMenuC1666D) menuC1678l).f20879N.k().c(false);
        }
        InterfaceC1689w interfaceC1689w = ((C1740j) this.f8929b).f21519e;
        if (interfaceC1689w != null) {
            interfaceC1689w.a(menuC1678l, z8);
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        TVChannelLinkStream it = (TVChannelLinkStream) obj;
        l.e(it, "it");
        o oVar = X9.a.f11017a;
        TVChannel tVChannel = (TVChannel) this.f8929b;
        ((FirebaseAnalytics) X9.a.f11017a.getValue()).a("GetLinkM3u8Video", com.bumptech.glide.c.f(new j("channel", tVChannel.getTvChannelName()), new j("sourceFrom", tVChannel.getSourceFrom())));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
    public void accept(Object obj, Object obj2) {
        ((zzs) ((zzp) obj).getService()).zzc(new T5.b((TaskCompletionSource) obj2), (C0556y) this.f8929b);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        int i7 = 21;
        int i10 = 1;
        int i11 = 0;
        switch (this.f8928a) {
            case 15:
                i it = (i) obj;
                l.e(it, "it");
                return new g(it, new C0386a((AtomicInteger) this.f8929b), 6);
            case 19:
                l.e((Throwable) obj, "it");
                return (m) this.f8929b;
            default:
                M9.d extensionsConfig = (M9.d) obj;
                l.e(extensionsConfig, "extensionsConfig");
                M9.c cVar = M9.c.f6847b;
                M9.c cVar2 = extensionsConfig.f6852c;
                C1357c c1357c = C1357c.f18483c;
                AutoRefreshExtensionsChannelWorker autoRefreshExtensionsChannelWorker = (AutoRefreshExtensionsChannelWorker) this.f8929b;
                if (cVar2 != cVar) {
                    t tVar = autoRefreshExtensionsChannelWorker.g;
                    Pattern pattern = t.f6903i;
                    return new C1833a(i10, tVar.i(extensionsConfig), c1357c).a(new F8.a(i7, autoRefreshExtensionsChannelWorker, extensionsConfig));
                }
                U9.d y10 = ((RoomDataBase) autoRefreshExtensionsChannelWorker.f16176h.getValue()).y();
                y10.getClass();
                String sourceId = extensionsConfig.f6851b;
                l.e(sourceId, "sourceId");
                C1837e g = android.support.v4.media.session.b.g(y10.f9854a, new U9.b(sourceId, i11));
                Pattern pattern2 = t.f6903i;
                return new C1833a(i11, g, new C1833a(i10, autoRefreshExtensionsChannelWorker.g.i(extensionsConfig), c1357c).a(new F8.a(i7, autoRefreshExtensionsChannelWorker, extensionsConfig)));
        }
    }

    @Override // R7.e
    public T7.m b(T7.m mVar, T7.c cVar, s sVar, C0385e c0385e, d dVar, a aVar) {
        k.b("The index must match the filter", mVar.f9352c == ((T7.l) this.f8929b));
        s sVar2 = mVar.f9350a;
        s h10 = sVar2.h(cVar);
        if (h10.k(c0385e).equals(sVar.k(c0385e)) && h10.isEmpty() == sVar.isEmpty()) {
            return mVar;
        }
        if (aVar != null) {
            boolean isEmpty = sVar.isEmpty();
            T7.t tVar = T7.t.f9361a;
            if (isEmpty) {
                if (sVar2.n(cVar)) {
                    aVar.G(new Q7.c(1, new T7.m(h10, tVar), cVar, null));
                } else {
                    k.b("A child remove without an old child only makes sense on a leaf node", sVar2.p());
                }
            } else if (h10.isEmpty()) {
                aVar.G(new Q7.c(2, new T7.m(sVar, tVar), cVar, null));
            } else {
                aVar.G(new Q7.c(4, new T7.m(sVar, tVar), cVar, new T7.m(h10, tVar)));
            }
        }
        return (sVar2.p() && sVar.isEmpty()) ? mVar : mVar.i(cVar, sVar);
    }

    @Override // R7.e
    public b c() {
        return this;
    }

    @Override // R7.e
    public T7.m d(T7.m mVar, T7.m mVar2, a aVar) {
        T7.t tVar;
        s<q> sVar;
        k.b("Can't use IndexedNode that doesn't have filter's index", mVar2.f9352c == ((T7.l) this.f8929b));
        if (aVar != null) {
            Iterator it = mVar.f9350a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                tVar = T7.t.f9361a;
                sVar = mVar2.f9350a;
                if (!hasNext) {
                    break;
                }
                q qVar = (q) it.next();
                if (!sVar.n(qVar.f9359a)) {
                    aVar.G(new Q7.c(1, new T7.m(qVar.f9360b, tVar), qVar.f9359a, null));
                }
            }
            if (!sVar.p()) {
                for (q qVar2 : sVar) {
                    T7.c cVar = qVar2.f9359a;
                    s sVar2 = mVar.f9350a;
                    boolean n6 = sVar2.n(cVar);
                    s sVar3 = qVar2.f9360b;
                    T7.c cVar2 = qVar2.f9359a;
                    if (n6) {
                        s h10 = sVar2.h(cVar2);
                        if (!h10.equals(sVar3)) {
                            aVar.G(new Q7.c(4, new T7.m(sVar3, tVar), cVar2, new T7.m(h10, tVar)));
                        }
                    } else {
                        aVar.G(new Q7.c(2, new T7.m(sVar3, tVar), cVar2, null));
                    }
                }
            }
        }
        return mVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [A3.e, java.io.IOException] */
    @Override // m5.InterfaceC1601E
    public D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        switch (this.f8928a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C0588f c0588f = (C0588f) interfaceC1603G;
                W4.s sVar = (W4.s) this.f8929b;
                if (!sVar.f10765G) {
                    sVar.f10779y = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i10 = sVar.f10767I;
                    sVar.f10767I = i10 + 1;
                    if (i10 < 3) {
                        return J.f20549d;
                    }
                } else {
                    sVar.f10780z = new IOException(c0588f.f10681b.f10791b.toString(), iOException);
                }
                return J.f20550e;
            default:
                h hVar = ((S4.d) this.f8929b).f9081a;
                hVar.getClass();
                AbstractC1705a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
                hVar.y(true);
                return J.f20550e;
        }
    }

    @Override // s4.InterfaceC1984l
    public void f() {
        W4.s sVar = (W4.s) this.f8929b;
        sVar.f10770b.post(new p(sVar, 0));
    }

    @Override // R7.e
    public T7.m g(T7.m mVar, s sVar) {
        return mVar.f9350a.isEmpty() ? mVar : new T7.m(mVar.f9350a.s(sVar), mVar.f9352c, mVar.f9351b);
    }

    @Override // R7.e
    public T7.l getIndex() {
        return (T7.l) this.f8929b;
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        C1117a c1117a = (C1117a) obj;
        U u3 = (U) this.f8929b;
        P p10 = (P) u3.f10345F.pollLast();
        if (p10 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        n nVar = u3.f10357c;
        String str = p10.f10334a;
        C e2 = nVar.e(str);
        if (e2 != null) {
            e2.P(p10.f10335b, c1117a.f16903a, c1117a.f16904b);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    @Override // s4.InterfaceC1984l
    public void i(s4.s sVar) {
    }

    @Override // n.InterfaceC1689w
    public boolean j(MenuC1678l menuC1678l) {
        C1740j c1740j = (C1740j) this.f8929b;
        if (menuC1678l == c1740j.f21517c) {
            return false;
        }
        ((SubMenuC1666D) menuC1678l).f20880O.getClass();
        c1740j.getClass();
        InterfaceC1689w interfaceC1689w = c1740j.f21519e;
        if (interfaceC1689w != null) {
            return interfaceC1689w.j(menuC1678l);
        }
        return false;
    }

    @Override // R7.e
    public boolean k() {
        return false;
    }

    @Override // y1.InterfaceC2366n
    public p0 l(View view, p0 p0Var) {
        i6.h hVar = (i6.h) this.f8929b;
        i6.g gVar = hVar.f18448A;
        if (gVar != null) {
            hVar.f18452f.f15202W.remove(gVar);
        }
        i6.g gVar2 = new i6.g(hVar.f18455w, p0Var);
        hVar.f18448A = gVar2;
        gVar2.e(hVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = hVar.f18452f;
        i6.g gVar3 = hVar.f18448A;
        ArrayList arrayList = bottomSheetBehavior.f15202W;
        if (!arrayList.contains(gVar3)) {
            arrayList.add(gVar3);
        }
        return p0Var;
    }

    @Override // m5.InterfaceC1601E
    public void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        switch (this.f8928a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return;
            default:
                return;
        }
    }

    public int n(int[] iArr, int i7) {
        int[] iArr2;
        X8.a aVar;
        int[] iArr3;
        int i10;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i11 = 1;
            while (i11 < length && iArr[i11] == 0) {
                i11++;
            }
            if (i11 == length) {
                iArr2 = new int[]{0};
            } else {
                int i12 = length - i11;
                int[] iArr4 = new int[i12];
                System.arraycopy(iArr, i11, iArr4, 0, i12);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i7];
        boolean z8 = true;
        int i13 = 0;
        while (true) {
            aVar = (X8.a) this.f8929b;
            if (i13 >= i7) {
                break;
            }
            int i14 = aVar.f11009a[aVar.g + i13];
            if (i14 == 0) {
                i10 = iArr2[iArr2.length - 1];
            } else if (i14 == 1) {
                int i15 = 0;
                for (int i16 : iArr2) {
                    X8.a aVar2 = X8.a.f11003h;
                    i15 ^= i16;
                }
                i10 = i15;
            } else {
                int i17 = iArr2[0];
                int length2 = iArr2.length;
                for (int i18 = 1; i18 < length2; i18++) {
                    i17 = aVar.c(i14, i17) ^ iArr2[i18];
                }
                i10 = i17;
            }
            iArr5[(i7 - 1) - i13] = i10;
            if (i10 != 0) {
                z8 = false;
            }
            i13++;
        }
        if (z8) {
            return 0;
        }
        X8.b bVar = new X8.b(aVar, iArr5);
        X8.b a9 = aVar.a(i7, 1);
        if (a9.d() >= bVar.d()) {
            a9 = bVar;
            bVar = a9;
        }
        X8.b bVar2 = aVar.f11011c;
        X8.b bVar3 = aVar.f11012d;
        X8.b bVar4 = bVar2;
        X8.b bVar5 = a9;
        X8.b bVar6 = bVar;
        X8.b bVar7 = bVar5;
        while (bVar7.d() * 2 >= i7) {
            if (bVar7.e()) {
                throw new Exception("r_{i-1} was zero");
            }
            int b2 = aVar.b(bVar7.c(bVar7.d()));
            X8.b bVar8 = bVar2;
            while (bVar6.d() >= bVar7.d() && !bVar6.e()) {
                int d10 = bVar6.d() - bVar7.d();
                int c10 = aVar.c(bVar6.c(bVar6.d()), b2);
                bVar8 = bVar8.a(aVar.a(d10, c10));
                bVar6 = bVar6.a(bVar7.h(d10, c10));
            }
            X8.b a10 = bVar8.g(bVar3).a(bVar4);
            if (bVar6.d() >= bVar7.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar6 + ", rLast: " + bVar7);
            }
            X8.b bVar9 = bVar6;
            bVar6 = bVar7;
            bVar7 = bVar9;
            bVar4 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new Exception("sigmaTilde(0) was zero");
        }
        int b10 = aVar.b(c11);
        X8.b[] bVarArr = {bVar3.f(b10), bVar7.f(b10)};
        X8.b bVar10 = bVarArr[0];
        X8.b bVar11 = bVarArr[1];
        int d11 = bVar10.d();
        if (d11 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d11];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.f11013e && i19 < d11; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d11) {
                throw new Exception("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b11 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b11);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b11), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b11);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.f11010b[i25];
            if (i26 < 0) {
                throw new Exception("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof Y6.l) {
            I5.a aVar = C1818h.f22088f;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            C1818h c1818h = (C1818h) ((hc.i) this.f8929b).f17949c;
            int i7 = (int) c1818h.f22090b;
            c1818h.f22090b = (i7 == 30 || i7 == 60 || i7 == 120 || i7 == 240 || i7 == 480) ? 2 * c1818h.f22090b : i7 != 960 ? 30L : 960L;
            c1818h.f22089a = (c1818h.f22090b * 1000) + System.currentTimeMillis();
            aVar.e(A3.c.h("Scheduling refresh for ", c1818h.f22089a), new Object[0]);
            c1818h.f22092d.postDelayed(c1818h.f22093e, c1818h.f22090b * 1000);
        }
    }

    @Override // P4.b0
    public void p() {
        W4.s sVar = (W4.s) this.f8929b;
        sVar.f10770b.post(new p(sVar, 1));
    }

    public synchronized a q(String str) {
        a aVar;
        byte[] w10;
        aVar = new a(f.a(str), (KeyStore) this.f8929b);
        byte[] bArr = new byte[10];
        ((SecureRandom) X6.e.f11001a.get()).nextBytes(bArr);
        byte[] bArr2 = new byte[0];
        try {
            w10 = aVar.w(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("a", "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            w10 = aVar.w(bArr, bArr2);
        }
        if (!Arrays.equals(bArr, aVar.q(w10, bArr2))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return aVar;
    }

    public synchronized boolean r(String str) {
        String a9;
        a9 = f.a(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("b", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f8929b = keyStore;
                keyStore.load(null);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            } catch (InterruptedException unused2) {
            }
            return ((KeyStore) this.f8929b).containsAlias(a9);
        }
        return ((KeyStore) this.f8929b).containsAlias(a9);
    }

    @Override // m5.InterfaceC1601E
    public void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        boolean z8;
        switch (this.f8928a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C0588f c0588f = (C0588f) interfaceC1603G;
                W4.s sVar = (W4.s) this.f8929b;
                if (sVar.n() == 0) {
                    if (sVar.f10768J) {
                        return;
                    }
                    W4.s.w(sVar);
                    return;
                }
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = sVar.f10773e;
                    if (i7 < arrayList.size()) {
                        r rVar = (r) arrayList.get(i7);
                        if (rVar.f10753a.f10750b == c0588f) {
                            rVar.a();
                        } else {
                            i7++;
                        }
                    }
                }
                sVar.f10772d.f10729B = 1;
                return;
            default:
                S4.d dVar = (S4.d) this.f8929b;
                synchronized (AbstractC1705a.f21159i) {
                    z8 = AbstractC1705a.j;
                }
                if (z8) {
                    dVar.b();
                    return;
                }
                IOException iOException = new IOException(new ConcurrentModificationException());
                h hVar = dVar.f9081a;
                hVar.getClass();
                AbstractC1705a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
                hVar.y(true);
                return;
        }
    }

    @Override // s4.InterfaceC1984l
    public v u(int i7, int i10) {
        r rVar = (r) ((W4.s) this.f8929b).f10773e.get(i7);
        rVar.getClass();
        return rVar.f10755c;
    }

    public void v(A3.e eVar) {
        boolean z8 = eVar instanceof W4.t;
        W4.s sVar = (W4.s) this.f8929b;
        if (!z8 || sVar.f10768J) {
            sVar.f10780z = eVar;
        } else {
            W4.s.w(sVar);
        }
    }

    public void w(String str, IOException iOException) {
        ((W4.s) this.f8929b).f10779y = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    public void x(String str, String str2, Bundle bundle) {
        switch (this.f8928a) {
            case 12:
                boolean isEmpty = TextUtils.isEmpty(str);
                S0 s02 = (S0) this.f8929b;
                if (!isEmpty) {
                    s02.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
                ((C0646q0) s02.f3094a).f11917y.getClass();
                s02.O("auto", "_err", bundle, true, true, System.currentTimeMillis());
                return;
            default:
                boolean isEmpty2 = TextUtils.isEmpty(str);
                I1 i12 = (I1) this.f8929b;
                if (!isEmpty2) {
                    i12.c().S(new L7.i(this, str, str2, bundle));
                    return;
                }
                C0646q0 c0646q0 = i12.f11414z;
                if (c0646q0 != null) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.b(str2, "AppId not known when logging event");
                    return;
                }
                return;
        }
    }

    public void y(String str, Bundle bundle) {
        String uri;
        C0646q0 c0646q0 = (C0646q0) this.f8929b;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        if (c0646q0.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        c0613f0.f11739K.u(uri);
        c0646q0.f11917y.getClass();
        c0613f0.L.g(System.currentTimeMillis());
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public void zza(int i7, String str, List list, boolean z8, boolean z10) {
        Y5.U u3;
        int i10 = i7 - 1;
        C0628k0 c0628k0 = (C0628k0) this.f8929b;
        if (i10 == 0) {
            W w10 = ((C0646q0) c0628k0.f3094a).f11912f;
            C0646q0.l(w10);
            u3 = w10.f11572A;
        } else if (i10 != 1) {
            if (i10 == 3) {
                W w11 = ((C0646q0) c0628k0.f3094a).f11912f;
                C0646q0.l(w11);
                u3 = w11.f11573B;
            } else if (i10 != 4) {
                W w12 = ((C0646q0) c0628k0.f3094a).f11912f;
                C0646q0.l(w12);
                u3 = w12.f11583z;
            } else if (z8) {
                W w13 = ((C0646q0) c0628k0.f3094a).f11912f;
                C0646q0.l(w13);
                u3 = w13.f11581x;
            } else if (z10) {
                W w14 = ((C0646q0) c0628k0.f3094a).f11912f;
                C0646q0.l(w14);
                u3 = w14.f11580w;
            } else {
                W w15 = ((C0646q0) c0628k0.f3094a).f11912f;
                C0646q0.l(w15);
                u3 = w15.f11582y;
            }
        } else if (z8) {
            W w16 = ((C0646q0) c0628k0.f3094a).f11912f;
            C0646q0.l(w16);
            u3 = w16.f11578u;
        } else if (z10) {
            W w17 = ((C0646q0) c0628k0.f3094a).f11912f;
            C0646q0.l(w17);
            u3 = w17.f11577f;
        } else {
            W w18 = ((C0646q0) c0628k0.f3094a).f11912f;
            C0646q0.l(w18);
            u3 = w18.f11579v;
        }
        int size = list.size();
        if (size == 1) {
            u3.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            u3.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u3.a(str);
        } else {
            u3.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
