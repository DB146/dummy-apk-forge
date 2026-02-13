package v5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ma.C1654e;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143b extends G5.a {
    public static final Parcelable.Creator<C2143b> CREATOR = new C1654e(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f25068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25069b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25070c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f25071d;

    public C2143b(int i7, int i10, String str, Account account) {
        this.f25068a = i7;
        this.f25069b = i10;
        this.f25070c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f25071d = account;
        } else {
            this.f25071d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f25068a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f25069b);
        com.bumptech.glide.d.H(parcel, 3, this.f25070c, false);
        com.bumptech.glide.d.G(parcel, 4, this.f25071d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
