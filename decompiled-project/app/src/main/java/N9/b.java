package N9;

import Db.o;
import K4.l;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new l(21);

    /* renamed from: u, reason: collision with root package name */
    public static final o f7399u = android.support.v4.media.session.b.z(new I9.a(21));

    /* renamed from: a, reason: collision with root package name */
    public final String f7400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7401b;

    /* renamed from: c, reason: collision with root package name */
    public String f7402c;

    /* renamed from: d, reason: collision with root package name */
    public String f7403d;

    /* renamed from: e, reason: collision with root package name */
    public String f7404e;

    /* renamed from: f, reason: collision with root package name */
    public String f7405f;

    public b(String date, String sourceInfoName, String generatorInfoName, String generatorInfoUrl, String extensionsConfigId, String epgUrl) {
        kotlin.jvm.internal.l.e(date, "date");
        kotlin.jvm.internal.l.e(sourceInfoName, "sourceInfoName");
        kotlin.jvm.internal.l.e(generatorInfoName, "generatorInfoName");
        kotlin.jvm.internal.l.e(generatorInfoUrl, "generatorInfoUrl");
        kotlin.jvm.internal.l.e(extensionsConfigId, "extensionsConfigId");
        kotlin.jvm.internal.l.e(epgUrl, "epgUrl");
        this.f7400a = date;
        this.f7401b = sourceInfoName;
        this.f7402c = generatorInfoName;
        this.f7403d = generatorInfoUrl;
        this.f7404e = extensionsConfigId;
        this.f7405f = epgUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f7402c;
        String str2 = this.f7403d;
        String str3 = this.f7404e;
        StringBuilder sb2 = new StringBuilder("{date: ");
        sb2.append(this.f7400a);
        sb2.append(",\nsourceInfoName: ");
        h3.o.v(sb2, this.f7401b, ",\ngeneratorInfoName: ", str, ",\nsourceInfoUrl: ");
        sb2.append(str2);
        sb2.append(",\nlistTV: ");
        sb2.append(str3);
        sb2.append(",\n}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f7400a);
        dest.writeString(this.f7401b);
        dest.writeString(this.f7402c);
        dest.writeString(this.f7403d);
        dest.writeString(this.f7404e);
        dest.writeString(this.f7405f);
    }
}
