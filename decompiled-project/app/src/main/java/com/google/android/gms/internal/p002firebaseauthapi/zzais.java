package com.google.android.gms.internal.p002firebaseauthapi;

import P1.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzais implements Parcelable.Creator<zzait> {
    @Override // android.os.Parcelable.Creator
    public final zzait createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = c.r(readInt, parcel);
                    break;
                case 3:
                    str2 = c.r(readInt, parcel);
                    break;
                case 4:
                    str3 = c.r(readInt, parcel);
                    break;
                case 5:
                    str4 = c.r(readInt, parcel);
                    break;
                case 6:
                    str5 = c.r(readInt, parcel);
                    break;
                case 7:
                    str6 = c.r(readInt, parcel);
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    str7 = c.r(readInt, parcel);
                    break;
                case '\t':
                    str8 = c.r(readInt, parcel);
                    break;
                case '\n':
                    z8 = c.M(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    z10 = c.M(readInt, parcel);
                    break;
                case '\f':
                    str9 = c.r(readInt, parcel);
                    break;
                case '\r':
                    str10 = c.r(readInt, parcel);
                    break;
                case 14:
                    str11 = c.r(readInt, parcel);
                    break;
                case 15:
                    str12 = c.r(readInt, parcel);
                    break;
                case 16:
                    z11 = c.M(readInt, parcel);
                    break;
                case 17:
                    str13 = c.r(readInt, parcel);
                    break;
                default:
                    c.b0(readInt, parcel);
                    break;
            }
        }
        c.y(d02, parcel);
        return new zzait(str, str2, str3, str4, str5, str6, str7, str8, z8, z10, str9, str10, str11, str12, z11, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzait[] newArray(int i7) {
        return new zzait[i7];
    }
}
