package Y5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class B1 extends G5.a {
    public static final Parcelable.Creator<B1> CREATOR = new U5.a0(26);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11228a;

    public B1(ArrayList arrayList) {
        this.f11228a = arrayList;
    }

    public static B1 t(Y0... y0Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(y0Arr[0].f11603a));
        return new B1(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        ArrayList arrayList = this.f11228a;
        if (arrayList != null) {
            int M10 = com.bumptech.glide.d.M(1, parcel);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) arrayList.get(i10)).intValue());
            }
            com.bumptech.glide.d.N(M10, parcel);
        }
        com.bumptech.glide.d.N(M3, parcel);
    }
}
