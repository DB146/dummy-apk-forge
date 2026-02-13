package M9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f6850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6851b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6852c;

    static {
        android.support.v4.media.session.b.z(new I9.a(11));
        android.support.v4.media.session.b.z(new I9.a(12));
    }

    public /* synthetic */ d(String str, String str2) {
        this(str, str2, c.f6846a);
    }

    public d(String sourceName, String sourceUrl, c type) {
        kotlin.jvm.internal.l.e(sourceName, "sourceName");
        kotlin.jvm.internal.l.e(sourceUrl, "sourceUrl");
        kotlin.jvm.internal.l.e(type, "type");
        this.f6850a = sourceName;
        this.f6851b = sourceUrl;
        this.f6852c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f6850a, dVar.f6850a) && kotlin.jvm.internal.l.a(this.f6851b, dVar.f6850a);
    }

    public final int hashCode() {
        return this.f6852c.hashCode() + A3.c.d(this.f6850a.hashCode() * 31, 31, this.f6851b);
    }

    public final String toString() {
        return "{sourceName: " + this.f6850a + ",\nsourceUrl: " + this.f6851b + ",\ntype: " + this.f6852c + "\n}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f6850a);
        dest.writeString(this.f6851b);
        dest.writeString(this.f6852c.name());
    }
}
