package y5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: y5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2394g extends zzbz {
    public static final Parcelable.Creator<C2394g> CREATOR = new C2392e(2);

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap f26986v;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f26987a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26988b;

    /* renamed from: c, reason: collision with root package name */
    public String f26989c;

    /* renamed from: d, reason: collision with root package name */
    public int f26990d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f26991e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f26992f;

    /* renamed from: u, reason: collision with root package name */
    public final C2388a f26993u;

    static {
        HashMap hashMap = new HashMap();
        f26986v = hashMap;
        hashMap.put("accountType", new K5.a(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new K5.a(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new K5.a(8, false, 8, false, "transferBytes", 4, null));
    }

    public C2394g(HashSet hashSet, int i7, String str, int i10, byte[] bArr, PendingIntent pendingIntent, C2388a c2388a) {
        this.f26987a = hashSet;
        this.f26988b = i7;
        this.f26989c = str;
        this.f26990d = i10;
        this.f26991e = bArr;
        this.f26992f = pendingIntent;
        this.f26993u = c2388a;
    }

    @Override // K5.b
    public final /* synthetic */ Map getFieldMappings() {
        return f26986v;
    }

    @Override // K5.b
    public final Object getFieldValue(K5.a aVar) {
        int i7 = aVar.f6163u;
        if (i7 == 1) {
            return Integer.valueOf(this.f26988b);
        }
        if (i7 == 2) {
            return this.f26989c;
        }
        if (i7 == 3) {
            return Integer.valueOf(this.f26990d);
        }
        if (i7 == 4) {
            return this.f26991e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f6163u);
    }

    @Override // K5.b
    public final boolean isFieldSet(K5.a aVar) {
        return this.f26987a.contains(Integer.valueOf(aVar.f6163u));
    }

    @Override // K5.b
    public final void setDecodedBytesInternal(K5.a aVar, String str, byte[] bArr) {
        int i7 = aVar.f6163u;
        if (i7 != 4) {
            throw new IllegalArgumentException(A3.c.f(i7, "Field with id=", " is not known to be a byte array."));
        }
        this.f26991e = bArr;
        this.f26987a.add(Integer.valueOf(i7));
    }

    @Override // K5.b
    public final void setIntegerInternal(K5.a aVar, String str, int i7) {
        int i10 = aVar.f6163u;
        if (i10 != 3) {
            throw new IllegalArgumentException(A3.c.f(i10, "Field with id=", " is not known to be an int."));
        }
        this.f26990d = i7;
        this.f26987a.add(Integer.valueOf(i10));
    }

    @Override // K5.b
    public final void setStringInternal(K5.a aVar, String str, String str2) {
        int i7 = aVar.f6163u;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
        }
        this.f26989c = str2;
        this.f26987a.add(Integer.valueOf(i7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        HashSet hashSet = this.f26987a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.O(parcel, 1, 4);
            parcel.writeInt(this.f26988b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.H(parcel, 2, this.f26989c, true);
        }
        if (hashSet.contains(3)) {
            int i10 = this.f26990d;
            com.bumptech.glide.d.O(parcel, 3, 4);
            parcel.writeInt(i10);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.A(parcel, 4, this.f26991e, true);
        }
        if (hashSet.contains(5)) {
            com.bumptech.glide.d.G(parcel, 5, this.f26992f, i7, true);
        }
        if (hashSet.contains(6)) {
            com.bumptech.glide.d.G(parcel, 6, this.f26993u, i7, true);
        }
        com.bumptech.glide.d.N(M3, parcel);
    }
}
