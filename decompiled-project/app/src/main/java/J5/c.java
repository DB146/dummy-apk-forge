package J5;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class c extends G5.a {
    public static final Parcelable.Creator<c> CREATOR = new B5.c(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f5531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5533c;

    public c(int i7, String str, int i10) {
        this.f5531a = i7;
        this.f5532b = str;
        this.f5533c = i10;
    }

    public c(String str, int i7) {
        this.f5531a = 1;
        this.f5532b = str;
        this.f5533c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 4);
        parcel.writeInt(this.f5531a);
        d.H(parcel, 2, this.f5532b, false);
        d.O(parcel, 3, 4);
        parcel.writeInt(this.f5533c);
        d.N(M3, parcel);
    }
}
