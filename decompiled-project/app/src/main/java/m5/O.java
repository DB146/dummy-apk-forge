package m5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class O extends AbstractC1610g {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f20561e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20562f;

    /* renamed from: u, reason: collision with root package name */
    public Uri f20563u;

    /* renamed from: v, reason: collision with root package name */
    public AssetFileDescriptor f20564v;

    /* renamed from: w, reason: collision with root package name */
    public FileInputStream f20565w;

    /* renamed from: x, reason: collision with root package name */
    public long f20566x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20567y;

    public O(Context context) {
        super(false);
        this.f20561e = context.getResources();
        this.f20562f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20566x;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i10 = (int) Math.min(j, i10);
            } catch (IOException e2) {
                throw new C1617n(null, e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f20565w;
        int i11 = n5.D.f21141a;
        int read = fileInputStream.read(bArr, i7, i10);
        if (read == -1) {
            if (this.f20566x == -1) {
                return -1;
            }
            throw new C1617n("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j10 = this.f20566x;
        if (j10 != -1) {
            this.f20566x = j10 - read;
        }
        b(read);
        return read;
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20563u = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20565w;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20565w = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20564v;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new C1617n(null, e2, 2000);
                    }
                } finally {
                    this.f20564v = null;
                    if (this.f20567y) {
                        this.f20567y = false;
                        c();
                    }
                }
            } catch (IOException e10) {
                throw new C1617n(null, e10, 2000);
            }
        } catch (Throwable th) {
            this.f20565w = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f20564v;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f20564v = null;
                    if (this.f20567y) {
                        this.f20567y = false;
                        c();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new C1617n(null, e11, 2000);
                }
            } finally {
                this.f20564v = null;
                if (this.f20567y) {
                    this.f20567y = false;
                    c();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    @Override // m5.InterfaceC1616m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(C1619p c1619p) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri normalizeScheme = c1619p.f20628a.normalizeScheme();
        this.f20563u = normalizeScheme;
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Resources resources = this.f20561e;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1) {
                        String lastPathSegment = normalizeScheme.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                        throw new C1617n("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
                    }
                    String path = normalizeScheme.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = normalizeScheme.getHost();
                    parseInt = resources.getIdentifier(h3.o.p(new StringBuilder(), TextUtils.isEmpty(host) ? "" : X.c.h(host, ":"), path), "raw", this.f20562f);
                    if (parseInt == 0) {
                        throw new C1617n("Resource not found.", null, 2005);
                    }
                    f();
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.f20564v = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new C1617n("Resource is compressed: " + normalizeScheme, null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f20565w = fileInputStream;
                    long j = c1619p.f20632e;
                    try {
                        if (length != -1 && j > length) {
                            throw new C1617n(null, null, 2008);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j) - startOffset;
                        if (skip != j) {
                            throw new C1617n(null, null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f20566x = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f20566x = size;
                                if (size < 0) {
                                    throw new C1617n(null, null, 2008);
                                }
                            }
                        } else {
                            long j10 = length - skip;
                            this.f20566x = j10;
                            if (j10 < 0) {
                                throw new C1617n(2008);
                            }
                        }
                        long j11 = c1619p.f20633f;
                        if (j11 != -1) {
                            long j12 = this.f20566x;
                            this.f20566x = j12 == -1 ? j11 : Math.min(j12, j11);
                        }
                        this.f20567y = true;
                        g(c1619p);
                        return j11 != -1 ? j11 : this.f20566x;
                    } catch (N e2) {
                        throw e2;
                    } catch (IOException e10) {
                        throw new C1617n(null, e10, 2000);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.f20564v = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e11) {
                throw new C1617n(null, e11, 2005);
            }
            String lastPathSegment2 = normalizeScheme.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            f();
        } catch (NumberFormatException unused) {
            throw new C1617n("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20563u;
    }
}
