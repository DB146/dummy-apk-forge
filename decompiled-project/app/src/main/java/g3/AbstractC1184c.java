package g3;

import android.os.Build;
import java.util.HashSet;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1184c implements InterfaceC1187f {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f17434c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f17435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17436b;

    public AbstractC1184c(String str, String str2) {
        this.f17435a = str;
        this.f17436b = str2;
        f17434c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC1182a.f17432a;
        String str = this.f17436b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
        }
        return true;
    }
}
