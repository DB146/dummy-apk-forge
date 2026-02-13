package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f15600a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f15601b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15602c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f15600a = str;
        this.f15601b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f15601b;
    }

    public final boolean equals(Object obj) {
        boolean z8;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f15600a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f15601b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z8 = true;
                if ((obj instanceof ao) || !a()) {
                    return z8;
                }
                ao aoVar = (ao) obj;
                if (!z8) {
                    return false;
                }
                Object obj2 = aoVar.f15602c;
                return true;
            }
        }
        z8 = false;
        if (obj instanceof ao) {
        }
        return z8;
    }

    public final int hashCode() {
        int hashCode = this.f15600a.hashCode() ^ 1000003;
        Long l10 = this.f15601b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f15600a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f15600a + ", cloudProjectNumber=" + this.f15601b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
