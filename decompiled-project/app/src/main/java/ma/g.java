package ma;

import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new C1654e(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f20834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20835b;

    public g(String m3u8Link, String referer) {
        l.e(m3u8Link, "m3u8Link");
        l.e(referer, "referer");
        this.f20834a = m3u8Link;
        this.f20835b = referer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f20834a, gVar.f20834a) && l.a(this.f20835b, gVar.f20835b);
    }

    public final int hashCode() {
        return this.f20835b.hashCode() + (this.f20834a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LinkStreamWithReferer(m3u8Link=");
        sb2.append(this.f20834a);
        sb2.append(", referer=");
        return o.p(sb2, this.f20835b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.f20834a);
        dest.writeString(this.f20835b);
    }
}
