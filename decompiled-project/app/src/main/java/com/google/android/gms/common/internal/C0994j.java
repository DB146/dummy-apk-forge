package com.google.android.gms.common.internal;

import a6.C0779c;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994j extends G5.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f15075A;

    /* renamed from: B, reason: collision with root package name */
    public final String f15076B;

    /* renamed from: a, reason: collision with root package name */
    public final int f15077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15078b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15079c;

    /* renamed from: d, reason: collision with root package name */
    public String f15080d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f15081e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f15082f;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f15083u;

    /* renamed from: v, reason: collision with root package name */
    public Account f15084v;

    /* renamed from: w, reason: collision with root package name */
    public F5.d[] f15085w;

    /* renamed from: x, reason: collision with root package name */
    public F5.d[] f15086x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15087y;

    /* renamed from: z, reason: collision with root package name */
    public final int f15088z;
    public static final Parcelable.Creator<C0994j> CREATOR = new C0779c(18);

    /* renamed from: C, reason: collision with root package name */
    public static final Scope[] f15073C = new Scope[0];

    /* renamed from: D, reason: collision with root package name */
    public static final F5.d[] f15074D = new F5.d[0];

    public C0994j(int i7, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, F5.d[] dVarArr, F5.d[] dVarArr2, boolean z8, int i12, boolean z10, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f15073C : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        F5.d[] dVarArr3 = f15074D;
        F5.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f15077a = i7;
        this.f15078b = i10;
        this.f15079c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f15080d = "com.google.android.gms";
        } else {
            this.f15080d = str;
        }
        if (i7 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i13 = AbstractBinderC0985a.f15057a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface zzaVar = queryLocalInterface instanceof InterfaceC0997m ? (InterfaceC0997m) queryLocalInterface : new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (zzaVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            V v10 = (V) zzaVar;
                            Parcel zzB = v10.zzB(2, v10.zza());
                            Account account3 = (Account) zzc.zza(zzB, Account.CREATOR);
                            zzB.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f15081e = iBinder;
            account2 = account;
        }
        this.f15084v = account2;
        this.f15082f = scopeArr2;
        this.f15083u = bundle2;
        this.f15085w = dVarArr4;
        this.f15086x = dVarArr3;
        this.f15087y = z8;
        this.f15088z = i12;
        this.f15075A = z10;
        this.f15076B = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C0779c.a(this, parcel, i7);
    }
}
