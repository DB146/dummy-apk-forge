package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f15633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f15634c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15635d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f15636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, String str, long j, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f15636e = bnVar;
        this.f15632a = str;
        this.f15633b = j;
        this.f15634c = j10;
        this.f15635d = taskCompletionSource2;
    }

    @Override // J6.z
    public final void b() {
        J6.y yVar;
        if (bn.k(this.f15636e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f15636e;
            J6.o oVar = (J6.o) bnVar.f15651a.f5554n;
            Bundle a9 = bn.a(bnVar, this.f15632a, this.f15633b, this.f15634c, 0);
            bk bkVar = new bk(this.f15636e, this.f15635d, this.f15633b);
            J6.m mVar = (J6.m) oVar;
            mVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(mVar.f5538b);
            int i7 = J6.k.f5559a;
            obtain.writeInt(1);
            a9.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bkVar);
            mVar.h(3, obtain);
        } catch (RemoteException e2) {
            bn bnVar2 = this.f15636e;
            String str = this.f15632a;
            yVar = bnVar2.f15652b;
            yVar.a(e2, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f15633b));
            this.f15635d.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
