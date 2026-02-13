package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class af extends J6.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f15574a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f15575b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f15576c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f15577d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f15578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f15578e = ajVar;
        this.f15574a = bArr;
        this.f15575b = l10;
        this.f15576c = taskCompletionSource2;
        this.f15577d = integrityTokenRequest;
    }

    @Override // J6.z
    public final void a(Exception exc) {
        if (exc instanceof J6.e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // J6.z
    public final void b() {
        J6.y yVar;
        try {
            aj ajVar = this.f15578e;
            J6.t tVar = (J6.t) ajVar.f15588a.f5554n;
            Bundle a9 = aj.a(ajVar, this.f15574a, this.f15575b, null);
            ai aiVar = new ai(this.f15578e, this.f15576c);
            J6.r rVar = (J6.r) tVar;
            rVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(rVar.f5538b);
            int i7 = J6.k.f5559a;
            obtain.writeInt(1);
            a9.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            rVar.h(2, obtain);
        } catch (RemoteException e2) {
            aj ajVar2 = this.f15578e;
            IntegrityTokenRequest integrityTokenRequest = this.f15577d;
            yVar = ajVar2.f15589b;
            yVar.a(e2, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f15576c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
