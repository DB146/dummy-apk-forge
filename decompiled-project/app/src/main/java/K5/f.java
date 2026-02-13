package K5;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends G5.a {
    public static final Parcelable.Creator<f> CREATOR = new l(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f6175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6176b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6177c;

    public f(int i7, String str, ArrayList arrayList) {
        this.f6175a = i7;
        this.f6176b = str;
        this.f6177c = arrayList;
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f6175a = 1;
        this.f6176b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a) map.get(str2), str2));
            }
        }
        this.f6177c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f6175a);
        com.bumptech.glide.d.H(parcel, 2, this.f6176b, false);
        com.bumptech.glide.d.L(parcel, 3, this.f6177c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
