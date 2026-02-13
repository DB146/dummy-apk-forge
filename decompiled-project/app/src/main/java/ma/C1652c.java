package ma;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* renamed from: ma.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652c implements Parcelable {
    public static final Parcelable.Creator<C1652c> CREATOR = new C0779c(29);

    /* renamed from: a, reason: collision with root package name */
    public final C1651b f20823a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20824b;

    public C1652c(C1651b match, List list) {
        l.e(match, "match");
        this.f20823a = match;
        this.f20824b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1652c)) {
            return false;
        }
        C1652c c1652c = (C1652c) obj;
        return l.a(this.f20823a, c1652c.f20823a) && l.a(this.f20824b, c1652c.f20824b);
    }

    public final int hashCode() {
        return this.f20824b.hashCode() + (this.f20823a.hashCode() * 31);
    }

    public final String toString() {
        return "FootballMatchWithStreamLink(match=" + this.f20823a + ", linkStreams=" + this.f20824b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        this.f20823a.writeToParcel(dest, i7);
        List list = this.f20824b;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((g) it.next()).writeToParcel(dest, i7);
        }
    }
}
