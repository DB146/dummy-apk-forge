package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14969a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f14970b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f14971c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14972d;

    public C0960a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f14970b = iVar;
        this.f14971c = eVar;
        this.f14972d = str;
        this.f14969a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0960a)) {
            return false;
        }
        C0960a c0960a = (C0960a) obj;
        return com.google.android.gms.common.internal.G.k(this.f14970b, c0960a.f14970b) && com.google.android.gms.common.internal.G.k(this.f14971c, c0960a.f14971c) && com.google.android.gms.common.internal.G.k(this.f14972d, c0960a.f14972d);
    }

    public final int hashCode() {
        return this.f14969a;
    }
}
