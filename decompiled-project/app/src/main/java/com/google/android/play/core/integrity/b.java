package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f15621a;

    /* renamed from: b, reason: collision with root package name */
    private y f15622b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f15622b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f15621a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f15621a;
        if (str != null && (yVar = this.f15622b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15621a == null) {
            sb2.append(" token");
        }
        if (this.f15622b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
