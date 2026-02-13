package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;

/* renamed from: a6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782f extends G5.a implements r {
    public static final Parcelable.Creator<C0782f> CREATOR = new C0779c(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12790b;

    public C0782f(String str, ArrayList arrayList) {
        this.f12789a = arrayList;
        this.f12790b = str;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f12790b != null ? Status.f14892e : Status.f14896w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f12789a);
        com.bumptech.glide.d.H(parcel, 2, this.f12790b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
