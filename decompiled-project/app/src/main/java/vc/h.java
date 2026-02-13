package vc;

import h3.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import wc.l;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final d f25475a;

    /* renamed from: b, reason: collision with root package name */
    public final e f25476b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f25477c;

    public h(d dVar, e eVar) {
        this.f25475a = dVar;
        this.f25476b = eVar;
    }

    public static HttpURLConnection a(d dVar) {
        String str;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3 = null;
        dVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) dVar.f().openConnection();
        switch (dVar.f25452b) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "PATCH";
                break;
            case 6:
                str = "HEAD";
                break;
            case 7:
                str = "OPTIONS";
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "TRACE";
                break;
            default:
                throw null;
        }
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(dVar.f25456f);
        httpURLConnection.setReadTimeout(dVar.f25456f / 2);
        if (o.b(dVar.f25452b)) {
            httpURLConnection.setDoOutput(true);
        }
        Map map = a.f25444a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : dVar.f25454d.entrySet()) {
            linkedHashSet.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        try {
            for (Map.Entry<String, List<String>> entry2 : dVar.f25461n.get(dVar.f25451a.toURI(), a.f25444a).entrySet()) {
                List<String> value = entry2.getValue();
                if (value != null && value.size() != 0) {
                    String key = entry2.getKey();
                    if ("Cookie".equals(key)) {
                        hashSet = hashSet3;
                        hashSet2 = linkedHashSet;
                    } else if ("Cookie2".equals(key)) {
                        hashSet2 = new HashSet();
                        hashSet = hashSet2;
                    }
                    hashSet2.addAll(value);
                    hashSet3 = hashSet;
                }
            }
            if (linkedHashSet.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", l.j(linkedHashSet, "; "));
            }
            if (hashSet3 != null && hashSet3.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie2", l.j(hashSet3, "; "));
            }
            for (Map.Entry entry3 : dVar.f25453c.entrySet()) {
                Iterator it = ((List) entry3.getValue()).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty((String) entry3.getKey(), (String) it.next());
                }
            }
            return httpURLConnection;
        } catch (URISyntaxException e2) {
            MalformedURLException malformedURLException = new MalformedURLException(e2.getMessage());
            malformedURLException.initCause(e2);
            throw malformedURLException;
        }
    }

    public final e b() {
        d dVar = this.f25475a;
        try {
            HttpURLConnection a9 = a(dVar);
            this.f25477c = a9;
            a9.connect();
            if (this.f25477c.getDoOutput()) {
                try {
                    OutputStream outputStream = this.f25477c.getOutputStream();
                    try {
                        e.k(dVar, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    this.f25477c.disconnect();
                    throw e2;
                }
            }
            e eVar = new e(dVar);
            eVar.f25466i = this;
            eVar.f25452b = o.z(this.f25477c.getRequestMethod());
            eVar.f25451a = this.f25477c.getURL();
            eVar.f25464f = this.f25477c.getResponseCode();
            this.f25477c.getResponseMessage();
            eVar.k = this.f25477c.getContentType();
            eVar.f25467l = this.f25477c.getContentLength();
            HttpURLConnection httpURLConnection = this.f25477c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i7 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i7);
                String headerField = httpURLConnection.getHeaderField(i7);
                if (headerFieldKey == null && headerField == null) {
                    eVar.i(linkedHashMap, this.f25476b);
                    return eVar;
                }
                i7++;
                if (headerFieldKey != null && headerField != null) {
                    ((List) linkedHashMap.computeIfAbsent(headerFieldKey, wc.c.f25870c)).add(headerField);
                }
            }
        } catch (IOException e10) {
            HttpURLConnection httpURLConnection2 = this.f25477c;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f25477c = null;
            }
            throw e10;
        }
    }

    public final InputStream c() {
        HttpURLConnection httpURLConnection = this.f25477c;
        if (httpURLConnection != null) {
            return httpURLConnection.getErrorStream() != null ? this.f25477c.getErrorStream() : this.f25477c.getInputStream();
        }
        throw new IllegalStateException("Not yet executed");
    }
}
