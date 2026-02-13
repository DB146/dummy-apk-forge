package F5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class t extends G5.a {
    public static final Parcelable.Creator<t> CREATOR = new B5.c(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f4138a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4139b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4140c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4141d;

    public t(String str, o oVar, boolean z8, boolean z10) {
        this.f4138a = str;
        this.f4139b = oVar;
        this.f4140c = z8;
        this.f4141d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.common.internal.B] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public t(String str, IBinder iBinder, boolean z8, boolean z10) {
        this.f4138a = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                int i7 = n.f4119b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                P5.a zzd = (queryLocalInterface instanceof B ? (B) queryLocalInterface : new zza(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) P5.b.F(zzd);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f4139b = oVar;
        this.f4140c = z8;
        this.f4141d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f4138a, false);
        o oVar = this.f4139b;
        if (oVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oVar = null;
        }
        com.bumptech.glide.d.C(parcel, 2, oVar);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f4140c ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f4141d ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
