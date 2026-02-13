package E9;

import ac.AbstractC0796a;
import ac.n;
import android.net.Uri;
import h3.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import m5.C1619p;
import m5.C1624v;
import m5.InterfaceC1616m;
import m5.T;

/* loaded from: classes2.dex */
public final class f implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final C1624v f3815a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f3816b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f3817c;

    public f(C1624v c1624v) {
        this.f3815a = c1624v;
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] buffer, int i7, int i10) {
        String uri;
        l.e(buffer, "buffer");
        Uri uri2 = this.f3816b;
        if (uri2 == null || (uri = uri2.toString()) == null || !n.S(uri, ".ico", false)) {
            return this.f3815a.D(buffer, i7, i10);
        }
        ByteArrayInputStream byteArrayInputStream = this.f3817c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(buffer, i7, i10);
        }
        return -1;
    }

    @Override // m5.InterfaceC1616m
    public final void a(T transferListener) {
        l.e(transferListener, "transferListener");
        this.f3815a.a(transferListener);
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        String uri;
        Uri uri2 = this.f3816b;
        if (uri2 == null || (uri = uri2.toString()) == null || !n.S(uri, ".ico", false)) {
            this.f3815a.close();
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3817c;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
        this.f3817c = null;
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p dataSpec) {
        l.e(dataSpec, "dataSpec");
        Uri uri = dataSpec.f20628a;
        this.f3816b = uri;
        String uri2 = uri.toString();
        l.d(uri2, "toString(...)");
        if (!n.S(uri2, ".ico", false) && !l.a(dataSpec.f20631d.get("Content-Type"), "image/x-icon")) {
            return this.f3815a.d(dataSpec);
        }
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        l.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException(o.l(responseCode, "HTTP error code: "));
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray == null) {
            return -1L;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b2 : byteArray) {
            sb2.append(String.format("%02X ", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        String sb3 = sb2.toString();
        l.d(sb3, "toString(...)");
        Charset charset = AbstractC0796a.f12815a;
        byte[] bytes = sb3.getBytes(charset);
        l.d(bytes, "getBytes(...)");
        byte[] bytes2 = new String(bytes, charset).getBytes(charset);
        l.d(bytes2, "getBytes(...)");
        this.f3817c = new ByteArrayInputStream(bytes2);
        return r2.length();
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        String uri;
        Uri uri2 = this.f3816b;
        return (uri2 == null || (uri = uri2.toString()) == null || !n.S(uri, ".ico", false)) ? this.f3815a.w() : this.f3816b;
    }
}
