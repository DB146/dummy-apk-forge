package G4;

import B5.c;
import android.os.Parcel;
import android.os.Parcelable;
import h3.o;

/* loaded from: classes.dex */
public final class a implements F4.b {
    public static final Parcelable.Creator<a> CREATOR = new c(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4351b;

    public a(int i7, String str) {
        this.f4350a = i7;
        this.f4351b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f4350a);
        sb2.append(",url=");
        return o.p(sb2, this.f4351b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4351b);
        parcel.writeInt(this.f4350a);
    }
}
