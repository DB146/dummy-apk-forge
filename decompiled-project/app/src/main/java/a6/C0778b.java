package a6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778b extends G5.a implements r {
    public static final Parcelable.Creator<C0778b> CREATOR = new C0779c(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f12785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12786b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f12787c;

    public C0778b(int i7, int i10, Intent intent) {
        this.f12785a = i7;
        this.f12786b = i10;
        this.f12787c = intent;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f12786b == 0 ? Status.f14892e : Status.f14896w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f12785a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f12786b);
        com.bumptech.glide.d.G(parcel, 3, this.f12787c, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
