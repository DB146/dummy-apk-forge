package Y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r extends G5.a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new U5.a0(22);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11922a;

    public r(Bundle bundle) {
        this.f11922a = bundle;
    }

    public final String C() {
        return this.f11922a.getString("currency");
    }

    public final Bundle D() {
        return new Bundle(this.f11922a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new I7.e(this);
    }

    public final Object t(String str) {
        return this.f11922a.get(str);
    }

    public final String toString() {
        return this.f11922a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.z(parcel, 2, D(), false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    public final Double z() {
        return Double.valueOf(this.f11922a.getDouble("value"));
    }
}
