package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class K implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f15030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0990f f15031b;

    public K(AbstractC0990f abstractC0990f, int i7) {
        this.f15031b = abstractC0990f;
        this.f15030a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC0990f abstractC0990f = this.f15031b;
        if (iBinder == null) {
            AbstractC0990f.zzk(abstractC0990f, 16);
            return;
        }
        obj = abstractC0990f.zzq;
        synchronized (obj) {
            try {
                AbstractC0990f abstractC0990f2 = this.f15031b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0990f2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0999o)) ? new C(iBinder) : (InterfaceC0999o) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15031b.zzl(0, null, this.f15030a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f15031b.zzq;
        synchronized (obj) {
            this.f15031b.zzr = null;
        }
        AbstractC0990f abstractC0990f = this.f15031b;
        int i7 = this.f15030a;
        Handler handler = abstractC0990f.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
