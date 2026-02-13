package Q7;

import A0.B;
import A9.I1;
import H2.O;
import L7.C0381a;
import L7.C0385e;
import L7.E;
import N0.s;
import T7.q;
import Y5.A1;
import Y5.C0598a0;
import Y5.C0606d;
import Y5.C0632l1;
import Y5.C0633m;
import Y5.C0646q0;
import Y5.F;
import Y5.J1;
import Y5.S0;
import Y5.U;
import Y5.U0;
import Y5.W;
import Y5.X0;
import Y5.Y;
import Z9.C0665b;
import Z9.C0666c;
import Z9.C0667d;
import a.AbstractC0672a;
import a5.C0775a;
import a5.C0776b;
import a8.InterfaceC0787d;
import android.content.Context;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.Log;
import b4.C0838i;
import c8.C0915a;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C1001q;
import com.google.android.gms.common.internal.C1003t;
import com.google.android.gms.common.internal.C1004u;
import com.kt.apps.core.utils.UtilsKt;
import h3.o;
import i2.AbstractC1301I;
import ia.C1358d;
import j5.C1380c;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.m;
import l0.C1443b;
import m0.C1533b;
import n5.AbstractC1705a;
import n5.D;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import u.C2046I;
import x1.C2258b;
import y.S;

/* loaded from: classes.dex */
public final class h implements R7.d, V6.a, U0, Y, Z.i, Callback, a5.g {

    /* renamed from: e, reason: collision with root package name */
    public static h f8692e;

    /* renamed from: f, reason: collision with root package name */
    public static h f8693f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8694a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8695b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8696c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8697d;

    public h(int i7) {
        this.f8694a = 7;
        this.f8697d = StandardCharsets.ISO_8859_1;
        this.f8695b = new StringBuilder(i7);
    }

    public h(int i7, byte b2) {
        this.f8694a = i7;
        switch (i7) {
            case 7:
                this.f8697d = StandardCharsets.ISO_8859_1;
                this.f8695b = new StringBuilder();
                return;
            case 10:
                this.f8695b = new AtomicReference(Y.f.f11045b);
                this.f8696c = new Object();
                return;
            case 27:
                this.f8694a = 27;
                this.f8695b = new I1(2);
                this.f8697d = new ArrayList();
                new ArrayList();
                return;
            default:
                this.f8695b = new WeakHashMap();
                this.f8696c = new WeakHashMap();
                this.f8697d = new WeakHashMap();
                return;
        }
    }

    public /* synthetic */ h(int i7, char c10) {
        this.f8694a = i7;
    }

    public h(s sVar, h hVar) {
        this.f8694a = 1;
        this.f8695b = sVar;
        this.f8696c = hVar;
        this.f8697d = sVar.f7153a;
    }

    public h(V8.a aVar) {
        this.f8694a = 25;
        O o10 = new O(4);
        o10.f4603b = 0;
        o10.f4604c = 1;
        this.f8696c = o10;
        this.f8697d = new StringBuilder();
        this.f8695b = aVar;
    }

    public h(V8.b bVar) {
        int i7;
        int i10;
        this.f8694a = 18;
        int i11 = bVar.f10195b;
        if (i11 < 8 || i11 > 144 || (i7 = i11 & 1) != 0) {
            throw P8.f.a();
        }
        int i12 = bVar.f10194a;
        Z8.c[] cVarArr = Z8.c.f12214h;
        if (i7 != 0 || (i12 & 1) != 0) {
            throw P8.f.a();
        }
        Z8.c[] cVarArr2 = Z8.c.f12214h;
        for (int i13 = 0; i13 < 48; i13++) {
            Z8.c cVar = cVarArr2[i13];
            int i14 = cVar.f12216b;
            if (i14 == i11 && (i10 = cVar.f12217c) == i12) {
                this.f8697d = cVar;
                if (bVar.f10195b != i14) {
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
                int i15 = cVar.f12218d;
                int i16 = i14 / i15;
                int i17 = cVar.f12219e;
                int i18 = i10 / i17;
                V8.b bVar2 = new V8.b(i18 * i17, i16 * i15);
                for (int i19 = 0; i19 < i16; i19++) {
                    int i20 = i19 * i15;
                    for (int i21 = 0; i21 < i18; i21++) {
                        int i22 = i21 * i17;
                        for (int i23 = 0; i23 < i15; i23++) {
                            int i24 = ((i15 + 2) * i19) + 1 + i23;
                            int i25 = i20 + i23;
                            for (int i26 = 0; i26 < i17; i26++) {
                                if (bVar.b(((i17 + 2) * i21) + 1 + i26, i24)) {
                                    bVar2.h(i22 + i26, i25);
                                }
                            }
                        }
                    }
                }
                this.f8695b = bVar2;
                this.f8696c = new V8.b(bVar2.f10194a, bVar2.f10195b);
                return;
            }
        }
        throw P8.f.a();
    }

    public h(Y5.I1 i12, String str, J1 j12) {
        this.f8694a = 15;
        this.f8695b = str;
        this.f8696c = j12;
        Objects.requireNonNull(i12);
        this.f8697d = i12;
    }

    public h(Y5.I1 i12, String str, ArrayList arrayList) {
        this.f8694a = 14;
        this.f8695b = str;
        this.f8696c = arrayList;
        Objects.requireNonNull(i12);
        this.f8697d = i12;
    }

    public h(Context context, C0646q0 c0646q0) {
        this.f8694a = 12;
        this.f8697d = new AtomicLong(-1L);
        this.f8696c = new l(context, null, H5.b.f4893a, new C1004u("measurement:api"), k.f15009c);
        this.f8695b = c0646q0;
    }

    public h(Context context, LocationManager locationManager) {
        this.f8694a = 26;
        this.f8697d = new Object();
        this.f8695b = context;
        this.f8696c = locationManager;
    }

    public h(d1.e eVar) {
        this.f8694a = 24;
        this.f8695b = new ArrayList();
        this.f8696c = new Object();
        this.f8697d = eVar;
    }

    public h(AbstractC1301I abstractC1301I) {
        this.f8694a = 27;
        this.f8694a = 27;
        this.f8695b = new I1(2);
        T(abstractC1301I);
        this.f8697d = new ArrayList();
        new ArrayList();
    }

    public h(Class cls) {
        this.f8694a = 3;
        this.f8695b = new ConcurrentHashMap();
        this.f8697d = cls;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.f8694a = i7;
        this.f8695b = obj;
        this.f8696c = obj2;
        this.f8697d = obj3;
    }

    public h(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f8694a = 6;
        this.f8696c = arrayDeque;
        this.f8695b = bufferedReader;
    }

    public h(ArrayList arrayList) {
        this.f8694a = 28;
        this.f8695b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f8696c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C1380c c1380c = (C1380c) arrayList.get(i7);
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.f8696c;
            jArr[i10] = c1380c.f18621b;
            jArr[i10 + 1] = c1380c.f18622c;
        }
        long[] jArr2 = (long[]) this.f8696c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f8697d = copyOf;
        Arrays.sort(copyOf);
    }

    public h(C1443b c1443b) {
        this.f8694a = 29;
        this.f8697d = c1443b;
        this.f8695b = new C1358d(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(C2046I c2046i, String str, Rb.a aVar) {
        this.f8694a = 16;
        this.f8695b = c2046i;
        this.f8696c = str;
        this.f8697d = (m) aVar;
    }

    public h(C2258b c2258b, X3.a aVar, X3.c cVar) {
        this.f8694a = 8;
        this.f8697d = c2258b;
        this.f8695b = aVar;
        this.f8696c = cVar;
    }

    public h(byte[] bArr) {
        this.f8694a = 9;
        int length = bArr.length;
        int i7 = X6.f.f11002a;
        if (length != 16 && length != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(length * 8)));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f8695b = secretKeySpec;
        Cipher cipher = (Cipher) X6.a.f10994e.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] g = AbstractC0672a.g(cipher.doFinal(new byte[16]));
        this.f8696c = g;
        this.f8697d = AbstractC0672a.g(g);
    }

    public static void Z(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new RuntimeException("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new RuntimeException("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void a0(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new RuntimeException("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new RuntimeException("connection failed: 404 not found");
        }
        if (parseInt != 101) {
            throw new RuntimeException(o.l(parseInt, "connection failed: unknown status code "));
        }
    }

    public static int v(int i7, int i10, V8.a aVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (aVar.d(i7 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public byte[] A() {
        URI uri = (URI) this.f8695b;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder m10 = X.c.m(path);
        m10.append(query == null ? "" : "?".concat(query));
        String sb2 = m10.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            StringBuilder n6 = A3.c.n(host, ":");
            n6.append(uri.getPort());
            host = n6.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f8696c);
        HashMap hashMap = (HashMap) this.f8697d;
        for (String str : hashMap.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        StringBuilder m11 = X.c.m(S.b("GET ", sb2, " HTTP/1.1\r\n"));
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(": ");
            str2 = o.p(sb3, (String) linkedHashMap.get(str3), "\r\n");
        }
        m11.append(str2);
        byte[] bytes = X.c.h(m11.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public V0.l B() {
        return ((C1443b) this.f8697d).f19141a.f19138b;
    }

    public List C(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f8695b).get(new S6.d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public long D() {
        return ((C1443b) this.f8697d).f19141a.f19140d;
    }

    public boolean E() {
        String trim;
        if (((String) this.f8697d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f8696c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f8697d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f8695b).readLine();
            this.f8697d = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f8697d = trim;
        } while (trim.isEmpty());
        return true;
    }

    public boolean F(int i7) {
        int i10;
        int i11 = i7 + 1;
        V8.a aVar = (V8.a) this.f8695b;
        if (i11 > aVar.f10193b) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i10 = i12 + i7) < aVar.f10193b; i12++) {
            if (i12 == 2) {
                if (!aVar.d(i7 + 2)) {
                    return false;
                }
            } else if (aVar.d(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean G() {
        h hVar;
        return ((s) this.f8695b).f7153a != this.f8697d || ((hVar = (h) this.f8696c) != null && hVar.G());
    }

    public boolean H() {
        return P.c.b(((A7.a) this.f8695b).f531a) <= 0;
    }

    public boolean I(int i7, d1.d dVar, g1.f fVar) {
        int[] iArr = dVar.f16393p0;
        int i10 = iArr[0];
        e1.b bVar = (e1.b) this.f8696c;
        bVar.f16663a = i10;
        bVar.f16664b = iArr[1];
        bVar.f16665c = dVar.q();
        bVar.f16666d = dVar.k();
        bVar.f16670i = false;
        bVar.j = i7;
        boolean z8 = bVar.f16663a == 3;
        boolean z10 = bVar.f16664b == 3;
        boolean z11 = z8 && dVar.f16361W > 0.0f;
        boolean z12 = z10 && dVar.f16361W > 0.0f;
        int[] iArr2 = dVar.f16397t;
        if (z11 && iArr2[0] == 4) {
            bVar.f16663a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f16664b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f16667e);
        dVar.L(bVar.f16668f);
        dVar.f16344E = bVar.f16669h;
        dVar.I(bVar.g);
        bVar.j = 0;
        return bVar.f16670i;
    }

    public String J() {
        if (!E()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f8697d;
        this.f8697d = null;
        return str;
    }

    public boolean K(int i7, int i10, int i11, int i12) {
        if (i7 < 0) {
            i7 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i7 += 4 - ((i12 + 4) & 7);
        }
        if (i7 >= i11) {
            i7 -= i11;
        }
        ((V8.b) this.f8696c).h(i10, i7);
        return ((V8.b) this.f8695b).b(i10, i7);
    }

    public int L(int i7, int i10, int i11, int i12) {
        int i13 = i7 - 2;
        int i14 = i10 - 2;
        int i15 = (K(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (K(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i7 - 1;
        if (K(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (K(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (K(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (K(i7, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (K(i7, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return K(i7, i10, i11, i12) ? i23 | 1 : i23;
    }

    public boolean M(Object obj) {
        if (obj instanceof X3.b) {
            ((X3.b) obj).a().f10912a = true;
        }
        ((X3.c) this.f8696c).a(obj);
        return ((C2258b) this.f8697d).c(obj);
    }

    public void N(Object obj) {
        long b2 = Y.f.b();
        if (b2 == Y.m.f11065a) {
            this.f8697d = obj;
            return;
        }
        synchronized (this.f8696c) {
            Y.l lVar = (Y.l) ((AtomicReference) this.f8695b).get();
            int a9 = lVar.a(b2);
            if (a9 < 0) {
                ((AtomicReference) this.f8695b).set(lVar.b(obj, b2));
            } else {
                lVar.f11064c[a9] = obj;
            }
        }
    }

    public void O(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8695b = str;
    }

    public void P(j0.l lVar) {
        ((C1443b) this.f8697d).f19141a.f19139c = lVar;
    }

    public void Q(V0.c cVar) {
        ((C1443b) this.f8697d).f19141a.f19137a = cVar;
    }

    public void R(C1533b c1533b) {
        this.f8696c = c1533b;
    }

    public void S(V0.l lVar) {
        ((C1443b) this.f8697d).f19141a.f19138b = lVar;
    }

    public void T(AbstractC1301I abstractC1301I) {
        boolean z8 = ((AbstractC1301I) this.f8696c) != null;
        this.f8696c = abstractC1301I;
        if (z8) {
            ((I1) this.f8695b).b();
        }
    }

    public void U(long j) {
        ((C1443b) this.f8697d).f19141a.f19140d = j;
    }

    public void V(d1.e eVar, int i7, int i10, int i11) {
        eVar.getClass();
        int i12 = eVar.f16368b0;
        int i13 = eVar.f16370c0;
        eVar.f16368b0 = 0;
        eVar.f16370c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f16368b0 = 0;
        } else {
            eVar.f16368b0 = i12;
        }
        if (i13 < 0) {
            eVar.f16370c0 = 0;
        } else {
            eVar.f16370c0 = i13;
        }
        d1.e eVar2 = (d1.e) this.f8697d;
        eVar2.f16418t0 = i7;
        eVar2.U();
    }

    public String W(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = (String) this.f8697d;
        return str2 == null ? str : X.c.i(str2, " - ", str);
    }

    public void X() {
        C2046I c2046i = (C2046I) this.f8695b;
        String str = (String) this.f8696c;
        List list = (List) c2046i.j(str);
        if (list != null) {
            list.remove((m) this.f8697d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c2046i.l(str, list);
    }

    public void Y(d1.e eVar) {
        ArrayList arrayList = (ArrayList) this.f8695b;
        arrayList.clear();
        int size = eVar.f16415q0.size();
        for (int i7 = 0; i7 < size; i7++) {
            d1.d dVar = (d1.d) eVar.f16415q0.get(i7);
            int[] iArr = dVar.f16393p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f16417s0.f16673b = true;
    }

    @Override // R7.d
    public q a(T7.l lVar, q qVar, boolean z8) {
        T7.s sVar = (T7.s) this.f8697d;
        if (sVar == null) {
            sVar = ((q3.l) this.f8696c).y();
        }
        q3.s sVar2 = (q3.s) this.f8695b;
        C0381a y10 = ((C0381a) ((E) sVar2.f23439c).f6317a).y((C0385e) sVar2.f23438b);
        T7.s<q> C2 = y10.C(C0385e.f6337d);
        q qVar2 = null;
        if (C2 == null) {
            if (sVar != null) {
                C2 = y10.o(sVar);
            }
            return qVar2;
        }
        for (q qVar3 : C2) {
            if ((z8 ? lVar.compare(qVar, qVar3) : lVar.compare(qVar3, qVar)) > 0) {
                if (qVar2 != null) {
                    if ((z8 ? lVar.compare(qVar2, qVar3) : lVar.compare(qVar3, qVar2)) < 0) {
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar2;
    }

    @Override // a5.g
    public int b(long j) {
        long[] jArr = (long[]) this.f8697d;
        int b2 = D.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void b0(String str) {
        String W10 = W(str, new Object[0]);
        System.currentTimeMillis();
        ((A7.a) this.f8695b).k(3, (String) this.f8696c, W10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // Y5.U0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(int i7, IOException iOException, byte[] bArr) {
        X0 x02;
        AtomicReference atomicReference;
        S0 s02 = (S0) this.f8695b;
        s02.J();
        A1 a12 = (A1) this.f8697d;
        if (i7 != 200 && i7 != 204) {
            if (i7 == 304) {
                i7 = 304;
            }
            W w10 = ((C0646q0) s02.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(a12.f11205a), Integer.valueOf(i7), iOException);
            x02 = !Arrays.asList(((String) F.f11351u.a(null)).split(",")).contains(String.valueOf(i7)) ? X0.BACKOFF : X0.FAILURE;
            atomicReference = (AtomicReference) this.f8696c;
            C0632l1 o10 = ((C0646q0) s02.f3094a).o();
            long j = a12.f11205a;
            C0606d c0606d = new C0606d(x02.f11595a, j, a12.f11210f);
            o10.J();
            o10.K();
            o10.X(new C7.c(o10, o10.Z(true), c0606d, 9, false));
            W w11 = ((C0646q0) s02.f3094a).f11912f;
            C0646q0.l(w11);
            w11.f11573B.c("[sgtm] Updated status for row_id", Long.valueOf(j), x02);
            synchronized (atomicReference) {
                atomicReference.set(x02);
                atomicReference.notifyAll();
            }
            return;
        }
        if (iOException == null) {
            W w12 = ((C0646q0) s02.f3094a).f11912f;
            C0646q0.l(w12);
            w12.f11573B.b(Long.valueOf(a12.f11205a), "[sgtm] Upload succeeded for row_id");
            x02 = X0.SUCCESS;
            atomicReference = (AtomicReference) this.f8696c;
            C0632l1 o102 = ((C0646q0) s02.f3094a).o();
            long j10 = a12.f11205a;
            C0606d c0606d2 = new C0606d(x02.f11595a, j10, a12.f11210f);
            o102.J();
            o102.K();
            o102.X(new C7.c(o102, o102.Z(true), c0606d2, 9, false));
            W w112 = ((C0646q0) s02.f3094a).f11912f;
            C0646q0.l(w112);
            w112.f11573B.c("[sgtm] Updated status for row_id", Long.valueOf(j10), x02);
            synchronized (atomicReference) {
            }
        }
        W w102 = ((C0646q0) s02.f3094a).f11912f;
        C0646q0.l(w102);
        w102.f11580w.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(a12.f11205a), Integer.valueOf(i7), iOException);
        if (!Arrays.asList(((String) F.f11351u.a(null)).split(",")).contains(String.valueOf(i7))) {
        }
        atomicReference = (AtomicReference) this.f8696c;
        C0632l1 o1022 = ((C0646q0) s02.f3094a).o();
        long j102 = a12.f11205a;
        C0606d c0606d22 = new C0606d(x02.f11595a, j102, a12.f11210f);
        o1022.J();
        o1022.K();
        o1022.X(new C7.c(o1022, o1022.Z(true), c0606d22, 9, false));
        W w1122 = ((C0646q0) s02.f3094a).f11912f;
        C0646q0.l(w1122);
        w1122.f11573B.c("[sgtm] Updated status for row_id", Long.valueOf(j102), x02);
        synchronized (atomicReference) {
        }
    }

    public synchronized void c0(int i7, int i10, long j, long j10) {
        ((C0646q0) this.f8695b).f11917y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f8697d;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((H5.b) this.f8696c).c(new C1003t(0, Arrays.asList(new C1001q(36301, i7, 0, j, j10, null, null, 0, i10)))).addOnFailureListener(new A4.f(this, 3, elapsedRealtime));
    }

    @Override // a5.g
    public long d(int i7) {
        AbstractC1705a.h(i7 >= 0);
        long[] jArr = (long[]) this.f8697d;
        AbstractC1705a.h(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // V6.a
    public byte[] e(int i7, byte[] bArr) {
        byte[] I6;
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) X6.a.f10994e.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f8695b);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            I6 = android.support.v4.media.session.b.I(bArr, (max - 1) * 16, (byte[]) this.f8696c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            byte[] bArr2 = (byte[]) this.f8697d;
            if (copyOf.length != bArr2.length) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            I6 = android.support.v4.media.session.b.I(copyOf, 0, bArr2, 0, copyOf.length);
        }
        byte[] bArr3 = new byte[16];
        for (int i10 = 0; i10 < max - 1; i10++) {
            bArr3 = cipher.doFinal(android.support.v4.media.session.b.I(bArr3, 0, bArr, i10 * 16, 16));
        }
        if (I6.length == bArr3.length) {
            return Arrays.copyOf(cipher.doFinal(android.support.v4.media.session.b.I(I6, 0, bArr3, 0, I6.length)), i7);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    @Override // Y5.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(String str, int i7, IOException iOException, byte[] bArr, Map map) {
        switch (this.f8694a) {
            case 14:
                ((Y5.I1) this.f8697d).x(true, i7, iOException, bArr, (String) this.f8695b, (ArrayList) this.f8696c);
                return;
            default:
                Y5.I1 i12 = (Y5.I1) this.f8697d;
                i12.c().J();
                i12.k0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        i12.f11388I = false;
                        i12.M();
                    }
                }
                long j = ((J1) this.f8696c).f11417a;
                String str2 = (String) this.f8695b;
                if (i7 != 200) {
                    if (i7 == 204) {
                        i7 = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ?? substring = str3.substring(0, Math.min(32, str3.length()));
                    U u3 = i12.b().f11582y;
                    Integer valueOf = Integer.valueOf(i7);
                    if (iOException == null) {
                        iOException = substring;
                    }
                    u3.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, iOException);
                    C0633m c0633m = i12.f11405c;
                    Y5.I1.S(c0633m);
                    c0633m.V(Long.valueOf(j));
                    i12.L();
                    return;
                }
                if (iOException == null) {
                    C0633m c0633m2 = i12.f11405c;
                    Y5.I1.S(c0633m2);
                    c0633m2.Q(Long.valueOf(j));
                    i12.b().f11573B.c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i7));
                    C0598a0 c0598a0 = i12.f11404b;
                    Y5.I1.S(c0598a0);
                    if (c0598a0.d0()) {
                        C0633m c0633m3 = i12.f11405c;
                        Y5.I1.S(c0633m3);
                        if (c0633m3.P(str2)) {
                            i12.t(str2);
                            return;
                        }
                    }
                    i12.L();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
                U u32 = i12.b().f11582y;
                Integer valueOf2 = Integer.valueOf(i7);
                if (iOException == null) {
                }
                u32.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, iOException);
                C0633m c0633m4 = i12.f11405c;
                Y5.I1.S(c0633m4);
                c0633m4.V(Long.valueOf(j));
                i12.L();
                return;
        }
    }

    @Override // okhttp3.Callback
    public void g(Call call, Response response) {
        switch (this.f8694a) {
            case 19:
                kotlin.jvm.internal.l.e(call, "call");
                String str = (String) this.f8696c;
                C0665b c0665b = (C0665b) this.f8697d;
                UtilsKt.doOnSuccess(response, new C0667d(str, c0665b), new C0667d(c0665b, str));
                return;
            default:
                kotlin.jvm.internal.l.e(call, "call");
                final C0665b c0665b2 = (C0665b) this.f8696c;
                final String str2 = (String) this.f8697d;
                final int i7 = 0;
                final int i10 = 1;
                UtilsKt.doOnSuccess(response, new Rb.c() { // from class: Z9.G
                    @Override // Rb.c
                    public final Object invoke(Object obj) {
                        switch (i7) {
                            case 0:
                                ResponseBody it = (ResponseBody) obj;
                                kotlin.jvm.internal.l.e(it, "it");
                                for (String str3 : ac.g.r0(it.K(), new String[]{"\n"})) {
                                    if (ac.g.v0(str3).toString().length() > 0 && !ac.n.Y(ac.g.v0(str3).toString(), "#", false)) {
                                        String str4 = str2;
                                        String substring = str4.substring(0, ac.g.f0(str4, ".m3u8", 0, 6) + 5);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String substring2 = substring.substring(0, ac.g.i0(6, substring, "/"));
                                        kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                        c0665b2.invoke(X.c.i(substring2, "/", str3));
                                        return Db.q.f3365a;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            default:
                                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                                c0665b2.invoke(str2);
                                return Db.q.f3365a;
                        }
                    }
                }, new Rb.c() { // from class: Z9.G
                    @Override // Rb.c
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                ResponseBody it = (ResponseBody) obj;
                                kotlin.jvm.internal.l.e(it, "it");
                                for (String str3 : ac.g.r0(it.K(), new String[]{"\n"})) {
                                    if (ac.g.v0(str3).toString().length() > 0 && !ac.n.Y(ac.g.v0(str3).toString(), "#", false)) {
                                        String str4 = str2;
                                        String substring = str4.substring(0, ac.g.f0(str4, ".m3u8", 0, 6) + 5);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String substring2 = substring.substring(0, ac.g.i0(6, substring, "/"));
                                        kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                        c0665b2.invoke(X.c.i(substring2, "/", str3));
                                        return Db.q.f3365a;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            default:
                                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                                c0665b2.invoke(str2);
                                return Db.q.f3365a;
                        }
                    }
                });
                return;
        }
    }

    public Object h() {
        Object a9 = ((C2258b) this.f8697d).a();
        if (a9 == null) {
            a9 = ((X3.a) this.f8695b).i();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a9.getClass());
            }
        }
        if (a9 instanceof X3.b) {
            ((X3.b) a9).a().f10912a = false;
        }
        return a9;
    }

    @Override // okhttp3.Callback
    public void i(Call call, IOException iOException) {
        switch (this.f8694a) {
            case 19:
                kotlin.jvm.internal.l.e(call, "call");
                ((C0666c) this.f8695b).invoke(iOException);
                return;
            default:
                kotlin.jvm.internal.l.e(call, "call");
                ((C0666c) this.f8695b).invoke(iOException);
                return;
        }
    }

    @Override // a5.g
    public List j(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f8695b;
            if (i7 >= list.size()) {
                break;
            }
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.f8696c;
            if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                C1380c c1380c = (C1380c) list.get(i7);
                C0776b c0776b = c1380c.f18620a;
                if (c0776b.f12735e == -3.4028235E38f) {
                    arrayList2.add(c1380c);
                } else {
                    arrayList.add(c0776b);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new B(10));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            C0775a a9 = ((C1380c) arrayList2.get(i11)).f18620a.a();
            a9.f12698e = (-1) - i11;
            a9.f12699f = 1;
            arrayList.add(a9.a());
        }
        return arrayList;
    }

    public void k(Object obj) {
        ArrayList arrayList = (ArrayList) this.f8697d;
        int size = arrayList.size();
        arrayList.add(size, obj);
        ((I1) this.f8695b).g(size);
    }

    public void l(char c10) {
        ((StringBuilder) this.f8695b).append((char) (c10 & 255));
    }

    public void m(int i7) {
        t();
        V8.d a9 = V8.d.a(i7);
        if (a9 == null) {
            throw P8.f.a();
        }
        this.f8697d = Charset.forName(a9.name());
    }

    public C0838i n() {
        String str = ((String) this.f8695b) == null ? " backendName" : "";
        if (((Y3.d) this.f8697d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new C0838i((String) this.f8695b, (byte[]) this.f8696c, (Y3.d) this.f8697d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // a5.g
    public int o() {
        return ((long[]) this.f8697d).length;
    }

    public void p(String str, Throwable th, Object... objArr) {
        if (H()) {
            String W10 = W(str, objArr);
            if (th != null) {
                StringBuilder n6 = A3.c.n(W10, "\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                n6.append(stringWriter.toString());
                W10 = n6.toString();
            }
            System.currentTimeMillis();
            ((A7.a) this.f8695b).k(1, (String) this.f8696c, W10);
        }
    }

    public String q(int i7, StringBuilder sb2) {
        String str = null;
        while (true) {
            g9.h r10 = r(i7, str);
            String a9 = g9.k.a(r10.f17470c);
            if (a9 != null) {
                sb2.append(a9);
            }
            String valueOf = r10.f17472e ? String.valueOf(r10.f17471d) : null;
            int i10 = r10.f368b;
            if (i7 == i10) {
                return sb2.toString();
            }
            i7 = i10;
            str = valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0214, code lost:
    
        if (r5 <= r6.f10193b) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0217, code lost:
    
        if (r3 >= r5) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x021d, code lost:
    
        if (r6.d(r3) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0239, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023c, code lost:
    
        r1.f4603b += 3;
        r1.f4604c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0245, code lost:
    
        r3 = new A9.O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0225, code lost:
    
        if (F(r1.f4603b) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0227, code lost:
    
        r3 = r1.f4603b;
        r5 = r3 + 5;
        r6 = r6.f10193b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x022d, code lost:
    
        if (r5 >= r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022f, code lost:
    
        r1.f4603b = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0236, code lost:
    
        r1.f4604c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        r1.f4603b = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g9.h r(int i7, String str) {
        boolean d10;
        A9.O o10;
        boolean z8;
        g9.i iVar;
        A9.O o11;
        int v10;
        int v11;
        int v12;
        char c10;
        g9.g gVar;
        g9.g gVar2;
        int v13;
        int v14;
        char c11;
        g9.g gVar3;
        g9.g gVar4;
        StringBuilder sb2 = (StringBuilder) this.f8697d;
        sb2.setLength(0);
        if (str != null) {
            sb2.append(str);
        }
        O o12 = (O) this.f8696c;
        o12.f4603b = i7;
        do {
            int i10 = o12.f4603b;
            int i11 = o12.f4604c;
            V8.a aVar = (V8.a) this.f8695b;
            int i12 = 16;
            if (i11 == 2) {
                while (true) {
                    int i13 = o12.f4603b;
                    if (i13 + 5 <= aVar.f10193b && (((v13 = v(i13, 5, aVar)) >= 5 && v13 < 16) || (i13 + 6 <= aVar.f10193b && (v14 = v(i13, 6, aVar)) >= 16 && v14 < 63))) {
                        int i14 = o12.f4603b;
                        int v15 = v(i14, 5, aVar);
                        if (v15 == 15) {
                            gVar4 = new g9.g(i14 + 5, '$');
                        } else {
                            if (v15 < 5 || v15 >= 15) {
                                int v16 = v(i14, 6, aVar);
                                if (v16 < 32 || v16 >= 58) {
                                    switch (v16) {
                                        case 58:
                                            c11 = '*';
                                            break;
                                        case 59:
                                            c11 = ',';
                                            break;
                                        case 60:
                                            c11 = '-';
                                            break;
                                        case 61:
                                            c11 = '.';
                                            break;
                                        case 62:
                                            c11 = '/';
                                            break;
                                        default:
                                            throw new IllegalStateException(o.l(v16, "Decoding invalid alphanumeric value: "));
                                    }
                                    gVar3 = new g9.g(i14 + 6, c11);
                                } else {
                                    gVar3 = new g9.g(i14 + 6, (char) (v16 + 33));
                                }
                            } else {
                                gVar3 = new g9.g(i14 + 5, (char) (v15 + 43));
                            }
                            gVar4 = gVar3;
                        }
                        int i15 = gVar4.f368b;
                        o12.f4603b = i15;
                        char c12 = gVar4.f17469c;
                        if (c12 == '$') {
                            o10 = new A9.O((Object) new g9.h(i15, sb2.toString()), true);
                        } else {
                            sb2.append(c12);
                        }
                    }
                }
                int i16 = o12.f4603b;
                int i17 = i16 + 3;
                if (i17 <= aVar.f10193b) {
                    while (i16 < i17) {
                        if (!aVar.d(i16)) {
                            i16++;
                        }
                    }
                    o12.f4603b += 3;
                    o12.f4604c = 1;
                    o10 = new A9.O(4);
                    z8 = o10.f920a;
                }
                if (F(o12.f4603b)) {
                    int i18 = o12.f4603b;
                    int i19 = i18 + 5;
                    int i20 = aVar.f10193b;
                    if (i19 < i20) {
                        o12.f4603b = i18 + 5;
                    } else {
                        o12.f4603b = i20;
                    }
                    o12.f4604c = 3;
                }
                o10 = new A9.O(4);
                z8 = o10.f920a;
            } else if (i11 == 3) {
                while (true) {
                    int i21 = o12.f4603b;
                    if (i21 + 5 <= aVar.f10193b && (((v10 = v(i21, 5, aVar)) >= 5 && v10 < i12) || (i21 + 7 <= aVar.f10193b && (((v11 = v(i21, 7, aVar)) >= 64 && v11 < 116) || (i21 + 8 <= aVar.f10193b && (v12 = v(i21, 8, aVar)) >= 232 && v12 < 253))))) {
                        int i22 = o12.f4603b;
                        int v17 = v(i22, 5, aVar);
                        if (v17 == 15) {
                            gVar2 = new g9.g(i22 + 5, '$');
                        } else {
                            if (v17 < 5 || v17 >= 15) {
                                int v18 = v(i22, 7, aVar);
                                if (v18 >= 64 && v18 < 90) {
                                    gVar = new g9.g(i22 + 7, (char) (v18 + 1));
                                } else if (v18 < 90 || v18 >= 116) {
                                    switch (v(i22, 8, aVar)) {
                                        case 232:
                                            c10 = '!';
                                            break;
                                        case 233:
                                            c10 = '\"';
                                            break;
                                        case 234:
                                            c10 = '%';
                                            break;
                                        case 235:
                                            c10 = '&';
                                            break;
                                        case 236:
                                            c10 = '\'';
                                            break;
                                        case 237:
                                            c10 = '(';
                                            break;
                                        case 238:
                                            c10 = ')';
                                            break;
                                        case 239:
                                            c10 = '*';
                                            break;
                                        case 240:
                                            c10 = '+';
                                            break;
                                        case 241:
                                            c10 = ',';
                                            break;
                                        case 242:
                                            c10 = '-';
                                            break;
                                        case 243:
                                            c10 = '.';
                                            break;
                                        case 244:
                                            c10 = '/';
                                            break;
                                        case 245:
                                            c10 = ':';
                                            break;
                                        case 246:
                                            c10 = ';';
                                            break;
                                        case 247:
                                            c10 = '<';
                                            break;
                                        case 248:
                                            c10 = '=';
                                            break;
                                        case 249:
                                            c10 = '>';
                                            break;
                                        case 250:
                                            c10 = '?';
                                            break;
                                        case 251:
                                            c10 = '_';
                                            break;
                                        case 252:
                                            c10 = ' ';
                                            break;
                                        default:
                                            throw P8.f.a();
                                    }
                                    gVar = new g9.g(i22 + 8, c10);
                                } else {
                                    gVar = new g9.g(i22 + 7, (char) (v18 + 7));
                                }
                            } else {
                                gVar = new g9.g(i22 + 5, (char) (v17 + 43));
                            }
                            gVar2 = gVar;
                        }
                        int i23 = gVar2.f368b;
                        o12.f4603b = i23;
                        char c13 = gVar2.f17469c;
                        if (c13 == '$') {
                            o11 = new A9.O((Object) new g9.h(i23, sb2.toString()), true);
                        } else {
                            sb2.append(c13);
                            i12 = 16;
                        }
                    }
                }
                o10 = o11;
                z8 = o10.f920a;
            } else {
                while (true) {
                    int i24 = o12.f4603b;
                    int i25 = i24 + 7;
                    int i26 = aVar.f10193b;
                    if (i25 > i26) {
                        if (i24 + 4 > i26) {
                            d10 = false;
                            if (d10) {
                                int i27 = o12.f4603b;
                                int i28 = i27 + 7;
                                if (i28 > aVar.f10193b) {
                                    int v19 = v(i27, 4, aVar);
                                    iVar = v19 == 0 ? new g9.i(aVar.f10193b, 10, 10) : new g9.i(aVar.f10193b, v19 - 1, 10);
                                } else {
                                    int v20 = v(i27, 7, aVar) - 8;
                                    iVar = new g9.i(i28, v20 / 11, v20 % 11);
                                }
                                int i29 = iVar.f368b;
                                o12.f4603b = i29;
                                int i30 = iVar.f17473c;
                                boolean z10 = i30 == 10;
                                int i31 = iVar.f17474d;
                                if (z10) {
                                    o10 = new A9.O((Object) (i31 == 10 ? new g9.h(i29, sb2.toString()) : new g9.h(i29, sb2.toString(), i31)), true);
                                } else {
                                    sb2.append(i30);
                                    if (i31 == 10) {
                                        o10 = new A9.O((Object) new g9.h(o12.f4603b, sb2.toString()), true);
                                    } else {
                                        sb2.append(i31);
                                    }
                                }
                            } else {
                                int i32 = o12.f4603b;
                                if (i32 + 1 <= aVar.f10193b) {
                                    for (int i33 = 0; i33 < 4; i33++) {
                                        int i34 = i33 + i32;
                                        if (i34 >= aVar.f10193b) {
                                            o12.f4604c = 2;
                                            o12.f4603b += 4;
                                        } else if (!aVar.d(i34)) {
                                        }
                                    }
                                    o12.f4604c = 2;
                                    o12.f4603b += 4;
                                }
                                o10 = new A9.O(4);
                            }
                        }
                        d10 = true;
                        if (d10) {
                        }
                    } else {
                        int i35 = i24;
                        while (true) {
                            int i36 = i24 + 3;
                            if (i35 >= i36) {
                                d10 = aVar.d(i36);
                            } else if (!aVar.d(i35)) {
                                i35++;
                            }
                        }
                        d10 = true;
                        if (d10) {
                        }
                    }
                }
                z8 = o10.f920a;
            }
            int i37 = o12.f4603b;
            if (i10 == i37 && !z8) {
            }
            g9.h hVar = (g9.h) o10.f921b;
            return (hVar == null && hVar.f17472e) ? new g9.h(i37, sb2.toString(), hVar.f17471d) : new g9.h(i37, sb2.toString());
        } while (!z8);
        g9.h hVar2 = (g9.h) o10.f921b;
        if (hVar2 == null) {
        }
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f8696c;
        HashMap hashMap2 = (HashMap) this.f8695b;
        d8.f fVar = new d8.f(byteArrayOutputStream, hashMap2, hashMap, (C0915a) this.f8697d);
        InterfaceC0787d interfaceC0787d = (InterfaceC0787d) hashMap2.get(obj.getClass());
        if (interfaceC0787d != null) {
            interfaceC0787d.a(obj, fVar);
        } else {
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    public void t() {
        Charset charset = (Charset) this.f8697d;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (charset.equals(charset2)) {
            if (((StringBuilder) this.f8695b).length() > 0) {
                StringBuilder sb2 = (StringBuilder) this.f8696c;
                if (sb2 == null) {
                    this.f8696c = (StringBuilder) this.f8695b;
                    this.f8695b = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) this.f8695b);
                    this.f8695b = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (((StringBuilder) this.f8695b).length() > 0) {
            byte[] bytes = ((StringBuilder) this.f8695b).toString().getBytes(charset2);
            this.f8695b = new StringBuilder();
            StringBuilder sb3 = (StringBuilder) this.f8696c;
            if (sb3 == null) {
                this.f8696c = new StringBuilder(new String(bytes, (Charset) this.f8697d));
            } else {
                sb3.append(new String(bytes, (Charset) this.f8697d));
            }
        }
    }

    public String toString() {
        switch (this.f8694a) {
            case 7:
                t();
                StringBuilder sb2 = (StringBuilder) this.f8696c;
                return sb2 == null ? "" : sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(W(str, new Object[0]));
        sb2.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb2.append(stringWriter.toString());
        String sb3 = sb2.toString();
        System.currentTimeMillis();
        ((A7.a) this.f8695b).k(4, (String) this.f8696c, sb3);
    }

    public Object w() {
        long b2 = Y.f.b();
        if (b2 == Y.m.f11065a) {
            return this.f8697d;
        }
        Y.l lVar = (Y.l) ((AtomicReference) this.f8695b).get();
        int a9 = lVar.a(b2);
        if (a9 >= 0) {
            return lVar.f11064c[a9];
        }
        return null;
    }

    public j0.l x() {
        return ((C1443b) this.f8697d).f19141a.f19139c;
    }

    public V0.c y() {
        return ((C1443b) this.f8697d).f19141a.f19137a;
    }

    public C1533b z() {
        return (C1533b) this.f8696c;
    }
}
