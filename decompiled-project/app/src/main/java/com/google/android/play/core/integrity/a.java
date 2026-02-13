package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f15568a;

    /* renamed from: b, reason: collision with root package name */
    private y f15569b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f15569b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f15568a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f15568a;
        if (str != null && (yVar = this.f15569b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15568a == null) {
            sb2.append(" token");
        }
        if (this.f15569b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
