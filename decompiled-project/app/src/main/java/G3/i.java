package G3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i implements A3.h {

    /* renamed from: b, reason: collision with root package name */
    public final m f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f4308c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4309d;

    /* renamed from: e, reason: collision with root package name */
    public String f4310e;

    /* renamed from: f, reason: collision with root package name */
    public URL f4311f;
    public volatile byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f4312h;

    public i(String str) {
        m mVar = j.f4313a;
        this.f4308c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f4309d = str;
        W3.g.c(mVar, "Argument must not be null");
        this.f4307b = mVar;
    }

    public i(URL url) {
        m mVar = j.f4313a;
        W3.g.c(url, "Argument must not be null");
        this.f4308c = url;
        this.f4309d = null;
        W3.g.c(mVar, "Argument must not be null");
        this.f4307b = mVar;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(A3.h.f353a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.f4309d;
        if (str != null) {
            return str;
        }
        URL url = this.f4308c;
        W3.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f4311f == null) {
            if (TextUtils.isEmpty(this.f4310e)) {
                String str = this.f4309d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f4308c;
                    W3.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f4310e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f4311f = new URL(this.f4310e);
        }
        return this.f4311f;
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c().equals(iVar.c()) && this.f4307b.equals(iVar.f4307b);
    }

    @Override // A3.h
    public final int hashCode() {
        if (this.f4312h == 0) {
            int hashCode = c().hashCode();
            this.f4312h = hashCode;
            this.f4312h = this.f4307b.f4317b.hashCode() + (hashCode * 31);
        }
        return this.f4312h;
    }

    public final String toString() {
        return c();
    }
}
