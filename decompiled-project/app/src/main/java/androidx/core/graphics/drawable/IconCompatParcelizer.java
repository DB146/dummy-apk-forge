package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1045a;
import d3.C1046b;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    public static IconCompat read(AbstractC1045a abstractC1045a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f13275a = abstractC1045a.f(iconCompat.f13275a, 1);
        byte[] bArr = iconCompat.f13277c;
        if (abstractC1045a.e(2)) {
            Parcel parcel = ((C1046b) abstractC1045a).f16511e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f13277c = bArr;
        iconCompat.f13278d = abstractC1045a.g(iconCompat.f13278d, 3);
        iconCompat.f13279e = abstractC1045a.f(iconCompat.f13279e, 4);
        iconCompat.f13280f = abstractC1045a.f(iconCompat.f13280f, 5);
        iconCompat.g = (ColorStateList) abstractC1045a.g(iconCompat.g, 6);
        String str = iconCompat.f13282i;
        if (abstractC1045a.e(7)) {
            str = ((C1046b) abstractC1045a).f16511e.readString();
        }
        iconCompat.f13282i = str;
        String str2 = iconCompat.j;
        if (abstractC1045a.e(8)) {
            str2 = ((C1046b) abstractC1045a).f16511e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f13281h = PorterDuff.Mode.valueOf(iconCompat.f13282i);
        switch (iconCompat.f13275a) {
            case -1:
                Parcelable parcelable = iconCompat.f13278d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f13276b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f13278d;
                if (parcelable2 != null) {
                    iconCompat.f13276b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f13277c;
                    iconCompat.f13276b = bArr3;
                    iconCompat.f13275a = 3;
                    iconCompat.f13279e = 0;
                    iconCompat.f13280f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f13277c, Charset.forName("UTF-16"));
                iconCompat.f13276b = str3;
                if (iconCompat.f13275a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f13276b = iconCompat.f13277c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1045a abstractC1045a) {
        abstractC1045a.getClass();
        iconCompat.f13282i = iconCompat.f13281h.name();
        switch (iconCompat.f13275a) {
            case -1:
                iconCompat.f13278d = (Parcelable) iconCompat.f13276b;
                break;
            case 1:
            case 5:
                iconCompat.f13278d = (Parcelable) iconCompat.f13276b;
                break;
            case 2:
                iconCompat.f13277c = ((String) iconCompat.f13276b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f13277c = (byte[]) iconCompat.f13276b;
                break;
            case 4:
            case 6:
                iconCompat.f13277c = iconCompat.f13276b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f13275a;
        if (-1 != i7) {
            abstractC1045a.j(i7, 1);
        }
        byte[] bArr = iconCompat.f13277c;
        if (bArr != null) {
            abstractC1045a.i(2);
            int length = bArr.length;
            Parcel parcel = ((C1046b) abstractC1045a).f16511e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f13278d;
        if (parcelable != null) {
            abstractC1045a.k(parcelable, 3);
        }
        int i10 = iconCompat.f13279e;
        if (i10 != 0) {
            abstractC1045a.j(i10, 4);
        }
        int i11 = iconCompat.f13280f;
        if (i11 != 0) {
            abstractC1045a.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC1045a.k(colorStateList, 6);
        }
        String str = iconCompat.f13282i;
        if (str != null) {
            abstractC1045a.i(7);
            ((C1046b) abstractC1045a).f16511e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC1045a.i(8);
            ((C1046b) abstractC1045a).f16511e.writeString(str2);
        }
    }
}
