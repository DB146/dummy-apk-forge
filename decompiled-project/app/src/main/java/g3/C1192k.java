package g3;

import android.content.pm.PackageInfo;
import android.os.Build;
import f3.AbstractC1134e;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192k extends AbstractC1184c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f17442d;

    public C1192k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f17442d = Pattern.compile("\\A\\d+");
    }

    @Override // g3.AbstractC1184c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // g3.AbstractC1184c
    public final boolean b() {
        int i7;
        PackageInfo packageInfo;
        boolean b2 = super.b();
        if (!b2 || (i7 = Build.VERSION.SDK_INT) >= 29) {
            return b2;
        }
        int i10 = AbstractC1134e.f16939a;
        if (i7 >= 26) {
            packageInfo = AbstractC1185d.a();
        } else {
            try {
                packageInfo = AbstractC1134e.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f17442d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
