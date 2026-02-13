package z7;

import P1.g;
import android.util.Base64;
import android.util.JsonReader;
import c8.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r7.C1948d;
import y7.A0;
import y7.B0;
import y7.C0;
import y7.C2410B;
import y7.C2412D;
import y7.C2413E;
import y7.C2414F;
import y7.C2415a;
import y7.C2416a0;
import y7.C2417b;
import y7.C2419c;
import y7.C2420c0;
import y7.C2421d;
import y7.C2422d0;
import y7.C2423e;
import y7.C2425f;
import y7.C2426f0;
import y7.C2427g;
import y7.C2428g0;
import y7.C2429h;
import y7.C2430h0;
import y7.C2431i;
import y7.C2433j;
import y7.C2434j0;
import y7.C2435k;
import y7.C2436k0;
import y7.C2437l;
import y7.C2439m;
import y7.C2441n;
import y7.C2443o;
import y7.C2445p;
import y7.C2446q;
import y7.C2447s;
import y7.C2448t;
import y7.C2449u;
import y7.C2450v;
import y7.C2451w;
import y7.C2452x;
import y7.C2453y;
import y7.C2454z;
import y7.D0;
import y7.E0;
import y7.F0;
import y7.G;
import y7.G0;
import y7.H;
import y7.H0;
import y7.I0;
import y7.J;
import y7.J0;
import y7.K;
import y7.K0;
import y7.L;
import y7.L0;
import y7.M0;
import y7.N;
import y7.N0;
import y7.O0;
import y7.P;
import y7.Q;
import y7.S;
import y7.T;
import y7.U;
import y7.V;
import y7.W;
import y7.Y;
import y7.p0;
import y7.q0;
import y7.r;
import y7.r0;
import y7.s0;
import y7.t0;
import y7.u0;
import y7.v0;
import y7.w0;
import y7.x0;
import y7.y0;
import y7.z0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final R7.a f28333a;

    static {
        d dVar = new d();
        C2421d c2421d = C2421d.f27252a;
        dVar.a(O0.class, c2421d);
        dVar.a(C2410B.class, c2421d);
        C2433j c2433j = C2433j.f27302a;
        dVar.a(N0.class, c2433j);
        dVar.a(J.class, c2433j);
        C2427g c2427g = C2427g.f27278a;
        dVar.a(v0.class, c2427g);
        dVar.a(K.class, c2427g);
        C2429h c2429h = C2429h.f27287a;
        dVar.a(u0.class, c2429h);
        dVar.a(L.class, c2429h);
        C2454z c2454z = C2454z.f27410a;
        dVar.a(M0.class, c2454z);
        dVar.a(C2436k0.class, c2454z);
        C2453y c2453y = C2453y.f27405a;
        dVar.a(L0.class, c2453y);
        dVar.a(C2434j0.class, c2453y);
        C2431i c2431i = C2431i.f27289a;
        dVar.a(w0.class, c2431i);
        dVar.a(N.class, c2431i);
        C2448t c2448t = C2448t.f27386a;
        dVar.a(K0.class, c2448t);
        dVar.a(P.class, c2448t);
        C2435k c2435k = C2435k.f27316a;
        dVar.a(E0.class, c2435k);
        dVar.a(Q.class, c2435k);
        C2439m c2439m = C2439m.f27332a;
        dVar.a(C0.class, c2439m);
        dVar.a(S.class, c2439m);
        C2445p c2445p = C2445p.f27365a;
        dVar.a(B0.class, c2445p);
        dVar.a(W.class, c2445p);
        C2446q c2446q = C2446q.f27369a;
        dVar.a(A0.class, c2446q);
        dVar.a(Y.class, c2446q);
        C2441n c2441n = C2441n.f27344a;
        dVar.a(y0.class, c2441n);
        dVar.a(U.class, c2441n);
        C2417b c2417b = C2417b.f27229a;
        dVar.a(q0.class, c2417b);
        dVar.a(C2412D.class, c2417b);
        C2415a c2415a = C2415a.f27221a;
        dVar.a(p0.class, c2415a);
        dVar.a(C2413E.class, c2415a);
        C2443o c2443o = C2443o.f27358a;
        dVar.a(z0.class, c2443o);
        dVar.a(V.class, c2443o);
        C2437l c2437l = C2437l.f27324a;
        dVar.a(x0.class, c2437l);
        dVar.a(T.class, c2437l);
        C2419c c2419c = C2419c.f27243a;
        dVar.a(r0.class, c2419c);
        dVar.a(C2414F.class, c2419c);
        r rVar = r.f27375a;
        dVar.a(D0.class, rVar);
        dVar.a(C2416a0.class, rVar);
        C2447s c2447s = C2447s.f27380a;
        dVar.a(F0.class, c2447s);
        dVar.a(C2420c0.class, c2447s);
        C2449u c2449u = C2449u.f27392a;
        dVar.a(G0.class, c2449u);
        dVar.a(C2422d0.class, c2449u);
        C2452x c2452x = C2452x.f27403a;
        dVar.a(J0.class, c2452x);
        dVar.a(C2430h0.class, c2452x);
        C2450v c2450v = C2450v.f27395a;
        dVar.a(I0.class, c2450v);
        dVar.a(C2426f0.class, c2450v);
        C2451w c2451w = C2451w.f27400a;
        dVar.a(H0.class, c2451w);
        dVar.a(C2428g0.class, c2451w);
        C2423e c2423e = C2423e.f27263a;
        dVar.a(t0.class, c2423e);
        dVar.a(G.class, c2423e);
        C2425f c2425f = C2425f.f27271a;
        dVar.a(s0.class, c2425f);
        dVar.a(H.class, c2425f);
        dVar.f14449d = true;
        f28333a = new R7.a(dVar, 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, y7.X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Y a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            obj.f27208d = jsonReader.nextLong();
                            obj.f27210f = (byte) (obj.f27210f | 2);
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null symbol");
                            }
                            obj.f27206b = nextString;
                            break;
                        case 2:
                            obj.f27205a = jsonReader.nextLong();
                            obj.f27210f = (byte) (obj.f27210f | 1);
                            break;
                        case 3:
                            obj.f27207c = jsonReader.nextString();
                            break;
                        case 4:
                            obj.f27209e = jsonReader.nextInt();
                            obj.f27210f = (byte) (obj.f27210f | 4);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                    }
                    switch (c10) {
                    }
                    break;
                default:
                    switch (c10) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static C2414F b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new C2414F(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" key");
        }
        if (str2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(o.o("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [y7.C, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2412D c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            obj.f27107i = d(jsonReader, new C1948d(19));
                            break;
                        case 1:
                            obj.f27100a = jsonReader.nextInt();
                            obj.j = (byte) (obj.j | 1);
                            break;
                        case 2:
                            obj.f27104e = jsonReader.nextLong();
                            obj.j = (byte) (obj.j | 8);
                            break;
                        case 3:
                            obj.f27105f = jsonReader.nextLong();
                            obj.j = (byte) (obj.j | 16);
                            break;
                        case 4:
                            obj.g = jsonReader.nextLong();
                            obj.j = (byte) (obj.j | 32);
                            break;
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null processName");
                            }
                            obj.f27101b = nextString;
                            break;
                        case 6:
                            obj.f27102c = jsonReader.nextInt();
                            obj.j = (byte) (obj.j | 2);
                            break;
                        case 7:
                            obj.f27106h = jsonReader.nextString();
                            break;
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            obj.f27103d = jsonReader.nextInt();
                            obj.j = (byte) (obj.j | 4);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                    }
                    switch (c10) {
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                    }
                    switch (c10) {
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                    }
                    switch (c10) {
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                    }
                    switch (c10) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                    }
                    switch (c10) {
                    }
                    break;
                default:
                    switch (c10) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x01a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x011f. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v10, types: [y7.e0, java.lang.Object] */
    public static List d(JsonReader jsonReader, C1948d c1948d) {
        Object c2413e;
        char c10;
        char c11;
        char c12;
        byte b2;
        byte b10 = 3;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            switch (c1948d.f23805a) {
                case 19:
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                                str2 = jsonReader.nextString();
                                if (str2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                            case 1:
                                str = jsonReader.nextString();
                                if (str == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                break;
                            case 2:
                                str3 = jsonReader.nextString();
                                if (str3 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str == null || str2 == null || str3 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (str == null) {
                            sb2.append(" arch");
                        }
                        if (str2 == null) {
                            sb2.append(" libraryName");
                        }
                        if (str3 == null) {
                            sb2.append(" buildId");
                        }
                        throw new IllegalStateException(o.o("Missing required properties:", sb2));
                    }
                    c2413e = new C2413E(str, str2, str3);
                    arrayList.add(c2413e);
                    b10 = 3;
                    break;
                case 20:
                    jsonReader.beginObject();
                    String str4 = null;
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("filename")) {
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                throw new NullPointerException("Null filename");
                            }
                        } else if (nextName2.equals("contents")) {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str4 == null || bArr == null) {
                        StringBuilder sb3 = new StringBuilder();
                        if (str4 == null) {
                            sb3.append(" filename");
                        }
                        if (bArr == null) {
                            sb3.append(" contents");
                        }
                        throw new IllegalStateException(o.o("Missing required properties:", sb3));
                    }
                    c2413e = new H(str4, bArr);
                    arrayList.add(c2413e);
                    b10 = 3;
                    break;
                case 21:
                    ?? obj = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                String nextString = jsonReader.nextString();
                                if (nextString == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                obj.f27267b = nextString;
                                break;
                            case 1:
                                obj.f27269d = jsonReader.nextLong();
                                obj.f27270e = (byte) (obj.f27270e | 1);
                                break;
                            case 2:
                                jsonReader.beginObject();
                                String str5 = null;
                                String str6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (nextName4.equals("variantId")) {
                                        str6 = jsonReader.nextString();
                                        if (str6 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (nextName4.equals("rolloutId")) {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str5 != null && str6 != null) {
                                    obj.f27266a = new C2428g0(str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (str5 == null) {
                                        sb4.append(" rolloutId");
                                    }
                                    if (str6 == null) {
                                        sb4.append(" variantId");
                                    }
                                    throw new IllegalStateException(o.o("Missing required properties:", sb4));
                                }
                            case 3:
                                String nextString2 = jsonReader.nextString();
                                if (nextString2 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                obj.f27268c = nextString2;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c2413e = obj.a();
                    arrayList.add(c2413e);
                    b10 = 3;
                    break;
                case 22:
                    jsonReader.beginObject();
                    String str7 = null;
                    List list = null;
                    byte b11 = 0;
                    int i7 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                        }
                        c12 = 65535;
                        switch (c12) {
                            case 0:
                                list = d(jsonReader, new C1948d(24));
                                if (list == null) {
                                    throw new NullPointerException("Null frames");
                                }
                            case 1:
                                str7 = jsonReader.nextString();
                                if (str7 == null) {
                                    throw new NullPointerException("Null name");
                                }
                            case 2:
                                i7 = jsonReader.nextInt();
                                b11 = (byte) (b11 | 1);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b11 != 1 || str7 == null || list == null) {
                        StringBuilder sb5 = new StringBuilder();
                        if (str7 == null) {
                            sb5.append(" name");
                        }
                        if ((b11 & 1) == 0) {
                            sb5.append(" importance");
                        }
                        if (list == null) {
                            sb5.append(" frames");
                        }
                        throw new IllegalStateException(o.o("Missing required properties:", sb5));
                    }
                    c2413e = new W(str7, i7, list);
                    arrayList.add(c2413e);
                    b10 = 3;
                    break;
                case 23:
                    jsonReader.beginObject();
                    String str8 = null;
                    String str9 = null;
                    long j = 0;
                    long j10 = 0;
                    byte b12 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    b2 = 0;
                                    break;
                                }
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    b2 = 1;
                                    break;
                                }
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    b2 = 2;
                                    break;
                                }
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    b2 = b10;
                                    break;
                                }
                                break;
                        }
                        b2 = -1;
                        switch (b2) {
                            case 0:
                                str8 = jsonReader.nextString();
                                if (str8 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case 1:
                                b12 = (byte) (b12 | 2);
                                j10 = jsonReader.nextLong();
                                break;
                            case 2:
                                str9 = new String(Base64.decode(jsonReader.nextString(), 2), O0.f27172a);
                                break;
                            case 3:
                                b12 = (byte) (b12 | 1);
                                j = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b12 != b10 || str8 == null) {
                        StringBuilder sb6 = new StringBuilder();
                        if ((b12 & 1) == 0) {
                            sb6.append(" baseAddress");
                        }
                        if ((b12 & 2) == 0) {
                            sb6.append(" size");
                        }
                        if (str8 == null) {
                            sb6.append(" name");
                        }
                        throw new IllegalStateException(o.o("Missing required properties:", sb6));
                    }
                    c2413e = new T(j, j10, str8, str9);
                    arrayList.add(c2413e);
                    b10 = 3;
                    break;
                default:
                    c2413e = a(jsonReader);
                    arrayList.add(c2413e);
                    b10 = 3;
            }
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0063. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, y7.b0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [y7.O, java.lang.Object] */
    public static P e(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c14 = 0;
                                    break;
                                }
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c14 = 1;
                                    break;
                                }
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c14 = 2;
                                    break;
                                }
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c14 = 3;
                                    break;
                                }
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c14 = 4;
                                    break;
                                }
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c14 = 5;
                                    break;
                                }
                                break;
                        }
                        c14 = 65535;
                        switch (c14) {
                            case 0:
                                obj2.f27237a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f27238b = jsonReader.nextInt();
                                obj2.g = (byte) (obj2.g | 1);
                                break;
                            case 2:
                                obj2.f27240d = jsonReader.nextInt();
                                obj2.g = (byte) (obj2.g | 4);
                                break;
                            case 3:
                                obj2.f27242f = jsonReader.nextLong();
                                obj2.g = (byte) (obj2.g | 16);
                                break;
                            case 4:
                                obj2.f27241e = jsonReader.nextLong();
                                obj2.g = (byte) (obj2.g | 8);
                                break;
                            case 5:
                                obj2.f27239c = jsonReader.nextBoolean();
                                obj2.g = (byte) (obj2.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f27169d = obj2.a();
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d10 = d(jsonReader, new C1948d(21));
                            if (d10 == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = d10;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                    obj.f27171f = new C2430h0(list);
                case 2:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    S s3 = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    C2416a0 c2416a0 = null;
                    List list4 = null;
                    int i7 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c11 = 6;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        switch (c11) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = Collections.unmodifiableList(arrayList);
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                U u3 = null;
                                C2412D c2412d = null;
                                V v10 = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c12 = 0;
                                                break;
                                            }
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c12 = 1;
                                                break;
                                            }
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c12 = 2;
                                                break;
                                            }
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c12 = 3;
                                                break;
                                            }
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c12 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c12 = 65535;
                                    switch (c12) {
                                        case 0:
                                            c2412d = c(jsonReader);
                                            break;
                                        case 1:
                                            list5 = d(jsonReader, new C1948d(22));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j = 0;
                                            byte b10 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c13 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c13 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c13 = 2;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                c13 = 65535;
                                                switch (c13) {
                                                    case 0:
                                                        b10 = (byte) (b10 | 1);
                                                        j = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b10 == 1 && str != null && str2 != null) {
                                                v10 = new V(j, str, str2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (str == null) {
                                                    sb2.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb2.append(" code");
                                                }
                                                if ((b10 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                throw new IllegalStateException(o.o("Missing required properties:", sb2));
                                            }
                                        case 3:
                                            list6 = d(jsonReader, new C1948d(23));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case 4:
                                            u3 = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (v10 != null && list6 != null) {
                                    s3 = new S(list5, u3, c2412d, v10, list6);
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (v10 == null) {
                                        sb3.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb3.append(" binaries");
                                    }
                                    throw new IllegalStateException(o.o("Missing required properties:", sb3));
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                i7 = jsonReader.nextInt();
                                b2 = (byte) 1;
                                break;
                            case 6:
                                c2416a0 = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b2 != 1 || s3 == null) {
                        StringBuilder sb4 = new StringBuilder();
                        if (s3 == null) {
                            sb4.append(" execution");
                        }
                        if (b2 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(o.o("Missing required properties:", sb4));
                    }
                    obj.f27168c = new Q(s3, list2, list3, bool, c2416a0, list4, i7);
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str3 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    obj.f27170e = new C2422d0(str3);
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    obj.f27167b = nextString2;
                case 5:
                    obj.f27166a = jsonReader.nextLong();
                    obj.g = (byte) (obj.g | 1);
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static U f(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i7 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        U u3 = null;
        byte b2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            List d10 = d(jsonReader, new C1948d(24));
                            if (d10 == null) {
                                throw new NullPointerException("Null frames");
                            }
                            list = d10;
                            break;
                        case 1:
                            str2 = jsonReader.nextString();
                            break;
                        case 2:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null type");
                            }
                            str = nextString;
                            break;
                        case 3:
                            u3 = f(jsonReader);
                            break;
                        case 4:
                            i7 = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                    }
                    switch (c10) {
                    }
                    break;
                default:
                    switch (c10) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (b2 == 1 && str != null && list != null) {
            return new U(str, str2, list, u3, i7);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" type");
        }
        if (list == null) {
            sb2.append(" frames");
        }
        if ((b2 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(o.o("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y7.Z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2416a0 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            obj.f27217b = jsonReader.nextInt();
                            obj.f27220e = (byte) (obj.f27220e | 1);
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null processName");
                            }
                            obj.f27216a = nextString;
                            break;
                        case 2:
                            obj.f27219d = jsonReader.nextBoolean();
                            obj.f27220e = (byte) (obj.f27220e | 4);
                            break;
                        case 3:
                            obj.f27218c = jsonReader.nextInt();
                            obj.f27220e = (byte) (obj.f27220e | 2);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    break;
                default:
                    switch (c10) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x017e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:182:0x03ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00be. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, y7.I] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v100, types: [y7.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, y7.M] */
    /* JADX WARN: Type inference failed for: r4v0, types: [y7.A, java.lang.Object] */
    public static C2410B h(JsonReader jsonReader) {
        ?? r10;
        byte b2;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        char c10;
        byte b14;
        byte b15 = 4;
        boolean z8 = false;
        Charset charset = O0.f27172a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        r10 = z8;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        r10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        r10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        r10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        r10 = b15;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        r10 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        r10 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        r10 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        r10 = 8;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        r10 = 9;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        r10 = 10;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        r10 = 11;
                        break;
                    }
                    break;
            }
            r10 = -1;
            switch (r10) {
                case 0:
                    b2 = b15;
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new C1948d(20));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    obj.k = new G(list, str);
                    b15 = b2;
                    z8 = false;
                case 1:
                    b2 = b15;
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    obj.f27081a = nextString;
                    b15 = b2;
                    z8 = false;
                case 2:
                    b2 = b15;
                    obj.g = jsonReader.nextString();
                    b15 = b2;
                    z8 = false;
                case 3:
                    b2 = b15;
                    obj.f27089l = c(jsonReader);
                    b15 = b2;
                    z8 = false;
                case 4:
                    b2 = b15;
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    obj.f27087h = nextString2;
                    b15 = b2;
                    z8 = false;
                case 5:
                    b2 = b15;
                    obj.f27086f = jsonReader.nextString();
                    b15 = b2;
                    z8 = false;
                case 6:
                    b2 = b15;
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    obj.f27082b = nextString3;
                    b15 = b2;
                    z8 = false;
                case 7:
                    b2 = b15;
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    obj.f27084d = nextString4;
                    b15 = b2;
                    z8 = false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    b2 = b15;
                    obj.f27085e = jsonReader.nextString();
                    b15 = b2;
                    z8 = false;
                case 9:
                    b2 = b15;
                    obj.f27083c = jsonReader.nextInt();
                    obj.f27090m = (byte) (obj.f27090m | 1);
                    b15 = b2;
                    z8 = false;
                case 10:
                    b2 = b15;
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    obj.f27088i = nextString5;
                    b15 = b2;
                    z8 = false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    ?? obj2 = new Object();
                    obj2.f27130f = z8;
                    obj2.f27134m = (byte) (obj2.f27134m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    b10 = 0;
                                    break;
                                }
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    b10 = 1;
                                    break;
                                }
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    b10 = 2;
                                    break;
                                }
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    b10 = 3;
                                    break;
                                }
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    b10 = b15;
                                    break;
                                }
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    b10 = 5;
                                    break;
                                }
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    b10 = 6;
                                    break;
                                }
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    b10 = 7;
                                    break;
                                }
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    b10 = 8;
                                    break;
                                }
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    b10 = 9;
                                    break;
                                }
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    b10 = 10;
                                    break;
                                }
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    b10 = 11;
                                    break;
                                }
                                break;
                        }
                        b10 = -1;
                        switch (b10) {
                            case 0:
                                b11 = b15;
                                obj2.f27128d = jsonReader.nextLong();
                                obj2.f27134m = (byte) (obj2.f27134m | 1);
                                b15 = b11;
                            case 1:
                                b11 = b15;
                                obj2.f27127c = jsonReader.nextString();
                                b15 = b11;
                            case 2:
                                b11 = b15;
                                obj2.f27126b = new String(Base64.decode(jsonReader.nextString(), 2), O0.f27172a);
                                b15 = b11;
                            case 3:
                                b11 = b15;
                                obj2.f27129e = Long.valueOf(jsonReader.nextLong());
                                b15 = b11;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                b12 = 0;
                                                break;
                                            }
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                b12 = 1;
                                                break;
                                            }
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                b12 = 2;
                                                break;
                                            }
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                b12 = 3;
                                                break;
                                            }
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                b12 = b15;
                                                break;
                                            }
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                b12 = 5;
                                                break;
                                            }
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                b12 = 6;
                                                break;
                                            }
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                b12 = 7;
                                                break;
                                            }
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                b12 = 8;
                                                break;
                                            }
                                            break;
                                    }
                                    b12 = -1;
                                    switch (b12) {
                                        case 0:
                                            b13 = b15;
                                            obj3.f27155f = jsonReader.nextBoolean();
                                            obj3.j = (byte) (obj3.j | 16);
                                            b15 = b13;
                                        case 1:
                                            b13 = b15;
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            obj3.f27156h = nextString6;
                                            b15 = b13;
                                        case 2:
                                            obj3.f27153d = jsonReader.nextLong();
                                            b13 = 4;
                                            obj3.j = (byte) (obj3.j | 4);
                                            b15 = b13;
                                        case 3:
                                            obj3.f27150a = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 1);
                                            b13 = b15;
                                            b15 = b13;
                                        case 4:
                                            obj3.f27154e = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 8);
                                            b13 = b15;
                                            b15 = b13;
                                        case 5:
                                            obj3.f27152c = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 2);
                                            b13 = b15;
                                            b15 = b13;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            obj3.f27151b = nextString7;
                                            b13 = b15;
                                            b15 = b13;
                                        case 7:
                                            obj3.g = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 32);
                                            b13 = b15;
                                            b15 = b13;
                                        case g.BYTES_FIELD_NUMBER /* 8 */:
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            obj3.f27157i = nextString8;
                                            b13 = b15;
                                            b15 = b13;
                                        default:
                                            jsonReader.skipValue();
                                            b13 = b15;
                                            b15 = b13;
                                    }
                                }
                                b11 = b15;
                                jsonReader.endObject();
                                obj2.j = obj3.a();
                                b15 = b11;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.k = Collections.unmodifiableList(arrayList);
                                b11 = b15;
                                b15 = b11;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c10 = 0;
                                                break;
                                            }
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c10 = 1;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c10 = 2;
                                                break;
                                            }
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c10 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    c10 = 65535;
                                    switch (c10) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            obj4.f27299c = nextString9;
                                            break;
                                        case 1:
                                            obj4.f27300d = jsonReader.nextBoolean();
                                            obj4.f27301e = (byte) (obj4.f27301e | 2);
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            obj4.f27298b = nextString10;
                                            break;
                                        case 3:
                                            obj4.f27297a = jsonReader.nextInt();
                                            obj4.f27301e = (byte) (obj4.f27301e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f27132i = obj4.a();
                                b11 = b15;
                                b15 = b11;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                b14 = 0;
                                                break;
                                            }
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                b14 = 1;
                                                break;
                                            }
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                b14 = 2;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                b14 = 3;
                                                break;
                                            }
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                b14 = b15;
                                                break;
                                            }
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                b14 = 5;
                                                break;
                                            }
                                            break;
                                    }
                                    b14 = -1;
                                    switch (b14) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 == null || str3 == null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(o.o("Missing required properties:", sb2));
                                }
                                obj2.g = new K(str2, str3, str4, str5, str6, str7);
                                b11 = b15;
                                b15 = b11;
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                obj2.f27131h = new C2436k0(str8);
                                b11 = b15;
                                b15 = b11;
                            case 9:
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                obj2.f27125a = nextString11;
                                b11 = b15;
                                b15 = b11;
                            case 10:
                                obj2.f27130f = jsonReader.nextBoolean();
                                obj2.f27134m = (byte) (obj2.f27134m | 2);
                                b11 = b15;
                                b15 = b11;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                obj2.f27133l = jsonReader.nextInt();
                                obj2.f27134m = (byte) (obj2.f27134m | b15);
                                b11 = b15;
                                b15 = b11;
                            default:
                                jsonReader.skipValue();
                                b11 = b15;
                                b15 = b11;
                        }
                    }
                    b2 = b15;
                    jsonReader.endObject();
                    obj.j = obj2.a();
                    b15 = b2;
                    z8 = false;
                    break;
                default:
                    jsonReader.skipValue();
                    b2 = b15;
                    b15 = b2;
                    z8 = false;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static C2410B i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C2410B h10 = h(jsonReader);
                jsonReader.close();
                return h10;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }
}
