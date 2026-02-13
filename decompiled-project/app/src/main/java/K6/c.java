package K6;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractCollection;
import java.util.List;
import y.S;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new l(9);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f6195a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List list) {
        if (list == 0) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.f6195a = (AbstractCollection) list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f6195a.equals(((c) obj).f6195a);
    }

    public final int hashCode() {
        return this.f6195a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return S.b("IconClickFallbackImages{iconClickFallbackImageList=", this.f6195a.toString(), "}");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f6195a);
    }
}
