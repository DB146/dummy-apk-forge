package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import m4.AbstractC1571h;
import ma.C1654e;

/* renamed from: r4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936h implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1936h> CREATOR = new C1654e(21);

    /* renamed from: a, reason: collision with root package name */
    public final C1935g[] f23761a;

    /* renamed from: b, reason: collision with root package name */
    public int f23762b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23763c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23764d;

    public C1936h(Parcel parcel) {
        this.f23763c = parcel.readString();
        C1935g[] c1935gArr = (C1935g[]) parcel.createTypedArray(C1935g.CREATOR);
        int i7 = n5.D.f21141a;
        this.f23761a = c1935gArr;
        this.f23764d = c1935gArr.length;
    }

    public C1936h(String str, ArrayList arrayList) {
        this(str, false, (C1935g[]) arrayList.toArray(new C1935g[0]));
    }

    public C1936h(String str, boolean z8, C1935g... c1935gArr) {
        this.f23763c = str;
        c1935gArr = z8 ? (C1935g[]) c1935gArr.clone() : c1935gArr;
        this.f23761a = c1935gArr;
        this.f23764d = c1935gArr.length;
        Arrays.sort(c1935gArr, this);
    }

    public C1936h(C1935g... c1935gArr) {
        this(null, true, c1935gArr);
    }

    public final C1936h a(String str) {
        return n5.D.a(this.f23763c, str) ? this : new C1936h(str, false, this.f23761a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1935g c1935g = (C1935g) obj;
        C1935g c1935g2 = (C1935g) obj2;
        UUID uuid = AbstractC1571h.f20382a;
        return uuid.equals(c1935g.f23757b) ? uuid.equals(c1935g2.f23757b) ? 0 : 1 : c1935g.f23757b.compareTo(c1935g2.f23757b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1936h.class != obj.getClass()) {
            return false;
        }
        C1936h c1936h = (C1936h) obj;
        return n5.D.a(this.f23763c, c1936h.f23763c) && Arrays.equals(this.f23761a, c1936h.f23761a);
    }

    public final int hashCode() {
        if (this.f23762b == 0) {
            String str = this.f23763c;
            this.f23762b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f23761a);
        }
        return this.f23762b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f23763c);
        parcel.writeTypedArray(this.f23761a, 0);
    }
}
