package K6;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import h3.o;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new l(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f6190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6192c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6193d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6194e;

    public b(int i7, int i10, String str, String str2, String str3) {
        this.f6190a = i7;
        this.f6191b = i10;
        if (str == null) {
            throw new NullPointerException("Null altText");
        }
        this.f6192c = str;
        if (str2 == null) {
            throw new NullPointerException("Null creativeType");
        }
        this.f6193d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null staticResourceUri");
        }
        this.f6194e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f6190a == bVar.f6190a && this.f6191b == bVar.f6191b && this.f6192c.equals(bVar.f6192c) && this.f6193d.equals(bVar.f6193d) && this.f6194e.equals(bVar.f6194e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f6190a ^ 1000003) * 1000003) ^ this.f6191b) * 1000003) ^ this.f6192c.hashCode()) * 1000003) ^ this.f6193d.hashCode()) * 1000003) ^ this.f6194e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IconClickFallbackImage{width=");
        sb2.append(this.f6190a);
        sb2.append(", height=");
        sb2.append(this.f6191b);
        sb2.append(", altText=");
        sb2.append(this.f6192c);
        sb2.append(", creativeType=");
        sb2.append(this.f6193d);
        sb2.append(", staticResourceUri=");
        return o.p(sb2, this.f6194e, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6190a);
        parcel.writeInt(this.f6191b);
        parcel.writeString(this.f6192c);
        parcel.writeString(this.f6193d);
        parcel.writeString(this.f6194e);
    }
}
