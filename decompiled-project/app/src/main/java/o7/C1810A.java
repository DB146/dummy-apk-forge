package o7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import n7.F;

/* renamed from: o7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810A implements G5.c {
    public static final Parcelable.Creator<C1810A> CREATOR = new C1812b(6);

    /* renamed from: a, reason: collision with root package name */
    public C1815e f22056a;

    /* renamed from: b, reason: collision with root package name */
    public z f22057b;

    /* renamed from: c, reason: collision with root package name */
    public F f22058c;

    public C1810A(C1815e c1815e) {
        G.g(c1815e);
        this.f22056a = c1815e;
        ArrayList arrayList = c1815e.f22073e;
        this.f22057b = null;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!TextUtils.isEmpty(((C1813c) arrayList.get(i7)).f22067v)) {
                this.f22057b = new z(((C1813c) arrayList.get(i7)).f22061b, ((C1813c) arrayList.get(i7)).f22067v, c1815e.f22078x);
            }
        }
        if (this.f22057b == null) {
            this.f22057b = new z(c1815e.f22078x);
        }
        this.f22058c = c1815e.f22079y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f22056a, i7, false);
        com.bumptech.glide.d.G(parcel, 2, this.f22057b, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f22058c, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
