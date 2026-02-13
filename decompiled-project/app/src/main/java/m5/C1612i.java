package m5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: m5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612i extends AbstractC1610g {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f20610e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20611f;

    /* renamed from: u, reason: collision with root package name */
    public AssetFileDescriptor f20612u;

    /* renamed from: v, reason: collision with root package name */
    public FileInputStream f20613v;

    /* renamed from: w, reason: collision with root package name */
    public long f20614w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20615x;

    public C1612i(Context context) {
        super(false);
        this.f20610e = context.getContentResolver();
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20614w;
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
        FileInputStream fileInputStream = this.f20613v;
        int i11 = n5.D.f21141a;
        int read = fileInputStream.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f20614w;
        if (j10 != -1) {
            this.f20614w = j10 - read;
        }
        b(read);
        return read;
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        this.f20611f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20613v;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20613v = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20612u;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new C1617n(2000, e2);
                    }
                } finally {
                    this.f20612u = null;
                    if (this.f20615x) {
                        this.f20615x = false;
                        c();
                    }
                }
            } catch (IOException e10) {
                throw new C1617n(2000, e10);
            }
        } catch (Throwable th) {
            this.f20613v = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f20612u;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f20612u = null;
                    if (this.f20615x) {
                        this.f20615x = false;
                        c();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new C1617n(2000, e11);
                }
            } finally {
                this.f20612u = null;
                if (this.f20615x) {
                    this.f20615x = false;
                    c();
                }
            }
        }
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = c1619p.f20628a.normalizeScheme();
            this.f20611f = normalizeScheme;
            f();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f20610e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f20612u = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new C1617n(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f20613v = fileInputStream;
            long j = c1619p.f20632e;
            if (length != -1 && j > length) {
                throw new C1617n(2008, (Exception) null);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j) - startOffset;
            if (skip != j) {
                throw new C1617n(2008, (Exception) null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f20614w = -1L;
                } else {
                    long position = size - channel.position();
                    this.f20614w = position;
                    if (position < 0) {
                        throw new C1617n(2008, (Exception) null);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f20614w = j10;
                if (j10 < 0) {
                    throw new C1617n(2008, (Exception) null);
                }
            }
            long j11 = c1619p.f20633f;
            if (j11 != -1) {
                long j12 = this.f20614w;
                this.f20614w = j12 == -1 ? j11 : Math.min(j12, j11);
            }
            this.f20615x = true;
            g(c1619p);
            return j11 != -1 ? j11 : this.f20614w;
        } catch (C1611h e2) {
            throw e2;
        } catch (IOException e10) {
            throw new C1617n(e10 instanceof FileNotFoundException ? 2005 : 2000, e10);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f20611f;
    }
}
