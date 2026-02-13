package com.google.android.gms.common.internal;

import a6.C0779c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class y extends G5.a {
    public static final Parcelable.Creator<y> CREATOR = new C0779c(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f15123a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f15124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15125c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f15126d;

    public y(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f15123a = i7;
        this.f15124b = account;
        this.f15125c = i10;
        this.f15126d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f15123a);
        com.bumptech.glide.d.G(parcel, 2, this.f15124b, i7, false);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f15125c);
        com.bumptech.glide.d.G(parcel, 4, this.f15126d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
