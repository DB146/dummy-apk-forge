package P4;

import N6.t0;
import Y5.I1;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.UtilsKt;
import d7.C1055b;
import f.C1117a;
import f.InterfaceC1118b;
import g3.InterfaceC1195n;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jb.InterfaceC1392c;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import m4.C1586o0;
import m5.C1617n;
import m5.C1618o;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import n5.AbstractC1705a;
import o.InterfaceC1727c0;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v.AbstractC2121a;

/* renamed from: P4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463k implements f0, InterfaceC1394e, InterfaceC1601E, e0, InterfaceC1118b, Y5.Y, m5.L, InterfaceC1393d, InterfaceC1195n, InterfaceC1392c, InterfaceC1727c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8072c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8073a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8074b;

    public C0463k(int i7) {
        this.f8073a = i7;
        switch (i7) {
            case 29:
                this.f8074b = new LinkedHashMap();
                return;
            default:
                try {
                    this.f8074b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e2) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
                }
        }
    }

    public /* synthetic */ C0463k(int i7, boolean z8) {
        this.f8073a = i7;
    }

    public C0463k(t0 t0Var) {
        this.f8073a = 13;
        this.f8074b = N6.H.F(t0Var);
    }

    public C0463k(X5.a aVar, ha.g gVar) {
        this.f8073a = 21;
        this.f8074b = gVar;
        aVar.f10991a.zzf(new C1055b(this));
    }

    public C0463k(Context context) {
        this.f8073a = 7;
        this.f8074b = context.getApplicationContext().getSharedPreferences("core-google-shortcuts.PREF_FILE_NAME", 0);
    }

    public C0463k(TextView textView) {
        this.f8073a = 5;
        this.f8074b = new T1.f(textView);
    }

    public /* synthetic */ C0463k(Object obj, int i7) {
        this.f8073a = i7;
        this.f8074b = obj;
    }

    public C0463k(long[] jArr) {
        u.z zVar;
        this.f8073a = 19;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new u.z(copyOf.length);
            int i7 = zVar.f24736b;
            if (i7 < 0) {
                AbstractC2121a.d("");
                throw null;
            }
            if (copyOf.length != 0) {
                int length = copyOf.length + i7;
                long[] jArr2 = zVar.f24735a;
                if (jArr2.length < length) {
                    long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
                    zVar.f24735a = copyOf2;
                }
                long[] jArr3 = zVar.f24735a;
                int i10 = zVar.f24736b;
                if (i7 != i10) {
                    Eb.n.O(jArr3, jArr3, copyOf.length + i7, i7, i10);
                }
                Eb.n.O(copyOf, jArr3, i7, 0, copyOf.length);
                zVar.f24736b += copyOf.length;
            }
        } else {
            zVar = new u.z(16);
        }
        this.f8074b = zVar;
    }

    public static final C0463k A(C0463k c0463k, R7.a aVar) {
        byte[] bArr;
        W6.g q10 = W6.g.q(c0463k.B(), C1021o.a());
        if (q10.o().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            AbstractC1014h o10 = q10.o();
            int size = o10.size();
            if (size == 0) {
                bArr = com.google.crypto.tink.shaded.protobuf.A.f15706b;
            } else {
                byte[] bArr2 = new byte[size];
                o10.t(size, bArr2);
                bArr = bArr2;
            }
            W6.y t5 = W6.y.t(aVar.q(bArr, new byte[0]), C1021o.a());
            if (t5.p() > 0) {
                return new C0463k(t5, 4);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public byte[] B() {
        try {
            String string = ((SharedPreferences) this.f8074b).getString("core-google-shortcuts.TINK_KEYSET", null);
            if (string != null) {
                return com.bumptech.glide.c.w(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value core-google-shortcuts.TINK_KEYSET does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException("can't read keyset; the pref value core-google-shortcuts.TINK_KEYSET is not a valid hex string");
        }
    }

    public i3.i C(q3.j id) {
        kotlin.jvm.internal.l.e(id, "id");
        return (i3.i) ((LinkedHashMap) this.f8074b).remove(id);
    }

    public List D(String workSpecId) {
        kotlin.jvm.internal.l.e(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8074b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (kotlin.jvm.internal.l.a(((q3.j) entry.getKey()).f23386a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((q3.j) it.next());
        }
        return Eb.o.s0(linkedHashMap2.values());
    }

    public void E(Yb.h property, Integer num) {
        kotlin.jvm.internal.l.e(property, "property");
        this.f8074b = num;
    }

    public i3.i F(q3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8074b;
        Object obj = linkedHashMap.get(jVar);
        if (obj == null) {
            obj = new i3.i(jVar);
            linkedHashMap.put(jVar, obj);
        }
        return (i3.i) obj;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f8073a) {
            case 18:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                Z9.t t5 = (Z9.t) this.f8074b;
                kotlin.jvm.internal.l.e(t5, "t");
                return;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                Db.o oVar = X9.a.f11017a;
                String message = it.getMessage();
                if (message == null) {
                    message = it.getClass().getName();
                }
                X9.a.a((TVChannel) this.f8074b, message);
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        Ra.c cVar;
        Object obj2;
        switch (this.f8073a) {
            case 2:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                Iterator it2 = it.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    cVar = (Ra.c) this.f8074b;
                    if (hasNext) {
                        obj2 = it2.next();
                        String str = ((Pa.a) obj2).f8259a;
                        ((Pa.d) cVar.f8949c).getClass();
                        if (str.equals("")) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Pa.a aVar = (Pa.a) obj2;
                Log.d(UtilsKt.getTAG(cVar), "appInfor: " + aVar);
                return new Ra.d(aVar);
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                return (tb.e) this.f8074b;
        }
    }

    @Override // g3.InterfaceC1195n
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f8074b).getSupportedFeatures();
    }

    @Override // g3.InterfaceC1195n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) tc.b.l(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8074b).createWebView(webView));
    }

    @Override // P4.f0
    public boolean d() {
        for (f0 f0Var : (f0[]) this.f8074b) {
            if (f0Var.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        long j11;
        m5.M m10 = (m5.M) interfaceC1603G;
        S4.h hVar = (S4.h) this.f8074b;
        hVar.getClass();
        long j12 = m10.f20555a;
        m5.S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        hVar.f9095B.getClass();
        if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof m5.z) && !(iOException instanceof m5.I)) {
            int i10 = C1617n.f20620b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                }
            }
            j11 = Math.min((i7 - 1) * 1000, 5000);
            D4.e eVar = j11 != -9223372036854775807L ? m5.J.f20551f : new D4.e(0, j11, false);
            hVar.f9099F.w(rVar, m10.f20557c, iOException, !eVar.a());
            return eVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        hVar.f9099F.w(rVar, m10.f20557c, iOException, !eVar.a());
        return eVar;
    }

    @Override // Y5.Y
    public /* synthetic */ void f(String str, int i7, IOException iOException, byte[] bArr, Map map) {
        ((I1) this.f8074b).z(str, i7, iOException, bArr, map);
    }

    @Override // m5.L
    public Object g(Uri uri, C1618o c1618o) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f8074b).newPullParser();
            newPullParser.setInput(c1618o, null);
            return (Z4.c) new Z4.g(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e2) {
            throw C1586o0.b(null, e2);
        }
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        C1117a c1117a = (C1117a) obj;
        W1.U u3 = (W1.U) this.f8074b;
        W1.P p10 = (W1.P) u3.f10345F.pollFirst();
        if (p10 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        q3.n nVar = u3.f10357c;
        String str = p10.f10334a;
        W1.C e2 = nVar.e(str);
        if (e2 != null) {
            e2.P(p10.f10335b, c1117a.f16903a, c1117a.f16904b);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // P4.e0
    public void i(f0 f0Var) {
        U4.l lVar = (U4.l) this.f8074b;
        lVar.f9578E.i(lVar);
    }

    @Override // P4.f0
    public long j() {
        long j = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f8074b) {
            long j10 = f0Var.j();
            if (j10 != Long.MIN_VALUE) {
                j = Math.min(j, j10);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // m5.InterfaceC1601E
    public void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        ((S4.h) this.f8074b).x((m5.M) interfaceC1603G);
    }

    @Override // P4.f0
    public long n() {
        long j = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f8074b) {
            long n6 = f0Var.n();
            if (n6 != Long.MIN_VALUE) {
                j = Math.min(j, n6);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public U6.f p() {
        byte[] array;
        byte b2 = 1;
        Class cls = ((S6.e) S6.g.f9182e.get(S6.b.class)) == null ? null : S6.b.class;
        if (cls == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(S6.b.class.getName()));
        }
        int i7 = S6.h.f9183a;
        W6.y yVar = (W6.y) this.f8074b;
        int r10 = yVar.r();
        Iterator it = yVar.q().iterator();
        boolean z8 = true;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            W6.r rVar = W6.r.ENABLED;
            if (!hasNext) {
                if (i10 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z10 && !z8) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                Q7.h hVar = new Q7.h(cls);
                for (W6.x xVar : yVar.q()) {
                    if (xVar.t() == rVar) {
                        String r11 = xVar.q().r();
                        AbstractC1014h s3 = xVar.q().s();
                        S6.f b10 = S6.g.b(r11);
                        boolean contains = ((Map) b10.f9177a.f5049b).keySet().contains(cls);
                        I2.I i11 = b10.f9177a;
                        Map map = (Map) i11.f5049b;
                        if (!contains) {
                            StringBuilder sb2 = new StringBuilder("Primitive type ");
                            sb2.append(cls.getName());
                            sb2.append(" not supported by key manager of type ");
                            sb2.append(i11.getClass());
                            sb2.append(", supported primitives: ");
                            Set<Class> keySet = ((Map) i11.f5049b).keySet();
                            StringBuilder sb3 = new StringBuilder();
                            boolean z11 = true;
                            for (Class cls2 : keySet) {
                                if (!z11) {
                                    sb3.append(", ");
                                }
                                sb3.append(cls2.getCanonicalName());
                                z11 = false;
                            }
                            sb2.append(sb3.toString());
                            throw new GeneralSecurityException(sb2.toString());
                        }
                        try {
                            if (!map.keySet().contains(cls) && !Void.class.equals(cls)) {
                                throw new IllegalArgumentException("Given internalKeyMananger " + i11.toString() + " does not support primitive class " + cls.getName());
                            }
                            try {
                                AbstractC1007a i12 = i11.i(s3);
                                if (Void.class.equals(cls)) {
                                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                                }
                                i11.m(i12);
                                U6.a aVar = (U6.a) map.get(cls);
                                if (aVar == null) {
                                    throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
                                }
                                X6.d a9 = aVar.a(i12);
                                if (xVar.t() != rVar) {
                                    throw new GeneralSecurityException("only ENABLED key is allowed");
                                }
                                int ordinal = xVar.s().ordinal();
                                if (ordinal != b2) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            array = S6.a.f9171a;
                                        } else if (ordinal != 4) {
                                            throw new GeneralSecurityException("unknown output prefix type");
                                        }
                                    }
                                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(xVar.r()).array();
                                } else {
                                    array = ByteBuffer.allocate(5).put(b2).putInt(xVar.r()).array();
                                }
                                S6.c cVar = new S6.c(a9, array, xVar.t(), xVar.s());
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(cVar);
                                byte[] bArr = cVar.f9173b;
                                S6.d dVar = new S6.d(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f8695b;
                                List list = (List) concurrentHashMap.put(dVar, Collections.unmodifiableList(arrayList));
                                if (list != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.addAll(list);
                                    arrayList2.add(cVar);
                                    concurrentHashMap.put(dVar, Collections.unmodifiableList(arrayList2));
                                }
                                if (xVar.r() != yVar.r()) {
                                    continue;
                                } else {
                                    if (cVar.f9174c != rVar) {
                                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                                    }
                                    if (hVar.C(bArr == null ? null : Arrays.copyOf(bArr, bArr.length)).isEmpty()) {
                                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                                    }
                                    hVar.f8696c = cVar;
                                }
                            } catch (com.google.crypto.tink.shaded.protobuf.C e2) {
                                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) i11.f5048a).getName()), e2);
                            }
                        } catch (IllegalArgumentException e10) {
                            throw new GeneralSecurityException("Primitive type not supported", e10);
                        }
                    }
                    b2 = 1;
                }
                S6.e eVar = (S6.e) S6.g.f9182e.get(S6.b.class);
                Class cls3 = (Class) hVar.f8697d;
                if (eVar == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls3.getName()));
                }
                if (S6.b.class.equals(cls3)) {
                    return new U6.f(hVar);
                }
                throw new GeneralSecurityException("Wrong input primitive class, expected " + S6.b.class + ", got " + cls3);
            }
            W6.x xVar2 = (W6.x) it.next();
            if (xVar2.t() == rVar) {
                if (!xVar2.u()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(xVar2.r())));
                }
                if (xVar2.s() == W6.D.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(xVar2.r())));
                }
                if (xVar2.t() == W6.r.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(xVar2.r())));
                }
                if (xVar2.r() == r10) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (xVar2.q().q() != W6.p.ASYMMETRIC_PUBLIC) {
                    z8 = false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [A3.e, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [m5.L, java.lang.Object] */
    @Override // m5.InterfaceC1601E
    public void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        m5.M m10 = (m5.M) interfaceC1603G;
        S4.h hVar = (S4.h) this.f8074b;
        hVar.getClass();
        long j11 = m10.f20555a;
        m5.S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        hVar.f9095B.getClass();
        hVar.f9099F.s(rVar, m10.f20557c);
        T4.c cVar = (T4.c) m10.f20560f;
        T4.c cVar2 = hVar.f9115W;
        int size = cVar2 == null ? 0 : cVar2.f9256m.size();
        long j12 = cVar.b(0).f9277b;
        int i7 = 0;
        while (i7 < size && hVar.f9115W.b(i7).f9277b < j12) {
            i7++;
        }
        if (cVar.f9250d) {
            if (size - i7 > cVar.f9256m.size()) {
                AbstractC1705a.S("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = hVar.f9121c0;
                if (j13 == -9223372036854775807L || cVar.f9253h * 1000 > j13) {
                    hVar.f9120b0 = 0;
                } else {
                    AbstractC1705a.S("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f9253h + ", " + hVar.f9121c0);
                }
            }
            int i10 = hVar.f9120b0;
            hVar.f9120b0 = i10 + 1;
            if (i10 < hVar.f9095B.d(m10.f20557c)) {
                hVar.f9111S.postDelayed(hVar.f9104K, Math.min((hVar.f9120b0 - 1) * 1000, 5000));
                return;
            } else {
                hVar.f9110R = new IOException();
                return;
            }
        }
        hVar.f9115W = cVar;
        hVar.f9116X = cVar.f9250d & hVar.f9116X;
        hVar.f9117Y = j - j10;
        hVar.f9118Z = j;
        synchronized (hVar.f9102I) {
            try {
                if (m10.f20556b.f20628a == hVar.f9113U) {
                    Uri uri2 = hVar.f9115W.k;
                    if (uri2 == null) {
                        uri2 = m10.f20558d.f20581c;
                    }
                    hVar.f9113U = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            hVar.f9122d0 += i7;
            hVar.y(true);
            return;
        }
        T4.c cVar3 = hVar.f9115W;
        if (!cVar3.f9250d) {
            hVar.y(true);
            return;
        }
        T4.u uVar = cVar3.f9254i;
        if (uVar == null) {
            hVar.w();
            return;
        }
        String str = uVar.f9316b;
        if (n5.D.a(str, "urn:mpeg:dash:utc:direct:2014") || n5.D.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.f9119a0 = n5.D.P(uVar.f9317c) - hVar.f9118Z;
                hVar.y(true);
                return;
            } catch (C1586o0 e2) {
                AbstractC1705a.u("DashMediaSource", "Failed to resolve time offset.", e2);
                hVar.y(true);
                return;
            }
        }
        if (n5.D.a(str, "urn:mpeg:dash:utc:http-iso:2014") || n5.D.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m5.M m11 = new m5.M(hVar.f9107O, Uri.parse(uVar.f9317c), 5, new Object());
            hVar.f9108P.f(m11, new S4.f(hVar), 1);
            hVar.f9099F.z(new r(m11.f20556b), m11.f20557c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (n5.D.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || n5.D.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m5.M m12 = new m5.M(hVar.f9107O, Uri.parse(uVar.f9317c), 5, new h8.e(14));
            hVar.f9108P.f(m12, new S4.f(hVar), 1);
            hVar.f9099F.z(new r(m12.f20556b), m12.f20557c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (n5.D.a(str, "urn:mpeg:dash:utc:ntp:2014") || n5.D.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            AbstractC1705a.u("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            hVar.y(true);
        }
    }

    public String toString() {
        String str;
        switch (this.f8073a) {
            case 4:
                return S6.h.a((W6.y) this.f8074b).toString();
            case 9:
                StringBuilder sb2 = new StringBuilder("NotNullProperty(");
                if (((Integer) this.f8074b) != null) {
                    str = "value=" + ((Integer) this.f8074b);
                } else {
                    str = "value not initialized yet";
                }
                return A3.c.l(sb2, str, ')');
            default:
                return super.toString();
        }
    }

    public void u() {
        ((W1.F) this.f8074b).f10313d.R();
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable t22) {
        kotlin.jvm.internal.l.e(t22, "t2");
        String message = "retry: " + num + ", " + t22;
        ha.i t5 = (ha.i) this.f8074b;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        Thread.sleep(500L);
        return num.intValue() < 3;
    }

    @Override // P4.f0
    public boolean x(long j) {
        boolean z8;
        boolean z10 = false;
        do {
            long j10 = j();
            if (j10 == Long.MIN_VALUE) {
                break;
            }
            z8 = false;
            for (f0 f0Var : (f0[]) this.f8074b) {
                long j11 = f0Var.j();
                boolean z11 = j11 != Long.MIN_VALUE && j11 <= j;
                if (j11 == j10 || z11) {
                    z8 |= f0Var.x(j);
                }
            }
            z10 |= z8;
        } while (z8);
        return z10;
    }

    @Override // P4.f0
    public void y(long j) {
        for (f0 f0Var : (f0[]) this.f8074b) {
            f0Var.y(j);
        }
    }

    public void z() {
        U4.l lVar = (U4.l) this.f8074b;
        int i7 = lVar.f9579F - 1;
        lVar.f9579F = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (U4.r rVar : lVar.f9581H) {
            rVar.a();
            i10 += rVar.f9645W.f8119a;
        }
        m0[] m0VarArr = new m0[i10];
        int i11 = 0;
        for (U4.r rVar2 : lVar.f9581H) {
            rVar2.a();
            int i12 = rVar2.f9645W.f8119a;
            int i13 = 0;
            while (i13 < i12) {
                rVar2.a();
                m0VarArr[i11] = rVar2.f9645W.a(i13);
                i13++;
                i11++;
            }
        }
        lVar.f9580G = new n0(m0VarArr);
        lVar.f9578E.a(lVar);
    }
}
