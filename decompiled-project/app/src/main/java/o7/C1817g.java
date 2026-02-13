package o7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817g extends G5.a {
    public static final Parcelable.Creator<C1817g> CREATOR = new C1812b(3);

    /* renamed from: a, reason: collision with root package name */
    public String f22083a;

    /* renamed from: b, reason: collision with root package name */
    public String f22084b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f22085c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f22086d;

    /* renamed from: e, reason: collision with root package name */
    public C1815e f22087e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f22083a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f22084b, false);
        com.bumptech.glide.d.L(parcel, 3, this.f22085c, false);
        com.bumptech.glide.d.L(parcel, 4, this.f22086d, false);
        com.bumptech.glide.d.G(parcel, 5, this.f22087e, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
