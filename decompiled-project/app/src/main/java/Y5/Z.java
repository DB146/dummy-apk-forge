package Y5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11604a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final URL f11605b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11606c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11607d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11608e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f11609f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C9.h f11610u;

    public Z(V0 v02, String str, URL url, byte[] bArr, HashMap hashMap, U0 u02) {
        Objects.requireNonNull(v02);
        this.f11610u = v02;
        com.google.android.gms.common.internal.G.d(str);
        this.f11605b = url;
        this.f11606c = bArr;
        this.f11608e = u02;
        this.f11607d = str;
        this.f11609f = hashMap;
    }

    public Z(C0598a0 c0598a0, String str, URL url, byte[] bArr, Map map, Y y10) {
        Objects.requireNonNull(c0598a0);
        this.f11610u = c0598a0;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.g(url);
        this.f11605b = url;
        this.f11606c = bArr;
        this.f11608e = y10;
        this.f11607d = str;
        this.f11609f = map;
    }

    public void a(int i7, IOException iOException, byte[] bArr, Map map) {
        C0640o0 c0640o0 = ((C0646q0) ((V0) this.f11610u).f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new W1.j0(this, i7, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0280: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:177:0x027f */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0283: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:174:0x0282 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r7v23, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i10;
        Map map2;
        T t5;
        C0640o0 c0640o0;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        Map<String, List<String>> headerFields;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Throwable th;
        HttpURLConnection httpURLConnection2;
        ?? r62;
        Map map5;
        IOException e2;
        ?? r63;
        Map map6;
        Map map7;
        int responseCode2;
        InputStream inputStream2;
        switch (this.f11604a) {
            case 0:
                String str = this.f11607d;
                C0598a0 c0598a0 = (C0598a0) this.f11610u;
                C0646q0 c0646q0 = (C0646q0) c0598a0.f3094a;
                C0646q0 c0646q02 = (C0646q0) c0598a0.f3094a;
                C0640o0 c0640o02 = c0646q0.f11913u;
                C0646q0.l(c0640o02);
                c0640o02.N();
                OutputStream outputStream = null;
                try {
                    openConnection = this.f11605b.openConnection();
                } catch (IOException e10) {
                    iOException = e10;
                    i10 = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 0;
                    httpURLConnection = null;
                    map = null;
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                c0646q02.getClass();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    Map map8 = this.f11609f;
                    if (map8 != null) {
                        for (Map.Entry entry : map8.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr2 = this.f11606c;
                    if (bArr2 != null) {
                        C0598a0 c0598a02 = c0598a0.f12021b.f11409u;
                        I1.S(c0598a02);
                        byte[] v02 = c0598a02.v0(bArr2);
                        W w10 = c0646q02.f11912f;
                        C0646q0.l(w10);
                        U u3 = w10.f11573B;
                        int length = v02.length;
                        u3.b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream2 = httpURLConnection.getOutputStream();
                        try {
                            outputStream2.write(v02);
                            outputStream2.close();
                        } catch (IOException e11) {
                            iOException = e11;
                            i10 = 0;
                            map2 = null;
                            outputStream = outputStream2;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e12) {
                                    W w11 = c0646q02.f11912f;
                                    C0646q0.l(w11);
                                    w11.f11577f.c("Error closing HTTP compressed POST connection output stream. appId", W.R(str), e12);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c0640o0 = c0646q02.f11913u;
                            C0646q0.l(c0640o0);
                            t5 = new T(this.f11607d, (Y) this.f11608e, i10, iOException, (byte[]) null, map2);
                            c0640o0.S(t5);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            i7 = 0;
                            map = null;
                            outputStream = outputStream2;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e13) {
                                    W w12 = c0646q02.f11912f;
                                    C0646q0.l(w12);
                                    w12.f11577f.c("Error closing HTTP compressed POST connection output stream. appId", W.R(str), e13);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C0640o0 c0640o03 = c0646q02.f11913u;
                            C0646q0.l(c0640o03);
                            c0640o03.S(new T(this.f11607d, (Y) this.f11608e, i7, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e14) {
                    iOException = e14;
                    i10 = 0;
                    map2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    i7 = 0;
                    map = null;
                }
                try {
                    try {
                        headerFields = httpURLConnection.getHeaderFields();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                        try {
                            bArr = new byte[1024];
                        } catch (Throwable th6) {
                            th = th6;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i10 = responseCode;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        c0640o0 = c0646q02.f11913u;
                        C0646q0.l(c0640o0);
                        t5 = new T(this.f11607d, (Y) this.f11608e, i10, iOException, (byte[]) null, map2);
                        c0640o0.S(t5);
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        i7 = responseCode;
                        map = map3;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        C0640o0 c0640o032 = c0646q02.f11913u;
                        C0646q0.l(c0640o032);
                        c0640o032.S(new T(this.f11607d, (Y) this.f11608e, i7, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                    map2 = null;
                    i10 = responseCode;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    c0640o0 = c0646q02.f11913u;
                    C0646q0.l(c0640o0);
                    t5 = new T(this.f11607d, (Y) this.f11608e, i10, iOException, (byte[]) null, map2);
                    c0640o0.S(t5);
                    return;
                } catch (Throwable th8) {
                    th = th8;
                    map = null;
                    i7 = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    C0640o0 c0640o0322 = c0646q02.f11913u;
                    C0646q0.l(c0640o0322);
                    c0640o0322.S(new T(this.f11607d, (Y) this.f11608e, i7, (IOException) null, (byte[]) null, map));
                    throw th;
                }
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        httpURLConnection.disconnect();
                        c0640o0 = c0646q02.f11913u;
                        C0646q0.l(c0640o0);
                        t5 = new T(this.f11607d, (Y) this.f11608e, responseCode, (IOException) null, byteArray, headerFields);
                        c0640o0.S(t5);
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            default:
                String str2 = this.f11607d;
                V0 v03 = (V0) this.f11610u;
                C0646q0 c0646q03 = (C0646q0) v03.f3094a;
                C0646q0 c0646q04 = (C0646q0) v03.f3094a;
                C0640o0 c0640o04 = c0646q03.f11913u;
                C0646q0.l(c0640o04);
                c0640o04.N();
                int i11 = 0;
                try {
                    URLConnection openConnection2 = this.f11605b.openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) openConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    c0646q04.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            HashMap hashMap = (HashMap) this.f11609f;
                            if (hashMap != null) {
                                for (Map.Entry entry2 : hashMap.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            }
                            ?? r72 = this.f11606c;
                            map7 = r72;
                            if (r72 != 0) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    ?? gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(r72);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    ?? byteArray2 = byteArrayOutputStream2.toByteArray();
                                    W w13 = c0646q04.f11912f;
                                    C0646q0.l(w13);
                                    U u10 = w13.f11573B;
                                    int length2 = byteArray2.length;
                                    u10.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    ?? outputStream3 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream3.write(byteArray2);
                                        outputStream3.close();
                                        map7 = byteArray2;
                                    } catch (IOException e17) {
                                        e2 = e17;
                                        map6 = null;
                                        r63 = outputStream3;
                                        if (r63 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i11, e2, null, map6);
                                        return;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        map5 = null;
                                        r62 = outputStream3;
                                        if (r62 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i11, null, null, map5);
                                        throw th;
                                    }
                                } catch (IOException e18) {
                                    W w14 = c0646q04.f11912f;
                                    C0646q0.l(w14);
                                    w14.f11577f.b(e18, "Failed to gzip post request content");
                                    throw e18;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException e19) {
                            map6 = null;
                            e2 = e19;
                        }
                    } catch (Throwable th10) {
                        map5 = null;
                        th = th10;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr3);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, read2);
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                inputStream2 = null;
                            }
                        } catch (IOException e20) {
                            map6 = map7;
                            e2 = e20;
                            i11 = responseCode2;
                            r63 = 0;
                            if (r63 != 0) {
                                try {
                                    r63.close();
                                } catch (IOException e21) {
                                    W w15 = c0646q04.f11912f;
                                    C0646q0.l(w15);
                                    w15.f11577f.c("Error closing HTTP compressed POST connection output stream. appId", W.R(str2), e21);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(i11, e2, null, map6);
                            return;
                        } catch (Throwable th13) {
                            map5 = map7;
                            th = th13;
                            i11 = responseCode2;
                            r62 = 0;
                            if (r62 != 0) {
                                try {
                                    r62.close();
                                } catch (IOException e22) {
                                    W w16 = c0646q04.f11912f;
                                    C0646q0.l(w16);
                                    w16.f11577f.c("Error closing HTTP compressed POST connection output stream. appId", W.R(str2), e22);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(i11, null, null, map5);
                            throw th;
                        }
                    } catch (IOException e23) {
                        e2 = e23;
                        map6 = null;
                        i11 = responseCode2;
                        r63 = map6;
                        if (r63 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i11, e2, null, map6);
                        return;
                    } catch (Throwable th14) {
                        th = th14;
                        map5 = null;
                        i11 = responseCode2;
                        r62 = map5;
                        if (r62 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i11, null, null, map5);
                        throw th;
                    }
                } catch (IOException e24) {
                    e2 = e24;
                    httpURLConnection2 = null;
                    r63 = 0;
                    map6 = null;
                } catch (Throwable th15) {
                    th = th15;
                    httpURLConnection2 = null;
                    r62 = 0;
                    map5 = null;
                }
        }
    }
}
