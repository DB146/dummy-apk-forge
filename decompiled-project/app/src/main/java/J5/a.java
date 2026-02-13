package J5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends G5.a {
    public static final Parcelable.Creator<a> CREATOR = new B5.c(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f5526a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5527b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f5528c = new SparseArray();

    public a(int i7, ArrayList arrayList) {
        this.f5526a = i7;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            String str = cVar.f5532b;
            int i11 = cVar.f5533c;
            this.f5527b.put(str, Integer.valueOf(i11));
            this.f5528c.put(i11, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 4);
        parcel.writeInt(this.f5526a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f5527b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new c(str, ((Integer) hashMap.get(str)).intValue()));
        }
        d.L(parcel, 2, arrayList, false);
        d.N(M3, parcel);
    }
}
