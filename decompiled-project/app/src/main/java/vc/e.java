package vc;

import ea.C1111f;
import h3.o;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import l2.X;
import wc.l;
import yc.C2480b;
import yc.E;

/* loaded from: classes2.dex */
public final class e extends c {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f25463q = Pattern.compile("(\\w+)/\\w*\\+?xml.*");

    /* renamed from: f, reason: collision with root package name */
    public int f25464f;
    public ByteBuffer g;

    /* renamed from: h, reason: collision with root package name */
    public wc.a f25465h;

    /* renamed from: i, reason: collision with root package name */
    public h f25466i;
    public String j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public int f25467l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25468m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25469n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f25470o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final d f25471p;

    public e(d dVar) {
        this.f25471p = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f6, code lost:
    
        if (r4.matcher(r1).matches() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fa, code lost:
    
        if (r13.f25459l != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fc, code lost:
    
        r13.k = new yc.E(new yc.n1());
        r13.f25459l = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248 A[Catch: all -> 0x0174, IOException -> 0x0177, TryCatch #0 {IOException -> 0x0177, blocks: (B:39:0x0151, B:41:0x0161, B:43:0x0165, B:45:0x016b, B:46:0x017b, B:48:0x0185, B:49:0x0189, B:51:0x0194, B:53:0x019c, B:54:0x01a0, B:57:0x01bb, B:61:0x01c5, B:64:0x01cb, B:66:0x01d3, B:69:0x01de, B:70:0x01eb, B:72:0x01ee, B:74:0x01f8, B:76:0x01fc, B:77:0x020a, B:79:0x0216, B:81:0x021a, B:83:0x0226, B:85:0x0240, B:87:0x0248, B:88:0x0256, B:91:0x024b, B:92:0x022d, B:94:0x0235, B:95:0x0266, B:96:0x0272, B:97:0x0281), top: B:38:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024b A[Catch: all -> 0x0174, IOException -> 0x0177, TryCatch #0 {IOException -> 0x0177, blocks: (B:39:0x0151, B:41:0x0161, B:43:0x0165, B:45:0x016b, B:46:0x017b, B:48:0x0185, B:49:0x0189, B:51:0x0194, B:53:0x019c, B:54:0x01a0, B:57:0x01bb, B:61:0x01c5, B:64:0x01cb, B:66:0x01d3, B:69:0x01de, B:70:0x01eb, B:72:0x01ee, B:74:0x01f8, B:76:0x01fc, B:77:0x020a, B:79:0x0216, B:81:0x021a, B:83:0x0226, B:85:0x0240, B:87:0x0248, B:88:0x0256, B:91:0x024b, B:92:0x022d, B:94:0x0235, B:95:0x0266, B:96:0x0272, B:97:0x0281), top: B:38:0x0151 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e g(d dVar, e eVar) {
        String str;
        h hVar;
        InputStream inflaterInputStream;
        Constructor constructor;
        String str2;
        ReentrantLock reentrantLock = dVar.f25462o;
        i.x("Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.", reentrantLock.tryLock());
        URL f4 = dVar.f();
        if (f4 == null) {
            throw new IllegalArgumentException("URL must be specified to connect");
        }
        String protocol = f4.getProtocol();
        if (!protocol.equals("http") && !protocol.equals("https")) {
            throw new MalformedURLException("Only http & https protocols supported");
        }
        boolean b2 = o.b(dVar.f25452b);
        if (!b2) {
            switch (dVar.f25452b) {
                case 1:
                    str2 = "GET";
                    break;
                case 2:
                    str2 = "POST";
                    break;
                case 3:
                    str2 = "PUT";
                    break;
                case 4:
                    str2 = "DELETE";
                    break;
                case 5:
                    str2 = "PATCH";
                    break;
                case 6:
                    str2 = "HEAD";
                    break;
                case 7:
                    str2 = "OPTIONS";
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "TRACE";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            "Cannot set a request body for HTTP method ".concat(str2);
        }
        ArrayList arrayList = dVar.f25458i;
        e eVar2 = null;
        if (!arrayList.isEmpty() && !b2) {
            C1111f c1111f = new C1111f(dVar.f());
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw o.j(it);
            }
            URL l10 = c1111f.l();
            i.E(l10, "url");
            dVar.f25451a = new C1111f(l10).l();
            arrayList.clear();
        } else if (b2) {
            List b10 = dVar.b("Content-Type");
            String j = !b10.isEmpty() ? l.j(b10, ", ") : null;
            if (j == null) {
                Charset charset = f.f25472b;
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw o.j(it2);
                }
                dVar.d("Content-Type", "application/x-www-form-urlencoded; charset=" + dVar.f25460m);
            } else if (j.contains("multipart/form-data") && !j.contains("boundary")) {
                Pattern pattern = b.f25445a;
                StringBuilder b11 = l.b();
                Random random = new Random();
                for (int i7 = 0; i7 < 32; i7++) {
                    char[] cArr = b.f25448d;
                    b11.append(cArr[random.nextInt(cArr.length)]);
                }
                str = l.l(b11);
                dVar.d("Content-Type", "multipart/form-data; boundary=" + str);
                dVar.j = str;
            }
            str = null;
            dVar.j = str;
        }
        long nanoTime = System.nanoTime();
        Constructor constructor2 = g.f25474a;
        if (!Boolean.parseBoolean(System.getProperty("jsoup.useHttpClient", "true")) || (constructor = g.f25474a) == null) {
            hVar = new h(dVar, eVar);
        } else {
            try {
                hVar = (h) constructor.newInstance(dVar, eVar);
            } catch (Exception unused) {
                hVar = new h(dVar, eVar);
            }
        }
        try {
            try {
                e b12 = hVar.b();
                try {
                    i.C("Location", "name");
                    if (!b12.b("Location").isEmpty() && dVar.f25457h) {
                        if (b12.f25464f != 307) {
                            dVar.f25452b = 1;
                            arrayList.clear();
                            dVar.e("Content-Type");
                        }
                        List b13 = b12.b("Location");
                        String j10 = b13.isEmpty() ? null : l.j(b13, ", ");
                        i.D(j10);
                        if (j10.startsWith("http:/") && j10.charAt(6) != '/') {
                            j10 = j10.substring(6);
                        }
                        dVar.f25451a = new C1111f(l.m(dVar.f(), j10)).l();
                        e g = g(dVar, b12);
                        reentrantLock.unlock();
                        return g;
                    }
                    int i10 = b12.f25464f;
                    if (i10 < 200 || i10 >= 400) {
                        throw new A3.e(b12.f25464f, dVar.f().toString());
                    }
                    String str3 = b12.k;
                    Pattern pattern2 = f25463q;
                    if (str3 != null && !str3.startsWith("text/") && !pattern2.matcher(str3).matches()) {
                        throw new uc.b(str3, dVar.f().toString());
                    }
                    b12.j = b.b(b12.k);
                    if (b12.f25467l == 0 || dVar.f25452b == 6) {
                        b12.g = ByteBuffer.allocate(0);
                    } else {
                        InputStream c10 = hVar.c();
                        if (b12.c("gzip")) {
                            inflaterInputStream = new GZIPInputStream(c10);
                        } else {
                            if (b12.c("deflate")) {
                                inflaterInputStream = new InflaterInputStream(c10, new Inflater(true));
                            }
                            int i11 = dVar.g;
                            int i12 = wc.a.f25859x;
                            wc.a aVar = !(c10 instanceof wc.a) ? (wc.a) c10 : new wc.a(new wc.e(c10), i11);
                            long j11 = dVar.f25456f;
                            aVar.f25862c = nanoTime;
                            aVar.f25863d = j11 * 1000000;
                            b12.f25465h = aVar;
                            int i13 = d.f25455p;
                        }
                        c10 = inflaterInputStream;
                        int i112 = dVar.g;
                        int i122 = wc.a.f25859x;
                        if (!(c10 instanceof wc.a)) {
                        }
                        long j112 = dVar.f25456f;
                        aVar.f25862c = nanoTime;
                        aVar.f25863d = j112 * 1000000;
                        b12.f25465h = aVar;
                        int i132 = d.f25455p;
                    }
                    reentrantLock.unlock();
                    b12.f25468m = true;
                    return b12;
                } catch (IOException e2) {
                    e = e2;
                    eVar2 = b12;
                    if (eVar2 != null) {
                        eVar2.j();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public static void k(d dVar, OutputStream outputStream) {
        ArrayList arrayList = dVar.f25458i;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, dVar.f25460m));
        String str = dVar.j;
        if (str != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("\r\n");
                bufferedWriter.write("Content-Disposition: form-data; name=\"");
                throw null;
            }
            bufferedWriter.write("--");
            bufferedWriter.write(str);
            bufferedWriter.write("--");
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw o.j(it2);
            }
        }
        bufferedWriter.close();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [vc.f, java.lang.Object] */
    public final xc.g h() {
        X x2;
        i.x("Request must be executed (with .execute(), .get(), or .post() before parsing response", this.f25468m);
        wc.a aVar = this.f25465h;
        if (this.g != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.g.array(), 0, this.g.limit());
            int i7 = wc.a.f25859x;
            wc.a aVar2 = new wc.a(new wc.e(byteArrayInputStream), 0);
            this.f25469n = false;
            aVar = aVar2;
        }
        if (this.f25469n) {
            throw new IllegalArgumentException("Input stream already read and parsed, cannot re-read.");
        }
        i.D(aVar);
        this.f25469n = true;
        String str = this.j;
        String externalForm = this.f25451a.toExternalForm();
        d dVar = this.f25471p;
        E e2 = dVar.k;
        try {
            x2 = b.a(aVar, str, externalForm, e2);
            try {
                xc.g c10 = b.c(x2, externalForm, e2);
                ((wc.a) x2.f19195c).close();
                new Object().f25473a = dVar;
                this.j = c10.f26341x.f26336b.name();
                j();
                return c10;
            } catch (Throwable th) {
                th = th;
                if (x2 != null) {
                    ((wc.a) x2.f19195c).close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            x2 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[ADDED_TO_REGION, LOOP:3: B:36:0x00ad->B:39:0x00b8, LOOP_START, PHI: r4 r14
      0x00ad: PHI (r4v7 byte) = (r4v4 byte), (r4v10 byte) binds: [B:35:0x00a7, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:35:0x00a7, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(LinkedHashMap linkedHashMap, e eVar) {
        boolean z8;
        int i7;
        char c10 = 240;
        char c11 = 224;
        char c12 = 2;
        int i10 = 3;
        LinkedHashMap linkedHashMap2 = this.f25454d;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null && StandardCharsets.ISO_8859_1.newEncoder().canEncode(str2)) {
                        byte[] bytes = str2.getBytes(f.f25472b);
                        int i11 = (bytes.length >= i10 && (bytes[0] & 255) == 239 && (bytes[1] & 255) == 187 && (bytes[c12] & 255) == 191) ? i10 : 0;
                        int length = bytes.length;
                        boolean z10 = false;
                        while (i11 < length) {
                            byte b2 = bytes[i11];
                            if ((b2 & 128) != 0) {
                                byte b10 = 192;
                                if ((b2 & 224) != 192) {
                                    if ((b2 & 240) != c11) {
                                        c12 = 2;
                                        if ((b2 & 248) != c10) {
                                            i10 = 3;
                                            z8 = false;
                                            break;
                                        }
                                        i10 = 3;
                                        i7 = i11 + 3;
                                        if (i7 >= bytes.length) {
                                            while (i11 < i7) {
                                                i11++;
                                                if ((bytes[i11] & b10) == 128) {
                                                    b10 = 192;
                                                }
                                            }
                                            z10 = true;
                                        }
                                        z8 = false;
                                        break;
                                    }
                                    c12 = 2;
                                    i7 = i11 + 2;
                                } else {
                                    i7 = i11 + 1;
                                    c12 = 2;
                                }
                                i10 = 3;
                                if (i7 >= bytes.length) {
                                }
                                z8 = false;
                                break;
                            }
                            c12 = 2;
                            i10 = 3;
                            i11++;
                            c10 = 240;
                            c11 = 224;
                        }
                        z8 = z10;
                        if (z8) {
                            str2 = new String(bytes, b.f25446b);
                        }
                    }
                    a(str, str2);
                    c10 = 240;
                    c11 = 224;
                }
            }
        }
        URL url = this.f25451a;
        Map map = a.f25444a;
        try {
            this.f25471p.f25461n.put(url.toURI(), linkedHashMap);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str3 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (str3.equalsIgnoreCase("Set-Cookie")) {
                    for (String str4 : list) {
                        if (str4 != null) {
                            C2480b c2480b = new C2480b(str4);
                            String trim = c2480b.U('=').trim();
                            c2480b.l();
                            String trim2 = c2480b.U(';').trim();
                            if (!trim.isEmpty()) {
                                i.C(trim, "name");
                                i.E(trim2, "value");
                                linkedHashMap2.put(trim, trim2);
                            }
                            c2480b.close();
                        }
                    }
                }
            }
            if (eVar != null) {
                for (Map.Entry entry3 : eVar.f25454d.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    i.C(str5, "name");
                    if (!linkedHashMap2.containsKey(str5)) {
                        String str6 = (String) entry3.getKey();
                        String str7 = (String) entry3.getValue();
                        i.C(str6, "name");
                        i.E(str7, "value");
                        linkedHashMap2.put(str6, str7);
                    }
                }
                eVar.j();
                int i12 = eVar.f25470o + 1;
                this.f25470o = i12;
                if (i12 < 20) {
                    return;
                }
                throw new IOException("Too many redirects occurred trying to load URL " + eVar.f());
            }
        } catch (URISyntaxException e2) {
            MalformedURLException malformedURLException = new MalformedURLException(e2.getMessage());
            malformedURLException.initCause(e2);
            throw malformedURLException;
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection;
        wc.a aVar = this.f25465h;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f25465h = null;
                throw th;
            }
            this.f25465h = null;
        }
        h hVar = this.f25466i;
        if (hVar == null || (httpURLConnection = hVar.f25477c) == null) {
            return;
        }
        httpURLConnection.disconnect();
        hVar.f25477c = null;
    }
}
