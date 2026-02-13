package y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ma.C1654e;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2389b extends zzbz {
    public static final Parcelable.Creator<C2389b> CREATOR = new C1654e(29);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f26965f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f26966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26967b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f26968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26969d;

    /* renamed from: e, reason: collision with root package name */
    public C2391d f26970e;

    static {
        HashMap hashMap = new HashMap();
        f26965f = hashMap;
        hashMap.put("authenticatorData", new K5.a(11, true, 11, true, "authenticatorData", 2, C2393f.class));
        hashMap.put("progress", new K5.a(11, false, 11, false, "progress", 4, C2391d.class));
    }

    public C2389b(HashSet hashSet, int i7, ArrayList arrayList, int i10, C2391d c2391d) {
        this.f26966a = hashSet;
        this.f26967b = i7;
        this.f26968c = arrayList;
        this.f26969d = i10;
        this.f26970e = c2391d;
    }

    @Override // K5.b
    public final void addConcreteTypeArrayInternal(K5.a aVar, String str, ArrayList arrayList) {
        int i7 = aVar.f6163u;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i7), arrayList.getClass().getCanonicalName()));
        }
        this.f26968c = arrayList;
        this.f26966a.add(Integer.valueOf(i7));
    }

    @Override // K5.b
    public final void addConcreteTypeInternal(K5.a aVar, String str, K5.b bVar) {
        int i7 = aVar.f6163u;
        if (i7 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), bVar.getClass().getCanonicalName()));
        }
        this.f26970e = (C2391d) bVar;
        this.f26966a.add(Integer.valueOf(i7));
    }

    @Override // K5.b
    public final /* synthetic */ Map getFieldMappings() {
        return f26965f;
    }

    @Override // K5.b
    public final Object getFieldValue(K5.a aVar) {
        int i7 = aVar.f6163u;
        if (i7 == 1) {
            return Integer.valueOf(this.f26967b);
        }
        if (i7 == 2) {
            return this.f26968c;
        }
        if (i7 == 4) {
            return this.f26970e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f6163u);
    }

    @Override // K5.b
    public final boolean isFieldSet(K5.a aVar) {
        return this.f26966a.contains(Integer.valueOf(aVar.f6163u));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        HashSet hashSet = this.f26966a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.O(parcel, 1, 4);
            parcel.writeInt(this.f26967b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.L(parcel, 2, this.f26968c, true);
        }
        if (hashSet.contains(3)) {
            com.bumptech.glide.d.O(parcel, 3, 4);
            parcel.writeInt(this.f26969d);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.G(parcel, 4, this.f26970e, i7, true);
        }
        com.bumptech.glide.d.N(M3, parcel);
    }
}
