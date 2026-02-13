package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ma.C1654e;

/* renamed from: n7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713d extends AbstractC1712c {
    public static final Parcelable.Creator<C1713d> CREATOR = new C1654e(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f21281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21283c;

    /* renamed from: d, reason: collision with root package name */
    public String f21284d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21285e;

    public C1713d(String str, String str2, String str3, String str4, boolean z8) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21281a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f21282b = str2;
        this.f21283c = str3;
        this.f21284d = str4;
        this.f21285e = z8;
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "password";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21281a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21282b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f21283c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f21284d, false);
        boolean z8 = this.f21285e;
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(z8 ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
