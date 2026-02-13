package m5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606c extends AbstractC1610g {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f20594e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20595f;

    /* renamed from: u, reason: collision with root package name */
    public InputStream f20596u;

    /* renamed from: v, reason: collision with root package name */
    public long f20597v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20598w;

    public C1606c(Context context) {
        super(false);
        this.f20594e = context.getAssets();
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20597v;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i10 = (int) Math.min(j, i10);
            } catch (IOException e2) {
                throw new C1617n(2000, e2);
            }
        }
        InputStream inputStream = this.f20596u;
        int i11 = n5.D.f21141a;
        int read = inputStream.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f20597v;
        if (j10 != -1) {
            this.f20597v = j10 - read;
        }
        b(read);
        return read;
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20595f = null;
        try {
            try {
                InputStream inputStream = this.f20596u;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new C1617n(2000, e2);
            }
        } finally {
            this.f20596u = null;
            if (this.f20598w) {
                this.f20598w = false;
                c();
            }
        }
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        try {
            Uri uri = c1619p.f20628a;
            long j = c1619p.f20632e;
            this.f20595f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream open = this.f20594e.open(path, 1);
            this.f20596u = open;
            if (open.skip(j) < j) {
                throw new C1617n(2008, (Exception) null);
            }
            long j10 = c1619p.f20633f;
            if (j10 != -1) {
                this.f20597v = j10;
            } else {
                long available = this.f20596u.available();
                this.f20597v = available;
                if (available == 2147483647L) {
                    this.f20597v = -1L;
                }
            }
            this.f20598w = true;
            g(c1619p);
            return this.f20597v;
        } catch (C1605b e2) {
            throw e2;
        } catch (IOException e10) {
            throw new C1617n(e10 instanceof FileNotFoundException ? 2005 : 2000, e10);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20595f;
    }
}
