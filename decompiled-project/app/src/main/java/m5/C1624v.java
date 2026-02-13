package m5;

import N6.y0;
import android.net.Uri;
import android.text.TextUtils;
import db.C1069b;
import ea.C1108c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import n5.AbstractC1705a;

/* renamed from: m5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624v extends AbstractC1610g {

    /* renamed from: A, reason: collision with root package name */
    public InputStream f20671A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f20672B;

    /* renamed from: C, reason: collision with root package name */
    public int f20673C;

    /* renamed from: D, reason: collision with root package name */
    public long f20674D;

    /* renamed from: E, reason: collision with root package name */
    public long f20675E;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20676e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20677f;

    /* renamed from: u, reason: collision with root package name */
    public final int f20678u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20679v;

    /* renamed from: w, reason: collision with root package name */
    public final C1108c f20680w;

    /* renamed from: x, reason: collision with root package name */
    public final C1108c f20681x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20682y;

    /* renamed from: z, reason: collision with root package name */
    public HttpURLConnection f20683z;

    public C1624v(String str, int i7, int i10, boolean z8, C1108c c1108c, boolean z10) {
        super(true);
        this.f20679v = str;
        this.f20677f = i7;
        this.f20678u = i10;
        this.f20676e = z8;
        this.f20680w = c1108c;
        this.f20681x = new C1108c(7);
        this.f20682y = z10;
    }

    public static void s(HttpURLConnection httpURLConnection, long j) {
        int i7;
        if (httpURLConnection != null && (i7 = n5.D.f21141a) >= 19 && i7 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.f20674D;
            if (j != -1) {
                long j10 = j - this.f20675E;
                if (j10 != 0) {
                    i10 = (int) Math.min(i10, j10);
                }
                return -1;
            }
            InputStream inputStream = this.f20671A;
            int i11 = n5.D.f21141a;
            int read = inputStream.read(bArr, i7, i10);
            if (read == -1) {
                return -1;
            }
            this.f20675E += read;
            b(read);
            return read;
        } catch (IOException e2) {
            int i12 = n5.D.f21141a;
            throw C1597A.b(e2, 2);
        }
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        try {
            InputStream inputStream = this.f20671A;
            if (inputStream != null) {
                long j = this.f20674D;
                long j10 = -1;
                if (j != -1) {
                    j10 = j - this.f20675E;
                }
                s(this.f20683z, j10);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i7 = n5.D.f21141a;
                    throw new C1597A(e2, 2000, 3);
                }
            }
        } finally {
            this.f20671A = null;
            i();
            if (this.f20672B) {
                this.f20672B = false;
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #6 {IOException -> 0x013b, blocks: (B:19:0x0128, B:21:0x0130), top: B:18:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    @Override // m5.InterfaceC1616m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(C1619p c1619p) {
        HttpURLConnection httpURLConnection;
        boolean z8;
        long parseLong;
        HttpURLConnection httpURLConnection2;
        long j;
        long parseLong2;
        long j10;
        long j11;
        long parseLong3;
        this.f20675E = 0L;
        this.f20674D = 0L;
        f();
        try {
            HttpURLConnection p10 = p(c1619p);
            this.f20683z = p10;
            this.f20673C = p10.getResponseCode();
            p10.getResponseMessage();
            int i7 = this.f20673C;
            long j12 = c1619p.f20632e;
            long j13 = c1619p.f20633f;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = p10.getHeaderFields();
                if (this.f20673C == 416) {
                    httpURLConnection = p10;
                    String headerField = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC1600D.f20537a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = AbstractC1600D.f20538b.matcher(headerField);
                        if (matcher.matches()) {
                            z8 = true;
                            String group = matcher.group(1);
                            group.getClass();
                            parseLong = Long.parseLong(group);
                            if (j12 == parseLong) {
                                this.f20672B = z8;
                                g(c1619p);
                                if (j13 != -1) {
                                    return j13;
                                }
                                return 0L;
                            }
                        }
                    }
                    z8 = true;
                    parseLong = -1;
                    if (j12 == parseLong) {
                    }
                } else {
                    httpURLConnection = p10;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i10 = n5.D.f21141a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i11 = n5.D.f21141a;
                    }
                } catch (IOException unused) {
                    int i12 = n5.D.f21141a;
                }
                i();
                throw new C1599C(this.f20673C, this.f20673C == 416 ? new C1617n(2008) : null, headerFields);
            }
            p10.getContentType();
            if (this.f20673C != 200 || j12 == 0) {
                j12 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(p10.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection2 = p10;
                j = j12;
                this.f20674D = j13;
            } else if (j13 != -1) {
                this.f20674D = j13;
                httpURLConnection2 = p10;
                j = j12;
            } else {
                String headerField2 = p10.getHeaderField("Content-Length");
                String headerField3 = p10.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC1600D.f20537a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        parseLong2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC1705a.t("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = AbstractC1600D.f20537a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong4 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection2 = p10;
                                parseLong3 = (parseLong4 - Long.parseLong(group3)) + 1;
                                j = j12;
                                j10 = parseLong2;
                            } catch (NumberFormatException unused3) {
                                httpURLConnection2 = p10;
                                j = j12;
                                j10 = parseLong2;
                            }
                            if (j10 < 0) {
                                j11 = parseLong3;
                            } else {
                                if (j10 != parseLong3) {
                                    try {
                                        AbstractC1705a.S("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j11 = Math.max(j10, parseLong3);
                                    } catch (NumberFormatException unused4) {
                                        AbstractC1705a.t("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        j11 = j10;
                                        this.f20674D = j11 == -1 ? j11 - j : -1L;
                                        this.f20671A = httpURLConnection2.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.f20672B = true;
                                        g(c1619p);
                                        try {
                                            u(j);
                                            return this.f20674D;
                                        } catch (IOException e2) {
                                            i();
                                            if (e2 instanceof C1597A) {
                                                throw ((C1597A) e2);
                                            }
                                            throw new C1597A(e2, 2000, 1);
                                        }
                                    }
                                }
                                j11 = j10;
                            }
                            this.f20674D = j11 == -1 ? j11 - j : -1L;
                        }
                    }
                    httpURLConnection2 = p10;
                    j = j12;
                    j10 = parseLong2;
                    j11 = j10;
                    this.f20674D = j11 == -1 ? j11 - j : -1L;
                }
                parseLong2 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection2 = p10;
                j = j12;
                j10 = parseLong2;
                j11 = j10;
                this.f20674D = j11 == -1 ? j11 - j : -1L;
            }
            try {
                this.f20671A = httpURLConnection2.getInputStream();
                if (equalsIgnoreCase) {
                    this.f20671A = new GZIPInputStream(this.f20671A);
                }
                this.f20672B = true;
                g(c1619p);
                u(j);
                return this.f20674D;
            } catch (IOException e10) {
                i();
                throw new C1597A(e10, 2000, 1);
            }
        } catch (IOException e11) {
            i();
            throw C1597A.b(e11, 1);
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f20683z;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                AbstractC1705a.u("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f20683z = null;
        }
    }

    public final URL l(URL url, String str) {
        if (str == null) {
            throw new C1597A("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C1597A(X.c.t("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f20676e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C1597A("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e2) {
            throw new C1597A(e2, 2001, 1);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Map n() {
        HttpURLConnection httpURLConnection = this.f20683z;
        return httpURLConnection == null ? y0.f7368u : new C1069b(httpURLConnection.getHeaderFields(), 1);
    }

    public final HttpURLConnection o(URL url, int i7, byte[] bArr, long j, long j10, boolean z8, boolean z10, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f20677f);
        httpURLConnection.setReadTimeout(this.f20678u);
        HashMap hashMap = new HashMap();
        C1108c c1108c = this.f20680w;
        if (c1108c != null) {
            hashMap.putAll(c1108c.f());
        }
        hashMap.putAll(this.f20681x.f());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC1600D.f20537a;
        if (j == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder l10 = X.c.l(j, "bytes=", "-");
            if (j10 != -1) {
                l10.append((j + j10) - 1);
            }
            sb2 = l10.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str2 = this.f20679v;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z8 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        int i10 = C1619p.f20627i;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection p(C1619p c1619p) {
        HttpURLConnection o10;
        C1619p c1619p2 = c1619p;
        URL url = new URL(c1619p2.f20628a.toString());
        int i7 = 0;
        boolean z8 = (c1619p2.f20634h & 1) == 1;
        boolean z10 = this.f20676e;
        boolean z11 = this.f20682y;
        int i10 = c1619p2.f20629b;
        byte[] bArr = c1619p2.f20630c;
        long j = c1619p2.f20632e;
        long j10 = c1619p2.f20633f;
        if (!z10 && !z11) {
            return o(url, i10, bArr, j, j10, z8, true, c1619p2.f20631d);
        }
        URL url2 = url;
        byte[] bArr2 = bArr;
        int i11 = i10;
        while (true) {
            int i12 = i7 + 1;
            if (i7 > 20) {
                throw new C1597A(new NoRouteToHostException(h3.o.l(i12, "Too many redirects: ")), 2001, 1);
            }
            Map map = c1619p2.f20631d;
            int i13 = i11;
            long j11 = j10;
            URL url3 = url2;
            long j12 = j;
            o10 = o(url2, i11, bArr2, j, j10, z8, false, map);
            int responseCode = o10.getResponseCode();
            String headerField = o10.getHeaderField("Location");
            if ((i13 == 1 || i13 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                o10.disconnect();
                url2 = l(url3, headerField);
                i11 = i13;
            } else {
                if (i13 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                o10.disconnect();
                if (z11 && responseCode == 302) {
                    i11 = i13;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                url2 = l(url3, headerField);
            }
            c1619p2 = c1619p;
            i7 = i12;
            j10 = j11;
            j = j12;
        }
        return o10;
    }

    public final void u(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.f20671A;
            int i7 = n5.D.f21141a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new C1597A(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new C1597A();
            }
            j -= read;
            b(read);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        HttpURLConnection httpURLConnection = this.f20683z;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
