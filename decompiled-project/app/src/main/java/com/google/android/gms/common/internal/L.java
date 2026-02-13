package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class L extends A {
    public final IBinder g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0990f f15032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC0990f abstractC0990f, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0990f, i7, bundle);
        this.f15032h = abstractC0990f;
        this.g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(F5.b bVar) {
        InterfaceC0987c interfaceC0987c;
        InterfaceC0987c interfaceC0987c2;
        AbstractC0990f abstractC0990f = this.f15032h;
        interfaceC0987c = abstractC0990f.zzx;
        if (interfaceC0987c != null) {
            interfaceC0987c2 = abstractC0990f.zzx;
            interfaceC0987c2.onConnectionFailed(bVar);
        }
        abstractC0990f.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        InterfaceC0986b interfaceC0986b;
        InterfaceC0986b interfaceC0986b2;
        IBinder iBinder = this.g;
        try {
            G.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0990f abstractC0990f = this.f15032h;
            if (!abstractC0990f.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0990f.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = abstractC0990f.createServiceInterface(iBinder);
            if (createServiceInterface == null || !(AbstractC0990f.zzn(abstractC0990f, 2, 4, createServiceInterface) || AbstractC0990f.zzn(abstractC0990f, 3, 4, createServiceInterface))) {
                return false;
            }
            abstractC0990f.zzC = null;
            Bundle connectionHint = abstractC0990f.getConnectionHint();
            interfaceC0986b = abstractC0990f.zzw;
            if (interfaceC0986b == null) {
                return true;
            }
            interfaceC0986b2 = abstractC0990f.zzw;
            interfaceC0986b2.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
