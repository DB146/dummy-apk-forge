package M4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new l(18);

    /* renamed from: a, reason: collision with root package name */
    public final List f6777a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new h(parcel));
        }
        this.f6777a = Collections.unmodifiableList(arrayList);
    }

    public i(ArrayList arrayList) {
        this.f6777a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f6777a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) list.get(i10);
            parcel.writeLong(hVar.f6769a);
            parcel.writeByte(hVar.f6770b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f6771c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f6772d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f6774f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) list2.get(i11);
                parcel.writeInt(gVar.f6767a);
                parcel.writeLong(gVar.f6768b);
            }
            parcel.writeLong(hVar.f6773e);
            parcel.writeByte(hVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f6775h);
            parcel.writeInt(hVar.f6776i);
            parcel.writeInt(hVar.j);
            parcel.writeInt(hVar.k);
        }
    }
}
