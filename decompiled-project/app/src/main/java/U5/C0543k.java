package U5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* renamed from: U5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543k extends AbstractC0544l {
    public static final Parcelable.Creator<C0543k> CREATOR = new T(25);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0552u f9771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9773c;

    public C0543k(int i7, String str, int i10) {
        try {
            this.f9771a = EnumC0552u.a(i7);
            this.f9772b = str;
            this.f9773c = i10;
        } catch (C0551t e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0543k)) {
            return false;
        }
        C0543k c0543k = (C0543k) obj;
        return com.google.android.gms.common.internal.G.k(this.f9771a, c0543k.f9771a) && com.google.android.gms.common.internal.G.k(this.f9772b, c0543k.f9772b) && com.google.android.gms.common.internal.G.k(Integer.valueOf(this.f9773c), Integer.valueOf(c0543k.f9773c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9771a, this.f9772b, Integer.valueOf(this.f9773c)});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f9771a.f9788a);
        String str = this.f9772b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        int i10 = this.f9771a.f9788a;
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.H(parcel, 3, this.f9772b, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f9773c);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
