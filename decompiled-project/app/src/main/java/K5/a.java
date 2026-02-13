package K5;

import android.os.Parcel;
import q3.s;

/* loaded from: classes.dex */
public final class a extends G5.a {
    public static final e CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f6157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6158b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6160d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6161e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6162f;

    /* renamed from: u, reason: collision with root package name */
    public final int f6163u;

    /* renamed from: v, reason: collision with root package name */
    public final Class f6164v;

    /* renamed from: w, reason: collision with root package name */
    public final String f6165w;

    /* renamed from: x, reason: collision with root package name */
    public h f6166x;

    /* renamed from: y, reason: collision with root package name */
    public final J5.a f6167y;

    public a(int i7, int i10, boolean z8, int i11, boolean z10, String str, int i12, String str2, J5.b bVar) {
        this.f6157a = i7;
        this.f6158b = i10;
        this.f6159c = z8;
        this.f6160d = i11;
        this.f6161e = z10;
        this.f6162f = str;
        this.f6163u = i12;
        if (str2 == null) {
            this.f6164v = null;
            this.f6165w = null;
        } else {
            this.f6164v = d.class;
            this.f6165w = str2;
        }
        if (bVar == null) {
            this.f6167y = null;
            return;
        }
        J5.a aVar = bVar.f5530b;
        if (aVar == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f6167y = aVar;
    }

    public a(int i7, boolean z8, int i10, boolean z10, String str, int i11, Class cls) {
        this.f6157a = 1;
        this.f6158b = i7;
        this.f6159c = z8;
        this.f6160d = i10;
        this.f6161e = z10;
        this.f6162f = str;
        this.f6163u = i11;
        this.f6164v = cls;
        if (cls == null) {
            this.f6165w = null;
        } else {
            this.f6165w = cls.getCanonicalName();
        }
        this.f6167y = null;
    }

    public static a t(int i7, String str) {
        return new a(7, true, 7, true, str, i7, null);
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(Integer.valueOf(this.f6157a), "versionCode");
        sVar.f(Integer.valueOf(this.f6158b), "typeIn");
        sVar.f(Boolean.valueOf(this.f6159c), "typeInArray");
        sVar.f(Integer.valueOf(this.f6160d), "typeOut");
        sVar.f(Boolean.valueOf(this.f6161e), "typeOutArray");
        sVar.f(this.f6162f, "outputFieldName");
        sVar.f(Integer.valueOf(this.f6163u), "safeParcelFieldId");
        String str = this.f6165w;
        if (str == null) {
            str = null;
        }
        sVar.f(str, "concreteTypeName");
        Class cls = this.f6164v;
        if (cls != null) {
            sVar.f(cls.getCanonicalName(), "concreteType.class");
        }
        J5.a aVar = this.f6167y;
        if (aVar != null) {
            sVar.f(aVar.getClass().getCanonicalName(), "converterName");
        }
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f6157a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f6158b);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f6159c ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f6160d);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f6161e ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 6, this.f6162f, false);
        com.bumptech.glide.d.O(parcel, 7, 4);
        parcel.writeInt(this.f6163u);
        J5.b bVar = null;
        String str = this.f6165w;
        if (str == null) {
            str = null;
        }
        com.bumptech.glide.d.H(parcel, 8, str, false);
        J5.a aVar = this.f6167y;
        if (aVar != null) {
            if (!(aVar instanceof J5.a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            bVar = new J5.b(aVar);
        }
        com.bumptech.glide.d.G(parcel, 9, bVar, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
