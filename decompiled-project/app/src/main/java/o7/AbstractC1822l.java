package o7;

import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1822l {

    /* renamed from: a, reason: collision with root package name */
    public static final I5.a f22095a = new I5.a("GetTokenResultFactory", new String[0]);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, n7.m] */
    public static n7.m a(String str) {
        Map hashMap;
        try {
            hashMap = AbstractC1821k.b(str);
        } catch (zzaag e2) {
            f22095a.b("Error parsing token claims", e2, new Object[0]);
            hashMap = new HashMap();
        }
        ?? obj = new Object();
        obj.f21291a = str;
        obj.f21292b = hashMap;
        return obj;
    }
}
