package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class v extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final F5.d f15013a;

    public v(F5.d dVar) {
        this.f15013a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15013a));
    }
}
