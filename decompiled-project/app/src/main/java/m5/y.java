package m5;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class y extends AbstractC1610g {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f20684e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20685f;

    /* renamed from: u, reason: collision with root package name */
    public long f20686u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20687v;

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20686u;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f20684e;
            int i11 = n5.D.f21141a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j, i10));
            if (read > 0) {
                this.f20686u -= read;
                b(read);
            }
            return read;
        } catch (IOException e2) {
            throw new C1617n(2000, e2);
        }
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20685f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20684e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new C1617n(2000, e2);
            }
        } finally {
            this.f20684e = null;
            if (this.f20687v) {
                this.f20687v = false;
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // m5.InterfaceC1616m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(C1619p c1619p) {
        boolean b2;
        Uri uri = c1619p.f20628a;
        long j = c1619p.f20632e;
        this.f20685f = uri;
        f();
        int i7 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f20684e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j10 = c1619p.f20633f;
                if (j10 == -1) {
                    j10 = this.f20684e.length() - j;
                }
                this.f20686u = j10;
                if (j10 < 0) {
                    throw new C1617n(null, null, 2008);
                }
                this.f20687v = true;
                g(c1619p);
                return this.f20686u;
            } catch (IOException e2) {
                throw new C1617n(2000, e2);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (n5.D.f21141a >= 21) {
                    b2 = w.b(e10.getCause());
                }
                i7 = 2005;
                throw new C1617n(i7, e10);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder o10 = A3.c.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            o10.append(fragment);
            throw new C1617n(o10.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new C1617n(2006, e11);
        } catch (RuntimeException e12) {
            throw new C1617n(2000, e12);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20685f;
    }
}
