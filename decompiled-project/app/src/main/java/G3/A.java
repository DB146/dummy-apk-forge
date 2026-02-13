package G3;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.kt.apps.media.xemtv.beta.R;
import java.io.InputStream;
import java.util.Locale;
import l5.O;
import m4.L;

/* loaded from: classes.dex */
public final class A implements t, O {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f4282a;

    public A(Resources resources, int i7) {
        switch (i7) {
            case 1:
                resources.getClass();
                this.f4282a = resources;
                return;
            default:
                this.f4282a = resources;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(L l10) {
        String str;
        String d10;
        String str2 = l10.f20087c;
        if (!TextUtils.isEmpty(str2) && !"und".equals(str2)) {
            int i7 = n5.D.f21141a;
            Locale forLanguageTag = i7 >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2);
            Locale locale = i7 >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                d10 = d(str, b(l10));
                if (TextUtils.isEmpty(d10)) {
                    return d10;
                }
                String str3 = l10.f20086b;
                return TextUtils.isEmpty(str3) ? "" : str3;
            }
        }
        str = "";
        d10 = d(str, b(l10));
        if (TextUtils.isEmpty(d10)) {
        }
    }

    public String b(L l10) {
        int i7 = l10.f20089e & 2;
        Resources resources = this.f4282a;
        String string = i7 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i10 = l10.f20089e;
        if ((i10 & 4) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i10 & 1088) != 0 ? d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public String c(L l10) {
        String a9;
        int h10 = n5.o.h(l10.f20096z);
        int i7 = l10.f20075M;
        int i10 = l10.f20069F;
        int i11 = l10.f20068E;
        if (h10 == -1) {
            String str = l10.f20093w;
            if (n5.o.i(str) == null) {
                if (n5.o.a(str) == null) {
                    if (i11 == -1 && i10 == -1) {
                        if (i7 == -1 && l10.f20076N == -1) {
                            h10 = -1;
                        }
                    }
                }
                h10 = 1;
            }
            h10 = 2;
        }
        Resources resources = this.f4282a;
        int i12 = l10.f20092v;
        if (h10 == 2) {
            a9 = d(b(l10), (i11 == -1 || i10 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i10)), i12 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f)) : "");
        } else if (h10 == 1) {
            a9 = d(a(l10), (i7 == -1 || i7 < 1) ? "" : i7 != 1 ? i7 != 2 ? (i7 == 6 || i7 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i7 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i12 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f)) : "");
        } else {
            a9 = a(l10);
        }
        return a9.length() == 0 ? resources.getString(R.string.exo_track_unknown) : a9;
    }

    public String d(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f4282a.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // G3.t
    public s m(y yVar) {
        return new C0280b(this.f4282a, yVar.a(Uri.class, InputStream.class));
    }
}
