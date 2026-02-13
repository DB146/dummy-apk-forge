package F5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n extends zzb implements B {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4119b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4120a;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        G.b(bArr.length == 25);
        this.f4120a = Arrays.hashCode(bArr);
    }

    public static byte[] h(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract byte[] F();

    public final boolean equals(Object obj) {
        P5.a zzd;
        if (obj != null && (obj instanceof B)) {
            try {
                B b2 = (B) obj;
                if (b2.zzc() == this.f4120a && (zzd = b2.zzd()) != null) {
                    return Arrays.equals(F(), (byte[]) P5.b.F(zzd));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4120a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 1) {
            P5.a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f4120a);
        }
        return true;
    }

    @Override // com.google.android.gms.common.internal.B
    public final int zzc() {
        return this.f4120a;
    }

    @Override // com.google.android.gms.common.internal.B
    public final P5.a zzd() {
        return new P5.b(F());
    }
}
