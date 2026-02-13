package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f15637a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f15638b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15639c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f15640d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f15641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(bnVar, taskCompletionSource);
        this.f15641e = bnVar;
        this.f15637a = bundle;
        this.f15638b = activity;
        this.f15639c = taskCompletionSource2;
        this.f15640d = i7;
    }

    @Override // J6.z
    public final void b() {
        J6.y yVar;
        at atVar;
        if (bn.k(this.f15641e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f15641e;
            J6.d dVar = bnVar.f15651a;
            J6.o oVar = (J6.o) dVar.f5554n;
            Bundle bundle = this.f15637a;
            atVar = bnVar.f15655e;
            as a9 = atVar.a(this.f15638b, this.f15639c, dVar);
            J6.m mVar = (J6.m) oVar;
            mVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(mVar.f5538b);
            int i7 = J6.k.f5559a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a9);
            mVar.h(6, obtain);
        } catch (RemoteException e2) {
            bn bnVar2 = this.f15641e;
            int i10 = this.f15640d;
            yVar = bnVar2.f15652b;
            yVar.a(e2, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.f15639c.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
