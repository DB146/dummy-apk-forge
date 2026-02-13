package F4;

import android.os.Parcel;
import android.os.Parcelable;
import c2.q;
import java.util.Arrays;
import java.util.List;
import n5.D;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f4071a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4072b;

    public c(long j, b... bVarArr) {
        this.f4072b = j;
        this.f4071a = bVarArr;
    }

    public c(Parcel parcel) {
        this.f4071a = new b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b[] bVarArr = this.f4071a;
            if (i7 >= bVarArr.length) {
                this.f4072b = parcel.readLong();
                return;
            } else {
                bVarArr[i7] = (b) parcel.readParcelable(b.class.getClassLoader());
                i7++;
            }
        }
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i7 = D.f21141a;
        b[] bVarArr2 = this.f4071a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new c(this.f4072b, (b[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f4071a, cVar.f4071a) && this.f4072b == cVar.f4072b;
    }

    public final int hashCode() {
        return q.m(this.f4072b) + (Arrays.hashCode(this.f4071a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f4071a));
        long j = this.f4072b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        b[] bVarArr = this.f4071a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f4072b);
    }
}
