package F;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263g implements Parcelable {
    public static final Parcelable.Creator<C0263g> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f3973a;

    public C0263g(int i7) {
        this.f3973a = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0263g) && this.f3973a == ((C0263g) obj).f3973a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3973a);
    }

    public final String toString() {
        return X.c.k(new StringBuilder("DefaultLazyKey(index="), this.f3973a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3973a);
    }
}
