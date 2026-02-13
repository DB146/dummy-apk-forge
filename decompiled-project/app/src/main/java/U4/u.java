package U4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements F4.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9681b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9682c;

    public u(Parcel parcel) {
        this.f9680a = parcel.readString();
        this.f9681b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f9682c = Collections.unmodifiableList(arrayList);
    }

    public u(String str, String str2, List list) {
        this.f9680a = str;
        this.f9681b = str2;
        this.f9682c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return TextUtils.equals(this.f9680a, uVar.f9680a) && TextUtils.equals(this.f9681b, uVar.f9681b) && this.f9682c.equals(uVar.f9682c);
    }

    public final int hashCode() {
        String str = this.f9680a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9681b;
        return this.f9682c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f9680a;
        sb2.append(str != null ? h3.o.p(X.c.n(" [", str, ", "), this.f9681b, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9680a);
        parcel.writeString(this.f9681b);
        List list = this.f9682c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }
}
