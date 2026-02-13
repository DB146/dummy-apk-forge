package q3;

import A0.F0;
import A0.J;
import A0.L;
import A9.C0146v0;
import A9.C0147v1;
import A9.C0151w1;
import A9.L1;
import C4.x;
import C4.y;
import F.C0257a;
import H2.o0;
import I2.AbstractC0315d;
import J7.t;
import J7.w;
import L7.C;
import L7.C0385e;
import L7.D;
import L7.z;
import Y5.C0613f0;
import Y5.C0646q0;
import Y5.F;
import Y5.I0;
import Y5.S0;
import Y5.W;
import Y5.x1;
import Z9.C0669f;
import Z9.H;
import a.AbstractC0672a;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import da.C1065c;
import h7.C1259e;
import i2.C1332t;
import j7.InterfaceC1385a;
import java.io.File;
import java.io.FileOutputStream;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import l2.EnumC1474s;
import n5.AbstractC1705a;
import n5.C1704A;
import n5.v;
import ob.C1838f;
import s4.C1976d;
import s4.C1979g;
import s4.InterfaceC1977e;
import va.C2161e;
import y.S;

/* loaded from: classes.dex */
public final class c implements L1, InterfaceC1977e, E4.i, E7.a, C, InterfaceC1393d, t, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23370a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23371b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23372c;

    public c(int i7) {
        this.f23370a = 6;
        E4.b bVar = new E4.b(i7, 0);
        E4.b bVar2 = new E4.b(i7, 1);
        this.f23371b = bVar;
        this.f23372c = bVar2;
    }

    public c(int i7, byte b2) {
        this.f23370a = i7;
        switch (i7) {
            case 5:
                this.f23371b = new D3.c(null);
                this.f23372c = new HashMap();
                return;
            case 15:
                this.f23371b = new LinkedHashMap();
                this.f23372c = new LinkedHashMap();
                return;
            case 20:
                this.f23371b = Choreographer.getInstance();
                this.f23372c = Looper.myLooper();
                return;
            case 27:
                this.f23371b = new ContentValues();
                return;
            default:
                this.f23371b = new D5.i(1);
                this.f23372c = new D5.i(1);
                return;
        }
    }

    public /* synthetic */ c(int i7, char c10) {
        this.f23370a = i7;
    }

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f23370a = i7;
        this.f23372c = obj;
        this.f23371b = obj2;
    }

    public /* synthetic */ c(int i7, Object obj, Object obj2, boolean z8) {
        this.f23370a = i7;
        this.f23371b = obj;
        this.f23372c = obj2;
    }

    public c(w wVar, U7.d dVar) {
        this.f23370a = 13;
        this.f23372c = wVar;
        this.f23371b = dVar;
        dVar.f9829c = this;
    }

    public c(S2.b bVar) {
        this.f23370a = 19;
        this.f23371b = bVar;
        this.f23372c = new s(bVar);
    }

    public c(S0 s02, x1 x1Var) {
        this.f23370a = 24;
        this.f23371b = x1Var;
        Objects.requireNonNull(s02);
        this.f23372c = s02;
    }

    public c(C0669f c0669f, TVChannel tVChannel, boolean z8) {
        this.f23370a = 25;
        this.f23371b = c0669f;
        this.f23372c = tVChannel;
    }

    public c(Context context) {
        this.f23370a = 28;
        G.g(context);
        Resources resources = context.getResources();
        this.f23371b = resources;
        this.f23372c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public c(View view) {
        this.f23370a = 17;
        this.f23371b = view;
        this.f23372c = android.support.v4.media.session.b.y(Db.h.f3352a, new J(this, 8));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, T1.a] */
    public c(EditText editText) {
        this.f23370a = 21;
        this.f23371b = editText;
        T1.g gVar = new T1.g(editText);
        this.f23372c = gVar;
        editText.addTextChangedListener(gVar);
        if (T1.a.f9201b == null) {
            synchronized (T1.a.f9200a) {
                try {
                    if (T1.a.f9201b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            T1.a.f9202c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, T1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        T1.a.f9201b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(T1.a.f9201b);
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f23370a = 0;
        this.f23371b = workDatabase_Impl;
        this.f23372c = new b(workDatabase_Impl, 0);
    }

    public c(b3.e eVar) {
        this.f23370a = 27;
        this.f23371b = new ContentValues(eVar.f13820a);
    }

    public c(String str) {
        this.f23370a = 12;
        this.f23371b = str.concat(".lck");
    }

    public c(C1704A c1704a) {
        this.f23370a = 4;
        this.f23371b = c1704a;
        this.f23372c = new v();
    }

    public c(p7.n nVar) {
        this.f23370a = 9;
        this.f23371b = nVar;
        this.f23372c = new AtomicReference();
        nVar.a(new A1.d(this, 18));
    }

    public c(E7.a[] aVarArr) {
        this.f23370a = 7;
        this.f23371b = aVarArr;
        this.f23372c = new C1332t(4);
    }

    public void A(String str) {
        U7.d dVar = (U7.d) this.f23371b;
        synchronized (dVar) {
            dVar.e((byte) 1, str.getBytes(U7.d.f9824m));
        }
    }

    public void B() {
        C0646q0 c0646q0 = (C0646q0) ((S0) this.f23372c).f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        SparseArray P10 = c0613f0.P();
        x1 x1Var = (x1) this.f23371b;
        P10.put(x1Var.f11995c, Long.valueOf(x1Var.f11994b));
        C0613f0 c0613f02 = c0646q0.f11911e;
        C0646q0.j(c0613f02);
        int[] iArr = new int[P10.size()];
        long[] jArr = new long[P10.size()];
        for (int i7 = 0; i7 < P10.size(); i7++) {
            iArr[i7] = P10.keyAt(i7);
            jArr[i7] = ((Long) P10.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c0613f02.f11730B.r(bundle);
    }

    @Override // J7.t
    public void a(String str, String str2) {
        int i7;
        G7.b a9 = str != null ? G7.b.a(str, str2) : null;
        D d10 = (D) this.f23371b;
        C0385e c0385e = d10.f6313b;
        L7.j jVar = (L7.j) this.f23372c;
        jVar.getClass();
        if (a9 != null && (i7 = a9.f4357a) != -1 && i7 != -25) {
            StringBuilder n6 = A3.c.n("Persisted write", " at ");
            n6.append(c0385e.toString());
            n6.append(" failed: ");
            n6.append(a9.toString());
            ((Q7.h) jVar.j).b0(n6.toString());
        }
        C0385e c0385e2 = d10.f6313b;
        if (a9 == null || a9.f4357a != -25) {
            boolean z8 = a9 == null;
            z zVar = (z) jVar.f6364m;
            C0257a c0257a = (C0257a) jVar.f6357c;
            zVar.getClass();
            List list = (List) zVar.g.c(new L7.v(zVar, d10.f6312a, !z8, c0257a));
            if (list.size() > 0) {
                jVar.h(c0385e2);
            }
            jVar.f(list);
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        String message;
        switch (this.f23370a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                StringBuilder sb2 = new StringBuilder("addIPTVSource Error: ");
                M9.d dVar = (M9.d) this.f23372c;
                sb2.append(dVar);
                String message2 = sb2.toString();
                C2161e c2161e = (C2161e) this.f23371b;
                kotlin.jvm.internal.l.e(message2, "message");
                M9.d dVar2 = c2161e.f25325o;
                if (kotlin.jvm.internal.l.a(dVar2 != null ? dVar2.f6851b : null, dVar.f6851b)) {
                    if (it instanceof TimeoutException) {
                        c2161e.a().l(new y9.D(new Throwable("Vui lòng kiểm tra kết nối internet hoặc đường dẫn!")));
                        return;
                    } else if ((it instanceof UnknownHostException) || ((message = it.getMessage()) != null && ac.g.b0(message, "timeout"))) {
                        c2161e.a().l(new y9.D(new Throwable("Vui lòng kiểm tra kết nối internet hoặc đường dẫn!")));
                        return;
                    } else {
                        c2161e.a().l(new y9.D(new Throwable("Định dạng nguồn kênh chưa được hỗ trợ!")));
                        return;
                    }
                }
                return;
            default:
                List it2 = (List) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                ReentrantLock reentrantLock = ((C1065c) this.f23371b).f16612d;
                reentrantLock.lock();
                try {
                    ((ArrayList) this.f23372c).addAll(it2);
                    return;
                } finally {
                    reentrantLock.unlock();
                }
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        C0669f c0669f;
        Object obj2;
        boolean b02;
        switch (this.f23370a) {
            case 16:
                String url = (String) obj;
                kotlin.jvm.internal.l.e(url, "url");
                return ((M9.k) this.f23371b).c((M9.d) this.f23372c, url);
            case 18:
                W9.c it = (W9.c) obj;
                kotlin.jvm.internal.l.e(it, "it");
                if (it.f10862e != ((W9.c) this.f23371b).f10862e) {
                    return C1838f.f22215a;
                }
                U9.l lVar = (U9.l) ((P9.c) this.f23372c).f8257c.getValue();
                lVar.getClass();
                return android.support.v4.media.session.b.g(lVar.f9899a, new Aa.t(12, lVar, it));
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List listChannel = (List) obj;
                kotlin.jvm.internal.l.e(listChannel, "listChannel");
                ListIterator listIterator = listChannel.listIterator(listChannel.size());
                while (true) {
                    boolean hasPrevious = listIterator.hasPrevious();
                    c0669f = (C0669f) this.f23371b;
                    if (hasPrevious) {
                        obj2 = listIterator.previous();
                        TVChannel tVChannel = (TVChannel) obj2;
                        c0669f.getClass();
                        String channelId = tVChannel.getChannelId();
                        Locale locale = Locale.ROOT;
                        String lowerCase = channelId.toLowerCase(locale);
                        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
                        TVChannel tVChannel2 = (TVChannel) this.f23372c;
                        String lowerCase2 = tVChannel2.getChannelId().toLowerCase(locale);
                        kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
                        if (lowerCase.equals(lowerCase2)) {
                            b02 = true;
                        } else {
                            String removeAllSpecialChars = UtilsKt.removeAllSpecialChars(tVChannel.getChannelId());
                            String lowerCase3 = UtilsKt.removeAllSpecialChars(ac.g.n0(tVChannel2.getChannelId(), "vie-channel-")).toLowerCase(locale);
                            kotlin.jvm.internal.l.d(lowerCase3, "toLowerCase(...)");
                            b02 = ac.g.b0(removeAllSpecialChars, ac.g.v0(ac.g.o0(lowerCase3, "hd")).toString());
                        }
                        if (b02) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                TVChannel tVChannel3 = (TVChannel) obj2;
                if (tVChannel3 == null) {
                    return gb.i.i(new Throwable(""));
                }
                c0669f.getClass();
                return new qb.m(new F8.a(6, tVChannel3, c0669f), 2);
            default:
                List<TVChannel> listChannel2 = (List) obj;
                kotlin.jvm.internal.l.e(listChannel2, "listChannel");
                for (TVChannel tVChannel4 : listChannel2) {
                    if (ac.n.T((String) this.f23372c, tVChannel4.getTvChannelName(), true)) {
                        return ((H) this.f23371b).b(tVChannel4, false);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // s4.InterfaceC1977e
    public C1976d b(C1979g c1979g, long j) {
        C1976d c1976d;
        long j10 = c1979g.f24055d;
        int min = (int) Math.min(20000L, c1979g.f24054c - j10);
        v vVar = (v) this.f23372c;
        vVar.D(min);
        c1979g.x(vVar.f21229a, 0, min, false);
        int i7 = -1;
        int i10 = -1;
        long j11 = -9223372036854775807L;
        while (vVar.a() >= 4) {
            if (x.a(vVar.f21230b, vVar.f21229a) != 442) {
                vVar.H(1);
            } else {
                vVar.H(4);
                long c10 = y.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b2 = ((C1704A) this.f23371b).b(c10);
                    if (b2 > j) {
                        if (j11 == -9223372036854775807L) {
                            return new C1976d(-1, b2, j10);
                        }
                        c1976d = new C1976d(0, -9223372036854775807L, j10 + i10);
                    } else if (100000 + b2 > j) {
                        c1976d = new C1976d(0, -9223372036854775807L, j10 + vVar.f21230b);
                    } else {
                        i10 = vVar.f21230b;
                        j11 = b2;
                    }
                    return c1976d;
                }
                int i11 = vVar.f21231c;
                if (vVar.a() >= 10) {
                    vVar.H(9);
                    int v10 = vVar.v() & 7;
                    if (vVar.a() >= v10) {
                        vVar.H(v10);
                        if (vVar.a() >= 4) {
                            if (x.a(vVar.f21230b, vVar.f21229a) == 443) {
                                vVar.H(4);
                                int A10 = vVar.A();
                                if (vVar.a() < A10) {
                                    vVar.G(i11);
                                } else {
                                    vVar.H(A10);
                                }
                            }
                            while (true) {
                                if (vVar.a() < 4) {
                                    break;
                                }
                                int a9 = x.a(vVar.f21230b, vVar.f21229a);
                                if (a9 == 442 || a9 == 441 || (a9 >>> 8) != 1) {
                                    break;
                                }
                                vVar.H(4);
                                if (vVar.a() < 2) {
                                    vVar.G(i11);
                                    break;
                                }
                                vVar.G(Math.min(vVar.f21231c, vVar.f21230b + vVar.A()));
                            }
                        } else {
                            vVar.G(i11);
                        }
                    } else {
                        vVar.G(i11);
                    }
                } else {
                    vVar.G(i11);
                }
                i7 = vVar.f21230b;
            }
        }
        return j11 != -9223372036854775807L ? new C1976d(-2, j11, j10 + i7) : C1976d.f24042d;
    }

    @Override // s4.InterfaceC1977e
    public void c() {
        byte[] bArr = n5.D.f21146f;
        v vVar = (v) this.f23372c;
        vVar.getClass();
        vVar.E(bArr.length, bArr);
    }

    @Override // L7.C
    public void d(boolean z8, l lVar) {
        InterfaceC1385a interfaceC1385a = (InterfaceC1385a) ((AtomicReference) this.f23372c).get();
        if (interfaceC1385a != null) {
            ((C1259e) interfaceC1385a).b(z8).addOnSuccessListener(new H7.c(lVar, 0)).addOnFailureListener(new H7.c(lVar, 1));
        } else {
            lVar.E(null);
        }
    }

    public void e(L l10, boolean z8) {
        D5.i iVar = (D5.i) this.f23372c;
        D5.i iVar2 = (D5.i) this.f23371b;
        if (z8) {
            iVar2.n(l10);
            iVar.n(l10);
        } else {
            if (((F0) iVar2.f3256b).contains(l10)) {
                return;
            }
            iVar.n(l10);
        }
    }

    @Override // E7.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        E7.a[] aVarArr = (E7.a[]) this.f23371b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            E7.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.f(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((C1332t) this.f23372c).f(stackTraceElementArr2) : stackTraceElementArr2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [b3.e, java.lang.Object] */
    public b3.e g() {
        ((ContentValues) this.f23371b).put("type", "TYPE_PREVIEW");
        if (TextUtils.isEmpty(((ContentValues) this.f23371b).getAsString("display_name"))) {
            throw new IllegalStateException("Need channel name. Use method setDisplayName(String) to set it.");
        }
        if (TextUtils.isEmpty(((ContentValues) this.f23371b).getAsString("app_link_intent_uri"))) {
            throw new IllegalStateException("Need app link intent uri for channel. Use method setAppLinkIntent or setAppLinkIntentUri to set it.");
        }
        ?? obj = new Object();
        obj.f13820a = (ContentValues) this.f23371b;
        obj.f13821b = null;
        Uri uri = (Uri) this.f23372c;
        obj.f13822c = uri;
        obj.f13823d = (obj.f13821b == null && uri == null) ? false : true;
        return obj;
    }

    public void h() {
        int[] iArr = (int[]) this.f23371b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f23372c = null;
    }

    @Override // A9.L1
    public void j(View view, int i7) {
        C0147v1 c0147v1 = (C0147v1) this.f23371b;
        ((C0151w1) this.f23372c).getClass();
        C0151w1.z(c0147v1, view, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, A9.v0] */
    @Override // E4.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0146v0 i(E4.h hVar) {
        MediaCodec mediaCodec;
        ?? obj;
        String str = hVar.f3575a.f3581a;
        E4.j jVar = null;
        try {
            AbstractC1705a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                HandlerThread handlerThread = (HandlerThread) ((E4.b) this.f23371b).get();
                HandlerThread handlerThread2 = (HandlerThread) ((E4.b) this.f23372c).get();
                obj = new Object();
                obj.f1430c = mediaCodec;
                obj.f1431d = new E4.e(handlerThread);
                obj.f1432e = new E4.d(mediaCodec, handlerThread2);
                obj.f1429b = 0;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
        try {
            AbstractC1705a.v();
            C0146v0.b(obj, hVar.f3576b, hVar.f3578d, hVar.f3579e);
            return obj;
        } catch (Exception e11) {
            e = e11;
            jVar = obj;
            if (jVar != null) {
                jVar.release();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public void l(int i7) {
        int[] iArr = (int[]) this.f23371b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i7, 10) + 1];
            this.f23371b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int length = iArr.length;
            while (length <= i7) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f23371b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f23371b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Object m(D3.h hVar) {
        HashMap hashMap = (HashMap) this.f23372c;
        D3.c cVar = (D3.c) hashMap.get(hVar);
        if (cVar == null) {
            cVar = new D3.c(hVar);
            hashMap.put(hVar, cVar);
        } else {
            hVar.a();
        }
        D3.c cVar2 = cVar.f3168d;
        cVar2.f3167c = cVar.f3167c;
        cVar.f3167c.f3168d = cVar2;
        D3.c cVar3 = (D3.c) this.f23371b;
        cVar.f3168d = cVar3;
        D3.c cVar4 = cVar3.f3167c;
        cVar.f3167c = cVar4;
        cVar4.f3168d = cVar;
        cVar.f3168d.f3167c = cVar;
        ArrayList arrayList = cVar.f3166b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f3166b.remove(size - 1);
        }
        return null;
    }

    public ArrayList n(String str) {
        TreeMap treeMap = I2.H.f5039w;
        I2.H a9 = AbstractC0315d.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23371b;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                arrayList.add(n6.getString(0));
            }
            return arrayList;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public String o(String str) {
        String str2 = (String) this.f23372c;
        Resources resources = (Resources) this.f23371b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean p() {
        return !(((F0) ((D5.i) this.f23372c).f3256b).isEmpty() && ((F0) ((D5.i) this.f23371b).f3256b).isEmpty());
    }

    public void q() {
        String str = (String) this.f23371b;
        if (((FileChannel) this.f23372c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f23372c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f23372c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f23372c = null;
            throw new IllegalStateException(S.b("Unable to lock file: '", str, "'."), th);
        }
    }

    public void r(int i7, int i10) {
        int[] iArr = (int[]) this.f23371b;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i11 = i7 + i10;
        l(i11);
        int[] iArr2 = (int[]) this.f23371b;
        System.arraycopy(iArr2, i7, iArr2, i11, (iArr2.length - i7) - i10);
        Arrays.fill((int[]) this.f23371b, i7, i11, -1);
        ArrayList arrayList = (ArrayList) this.f23372c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o0 o0Var = (o0) ((ArrayList) this.f23372c).get(size);
            int i12 = o0Var.f4764a;
            if (i12 >= i7) {
                o0Var.f4764a = i12 + i10;
            }
        }
    }

    public void s(int i7, int i10) {
        int[] iArr = (int[]) this.f23371b;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i11 = i7 + i10;
        l(i11);
        int[] iArr2 = (int[]) this.f23371b;
        System.arraycopy(iArr2, i11, iArr2, i7, (iArr2.length - i7) - i10);
        int[] iArr3 = (int[]) this.f23371b;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f23372c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o0 o0Var = (o0) ((ArrayList) this.f23372c).get(size);
            int i12 = o0Var.f4764a;
            if (i12 >= i7) {
                if (i12 < i11) {
                    ((ArrayList) this.f23372c).remove(size);
                } else {
                    o0Var.f4764a = i12 - i10;
                }
            }
        }
    }

    public void t(U7.e eVar) {
        ((w) this.f23372c).f5653i.execute(new E5.k(5, this, eVar, false));
    }

    public String toString() {
        switch (this.f23370a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                D3.c cVar = (D3.c) this.f23371b;
                D3.c cVar2 = cVar.f3167c;
                boolean z8 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f3165a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f3166b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f3167c;
                    z8 = true;
                }
                if (z8) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(Throwable th) {
        S0 s02 = (S0) this.f23372c;
        s02.J();
        s02.f11556w = false;
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        int i7 = 2;
        if (c0646q0.f11910d.T(null, F.f11291T0)) {
            String message = th.getMessage();
            s02.f11540B = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        s02.f11540B = true;
                    }
                    i7 = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i7 = 3;
                }
            }
        }
        int i10 = i7 - 1;
        x1 x1Var = (x1) this.f23371b;
        W w10 = c0646q0.f11912f;
        if (i10 == 0) {
            C0646q0.l(w10);
            w10.f11580w.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", W.R(c0646q0.q().P()), W.R(th.toString()));
            s02.f11557x = 1;
            s02.g0().add(x1Var);
            return;
        }
        if (i10 != 1) {
            C0646q0.l(w10);
            w10.f11577f.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", W.R(c0646q0.q().P()), th);
            B();
            s02.f11557x = 1;
            s02.h0();
            return;
        }
        s02.g0().add(x1Var);
        if (s02.f11557x > ((Integer) F.f11356w0.a(null)).intValue()) {
            s02.f11557x = 1;
            C0646q0.l(w10);
            w10.f11580w.c("registerTriggerAsync failed. May try later. App ID, throwable", W.R(c0646q0.q().P()), W.R(th.toString()));
            return;
        }
        C0646q0.l(w10);
        w10.f11580w.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", W.R(c0646q0.q().P()), W.R(String.valueOf(s02.f11557x)), W.R(th.toString()));
        int i11 = s02.f11557x;
        if (s02.f11558y == null) {
            s02.f11558y = new I0(s02, c0646q0, 1);
        }
        s02.f11558y.b(i11 * 1000);
        int i12 = s02.f11557x;
        s02.f11557x = i12 + i12;
    }

    public void v() {
        ((S2.b) this.f23371b).a();
    }

    public void w(Bundle bundle) {
        S2.b bVar = (S2.b) this.f23371b;
        if (!bVar.f8983a) {
            bVar.a();
        }
        Q2.e eVar = (Q2.e) bVar.f8986d;
        if (eVar.w().f19242d.compareTo(EnumC1474s.f19230d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.w().f19242d).toString());
        }
        if (bVar.f8984b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = Y6.b.n("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        bVar.f8989h = bundle2;
        bVar.f8984b = true;
    }

    public void x(Bundle bundle) {
        S2.b bVar = (S2.b) this.f23371b;
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        Bundle bundle2 = (Bundle) bVar.f8989h;
        if (bundle2 != null) {
            f4.putAll(bundle2);
        }
        synchronized (((U9.j) bVar.f8988f)) {
            for (Map.Entry entry : ((LinkedHashMap) bVar.g).entrySet()) {
                AbstractC0672a.n(f4, (String) entry.getKey(), ((Q2.d) entry.getValue()).a());
            }
        }
        if (f4.isEmpty()) {
            return;
        }
        AbstractC0672a.n(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", f4);
    }

    public void y(D3.h hVar, Object obj) {
        HashMap hashMap = (HashMap) this.f23372c;
        D3.c cVar = (D3.c) hashMap.get(hVar);
        if (cVar == null) {
            cVar = new D3.c(hVar);
            cVar.f3168d = cVar;
            D3.c cVar2 = (D3.c) this.f23371b;
            cVar.f3168d = cVar2.f3168d;
            cVar.f3167c = cVar2;
            cVar2.f3168d = cVar;
            cVar.f3168d.f3167c = cVar;
            hashMap.put(hVar, cVar);
        } else {
            hVar.a();
        }
        if (cVar.f3166b == null) {
            cVar.f3166b = new ArrayList();
        }
        cVar.f3166b.add(obj);
    }

    public Object z() {
        D3.c cVar = (D3.c) this.f23371b;
        D3.c cVar2 = cVar.f3168d;
        while (true) {
            if (cVar2.equals(cVar)) {
                return null;
            }
            ArrayList arrayList = cVar2.f3166b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? cVar2.f3166b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            D3.c cVar3 = cVar2.f3168d;
            cVar3.f3167c = cVar2.f3167c;
            cVar2.f3167c.f3168d = cVar3;
            HashMap hashMap = (HashMap) this.f23372c;
            D3.h hVar = cVar2.f3165a;
            hashMap.remove(hVar);
            hVar.a();
            cVar2 = cVar2.f3168d;
        }
    }
}
