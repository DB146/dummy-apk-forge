package K5;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends G5.a {
    public static final Parcelable.Creator<h> CREATOR = new l(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f6181a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6183c;

    public h(int i7, String str, ArrayList arrayList) {
        this.f6181a = i7;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            String str2 = fVar.f6176b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = fVar.f6177c;
            G.g(arrayList2);
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) arrayList2.get(i11);
                hashMap2.put(gVar.f6179b, gVar.f6180c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f6182b = hashMap;
        G.g(str);
        this.f6183c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a) map.get((String) it2.next())).f6166x = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = this.f6182b;
        for (String str : hashMap.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f6181a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f6182b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new f(str, (Map) hashMap.get(str)));
        }
        com.bumptech.glide.d.L(parcel, 2, arrayList, false);
        com.bumptech.glide.d.H(parcel, 3, this.f6183c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
