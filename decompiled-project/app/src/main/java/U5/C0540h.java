package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540h extends G5.a {
    public static final Parcelable.Creator<C0540h> CREATOR = new T(20);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9761a;

    public C0540h(boolean z8) {
        this.f9761a = z8;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0540h) && this.f9761a == ((C0540h) obj).f9761a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9761a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9761a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
