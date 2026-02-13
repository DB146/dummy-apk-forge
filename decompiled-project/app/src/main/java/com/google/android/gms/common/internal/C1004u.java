package com.google.android.gms.common.internal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004u implements com.google.android.gms.common.api.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C1004u f15114b = new C1004u(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f15115a;

    public /* synthetic */ C1004u(String str) {
        this.f15115a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1004u) {
            return G.k(this.f15115a, ((C1004u) obj).f15115a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15115a});
    }
}
