package ma;

import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new C1654e(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f20830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20832c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20833d;

    public f(String name, String id, String league, String logo) {
        l.e(name, "name");
        l.e(id, "id");
        l.e(league, "league");
        l.e(logo, "logo");
        this.f20830a = name;
        this.f20831b = id;
        this.f20832c = league;
        this.f20833d = logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f20830a, fVar.f20830a) && l.a(this.f20831b, fVar.f20831b) && l.a(this.f20832c, fVar.f20832c) && l.a(this.f20833d, fVar.f20833d);
    }

    public final int hashCode() {
        return this.f20833d.hashCode() + A3.c.d(A3.c.d(this.f20830a.hashCode() * 31, 31, this.f20831b), 31, this.f20832c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FootballTeam(name=");
        sb2.append(this.f20830a);
        sb2.append(", id=");
        sb2.append(this.f20831b);
        sb2.append(", league=");
        sb2.append(this.f20832c);
        sb2.append(", logo=");
        return o.p(sb2, this.f20833d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.f20830a);
        dest.writeString(this.f20831b);
        dest.writeString(this.f20832c);
        dest.writeString(this.f20833d);
    }
}
