package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;

/* loaded from: classes.dex */
public final class r implements InterfaceC0988d, InterfaceC0986b, InterfaceC0987c {

    /* renamed from: b, reason: collision with root package name */
    public static r f15104b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1002s f15105c = new C1002s(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f15106a;

    public /* synthetic */ r(Object obj) {
        this.f15106a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.common.internal.r] */
    public static synchronized r b() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f15104b == null) {
                    f15104b = new Object();
                }
                rVar = f15104b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0988d
    public void a(F5.b bVar) {
        InterfaceC0987c interfaceC0987c;
        InterfaceC0987c interfaceC0987c2;
        boolean z8 = bVar.f4088b == 0;
        AbstractC0990f abstractC0990f = (AbstractC0990f) this.f15106a;
        if (z8) {
            abstractC0990f.getRemoteService(null, abstractC0990f.getScopes());
            return;
        }
        interfaceC0987c = abstractC0990f.zzx;
        if (interfaceC0987c != null) {
            interfaceC0987c2 = abstractC0990f.zzx;
            interfaceC0987c2.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public void onConnected(Bundle bundle) {
        ((InterfaceC0966g) this.f15106a).h();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0987c
    public void onConnectionFailed(F5.b bVar) {
        ((InterfaceC0976q) this.f15106a).onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public void onConnectionSuspended(int i7) {
        ((InterfaceC0966g) this.f15106a).onConnectionSuspended(i7);
    }
}
