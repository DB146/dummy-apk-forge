package com.google.android.gms.auth.api.signin.internal;

import B5.c;
import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new c(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f14880a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f14881b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        G.d(str);
        this.f14880a = str;
        this.f14881b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f14880a.equals(signInConfiguration.f14880a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f14881b;
            GoogleSignInOptions googleSignInOptions2 = this.f14881b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 1 * 31;
        String str = this.f14880a;
        int hashCode = (i7 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f14881b;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 2, this.f14880a, false);
        d.G(parcel, 5, this.f14881b, i7, false);
        d.N(M3, parcel);
    }
}
