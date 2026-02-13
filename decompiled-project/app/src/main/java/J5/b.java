package J5;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class b extends G5.a {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f5529a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5530b;

    public b(int i7, a aVar) {
        this.f5529a = i7;
        this.f5530b = aVar;
    }

    public b(a aVar) {
        this.f5529a = 1;
        this.f5530b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 4);
        parcel.writeInt(this.f5529a);
        d.G(parcel, 2, this.f5530b, i7, false);
        d.N(M3, parcel);
    }
}
