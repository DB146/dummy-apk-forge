package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ag extends J6.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f15579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f15580b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15581c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f15582d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f15583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f15583e = ajVar;
        this.f15579a = bundle;
        this.f15580b = activity;
        this.f15581c = taskCompletionSource2;
        this.f15582d = i7;
    }

    @Override // J6.z
    public final void b() {
        J6.y yVar;
        at atVar;
        try {
            aj ajVar = this.f15583e;
            J6.t tVar = (J6.t) ajVar.f15588a.f5554n;
            Bundle bundle = this.f15579a;
            atVar = ajVar.f15591d;
            as a9 = atVar.a(this.f15580b, this.f15581c, ajVar.f15588a);
            J6.r rVar = (J6.r) tVar;
            rVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(rVar.f5538b);
            int i7 = J6.k.f5559a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a9);
            rVar.h(3, obtain);
        } catch (RemoteException e2) {
            aj ajVar2 = this.f15583e;
            int i10 = this.f15582d;
            yVar = ajVar2.f15589b;
            yVar.a(e2, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.f15581c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
