package B5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class b extends G5.a {
    public static final Parcelable.Creator<b> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2105a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f2106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2107c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2108d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2109e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f2110f;

    public b(int i7, int i10, PendingIntent pendingIntent, int i11, Bundle bundle, byte[] bArr) {
        this.f2109e = i7;
        this.f2105a = i10;
        this.f2107c = i11;
        this.f2110f = bundle;
        this.f2108d = bArr;
        this.f2106b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 4);
        parcel.writeInt(this.f2105a);
        d.G(parcel, 2, this.f2106b, i7, false);
        d.O(parcel, 3, 4);
        parcel.writeInt(this.f2107c);
        d.z(parcel, 4, this.f2110f, false);
        d.A(parcel, 5, this.f2108d, false);
        d.O(parcel, 1000, 4);
        parcel.writeInt(this.f2109e);
        d.N(M3, parcel);
    }
}
