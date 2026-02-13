package com.google.android.gms.auth.api.signin;

import C5.d;
import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f14877a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f14878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14879c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f14878b = googleSignInAccount;
        G.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f14877a = str;
        G.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f14879c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 4, this.f14877a, false);
        com.bumptech.glide.d.G(parcel, 7, this.f14878b, i7, false);
        com.bumptech.glide.d.H(parcel, 8, this.f14879c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
