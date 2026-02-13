package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final C0960a f14928a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.d f14929b;

    public /* synthetic */ F(C0960a c0960a, F5.d dVar) {
        this.f14928a = c0960a;
        this.f14929b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof F)) {
            F f4 = (F) obj;
            if (com.google.android.gms.common.internal.G.k(this.f14928a, f4.f14928a) && com.google.android.gms.common.internal.G.k(this.f14929b, f4.f14929b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14928a, this.f14929b});
    }

    public final String toString() {
        q3.s sVar = new q3.s(this);
        sVar.f(this.f14928a, "key");
        sVar.f(this.f14929b, "feature");
        return sVar.toString();
    }
}
