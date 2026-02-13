package I4;

import B5.c;
import M6.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.C1560b0;
import n5.D;
import n5.v;

/* loaded from: classes.dex */
public final class a implements F4.b {
    public static final Parcelable.Creator<a> CREATOR = new c(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f5220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5221b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5222c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5223d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5224e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5225f;

    /* renamed from: u, reason: collision with root package name */
    public final int f5226u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f5227v;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f5220a = i7;
        this.f5221b = str;
        this.f5222c = str2;
        this.f5223d = i10;
        this.f5224e = i11;
        this.f5225f = i12;
        this.f5226u = i13;
        this.f5227v = bArr;
    }

    public a(Parcel parcel) {
        this.f5220a = parcel.readInt();
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f5221b = readString;
        this.f5222c = parcel.readString();
        this.f5223d = parcel.readInt();
        this.f5224e = parcel.readInt();
        this.f5225f = parcel.readInt();
        this.f5226u = parcel.readInt();
        this.f5227v = parcel.createByteArray();
    }

    public static a a(v vVar) {
        int h10 = vVar.h();
        String t5 = vVar.t(vVar.h(), e.f6797a);
        String t10 = vVar.t(vVar.h(), e.f6799c);
        int h11 = vVar.h();
        int h12 = vVar.h();
        int h13 = vVar.h();
        int h14 = vVar.h();
        int h15 = vVar.h();
        byte[] bArr = new byte[h15];
        vVar.f(0, bArr, h15);
        return new a(h10, t5, t10, h11, h12, h13, h14, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5220a == aVar.f5220a && this.f5221b.equals(aVar.f5221b) && this.f5222c.equals(aVar.f5222c) && this.f5223d == aVar.f5223d && this.f5224e == aVar.f5224e && this.f5225f == aVar.f5225f && this.f5226u == aVar.f5226u && Arrays.equals(this.f5227v, aVar.f5227v);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5227v) + ((((((((A3.c.d(A3.c.d((527 + this.f5220a) * 31, 31, this.f5221b), 31, this.f5222c) + this.f5223d) * 31) + this.f5224e) * 31) + this.f5225f) * 31) + this.f5226u) * 31);
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        c1560b0.a(this.f5220a, this.f5227v);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f5221b + ", description=" + this.f5222c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5220a);
        parcel.writeString(this.f5221b);
        parcel.writeString(this.f5222c);
        parcel.writeInt(this.f5223d);
        parcel.writeInt(this.f5224e);
        parcel.writeInt(this.f5225f);
        parcel.writeInt(this.f5226u);
        parcel.writeByteArray(this.f5227v);
    }
}
