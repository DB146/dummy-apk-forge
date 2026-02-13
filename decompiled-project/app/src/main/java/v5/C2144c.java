package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import ma.C1654e;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2144c extends G5.a {
    public static final Parcelable.Creator<C2144c> CREATOR = new C1654e(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f25072a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25073b;

    public C2144c(int i7, ArrayList arrayList) {
        this.f25072a = i7;
        G.g(arrayList);
        this.f25073b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f25072a);
        com.bumptech.glide.d.L(parcel, 2, this.f25073b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
