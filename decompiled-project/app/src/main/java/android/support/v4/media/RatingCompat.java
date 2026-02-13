package android.support.v4.media;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0779c(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f12849a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12850b;

    public RatingCompat(int i7, float f4) {
        this.f12849a = i7;
        this.f12850b = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f12849a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f12849a);
        sb2.append(" rating=");
        float f4 = this.f12850b;
        sb2.append(f4 < 0.0f ? "unrated" : String.valueOf(f4));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f12849a);
        parcel.writeFloat(this.f12850b);
    }
}
