package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ma.C1654e;

/* loaded from: classes.dex */
public final class r extends AbstractC1712c implements Cloneable {
    public static final Parcelable.Creator<r> CREATOR = new C1654e(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f21296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21297b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21298c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21299d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21300e;

    public r(String str, String str2, String str3, String str4, boolean z8) {
        com.google.android.gms.common.internal.G.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f21296a = str;
        this.f21297b = str2;
        this.f21298c = str3;
        this.f21299d = z8;
        this.f21300e = str4;
    }

    public final Object clone() {
        boolean z8 = this.f21299d;
        return new r(this.f21296a, this.f21297b, this.f21298c, this.f21300e, z8);
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21296a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21297b, false);
        com.bumptech.glide.d.H(parcel, 4, this.f21298c, false);
        boolean z8 = this.f21299d;
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(z8 ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 6, this.f21300e, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
