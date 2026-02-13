package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final G3.i f14686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14687b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f14688c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f14689d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f14690e;

    public k(G3.i iVar, int i7) {
        this.f14686a = iVar;
        this.f14687b = i7;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        InputStream inputStream = this.f14689d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f14688c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f14688c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f14690e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        return A3.a.f343b;
    }

    public final InputStream e(URL url, int i7, URL url2, Map map) {
        if (i7 >= 5) {
            throw new A3.e(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new A3.e(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i10 = this.f14687b;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f14688c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f14689d = this.f14688c.getInputStream();
                if (this.f14690e) {
                    return null;
                }
                int c10 = c(this.f14688c);
                int i11 = c10 / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f14688c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f14689d = new W3.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f14689d = httpURLConnection2.getInputStream();
                        }
                        return this.f14689d;
                    } catch (IOException e2) {
                        throw new A3.e(c(httpURLConnection2), e2, "Failed to obtain InputStream");
                    }
                }
                if (i11 != 3) {
                    if (c10 == -1) {
                        throw new A3.e(c10, null, "Http request failed");
                    }
                    try {
                        throw new A3.e(c10, null, this.f14688c.getResponseMessage());
                    } catch (IOException e10) {
                        throw new A3.e(c10, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f14688c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new A3.e(c10, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    a();
                    return e(url3, i7 + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new A3.e(c10, e11, X.c.t("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                throw new A3.e(c(this.f14688c), e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new A3.e(0, e13, "URL.openConnection threw");
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, d dVar) {
        StringBuilder sb2;
        G3.i iVar = this.f14686a;
        int i7 = W3.i.f10608b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.e(e(iVar.d(), 0, null, iVar.f4307b.b()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                dVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(W3.i.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + W3.i.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
