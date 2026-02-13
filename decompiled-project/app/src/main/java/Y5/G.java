package Y5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends zzbl implements I {
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // Y5.I
    public final void A(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(26, zza);
    }

    @Override // Y5.I
    public final C0621i C(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        Parcel zzP = zzP(21, zza);
        C0621i c0621i = (C0621i) zzbn.zzb(zzP, C0621i.CREATOR);
        zzP.recycle();
        return c0621i;
    }

    @Override // Y5.I
    public final void D(O1 o12, B1 b12, M m10) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzbn.zzc(zza, b12);
        zzbn.zzd(zza, m10);
        zzc(29, zza);
    }

    @Override // Y5.I
    public final List a(String str, String str2, String str3, boolean z8) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i7 = zzbn.zza;
        zza.writeInt(z8 ? 1 : 0);
        Parcel zzP = zzP(15, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(K1.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // Y5.I
    public final void b(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(4, zza);
    }

    @Override // Y5.I
    public final List e(String str, String str2, boolean z8, O1 o12) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i7 = zzbn.zza;
        zza.writeInt(z8 ? 1 : 0);
        zzbn.zzc(zza, o12);
        Parcel zzP = zzP(14, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(K1.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // Y5.I
    public final void f(K1 k12, O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, k12);
        zzbn.zzc(zza, o12);
        zzc(2, zza);
    }

    @Override // Y5.I
    public final void i(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(18, zza);
    }

    @Override // Y5.I
    public final void j(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(27, zza);
    }

    @Override // Y5.I
    public final void k(long j, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // Y5.I
    public final void l(O1 o12, Bundle bundle) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzbn.zzc(zza, o12);
        zzc(19, zza);
    }

    @Override // Y5.I
    public final byte[] m(C0648s c0648s, String str) {
        Parcel zza = zza();
        zzbn.zzc(zza, c0648s);
        zza.writeString(str);
        Parcel zzP = zzP(9, zza);
        byte[] createByteArray = zzP.createByteArray();
        zzP.recycle();
        return createByteArray;
    }

    @Override // Y5.I
    public final void n(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(25, zza);
    }

    @Override // Y5.I
    public final String p(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        Parcel zzP = zzP(11, zza);
        String readString = zzP.readString();
        zzP.recycle();
        return readString;
    }

    @Override // Y5.I
    public final List q(String str, String str2, O1 o12) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, o12);
        Parcel zzP = zzP(16, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(C0609e.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // Y5.I
    public final void s(O1 o12, C0606d c0606d) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzbn.zzc(zza, c0606d);
        zzc(30, zza);
    }

    @Override // Y5.I
    public final List t(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzP = zzP(17, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(C0609e.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // Y5.I
    public final void v(C0609e c0609e, O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, c0609e);
        zzbn.zzc(zza, o12);
        zzc(12, zza);
    }

    @Override // Y5.I
    public final void w(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(20, zza);
    }

    @Override // Y5.I
    public final void x(O1 o12, Bundle bundle, K k) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzbn.zzc(zza, bundle);
        zzbn.zzd(zza, k);
        zzc(31, zza);
    }

    @Override // Y5.I
    public final void y(O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, o12);
        zzc(6, zza);
    }

    @Override // Y5.I
    public final void z(C0648s c0648s, O1 o12) {
        Parcel zza = zza();
        zzbn.zzc(zza, c0648s);
        zzbn.zzc(zza, o12);
        zzc(1, zza);
    }
}
