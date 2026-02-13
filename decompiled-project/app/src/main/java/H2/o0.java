package H2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new B5.c(12);

    /* renamed from: a, reason: collision with root package name */
    public int f4764a;

    /* renamed from: b, reason: collision with root package name */
    public int f4765b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f4766c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4767d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4764a + ", mGapDir=" + this.f4765b + ", mHasUnwantedGapAfter=" + this.f4767d + ", mGapPerSpan=" + Arrays.toString(this.f4766c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4764a);
        parcel.writeInt(this.f4765b);
        parcel.writeInt(this.f4767d ? 1 : 0);
        int[] iArr = this.f4766c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4766c);
        }
    }
}
