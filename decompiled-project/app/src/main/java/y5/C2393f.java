package y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: y5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393f extends zzbz {
    public static final Parcelable.Creator<C2393f> CREATOR = new C2392e(1);

    /* renamed from: u, reason: collision with root package name */
    public static final HashMap f26979u;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f26980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26981b;

    /* renamed from: c, reason: collision with root package name */
    public C2394g f26982c;

    /* renamed from: d, reason: collision with root package name */
    public String f26983d;

    /* renamed from: e, reason: collision with root package name */
    public String f26984e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26985f;

    static {
        HashMap hashMap = new HashMap();
        f26979u = hashMap;
        hashMap.put("authenticatorInfo", new K5.a(11, false, 11, false, "authenticatorInfo", 2, C2394g.class));
        hashMap.put("signature", new K5.a(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new K5.a(7, false, 7, false, "package", 4, null));
    }

    public C2393f(HashSet hashSet, int i7, C2394g c2394g, String str, String str2, String str3) {
        this.f26980a = hashSet;
        this.f26981b = i7;
        this.f26982c = c2394g;
        this.f26983d = str;
        this.f26984e = str2;
        this.f26985f = str3;
    }

    @Override // K5.b
    public final void addConcreteTypeInternal(K5.a aVar, String str, K5.b bVar) {
        int i7 = aVar.f6163u;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), bVar.getClass().getCanonicalName()));
        }
        this.f26982c = (C2394g) bVar;
        this.f26980a.add(Integer.valueOf(i7));
    }

    @Override // K5.b
    public final /* synthetic */ Map getFieldMappings() {
        return f26979u;
    }

    @Override // K5.b
    public final Object getFieldValue(K5.a aVar) {
        int i7 = aVar.f6163u;
        if (i7 == 1) {
            return Integer.valueOf(this.f26981b);
        }
        if (i7 == 2) {
            return this.f26982c;
        }
        if (i7 == 3) {
            return this.f26983d;
        }
        if (i7 == 4) {
            return this.f26984e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f6163u);
    }

    @Override // K5.b
    public final boolean isFieldSet(K5.a aVar) {
        return this.f26980a.contains(Integer.valueOf(aVar.f6163u));
    }

    @Override // K5.b
    public final void setStringInternal(K5.a aVar, String str, String str2) {
        int i7 = aVar.f6163u;
        if (i7 == 3) {
            this.f26983d = str2;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
            }
            this.f26984e = str2;
        }
        this.f26980a.add(Integer.valueOf(i7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        HashSet hashSet = this.f26980a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.O(parcel, 1, 4);
            parcel.writeInt(this.f26981b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.G(parcel, 2, this.f26982c, i7, true);
        }
        if (hashSet.contains(3)) {
            com.bumptech.glide.d.H(parcel, 3, this.f26983d, true);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.H(parcel, 4, this.f26984e, true);
        }
        if (hashSet.contains(5)) {
            com.bumptech.glide.d.H(parcel, 5, this.f26985f, true);
        }
        com.bumptech.glide.d.N(M3, parcel);
    }
}
