package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f15669a;

    /* renamed from: b, reason: collision with root package name */
    private byte f15670b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i7) {
        this.f15670b = (byte) (this.f15670b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f15670b == 3) {
            return new e(this.f15669a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f15670b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f15670b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f15669a = j;
        this.f15670b = (byte) (this.f15670b | 1);
        return this;
    }
}
