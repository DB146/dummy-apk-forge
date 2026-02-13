package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzh;

/* loaded from: classes.dex */
public final class I extends zzh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0990f f15027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0990f abstractC0990f, Looper looper) {
        super(looper);
        this.f15027a = abstractC0990f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        InterfaceC0986b interfaceC0986b;
        InterfaceC0986b interfaceC0986b2;
        F5.b bVar;
        F5.b bVar2;
        boolean z8;
        if (this.f15027a.zzd.get() != message.arg1) {
            int i7 = message.what;
            if (i7 == 2 || i7 == 1 || i7 == 7) {
                A a9 = (A) message.obj;
                a9.getClass();
                a9.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f15027a.enableLocalFallback()) || message.what == 5)) && !this.f15027a.isConnecting()) {
            A a10 = (A) message.obj;
            a10.getClass();
            a10.c();
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f15027a.zzC = new F5.b(message.arg2);
            if (AbstractC0990f.zzo(this.f15027a)) {
                AbstractC0990f abstractC0990f = this.f15027a;
                z8 = abstractC0990f.zzD;
                if (!z8) {
                    abstractC0990f.a(3, null);
                    return;
                }
            }
            AbstractC0990f abstractC0990f2 = this.f15027a;
            bVar2 = abstractC0990f2.zzC;
            F5.b bVar3 = bVar2 != null ? abstractC0990f2.zzC : new F5.b(8);
            this.f15027a.zzc.a(bVar3);
            this.f15027a.onConnectionFailed(bVar3);
            return;
        }
        if (i11 == 5) {
            AbstractC0990f abstractC0990f3 = this.f15027a;
            bVar = abstractC0990f3.zzC;
            F5.b bVar4 = bVar != null ? abstractC0990f3.zzC : new F5.b(8);
            this.f15027a.zzc.a(bVar4);
            this.f15027a.onConnectionFailed(bVar4);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            F5.b bVar5 = new F5.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f15027a.zzc.a(bVar5);
            this.f15027a.onConnectionFailed(bVar5);
            return;
        }
        if (i11 == 6) {
            this.f15027a.a(5, null);
            AbstractC0990f abstractC0990f4 = this.f15027a;
            interfaceC0986b = abstractC0990f4.zzw;
            if (interfaceC0986b != null) {
                interfaceC0986b2 = abstractC0990f4.zzw;
                interfaceC0986b2.onConnectionSuspended(message.arg2);
            }
            this.f15027a.onConnectionSuspended(message.arg2);
            AbstractC0990f.zzn(this.f15027a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f15027a.isConnected()) {
            A a11 = (A) message.obj;
            a11.getClass();
            a11.c();
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", h3.o.l(i12, "Don't know how to handle message: "), new Exception());
            return;
        }
        A a12 = (A) message.obj;
        synchronized (a12) {
            try {
                bool = a12.f15015a;
                if (a12.f15016b) {
                    Log.w("GmsClient", "Callback proxy " + a12.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0990f abstractC0990f5 = a12.f15020f;
            int i13 = a12.f15018d;
            if (i13 != 0) {
                abstractC0990f5.a(1, null);
                Bundle bundle = a12.f15019e;
                a12.a(new F5.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0990f.KEY_PENDING_INTENT) : null));
            } else if (!a12.b()) {
                abstractC0990f5.a(1, null);
                a12.a(new F5.b(8, null));
            }
        }
        synchronized (a12) {
            a12.f15016b = true;
        }
        a12.c();
    }
}
