package com.google.ads.interactivemedia.v3.internal;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class zzg extends zzh {
    private final byte[] zza;

    public zzg(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
