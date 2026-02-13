package n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import ma.C1654e;

/* loaded from: classes.dex */
public final class F extends AbstractC1712c {
    public static final Parcelable.Creator<F> CREATOR = new C1654e(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f21257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21258b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21259c;

    /* renamed from: d, reason: collision with root package name */
    public final zzait f21260d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21261e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21262f;

    /* renamed from: u, reason: collision with root package name */
    public final String f21263u;

    public F(String str, String str2, String str3, zzait zzaitVar, String str4, String str5, String str6) {
        this.f21257a = zzae.zzb(str);
        this.f21258b = str2;
        this.f21259c = str3;
        this.f21260d = zzaitVar;
        this.f21261e = str4;
        this.f21262f = str5;
        this.f21263u = str6;
    }

    public static F C(zzait zzaitVar) {
        com.google.android.gms.common.internal.G.h(zzaitVar, "Must specify a non-null webSignInCredential");
        return new F(null, null, null, zzaitVar, null, null, null);
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return this.f21257a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21257a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21258b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f21259c, false);
        com.bumptech.glide.d.G(parcel, 4, this.f21260d, i7, false);
        com.bumptech.glide.d.H(parcel, 5, this.f21261e, false);
        com.bumptech.glide.d.H(parcel, 6, this.f21262f, false);
        com.bumptech.glide.d.H(parcel, 7, this.f21263u, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    public final AbstractC1712c z() {
        return new F(this.f21257a, this.f21258b, this.f21259c, this.f21260d, this.f21261e, this.f21262f, this.f21263u);
    }
}
