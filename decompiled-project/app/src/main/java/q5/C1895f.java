package q5;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* renamed from: q5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895f implements Parcelable {
    public static final Parcelable.Creator<C1895f> CREATOR = new C1654e(20);

    /* renamed from: a, reason: collision with root package name */
    public int f23506a;

    /* renamed from: b, reason: collision with root package name */
    public int f23507b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
        sb2.append(this.f23506a);
        sb2.append(", mAnchorOffset=");
        return X.c.k(sb2, this.f23507b, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f23506a);
        parcel.writeInt(this.f23507b);
    }
}
