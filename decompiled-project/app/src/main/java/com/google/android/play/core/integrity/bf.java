package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f15629a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15630b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f15631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f15631c = bnVar;
        this.f15629a = j;
        this.f15630b = taskCompletionSource2;
    }

    @Override // J6.z
    public final void b() {
        J6.y yVar;
        if (bn.k(this.f15631c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f15631c;
            J6.o oVar = (J6.o) bnVar.f15651a.f5554n;
            Bundle b2 = bn.b(bnVar, this.f15629a, 0);
            bl blVar = new bl(this.f15631c, this.f15630b);
            J6.m mVar = (J6.m) oVar;
            mVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(mVar.f5538b);
            int i7 = J6.k.f5559a;
            obtain.writeInt(1);
            b2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            mVar.h(2, obtain);
        } catch (RemoteException e2) {
            bn bnVar2 = this.f15631c;
            long j = this.f15629a;
            yVar = bnVar2.f15652b;
            yVar.a(e2, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            this.f15630b.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
