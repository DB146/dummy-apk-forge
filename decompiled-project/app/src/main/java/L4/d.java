package L4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class d implements F4.b {
    public static final Parcelable.Creator<d> CREATOR = new l(12);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6300a;

    public d(ArrayList arrayList) {
        this.f6300a = arrayList;
        boolean z8 = false;
        if (!arrayList.isEmpty()) {
            long j = ((c) arrayList.get(0)).f6298b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i7)).f6297a < j) {
                    z8 = true;
                    break;
                } else {
                    j = ((c) arrayList.get(i7)).f6298b;
                    i7++;
                }
            }
        }
        AbstractC1705a.h(!z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f6300a.equals(((d) obj).f6300a);
    }

    public final int hashCode() {
        return this.f6300a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f6300a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f6300a);
    }
}
