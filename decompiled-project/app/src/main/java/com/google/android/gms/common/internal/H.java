package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class H extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final F5.b f15026a;

    public H(F5.b bVar) {
        G.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f4088b == 0 || bVar.f4089c == null) ? false : true);
        this.f15026a = bVar;
    }
}
