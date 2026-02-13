package R7;

import C3.x;
import H2.O;
import I2.I;
import N6.C0448v;
import N6.r;
import O7.k;
import P1.g;
import P4.C0463k;
import P8.f;
import Q7.h;
import S4.i;
import T4.j;
import T7.m;
import W1.P;
import W1.U;
import W6.D;
import W6.p;
import W6.q;
import W6.t;
import W6.v;
import W6.w;
import W6.y;
import Y5.B0;
import Y5.C0613f0;
import Y5.C0646q0;
import Y5.EnumC0618h;
import Y5.G0;
import Y5.S0;
import Y5.W;
import Y5.t1;
import Z9.s;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1016j;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import da.C1064b;
import da.C1065c;
import f.InterfaceC1118b;
import g3.C1191j;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.J;
import n.InterfaceC1689w;
import n.MenuC1678l;
import q3.n;
import y.S;
import y1.K;
import z1.o;

/* loaded from: classes.dex */
public final class a implements i, InterfaceC1118b, InterfaceC1601E, InterfaceC1394e, InterfaceC1393d, o, InterfaceC1689w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8926a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8927b;

    public a(int i7) {
        this.f8926a = i7;
        switch (i7) {
            case 7:
                this.f8927b = new SparseArray();
                return;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                this.f8927b = null;
                return;
            case 10:
                this.f8927b = new C1191j(29);
                return;
            case 13:
                this.f8927b = new EnumMap(B0.class);
                return;
            case 17:
                this.f8927b = new b(X8.a.f11006m, 9);
                return;
            case 19:
                return;
            default:
                this.f8927b = new HashMap();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i7, String str, String str2) {
        this(10);
        this.f8926a = 10;
        f("User-Agent", str);
        f("CSeq", String.valueOf(i7));
        if (str2 != null) {
            f("Session", str2);
        }
    }

    public a(x xVar) {
        this.f8926a = 21;
        this.f8927b = Collections.unmodifiableMap(new HashMap(xVar.f2640a));
    }

    public a(I i7, Class cls) {
        this.f8926a = 1;
        if (!((Map) i7.f5049b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(A3.c.j("Given internalKeyMananger ", i7.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f8927b = i7;
    }

    public a(C0646q0 c0646q0, G0 g02) {
        this.f8926a = 15;
        this.f8927b = c0646q0;
    }

    public a(t1 t1Var) {
        this.f8926a = 16;
        Objects.requireNonNull(t1Var);
        this.f8927b = t1Var;
    }

    public a(Context context) {
        this.f8926a = 5;
        this.f8927b = context.getApplicationContext().getSharedPreferences("core-google-shortcuts.PREF_FILE_NAME", 0).edit();
    }

    public a(RoomDataBase roomDataBase) {
        this.f8926a = 24;
        l.e(roomDataBase, "roomDataBase");
        this.f8927b = roomDataBase;
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.f8926a = i7;
        this.f8927b = obj;
    }

    public a(String str, KeyStore keyStore) {
        this.f8926a = 4;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f8927b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(X.c.t("Keystore cannot load the key with ID: ", str));
        }
    }

    public a(EnumMap enumMap) {
        this.f8926a = 13;
        EnumMap enumMap2 = new EnumMap(B0.class);
        this.f8927b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static int F() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i7 = 0;
        while (i7 == 0) {
            secureRandom.nextBytes(bArr);
            i7 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i7;
    }

    public boolean A() {
        return ((o2.d) this.f8927b) == null;
    }

    public synchronized boolean B(int i7) {
        Iterator it = Collections.unmodifiableList(((y) ((v) this.f8927b).f15819b).q()).iterator();
        while (it.hasNext()) {
            if (((W6.x) it.next()).r() == i7) {
                return true;
            }
        }
        return false;
    }

    public synchronized W6.x C(t tVar) {
        q c10;
        int F10;
        try {
            c10 = S6.g.c(tVar);
            synchronized (this) {
                F10 = F();
                while (B(F10)) {
                    F10 = F();
                }
            }
            return (W6.x) r2.a();
        } catch (Throwable th) {
            throw th;
        }
        D p10 = tVar.p();
        if (p10 == D.UNKNOWN_PREFIX) {
            p10 = D.TINK;
        }
        w v10 = W6.x.v();
        v10.c();
        W6.x.m((W6.x) v10.f15819b, c10);
        v10.c();
        W6.x.p((W6.x) v10.f15819b, F10);
        v10.c();
        W6.x.o((W6.x) v10.f15819b);
        v10.c();
        W6.x.n((W6.x) v10.f15819b, p10);
        return (W6.x) v10.a();
    }

    public q D(AbstractC1014h abstractC1014h) {
        I i7 = (I) this.f8927b;
        try {
            S6.a h10 = i7.h();
            AbstractC1007a b2 = h10.b(abstractC1014h);
            h10.c(b2);
            AbstractC1007a abstractC1007a = (AbstractC1007a) h10.a(b2);
            W6.o t5 = q.t();
            String g = i7.g();
            t5.c();
            q.m((q) t5.f15819b, g);
            try {
                int a9 = abstractC1007a.a();
                byte[] bArr = new byte[a9];
                C1016j c1016j = new C1016j(bArr, a9);
                abstractC1007a.d(c1016j);
                if (c1016j.f15791c - c1016j.f15792d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C1013g c1013g = new C1013g(bArr);
                t5.c();
                q.n((q) t5.f15819b, c1013g);
                p pVar = p.SYMMETRIC;
                t5.c();
                q.o((q) t5.f15819b, pVar);
                return (q) t5.a();
            } catch (IOException e2) {
                throw new RuntimeException(abstractC1007a.b("ByteString"), e2);
            }
        } catch (C e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public void E(View view, int i7, boolean z8) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f8927b).notifyViewVisibilityChanged(view, i7, z8);
        }
    }

    public void G(Q7.c cVar) {
        int i7 = cVar.f8674a;
        k.b("Only child changes supported for tracking", i7 == 2 || i7 == 4 || i7 == 1);
        T7.c cVar2 = T7.c.f9330d;
        T7.c cVar3 = cVar.f8677d;
        k.c(!cVar3.equals(cVar2));
        HashMap hashMap = (HashMap) this.f8927b;
        if (!hashMap.containsKey(cVar3)) {
            hashMap.put(cVar3, cVar);
            return;
        }
        Q7.c cVar4 = (Q7.c) hashMap.get(cVar3);
        int i10 = cVar4.f8674a;
        m mVar = cVar.f8675b;
        if (i7 == 2 && i10 == 1) {
            hashMap.put(cVar3, new Q7.c(4, mVar, cVar3, cVar4.f8675b));
            return;
        }
        if (i7 == 1 && i10 == 2) {
            hashMap.remove(cVar3);
            return;
        }
        m mVar2 = cVar4.f8676c;
        if (i7 == 1 && i10 == 4) {
            hashMap.put(cVar3, new Q7.c(1, mVar2, cVar3, null));
            return;
        }
        if (i7 == 4 && i10 == 2) {
            hashMap.put(cVar3, new Q7.c(2, mVar, cVar3, null));
            return;
        }
        if (i7 == 4 && i10 == 4) {
            hashMap.put(cVar3, new Q7.c(4, mVar, cVar3, mVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + cVar + " occurred after " + cVar4);
    }

    public void H() {
        t1 t1Var = (t1) this.f8927b;
        t1Var.J();
        C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        M5.b bVar = c0646q0.f11917y;
        bVar.getClass();
        if (c0613f0.T(System.currentTimeMillis())) {
            C0613f0 c0613f02 = c0646q0.f11911e;
            C0646q0.j(c0613f02);
            c0613f02.f11750z.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11573B.a("Detected application was in foreground");
                bVar.getClass();
                L(System.currentTimeMillis());
            }
        }
    }

    public boolean I() {
        W w10 = ((C0646q0) this.f8927b).f11912f;
        C0646q0.l(w10);
        return Log.isLoggable(w10.T(), 3);
    }

    public void J(long j) {
        t1 t1Var = (t1) this.f8927b;
        t1Var.J();
        t1Var.N();
        C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        boolean T10 = c0613f0.T(j);
        C0613f0 c0613f02 = c0646q0.f11911e;
        if (T10) {
            C0646q0.j(c0613f02);
            c0613f02.f11750z.b(true);
            c0646q0.q().O();
        }
        C0646q0.j(c0613f02);
        c0613f02.f11732D.g(j);
        if (c0613f02.f11750z.a()) {
            L(j);
        }
    }

    public void K(B0 b02, int i7) {
        EnumC0618h enumC0618h = EnumC0618h.UNSET;
        if (i7 != -30) {
            if (i7 != -20) {
                if (i7 == -10) {
                    enumC0618h = EnumC0618h.MANIFEST;
                } else if (i7 != 0) {
                    if (i7 == 30) {
                        enumC0618h = EnumC0618h.INITIALIZATION;
                    }
                }
            }
            enumC0618h = EnumC0618h.API;
        } else {
            enumC0618h = EnumC0618h.TCF;
        }
        ((EnumMap) this.f8927b).put((EnumMap) b02, (B0) enumC0618h);
    }

    public void L(long j) {
        t1 t1Var = (t1) this.f8927b;
        t1Var.J();
        C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
        if (c0646q0.a()) {
            C0613f0 c0613f0 = c0646q0.f11911e;
            C0646q0.j(c0613f0);
            c0613f0.f11732D.g(j);
            c0646q0.f11917y.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            Long valueOf = Long.valueOf(j10);
            S0 s02 = c0646q0.f11890A;
            C0646q0.k(s02);
            s02.U(j, valueOf, "auto", "_sid");
            C0646q0.j(c0613f0);
            c0613f0.f11733E.g(j10);
            c0613f0.f11750z.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            C0646q0.k(s02);
            s02.R("auto", "_s", bundle, j);
            String t5 = c0613f0.f11738J.t();
            if (TextUtils.isEmpty(t5)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", t5);
            C0646q0.k(s02);
            s02.R("auto", "_ssr", bundle2, j);
        }
    }

    public void M(B0 b02, EnumC0618h enumC0618h) {
        ((EnumMap) this.f8927b).put((EnumMap) b02, (B0) enumC0618h);
    }

    @Override // n.InterfaceC1689w
    public void a(MenuC1678l menuC1678l, boolean z8) {
        ((i.v) this.f8927b).q(menuC1678l);
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
        ((C1065c) this.f8927b).f16612d.lock();
        try {
            ((C1065c) this.f8927b).g = null;
            ((C1065c) this.f8927b).setCacheData(null);
            ((C1065c) this.f8927b).f16614f.set(false);
            ((C1065c) this.f8927b).f16613e.signalAll();
        } finally {
            ((C1065c) this.f8927b).f16612d.unlock();
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        switch (this.f8926a) {
            case 18:
                Throwable throwable = (Throwable) obj;
                l.e(throwable, "throwable");
                String message = S.b("Database source failed: ", throwable.getMessage(), ", falling back to Firebase");
                s t5 = (s) this.f8927b;
                l.e(t5, "t");
                l.e(message, "message");
                return s.c(t5);
            default:
                TVChannel it = (TVChannel) obj;
                l.e(it, "it");
                C1065c c1065c = BaseTVChannelViewModel.access$getInteractors$p((BaseTVChannelViewModel) this.f8927b).f16842a;
                U9.o oVar = (U9.o) c1065c.f16610b.D();
                oVar.getClass();
                return new sb.q(android.support.v4.media.session.b.k(oVar.f9904a, true, new Ba.o(oVar, 18)).g(), C1064b.f16608a, 1).f(c1065c.getTransformer());
        }
    }

    @Override // S4.i
    public long b(long j) {
        return 0L;
    }

    @Override // S4.i
    public long c(long j, long j10) {
        return 0L;
    }

    @Override // z1.o
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f8927b;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.f26642a;
        boolean z8 = view.getLayoutDirection() == 1;
        int i7 = swipeDismissBehavior.f15178d;
        view.offsetLeftAndRight((!(i7 == 0 && z8) && (i7 != 1 || z8)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // m5.InterfaceC1601E
    public D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        if (!((W4.y) this.f8927b).f10806f) {
            q3.s sVar = ((W4.y) this.f8927b).f10801a;
        }
        return J.f20550e;
    }

    public void f(String str, String str2) {
        String b2 = W4.o.b(str.trim());
        String trim = str2.trim();
        C1191j c1191j = (C1191j) this.f8927b;
        c1191j.getClass();
        r.d(b2, trim);
        C0448v c0448v = (C0448v) c1191j.f17441b;
        Collection collection = (Collection) c0448v.get(b2);
        if (collection == null) {
            collection = new ArrayList();
            c0448v.put(b2, collection);
        }
        collection.add(trim);
    }

    @Override // S4.i
    public long g(long j, long j10) {
        return j10;
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
        }
        U u3 = (U) this.f8927b;
        P p10 = (P) u3.f10345F.pollFirst();
        if (p10 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        n nVar = u3.f10357c;
        String str = p10.f10334a;
        if (nVar.e(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public void i(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i10 = n5.D.f21141a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                f(split[0], split[1]);
            }
        }
    }

    @Override // n.InterfaceC1689w
    public boolean j(MenuC1678l menuC1678l) {
        Window.Callback callback = ((i.v) this.f8927b).f18160z.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC1678l);
        return true;
    }

    public W4.o k() {
        return new W4.o(this);
    }

    @Override // S4.i
    public long l(long j, long j10) {
        return 0L;
    }

    @Override // m5.InterfaceC1601E
    public /* bridge */ /* synthetic */ void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0717, code lost:
    
        if (r3.length() <= 0) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0719, code lost:
    
        r2.t();
        ((java.lang.StringBuilder) r2.f8696c).append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0723, code lost:
    
        if (r11 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0729, code lost:
    
        if (r7.contains(0) != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0734, code lost:
    
        if (r7.contains(4) == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x073b, code lost:
    
        if (r7.contains(1) != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0746, code lost:
    
        if (r7.contains(5) == false) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0749, code lost:
    
        r26 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x077f, code lost:
    
        r21 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0789, code lost:
    
        if (r4.isEmpty() == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x078b, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0791, code lost:
    
        r1 = new V8.e(r0, r21, r22, null, -1, -1, r26);
        r1.f10210e = java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x07a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x078f, code lost:
    
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x074c, code lost:
    
        r26 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x074f, code lost:
    
        r26 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0756, code lost:
    
        if (r7.contains(0) != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0762, code lost:
    
        if (r7.contains(4) == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0769, code lost:
    
        if (r7.contains(1) != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0774, code lost:
    
        if (r7.contains(5) == false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0777, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x077a, code lost:
    
        r26 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x077d, code lost:
    
        r26 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b3, code lost:
    
        throw P8.f.a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:173:0x03a3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:208:0x0414. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f9 A[LOOP:15: B:115:0x0367->B:130:0x03f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V8.e n(V8.b bVar) {
        V8.b bVar2;
        int i7;
        int b2;
        char c10;
        char c11;
        int b10;
        int b11;
        int i10;
        int i11;
        h hVar = new h(bVar);
        Z8.c cVar = (Z8.c) hVar.f8697d;
        int i12 = cVar.g;
        byte[] bArr = new byte[i12];
        V8.b bVar3 = (V8.b) hVar.f8695b;
        int i13 = bVar3.f10195b;
        int i14 = bVar3.f10194a;
        int i15 = 0;
        int i16 = 0;
        boolean z8 = false;
        int i17 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i18 = 4;
        while (true) {
            if (i18 == i13 && i16 == 0 && !z8) {
                int i19 = i17 + 1;
                int i20 = i13 - 1;
                int i21 = (hVar.K(i20, i15, i13, i14) ? 1 : 0) << 1;
                if (hVar.K(i20, 1, i13, i14)) {
                    i21 |= 1;
                }
                int i22 = i21 << 1;
                if (hVar.K(i20, 2, i13, i14)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                if (hVar.K(0, i14 - 2, i13, i14)) {
                    i23 |= 1;
                }
                int i24 = i23 << 1;
                int i25 = i14 - 1;
                if (hVar.K(0, i25, i13, i14)) {
                    i24 |= 1;
                }
                int i26 = i24 << 1;
                if (hVar.K(1, i25, i13, i14)) {
                    i26 |= 1;
                }
                int i27 = i26 << 1;
                if (hVar.K(2, i25, i13, i14)) {
                    i27 |= 1;
                }
                int i28 = i27 << 1;
                if (hVar.K(3, i25, i13, i14)) {
                    i28 |= 1;
                }
                bArr[i17] = (byte) i28;
                i18 -= 2;
                i16 += 2;
                i17 = i19;
                z8 = true;
            } else {
                int i29 = i13 - 2;
                if (i18 == i29 && i16 == 0 && (i14 & 3) != 0 && !z10) {
                    int i30 = i17 + 1;
                    int i31 = (hVar.K(i13 + (-3), 0, i13, i14) ? 1 : 0) << 1;
                    if (hVar.K(i29, 0, i13, i14)) {
                        i31 |= 1;
                    }
                    int i32 = i31 << 1;
                    if (hVar.K(i13 - 1, 0, i13, i14)) {
                        i32 |= 1;
                    }
                    int i33 = i32 << 1;
                    if (hVar.K(0, i14 - 4, i13, i14)) {
                        i33 |= 1;
                    }
                    int i34 = i33 << 1;
                    if (hVar.K(0, i14 - 3, i13, i14)) {
                        i34 |= 1;
                    }
                    int i35 = i34 << 1;
                    if (hVar.K(0, i14 - 2, i13, i14)) {
                        i35 |= 1;
                    }
                    int i36 = i35 << 1;
                    int i37 = i14 - 1;
                    if (hVar.K(0, i37, i13, i14)) {
                        i36 |= 1;
                    }
                    int i38 = i36 << 1;
                    if (hVar.K(1, i37, i13, i14)) {
                        i38 |= 1;
                    }
                    bArr[i17] = (byte) i38;
                    i18 -= 2;
                    i16 += 2;
                    i17 = i30;
                    z10 = true;
                } else if (i18 == i13 + 4 && i16 == 2 && (i14 & 7) == 0 && !z11) {
                    int i39 = i17 + 1;
                    int i40 = i13 - 1;
                    int i41 = (hVar.K(i40, 0, i13, i14) ? 1 : 0) << 1;
                    int i42 = i14 - 1;
                    if (hVar.K(i40, i42, i13, i14)) {
                        i41 |= 1;
                    }
                    int i43 = i41 << 1;
                    int i44 = i14 - 3;
                    if (hVar.K(0, i44, i13, i14)) {
                        i43 |= 1;
                    }
                    int i45 = i43 << 1;
                    int i46 = i14 - 2;
                    boolean z13 = z8;
                    if (hVar.K(0, i46, i13, i14)) {
                        i45 |= 1;
                    }
                    boolean z14 = z10;
                    int i47 = i45 << 1;
                    if (hVar.K(0, i42, i13, i14)) {
                        i47 |= 1;
                    }
                    int i48 = i47 << 1;
                    if (hVar.K(1, i44, i13, i14)) {
                        i48 |= 1;
                    }
                    int i49 = i48 << 1;
                    if (hVar.K(1, i46, i13, i14)) {
                        i49 |= 1;
                    }
                    int i50 = i49 << 1;
                    if (hVar.K(1, i42, i13, i14)) {
                        i50 |= 1;
                    }
                    bArr[i17] = (byte) i50;
                    i18 -= 2;
                    i16 += 2;
                    i17 = i39;
                    z8 = z13;
                    z10 = z14;
                    z11 = true;
                } else {
                    boolean z15 = z8;
                    boolean z16 = z10;
                    if (i18 == i29 && i16 == 0 && (i14 & 7) == 4 && !z12) {
                        int i51 = i17 + 1;
                        int i52 = (hVar.K(i13 + (-3), 0, i13, i14) ? 1 : 0) << 1;
                        if (hVar.K(i29, 0, i13, i14)) {
                            i52 |= 1;
                        }
                        int i53 = i52 << 1;
                        if (hVar.K(i13 - 1, 0, i13, i14)) {
                            i53 |= 1;
                        }
                        int i54 = i53 << 1;
                        if (hVar.K(0, i14 - 2, i13, i14)) {
                            i54 |= 1;
                        }
                        int i55 = i54 << 1;
                        int i56 = i14 - 1;
                        if (hVar.K(0, i56, i13, i14)) {
                            i55 |= 1;
                        }
                        int i57 = i55 << 1;
                        if (hVar.K(1, i56, i13, i14)) {
                            i57 |= 1;
                        }
                        int i58 = i57 << 1;
                        if (hVar.K(2, i56, i13, i14)) {
                            i58 |= 1;
                        }
                        int i59 = i58 << 1;
                        if (hVar.K(3, i56, i13, i14)) {
                            i59 |= 1;
                        }
                        bArr[i17] = (byte) i59;
                        i18 -= 2;
                        i16 += 2;
                        i17 = i51;
                        z8 = z15;
                        z10 = z16;
                        z12 = true;
                    } else {
                        while (true) {
                            bVar2 = (V8.b) hVar.f8696c;
                            if (i18 < i13 && i16 >= 0 && !bVar2.b(i16, i18)) {
                                bArr[i17] = (byte) hVar.L(i18, i16, i13, i14);
                                i17++;
                            }
                            int i60 = i18 - 2;
                            int i61 = i16 + 2;
                            if (i60 < 0 || i61 >= i14) {
                                break;
                            }
                            i18 = i60;
                            i16 = i61;
                        }
                        int i62 = i18 - 1;
                        int i63 = i16 + 5;
                        while (true) {
                            if (i62 >= 0 && i63 < i14 && !bVar2.b(i63, i62)) {
                                bArr[i17] = (byte) hVar.L(i62, i63, i13, i14);
                                i17++;
                            }
                            int i64 = i62 + 2;
                            int i65 = i63 - 2;
                            if (i64 >= i13 || i65 < 0) {
                                break;
                            }
                            i62 = i64;
                            i63 = i65;
                        }
                        i18 = i62 + 5;
                        i16 = i63 - 1;
                        z8 = z15;
                        z10 = z16;
                    }
                }
            }
            if (i18 >= i13 && i16 >= i14) {
                break;
            }
            i15 = 0;
        }
        if (i17 != cVar.g) {
            throw f.a();
        }
        A7.a aVar = cVar.f12220f;
        O[] oArr = (O[]) aVar.f532b;
        int i66 = 0;
        for (O o10 : oArr) {
            i66 += o10.f4603b;
        }
        Z8.a[] aVarArr = new Z8.a[i66];
        int length = oArr.length;
        int i67 = 0;
        int i68 = 0;
        while (true) {
            i7 = aVar.f531a;
            if (i67 >= length) {
                break;
            }
            O o11 = oArr[i67];
            int i69 = 0;
            while (i69 < o11.f4603b) {
                int i70 = o11.f4604c;
                aVarArr[i68] = new Z8.a(i70, new byte[i7 + i70]);
                i69++;
                i68++;
                aVar = aVar;
            }
            i67++;
        }
        int length2 = aVarArr[0].f12208b.length - i7;
        int i71 = length2 - 1;
        int i72 = 0;
        for (int i73 = 0; i73 < i71; i73++) {
            int i74 = 0;
            while (i74 < i68) {
                aVarArr[i74].f12208b[i73] = bArr[i72];
                i74++;
                i72++;
            }
        }
        boolean z17 = cVar.f12215a == 24;
        int i75 = 8;
        int i76 = z17 ? 8 : i68;
        int i77 = 0;
        while (i77 < i76) {
            aVarArr[i77].f12208b[i71] = bArr[i72];
            i77++;
            i72++;
        }
        int length3 = aVarArr[0].f12208b.length;
        while (length2 < length3) {
            int i78 = 0;
            while (i78 < i68) {
                int i79 = z17 ? (i78 + 8) % i68 : i78;
                aVarArr[i79].f12208b[(!z17 || i79 <= 7) ? length2 : length2 - 1] = bArr[i72];
                i78++;
                i72++;
            }
            length2++;
        }
        if (i72 != i12) {
            throw new IllegalArgumentException();
        }
        int i80 = 0;
        for (int i81 = 0; i81 < i66; i81++) {
            i80 += aVarArr[i81].f12207a;
        }
        byte[] bArr2 = new byte[i80];
        int i82 = 0;
        for (int i83 = 0; i83 < i66; i83++) {
            Z8.a aVar2 = aVarArr[i83];
            byte[] bArr3 = aVar2.f12208b;
            int i84 = aVar2.f12207a;
            int length4 = bArr3.length;
            int[] iArr = new int[length4];
            for (int i85 = 0; i85 < length4; i85++) {
                iArr[i85] = bArr3[i85] & 255;
            }
            try {
                int n6 = ((b) this.f8927b).n(iArr, bArr3.length - i84);
                for (int i86 = 0; i86 < i84; i86++) {
                    bArr3[i86] = (byte) iArr[i86];
                }
                i82 += n6;
                for (int i87 = 0; i87 < i84; i87++) {
                    bArr2[(i87 * i66) + i83] = bArr3[i87];
                }
            } catch (X8.c unused) {
                throw P8.c.a();
            }
        }
        V8.c cVar2 = new V8.c(bArr2);
        h hVar2 = new h(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        HashSet hashSet = new HashSet();
        boolean z18 = false;
        int i88 = 2;
        while (true) {
            int i89 = 254;
            if (i88 == 2) {
                boolean z19 = false;
                while (true) {
                    int b12 = cVar2.b(i75);
                    if (b12 == 0) {
                        throw f.a();
                    }
                    if (b12 <= 128) {
                        if (z19) {
                            b12 += 128;
                        }
                        hVar2.l((char) (b12 - 1));
                        i11 = 2;
                    } else if (b12 == 129) {
                        i11 = 1;
                    } else {
                        if (b12 > 229) {
                            switch (b12) {
                                case 230:
                                    i11 = 3;
                                    break;
                                case 231:
                                    i11 = 7;
                                    break;
                                case 232:
                                    hashSet.add(Integer.valueOf(hVar2.toString().length()));
                                    hVar2.l((char) 29);
                                    if (cVar2.a() <= 0) {
                                        i11 = 2;
                                        break;
                                    } else {
                                        i75 = 8;
                                        i89 = 254;
                                    }
                                case 233:
                                case 234:
                                    break;
                                case 235:
                                    z19 = true;
                                    if (cVar2.a() <= 0) {
                                    }
                                    break;
                                case 236:
                                    ((StringBuilder) hVar2.f8695b).append("[)>\u001e05\u001d");
                                    sb2.insert(0, "\u001e\u0004");
                                    if (cVar2.a() <= 0) {
                                    }
                                    break;
                                case 237:
                                    ((StringBuilder) hVar2.f8695b).append("[)>\u001e06\u001d");
                                    sb2.insert(0, "\u001e\u0004");
                                    if (cVar2.a() <= 0) {
                                    }
                                    break;
                                case 238:
                                    i11 = 5;
                                    break;
                                case 239:
                                    i11 = 4;
                                    break;
                                case 240:
                                    i11 = 6;
                                    break;
                                case 241:
                                    i11 = 8;
                                    break;
                                default:
                                    if (b12 != i89 || cVar2.a() != 0) {
                                    }
                                    break;
                            }
                        } else {
                            int i90 = b12 - 130;
                            if (i90 < 10) {
                                hVar2.l('0');
                            }
                            ((StringBuilder) hVar2.f8695b).append(String.valueOf(i90));
                        }
                        if (cVar2.a() <= 0) {
                        }
                    }
                }
                i88 = i11;
                i10 = 1;
            } else {
                switch (P.c.b(i88)) {
                    case 2:
                        int[] iArr2 = new int[3];
                        boolean z20 = false;
                        int i91 = 0;
                        while (cVar2.a() != 8 && (b2 = cVar2.b(8)) != 254) {
                            Z8.b.a(b2, cVar2.b(8), iArr2);
                            int i92 = 0;
                            for (int i93 = 3; i92 < i93; i93 = 3) {
                                int i94 = iArr2[i92];
                                if (i91 != 0) {
                                    if (i91 != 1) {
                                        if (i91 == 2) {
                                            if (i94 < 27) {
                                                char c12 = Z8.b.f12210b[i94];
                                                if (z20) {
                                                    hVar2.l((char) (c12 + 128));
                                                    z20 = false;
                                                } else {
                                                    hVar2.l(c12);
                                                }
                                                c10 = 30;
                                            } else if (i94 != 27) {
                                                c10 = 30;
                                                if (i94 != 30) {
                                                    throw f.a();
                                                }
                                                z20 = true;
                                            } else {
                                                c10 = 30;
                                                hashSet.add(Integer.valueOf(hVar2.toString().length()));
                                                c11 = 29;
                                                hVar2.l((char) 29);
                                            }
                                            c11 = 29;
                                        } else {
                                            if (i91 != 3) {
                                                throw f.a();
                                            }
                                            if (z20) {
                                                hVar2.l((char) (i94 + 224));
                                                z20 = false;
                                            } else {
                                                hVar2.l((char) (i94 + 96));
                                            }
                                            i91 = 0;
                                        }
                                    } else if (z20) {
                                        hVar2.l((char) (i94 + 128));
                                        z20 = false;
                                    } else {
                                        hVar2.l((char) i94);
                                    }
                                    i91 = 0;
                                } else if (i94 < i93) {
                                    i91 = i94 + 1;
                                } else {
                                    if (i94 >= 40) {
                                        throw f.a();
                                    }
                                    char c13 = Z8.b.f12209a[i94];
                                    if (z20) {
                                        hVar2.l((char) (c13 + 128));
                                        z20 = false;
                                    } else {
                                        hVar2.l(c13);
                                    }
                                }
                                i92++;
                            }
                            if (cVar2.a() <= 0) {
                            }
                        }
                        i10 = 1;
                        i88 = 2;
                        break;
                    case 3:
                        int i95 = 3;
                        int[] iArr3 = new int[3];
                        boolean z21 = false;
                        int i96 = 0;
                        while (cVar2.a() != 8 && (b10 = cVar2.b(8)) != 254) {
                            Z8.b.a(b10, cVar2.b(8), iArr3);
                            int i97 = i96;
                            int i98 = 0;
                            while (i98 < i95) {
                                int i99 = iArr3[i98];
                                if (i97 != 0) {
                                    if (i97 != 1) {
                                        if (i97 == 2) {
                                            if (i99 < 27) {
                                                char c14 = Z8.b.f12212d[i99];
                                                if (z21) {
                                                    hVar2.l((char) (c14 + 128));
                                                    z21 = false;
                                                } else {
                                                    hVar2.l(c14);
                                                }
                                            } else if (i99 == 27) {
                                                hashSet.add(Integer.valueOf(hVar2.toString().length()));
                                                hVar2.l((char) 29);
                                            } else {
                                                if (i99 != 30) {
                                                    throw f.a();
                                                }
                                                z21 = true;
                                            }
                                            i97 = 0;
                                        } else {
                                            if (i97 != 3) {
                                                throw f.a();
                                            }
                                            if (i99 >= 32) {
                                                throw f.a();
                                            }
                                            char c15 = Z8.b.f12213e[i99];
                                            if (z21) {
                                                hVar2.l((char) (c15 + 128));
                                                z21 = false;
                                                i97 = 0;
                                            } else {
                                                hVar2.l(c15);
                                                i97 = 0;
                                            }
                                        }
                                    } else if (z21) {
                                        hVar2.l((char) (i99 + 128));
                                        z21 = false;
                                        i97 = 0;
                                    } else {
                                        hVar2.l((char) i99);
                                        i97 = 0;
                                    }
                                } else if (i99 < i95) {
                                    i97 = i99 + 1;
                                } else {
                                    if (i99 >= 40) {
                                        throw f.a();
                                    }
                                    char c16 = Z8.b.f12211c[i99];
                                    if (z21) {
                                        hVar2.l((char) (c16 + 128));
                                        z21 = false;
                                    } else {
                                        hVar2.l(c16);
                                    }
                                }
                                i98++;
                                i95 = 3;
                            }
                            if (cVar2.a() > 0) {
                                i96 = i97;
                                i95 = 3;
                            }
                        }
                        i10 = 1;
                        i88 = 2;
                        break;
                    case 4:
                        int i100 = 3;
                        int[] iArr4 = new int[3];
                        while (cVar2.a() != 8 && (b11 = cVar2.b(8)) != 254) {
                            Z8.b.a(b11, cVar2.b(8), iArr4);
                            int i101 = 0;
                            while (i101 < i100) {
                                int i102 = iArr4[i101];
                                if (i102 == 0) {
                                    hVar2.l('\r');
                                } else if (i102 == 1) {
                                    hVar2.l('*');
                                } else if (i102 == 2) {
                                    hVar2.l('>');
                                } else if (i102 == i100) {
                                    hVar2.l(' ');
                                } else if (i102 < 14) {
                                    hVar2.l((char) (i102 + 44));
                                } else {
                                    if (i102 >= 40) {
                                        throw f.a();
                                    }
                                    hVar2.l((char) (i102 + 51));
                                }
                                i101++;
                                i100 = 3;
                            }
                            if (cVar2.a() > 0) {
                                i100 = 3;
                            }
                        }
                        i10 = 1;
                        i88 = 2;
                        break;
                    case 5:
                        while (true) {
                            if (cVar2.a() > 16) {
                                int i103 = 0;
                                while (true) {
                                    if (i103 < 4) {
                                        int b13 = cVar2.b(6);
                                        if (b13 == 31) {
                                            int i104 = 8 - cVar2.f10199b;
                                            if (i104 != 8) {
                                                cVar2.b(i104);
                                            }
                                        } else {
                                            if ((b13 & 32) == 0) {
                                                b13 |= 64;
                                            }
                                            hVar2.l((char) b13);
                                            i103++;
                                        }
                                    } else if (cVar2.a() <= 0) {
                                    }
                                }
                            }
                        }
                        i10 = 1;
                        i88 = 2;
                        break;
                    case 6:
                        int i105 = cVar2.f10198a;
                        int i106 = 8;
                        int i107 = i105 + 2;
                        int b14 = Z8.b.b(cVar2.b(8), i105 + 1);
                        if (b14 == 0) {
                            b14 = cVar2.a() / 8;
                        } else if (b14 >= 250) {
                            b14 = ((b14 - 249) * 250) + Z8.b.b(cVar2.b(8), i107);
                            i107 = i105 + 3;
                        }
                        if (b14 < 0) {
                            throw f.a();
                        }
                        byte[] bArr4 = new byte[b14];
                        int i108 = 0;
                        while (i108 < b14) {
                            if (cVar2.a() < i106) {
                                throw f.a();
                            }
                            bArr4[i108] = (byte) Z8.b.b(cVar2.b(i106), i107);
                            i108++;
                            i107++;
                            i106 = 8;
                        }
                        arrayList.add(bArr4);
                        ((StringBuilder) hVar2.f8695b).append(new String(bArr4, StandardCharsets.ISO_8859_1));
                        i10 = 1;
                        i88 = 2;
                        break;
                    case 7:
                        if (cVar2.a() < 8) {
                            throw f.a();
                        }
                        int b15 = cVar2.b(8);
                        if (b15 <= 127) {
                            hVar2.m(b15 - 1);
                        }
                        z18 = true;
                        i10 = 1;
                        i88 = 2;
                        break;
                    default:
                        throw f.a();
                }
            }
            if (i88 != i10 && cVar2.a() > 0) {
                i75 = 8;
            }
        }
    }

    @Override // S4.i
    public long o(long j, long j10) {
        return -9223372036854775807L;
    }

    @Override // S4.i
    public j p(long j) {
        return (j) this.f8927b;
    }

    public byte[] q(byte[] bArr, byte[] bArr2) {
        try {
            return r(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("a", "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return r(bArr, bArr2);
        }
    }

    public byte[] r(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.f8927b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // S4.i
    public boolean s() {
        return true;
    }

    @Override // m5.InterfaceC1601E
    public /* bridge */ /* synthetic */ void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
    }

    public String toString() {
        switch (this.f8926a) {
            case 13:
                StringBuilder sb2 = new StringBuilder("1");
                for (B0 b02 : B0.values()) {
                    EnumC0618h enumC0618h = (EnumC0618h) ((EnumMap) this.f8927b).get(b02);
                    if (enumC0618h == null) {
                        enumC0618h = EnumC0618h.UNSET;
                    }
                    sb2.append(enumC0618h.f11772a);
                }
                return sb2.toString();
            case 28:
                return A3.c.l(new StringBuilder("<"), (String) this.f8927b, '>');
            default:
                return super.toString();
        }
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            c8.d dVar = (c8.d) this.f8927b;
            c8.e eVar = new c8.e(stringWriter, dVar.f14446a, dVar.f14447b, dVar.f14448c, dVar.f14449d);
            eVar.h(obj);
            eVar.j();
            eVar.f14451b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // S4.i
    public long v() {
        return 0L;
    }

    public byte[] w(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.f8927b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public synchronized C0463k x() {
        y yVar;
        yVar = (y) ((v) this.f8927b).a();
        if (yVar.p() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C0463k(yVar, 4);
    }

    @Override // S4.i
    public long y(long j) {
        return 1L;
    }

    @Override // S4.i
    public long z(long j, long j10) {
        return 1L;
    }
}
