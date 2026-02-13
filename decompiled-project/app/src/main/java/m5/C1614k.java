package m5;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import m4.C1586o0;
import n5.AbstractC1705a;

/* renamed from: m5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614k extends AbstractC1610g {

    /* renamed from: e, reason: collision with root package name */
    public C1619p f20616e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f20617f;

    /* renamed from: u, reason: collision with root package name */
    public int f20618u;

    /* renamed from: v, reason: collision with root package name */
    public int f20619v;

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f20619v;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f20617f;
        int i12 = n5.D.f21141a;
        System.arraycopy(bArr2, this.f20618u, bArr, i7, min);
        this.f20618u += min;
        this.f20619v -= min;
        b(min);
        return min;
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        if (this.f20617f != null) {
            this.f20617f = null;
            c();
        }
        this.f20616e = null;
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        f();
        this.f20616e = c1619p;
        Uri normalizeScheme = c1619p.f20628a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC1705a.g("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i7 = n5.D.f21141a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new C1586o0("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f20617f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new C1586o0(X.c.t("Error while parsing Base64 encoded string: ", str), e2, true, 0);
            }
        } else {
            this.f20617f = URLDecoder.decode(str, M6.e.f6797a.name()).getBytes(M6.e.f6799c);
        }
        byte[] bArr = this.f20617f;
        long length = bArr.length;
        long j = c1619p.f20632e;
        if (j > length) {
            this.f20617f = null;
            throw new C1617n(2008);
        }
        int i10 = (int) j;
        this.f20618u = i10;
        int length2 = bArr.length - i10;
        this.f20619v = length2;
        long j10 = c1619p.f20633f;
        if (j10 != -1) {
            this.f20619v = (int) Math.min(length2, j10);
        }
        g(c1619p);
        return j10 != -1 ? j10 : this.f20619v;
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        C1619p c1619p = this.f20616e;
        if (c1619p != null) {
            return c1619p.f20628a;
        }
        return null;
    }
}
